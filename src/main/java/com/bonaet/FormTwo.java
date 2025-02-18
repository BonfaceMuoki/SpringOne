package com.bonaet;

public class FormTwo implements SchoolForm{
    String label;
    public FormTwo() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public FormTwo(String label) {
        this.label = label;
    }

    @Override
    public void printFormLabel() {
         System.out.println("This is "+this.label);
    }
}
