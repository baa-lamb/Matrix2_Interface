package InterfaseS;

public class ElementMatrix {
    private int x = 0;
    private int y = 0;
    private int value = 0;

    public ElementMatrix(int x1, int y1, int val){ x = x1; y = y1; value = val;}

    int getX(){ return x; }
    int getY(){ return y; }
    int getValue(){ return value; }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Element o = (Element) obj;
        if (x != o.getX())
            return false;
        if (y != o.getY())
            return false;
        return true;
    }

    /*void setX(int x1) { x = x1; }
    void setY(int x1) { y = x1; }
    void setValue(int x1) { value = x1; }*/
}
