package com.linkedin.java.oop.shapes;

public class CallByValueAndModifyingObjects {

    public static void main(String[] args) {

        var modifier = new ValueModifier();
        int value = 42;

        modifier.increase(value);
        System.out.println(value);

        var wrappedValue = new ValueWrapper(42);
        modifier.increaseValue(wrappedValue);

        System.out.println(wrappedValue.value);

    }

    static class ValueModifier {

        void increase(int value) {
            value = value + 1;
        }

        void increaseValue(ValueWrapper value) {
            value.value = value.value + 1;
        }

    }

    static class ValueWrapper {

        public int value;

        public ValueWrapper(int value) {
            this.value = value;
        }

    }

}
