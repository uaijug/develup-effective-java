package br.com.uaijug.develup.ej.item3;

public class SingletonStaticFactoryMethod {

	private static SingletonStaticFactoryMethod instance;
	private static int count;

	private int id;

	private SingletonStaticFactoryMethod() {
		count++;
		this.id = count;
	}

	public static SingletonStaticFactoryMethod getInstance() {
		if(instance == null) {
			instance = new SingletonStaticFactoryMethod();
		}

		return instance;
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return this.id;
	}
}
