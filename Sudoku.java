import java.util.ArrayList;
public class Sudoku {
    private int[][] grid;
    public Sudoku(int[][] grid){
    this.grid = grid;
    }
    public void printRow(int row)
    {
        for(int i: getRowValues(row))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }    
    
    public void printCol(int col)
    {
        for(int i: getColumnValues(col))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
 
    public void printBox(int box)
    {
        for(int i: getBoxValues(box))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    } 
    private ArrayList<Integer> getRowValues(int row){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < 9; i++){
           if(grid[row-1][i] != 0){array.add(grid[row-1][i]);}
        }
        return array;
    }
    private ArrayList<Integer> getColumnValues(int col){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < 9; i++){
           if(grid[i][col-1] != 0){array.add(grid[i][col-1]);}
        }
        return array;
    }
    private ArrayList<Integer> getBoxValues(int box){
        ArrayList<Integer> array = new ArrayList<Integer>();
        if(box == 1){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
    else if(box == 2){
        for(int row = 0; row < 3; row++){
            for(int col = 3; col < 6; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
    else if(box == 3){
        for(int row = 0; row < 3; row++){
            for(int col = 6; col < 9; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
    else if(box == 4){
        for(int row = 3; row < 6; row++){
            for(int col = 0; col < 3; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
    else if(box == 5){
        for(int row = 3; row < 6; row++){
            for(int col = 3; col < 6; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
    else if(box == 6){
        for(int row = 3; row < 6; row++){
            for(int col = 6; col < 9; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
    else if(box == 7){
        for(int row = 6; row < 9; row++){
            for(int col = 0; col < 3; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
    else if(box == 8){
        for(int row = 6; row < 9; row++){
            for(int col = 3; col < 6; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
     else if(box == 9){
        for(int row = 6; row < 9; row++){
            for(int col = 6; col < 9; col++){
                if(grid[row][col] != 0){array.add(grid[row][col]);}
             }
        }
    }
        return array;
    }
    public int getValue(int row, int col){
        int value = grid[row-1][col-1];
      return value;
    }
    public void setValue(int row, int col, int val){
       val = grid[row-1][col-1];
        }
public void printGrid(){
for(int row = 0; row < 9; row++){
    for(int col = 0; col < 9; col++){
        if(grid[row][col] == 0){
            System.out.print("- ");
        }
        else {System.out.print(grid[row][col] + " ");}
        if(col == 2 || col == 5){
            System.out.print("| ");
        }  
        
    }
    if(row == 2|| row == 5){
        System.out.print("\n");
        System.out.print("---------------------");
    }
    System.out.print("\n");
}
}
}
