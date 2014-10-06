package br.com.uaijug.develup.ej.item3;

public class SingletonStaticField {
	public static final SingletonStaticField INSTANCE = new SingletonStaticField();

	private static int count;

	private SingletonStaticField() {
		count++;
	}

	public static int getCount() {
		return count;
	}
}
