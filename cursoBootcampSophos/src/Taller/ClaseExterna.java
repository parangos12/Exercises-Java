package Taller;

public class ClaseExterna {
int nums[];
public ClaseExterna(int n[]) {
nums=n;
}
void analizar(){
 Interna inOb=new Interna();
 System.out.println("Minimo: "+inOb.min());
 System.out.println("Máximo: "+inOb.max());
 System.out.println("Promedio: "+inOb.promedio());
 }
//Esta es una clase interna

 class Interna{
 int min(){
	 int m=nums[0];
	 for (int i=1;i<nums.length;i++) {
	 if(nums[i-1]<nums[i]) {
		 if(nums[i-1]<=m) {
			 m=nums[i-1];}
	 }}
	 return m;}
	 
 int max(){
	 int m=nums[0];
	 for (int i=1;i<nums.length;i++) {
	 if(nums[i-1]>nums[i]) {
		 if(nums[i-1]>=m) {
			 m=nums[i-1];}
	 }}
	 return m;}

 int promedio(){
 int a=0;
 for (int i=0; i<nums.length;i++)
 a+=i;
 return a/nums.length;
 }
 }
 static class ClaseAndidadaDemo {
 public static void main(String[] args) {
 int x[]={4,3,2,1,5,601,7,8,15,99,101};
 ClaseExterna extob= new ClaseExterna(x);
 extob.analizar();
 }
 }
}
