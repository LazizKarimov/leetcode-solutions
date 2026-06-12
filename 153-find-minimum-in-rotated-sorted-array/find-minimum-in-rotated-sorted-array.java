class Solution {
    public int findMin(int[] nums) {
        // Проверка на недопустимые входные данные
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }
        // Инициализируем минимум первым элементом массива
        int min = nums[0];
        // Итерируем со второго элемента (индекс 1)
        for (int i = 1; i < nums.length; i++) {
            // Если текущий элемент меньше текущего минимума, обновляем минимум
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min; // Возвращаем найденный минимум
    }
}