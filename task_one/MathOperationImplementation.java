package task_one;

final public class MathOperationImplementation implements MathOperationService {
    public int adder(final float num1, final float num2) {
        return (int) (num1 + num2);
    }

    public int miltiplier(final float num1, final float num2) {
        return (int) (num1 * num2);
    }

    public int subtractor(final float num1, final float num2) {
        return (int) (num1 - num2);
    }

    public float divider(final float num1, final float num2) {
        return (num1 / num2);
    }
}
