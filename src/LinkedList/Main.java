package LinkedList;

public class Main {

    public static void main(String[] args) {

        SortedIntegerList one = new SortedIntegerList(false);
        one.add(1);
        one.add(5);

        SortedIntegerList two = new SortedIntegerList(true);
        two.add(1);
        two.add(2);
        two.add(0);
        two.add(-7);
        two.add(-1);
        two.add(93);
        System.out.println(two);
        two.remove(5);
        System.out.println(two);


        //System.out.println(one.equals(two));



    }

}
