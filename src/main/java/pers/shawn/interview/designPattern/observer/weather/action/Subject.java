package pers.shawn.interview.designPattern.observer.weather.action;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
