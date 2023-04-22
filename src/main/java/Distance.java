import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        //just to make the code look *prettier*
        System.out.println(
        "<------------------>"+ "\n"+
        "<     CUSTOMER     >"+ "\n"+
        "<     SERVICES     >"+ "\n"+
        "<------------------>"+ "\n"
        );

                    //created a scanner object
                    Scanner myscan = new Scanner(System.in);

                    //fist question the computer will print
                    System.out.println("How many miles did you travel?");

                    //allows our int variable ""response1" to be answered through our scanner object
                    int response1 = myscan.nextInt();


                    //next question the computer will print
                    System.out.println(

                            "Would you like to fuel up?" +
                            "\n" +
                            "  *Enter Yes or No*"

                    );


        //allows you to answer yes or no to wanting gas
        String product1 = myscan.next();
        //converted product1 into response2 just for logistic reasons within the if else statement
        String response2 = product1;


        //creating a way to tell the computer yes or no to the question "Would you like to fuel up?".
        //Then based on that response the if else statement will print out an appropriate response
        //Then you'd be asked how much gas you'd like
        //then you'd be charged the total of amount of gas * its price
        //then I'd calculate the total of gas and miles

                    //using the .equals method to compare two strings, and return true if the strings are equal, and false if not
                    if (response2.equals("Yes")){
                        System.out.println("My pleasure! How many gallons of gas would you like?");

                    }else if(response2.equals("yes")){
                        System.out.println("My pleasure! How many gallons of gas would you like?");

                    }else if(response2.equals("No")) {
                        System.out.println("Have a great day, come again soon!");

                    }else if(response2.equals("no")){
                        System.out.println("Have a great day, come again soon!");

                    }else{
                        System.out.println("We're not sure what that was, may you please try again.");
                    }
                    //could make this question restate itself if the response isn't recognized?
                    //could make this so if my response is "no" my product cost is equal to zero by to default


        //scanner used to enter the amount of gallons you'd like
        double qtyOfGas = myscan.nextDouble();

        //created a variable to calculate the total cost of gas
        double pricePerGallon = 3.25;
        double totalCostOfGas = qtyOfGas * pricePerGallon;


        //just to break up the code and make it look *prettier*
        System.out.println(
                "\n"+
                "<----------------->"+ "\n"+
                "<     RECEIPT     >"+ "\n"+
                "<----------------->"+ "\n"

        );


//        System.out.println("cost of fuel: $" +totalCostOfGas);


                    //KEY FOR DISTANCE PRICES
                    /*
                    Distance 0-4 = $2
                    Distance 5-15 = $5
                    Distance 16-25 = $10
                    Distance 26-50 = $15
                    Distance 51+ = $20
                    */

                    //variables created for cost of distance that i will plug into the if else statement
                    double distance1 = 2.0;
                    double distance2 = 5.0;
                    double distance3 = 10.0;
                    double distance4 = 15.0;
                    double distance5 = 20.0;


                    int distance = response1;


//                    if (distance <=4){
//                        System.out.println("cost of mileage: $" +distance1);
//
//                    }else if(distance <=15){
//                        System.out.println("cost of mileage: $" +distance2);
//
//                    }else if(distance <=25){
//                        System.out.println("cost of mileage: $" +distance3);
//
//                    }else if(distance <=50){
//                        System.out.println("cost of mileage: $" +distance4);
//
//                    }else{
//                        System.out.println("cost of mileage: $" +distance5);
//                    }

                        //make this system out use the distances cost without printing
                        if (distance <=4){
                            System.out.println("cost of mileage: $" +distance1);

                        }else if(distance <=15){
                            System.out.println("cost of mileage: $" +distance2);

                        }else if(distance <=25){
                            System.out.println("cost of mileage: $" +distance3);

                        }else if(distance <=50){
                            System.out.println("cost of mileage: $" +distance4);

                        }else{
                            System.out.println("cost of mileage: $" +distance5);
                        }


                    //created a variable so all distances can be added to the final total
                    double costOfDistance;

                    if (distance <= 4){
                        costOfDistance = 2.0;

                    }else if (distance <= 15){
                        costOfDistance = 5.0;

                    }else if (distance <= 25){
                        costOfDistance = 10.0;

                    }else if (distance <= 50){
                        costOfDistance = 15.0;

                    }else{
                        costOfDistance = 20.0;
                    }

        //created to calculate total
        double totalCost = totalCostOfGas + costOfDistance;


//        System.out.println("Total cost of travel: $" + totalCost);

        //reassigning product1 to print correctly on the receipt
        product1 = "Gas";

        //now time for string-formatting
        System.out.println("\n");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product", "Qty", "Price", "Miles", "Total");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","-------","-------","-------","-------","-------" );
        System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f\n",product1,qtyOfGas,pricePerGallon,costOfDistance,totalCost);


        //closes scanner
        myscan.close();

    }

}
