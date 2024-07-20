class Password {

    private int[] names;
    private int[] passwords;

    public boolean check(int user, int password) {
        declass:
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
