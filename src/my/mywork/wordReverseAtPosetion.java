package my.mywork;

public class wordReverseAtPosetion {
    public static void main(String[] args) {

        String str="this is a book";
        String arr[]=str.split(" ");
        int len=arr.length;
        String revearr[]=new String[len];
        for (int i=0;i<len;i++){
        String temp="";
            int length=arr[i].length();

            for (int j=length-1;j>=0;j--){
                temp+=arr[i].charAt(j);
            }
//            System.out.print(temp+" ");
            revearr[i]=temp;
        }
        for (int i=0;i<len;i++){
            System.out.print(revearr[i]+" ");
        }

    }
}
