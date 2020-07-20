package Exception;

public class CustomCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SRSTravels st = new SRSTravels();
		Passenger p = new Passenger();
		try {
			p.enquiry(st);
		}catch (TravelsException te) {
			if(st.numberofbuses!=0) {
				System.out.println(te.getMessage());
			}
			else {
				System.out.println(te);
			}
			
		}

	}

}
