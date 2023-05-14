package Shildt.Chapter8;

public class FixedQueue implements ICharQ{
    private char[] q;
    private int getloc, putloc;

    // Создание пустой очереди заданного размера
     public FixedQueue ( int size) {
         q = new char[size]; // выделение памяти для очереди
         putloc = getloc = 0;
     }
    @Override
    public void put(char ch) {
        if( putloc == q.length){
            return;
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() {
         if(putloc == getloc)
            return (char) 0;
         return q[getloc++];
    }
}
