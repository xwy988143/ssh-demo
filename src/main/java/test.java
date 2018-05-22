import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaowenyu on 2018/5/22.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        testService ts = (testService) ac.getBean("testService01");
        System.out.println(ts.getName());
    }
}
