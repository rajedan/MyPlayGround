package com.practice.ashishsir.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Vertex
 * 
 * @author rdansena
 * 
 */
public class Vertex {
	private String label;
	private List<Edge> edges;
	private boolean visited;

	/**
	 * Create a Vertex with provided label and no edges and not-visited
	 * initially
	 * 
	 * @param pLabel
	 */
	public Vertex(String pLabel) {
		label = pLabel;
		edges = new ArrayList<Edge>();
		visited = false;
	}

	/**
	 * Add an edge into {@code List} of {@code Edge}
	 * 
	 * @param pEdge
	 */
	public void addEdge(Edge pEdge) {
		edges.add(pEdge);
	}

	/**
	 * Checks whether the Vertex contains the edge
	 * 
	 * @return true if this Vertex contains the rpovided edge, false otherwise
	 */
	public boolean hasEdge(Edge pEdge) {
		return edges.contains(pEdge);
	}

	/**
	 * Removes the pEdge from It's edge list
	 * 
	 * @param pEdge
	 */
	public void removeEdge(Edge pEdge) {
		edges.remove(pEdge);
	}

	/**
	 * Removes the index located edge from It's edge list
	 * 
	 * @param index
	 */
	public void removeEdge(int index) {
		edges.remove(index);
	}

	/**
	 * Get the total number of edges of this Vertex
	 * 
	 * @return
	 */
	public int getEdgeSize() {
		return edges.size();
	}

	/**
	 * Get the label of Vertex
	 * 
	 * @return
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Get all edges of this Vertex
	 * 
	 * @return
	 */
	public List<Edge> getEdges() {
		return edges;
	}

	/**
	 * Checks whether this Vertex is visited/traversed
	 * 
	 * @return true if this Vertex is visited/traversed, false otherwise
	 */
	public boolean isVisited() {
		return visited;
	}
}
