package main ;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Nhap");
            System.out.println("2. In");
            System.out.println("Lua chon: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    order.Nhap();
                    break;
                case 2:
                    order.in();
                    break;
                default:
            }
        }while(menu!=0);
    }
}
