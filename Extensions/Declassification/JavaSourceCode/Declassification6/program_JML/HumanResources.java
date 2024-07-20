public class HumanResources {

    private /*@spec_public@*/ int[] salaries;
    /*@
    public normal_behaviour    
    determines \result \by (\sum int i; 0 <= i && i < salaries.length; salaries[i])/salaries.length, salaries.length == 0;
    @*/
    public int getAverageSalary() {
        declass: 
				if (salaries.length == 0)
	  			return 0;
	
        int sum = 0;
        /*@ loop_invariant 0 <= i && i <= salaries.length;
            loop_invariant sum == (\sum int j; 0 <= j && j < i; salaries[j]);
            loop_invariant salaries.length > 0;
            assignable \nothing;
            decreases salaries.length - i;
        @*/
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }
        return sum / salaries.length;
    }
    
}
