object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        var proxy = PrinterProxy("Alice")
        println(proxy.printerName)
        proxy.printerName = "vvv"
        println(proxy.printerName)
        proxy.print("hello world")
    }
}