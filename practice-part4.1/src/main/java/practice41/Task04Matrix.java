package practice41;
import java.util.Arrays;
public class Task04Matrix {
 static class Matrix {
  private final double[][] values;
  Matrix(double[][] input){
   if(input==null||input.length==0||input[0].length==0)throw new IllegalArgumentException("Матрица не должна быть пустой");
   int cols=input[0].length;values=new double[input.length][cols];
   for(int r=0;r<input.length;r++){if(input[r].length!=cols)throw new IllegalArgumentException("Матрица должна быть прямоугольной");values[r]=Arrays.copyOf(input[r],cols);}
  }
  int rows(){return values.length;} int columns(){return values[0].length;}
  Matrix add(Matrix b){sameSize(b);double[][] out=new double[rows()][columns()];for(int r=0;r<rows();r++)for(int c=0;c<columns();c++)out[r][c]=values[r][c]+b.values[r][c];return new Matrix(out);}
  Matrix multiplyBy(double n){double[][] out=new double[rows()][columns()];for(int r=0;r<rows();r++)for(int c=0;c<columns();c++)out[r][c]=values[r][c]*n;return new Matrix(out);}
  Matrix multiply(Matrix b){if(columns()!=b.rows())throw new IllegalArgumentException("Размеры матриц несовместимы");double[][] out=new double[rows()][b.columns()];for(int r=0;r<rows();r++)for(int c=0;c<b.columns();c++)for(int k=0;k<columns();k++)out[r][c]+=values[r][k]*b.values[k][c];return new Matrix(out);}
  private void sameSize(Matrix b){if(rows()!=b.rows()||columns()!=b.columns())throw new IllegalArgumentException("Для сложения размеры матриц должны совпадать");}
  public String toString(){StringBuilder s=new StringBuilder();for(double[] row:values)s.append(Arrays.toString(row)).append(System.lineSeparator());return s.toString();}
 }
 public static void main(String[] args){Matrix a=new Matrix(new double[][]{{1,2},{3,4}}),b=new Matrix(new double[][]{{5,6},{7,8}});System.out.println("Сумма:\n"+a.add(b));System.out.println("Умножение на число:\n"+a.multiplyBy(2));System.out.println("Произведение матриц:\n"+a.multiply(b));}
}
