package pl.dawidpalka;

import java.util.Scanner;

public class Sum {

    private int[] array = new int[3];
    private int sum = 0;

    public Sum(int[] array) {
        this.array = array;
    }

    public Sum() {
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            this.array[i] = s.nextInt();
        }
        this.sum();
    }

    private void sum () {
        for (int x: this.array) {
            if(x != 13){
                this.sum += x;
            }else{
                break;
            }
        }
    }

    public int getSum() {
        return this.sum;
    }


}
