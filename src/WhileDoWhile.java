public class WhileDoWhile {
    public static void main(String[] args) {
        int counter = 0;

        /*
        cum se formeaza while :
        while (expresia este adevarata) {
        //blocul de cod
        }
        */

        while (counter < 25) {
            System.out.println(" WHILE - counter-ul are valoarea :" + counter);
            counter++;

            System.out.println("---------------------------------");
        }

        /*
        cum se formeaza do while :
        do {
        //blocul de cod
       } while ( conditia/expresia este adevarata);
         */

        counter = 0;

        do {
            System.out.println("DOWHILE - counter-ul are valoarea :" + counter);
            counter++;
        } while (counter<25);
     }
}
