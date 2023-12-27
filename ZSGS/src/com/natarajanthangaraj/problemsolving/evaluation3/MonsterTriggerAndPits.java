package com.natarajanthangaraj.problemsolving.evaluation3;

public class MonsterTriggerAndPits {
	private static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		MonsterTriggerAndPits object = new MonsterTriggerAndPits();
		char[][] matrix = Utility.getMatrix();
		object.display(matrix);
		if (object.directPath(matrix)) {

		} else {
			object.useTrigger(matrix);
		}

	}

	private void useTrigger(char[][] matrix) {
		int AdventurerToTrigger = pathOfAdventurer(matrix, Utility.findPosition(matrix, 'A'), 'T');
		int triggerToGold = pathOfAdventurer(matrix, Utility.findPosition(matrix, 'T'), 'G');
		System.out.println(AdventurerToTrigger +" "+ triggerToGold);
		System.out.println(" Minimum Possible steps : " + (AdventurerToTrigger + triggerToGold));

	}
	private void display(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[0].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}

	private boolean directPath(char[][] matrix) {
		min=Integer.MAX_VALUE;
		int monsterStep = Utility.steps(Utility.findPosition(matrix, 'M'), Utility.findPosition(matrix, 'G'));
		int Adventurer = pathOfAdventurer(matrix, Utility.findPosition(matrix, 'A'), 'G');
		if (monsterStep >= Adventurer) {
			System.out.println("Minimum Number Of Steps : " + Adventurer);
			return true;
		}
		return false;
	}

	private int pathOfAdventurer(char[][] matrix, int[] adv, char Destination) {
		min=Integer.MAX_VALUE;
		checkLeftDown(adv[0], adv[1], matrix, 0, Destination);
		checkRightTop(adv[0], adv[1], matrix, 0, Destination);
		checkLeftTop(adv[0], adv[1], matrix, 0, Destination);
		checkRightDown(adv[0], adv[1], matrix, 0, Destination);
		return min;
	}

	private void checkLeftDown(int i, int j, char[][] arr, int k, char destination) {

		if (i == arr.length || j == -1) {
			return;
		} else if (arr[i][j] == 'P') {
			return;
		} else if (arr[i][j] == destination) {
			if (min > k) {
				min = k;
			}
			return;
		} else {
			checkLeftDown(i, j - 1, arr, k + 1, destination);
			checkLeftDown(i + 1, j, arr, k + 1, destination);
		}
	}
	private void checkLeftTop(int i, int j, char[][] arr, int k, char destination) {

		if (i == -1 || j == -1) {
			return;
		} else if (arr[i][j] == 'P') {
			return;
		} else if (arr[i][j] == destination) {
			if (min > k) {
				min = k;
			}
			return;
		} else {
			checkLeftTop(i, j - 1, arr, k + 1, destination);
			checkLeftTop(i - 1, j, arr, k + 1, destination);
		}
	}

	private void checkRightTop(int i, int j, char[][] arr, int k, char destination) {

		if (j == arr[0].length || i == 0) {
			return;
		} else if (arr[i][j] == 'P') {
			return;
		} else if (arr[i][j] == destination) {
			if (min > k) {
				min = k;
			}
			return;
		} else {
			checkRightTop(i, j + 1, arr, k + 1, destination);
			checkRightTop(i - 1, j, arr, k + 1, destination);
		}
	}
	private void checkRightDown(int i, int j, char[][] arr, int k, char destination) {

		if (j == arr[0].length || i == arr.length) {
			return;
		} else if (arr[i][j] == 'P') {
			return;
		} else if (arr[i][j] == destination) {
			if (min > k) {
				min = k;
			}
			return;
		} else {
			checkRightDown(i, j + 1, arr, k + 1, destination);
			checkRightDown(i + 1, j, arr, k + 1, destination);
		}
	}

}
