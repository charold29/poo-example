package ClassesAndObjects;

public class Static {
    //ATTRIBUTES
    private static String phrase = "Just a phrase";

    //METHODS
    public static String getPhrase() {
        return phrase;
    }

    // If I remove static here, we can't change the value from the outside.
    public static void setPhrase(String phrase) {
        Static.phrase = phrase;
    }

    public static void sumar(int n1, int n2){
        int sum = n1+n2;
        System.out.println("The sum throws a result of: " + sum);
    }

}
