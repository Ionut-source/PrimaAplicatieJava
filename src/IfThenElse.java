public class IfThenElse {
    public static void main(String[] args) {

        int a = 25;

        if (a==50){
            System.out.println("a chiar este 50! -> statement executat in if");
            System.out.println("expresia este adevarata! -> statement executat in if");
         }

        if(a!=50) {
            System.out.println("a este diferit de 50! - linia 11");
        } else {
            System.out.println("a este 50 - ramura else");
        }
         if (a>=50){
             System.out.println("a este diferit de 50! - linia 16");
         } else if (a<25) {
            System.out.println("a este mai mic de 25! - linia 18");
         } else if (a>100){
             System.out.println("a este mai mare de 100! - linia 20");
         }else {
             System.out.println("Imputul nu are legatura cu variabila a din blocul if-then-else");
         }

         //operatorul tenar ?:
        // ? -> if iar  : -> else

            System.out.println((a==25) ? "a este 25" : "a mu este 25");

  }
 }
