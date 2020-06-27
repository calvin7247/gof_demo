public class PrinterProxy implements Printable{
    String name;
    Printer printer;

    PrinterProxy() {

    }

    PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if(printer != null) {
            printer.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String name) {
        realize();
        printer.print(name);
    }

    private synchronized void realize() {
        if (printer == null) {
            printer = new Printer();
        }
    }
}
