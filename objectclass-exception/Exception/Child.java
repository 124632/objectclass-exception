package Exception;

public class Child extends Parent{
	void  scold() throws HumanExp{
		
	}
    void care() throws PersonExp {
    	
    	PersonExp personExp = new PersonExp();
    	throw personExp;
    
	}
}

