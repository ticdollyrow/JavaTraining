package Shildt.Chapter8;

//Динамическая очередь
public class DynQueue implements ICharQ{
    private char[] q;
    private int getloc, putloc;

    DynQueue(int size){
        putloc = getloc = 0;
        q = new char[size];
    }
    @Override
    public void put(char ch) {
        if(putloc == q.length){
            //Уведичение размера очереди
            char[] t = new char[q.length * 2];
            //копирование элементов в новую очередь
            int i= 0;
            for (char tmp:q) {
                t[i++] = tmp;
            }
            q = t;
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if(putloc == getloc)
        return (char)0;

        return q[getloc++];
    }
}
