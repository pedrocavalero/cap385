package com.pedrocavalero.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class UsageTracking {

	@DeclareParents(value="com.pedrocavalero.spring.service.*+", defaultImpl=DefaultUsageTracked.class)
    public static UsageTracked mixin;

    @Before("this(usageTracked) && execution(* com.pedrocavalero.spring.service.EmployeeService.get*(..))")
    public void recordUsage(UsageTracked usageTracked) {
        usageTracked.incrementUseCount();
    }
	
}
