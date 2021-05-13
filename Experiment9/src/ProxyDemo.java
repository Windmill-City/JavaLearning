/**
 * Interface Network, subclass of it can browse the things on the internet
 */
interface Network {
    public void browse();
}

/**
 * Class Real, implementation of the Network
 */
class Real implements Network {
    /**
     * Implementation of the browse
     */
    public void browse() {
        System.out.println("上网浏览信息");
    }
}

/**
 * Implementation of the Network, a proxy class of the Network object
 */
class Proxy implements Network {
    private Network network;

    /**
     * Construct the Proxy by a network object which we want to proxy
     * @param network
     */
    public Proxy(Network network) {
        this.network = network;
    }

    /**
     * Check if the user valid
     */
    public void check() {
        System.out.println("检查用户是否合法。");
    }

    /**
     * Proxy the access to the browse
     * we check the validation of the user first
     * and do browse afterword
     */
    public void browse() {
        this.check();
        this.network.browse();
    }
}

/**
 * Main class of the program
 */
public class ProxyDemo {
    /**
     * Construct a Network obj and proxy it with a Proxy
     * @param args
     */
    public static void main(String args[]) {
        Network net = null;
        net = new Proxy(new Real());

        net.browse();
    }
}

