package com.bonaet;

public class FormOne implements SchoolForm{
public String label;
    public FormOne(String label) {
        this.label= label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void printFormLabel() {
        System.out.println("This is "+this.label);
    }

    @Override
    public String toString() {
        return "FormOne{" +
                "formLabel='" + label + '\'' +
                '}';
    }
}
