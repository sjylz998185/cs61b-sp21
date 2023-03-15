import org.junit.Test;

public class Sort {

    /* sorts string destructively */
    public static void sort(String[] x){
        /* find the smallest item it return element */

        /* then move it to the front it need index as argument */

        /* selection sort the rest(how to implement) */
        sort(x, 0);

    }

    /* we encounter one issue :
    * string don't use < compare
    * @source :https://joshhug.gitbooks.io/hug61b/content/chap3/chap31.html */
    public static int findSmallest(String[] x, int start){
        int sI = start;
        for(int i = start; i < x.length; i += 1){
            int cmp = x[i].compareTo(x[sI]);
            if(cmp < 0) {
                sI = i;
            }
        }
        return sI;
    }

    /*swap method :
    * return index*/
    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /*recursion :
    * find the rest smallest*/
    private static void sort(String[] x, int start){
        /* recur : abstract length as entire
        * entire become shorter and shorter , and look for the shortest
        * */
        if(start == x.length){
            return;
        }
        int sI = findSmallest(x,start);
        swap(x,start, sI);
        sort(x, start+1);
    }

}
