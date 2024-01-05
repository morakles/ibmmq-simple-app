package eu.orangenotebook.ibmmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class IbmmqSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbmmqSampleAppApplication.class, args);
	}
//
}
