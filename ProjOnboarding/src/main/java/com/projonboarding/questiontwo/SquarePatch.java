package com.projonboarding.questiontwo;

import java.util.ArrayList;
import java.util.Collections;

public class SquarePatch {

	public static void patch(int n) {
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = n;
			}
		}
		
//		for (int[] arr: matrix) {
//			System.out.print("[");
//			for (int k: arr) {
//				System.out.print(k + ", ");
//			}
//			System.out.print("],");
//		}
		
//		ArrayList<Integer> matrixInts = new ArrayList<Integer>();
//		
//		
//		for (int k = 0; k < n; k++) {
//			Integer[] tempArr = new Integer[n];
//			for (int l = 0; l < n; l++) {
//				tempArr[l] = matrix[k][l];
//			}
////			for (int z = 0; z < tempArr.length; z++) {
////				System.out.println(tempArr[z]);
////			}
//			Collections.addAll(matrixInts, tempArr);
//		}
//		
//		System.out.println(matrixInts);
		
		System.out.println("[");
		for (int k = 0; k < n; k++) {
			System.out.print("[");
			for (int l = 0; l < n; l++) {
				System.out.print(matrix[k][l] + ", ");
			}
			System.out.println("],");
		}
		System.out.println("]");
	}
}