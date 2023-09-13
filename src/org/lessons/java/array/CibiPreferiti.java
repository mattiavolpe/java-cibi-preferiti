package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] food = { "Pizza", "Sushi", "Arrosticini", "Lasagna", "Carbonara", "Crispy McBacon" };
		System.out.println("Your food chart is made of " + food.length + " elements");
		System.out.println("Your favorite food is " + food[0]);
		System.out.println("The last food in your chart is " + food[food.length - 1]);
		
		if (food.length % 2 == 0) {
			System.out.println("Your middle chart food is " + food[food.length / 2 - 1]);
		} else {
			System.out.println("Your middle chart food is " + food[(int) food.length / 2]);
		}
	}
}
