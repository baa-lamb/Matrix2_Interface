package InterfaseS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/** Для разреженных матриц*/

public class SparseMatrix extends UsualMatrix implements IMatrix{
    private int sizeX = 0;
    private int sizeY = 0;
    private LinkedList<ElementMatrix> MyList;

    public SparseMatrix(int row, int column){
        super(row,column);
        MyList = new LinkedList<ElementMatrix>();
        sizeX = row;
        sizeY = column;
    }

    @Override
    public void setElement(int row1, int column1, int value) {
       ElementMatrix el = new ElementMatrix(row1,column1,value);

        Iterator<ElementMatrix> it = MyList.listIterator();
        while (it.hasNext()) {
            ElementMatrix i = it.next();
            if(i.getY() == el.getY() && i.getX() == el.getX()){
                it.remove();
            }
        }
        if(value != 0)
            MyList.add(el);
    }

    @Override
    public int getElement(int row1, int column1) {
        for(ElementMatrix i : MyList) {
            if(i.getX() == row1 && i.getY() == column1)
                return i.getValue();
        }
        return 0;
    }

    /*public String toString(){
        StringBuilder str = new StringBuilder();
        ListIterator<ElementMatrix> listIter = MyList.listIterator();
        for(int k = 0; k < sizeX; k++){
            for(int j = 0; j < sizeY; j++){
                str.append(this.getElement(k,j) + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public boolean equal(Object obj)
    {
        if(!(obj instanceof UsualMatrix)) //this.getClass() != obj.getClass()
            return false;

        SparseMatrix o = (SparseMatrix) obj;
        if(MyList.size() != o.MyList.size())
            return false;

        ListIterator<ElementMatrix> listIter1 = MyList.listIterator();
        ListIterator<ElementMatrix> listIter2 = o.MyList.listIterator();
        while(listIter1.hasNext() && listIter2.hasNext()){
            if(listIter1.next() != listIter2.next()){
                return false;
            }
        }
        return true;
    }*/

}
