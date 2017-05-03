package InterfaseS;

/** Обычная матрица */

public class UsualMatrix implements IMatrix{
    protected int [][] array;
    protected int r = 0;
    protected int c = 0;

    public UsualMatrix(int row1, int column1) {
        array = new int [row1][column1];
        r = row1; c = column1;
        for(int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                array[i][j] = 0;
    }

    public IMatrix sum (IMatrix a) {
        if(r == a.getR() && c == a.getC()) {
            IMatrix res = new UsualMatrix(r, c);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int tmp = a.getElement(i,j) + this.getElement(i,j);
                    res.setElement(i, j, tmp);
                }
            }
            return res;
        }
        return null;
    }

    public IMatrix product(IMatrix a) {
        if(c == a.getR()) {
            IMatrix res = new UsualMatrix(r, a.getC());
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < a.getC(); j++) {
                    res.setElement(i, j, 0);
                    for (int k = 0; k < c; k++) {
                        res.setElement(i, j, res.getElement(i, j) + (this.getElement(i, k) * a.getElement(k, j)));
                    }
                }
            }
            return res;
        }
        return null;
    }

    @Override
    public int getR() { return r; }

    @Override
    public int getC() {
        return c;
    }

    public void setElement(int row1, int column1, int value){
            array[row1][column1] = value;
    }

    public int getElement(int row1, int column1){ return array[row1][column1];
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                res.append(" ").append(getElement(i,j));
            res.append("\n");
        }
        return  res.toString();
    }

    public boolean equals(Object obj) {
        boolean res = false;

        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!( obj instanceof IMatrix))
            return false;

        IMatrix a = (IMatrix) obj;
        if (r != a.getR() || c != a.getC())
            return false;
        int flag = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (this.getElement(i, j) != a.getElement(i, j))
                    flag++;
            }
        }
        if (flag == 0)
            res = true;
        return res;
    }
}
