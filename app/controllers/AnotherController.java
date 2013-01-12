package controllers;

import java.util.ArrayList;

import models.Entry;

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
	
	public static Result displayObject(){
		ArrayList<Entry> entries = new ArrayList<Entry>();
		Entry entry1 = new Entry();
		Entry entry2 = new Entry();
		entry2.head = "Second head";
		entry2.head2 = "Second body";
		entries.add(entry1);
		entries.add(entry2);
		return ok(
			objectRenderer.render(entries)	
		);
		
	}
}