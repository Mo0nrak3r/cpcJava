public class Problem3 {
    public static void main(String[] args){
    String text = "To be or not to be, that is the question;"
    +"Whether `tis nobler in the mind to suffer"
    +" the slings and arrows of outrageous fortune,"
    +" or to take arms against a sea of troubles,"
    +" and by opposing end them?";
    int spaces = 0, vowels = 0, letters = 0;
    spaces = text.length() - text.replaceAll(" ", "").length();
    letters = text.replaceAll(" ", "").length();
    for (int i = 0; i < text.length(); i++) {
        // check if char[i] is vowel
        if (text.charAt(i) == 'a' || text.charAt(i) == 'e'
            || text.charAt(i) == 'i'
            || text.charAt(i) == 'o'
            || text.charAt(i) == 'u') {
            vowels++;
        }
    }

    System.out.println("The text contained vowels: " + vowels + "\n"
    +
    "consonants: " + (letters - vowels) + "\n"+ "spaces: " + spaces);
    }
}

/*
OUTPUT:
The text contained vowels: 60
consonants: 99
spaces: 37
 */
