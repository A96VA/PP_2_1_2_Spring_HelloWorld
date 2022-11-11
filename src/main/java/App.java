import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext1.getBean("helloworld");
        System.out.println(beanOne.getMessage());

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanTwo =
                (HelloWorld) applicationContext2.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        ApplicationContext applicationContext3 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 =
                (Cat) applicationContext3.getBean("cat");
        System.out.println(bean3.getMes());

        ApplicationContext applicationContext4 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean4 =
                (Cat) applicationContext4.getBean("cat");
        System.out.println(bean4.getMes());
        System.out.println(beanTwo == beanTwo);
        System.err.println(bean3 == bean4);
    }
}