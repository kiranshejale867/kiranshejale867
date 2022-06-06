package lab1205;

public class bajaj extends bike{
	public Bajaj(Engine engine, Wheel wheel, String name)
	{
		super (engine, wheel,name);
	}
	
	@Override
	void start() {
		System.out.println("Honda " +name + " is starting > ");
		
	@Override
	 void move() {
			System.out.println(getClass() +" " + name+ "is moving....");
}

engine.java 
package lab1205;

public class engine {
	
	String typeofengine;
	double hp;
	
	public Engine(String typeofengine, double hp )
	{
		super();
		this.typeofengine = typeofengine;
		this.hp = hp;
		
		System.out.println("Engine Details : " + " TYPE -> "+ typeofengine + " HORSE POWER : "+ hp);
	}
}

wheel.java
package lab1205;

public class Wheel {
	
	double radius;
	String brand;
	
	public Wheel(Double radius,String brand)
	{
		super();
		this.radius=radius;
		this.brand=brand;
		
		System.out.println("Wheel Details : " + " Radius -> "+ radius + " BRAND NAME : "+ brand);
    }
}
 
honda
package lab1205;

public class Honda extend bike
{
	public Honda(Engine engine, Wheel wheel, String name)
	{
		super (engine, wheel,name);
	}
	@Override
	void start() {
		System.out.println("Honda " +name + " is starting > ");
	}

	@Override
	void move() {
		System.out.println("".getClass()).substring((""+getClass()).indexOf("-")+1)+" "+name+ "is move";
	}
	
	@Override
	void stop() {
		System.out.println( name + " is stopped!!!");
	}
}

bajaj
package lab1205;

public class bajaj extends bike{
	public Bajaj(Engine engine, Wheel wheel, String name)
	{
		super (engine, wheel,name);
	}
	
	@Override
	void start() {
		System.out.println("Honda " +name + " is starting > ");
		
	@Override
	 void move() {
			System.out.println(getClass() +" " + name+ "is moving....");
}

bikemain

package lab1205;

import java.util.Scanner;
public class BikeMain {

	 private static void call(Bike b)
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter driver name & dl number : ");
		 String dname = sc.nextline();
		 String dl = sc.nextLine()
				 
		sc.close();
		 
		 Rider r = new Rider(dname, dl)
	 }
}

bikefactory
package lab1205;

import java.util.Scanner;

public class BikeFactory {
      Scanner sc=new Scanner(System.in);
      
      Engine getEngine()
      {
    	  System.out.println("Enter Type of engine : ");
    	  String typeofengine = sc.nextLine();
    	  
    	  System.out.println("Enter Horsepower of engine");
    	  double hp = sc.nextDouble();
    	  
    	  return new Engine(typeof engine,hp)
      }
}