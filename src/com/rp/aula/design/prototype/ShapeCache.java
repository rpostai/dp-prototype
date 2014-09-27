package com.rp.aula.design.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

	private static ShapeCache CACHE;

	private Map<String, Shape> cache = new HashMap<String, Shape>();

	private ShapeCache() {

	}

	public static ShapeCache getInstance() {
		if (CACHE == null) {
			CACHE = new ShapeCache();

			CACHE.cache.put("circle", new Circle("Teste"));
			CACHE.cache.put("square", new Square());

		}
		return CACHE;
	}

	public Shape getShape(String type) {
		Shape s = CACHE.cache.get(type);
		if (s != null) {
			try {
				return (Shape) s.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
