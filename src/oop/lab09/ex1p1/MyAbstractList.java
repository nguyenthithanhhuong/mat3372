package oop.lab09.ex1p1;

public abstract class MyAbstractList implements MyList {

    public MyAbstractList() {

    }
    void checkBoundaries(int index, int limit) {
        if(index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            sb.append(String.format("[%s]", this.get(i).toString()));
        }
        return sb.toString();
    }
}
