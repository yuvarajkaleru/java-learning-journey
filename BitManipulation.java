public class BitManipulation {
    //Get ith bit
    public static void main(String[] args) {
        int n =5;
        int position = 3;
        int Bitmask = 1<<position;
        if((Bitmask & n) == 0){
            System.out.println("zero");
        }
        else{
            System.out.println("one");
        }
    }
}
