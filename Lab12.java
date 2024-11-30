public class Lab12 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {}, {3, 1, 5, 1}, {4, 4, 1, 1}};
        //display(arr);
        //System.out.println(isMagicRows(arr3));
        //System.out.println(isMagicColumns(arr3));
    }
    
    /*
    * This method returns number
    * of rows of an array
    * @param input is a int[][] value
    * @return int
    */ 
    public static int getNumRows(int[][] input) {
        int answer = 0;
        for (int i = 0; i < input.length; i++) {
            answer++;
        }
        return answer;
    }
    
    /*
    * This method returns length 
    * of the given row inside 
    * the given array
    * @param input is a int[][] value
    * @param rowIndex is a int value
    * @return int
    */ 
    public static int getRowLength(int[][] input, int rowIndex) {
        int answer = 0;
        if (rowIndex >= input.length || rowIndex < 0) {
            return answer;
        } else {
            answer = input[rowIndex].length;
            return answer;
        }
    }
    
    /*
    * Accepts a 2D-array
    * of ints, one int 
    * value as a row index,
    * one int value as a col
    * index, and a new int 
    * value to be saved in 
    * the array
    * @param input is a int[][] value
    * @param rowIndex is a int value
    * @param colIndex is a int value
    * @param newValue is a int value
    * @return void
    */ 
    public static void changeElem(int[][] input, int rowIndex, 
        int colIndex, int newValue) {
        if (rowIndex >= 0 && rowIndex < input.length) {
            if (colIndex >= 0 && colIndex < input[rowIndex].length) {
                input[rowIndex][colIndex] = newValue;
            }
        }      
    }
    
    /*
    * A void method called 
    * display which accepts 
    * a 2D-array of ints, which 
    * prints all elements of 
    * the array separated by a 
    * space    
    * @param input is a int[][] value
    * @return void
    */ 
    public static void display(int[][] input) {
        int counter = 1;
        for (int[] row: input) {
            if (row.length == 0) {
                System.out.print("\n");                
            }
            for (int elem: row) {
                System.out.print(elem + " ");
                counter++;
                if (counter > row.length) {
                    System.out.print("\n");
                    counter = 1;
                }
            }
        }
    }
    
    /*
    * This method returns true if
    * the sums of all ROWS in the 
    * array are equal. It will 
    * return false otherwise 
    * @param input is a int[][] value
    * @return boolean
    */ 
    public static boolean isMagicRows(int[][] input) {
        int sum = 0;
        int counter = 1;
        int tempsum = 0;
        boolean answer = true;
        
        //Takes Initital Sum
        for (int[] row: input) {
            sum += row[0];  
        }     
        
        //Takes the sum from all other rows
        while (counter < input.length) {
            for (int i = 0; i < input.length; i++) {
                tempsum += input[i][counter];
            }
            if (tempsum != sum) {
                answer = false;
            }
            counter++;
            tempsum = 0;
        }
        return answer;
    }
    
    /*
    * This method returns true if
    * the sums of all COLUMNS in the 
    * array are equal. It will 
    * return false otherwise 
    * @param input is a int[][] value
    * @return boolean
    */ 
    public static boolean isMagicColumns(int[][] input) {
        int sum = 0;
        int counter = 1;
        int tempsum = 0;
        boolean answer = true;
        
        //Takes Initital Sum
        for (int i = 0; i < input[0].length; i++) {
            sum += input[0][i];
        }
        
        while (counter < input.length) {
            for (int i = 0; i < input.length; i++) {
                tempsum += input[counter][i];
            }
            if (tempsum != sum) {
                answer = false;
            }
            counter++;
            tempsum = 0;
        }       
        return answer;
    }
}
