package io.serialization;

import java.io.Serializable;

public class Major implements Serializable {

    public Major(DEPART depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "Major{" +
                "depart=" + depart +
                '}';
    }

    enum DEPART {CS,BUSINESS, MATH}


    private DEPART depart;

}
