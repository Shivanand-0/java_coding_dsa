class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (!map.containsKey(i))
                res[1] = i;
            if (map.get(i) != null && map.get(i) > 1)
                res[0] = i;
        }

        return res;

    }
}