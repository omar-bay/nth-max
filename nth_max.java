public class nth_max {
    public static void main(String[] args) {
        int[] a = {4,2,7,9,3,1,3,6,1};
        System.out.println(nthMax(a, 3));
    }

    public static int nthMax(int[] array, int n) {
        int max = 999999999;
        for(int i=0;i<n;i++) {
            int _max = -999999999;
            for(int j=0;j<array.length;j++) {
                if(array[j]>=_max && array[j]<max)   _max = array[j];
            }
            max = _max;
        }
        return max;
    }
}