import org.junit.Test;

import java.util.*;

public class CollectionTest {




    @Test

    public void collectionTest()
    {

        //add(Object a)
        Collection  co=new ArrayList();
        co.add("wocao");
        co.add(123);//自动装箱。
        co.add(new Date());
        System.out.println(co.size());//获取添加元素的个数。
        System.out.println(co);



        Collection coo=new ArrayList();
        coo.add("我草你妈");
        coo.addAll(co); //将其他集合中的元素添加至此集合中。
        System.out.println(coo);
        System.out.println(coo.isEmpty());//判断集合是否为空。
//        coo.clear();//将当前集合清空。
        System.out.println(coo);


        //contains(Obj obj),判断当前集合中是否含有obj，我们在判断时会调用obj对象所在类的equals方法。
        // 所以说一般在使用add()方法添加元素师，如果是自定义类的话，我们都要去重写equals方法。不然默认方法是“==”
        System.out.println(coo.size());
        Boolean f=coo.contains("wocao");
        System.out.println(f);
        //containsAll(Collection collection):判断形参中的所有元素是否都存在当前集合中，
        System.out.println(coo.containsAll(co));


    }

    @Test
    public void retest()
    {
Collection t=new ArrayList();
t.add("ni");
t.add("bi");
t.add("wocao");
t.add("交集");

//remove(Object obj):从当前集合中移除obj元素，也会调用obj对象的equals方法先去查看有没有。
        System.out.println(t.remove("ni"));//true;
        System.out.println(t);

        //removeAll(Collection obj):相当于取了obj集合与当前集合的差集。从当前集合中移除obj集合的所有元素。
        Collection t1=new ArrayList();
        t1.addAll(t);
        t1.add("新的元素");

//        t1.removeAll(t);
        System.out.println(t1);

        //retain(Collection obj):交集，取出当前集合与obj集合相同的部分，并返回给当前集合。
        t1.retainAll(t);
        System.out.println(t1);
//equals(Obj obj):要想返回true，需要当前集合与形参集合的元素都相同，顺序也得相同。
    }



    @Test
    public void toArraylistTest()
    {
        //toArray():将集合转化为数组。
        Collection list=new ArrayList();
        list.add("wang");
        list.add("quan");
        list.toArray();
        System.out.println(Arrays.toString(   list.toArray()));
        //Arrays.asList():将数组转换为一个List类型的集合。
        System.out.println(Arrays.asList(new int[]{123, 345}));//看成是一个元素。
        System.out.println(Arrays.asList(new Integer[]{123, 345}));//看成是两个元素。
        System.out.println(Arrays.asList(123, 345));//看成两个元素。


    }

    @Test
    public void iteratortest()
    {
        //Iterator:迭代器遍历集合。
        Collection list=new ArrayList();
        list.add("王权利");
        list.add("牛逼");
        list.add(666);

       Iterator it= list.iterator();

while(it.hasNext())
{
    Object tt=it.next();
    if("王权利".equals(tt))
        it.remove();

}

Iterator gg=list.iterator();
while(gg.hasNext())
{
    System.out.println(gg.next());
}

LinkedList list1=new LinkedList();
list1.add("diekdi");


    }

    @Test

    public void bianlitest()
    {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("wangquanli");
        for(Object obj: list)
        {
            System.out.println(obj);//增强for循环。
        }

        System.out.println(list);
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }







}
