package ml.yixiu.initializer;

import ml.yixiu.servlet.Hello;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

public class CustomInitializer implements ServletContainerInitializer {

//    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("CustomInitializer onStartup");
        servletContext.addServlet("hello",new Hello()).addMapping("/hello");
    }
}
