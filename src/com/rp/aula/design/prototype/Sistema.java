package com.rp.aula.design.prototype;

public class Sistema {

	public static void main(String[] args) throws Exception {
		Shape c1 = ShapeCache.getInstance().getShape("circle");
		System.out.println(c1);
		c1.draw();

		try {
			Class<Shape> clazz;
			clazz = (Class<Shape>) Class
					.forName("com.rp.aula.design.prototype.Circle");
			clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Circle c2 = (Circle) c1.clone();
			System.out.println(c2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
