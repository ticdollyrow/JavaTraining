package Shildt.Chapter8;

import Shildt.Chapter9.QueueEmptyException;
import Shildt.Chapter9.QueueFullException;

public interface ICharQ {
    void put(char ch) throws QueueFullException;
    char get( ) throws QueueEmptyException;
}
