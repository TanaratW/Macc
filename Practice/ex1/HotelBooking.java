package OOT.Practice.ex1;

import java.util.Scanner;

public class HotelBooking{
    public static void main(String args[]){
        float total = 0;
        final float commonRoom = 5000, extraRoom = 10000, breakfast = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to book a room?");
        String booking = sc.nextLine();
        if(booking.equals("yes")){
            System.out.println("Please choose a room type:");
            String roomType = sc.nextLine();
            System.out.println("How many rooms?");
            int manyRoom = sc.nextInt();
            sc.nextLine();
            System.out.println("Include breakfast?");
            String bk = sc.nextLine();

            
            if(roomType.equals("common")){
                total = commonRoom*manyRoom;
                
            }else if (roomType.equals("extra")){
                total = extraRoom*manyRoom;
            }

            if(bk.equals("yes")){
                    total = total + breakfast;
            }
            
            System.out.println("You need to pay " + (float)(total + total * 0.018) + " baht (included service charge).");            

        }else if (booking.equals("no")) {
            System.out.println("Do you want to reserve your quota for booking room next time?");
            String nextbooking = sc.nextLine();
            if(nextbooking.equals("yes")){
                total = (float)(1000.0 + 1000.0*0.018);
                System.out.println("Please pay for reserve the quota about 1000 baht.");
                System.out.println("You need to pay " + total + " baht (included service charge).");
            } else if(nextbooking.equals("no")){
                System.out.println("You need to pay " + total + " baht (included service charge).");
            }
        }
        sc.close();
    }
}