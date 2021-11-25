package LinkedList;

public class LinkedList extends Node {

    protected Node head;
    protected Node prev;
    protected int count;


    public LinkedList ()
    {
        count = 0;
        this.head = null;
        this.prev = null;
    }

    public int getSize() { return this.count; }
    public boolean isEmpty() { return head == null; }  // Проверка, пуст ли список

    public void pushBack(int v)
    {
        if (head == null)
        {
            head = new Node(v);//если голова пустая создаем новый элемент типа нод
        }
        else
        {
            Node cur = head;
            while (cur.next != null)
            {
                cur = cur.next;
            }
            cur.next = new Node(v);
            cur.next.prev = cur;
        }
        this.count++;
    }

    public void remove(int v) {

        Node cur = head;
        if(cur.value == v && cur.prev == null){
            head = cur.next;
            return;
        }
        while (cur.next != null)
        {
            if(cur.value == v) {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
            cur = cur.next;

        }
        if(cur.value == v)
            cur.prev.next = null;
    }

    public void pushFront(int v) {
        this.head = new Node(v, head);
        count++;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("List: ");
        Node cur = head;
        while (cur.next != null)
        {
            sb.append(cur.value);
            sb.append(" -> ");
            cur = cur.next;
        }
        sb.append(cur.value);
        String S = sb.toString();
        return S;

    }

}
