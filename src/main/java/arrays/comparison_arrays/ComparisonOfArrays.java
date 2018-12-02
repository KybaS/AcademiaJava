package arrays.comparison_arrays;

public class ComparisonOfArrays {
    public static void main(String[] args) {

        MethodsForComparison comparisons = new MethodsForComparison();

        int[] data = new int[]{12, 5, 87, 7, 0, 34, 3};
        int[] blocks = new int[]{12, 5, 87, 7, 0, 34};
        String[] texts = new String[]{"TEXT", "J"};
        String[] strings = new String[]{"TEXT", "Jw"};

        comparisons.matchOfTwoArrays(data, blocks);
        comparisons.matchOfTwoArrays(texts, strings);
    }
}
