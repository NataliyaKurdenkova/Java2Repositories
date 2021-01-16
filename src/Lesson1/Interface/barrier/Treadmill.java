package Lesson1.Interface.barrier;

import Lesson1.Interface.Barrier;
import Lesson1.Interface.Player;

public class Treadmill implements Barrier {
    public int getLength() {
        return length;
    }
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

 
}
