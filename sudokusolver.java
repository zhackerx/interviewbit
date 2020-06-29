//Sudoku Solver
public class Solution {
    public void solveSudoku(ArrayList<ArrayList<Character>> bo) {
        boolean row[][]=new boolean[10][10];
        boolean col[][]=new boolean[10][10];
        boolean box[][]=new boolean[10][10];
        char[][] board=new char[10][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=bo.get(i).get(j);
            }
        }
        for(int i=0;i<9;i++){
         for(int j=0;j<9;j++){
             if(board[i][j]!='.'){
                 row[i][board[i][j]-'0']=true;
                 col[j][board[i][j]-'0']=true;
                 int b=(i/3)*3 + (j/3);
                 box[b][board[i][j]-'0']=true;
             }
         }
     }
     dodfs(board,row,col,box,0,0);
     bo.clear();
     for(char[] c:board){
         ArrayList<Character> al=new ArrayList<>();
         for(char t:c){
             if(t==' ')
             continue;
             al.add(t);
         }
         bo.add(al);
     }
 }
    static boolean dodfs(char[][] board,boolean[][] row,boolean[][] col,boolean[][] box,int x,int y){
        if(x==8&&y==9)
            return true;
        else if(y==9){
            y=0;
            x+=1;
        }
        if(board[x][y]=='.'){
            for(int i=1;i<=9;i++){
                if(isvalid(row,col,box,i,x,y)){
                    row[x][i]=true;
                    col[y][i]=true;
                    int b=(x/3)*3+(y/3);
                    box[b][i]=true;
                    board[x][y]=(char)(i+'0');
                    if(dodfs(board,row,col,box,x,y+1))
                    {
                        return true;
                    }
                    board[x][y]='.';
                    row[x][i]=false;
                    col[y][i]=false;
                    box[b][i]=false;
                }
            }
        }
        else{
            return dodfs(board,row,col,box,x,y+1);
        }
        return false;
    }
    static boolean isvalid(boolean[][] row,boolean[][] col,boolean[][] box,int i,int x,int y){
        if(row[x][i]){
            return false;
        }
        if(col[y][i])
            return false;
        int b=(x/3)*3+(y/3);
        if(box[b][i]){
            return false;
        }
        return true;
    }
}