package objactclass;

public class Aeroplane {
	String name;
	String type;
	
	Aeroplane(String name,String type) {
		this.name=name;
		this.type=type;
	}
      public int hashcode() {
    	  return 100;
    }
      public String toString() {
    	  return name+"\n"+type;
      }
      public boolean equals (Object obj) {
    	  if(obj instanceof Aeroplane) {
    		  Aeroplane aeroplane=(Aeroplane)obj;
    		  if(this.name.equals(aeroplane.name)) {
    			  if(this.type.equals(aeroplane.type)) {
    				  return true;
    			  }
    			  else {
    				  return false;
    				  
    			  }
    		  }
    		  else {
    			  return false;
    		  }
    	  }
    	  else {
    		  return false;
    	  }
      }
      
}
