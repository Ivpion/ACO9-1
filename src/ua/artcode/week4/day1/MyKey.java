package ua.artcode.week4.day1;

import java.util.Arrays;

// Immutable
public class MyKey implements Cloneable {

    private final char[] mas;

    // varargs -
    public MyKey(char...elements) {
        // mas = new int[elements.length];
        //System.arraycopy(elements, 0, mas, 0, elements.length);
        mas = Arrays.copyOf(elements, elements.length);
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != MyKey.class) {
            return false;
        }

        MyKey other = (MyKey) obj;

        return Arrays.equals(this.mas, other.mas);

    }


    public Object clone() {
        char[] elCopy = Arrays.copyOf(mas, mas.length);
        MyKey cloned = new MyKey(elCopy);
        return cloned;
    }

}
