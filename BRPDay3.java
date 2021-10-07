package Day_17_Algorithm;

public class BRPDay3 {
	public static void main(String a[]){
        int n = 5;
        double a = Math.random();
        double b =  Math.random();
        double c =  Math.random();
        double d =  Math.random();
        double e =  Math.random();
        System.out.println("Random number: "+a);
        System.out.println("Random number: "+b);
        System.out.println("Random number: "+c);
        System.out.println("Random number: "+d);
        System.out.println("Random number: "+e);

        double min     = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        double max     = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        double average = (a + b + c + d + e) / n;

        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
}

