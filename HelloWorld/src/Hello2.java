public class Hello2 {

    public static void main(String[] args) {
     int a=2_147_483_647;
     short c=32767;
     byte d=10;
     int b=2;
     int sum= a+b;
     byte e= (byte) (d*2);
     long mylong=50_000L;
     short myshort=(short) mylong;
     char myChar='\u00AE';
     boolean isCat=true;
     int s=5;
     int r=2;
     int x=s % r;
     double poundToKg = 0.45359237d;
     int hello=12;

/*akshit
mehta
dsfk
 */
        System.out.println("mylong is " + mylong);
        System.out.println("myshort is " + myshort);
        System.out.println("a is " + (a+1));
        System.out.println(myChar);
        System.out.println(" 150 pounds = " + (150 * poundToKg));
        System.out.println(hello);

    }
}
