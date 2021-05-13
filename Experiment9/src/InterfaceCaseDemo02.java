/**
 * Interface USB
 * with two method start() and stop()
 */
interface USB {
    public void start();

    public void stop();
}

/**
 * Computer class which can use the USB object
 */
class Computer {
    /**
     * Accept the object USB and make it work and stop
     *
     * @param usb the obj to be use
     */
    public static void plugin(USB usb) {
        usb.start();
        System.out.println("=========== USB 设备工作 ========");
        usb.stop();
    }
}

/**
 * Device Flash, implementation of the USB
 * which means it can be use as a USB device
 */
class Flash implements USB {
    public void start() {
        System.out.println("U盘开始工作。");
    }

    public void stop() {
        System.out.println("U盘停止工作。");
    }
}

/**
 * Device Print, implementation of the USB
 * which means it can be use as a USB device
 */
class Print implements USB {
    public void start() {
        System.out.println("打印机开始工作。");
    }

    public void stop() {
        System.out.println("打印机停止工作。");
    }
}

/**
 * Main class of the program
 */
public class InterfaceCaseDemo02 {
    /**
     * Let the Computer to use the Flash and Print
     * @param args
     */
    public static void main(String args[]) {
        Computer.plugin(new Flash());
        Computer.plugin(new Print());
    }
}
