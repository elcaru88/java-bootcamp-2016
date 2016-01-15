package proxyconnection;

public class SlowConnection extends ProxyConnection {

    public SlowConnection() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
