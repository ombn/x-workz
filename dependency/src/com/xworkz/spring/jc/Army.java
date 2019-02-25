package com.xworkz.spring.jc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//<bean id="army" class="com.xworkz.spring.jc.Army">
//<propperty name="type" value="Para"/>
//</bean>
@Component
public class Army {

	@Value("${army.type}")
	private String type;

	private Army() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public void serving() {
		System.out.println("invoked serving");
		System.out.println("army type is : \t" + type);
	}

}
