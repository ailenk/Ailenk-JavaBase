package ink.bignose.clazz.stage04.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ailenk
 * @create 2016 上午 11:15
 */
public class SubOrder extends Order<Integer> {//SubOrder:不是泛型类


    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;

    }


}
