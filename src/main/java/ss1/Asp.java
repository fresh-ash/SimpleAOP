package ss1;
import java.util.Date;

import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Asp {
	@Pointcut("execution(* *(..))")
	private void pp(){}
	@Around("pp()")
	public Object pr(ProceedingJoinPoint join) throws Throwable{
		System.out.println("Hello!");
		Double t = null;
		for (Object obj : join.getArgs()){
			t =((Double)obj) / 3;
			//System.out.println(t);
		}
		Object output = join.proceed(new Object[] {t});
		return output;
	}
}

