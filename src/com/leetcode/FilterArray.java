package com.leetcode;

public class FilterArray {

	public static int isFilter(int [] a)
    {
        int result = 1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==9)
            {
                for(int j=0;j<a.length;j++)
                {
                    if(a[j]==11)
                    {
                        result = 1;
                        break;
                    }
                    else
                    {
                        result = 0;
                    }
                }
            }
            if(a[i]==7)
            {
                for(int j=0;j<a.length;j++)
                {
                    if(a[j]==13)
                    {
                        result = 0;
                        break;
                    }
                }
            }
        }
        return result;
}
}
