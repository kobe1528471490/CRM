import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class Test {

   /* public static void main(String[] args) {
        //获取
        Factory<SecurityManager> factory=new IniSecurityManagerFactory("");

        SecurityManager securityManager=factory.getInstance();

        SecurityUtils.setSecurityManager(securityManager);

        UsernamePasswordToken token=new UsernamePasswordToken("userPwd","123456");

        Subject subject= SecurityUtils.getSubject();

        subject.login(token);

        //判断
        Boolean f=subject.isAuthenticated();

        System.out.println(f);

        //注销
        subject.logout();
        Boolean f2=subject.isAuthenticated();
        System.out.println(f2);
    }*/

}
