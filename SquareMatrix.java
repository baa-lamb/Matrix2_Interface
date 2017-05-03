package InterfaseS;

/**Наследник обычной матрицы - квадратная матрица*/

public class SquareMatrix extends UsualMatrix implements IMatrix{

    public SquareMatrix(int size) {
        super(size, size);
        r = c = size;
        for(int i = 0; i < r; i++)
            for(int j = 0; j < r; j++)
                if(i == j)
                    array[i][j] = 1;
    }


    public SquareMatrix sum (SquareMatrix a) {
        if(r != a.r)
            return this;
        SquareMatrix res = new SquareMatrix(r);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                res.array[i][j] = a.array[i][j] + array[i][j];
            }
        }
        return res;
    }
}
