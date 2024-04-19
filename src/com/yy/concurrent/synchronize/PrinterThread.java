package com.yy.concurrent.synchronize;

/**
 * @date 2024/4/17
 */
public class PrinterThread extends Thread {

    private Printer printer;

    public PrinterThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print();
    }
}

class TestPrinterThread{
    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer printer1 = new Printer();
        PrinterThread printerThread01 = new PrinterThread(printer);
        PrinterThread printerThread02 = new PrinterThread(printer1);
        printerThread01.start();
        printerThread02.start();
    }
}
