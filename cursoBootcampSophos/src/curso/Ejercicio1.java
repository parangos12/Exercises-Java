package curso;

public class Ejercicio1 {
	public static void main(String args[]) 
	{
		 int []nums={201,3,4,504,6,701,1,8,0,1,7,-7,1};
		 int min=nums[0];
		 for (int i=1;i<nums.length;i++) {
		 if(nums[i-1]>nums[i]) {
			 if(nums[i-1]>=min) {
				 min=nums[i-1];
			 }
		 }
		 }
		 System.out.println(min);
	}
}
