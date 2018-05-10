package graph;

import hellobeta.MyStack;

public class Graph {
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int maxsize;
	private int nVertex;
	
	
	public Graph() {
		vertexList = new Vertex[maxsize];
		this.adjMat = new int[maxsize][maxsize];
		for(int i = 0;i < maxsize ;i++) {
			for(int j = 0;j<maxsize;j++) {
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
	}
	
	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}
	
	public void addEdge(int start,int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public void displayVertex(int index) {
		System.out.println(vertexList[index].label);
	}
	
	public int getadjmatUnvisitedVertex(int v) {
		for(int i = 0;i < nVertex;i++) {
			if(adjMat[v][i]==1 && vertexList[i].wasVisited==false) {
				return i;
			}
		}
		return -1;
	}
	
	public void dfs() {
		
	}
}
