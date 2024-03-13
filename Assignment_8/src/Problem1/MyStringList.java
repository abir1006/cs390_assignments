package Problem1;

import Problem1.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author kush
 */
public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public MyStringList() {
        this.currentArray = new Person[INITIAL_LENGTH];
        this.numOfElements = 0;
    }

    public void add(Person s) {
        if (s == null) return;
        if (numOfElements == currentArray.length) {
            resize();
        }
        currentArray[numOfElements] = s;
        numOfElements = numOfElements + 1;

    }

    public Person get(int i) {
        if (i < 0 || i >= numOfElements) {
            return null;
        }
        return currentArray[i];
    }

    private void resize() {
        System.out.println("Resizing");
        int len = currentArray.length;
        int newLen = 2 * len;
        Person[] newArray = new Person[newLen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean isEmpty() {
        return (numOfElements == 0);
    }

    public boolean find(String s) {
        if (s == null) return false;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].getLast().equals(s))
                return true;
        }
        return false;
    }

    public void insert(Person s, int pos) {
        if (s == null) return;
        if (pos > numOfElements || pos < 0) return;
        if (numOfElements == currentArray.length)
            resize();
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = s;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
        ++numOfElements;
    }

    public boolean remove(Person s) {
        if (numOfElements == 0) return false;
        if (s == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements - 1; i++) {
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[numOfElements - 1] + "]");
        return sb.toString();
    }

    public int size(){
        return numOfElements;
    }
    public Object clone(){
        Person[] temp=Arrays.copyOf(currentArray,numOfElements);
        return temp;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Nur", "Abdoon", 41);
        Person p2 = new Person("Sarah", "Ms", 35);
        Person p3 = new Person("Tony", "Mr", 39);

        MyStringList list = new MyStringList();

        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.find("Nur");

        System.out.println(list);
    }
}
