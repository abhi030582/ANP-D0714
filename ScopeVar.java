package com.example;

class Var_demo
{
	//int ctr = 0; //Class Var
	 //global var
	static int ctr=0;
	int i=10;
	public static  void incr() //global function
	{
		ctr++;
		System.out.println(ctr);
	}
	
}
public class ScopeVar {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctr = 0;
  //  Var_demo obj = new Var_demo(); //ctr =0
    Var_demo.incr(); // 1
    Var_demo.incr(); // 2
    Var_demo.incr(); // 3
  //  Var_demo obj1 = new Var_demo(); //ctr =0
    Var_demo.incr(); // 4
    Var_demo.incr(); // 5
    Var_demo.incr(); // 6
	}

}
