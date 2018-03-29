/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.parrot.models.graph;

/**
 * @author Henry WU (wuheng@otcaix.iscas.ac.cn) 2018年3月28日
 * 
 */
public class Vertex implements Comparable<Vertex> {

	/**
	 * 节点名称(A,B,C,D)
	 */
	private final String name;

	/**
	 * 最短路径长度
	 */
	private int path;

	/**
	 * 节点是否已经出列(是否已经处理完毕)
	 */
	private boolean isMarked;

	public Vertex(String name) {
		this.name = name;
		this.path = Integer.MAX_VALUE; // 初始设置为无穷大
		this.setMarked(false);
	}

	public Vertex(String name, int path) {
		this.name = name;
		this.path = path;
		this.setMarked(false);
	}

	
	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public boolean isMarked() {
		return isMarked;
	}

	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}

	public int compareTo(Vertex o) {
		return o.path > path?-1:1;
	}

}
