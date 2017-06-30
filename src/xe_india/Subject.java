package xe_india;

public interface Subject {
	public void addPerson(Observer o);
	public void removePerson(Observer o);
	public void notifyPerson();
}
