package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(this.tonerLevel>-1 && this.tonerLevel<=100){this.tonerLevel = tonerLevel;}else{this.tonerLevel = -1;}
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount <=100) {
            if (this.tonerLevel + tonerLevel > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            System.out.println("Printer toner has been filled to " + this.tonerLevel + "%");
            return this.tonerLevel;
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);}
        pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
