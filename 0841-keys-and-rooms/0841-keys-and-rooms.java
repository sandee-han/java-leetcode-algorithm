class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> toVisit = new Stack<>();
        boolean[] unlocked = new boolean[rooms.size()];
        
        unlocked[0] = true;
        toVisit.push(0);
        int count = rooms.size() - 1;
        
        while (!toVisit.isEmpty()) {
            int room = toVisit.pop();
            
            List<Integer> keys = rooms.get(room);
            for (int key: keys) {
                if (!unlocked[key]) {
                    unlocked[key] = true;
                    count--;
                    toVisit.push(key);
                }
            }
        }
        
        return (count == 0);
    }
}