package OOT.Practice.ex2;

import java.util.Scanner;

public class Travel{
    public static void main(String args[]){
        int distance = 0;
        Scanner sc = new Scanner(System.in);
        String visit;
        System.out.print("Did you go to Japan? ");
        String travel = sc.nextLine();
        
        if(travel.equals("yes")){
            System.out.print("Where did you visit? ");
            visit = sc.nextLine();

            if(visit.equals("Tokyo")){
                distance += 20;
            }else if (visit.equals("Hokkaido")){
                distance += 50;
            }else if (visit.equals("Kyoto")){
                distance += 40;
            }
        }

        System.out.print("Did you go to the UK? ");
        travel = sc.nextLine();
        
        if(travel.equals("yes")){
            System.out.print("Where did you visit? ");
            visit = sc.nextLine();
            
            if(visit.equals("London")){
                distance += 10;
            }else if (visit.equals("York")){
                distance += 100;
            }
        }

        System.out.print("Did you go to the US? ");
        travel = sc.nextLine();
        
        if(travel.equals("yes")){
            System.out.print("Where did you visit? ");
            visit = sc.nextLine();

            if(visit.equals("Washington")){
                distance += 80;
            }else if (visit.equals("New York")){
                distance += 90;
            }
        }

        System.out.println("Total distance is " + distance);
        sc.close();
        }
    }