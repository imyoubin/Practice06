package com.javaex.ex02;

public class Shape {
	
	private String fillcoler;
	private String linecoler;
	
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String fillcoler, String linecoler) {
		this.fillcoler = fillcoler;
		this.linecoler = linecoler;
		System.out.println("생성자 Shape(2) 실행");
	}

	public String getFillcoler() {
		return fillcoler;
	}

	public void setFillcoler(String fillcoler) {
		this.fillcoler = fillcoler;
	}

	public String getLinecoler() {
		return linecoler;
	}

	public void setLinecoler(String linecoler) {
		this.linecoler = linecoler;
	}

	@Override
	public String toString() {
		return "Shape [fillcoler=" + fillcoler + ", linecoler=" + linecoler + "]";
	}
	
	public void draw() {
		System.out.println(fillcoler+linecoler);
	}
}

