package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Motorcycle;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MotorcycleRepository;

@SpringBootApplication
public class MotorcyclesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MotorcyclesApplication.class, args);
	}
	
	@Autowired
	MotorcycleRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Motorcycle m = appContext.getBean("motorcycle",Motorcycle.class);
		
		m.setColor("red");
		
		repo.save(m);
		
		Motorcycle m2 = new Motorcycle("Harley Davidson", "Pan-American", "Black", 1200);
		
		repo.save(m2);
		
		List<Motorcycle> allMotorcycles = repo.findAll();
		
		for(Motorcycle bike : allMotorcycles) {
			System.out.println(bike.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
