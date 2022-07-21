import java.util.Arrays;


public class arrays {



    public static void main(String [] args) {
        int[] arr = new int[]{12, 32, 54, 68, 15};
        int[] arrr = new int[]{12, 32, 54, 68, 15};

        boolean isfase = Arrays.equals(arr, arrr);
        System.out.println(isfase);

        Arrays.fill(arr, 19);//将指定值填充到数组中
        System.out.println(Arrays.toString(arr));//输出数组信息


//        对数组进行排序
        Arrays.sort(arrr);
        System.out.println(Arrays.toString(arrr));
//二分查找搜索数组中的某个值的位置索引
        int index = Arrays.binarySearch(arrr, 68);
        if (index > 0)
        {
            System.out.println(index);
        }
        else
        {
            System.out.println("未找到该字符");
        }

    }
}
