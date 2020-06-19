package HelloWorld;

import java.util.ArrayList;
import java.util.Objects;

public class HelloWorld2<E> {
	public int getT1() {
		return t1;
	}

	public void setT1(int t1) {
		this.t1 = t1;
	}

	public int getT2() {
		return t2;
	}

	public void setT2(int t2) {
		this.t2 = t2;
	}

	private int t1;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HelloWorld2 [t1=");
		builder.append(t1);
		builder.append(", t2=");
		builder.append(t2);
		builder.append("]");
		return builder.toString();
	}

	private int t2;

	private ArrayList<E> myArray;

	/**
	 * @return the myArray
	 */
	public ArrayList<E> getMyArray() {
		return myArray;
	}

	/**
	 * @param myArray the myArray to set
	 */
	public void setMyArray(ArrayList<E> myArray) {
		this.myArray = myArray;
	}

	@Override
	public int hashCode() {
		return Objects.hash(t1, t2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HelloWorld2)) {
			return false;
		}
		HelloWorld2 other = (HelloWorld2) obj;
		return t1 == other.t1 && t2 == other.t2;
	}

	public HelloWorld2(int t1, int t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	/**
	 * @param t1
	 * @param t2
	 * @param myArray
	 */
	public HelloWorld2(int t1, int t2, ArrayList<E> myArray) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.myArray = myArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int a = 10;
		int j = 10;
		System.out.println("Hello world!");
		System.out.println("Hello world 2");
	}

}
