package general;

import java.util.Scanner;

public class SearchMatrix { // search element in sorted matrix

    public static void searchelememt(int arr[][],int m,int n,int item) {

        int min = arr[0][0];
        int max = arr[m - 1][n - 1];
        if (item < min || item > max) {
            System.out.print("item Not Found");
            return;
         }
        else{
            int i=0,j=n-1;
            while(i<m && j>=0){
                int cur=arr[i][j];
                if(cur==item)
                {
                    System.out.println("Item Found At index (i,j)=="+'('+i+','+j+')');
                    return;
                }
                else{
                    if(item>cur)
                         i++;
                    else
                        j--;
                }

            }

        }
    }
    public static void main(String args[]){
      int sorted_matrix[][]={{10,20,30},{40,50,60},{70,80,90}};

        //   int m,n;
//        Scanner sc=new Scanner(System.in);
//        m=sc.nextInt();
//        n=sc.nextInt();
       // int sorted_matrix[][]=new int[m][n];
//        for(int i=0;i<m;i++){
//
//            for(int j=0;j<n;j++)
//            {
//                sorted_matrix[i][j]=sc.nextInt();
//            }
//        }
       int searchitem=10;

        searchelememt(sorted_matrix,3,3,searchitem);


    }


}
