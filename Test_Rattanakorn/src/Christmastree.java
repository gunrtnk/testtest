public class Christmastree {
    private int height;

    public Christmastree( int height) {
        this.height=height;
        }

    public static void draw (int height){
            for(int i =0; i<height-1; i++){
                for (int j = 0; j < height - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i * 2 + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i =0; i<2; i++){
                for (int j = 0; j < height - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i * 2 + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
}
