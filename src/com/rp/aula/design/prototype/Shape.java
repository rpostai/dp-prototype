package com.rp.aula.design.prototype;

public abstract class Shape implements Cloneable {

	abstract void draw();

	@Override
	public Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
