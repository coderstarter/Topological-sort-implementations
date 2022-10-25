 static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int ans[] = new int[V];
        Stack<Integer> st = new Stack<Integer>();
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                dfs(i,st,vis,adj);
            }
        }
        int k=0;
        while(!st.isEmpty())
        {
            ans[k++] = st.pop();
        }
        return ans;
    }
    static void dfs(int node, Stack<Integer> st,boolean vis[],ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=true;
        for(int i : adj.get(node))
        {
            if(!vis[i])
            {
                dfs(i,st,vis,adj);
            }
        }
        st.push(node);
    }
