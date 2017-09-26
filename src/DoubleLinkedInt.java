public class DoubleLinkedInt {

    private DoubleLinkedInt previousItem;
    private DoubleLinkedInt nextItem;
    private int value;

    public DoubleLinkedInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
