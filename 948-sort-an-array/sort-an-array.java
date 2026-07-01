class Solution {
    public int[] sortArray(int[] nums) {
        List<Integer> arrayListWithNums = Arrays.stream(nums)
                            .boxed()
                            .toList();

        List<Integer> result = mergeSort(arrayListWithNums);

        return result.stream()
                    .mapToInt(i -> i)
                    .toArray();
    }

    public List<Integer> mergeSort(List<Integer> arrayListWithNums) {

        if (arrayListWithNums.size() <= 1) {
            return arrayListWithNums;
        }

        int mid = arrayListWithNums.size() / 2;

        List<Integer> left = new ArrayList<>(arrayListWithNums.subList(0, mid));
        List<Integer> right = new ArrayList<>(arrayListWithNums.subList(mid, arrayListWithNums.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }

    public List<Integer> merge(List<Integer> left, List<Integer> right) {
        int p1 = 0;
        int p2 = 0;
        List<Integer> result = new ArrayList();

        while (p1 < left.size() && p2 < right.size()) {
            if (left.get(p1) < right.get(p2)){
                result.add(left.get(p1));
                p1++;
            } else if (left.get(p1) > right.get(p2)) {
                result.add(right.get(p2));
                p2++;
            } else {
                result.add(left.get(p1));
                p1++;
                result.add(right.get(p2));
                p2++;
            }

        }
            while (p1 < left.size()) {
                result.add(left.get(p1));
                p1++;
            }
            while (p2 < right.size()) {
                result.add(right.get(p2));
                p2++;
            }

        return result;
    }

}