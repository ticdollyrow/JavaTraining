package Shildt.Chapter6;

public class Queue {
    private char q[] ; // массив для хранения элементов очереди
    private int putloc, getloc; //индексы для вставки и извлечения
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    Queue(Queue obj){
        putloc = obj.getPutloc();
        getloc = obj.getGetloc();
        q = new char[ obj.getQ().length];

        for (int i = 0; i < obj.q.length; i++) {
            q[i] = obj.q[i];
        }
    }

    Queue(char[] array){
        putloc = getloc = 0;
        q = new char[array.length];
        for(char tmp:array){
            put(tmp);
        }
    }

    public char[] getQ() {
        return q;
    }

    public int getPutloc(){
        return putloc;
    }

    public int getGetloc(){
        return getloc;
    }

    void put(char sign){
        if(q.length == putloc){
            return;
        }
        q[putloc++] = sign;
    }

    char get(){
        if(putloc == getloc){
            return (char) 0;
        }
        return q[getloc++];
    }
}
