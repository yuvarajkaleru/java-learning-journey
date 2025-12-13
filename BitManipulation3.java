public class BitManipulation3 {
    public static void main(String[] args) {
        //update ith bit
        int n =5;
        int position = 1;
        int Bitmask = 1<<position;
        int newNumber = Bitmask | n; //set ith bit
        System.out.println(newNumber);
    }
}
