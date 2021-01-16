package Lesson1.Interface.player;
import Lesson1.Interface.Player;

public class Cat implements Player {
    private int maxRun;
    private int maxJump;
    private String name = "Cat";

    public int getIndex() {
        return index;
    }

    private static int ind = 0;
    private int index = ind++;

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public String getName() {
        return name;
    }
    public Cat(int lenght, int height) {
        this.maxRun = lenght;
        this.maxJump = height;
    }
    @Override
    public boolean jump(int height) {
        if (height<= maxJump) {
           
            return true;
        } else {
          
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun)            
            return true;
         else 
            return false;
        
    }
}
