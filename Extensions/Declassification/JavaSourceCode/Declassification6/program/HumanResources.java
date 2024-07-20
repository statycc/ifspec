public class HumanResources {

    private int[] salaries;

    public int getAverageSalary() {
        declass: 
				if (salaries.length == 0)
	  			return 0;
	
        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }
        return sum / salaries.length;
    }
    
}
