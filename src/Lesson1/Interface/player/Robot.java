package Lesson1.Interface.player;

import Lesson1.Interface.Player;

public class Robot implements Player {
    private int maxRun;
    private int maxJump;
    private String name = "Robot";
    static int ind = 0;
    private int index = ind++;
    public int getIndex() {
        return index;
    }
    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public String getName() {
        return name;
    }

    public Robot(int lenght, int height) {
        this.maxRun = lenght;
        this.maxJump = height;
    }

    public boolean jump(int height) {
        if (height<= maxJump) {
           
            return true;
        } else {
          
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
           
            return true;
        } else {
           
            return false;
        }
    }
}
