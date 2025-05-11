public class Sort_0_1_2
{
    public static void main(String[] args) {
        int [] arr = { 0,1,2,1,2,0,1,0,2,0,1,3};
        int count0=0;
        int count1=0;
        int count2=0;
        int [] aux = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {   switch(arr[i])
            {
                case 0:
                count0++;
                break;
                case 1:
                count1++;
                break;
                default:
                count2++;
                break;

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<count0)
            {
            aux[i] = 0;
            }
            else if(i<(count0+count1) && i>=count0)
            {
                aux[i] = 1;
            }
            else if(i<(count0+count1+count2) && i>=(count0+count1))
            {
                aux[i] = 2;
            }
            
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(aux[j]+" ");
        }

    }
}