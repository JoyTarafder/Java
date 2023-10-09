package mainpkg;

import java.util.Random;

//class Matrix {
public class Matrix {
    //public int[][] vals;   //scope of vals: public
    //int[][] vals;   //scope of vals: package
    private int[][] vals;   //scope of vals: private
    public Matrix(){
        vals = null;
    }
    public Matrix(int r, int c){
        vals = new int[r][c];
        int i,j;
        for(i=0;i<vals.length;i++){
            for(j=0;j<vals[i].length;j++){
                vals[i][j]=0;
            }
        }
    } 
    public Matrix(int r, int c, int upper){
        vals = new int[r][c];
        Random rand = new Random();
        int i,j;
        for(i=0;i<vals.length;i++){
            for(j=0;j<vals[i].length;j++){
                vals[i][j] = rand.nextInt(upper);
            }
        }
    } 
    public String getStringEquivalentOfMatrix(){
        String str="";
        int i,j;
        for(i=0;i<vals.length;i++){
            for(j=0;j<vals[i].length;j++){
                str += vals[i][j]+" ";
            }
            str += "\n";
        }        
        return str;
    }

    public int[][] getVals() {
        return vals;
    }

    public void setVals(int[][] vals) {
        this.vals = vals;
    }

    @Override
    public String toString() {
        String str="";
        int i,j;
        //Integer k=45;
        for(i=0;i<vals.length;i++){
            for(j=0;j<vals[i].length;j++){
                str += vals[i][j]+" ";
            }
            str += "\n";
        }        
        return str;
    }
    
    public Matrix addMatrices(Matrix m){
        Matrix temp = null;
        if(this.vals.length == m.vals.length
                &&
           this.vals[0].length == m.vals[0].length
        ){
            temp = new Matrix(this.vals.length, this.vals[0].length );
            int i,j;
            for(i=0;i<this.vals.length;i++){
                for(j=0;j<m.vals[i].length;j++){
                    temp.vals[i][j] = this.vals[i][j] + m.vals[i][j];
                }
            }
            
        }
        return temp;
    }
    
    public void transposeMAtrix(){ 
        int[][] tempArr = 
                new int[this.vals[0].length][this.vals.length];
        int i,j;    // m1.vals is 5 X 6
            //for(i=0;i<m1.vals[0].length;i++){
        for(i=0;i<tempArr.length;i++){
            for(j=0;j<tempArr[i].length;j++){
                tempArr[i][j] = this.vals[j][i];
            }
        }
        this.vals = tempArr;  
    }
    
    public void setMatrixElement(int row, int col, int data)
    {
        this.vals[row][col] = data;
    }
    
}
