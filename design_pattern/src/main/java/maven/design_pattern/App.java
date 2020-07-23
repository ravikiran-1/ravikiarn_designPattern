package maven.design_pattern;

import CommandPattern.DriverCommand;
import PrototypePattern.DriverPrototype;
import SingletonPattern.DriverSingleton;
import TemplatePattern.TemplatePatternDemo;
import maven.design_pattern.AdapterPattern.DriverAdapter;


public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
} 