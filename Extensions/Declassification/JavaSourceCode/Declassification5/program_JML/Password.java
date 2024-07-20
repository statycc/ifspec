class Password {

    private/*@spec_public@*/ int[] names;
    private/*@spec_public@*/ int[] passwords;
    /*@ public normal_behaviour   
    requires names.length == passwords.length;
    determines \result \by (\exists int i; 0 <= i && i < names.length; names[i] == user && passwords[i] == password);
    @*/
    public boolean check(int user, int password) {
        declass:
        /*@
        loop_invariant names.length == passwords.length;
        loop_invariant 0 <= i && i <= names.length;
        loop_invariant (\forall int j; 0 <= j && j < i; !(names[j] == user && passwords[j] == password));
        assignable \nothing;
        decreases names.length - i;
        @*/
        for (int i = 0; i < names.length; i++) {
            declass2: 
            if (names[i] == user &&
                passwords[i] == password) {
                return true;
            }
        }
        return false;
    }
}
