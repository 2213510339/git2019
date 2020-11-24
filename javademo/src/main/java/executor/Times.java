package executor;

public enum Times {
    FIVE(5);

    private final int value;
    Times(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public static Times parse(int value) {
        for (Times status : Times.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        return null;
    }
}
