package LinkedList;
/*Напишите класс SortedIntegerList, который хранит отсортированный в порядке возрастания
список целых чисел. Внутри класса список должен храниться с помощью LinkedList.
У SortedInteger List должны быть определены:

Конструктор 	с булевским параметром; если этот параметр принимает значение true,
то в  создаваемом списке разрешены повторяющиеся элементы, иначе --- нет;
Методы add(int) и remove(int), которые, соответственно, добавляют число в список и удаляют
число из списка; если добавление (удаление) невозможно --- метод не делает ничего. Операции
добавления/удаления должны требовать не более чем одного прохода по списку;
Метод 	equals();
*/

public class SortedIntegerList extends LinkedList{

    protected boolean repeat;

    public SortedIntegerList (boolean flag) {
        this.repeat = flag;
        count = 0;
        this.head = null;
        this.prev = null;
    }

    public void add(int v) {
        if (head == null)
        {
            head = new Node(v);//если голова пустая создаем новый элемент
        }
        else
        {
            Node cur = head;
            if(cur.value > v) {
                pushFront(v);
                return;
            }
            while (cur.next != null) {

                if(!repeat && cur.next.value == v)
                    return;

                if (cur.value <= v && cur.next.value >= v) {
                    Node tmp = new Node(v);
                    tmp.next = cur.next;
                    tmp.prev = cur;
                    cur.next.prev = tmp;
                    cur.next = tmp;
                    return;
                }
                cur = cur.next;
            }
            cur.next = new Node(v);
            cur.next.prev = cur;
        }
        this.count++;
    }

    public final boolean equals(SortedIntegerList a) {
     if(this.count == a.count) {
         Node cur = head;
         Node cur2 = a.head;
         while (cur.next != null) {
             if (cur.value == cur2.value){
                 cur = cur.next;
                 cur2 = cur2.next;
             }
             else return false;
         }
         if (cur.value == cur2.value)
            return true;
         else return false;
     }
     else return false;
    }

}


