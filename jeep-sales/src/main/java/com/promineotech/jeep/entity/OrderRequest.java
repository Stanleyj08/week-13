package com.promineotech.jeep.entity;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import lombok.Data;

@Data
public class OrderRequest {
	@NotNull

@Pattern(regexp = "[\\W\\s]*")
	  private String customer;
	@NotNull
	  private JeepModel model;
	@NotNull

	@Pattern(regexp = "[\\W\\s]*")
	  private String trim;
	@Positive
	@Min(2)
	@Max(4)
	  private int doors;
	@NotNull

	@Pattern(regexp = "[\\W\\s]*")
	  private String color;
	@NotNull

	@Pattern(regexp = "[\\W\\s]*")
	  private String engine;
	@NotNull

	@Pattern(regexp = "[\\W\\s]*")
	  private String tire;

	  private List<@NotNull @Pattern(regexp = "[A-Z0-9_]*") String> options;
}
