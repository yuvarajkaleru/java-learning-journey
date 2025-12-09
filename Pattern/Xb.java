public class Xb {
    public static void main(String[] args){
        int n = 5;
        int m = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("* ");
                }
                // else if (i==3 && (j==2||j==3||j==4)) {  this is added by me to print yyy in the middle
                //     System.out.print("y ");
                // }
            else { //make a tab space for this else loo to use my yyy in middle code and make the else if code work
                System.out.print("  ");
            }
            }
            System.out.println(" ");
        }
    }
}
