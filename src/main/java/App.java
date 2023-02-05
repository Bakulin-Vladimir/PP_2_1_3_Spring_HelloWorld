import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorld1.getMessage());
        HelloWorld helloWorld2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Сравнение двух бинов HelloWorld: " + (helloWorld1 == helloWorld2));
        System.out.println("Сравнение двух бинов Cat: " + (cat1 == cat2));
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}