package ru.otus.spring;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService service = context.getBean(PersonService.class);
        Person ivan = service.getByName("Ivan");

        // TODO: создайте здесь класс контекста

        // TODO: Получите Person Service

        // Получите Person "Ivan"
        //Person ivan = null;
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
        context.close();
    }
}
