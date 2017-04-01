package com.jbc.util;

public class CustomerContextHolder {
	public static final String MASTER_DATA_SOURCE = "masterDataSource";
	public static final String SLAVE_DATA_SOURCE = "slaveDataSource";
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setCustomerType(String customerType) {
		contextHolder.set(customerType);
	}

	public static String getCustomerType() {
		return contextHolder.get();
	}

	public static void clearCustomerType() {
		contextHolder.remove();
	}
}