package my.company;

import java.util.Scanner;

class myFirst
{
    static int maxIncSubarr(int a[], int n)
    {

        int pre[] = new int[n] ;
        int pos[] = new int[n] ;
        pre[0] = 1;
        pos[n - 1] = 1;
        int l = 0;

        for (int i = 1; i < n; i++)
        {
            if (a[i] > a[i - 1])
                pre[i] = pre[i - 1] + 1;
            else
                pre[i] = 1;
        }

        l = 1;
        for (int i = n - 2; i >= 0; i--)
        {
            if (a[i] < a[i + 1])
                pos[i] = pos[i + 1] + 1;
            else
                pos[i] = 1;
        }

        int ans = 0;
        l = 1;
        for (int i = 1; i < n; i++)
        {
            if (a[i] > a[i - 1])
                l++;
            else
                l = 1;
            ans = Math.max(ans, l);
        }

        for (int i = 1; i <= n - 2; i++)
        {
            if (a[i - 1] < a[i + 1])
                ans = Math.max(pre[i - 1] +
                        pos[i + 1], ans);
        }
        return ans;
    }

    public static void main (String[] args)
    {
        System.out.println("Enter num:");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter array list :");
            arr[i]=sc.nextInt();
        }



        System.out.println(maxIncSubarr(arr, n));
    }
}

