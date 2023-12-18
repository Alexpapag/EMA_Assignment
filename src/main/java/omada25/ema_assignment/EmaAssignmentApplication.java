package omada25.ema_assignment;

import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class EmaAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmaAssignmentApplication.class, args);
    }

}
