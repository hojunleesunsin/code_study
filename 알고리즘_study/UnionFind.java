public class UnionFind {
    static int[] parent;

    public static boolean union(int a, int b) {
        a = find(a); 
        b = find(b); 

        if(a == b) return false;
        else parent[b] = a;
        return true;
    }

    public static int find(int a) {
        if(parent[a] == a) return a;
        return find(parent[a]);
    }

    // parent 출력
	public static void print() {
		for (int i = 1; i < parent.length; i++) {
			System.out.print(parent[i]+ " ");
		}
		System.out.println();
	}

    public static void main(String[] args) {
        int n = 5;
        parent = new int[n + 1];

        for(int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

		union(1, 2);
		print();
		union(3, 4);
		print();
		union(3, 5);
		print();
		System.out.println("find(2): " + find(2));
		System.out.println("find(4): " + find(4));
		union(2, 4);
		print();
		System.out.println("find(4): " + find(4));
    }
}
