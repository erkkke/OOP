package problem3;

public interface MyCollection<E> {
	public void add(E o);
	public Object find(E o);
	public boolean remove(E o);
	public int size();
	public void print();
	public boolean isEmpty();
	public void clear();
}
