package day28_ArrayList;

import java.util.* ;

public class DeliveryTask {

    public static int refuels(ArrayList<Integer> deliveries,int gasTank) {
        int deliver = 0 ;
        int tempIndex = 0 ;
        int stop = 0 ;
        int tempRemain;
        for(int i = 0 ; i<deliveries.size(); i++) {
            deliver = deliveries.get(i);
            if (deliver - gasTank > 0) {
                tempRemain = deliver - gasTank;
                tempIndex = i;
                deliveries.set(i, tempRemain);
                i--;
            }
            if (deliver - gasTank == 0) {
                tempRemain = deliver - gasTank;
                deliveries.set(i, tempRemain);
                stop++;
            }
            if (!(i == deliveries.size() - 1)) {
                if (deliver - gasTank <= 0) {
                    tempRemain = deliver + deliveries.get(i + 1) - gasTank;
                    deliveries.set(i + 1, tempRemain);
                    stop++;
                }


            }

        }
        return stop ;

    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

    }

}