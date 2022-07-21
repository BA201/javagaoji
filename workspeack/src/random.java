public class random {

    public static void main(String[] args)
    {
        int[] arr=new int[10];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*(90))+10;
            System.out.println(arr[i]);
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println("最大值是"+max);

        int min=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];

            }

        } System.out.println("最小值是"+min);
        int sum=0;
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            k=i+1;
        }
        float avg=(float) sum/k;
        System.out.println("和是"+sum+"平均值是"+avg);


    }
}
