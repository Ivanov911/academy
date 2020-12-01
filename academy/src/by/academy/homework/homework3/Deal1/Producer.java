package by.academy.homework.homework3.Deal1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface Producer {

	int startYear();

	String country();

	String founderFullName();
}
