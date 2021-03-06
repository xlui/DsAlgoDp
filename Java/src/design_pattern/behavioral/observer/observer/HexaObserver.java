package design_pattern.behavioral.observer.observer;

import design_pattern.behavioral.observer.Subject;

public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
	}
}
