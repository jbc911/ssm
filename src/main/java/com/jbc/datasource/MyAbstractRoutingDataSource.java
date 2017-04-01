package com.jbc.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.jbc.util.CustomerContextHolder;

public class MyAbstractRoutingDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		String customerType = CustomerContextHolder.getCustomerType();
		System.out.println("-----------------" + customerType);
		return customerType;
	}

}
