public class Primes {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        
        boolean primes [] = new boolean [n + 1];
        int index = 0;
        while (index < primes.length) {

            if (index < 2) {
                primes[index] = false;
            } else {
                
                primes[index] = true;

            }

            index ++;
            
        }

        
        for (int p = 2; p * p <= n; p ++) {
            
            if (primes[p] == true) {

                for (int i = p * p; i <= n; i = i + p) {
                   
                    primes[i] = false;

                }
            }
        }
       


        System.out.println("Prime numbers up to " + n + ":") ;

        int counter = 0;
        for (int j = 0; j < primes.length; j ++) {
            if (primes[j] == true) {

                counter ++;
                System.out.println(j);
                
            }
        }

        int percent = (int)(((double) counter / n) * 100 );

        System.out.println("There are " + counter + " primes between 2 and " + n + " " + "(" + percent + "% " + "are " + "primes)");
     
    }
}