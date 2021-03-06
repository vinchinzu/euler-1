package _074;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lib.Numbers;
import main.AbstractProblem;





public class _074 extends AbstractProblem {

	public static void main(String[] args) {
		AbstractProblem p = new _074();
		p.run();
		System.out.println(p.answer());
	}

	public void run() {
		int count = 0;
		for(long i = 1; i < 1000000; i++) {
			long sum = sumFactorialOfDigits(Numbers.getDigits(i));
			Set<Long> chain = new HashSet<Long>();
			chain.add(i);
			while(!chain.contains(sum)) {
				chain.add(sum);
				sum = sumFactorialOfDigits(Numbers.getDigits(sum));
			}
			if(chain.size() == 60) {
				count++;
			}
		}
		this.answer = count;
	}
	
	private long sumFactorialOfDigits(List<Integer> digits) {
		long sum = 0;
		for(Integer d : digits) {
			sum += Numbers.factorial(d);
		}
		return sum;
	}
}
