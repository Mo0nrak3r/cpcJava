public class Problem2 {
public static void main(String[] args){
    int nValues = 50;
    //boolean isPrime = true;
    first:
    for(int i = 2; i <= nValues; i++){
        for (int j = 2; j <=  Math.sqrt(i); j++){ // <= instead of <, else 49 is detected as prime
            if (i % j == 0){
                continue first;
            }
        }
        System.out.println(i);
    }
}
}

/*
OUTPUT:
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47 
*/

