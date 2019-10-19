package project.interfaces;

public interface Subordinate<T> {
    public void addSubordinate(T subordinate);
    public void removeSubordinate(T subordinate);
}
