package com.zking.crm.role.shiro;

import com.zking.crm.role.biz.ISysuserBiz;
import com.zking.crm.role.model.Sysright;
import com.zking.crm.role.model.Sysrole;
import com.zking.crm.role.model.Sysuser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * 说明：用户认证 和 授权
 */
@Component
public class MyRealm extends AuthorizingRealm{

    @Autowired
    private ISysuserBiz iSysuserBiz;


    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取传入的用户名
        String primaryPrincipalUserName = (String) principalCollection.getPrimaryPrincipal();

        //根据用户名查询出该用户在数据库中的权限、角色
        Sysuser sysuser=iSysuserBiz.logins(new Sysuser(primaryPrincipalUserName));

        //存放角色
        ArrayList<String> roleList=new ArrayList<String>();

        //存放权限
        ArrayList<String> authzList=new ArrayList<String>();

        //遍历角色
        for (Sysrole sysrole:sysuser.getSysroleList()) {
            //授权角色
            roleList.add(sysrole.getRoleAlias());
            //遍历权限
            for (Sysright sysright:sysrole.getSysrights()) {
                //如果不存在这个权限
                if(!authzList.contains(sysright.getRightText())){
                    //授予子权限
                    authzList.add(sysright.getRightCode());
                }
            }
        }

        //添加授权角色信息
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roleList);
        authorizationInfo.addStringPermissions(authzList);
        return authorizationInfo;
    }



    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //强转
        UsernamePasswordToken usernamePasswordToken=(UsernamePasswordToken) token;

        //认证
        SimpleAuthenticationInfo authenticationInfo = null;

        String userName = ((UsernamePasswordToken) token).getUsername();
        String userPwd = String.valueOf(((UsernamePasswordToken) token).getPassword());

        //通知数据库查询
        Sysuser sysuser = iSysuserBiz.logins(new Sysuser(userName,userPwd));

        authenticationInfo = new SimpleAuthenticationInfo(sysuser.getUsrName(), sysuser.getUsrPassword(), this.getName());

        return authenticationInfo;
    }
}
