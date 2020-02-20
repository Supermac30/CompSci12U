import java.util.Arrays;

class CopyArray  {
    public static void main (String[] args){
        int[][] data = {{3, 2, 5, 10, 9},
                {1, 4, -4, 8, 13},
                {9, 1, 0, 2, -8},
                {0, 2, 6, 3, -1}};
        print2DArray(data);
        int [][] copyData = createCopy(data);
        print2DArray(copyData);
    }

    //a method that prints out a 2D array
    public static void print2DArray (int [][] anArray){
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(Arrays.toString(anArray[i]));
        }
    }

    //a method that copies a 2D-array passed as parameter in a new one
    public static int [][] createCopy (int [][] initial){
        int[][] copy = new int[initial.length][initial[0].length];//create a new array

        //copy element by element from initial to copy.
        for(int row=0; row < copy.length; row++){
            copy[row] = Arrays.copyOf(initial[row], initial[row].length);
        }
        return copy;
    }
}
