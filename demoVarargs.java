public class demoVarargs {
  //varargs
    //demo1
    static void show(int ...x){
        for (int a:x)
            System.out.println(a);
    }

    //demo2
    static void showList(int start, String ...s){
        for(int i = 0; i<s.length; i++){
            System.out.println(start+". "+s[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        show();
        show(10);
        show(10, 20);
        show(10,20,30);
        show(new int[]{10,20,30,40});

        showList(1,"abc","bcd","cde");

    }
}
