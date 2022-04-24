package my.company;

import java.util.Scanner;

public class findDayInMonth {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean status=true;
        while (status){
            System.out.println("**** Month list ****");
            System.out.println("1. jan");
            System.out.println("2. fab");
            System.out.println("3. mar");
            System.out.println("4. apr");
            System.out.println("5. may");
            System.out.println("0. Exit");
            System.out.print("enter a number = ");
            int num=sc.nextInt();
            char ch;
            if (num>12){
                System.out.println("Enter correct number from list of month ");
            }

            switch (num){
                case 1:
                    System.out.println("jan 31");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 2:
                    System.out.println("fab 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 3:
                    System.out.println("mar 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 4:
                    System.out.println("apr 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 5:
                    System.out.println("may 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 6:
                    System.out.println("jun 28");System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }

                    break;
                case 7:
                    System.out.println("julay 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 8:
                    System.out.println("aug 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 9:
                    System.out.println("sep 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 10:
                    System.out.println("oct 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 11:
                    System.out.println("nov 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
                case 12:
                    System.out.println("dec 28");
                    System.out.println("do you want to continue press y/n");
                    ch=sc.next().charAt(0);
                    if (ch!='y' && ch!='Y'){
                        status=false;
                        System.out.println("Thanks you for using this code");
                    }
                    break;
            }

        }

    }
}
