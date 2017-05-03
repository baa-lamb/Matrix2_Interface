package InterfaseS;

/**
 * Created by Алена on 05.04.2017.
 */
public class Element {
    private int x = 0;
    private int y = 0;

    public Element(int x1, int y1){ x = x1; y = y1; }

    int getX(){ return x; }
    int getY(){ return y; }

    void setX(int x1) { x = x1; }
    void setY(int x1) { y = x1; }

    public int hashCode() {
        int result = 0;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
   }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Element o = (Element) obj;
        if (x != o.x)
            return false;
        if (y != o.y)
            return false;
        return true;
    }
}


/*Есть массив Entry[] из 16 ячеек с именем table;
В этом массиве хранятся объекты класса Entry. У класса HashMap есть внутренний класс — Entry.
 И экземплярами этого класса являются пары ключ-значение. Давайте взглянем на структуру класса Entry:
static class Entry implements Map.Entry
        {
                final K key;
                V value;
                Entry next;
                final int hash;
                ...//продолжение кода
        }
Каждый раз когда мы пытаемся создать пару ключ-значение в хэш-карте, для этой пары создается объект класса Entry,
и он будет храниться в указанной выше таблице Entry[]. А теперь вам должно быть интересно,
куда именно в этой таблице будет записан этот объект (в какую ячейку).
Для ключа из пары ключ-значение высчитывается хэш-код с помощью метода hashcode().
 И этот хэш-код используется для вычисления номера ячейки таблицы Entry[];
Теперь, если вы взгляните на ячейку 10 таблицы, вы увидите объект класса Entry с именем HashMap$Entry;
Мы добавили 4 пары ключ-значение, но в массиве только 2!!! Это потому что, если 2 объекта имеют одинаковый хэш-код,
то они будут храниться в одной ячейке. Но как? Объекты будут храниться в виде связного списка (LinkedList).
*/