package com.training.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSTest02 {
	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		nashorn.eval(new FileReader("resources/com/js/external.js"));

		System.out.println(nashorn.eval("fnTest()"));
		System.out.println(nashorn.eval("sayHello('Birendra')"));

	}
}
