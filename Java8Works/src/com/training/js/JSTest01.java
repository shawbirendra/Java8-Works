package com.training.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSTest01 {
	public static void main(String[] args) throws ScriptException {
      ScriptEngineManager engineManager=new ScriptEngineManager();
      ScriptEngine nashhorn=engineManager.getEngineByName("nashorn");
      
      String name="Birendra";
      Integer res=null;
      nashhorn.eval("print('"+name+"')");
      
      res=(Integer) nashhorn.eval("10+20");
      System.out.println("Result is "+res);
	}
}
