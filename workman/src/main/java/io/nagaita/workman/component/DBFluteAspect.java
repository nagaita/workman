package io.nagaita.workman.component;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.dbflute.hook.AccessContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class DBFluteAspect {

	private static final String TRANSACTION_POINTCUT =
			"@annotation(org.springframework.transaction.annotation.Transactional)";

	@Before(TRANSACTION_POINTCUT)
	public void before() {
		if (!AccessContext.isExistAccessContextOnThread()) {
			AccessContext context = new AccessContext();
			context.setAccessLocalDateTime(LocalDateTime.now());
			context.setAccessUser("NO_LOGIN");
			context.setAccessProcess("proc");
			AccessContext.setAccessContextOnThread(context);
		}
	}

	@After(TRANSACTION_POINTCUT)
	public void after() {
		AccessContext.clearAccessContextOnThread();
	}
}
