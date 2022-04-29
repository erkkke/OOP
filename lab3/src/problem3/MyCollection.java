package problem3;

public interface MyCollection<E> {
	public void add(E o);
	public boolean remove(E o);
	public boolean contains(E o);
	public void addAll(MyCollection<E> o);
	public void replace(E oldObj, E newObj);
	public int size();
	public void print();
	public boolean isEmpty();
	public void clear();
}
