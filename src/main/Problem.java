package main;

public class Problem {
	Integer number;
	String problem_name;
	String difficulty;
	public Problem(Integer number, String problem_name, String difficulty) {
		this.number = number;
		this.problem_name = problem_name;
		this.difficulty = difficulty;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "2441. Largest Positive Integer That Exists With Its Negative74.1%Easy";
		System.out.println(test.substring(0, test.indexOf('.')));
		System.out.println(test.substring(test.indexOf(' ')+1, test.indexOf('%')-4));
		System.out.println(test.substring(test.indexOf('%')+1));
	}
	
}
