public class FormServlet {

  public void receiveData(FormData data) {
	L1:    
	System.out.println("Successful transaction with card "+ ((data.creditCardNr) % 10000) +"valid until "+data.validUntil);
  }

	public void getUserInfo(Name name) {
		System.out.println("Name:"+name.firstName+" "+name.lastName);
		System.out.println("Public user information...");	
		//now print some more fancy user information ...	
	}
}
