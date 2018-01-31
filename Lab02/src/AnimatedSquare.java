import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.*;

public class AnimatedSquare {
	static void main(String[] args) {
		SimpleWindow window = new SimpleWindow(1000, 1000, "AnimatedSquare");
		Square sq = new Square(250, 250, 100);
		sq.draw(window);
		while (true) {
			window.waitForMouseClick();
			sq.erase(window);
			window.waitForMouseClick();
			window.moveTo(window.getMouseX(), window.getMouseY());
			Square sq1 = new Square(window.getMouseX(), window.getMouseY(), 100);
			sq1.draw(window);

		}
	}
}
// Gå till Test1 varför kan jag inte köra denna?