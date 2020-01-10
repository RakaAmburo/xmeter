package helper.configuration;

import java.util.Set;
import org.reflections.Reflections;
import com.globant.jmeter.tester.controllers.ProcessResponse;

public class RefreshControllers {

  public static void main(String[] args) {
    System.out.println("empiecing");

    Reflections reflections = new Reflections("com.globant.jmeter.tester.controllers");
    Set<Class<? extends ProcessResponse>> classes =
        reflections.getSubTypesOf(ProcessResponse.class);

    classes.stream().forEach(clazz -> System.out.println(clazz.getName()));

  }

}
