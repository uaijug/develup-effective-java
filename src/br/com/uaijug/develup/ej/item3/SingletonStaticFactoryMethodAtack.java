package br.com.uaijug.develup.ej.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SingletonStaticFactoryMethodAtack {

	public static void main(String[] args) throws Exception {
		SingletonStaticFactoryMethod instancia1 = SingletonStaticFactoryMethod.getInstance();

		System.out.println("Instancias: " + SingletonStaticFactoryMethod.getCount());
		System.out.println("Instancia retornada: " + instancia1.getId());

		Constructor<SingletonStaticFactoryMethod> construtor = SingletonStaticFactoryMethod.class.getDeclaredConstructor();

		construtor.setAccessible(true);

		SingletonStaticFactoryMethod instancia2 = construtor.newInstance();

		System.out.println("Instancias: " + SingletonStaticFactoryMethod.getCount());
		System.out.println("Instancia retornada: " + instancia2.getId());

		System.out.println("Objetos são diferentes? " + (instancia1 != instancia2));

		Field declaredField = SingletonStaticFactoryMethod.class.getDeclaredField("instance");
		declaredField.setAccessible(true);
		declaredField.set(instancia1, instancia2);

		instancia1 = SingletonStaticFactoryMethod.getInstance();

		System.out.println("Instancias: " + SingletonStaticFactoryMethod.getCount());
		System.out.println("Instancia retornada: " + instancia1.getId());
	}
}
