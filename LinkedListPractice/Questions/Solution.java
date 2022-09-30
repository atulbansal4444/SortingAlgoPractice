private static List<int[]> getPairs(List<int[]> a, List<int[]> b,  int target) {
        // Time: O(a log a + b log b + (a+b))
        List<int[]> results = new ArrayList<>();
        // Sort based on it's values
        Collections.sort(a, (ai,bi) -> ai[1] - bi[1]);
        Collections.sort(b, (ai,bi) -> ai[1] - bi[1]);

        int left = a.size() - 1, right = 0;
        int max = Integer.MIN_VALUE;


        while (left >= 0 && right < b.size()) {

        // if sum > target, decrement left
        // else i'ts <= target. If the sum is closer to target than previous recorded max, then clear the results to add new ones.
        int sum = a.get(left)[1] + b.get(right)[1];
        if (sum > target) {
        left--;
        } else {
        // sum is less or equal to target
        if (sum > max) {
        max = sum;
        // closer sum found! remove previous results since this sum is closer
        results.clear();

        }
        if (sum == max) // if the sum is the current max, add
        results.add(new int[]{a.get(left)[0], b.get(right)[0]});
        right++; // increment to find closer to target

        }
        }

        return results;
        }