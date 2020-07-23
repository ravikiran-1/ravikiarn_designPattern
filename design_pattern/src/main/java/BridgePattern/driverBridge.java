package BridgePattern;

public class driverBridge {
	public driverBridge() {
		System.out.println();
		System.out.println("BridgePattern");
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape blueCircle = new Circle(100,100, 10, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
	}
}
