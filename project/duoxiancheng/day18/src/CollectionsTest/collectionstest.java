package CollectionsTest;


import org.junit.Test;

import java.util.*;

public class collectionstest {

    @Test

    public void CollectionsTest1()
    {

        Collection list=new ArrayList();
        list.add("王权利");
        list.add("niubi");
        list.add("666");
        System.out.println(list);
        List ls=(List)list;
     Collections.reverse(ls);//翻转数组。
        System.out.println(ls);
        Collections.shuffle(ls);//对List集合进行随机排序。
        System.out.println(ls);
        Collections.sort(ls);//根据元素的自然顺序，对指定List元素进行升序排序。
        System.out.println(ls);
        Collections.sort(ls ,new Comparator(){//根据Comparator产生的顺序，对List集合进行重新排序。
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        System.out.println(ls);
        Collections.swap(ls,1,2);
        System.out.println(ls);
        System.out.println(Collections.max(ls));//根据元素中的自然排序返回给定集合中的最大元素
        System.out.println(Collections.min(ls));
        System.out.println(Collections.frequency(ls, "王权利"));

            List ll=Arrays.asList(new Object[ls.size()]);
            Collections.copy(ll,ls);//将src中的元素复制到dest中。
        System.out.println(ll);
        Collections.synchronizedList(ll);



    }




}
