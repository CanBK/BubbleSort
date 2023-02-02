/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugaskelompok;

import java.util.Scanner;

/**
 *
 * @author lab_mi
 */
public class TugasKelompok {

    void bubbleSort(int arr[], String tipe)
    {
         int n = arr.length;  
        int temp = 0;  
        for (int i = 0; i < n ; i++){
            System.out.println("\nPass "+(i+1));
            printArray(arr);
            for(int j=1; j < (n-i); j++){  
                
                
                if(tipe.equals("Asc")){
                    if(arr[j-1] > arr[j]){  
                        //swap elements  
                        temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;  
                    }
                }else{
                    if(arr[j-1] < arr[j]){  
                        //swap elements  
                        temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;  
                    }
                }
                printArray(arr);
                      
            }
            System.out.println("\nResult of Pass " +(i+1));
            printArray(arr);
        }
                
    }
    
    public int[] randomData(int bawah, int atas){
    
        int[] tempArr = new int[5];
        for(int i=0;i<5;i++){
            tempArr[i] = (int)(Math.random()*(atas-bawah))+bawah;
            System.out.print(tempArr[i]+" ");
        }
        return tempArr;
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    void sortAcs(int arr[], String tipe)
    {
        int n = arr.length;
        printArray(arr);
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            
            // Find the minimum element in unsorted array
            int min_idx = i;
            if(tipe.equals("Asc")){
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;
            }else{
                for (int j = i+1; j < n; j++)
                    if (arr[j] > arr[min_idx])
                        min_idx = j;
            }
            
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            System.out.println("Result Pass "+(i+1));
            printArray(arr);
        }
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        TugasKelompok ob = new TugasKelompok();
//        int arr[] = { 5, 1, 4, 2, 8 };
//        ob.bubbleSort(arr);
//        System.out.println("Sorted array");
//        ob.printArray(arr);
        int pilihan = 0;
//        int arrAngka[] = new int[5];
        int arrAngka[] = {273, 84, 122, 260, 169};
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSelamat Datang di Program Simulasi");
        do{
           
            System.out.println("\nMenu");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan Anda :  ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Batas Bawah :");
                    int bawah = scanner.nextInt();
                    System.out.print("Batas Atas :");
                    int atas = scanner.nextInt();
                    arrAngka = ob.randomData(bawah, atas);
                    break;
                case 2:
                    ob.bubbleSort(arrAngka,"Asc");
                    break;
                case 3:
                    ob.sortAcs(arrAngka,"Asc");
                    break;
                case 4:
                    ob.bubbleSort(arrAngka,"Desc");
                    break;
                case 5:
                    ob.sortAcs(arrAngka,"Desc");
                    break;
                default:
                    throw new AssertionError();
            }
        }while(pilihan!=6);
       
        
    }
}
