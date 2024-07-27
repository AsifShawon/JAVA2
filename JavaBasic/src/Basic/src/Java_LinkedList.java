import java.util.*;

public class Java_LinkedList {
    public static void main(String[] args) {
        // arrayList declaration
        LinkedList<Integer> list1 = new LinkedList<>();

        // .add(value); - to add element at the end of the array list
        list1.add(5);
        list1.add(2);
        list1.add(6);
        list1.add(9);
        list1.add(2);

        // to print
        System.out.print("List1: ");
        for(int i=0; i<list1.size(); i++) {
            // .get(index); - to get the element at index value
            System.out.print(list1.get(i)+" ");
        }

        // .add(index,element); - to add element at index value
        list1.add(1,10);
        list1.add(3,12);

        list1.addFirst(222); // not available in ArrayList

        System.out.println("");
        System.out.print("List1(After edit): ");
        // after new add
        for(int i=0; i<list1.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }

        // creating another ArrayList
        ArrayList<Integer> list2 = new ArrayList<>(5);
        for(int i=0; i<5; i++) {
            list2.add(i+10);
        }

        // adding list2 with list1
        list1.addAll(list2); // we can also add the index of adding

        System.out.println("");
        System.out.print("After adding list2 with list1: ");
        // after adding list1 and list2
        for(int i=0; i<list1.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("");
//         .clear() - to delete all elements of the list

//         .contains(element) - to check whether the element is in the list or not
//        System.out.println("70 in the list1 : "+list1.contains(70));

        list1.addLast(111);
        System.out.println(list1); // print through toString()

        // .indexOf(element) - returns element index
    }
}
