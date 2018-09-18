package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] array = (T[]) new Object[0];

	public ArrayList() {

	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}

	public void add(T val) {
		T[] newArray = (T[]) new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[newArray.length - 1] = val;
		array = newArray;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[array.length + 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i < loc) {
				newArray[i] = array[i];
			} else if (i == loc) {
				newArray[loc] = val;
			} else {
				newArray[i] = array[i-1];
			}
		}
		array = newArray;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if (i == loc) {
				i++;
			}else {
				newArray[i] = array[i];
			}
		}
		array = newArray;
		//this isnt working
	}

	public boolean contains(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(val)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return array.length;
	}
}