import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {

        //Define an array of strings called carBrands that is populated with 5 famous car brand names
        String[] carBrands = new String[] {"Toyota", "Alfa", "Audi", "Fiat", "BMW"} ;

        //Print in console the number of items of the carBrands array
        System.out.println(carBrands.length);

        // Print in console the 3rd item of carBrands array
        // -Declare an empty array of integers called primeNumbers with a predefined size of 6 items

        System.out.println(carBrands[2]);

        //Iinsert one by one the values of the first 6 prime numbers, populating primeNumbers array
        // -Print in console all the content of the already populated primeNumbers array

        Integer[] primeBumbers = new Integer[6];
        primeBumbers[0] = 1;
        primeBumbers[1] = 2;
        primeBumbers[2] = 3;
        primeBumbers[3] = 4;
        primeBumbers[4] = 5;
        primeBumbers[5] = 6;

        System.out.println(Arrays.stream(primeBumbers).toList());

    // Ho usato una libreria consigliatami da Java che non conosco, altrimenti avrei utilizzato il metodo LIST
    // che abbiamo studiato, ma l'esercizio non lo richiedeva.







    }
}
