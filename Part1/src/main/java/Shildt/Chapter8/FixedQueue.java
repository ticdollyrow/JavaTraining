package Shildt.Chapter8;

import Shildt.Chapter9.QueueEmptyException;
import Shildt.Chapter9.QueueFullException;

public class FixedQueue implements ICharQ{
    private char[] q;
    private int getloc, putloc;

    // Создание пустой очереди заданного размера
     public FixedQueue ( int size) {
         q = new char[size]; // выделение памяти для очереди
         putloc = getloc = 0;
     }
    @Override
    public void put(char ch) throws QueueFullException {
        if( putloc == q.length){
            throw new QueueFullException(q.length);
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() throws QueueEmptyException {
         if(putloc == getloc)
            throw new QueueEmptyException();
         return q[getloc++];
    }
}
