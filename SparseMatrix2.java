package InterfaseS;

import java.util.*;

/** Для разреженных матриц*/

public class SparseMatrix2 extends UsualMatrix implements IMatrix{
    //private int val = 0;
    private HashMap<Element, Integer> MyHashMap;

    public SparseMatrix2(int row, int column){
        super(row,column);
        MyHashMap = new HashMap<Element, Integer>();
    }

    @Override
    public void setElement(int row1, int column1, int value) {
        Element el = new Element(row1,column1);

        if(MyHashMap.get(el) != null)
            MyHashMap.remove(el);
        if(value != 0)
            MyHashMap.put(el, value);
    }

    //Element key : hashMap.keySet()


    @Override
    public int getElement(int row1, int column1) {
        Element el = new Element(row1,column1);
        if(MyHashMap.get(el) == null)
            return 0;
        return MyHashMap.get(el);

        /* for(Map.Entry<Element, Integer> entry: MyHashMap.entrySet()){
            el = entry.getKey();
            if(el.getX() == row1 && el.getY() == column1) {
                res = entry.getValue();
            }
        }*/
    }



}

