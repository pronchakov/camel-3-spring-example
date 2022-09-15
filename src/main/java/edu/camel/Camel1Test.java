package edu.camel;

import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Camel1Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
        final var camelContext = context.getBean("camelContext", SpringCamelContext.class);
        camelContext.start();

        Thread.sleep(10000);
        camelContext.stop();
        context.close();
    }
}
