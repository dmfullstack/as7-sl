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

@Aspect
public class LoggingAspectMessage {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectMessage.class);
	
		
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))")
	public void logBeforeSendMessageToCircle(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))")
	public void logAfterSendMessageToCircle(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))", returning = "result")
	public void logAfterReturningSendMessageToCircle(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))", throwing = "error")
	public void logAfterThrowingSendMessageToCircle(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))")
	public void logBeforeSendMessageToUser(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))")
	public void logAfterSendMessageToUser(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))", returning = "result")
	public void logAfterReturningSendMessageToUser(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))", throwing = "error")
	public void logAfterThrowingSendMessageToUser(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByUser(..))")
	public void logBeforeGetMessagesByUser(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByUser(..))")
	public void logAfterGetMessagesByUser(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByUser(..))", returning = "result")
	public void logAfterReturningGetMessagesByUser(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByUser(..))", throwing = "error")
	public void logAfterThrowingGetMessagesByUser(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))")
	public void logBeforeGetMessagesByCircle(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))")
	public void logAfterGetMessagesByCircle(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))", returning = "result")
	public void logAfterReturningGetMessagesByCircle(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))", throwing = "error")
	public void logAfterThrowingGetMessagesByCircle(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))")
	public void logBeforeListAllTags(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))")
	public void logAfterListAllTags(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))", returning = "result")
	public void logAfterReturningListAllTags(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))", throwing = "error")
	public void logAfterThrowingListAllTags(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))")
	public void logBeforeShowMessagesWithTag(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))")
	public void logAfterShowMessagesWithTag(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))", returning = "result")
	public void logAfterReturningShowMessagesWithTag(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))", throwing = "error")
	public void logAfterThrowingShowMessagesWithTag(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.subscribeUserToTag(..))")
	public void logBeforeSubscribeUserToTag(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.subscribeUserToTag(..))")
	public void logAfterSubscribeUserToTag(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.subscribeUserToTag(..))", returning = "result")
	public void logAfterReturningSubscribeUserToTag(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.subscribeUserToTag(..))", throwing = "error")
	public void logAfterThrowingSubscribeUserToTag(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeUserToTag(..))")
	public void logBeforeUnsubscribeUserToTag(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeUserToTag(..))")
	public void logAfterUnsubscribeUserToTag(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeUserToTag(..))", returning = "result")
	public void logAfterReturningUnsubscribeUserToTag(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeUserToTag(..))", throwing = "error")
	public void logAfterThrowingUnsubscribeUserToTag(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
	
	@Before("execution(* com.stackroute.activitystream.controller.MessageController.getMyTags(..))")
	public void logBeforeGetMyTags(JoinPoint joinPoint) {

		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");

	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.getMyTags(..))")
	public void logAfterGetMyTags(JoinPoint joinPoint) {

		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMyTags(..))", returning = "result")
	public void logAfterReturningGetMyTags(JoinPoint joinPoint, Object result) {

		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");

	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMyTags(..))", throwing = "error")
	public void logAfterThrowingGetMyTags(JoinPoint joinPoint, Throwable error) {

		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
}
