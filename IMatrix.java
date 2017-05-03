package InterfaseS;

/** Интерфейс */

public interface IMatrix {
    public void setElement(int row1, int column1, int value);

    public int getElement(int row1, int column1);

    public IMatrix sum (IMatrix a);

    public IMatrix product(IMatrix a);

    public int getR();

    public int getC();
}
