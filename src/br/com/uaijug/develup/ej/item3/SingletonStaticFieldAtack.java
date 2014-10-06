package br.com.uaijug.develup.ej.item3;

import java.lang.reflect.Constructor;

public class SingletonStaticFieldAtack {

	public static void main(String[] args) throws Exception {
		SingletonStaticField instancia1 = SingletonStaticField.INSTANCE;

		System.out.println("Instancias: " + SingletonStaticField.getCount());

		Constructor<SingletonStaticField> construtor = SingletonStaticField.class.getDeclaredConstructor();

		construtor.setAccessible(true);

		SingletonStaticField instancia2 = construtor.newInstance();

		System.out.println("Instancias: " + SingletonStaticField.getCount());

		System.out.println("Objetos são diferentes? " + (instancia1 != instancia2));
	}
}
