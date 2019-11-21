public class FizzBuzz {

    public static void main(String[] args) {

        for(int i=1; i<=100; i++) {
            String[] toPrint = new String[4];
            if(i % 3 == 0) {
                toPrint = toPrint + "Fizz";
            }
            if(i % 5 == 0) {
                toPrint = toPrint + "Buzz";
            }
            if(i % 7 == 0) {
                toPrint = toPrint + "Bang";
            }
            if(i % 11 == 0) {
                toPrint = "Bong";
            }
            if(i % 13 == 0) {
                toPrint = toPrint + "Bong";
            }
            if(toPrint.equals("")) {
                toPrint = Integer.toString(i);
            }
            System.out.println(toPrint);

        }
    }

}