package _010;

import lib.Numbers;
import main.AbstractProblem;


public class _010 extends AbstractProblem {

	public static void main(String[] args) {
		AbstractProblem p = new _010();
		p.run();
		System.out.println(p.answer());
	}

	public void run() {
		int n = 2000000;
		
		long sum = 0;
		for(int i = 0; i < n; i++) {
			if(Numbers.isPrime(i)) {
				sum += i;
			}
		}
		this.answer = sum;
	}

}
