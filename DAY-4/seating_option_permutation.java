

public class seating_option_permutation {
    	public static void main(String[] args) {
		int n=2;
		int s=4;
		boolean seat[]=new boolean[s];
		seating(n,seat,0,"",0);

	}
	public static void seating(int n,boolean seat[],int curr,String ans,int idx) {
		//base case
		if(curr==n) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<seat.length;i++) {
			if(seat[i]==false) {
				seat[i]=true;
				seating(n,seat,curr+1,ans+"S"+(i),i+1);
				seat[i]=false;
			}
		}
	}
}
