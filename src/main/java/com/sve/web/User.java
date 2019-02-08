package com.sve.web;

import javax.xml.ws.Action;

public class User {
	@Action
	public String foo() {
		return "foo";
	}
	
	@Action
	public String foo_bar() {
		return "bar";
	}
}
