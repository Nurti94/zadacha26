package com.company;

public class Box <T>{

        private T ab;

        public static <T> Box<T> genericMethoh(T var){
            return new Box<T>(var);
        }



    @Override
    public String toString() {
        return "Box" +
                "ab=" + ab
               ;
    }

    public Box(T ab) {
        this.ab = ab;

    }
}

