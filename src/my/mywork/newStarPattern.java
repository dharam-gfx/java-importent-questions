package my.mywork;

public class newStarPattern {
    public static void main(String[] args) {
        System.out.println("------------1-------------");

        int num=6;
        for (int i=1;i<=num;i++){
            for (int j=i;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------2-------------");

        int num2=6;
        for (int i=1;i<=num2;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------3-------------");
        int num3=6;
        for (int i=1;i<=num3;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=i;k<=num;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------4------------");

        int num6=6;
        for (int i=1;i<=num6;i++){
            for (int j=i;j<num6;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                int n=1;
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------5-------------");


        int num4=5;
        for (int i=1;i<=num4;i++){
            for (int j=i+1;j<=num4;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for (int l=2;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------6---------------");
        int num5=5;
        for (int i=1;i<=num5;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=i;k<=num5;k++){
                System.out.print("* ");
            }
            for (int k=i;k<num5;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("------------7-------------------");
        int num7=4;
        for (int i=1;i<=num7;i++){
            for (int j=i+1;j<=num7+1;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for (int l=2;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int num8=5;
        for (int i=1;i<=num8;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=i;k<=num8;k++){
                System.out.print("* ");
            }
            for (int k=i;k<num8;k++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
