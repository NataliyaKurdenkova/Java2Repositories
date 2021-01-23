package Lesson2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
    }

    public MyArrayDataException(String s) {
        super(s);
    }

    public int getI() {
        return i;
    }

    private int i;

    public int getJ() {
        return j;
    }

    private int j;

    public MyArrayDataException(String s,int i,int j) {
        super(s);
        this.i=i;
        this.j=j;
    }


}
