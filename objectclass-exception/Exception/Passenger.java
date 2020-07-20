package Exception;

public class Passenger {
	void enquiry(SRSTravels st) throws TravelsException {
		if(st.numberofbuses!=0) {
			if(st.isSeatsareAvilable) {
			   System.out.println("Boss you can book a seat..");
			   
			}
			else {
				TravelsException te = new TravelsException ();
				throw te;
			}
		}
		else {
			TravelsException te = new TravelsException ();
			throw te;
		}
	}

}
