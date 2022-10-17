package com.promineotech.jeep.dao;

import java.util.List;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public interface JeepSalesDao {

	//creating a fetch jeeps method from a pass through on the default jeepsalesservice class
	//after autowire the interface and declaring it as a variable
	//autowiring the interface is the reason that the method we wanted was added to that interface
	//it can be returned in a method for example with the parameters model and trim
	
	/**
 * 
 * @param model
 * @param trim
 * @return
 */
	List<Jeep> fetchJeeps(JeepModel model, String trim);

}
