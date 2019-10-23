package behavioral.observer.learn7;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int state;
	public List<Observer> observers 
	= new ArrayList<>();
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
	//为被观察者的观察者列表添加观察者
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	
	
}
