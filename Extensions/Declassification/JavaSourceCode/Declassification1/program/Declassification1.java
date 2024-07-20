import java.lang.IllegalArgumentException;

public class Declassification1 {

  public void onLocationChanged(Location loc) {
    float lat = loc.latitude;
		float lon = loc.longitude;
		Location eiffel = getPointOfInterest("Eiffel tower");
		
		L1:
		if(Math.abs(eiffel.latitude-lat) <= 0.1 && Math.abs(eiffel.longitude-lon) <= 0.1) {
    	    System.out.println("bonjour");
        }
  }

	public Location getPointOfInterest(String name){
		if(name.equals("Eiffel tower"))		
			return new Location(48.858f, 2.294f);
		else
			 throw new IllegalArgumentException();
	}

}
