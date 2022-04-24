package my.mywork;

public class spaceCountInString {
    public static void main(String[] args) {
        String str="This is a book it is for rahul you can ask him";
        int count=0;
        for (int i=0; i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }

        //remove space frome string
        System.out.println("Total Space - "+count);
        String str2="";
        for (int i=0; i<str.length();i++){
            if(str.charAt(i)==' '){
            }
            else{
                str2+=str.charAt(i);
            }
        }

        //replace space into underscore
        System.out.println(str2);
        String str3="";
        for (int i=0; i<str.length();i++){
            if(str.charAt(i)==' '){
                str3+='_';
            }
            else{

                str3+=str.charAt(i);
            }
        }
        System.out.println(str3);


    }
}
