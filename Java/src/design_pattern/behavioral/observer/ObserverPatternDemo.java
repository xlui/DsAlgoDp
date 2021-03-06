package design_pattern.behavioral.observer;

import design_pattern.behavioral.observer.observer.BinaryObserver;
import design_pattern.behavioral.observer.observer.HexaObserver;
import design_pattern.behavioral.observer.observer.OctalObserver;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("Fist state change: 15");
		subject.setState(15);
		System.out.println("\nSecond state change: 10");
		subject.setState(10);
	}
}
