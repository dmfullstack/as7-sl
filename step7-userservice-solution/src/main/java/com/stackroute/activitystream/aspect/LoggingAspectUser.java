package com.stackroute.activitystream.aspect;

import org.aspectj.lang.annotation.Aspect;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectUser {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectUser.class);

		
		
	@Before("execution(* com.stackroute.activitystream.controller.UserController.listAllUsers(..))")
	public void logBeforeListAllUsers(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.listAllUsers(..))")
	public void logAfterListAllUsers(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.listAllUsers(..))", returning = "result")
	public void logAfterReturningListAllUsers(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.listAllUsers(..))", throwing = "error")
	public void logAfterThrowingListAllUsers(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.UserController.getUser(..))")
	public void logBeforeGetUser(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.getUser(..))")
	public void logAfterGetUser(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getUser(..))", returning = "result")
	public void logAfterReturningGetUser(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getUser(..))", throwing = "error")
	public void logAfterThrowingGetUser(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.UserController.createUser(..))")
	public void logBeforeCreateUser(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.createUser(..))")
	public void logAfterCreateUser(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.createUser(..))", returning = "result")
	public void logAfterReturningCreateUser(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.createUser(..))", throwing = "error")
	public void logAfterThrowingCreateUser(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))")
	public void logBeforeUpdateUser(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))")
	public void logAfterUpdateUser(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))", returning = "result")
	public void logAfterReturningUpdateUser(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))", throwing = "error")
	public void logAfterThrowingUpdateUser(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.addUser(..))", returning = "result")
	public void logAfterReturningAddUser(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.addUser(..))", throwing = "error")
	public void logAfterThrowingAddUser(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.removeUser(..))", returning = "result")
	public void logAfterReturningRemoveUser(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.removeUser(..))", throwing = "error")
	public void logAfterThrowingRemoveUser(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	
	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getMyCircles(..))", returning = "result")
	public void logAfterReturningGetMyCircles(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getMyCircles(..))", throwing = "error")
	public void logAfterThrowingGetMyCircles(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	
}
