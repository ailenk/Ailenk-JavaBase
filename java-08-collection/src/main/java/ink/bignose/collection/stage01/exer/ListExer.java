package ink.bignose.collection.stage01.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ailenk
 * @create 2016 下午 3:33
 */
public class ListExer {
    /*
    区分List中remove(int index)和remove(Object obj)
     */
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }

    private void updateList(List list) {
//        list.remove(2);
        list.remove(new Integer(2));
    }

}
