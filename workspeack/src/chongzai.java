public class chongzai {


    public String toString() {
        return "this";
    }
    public static void main(String[] args) {


        class zai{


            String name;
            public String chi(int a)
            {
                return  name+"能吃"+a+"斤屎";
            }
            public String chi(int... a)
            {
                return  name+"能吃"+a[1]+"斤水果";
            }

        }

      zai[] za=new zai[5];
      for(int i=0;i<za.length;i++)
      {
          za[i]=new zai();
      }
for(int i=0;i<za.length;i++)
{
     za[i].name="小明";
}
for(int i=0;i<za.length;i++)
{
  System.out.println(za[i].chi(10,20).toString());
}



    }





}
