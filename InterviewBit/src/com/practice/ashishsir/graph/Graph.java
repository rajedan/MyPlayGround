package com.practice.ashishsir.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Graph {
	/**
	 * Holds the nodes of this Graph
	 */
	HashMap<String, Vertex> nodes;

	/**
	 * Holds the edges of this Graph
	 */
	HashMap<Integer, Edge> edges;

	/**
	 * Creates a Graph with no vertex and edges
	 */
	public Graph() {
		nodes = new HashMap<>();
		edges = new HashMap<>();
	}

	public Graph(ArrayList<Vertex> pNodes) {
		nodes = new HashMap<>();
		edges = new HashMap<>();
		for (Vertex myNode : pNodes) {
			nodes.put(myNode.getLabel(), myNode);
		}
	}

	/**
	 * Adds an Edge into this Graph
	 * 
	 * @param pEdge
	 * @return true if edge gets added into Graph, false otherwise
	 */
	public boolean addEdge(Edge pEdge) {
		if (pEdge == null || pEdge.getOne() == null || pEdge.getTwo() == null) {
			return false;
		}
		if (pEdge.getOne().equals(pEdge.getTwo()) || edges.containsValue(pEdge)) {
			return false;
		}
		edges.put(pEdge.hashCode(), pEdge);
		pEdge.getOne().addEdge(pEdge);
		pEdge.getTwo().addEdge(pEdge);
		return true;
	}

	/**
	 * Add an edge into this Graph between pOne and pTwo Vertices
	 * 
	 * @param pOne
	 * @param pTwo
	 * @return true if edge gets added into Graph, false otherwise
	 */
	public boolean addEdge(Vertex pOne, Vertex pTwo) {
		Edge myEdge = new Edge(pOne, pTwo);
		return addEdge(myEdge);
	}

	/**
	 * Add an edge into this Graph between pOne and pTwo Vertices with edge
	 * weight pWeight
	 * 
	 * @param pOne
	 * @param pTwo
	 * @param pWeight
	 * @return true if edge gets added into Graph, false otherwise
	 */
	public boolean addEdge(Vertex pOne, Vertex pTwo, int pWeight) {
		Edge myEdge = new Edge(pOne, pTwo, pWeight);
		return addEdge(myEdge);
	}

	/**
	 * Removes an edge from this Graph
	 * 
	 * @param pEdge
	 * @return true if the edge gets removed, false otherwise
	 */
	public boolean removeEdge(Edge pEdge) {
		if (pEdge == null || !edges.containsKey(pEdge.hashCode())) {
			return false;
		}
		pEdge.getOne().removeEdge(pEdge);
		pEdge.getTwo().removeEdge(pEdge);
		edges.remove(pEdge.hashCode());
		return true;
	}

	/**
	 * Checks whether pVertex exist in this Graph
	 * 
	 * @param pVertex
	 * @return true if pVertex exist in this Graph, false otherwise
	 */
	public boolean containsVertex(Vertex pVertex) {
		return nodes.containsKey(pVertex.getLabel());
	}

	/**
	 * Checks whether pEdge exist in this Graph
	 * 
	 * @param pEdge
	 * @return true if pEdge exist in this Graph, false otherwise
	 */
	public boolean containsEdge(Edge pEdge) {
		return edges.containsKey(pEdge.hashCode());
	}

	/**
	 * Gives Vertex with label pLabel
	 * 
	 * @param pLabel
	 * @return
	 */
	public Vertex getVertex(String pLabel) {
		return nodes.get(pLabel);
	}

	/**
	 * Gives all the Nodes of this Graph
	 * 
	 * @return
	 */
	public Collection<Vertex> getNodes() {
		return nodes.values();
	}

	/**
	 * Gives all the edges of this Graph
	 * 
	 * @return
	 */
	public Collection<Edge> getEdges() {
		return edges.values();
	}

	/**
	 * Removes a Vertex from this Graph
	 * 
	 * @param pVertex
	 * @return
	 */
	public boolean removeVertex(Vertex pVertex) {
		if (!nodes.containsKey(pVertex.getLabel())) {
			return false;
		}
		List<Edge> myEdges = pVertex.getEdges();
		for (Edge myEdge : myEdges) {
			removeEdge(myEdge);
		}
		nodes.remove(pVertex.getLabel());
		return true;
	}
}