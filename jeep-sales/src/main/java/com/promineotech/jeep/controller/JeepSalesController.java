package com.promineotech.jeep.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.jeep.entity.JeepEntity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

@RequestMapping("/jeeps")
public interface JeepSalesController {
	  @GetMapping 

	  @ResponseStatus(code = HttpStatus.OK) 

	  List<Jeep> fetchJeeps(@RequestParam JeepModel model,  

	      @RequestParam String trim); 

	 @OpenAPIDefinition(info = @Info(title = "Jeep Sales Service"), servers = { @Server(url = "http://localhost:8080", description = " Local server.")})
	  
	  
	  // @formatter:off
		@Operation(
				summary = "Returns a list of Jeeps",
				description = "Returns a list of Jeeps given an optional model and/or trim",
				responses = {
						@ApiResponse(
								responseCode = "200",
								description = "A list of Jeeps is returned",
								content = @Content(
										mediaType = "application/json",
										schema = @Schema(implementation = Jeep.class))),
						@ApiResponse(
								responseCode = "400",
								description = "The request parameters are invalid",
								content = @Content(mediaType = "application/json")),
						@ApiResponse(
								responseCode = "404",
								description = "No Jeeps were found with the input criteria",
								content = @Content(mediaType = "application/json")),
						@ApiResponse(
								responseCode = "500",
								description = "an unplanned error occurred",
								content = @Content(mediaType = "application/json"))
				
				parameters = {
						@Parameter(name = "model", allowEmptyValue =false, required = false, desctiption = " model name ");
						@Parameter(name = "trim", allowEmptyValue = false, required = false,description = "The trim level" );
						}
				)}
			
				@GetMapping
				@ResponseStatus(code = HttpStatus.OK)
				List<Jeep> fetchJeeps (
				@RequestParam(required = false)
				String model, 
				@RequestParam(required = false)
				String trim);
				
				
				// @formatter:on
	  
}
}
	  
}
