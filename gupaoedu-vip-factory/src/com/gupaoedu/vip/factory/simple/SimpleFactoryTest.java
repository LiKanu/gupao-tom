package com.gupaoedu.vip.factory.simple;

import com.gupaoedu.vip.factory.Car;

public class SimpleFactoryTest {
	
	// �򵥹���ģʽ
	// 1�������ߵ��ü򵥣�
	// 2��������������϶ȼ��ߣ���ͬ���͵Ĺ�������һ�����д����������ڸ��Ե�ά������չ��
	public static void main(String[] args) {
	
		//��߾������ǵ�������
		Car car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
		
	}
	
}