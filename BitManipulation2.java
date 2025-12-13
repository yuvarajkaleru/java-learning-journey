public class BitManipulation2 {
    public static void main(String[] args) {
        //clear ith bit
        int n =5;
        int position = 2;
        int Bitmask = 1<<position;
        int notBitmask = ~Bitmask;
        int newNumber = notBitmask & n;
        System.out.println(newNumber);
    }
}
