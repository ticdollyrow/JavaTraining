package Shildt.Chapter8;

import Shildt.Chapter9.QueueEmptyException;
import Shildt.Chapter9.QueueFullException;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q2 = new CircularQueue(5);
        DynQueue q3 = new DynQueue(5);
        ICharQ iq;

        char ch;
        int i;
        iq = q1;
        try {
            for(i = 0; i < 10; i++){
                iq.put((char)('A'+ i));
            }
        }catch (QueueFullException exp){
            System.out.println(exp);
        }

        try {
            for(i = 0; i < 10; i++ ){
                System.out.print(iq.get());
            }
        }catch (QueueEmptyException exp){
            System.out.println(exp);
        }

        System.out.println();

        iq = q2;
        try {
            for(i = 0; i < 10; i++){
                iq.put((char)('A'+ i));
            }
        }catch (QueueFullException exp){
            System.out.println(exp);
        }

        try{
            for(i = 0; i < 5; i++ ){
                System.out.print(iq.get());
            }
        }catch (QueueEmptyException exp){
            System.out.println(exp);
        }

        System.out.println();

        iq = q3;
        try {
            for(i = 0; i < 8; i++){
                iq.put((char)('A'+ i));
            }
        }catch (QueueFullException exp){
            System.out.println(exp);
        }

        try {
            for(i = 0; i < 8; i++ ){
                System.out.print(iq.get());
            }
        }catch (QueueEmptyException exp){
            System.out.println(exp);
        }

        System.out.println();
    }
}
