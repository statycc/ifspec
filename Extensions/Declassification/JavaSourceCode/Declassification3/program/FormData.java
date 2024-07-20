public class FormData {
  public Name name;
  public long creditCardNr;
	public String validUntil;

	public FormData (Name name, long creditCardNr, String validUntil){
		this.name = name;
		this.creditCardNr = creditCardNr;	
		this.validUntil = validUntil;
	}
}
