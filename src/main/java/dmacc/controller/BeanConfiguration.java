/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Motorcycle;

/**
 * 
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Motorcycle motorcycle() {
		Motorcycle bean = new Motorcycle();
		return bean;
	}
}
