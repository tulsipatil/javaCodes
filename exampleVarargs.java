public class exampleVarargs {
  //Example1 - Maximum of numbers using varargs
    static int max(int ...A){
        if(A.length==0) return Integer.MIN_VALUE;
        int m = A[0];
        for(int i = 0; i<A.length; i++){
            if(A[i]>m) m=A[i];
        }
        return m;
    }

    //Example2 - Sum of all elements using varargs
    static int sum(int...A){
        int sum = 0;
        for(int i = 0; i<A.length;i++){
            sum = A[i]+sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(1,2,3,4,5));
        System.out.println(max(new int[]{1,2,3,4,5,6}));

        System.out.println(sum());
        System.out.println(sum(1,2,3));
        System.out.println(sum(new int[]{1,2,3}));
    }
}
