class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int province=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    province++;
                    isConnected[i][j]=-1;
                    isConnected[j][i]=-1;
                    LinkedList<Integer> stack=new LinkedList<>();
                    stack.push(j);
                    while(!stack.isEmpty()){
                        int row=stack.pop();
                        for(int col=0;col<n;col++){
                            if(isConnected[row][col]==1){
                                isConnected[row][col]=-1;
                                isConnected[col][row]=-1;
                                stack.push(col);
                            }
                        }
                    }
                }
            }
        }
        return province;
    }
}