package java8Features;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJSEngine {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading JavaScript file  
        ee.eval(new FileReader("C:\\Users\\899716\\OneDrive - Cognizant\\Desktop\\html\\myScript.js"));  
        
	}

}
