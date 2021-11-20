package com.geekbrains.hometask3.deque;

import com.geekbrains.hometask3.queue.MyQueue;

public interface MyDeque<E> extends MyQueue<E> {

    boolean insertLeft(E value);

    boolean insertRight(E value);

    E removeLeft();

    E removeRight();

}