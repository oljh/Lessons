package by.bsu.proj.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface BankingAnnotation {
	SecurityLevelEnum securityLevel() default SecurityLevelEnum.NORMAL;
}
