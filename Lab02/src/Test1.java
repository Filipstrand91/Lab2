import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.*;

public class Test1 {
	public static void main(String[] args) {
		SimpleWindow window = new SimpleWindow(1000, 1000, "MoveSquareMoove");
		Square sq = new Square(250, 250, 100);
		sq.draw(window);
		while (true) {
			window.waitForMouseClick();
			sq.erase(window);
			window.waitForMouseClick();
			window.moveTo(window.getMouseX(), window.getMouseY());
			Square sq1 = new Square(window.getMouseX(), window.getMouseY(), 100);
			while (sq1.getSide() > 0) {
				sq1.draw(window);
				SimpleWindow.delay(10);
				sq1.erase(window);
				sq1.setSide(sq1.getSide() - 10);
			}

		}

	}

}
