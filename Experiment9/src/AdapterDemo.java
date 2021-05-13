/**
 * Window interface
 */
interface Window {
    /**
     * Open the window
     */
    public void open();

    /**
     * Close the window
     */
    public void close();

    /**
     * Activate the window
     */
    public void activated();

    /**
     * Iconified the window
     */
    public void iconified();

    /**
     * De-iconified the window
     */
    public void deiconified();
}

/**
 * Abstract class of the WindowAdapter
 * which gives the empty implementation of the Window interface
 */
abstract class WindowAdapter implements Window {
    public void open() {
    }

    public void close() {
    }

    public void activated() {
    }

    public void iconified() {
    }

    public void deiconified() {
    }

}

/**
 * Implementation of the Window
 */
class WindowImpl extends WindowAdapter {
    /**
     * Open the window and print "窗口打开" on the console
     */
    public void open() {
        System.out.println("窗口打开。");
    }

    /**
     * Close the window and print "窗口关闭" on the console
     */
    public void close() {
        System.out.println("窗口关闭。");
    }
};

/**
 * Main class of the program
 */
public class AdapterDemo {
    /**
     * Instantiate the WindowImpl and call the open close method
     * @param args
     */
    public static void main(String args[]) {
        Window win = new WindowImpl();
        win.open();
        win.close();
    }
};
