package controllers;

import play.mvc.*;

import views.html.*;

public class AnotherController extends Controller{
	public static Result anotherExample() {
		String s = "Hello Mr. View";
		return ok(fun.render(s));
	}
	
	public static Result anotherExample2(String s){
		return ok(fun.render(s));
	}
	
	public static Result addition(Integer a, Integer b){
		Integer c = a + b;
		return ok(addition.render(c));
	}
}