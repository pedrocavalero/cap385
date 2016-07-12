package com.pedrocavalero.spring.aspect;

public interface UsageTracked {

	void incrementUseCount();

	void setCount(int count);

	int getCount();

}
