package com.promineotech.jeep.controller;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public class fetchJeepTestSupport {
	protected List<Jeep> buildExpected() {
		
		//@formatter:off
		List<Jeep> list = new LinkedList<>();
		
		list.add(Jeep.builder()
				.modelId(JeepModel.WRANGLER)
				.trimLevel("Sport")
				.numDoors(2)
				.wheelSize(17)
				.basePrice(new BigDecimal("28475.00"))
				.build());
		//@formatter:on
		
		list.add(Jeep.builder()
				.modelId(JeepModel.WRANGLER)
				.trimLevel("Sport")
				.numDoors(4)
				.wheelSize(17)
				.basePrice(new BigDecimal("31975.00"))
				.build());
		
		return list;
	}
}
