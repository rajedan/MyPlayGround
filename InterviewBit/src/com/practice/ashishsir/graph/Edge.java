package com.practice.ashishsir.graph;
/**
 * Represents an edge
 * @author rdansena
 *
 */
public class Edge implements Comparable<Edge>{
	Vertex one, two;
	int weight;

	/**
	 * Create an edge with pOne and pTwo Vertex. It denotes that this edge is
	 * between pOne and pTwo <br>
	 * default weight is 1
	 * 
	 * @param pOne
	 * @param pTwo
	 */
	public Edge(Vertex pOne, Vertex pTwo) {
		one = pOne;
		two = pTwo;
		weight = 1;
	}

	/**
	 * Create an edge with pOne and pTwo Vertex. It denotes that this edge is
	 * between pOne and pTwo and pWeight
	 * 
	 * @param pOne
	 * @param pTwo
	 */
	public Edge(Vertex pOne, Vertex pTwo, int pWeight) {
		one = pOne;
		two = pTwo;
		weight = pWeight;
	}

	/**
	 * Set the edge weight
	 * 
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * Get One Vertex
	 * 
	 * @return
	 */
	public Vertex getOne() {
		return one;
	}

	/**
	 * Get Two Vertex
	 * 
	 * @return
	 */
	public Vertex getTwo() {
		return two;
	}

	/**
	 * Get the weight of edge
	 * 
	 * @return
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Gets the neighbor of pVertex if it is one of it's Vertex else null
	 * 
	 * @param pVertex
	 * @return One if it is Two, Two if it is One, otherwise null
	 */
	public Vertex getNeighbor(Vertex pVertex) {
		if (pVertex.getLabel().equals(one.getLabel())) {
			return two;
		} else if (pVertex.getLabel().equals(two.getLabel())) {
			return one;
		} else {
			return null;
		}
	}

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Edge)) {
			return false;
		}
		Edge myEdge = (Edge) obj;
		return one.equals(myEdge.getOne()) && two.equals(myEdge.getTwo()) && weight==myEdge.getWeight();
	}
}
