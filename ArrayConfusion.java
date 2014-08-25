public class ArrayConfusion {

    public static void main(String[] args) {
        Double[] doubles = new Double[]{1., 2., 3.};
        Number[] numbers = doubles;

        numbers[1] = new Integer(2);
        Double first = doubles[1];
    }
}