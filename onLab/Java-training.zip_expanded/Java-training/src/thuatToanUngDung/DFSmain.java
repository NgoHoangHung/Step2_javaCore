import java.util.Queue;
package thuatToanUngDung;

public class DFSmain {
	static boolean[] bVisited= new boolean[1001];
	static boolean[] bMarked = new boolean[1001];
	
	public static void main(String[] args) {
		for(int i = 0; i<1001; i++) {
			bMarked[i] = false;
		}
		for(int i = 0; i<1001; i++) {
			bVisited[i] = false;
		}
	}
	
	public static void DFS(DFS Adj[],int u) {
		if(bMarked[u]) return;
		
		bMarked[u] = true;
		bVisited[u] = true;
		
		for(int i = 0; i< Adj[u].length)
	}
}
