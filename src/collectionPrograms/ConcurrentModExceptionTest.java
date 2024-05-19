package collectionPrograms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModExceptionTest {

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("D");
            list.add("E");
            list.add("Z");
            list.add("L");
            list.add("F");


  //          for (String s : list) {
//                list.add("Z"); // we are modifying our collection during iteration
//                // that's why we got concurrentModificationException
   //             System.out.println("Print the value"+s);


                Iterator<String> itr = list.iterator();
                while (itr.hasNext()) {
                    String str = itr.next();
                    if (str.equals("A")) {
                        itr.remove();
                    }
                    //System.out.println(str);

                }
            System.out.println("Print elements  now "+list);
            }
        }
   //}





