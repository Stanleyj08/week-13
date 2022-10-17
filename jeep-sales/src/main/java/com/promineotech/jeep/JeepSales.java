package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class})
public class JeepSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(JeepSales.class, args);
		
	}

}
//Allows us to run a springbootApplication//aka starts spring boot