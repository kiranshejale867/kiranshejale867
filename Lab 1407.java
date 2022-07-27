1.

program to remove duplicates from ArrayList
  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
  

class A
{
    public static void main(String[] args)
    {
        
        List<Integer> list = new ArrayList<>(
            Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
           
        System.out.println("ArrayList with duplicates: "
                           + list);
  
        
        List<Integer> newList = list.stream()
                                      .distinct()
                                      .collect(Collectors.toList());
  
       
        System.out.println("ArrayList with duplicates removed: "
                           + newList);
    }
}


2.

Program to find common elements in array list

import java.util.ArrayList;
  
public class B {
  
    
    public static void main(String[] args)
    {  
        ArrayList<String>
            list1 = new ArrayList<String>();
        
        list1.add("Hii");
        list1.add("Gaurav");
        
        System.out.println("List1: "
                           + list1);
        
        ArrayList<String>
            list2 = new ArrayList<String>();
    
        list2.add("Hii");
        list2.add("Hello");
        list2.add("Gaurav");
        
        System.out.println("List2: "
                           + list2);
  
        list1.retainAll(list2);
       
        System.out.println("Common elements: "
                           + list1);
    }
}


3.

program to add data in first and last position in linked list

import java.util.LinkedList;

  public class C {

  public static void main(String[] args) {
  
     LinkedList<String> l_list = new LinkedList<String>();
  
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");

     System.out.println("Original linked list:" + l_list);    
  
    l_list.addFirst("White");
    l_list.addLast("Pink");

     System.out.println("Final linked list:" + l_list);  
 }
}
