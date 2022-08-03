
//public class encapsulation {
	class Encapsulate {
	    
	    private String johnName;
	    private int johnRoll;
	    private int johnAge;
	 
	    
	    public int getAge() { return johnAge; }
	 
	  
	    public String getName() { return johnName; }
	 
	    
	    public int getRoll() { return johnRoll; }
	 
	    public void setAge(int newAge) { johnAge = newAge; }
	 
	   
	    public void setName(String newName)
	    {
	        johnName = newName;
	    }
	 
	    
	    public void setRoll(int newRoll) { johnRoll = newRoll; }
	}
	 
	public class encapsulation {
	    public static void main(String[] args)
	    {
	        Encapsulate obj = new Encapsulate();
	 
	        // setting values of the variables
	        obj.setName("John");
	        obj.setAge(19);
	        obj.setRoll(51);
	 
	        // Displaying values of the variables
	        System.out.println("john's name: " + obj.getName());
	        System.out.println("john's age: " + obj.getAge());
	        System.out.println("john's roll: " + obj.getRoll());
	 
	        
	    }
	}

