public class countingBits{
  static int setBits(int a, int b){
       int aBits = 0;
       while(a!=0){
           if((a&1)==1)aBits++;
           a = a>>1;
       }

       int bBits = 0;
       while(b!=0){
           if((b&1)==1)bBits++;
           b = b>>1;
       }
       return aBits+bBits;
   }

   public static void main(String[] args) {
       System.out.println(setBits(5,5));
   }
}
