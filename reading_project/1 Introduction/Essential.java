public class HelloWorld {
    /* just like one frame ,  and we can set this frame condition
    * 1. public or private  or default : it is represents the access condition
    * 2. static or no , it represents it exists in the environment or as template.
    * 3. it represents frame type
    * 4. abstract name
    *
    * choose page back or front ,
    * choose who can use it
    * choose the shape about this frame
    * set name about this frame.(how to access it).
    * */
    public static void main(String[] arg){
        System.out.println("Hello World!");

        int x = 0;
        while( x < 10){
            System.out.print(x + " ");
            x++;
        }
        System.out.println("");
        System.out.println("3 and 6, the larger is " + larger(3,6));
    }

    public static int larger(int x, int y){
        if (x > y) {
            return x;
        }
        else {
            return y;
        }
    }
}
