// Creator: Reginald Keyshawn Billups
//Date Started: February 1, 2022
//Date Finished: March 13, 2022
//Project Name: GUI Calculator Project
//Goal: Make a GUI Calculator using Object Oriented Programming

import java.util.ArrayList;

public class Calculator {
	 //variables
	 private double answer;
	 private int size=0;
	 private int postionInNums=0;
	 private double nums[]; 
	
	 
	 //constructor
	 Calculator(ArrayList<String> arr){
		 size=arr.size();
		 nums=new double[size];
		 int count=0;
		 //takes numbers from arraylist and converts to double 
		 for(int i=0;i<arr.size();i++) {
			
			 if(i%2==0) {
			double temp= Double.parseDouble(arr.get(i)); 
			nums[count]=temp;
				 count++;
			 }
		 }
		
	 }
	 //default constructor
	 Calculator(){
		 
	 }
	//getter method
	 public int getSize() {
		 return size;
	 }
	 
	 //add methods
	 public double add() {
		answer=nums[0]+nums[1];
		postionInNums=2;
		
		 return answer;
	 }
	 
	 //takes in temporary answer and does operation
	 public double add(double i) {
			answer=i+nums[postionInNums];
			postionInNums++;
			
			 return answer;
		 }
	 
	 //multiplication methods
	 public double multiply() {
			answer=nums[0]*nums[1];
			postionInNums=2;
			
			 return answer;
		 }
	 //takes in temporary answer and does operation
	public double multiply(double i) {
			answer=i*nums[postionInNums];
			postionInNums++;
				
				return answer;
			 }
	//division methods
	 public double divide() {
			answer=nums[0]/nums[1];
			postionInNums=2;
			
			 return answer;
		 }
	 //takes in temporary answer and does operation
	public double divide(double i) {
			answer=i/nums[postionInNums];
			postionInNums++;
				
				return answer;
			 }
	//subtract methods
	 public double subtract() {
			answer=nums[0]-nums[1];
			postionInNums=2;
			
			 return answer;
		 }
	 //takes in temporary answer and does operation
	public double subtract(double i) {
			answer=i-nums[postionInNums];
			postionInNums++;
				
				return answer;
			 }
	//sqrt method
	public double sqrt(double i) {
		
		answer=Math.sqrt(i);
			
			return answer;
		 }
	//exponent methods
	public double exponent() {
		answer=Math.pow(nums[0], nums[1]);
		postionInNums=2;
		
		 return answer;
	 }
	 //takes in temporary answer and does operation
	public double exponent(double i) {
		answer=Math.pow(i, nums[postionInNums]);
		postionInNums++;
			
			return answer;
		 }
	
	
	//prints array from constructor
	 public void showNums() {
		 for(int i=0;i<nums.length;i++) {
			 System.out.println(nums[i]);
		 }
		 
	 }
}
