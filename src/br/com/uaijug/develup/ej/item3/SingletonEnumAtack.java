package br.com.uaijug.develup.ej.item3;

import java.lang.reflect.Constructor;

public class SingletonEnumAtack {

	public static void main(String[] args) throws Exception {
		SingletonEnum instancia1 = SingletonEnum.INSTANCE;

		System.out.println("Instancias: " + SingletonEnum.getCount());

		//Exception in thread "main" java.lang.NoSuchMethodException: br.com.uaijug.develup.ej.item3.SingletonEnum.<init>()
		Constructor<SingletonEnum> construtor = SingletonEnum.class.getDeclaredConstructor();
	}
}
