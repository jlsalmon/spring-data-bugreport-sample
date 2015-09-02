package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author Justin Lewis Salmon
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Application.class);

    RequestRepository requestRepository = context.getBean(RequestRepository.class);
    PointRepository pointRepository = context.getBean(PointRepository.class);

    Request request = new Request();
    request.setId("1");
    request.setName("request 1");
    requestRepository.save(request);

    Point point = new Point();
    point.setId("1");
    point.setName("point 1");
    pointRepository.save(point);
  }
}
