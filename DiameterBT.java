class DiameterBT {
    int ans;
    int diameter(Node root) {
        ans=0;
        solve(root);
        return ans;
    }
    int solve(Node root){
        if(root==null)  return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        ans = Math.max(ans, left+right);
        return 1+Math.max(left,right);
    }
}
