package salesSystem.Helper;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class Logging {

	Logger log = LoggerFactory.getLogger(Logging.class);
	
	@Pointcut(value ="execution(* salesSystem.*.*.*(..) )")
	public void myPointcut() {
		
	}
	@Around("myPointcut()")
	public Object applicationLogger(ProceedingJoinPoint pjp) {
		
		ObjectMapper mapper = new ObjectMapper();
		String methodName = pjp .getSignature().getName();
		String className = pjp.getTarget().getClass().toString();
		Object[] inputArray = pjp.getArgs();
		
		Object object = null;
		final StopWatch stopWatch = new StopWatch();
		try {
			log.info("Method invoked " + className + " : " + methodName + "()" + " arguments : " + mapper.writeValueAsString(inputArray));
			stopWatch.start();
			object = pjp.proceed();
			stopWatch.stop();
			log.info(className + " : " + methodName + "()" + " Response : " + mapper.writeValueAsString(object) + " Execution time : " + stopWatch.getTotalTimeMillis() + " ms");
		} catch (Throwable  ex) {
			log.error("Error description",ex);
		} 
		return object;
	}
}
