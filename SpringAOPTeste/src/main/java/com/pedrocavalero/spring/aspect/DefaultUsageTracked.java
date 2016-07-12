package com.pedrocavalero.spring.aspect;

public class DefaultUsageTracked implements UsageTracked{

	private int count;

	@Override
	public void incrementUseCount() {
		setCount(getCount() + 1);
		
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}
	

}
