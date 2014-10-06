package br.com.uaijug.develup.ej.item3;

public enum SingletonEnum {
	INSTANCE (1);

	private static int count = 1;

	private int id;

	private SingletonEnum(int id) {

		//Cannot refer to the static enum field SingletonEnum.count within an initializer
		//count++;
		//this.id = count;
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return this.id;
	}
}
