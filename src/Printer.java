public class Printer implements Printable{
    String name;

    Printer() {
        heavyJob("instance is initialized");
    }

    Printer(String name) {
        this.name = name;
        heavyJob("instance is initialized with name: " + name);
    }

    @Override
    public void setPrinterName(String name) {

    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String name) {
        System.out.println(name);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for(int i =0; i<5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("ending");
    }
}
