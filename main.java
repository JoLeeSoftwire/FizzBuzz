public class FizzBuzz {

    public static void main(String[] args) {
        String toPrint;

        for(int i=1; i<=100; i++) {
            toPrint = "";
            if(i % 3 == 0) {
                toPrint = toPrint + "Fizz";
            }
            if(i % 5 == 0) {
                toPrint = toPrint + "Buzz";
            }
            if(i % 7 == 0) {
                toPrint = toPrint + "Bang";
            }
            if(toPrint.equals("")) {
                toPrint = Integer.toString(i);
            }
            System.out.println(toPrint);

        }
    }

}