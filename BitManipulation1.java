public class BitManipulation1 {
    public static void main(String[] args) {
        //set ith bit
        int n =5;
        int position = 1;
        int Bitmask = 1<<position;
        int newNumber = Bitmask | n;
        System.out.println(newNumber);
    }
}
