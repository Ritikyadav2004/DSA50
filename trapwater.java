public class trapwater
{
    public static void main(String[] args)
    {
        int height[] = {3,1,2,4,0,1,3,2}; //non negative array
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int max=-1;
        for(int i=0;i<height.length;i++)
        {
        if(height[i]>max)
        {
            max=height[i];
        }
        left[i] = max;

        }
       
        max = -1;
         for(int i=height.length-1;i>=0;i--)
        {
        if(height[i]>max)
        {
            max=height[i];
        }
        right[i] = max;

        }
        //hi there
        //applying formula
        int trap_water=0;
        for(int j=0;j<height.length;j++)
        {
          trap_water+=Math.min(right[j],left[j])-height[j];

        }
        System.out.println("Traped Water:"+trap_water);
         
    }
}
