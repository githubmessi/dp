package runoob.designPattern.behavioral.b7.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = 
			new ArrayList<Observer>();
	private int state;
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	public void attach(Observer observer){
		this.observers.add(observer);
	}
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
