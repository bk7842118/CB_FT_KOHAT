

public class climb_stair_leetcode {
    public static void main(String[] args) {
        System.out.println(climb(5));
    }
    public static int climb(int n) {
        if(n==0)return 1;
        if(n<0)return  0;
        int x=climb(n-1);
        int y=climb(n-2);
        return x+y;
    } 
}
