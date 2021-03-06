package _004;

import lib.Numbers;
import main.AbstractProblem;

public class _004 extends AbstractProblem {

	public static void main(String[] args) {
		AbstractProblem p = new _004();
		p.run();
		System.out.println(p.answer());
	}

	public void run() {
		int digits = 3;
		
		int upper = (int)Math.pow(10, digits) - 1;
		int max = 0;
		int mult = 0;
		for(int i = 0; i <= upper; i++) {
			for(int j = 0; j <= upper; j++) {
				mult = i * j;
				if(Numbers.isPalindrome(mult) && mult > max) {
					max = mult;
				}
			}		
		}
		this.answer = max;
	}
	
}
