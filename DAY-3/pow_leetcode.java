

public class pow_leetcode {
     public static void main(String[] args) {
        int n=3;
        double x=2.100;
        if(n>0){
             System.out.println(Pow(x,n));
        }else{
            System.out.println(1.0/Pow(x,n));
        }
		

	}
     public static double Pow(double x, int n) {
        if (n == 0) 
            return 1.0;
        double a=Pow(x, n / 2);
        if (n % 2 == 0) 
            return a * a;
        else 
           return x*a*a; 
    
    }
}
