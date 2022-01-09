/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixagent;

/**
 *
 * @author Mehmet Baran Geylani
 */
public class Environment {

    private int[][] matrix;
    private int dirtyCounter;

    public Environment() {
        this.initMatrix();
    }

    private void initMatrix() {
        this.matrix = new int[4][4];
        int number;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                number = (int) Math.round(Math.random());
                if (number == 1) {
                    this.matrix[i][j] = number;
                    dirtyCounter++;
                    continue;
                }
                this.matrix[i][j] = number;
            }
        }
    }

    public int[][] getEnvironment() {
        return this.matrix;
    }

    public void printEnvironment(int x, int y) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == x && j == y) {
                    System.out.print("X ");
                    continue;
                }
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The agent has the location " + x + " - " + y);
    }

    

    public int getDirtyCounter() {
        return dirtyCounter;
    }

    public boolean isDirty(int x, int y) {

        if (this.matrix[x][y] == 1) {
            return true;
        }
        return false;
    }

    public void clean(int x, int y) {
        this.matrix[x][y] = 0;
    }
}
