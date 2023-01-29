package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        // for loop
        System.out.println(" ---- For loop ---- ");

        System.out.println(" ---- example 1 ---- ");

        for (int i = 0; i < 10; i++) {
            System.out.println("for loop - sit up: " + i);
        }

        System.out.println(" ---- example 2 ---- ");

        for (int index = 1; index <= 5; index++) {
            System.out.println("Hello World");
        }

        System.out.println(" ---- example 3 ---- ");

        for (int index = 10; index >= 0; index--) {
            System.out.println("The index is: " + index);
        }

        // while
        System.out.println(" ---- while loop ----");

        System.out.println(" ---- example 1 ---- ");

        int x = 0;

        while (x < 10) {
            System.out.println("while loop - sit up: " + x);
            x++;
        }

        System.out.println(" ---- example 2 ---- ");

         x = 1;
         int sum = 0;

        // Exit when x becomes greater than 4
        while (x <= 10) {

            // summing up x
            sum = sum + x;

            // Increment the value of x for next iteration
            x++;
        }
        System.out.println("Summation: " + sum);

        System.out.println(" ---- example 3 ---- ");

        boolean hungry = true;
        int count = 0;

        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix ingredients");

        while (hungry) {

            ++count;

            System.out.println("Bake pancake " + count);
            System.out.println("Eat pancake " + count);

            if(count == 4 ) {
                hungry = false;
            }
        }


        // do-while
        System.out.println(" --- do while loop --- ");

        System.out.println(" ---- example 1 ---- ");

        // wordt minstens 1 keer uitgevoerd

        int y = 0;

        do {
            System.out.println("do while loop - sit up: " + y);
            y++;
        } while (y < 10);


        System.out.println(" ---- example 2 ---- ");

        int index = 10;
        do {
            // Body of do-while loop
            System.out.println("Hello World");

            // Update expression
            index++;

        // Test expression
        }while (index < 6);

        System.out.println(" ---- example 3 ---- ");

        x = 21;
        sum = 0;
        do {
            // Execution statements(Body of loop)

            // Here, the line will be printed even if the condition is false
            sum += x;
            x--;

        // Now checking condition
        } while (x > 10);

        // Summing up
        System.out.println("Summation: " + sum);

        // break keyword
        System.out.println(" ---- break ---- ");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);

            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break; // break zal de eerste loop stoppen
                }
            }
            if (i == 5) {
                break;
            }
        }

        //label
        System.out.println("--- break with label ---");
        search: for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                if (j == 5){
                    i = 100; // zal eerste loop stoppen
                    // of
                    break search; // zal eerste loop stoppen
                }
            }
        }

        // continue keyword
        System.out.println(" ---- continue ---- ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                continue; // ga terug naar start, i wordt nog steeds verhoogt
            }
            System.out.println("Odd number: " + i);
        }

        // label
        System.out.println("--- continue with label ---");
        start: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
//                if (j == 5){
//                    continue start;
//                }
                System.out.println("j = " + j);
            }
            System.out.println("i = " + i);
        }

        // infinite loop - danger

        // int z  = 0;
        // while(z < 10){
        //   System.out.println("infinite loop");
        // }
    }
}
