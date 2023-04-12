package com.example.springcloud;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-services")
public class Configuration {
	
	private int max;
	private int min;
	
	public Configuration(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	
}
