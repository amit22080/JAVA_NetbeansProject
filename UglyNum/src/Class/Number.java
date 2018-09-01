package Class;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magix
 */
public class Number {
    
    //Main Method 
    //Just for Testing
    public static void main(String args[])
    {
        //creating a instance of number class
        Number num=new Number();
        System.out.println(String.valueOf(num.isOddSame(12132)));
    }
    
    //<editor-fold desc="UglyNum">
    public int[] uglyNumber(int n)
    {
        int[] uglyNum=new int[n];
        int added=0,num,i=1;
        while(added!=n)
        {
            num=i;
            while(num%2==0)
                num/=2;
            while(num%3==0)
                num/=3;
            while(num%5==0)
                num/=5;
            if(num==1)
            {
                uglyNum[added]=i;
                added++;
            }
            i++;
        }
        return uglyNum;
    }
    //</editor-fold>
    
    //<editor-fold desc="IntToWords">
    public String intToWords(int num)
    {
        //Creating a String array for storing all the words values of number 0 to 9
        String[] words={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int length=len(num);
        String toWords=new String();
        for(int i=0;i<length;i++)
            toWords+=words[valAt(num,i)];
        return toWords;
    }
    //</editor-fold>
    
    //<editor-fold desc="Same Values on Odd Places">
    public boolean isOddSame(int n)
    {
        int num=valAt(n,0);
        for(int i=2;i<len(n);i+=2)
            if(num!=valAt(n,i))
                return false;
        return true;
    }
    //</editor-fold>
    
    //<editor-fold desc="SupportingMethods">
    int pow(int n,int p)
    {
        int num=1;
        for(int i=1;i<=p;i++)
            num*=n;
        return num;
    }
    
    int valAt(int n,int p)
    {
        int l=len(n);
        int num=(n%pow(10,(l-p)))/pow(10,((l-p)-1));
        return num;
    }
    
    int len(int n)
    {
        int l=0;
        while(n!=0){
            n/=10;
            l++;
        }
        return l;
    }
    //</editor-fold>
}

