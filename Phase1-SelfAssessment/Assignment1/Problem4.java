public class Problem4 {
    public static void main(String[] args){
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";

        String[] words = text.split("\\W+");

        /*The \\w+ is a regular expression that means ‘one or more word characters’. 
        A word character in regex is any letter, numeric digit, or the underscore character.
        */

        String temp;
        for (int j = 0; j < words.length; j++) {
            for (int i = j + 1; i < words.length; i++) {
                if (words[i].compareToIgnoreCase(words[j]) < 0) {
                    temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }

        for (int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }
    }
}

/*
OUTPUT:
a
against
and
and
arms
arrows
be
be
by
end
fortune
in
is
mind
nobler
not
of
of
opposing
or
or
outrageous
question
sea
slings
suffer
take
that
the
the
the
them
tis
to
To
to
to
troubles
Whether
*/


