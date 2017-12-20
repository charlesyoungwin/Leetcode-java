package MinStack;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack;
	private int min;
	
	public MinStack(){
		this.stack = new Stack<Integer>();
		this.min = Integer.MAX_VALUE;
	}
	
	public void push(int x){
		if(x <= min){
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}
	
	public void pop(){
		if(stack.peek() == min){
			stack.pop();
			min = stack.pop();
		}
		else{
			stack.pop();
		}
	}
	
	public int top(){
		return stack.peek();
	}
	
	public int getMin(){
		return min;
	}
	
	public void printStack(){
		
		for(int item : stack){
			System.out.print(item + " ");
		}
	}
	public static void main(String[] args){
		MinStack obj = new MinStack();
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数字，以-1结束");
		int a;
		while((a = in.nextInt()) != -1){
			obj.push(a);
		}
		obj.printStack();
		System.out.println();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		
	}
}
