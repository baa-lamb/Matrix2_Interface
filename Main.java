import InterfaseS.*;

/**
 * Created by Алена on 02.04.2017.
 */
public class Main {
    public static void main(String argc[]){

        long time2 = System.currentTimeMillis();
        IMatrix m1 = new UsualMatrix(1000,1000);
        IMatrix m2 = new UsualMatrix(1000,1000);

        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                m1.setElement(i,j,i+j*3);
                m2.setElement(i,j,i+j*3);
            }
        }

        m1 = m1.product(m2);
       // System.out.println(m1);
        long t = System.currentTimeMillis();
        time2 = t - time2;
        System.out.println("______TIME TO PRODUCT SPARSEMATRIXES:_______" + time2 + "\n");

        long time1 = System.currentTimeMillis();
        IMatrix  a1 = new SparseMatrix2(1000,1000);
        IMatrix  a2 = new SparseMatrix2(1000,1000);

        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                a1.setElement(i,j,i+j*3);
                a2.setElement(i,j,i+j*3);
            }
        }
        a1 = a1.product(a2);
        //System.out.println(a1);
        long s = System.currentTimeMillis();
        time1 = s - time1;
        System.out.println("______TIME TO PRODUCT SPARSEMATRIXES2:_______" + time1 + "\n");

        if(a1.equals(m1))
            System.out.println(1);
        else
            System.out.println(0);


        /*a.setElement(1,1,5);
        System.out.println(a);
        IMatrix b = new SquareMatrix(3);
        System.out.println(b);
        IMatrix c = new SparseMatrix(3,2);
        c.setElement(1,1,5);
        //c.setElement(2,1,3);
        System.out.println(c);

        if(a.equals(c))
            System.out.println(1);
        else
            System.out.println(0);

        System.out.println(c.sum(a));*/


    }
}
