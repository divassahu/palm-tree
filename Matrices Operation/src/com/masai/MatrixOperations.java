package com.masai;

import java.util.Scanner;

public class MatrixOperations {

	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Enter the number of rows in the first matrix: ");
		    int rows1 = sc.nextInt();
		    System.out.print("Enter the number of columns in the first matrix: ");
		    int columns1 = sc.nextInt();

		    int[][] matrix1 = new int[rows1][columns1];
		    System.out.println("Enter the elements of the first matrix: ");
		    for (int i = 0; i < rows1; i++) {
		      for (int j = 0; j < columns1; j++) {
		        matrix1[i][j] = sc.nextInt();
		      }
		    }

		    System.out.print("Enter the number of rows in the second matrix: ");
		    int rows2 = sc.nextInt();
		    System.out.print("Enter the number of columns in the second matrix: ");
		    int columns2 = sc.nextInt();

		    int[][] matrix2 = new int[rows2][columns2];
		    System.out.println("Enter the elements of the second matrix: ");
		    for (int i = 0; i < rows2; i++) {
		      for (int j = 0; j < columns2; j++) {
		        matrix2[i][j] = sc.nextInt();
		      }
		    }

		    System.out.println("\nFirst Matrix:");
		    for (int i = 0; i < rows1; i++) {
		      for (int j = 0; j < columns1; j++) {
		        System.out.print(matrix1[i][j] + " ");
		      }
		      System.out.println();
		    }

		    System.out.println("\nSecond Matrix:");
		    for (int i = 0; i < rows2; i++) {
		      for (int j = 0; j < columns2; j++) {
		        System.out.print(matrix2[i][j] + " ");
		      }
		      System.out.println();
		    }

		    if (rows1 == rows2 && columns1 == columns2) {
		      System.out.println("\nAddition of matrices:");
		      int[][] sum = new int[rows1][columns1];
		      for (int i = 0; i < rows1; i++) {
		        for (int j = 0; j < columns1; j++) {
		          sum[i][j] = matrix1[i][j] + matrix2[i][j];
		        }
		      }
		      for (int i = 0; i < rows1; i++) {
		        for (int j = 0; j < columns1; j++) {
		          System.out.print(sum[i][j] + " ");
		        }
		        System.out.println();
		      }
		    }
		    
		    if (rows1 == rows2 && columns1 == columns2) {
		    	  System.out.println("\nSubtraction of matrices:");
		    	  int[][] difference = new int[rows1][columns1];
		    	  for (int i = 0; i < rows1; i++) {
		    	    for (int j = 0; j < columns1; j++) {
		    	      difference[i][j] = matrix1[i][j] - matrix2[i][j];
		    	    }
		    	  }
		    	  for (int i = 0; i < rows1; i++) {
		    	    for (int j = 0; j < columns1; j++) {
		    	      System.out.print(difference[i][j] + " ");
		    	    }
		    	    System.out.println();
		    	  }
		    	} else {
		    	  System.out.println("Matrices cannot be subtracted as they are of different dimensions.");
		    	}

		    
		    if (columns1 == rows2) {
		    	  System.out.println("\nMultiplication of matrices:");
		    	  int[][] product = new int[rows1][columns2];
		    	  for (int i = 0; i < rows1; i++) {
		    	    for (int j = 0; j < columns2; j++) {
		    	      for (int k = 0; k < columns1; k++) {
		    	        product[i][j] += matrix1[i][k] * matrix2[k][j];
		    	      }
		    	    }
		    	  }
		    	  for (int i = 0; i < rows1; i++) {
		    	    for (int j = 0; j < columns2; j++) {
		    	      System.out.print(product[i][j] + " ");
		    	    }
		    	    System.out.println();
		    	  }
		    	} else {
		    	  System.out.println("Matrices cannot be multiplied as the number of columns in the first matrix is not equal to the number of rows in the second matrix.");
		    	}

	 }
}
