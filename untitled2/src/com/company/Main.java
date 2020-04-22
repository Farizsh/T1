package com.company;
import java.util.Scanner;



public class MetodeBinarySearching
{
    public static int[] data = null;
    public static int awal, tengah, akhir, temp, count;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Jumlah data : ");
        int jlh = scan.nextInt();


        data = new int[jlh];
        for(int x = 0; x  cari
            else if(data[tengah] > cari)
    {
        System.out.print(iterasi+"   ");
        System.out.print(awal+"   ");
        System.out.print(akhir+"   ");
        System.out.print(tengah+"   ");
        System.out.print(data[tengah]+"\n");
        akhir = tengah - 1;
    }


        if(temp != data[tengah])
            temp = data[tengah];
        else
            count++;


        if(count == 3)
            break;
    }


        if(temu == true)
        System.out.println("\nData "+cari+" ditemukan pada index ke-"+tengah+"\n"+
        "dan Iterasi ke-"+iterasi);

        else
                System.out.println("\nData "+cari+" tidak ditemukan");

}


    public static void sorting()
    {
        int temp = 0;
        for(int x = 0; x