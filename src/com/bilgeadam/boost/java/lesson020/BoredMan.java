package com.bilgeadam.boost.java.lesson020;

public class BoredMan {

	public static void main(String[] args) {
		int lockerNumber=10;
		boolean[] lockers = new boolean[lockerNumber];

		for (int i = 0; i < lockerNumber; i++) {
			lockers[i] = false; // tüm dolapları kapattık
		}

		for (int tour = 1; tour <= lockerNumber; tour++) {
			System.out.println(tour+". Tur. Her "+tour+" dolaptan birini değiştirecek.");
			for (int lockerCnt=0; lockerCnt<lockers.length;) {
				lockers[lockerCnt] = !lockers[lockerCnt];
				lockerCnt += tour;
			}
		}
	}

}
