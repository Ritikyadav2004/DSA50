public class Permutation_of_String
{

    public static void swap(char[] str , int i,int j)
    {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    } 

    public static void permute(char[] str,int l,int r) // taking left =0; and right most value 
    {
       if(l==r)
       {
        System.out.print(String.valueOf(str)+" ");
       }
       else
       {
        for(int i=l;i<r;i++)
        {
            swap(str,l,i);
            permute(str, l+1, r);
            swap(str, l, i);  // back tracking or regenration of tree
        }
       }
    }
    public static void main(String[] args) 
    {
        String str1 ="ABC";
        char[] chararry = str1.toCharArray();
        permute(chararry, 0, chararry.length);
        

    }
}