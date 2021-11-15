public class QuickSortBall {

    private static void quicksort(Ball[] a, int p, int r) {
        if( p < r ) {
            int i = p-1;
            for (int j=p; j<r; j++) {
                if (a[j].compareTo(a[r]) <= 0) {
                    i++;
                    Ball b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
            Ball b = a[i+1];
            a[i+1] = a[r];
            a[r] = b;

            quicksort(a,p,i);
            quicksort(a,i+2,r);
        }
    }
}
