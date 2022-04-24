public class CustomList {
    private  String[] items;
    private static  int size;

    public void addLast(String x){
        if (size>=100){
            return;
        }
        items[size]=x;
        size=size+1;

    }
    public  String getLast(){
        if (size==0){
            return null;

        }
        return items[size-1];

    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {

    }

}
