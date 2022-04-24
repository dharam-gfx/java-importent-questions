package my.company;

public class IntStringUperCaseFirstwordLatter {
    public static void main(String[] args) {
        String str="dharam is a good boy";
        int count=1;
        char ch='c';
        System.out.println();
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;

            }
        }
        System.out.println(count);
        System.out.println(str);

    }
}
