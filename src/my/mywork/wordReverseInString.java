package my.mywork;

public class wordReverseInString {
    public static void main(String[] args) {
        String str="This is a book";
        String arr[]=str.split(" ");
        int len=arr.length;
        int len2=len;
        String revearr[]=new String[len];
        for (int i=0;i<len;i++){
            revearr[i]=arr[len2-1];
            len2--;

        }
        for (int i=0;i<len;i++){
            System.out.print(revearr[i]+" ");

        }

    }
}
