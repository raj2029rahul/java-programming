package myfirstjava;

public class Solution {
	int a=13;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int something_cool;
		Solution s= new Solution();
		fun(s);
		System.out.print(s.a+"");
		fun(s);
		something_cool=s.a;
		System.out.print(something_cool);
	}
	public static void fun(Solution a)
	{
		a.a=a.a+5;
	}
}
