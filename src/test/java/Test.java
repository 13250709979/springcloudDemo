import java.util.*;

public class Test {

    @org.junit.Test
    public void Testnn(){
        Queue queue=null;
        Queue<String> queue1=new LinkedList<String>();
        List<String> list=new LinkedList<String>();
        List<String> list1=new ArrayList<String>();
        Deque deque=null;
        System.out.println(queue1.size());
        for (int i=1;i<1000000;i++){
            queue1.add("dd");
        }
        System.out.println(queue1.size());

        System.out.println(queue1.size());
     }

}
