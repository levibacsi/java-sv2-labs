package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private final int value;
    private final String textValue;

    MarkType(int value, String textValue) {
        this.value = value;
        this.textValue = textValue;
    }

    public int getValue() {
        return value;
    }

    public String getTextValue() {
        return textValue;
    }
}
