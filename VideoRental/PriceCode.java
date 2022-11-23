public enum PriceCode {
    REGULAR(1), NEW_RELEASE(2), NONE(3);
    private int value;

    public int getValue() {
        return value;
    }

    PriceCode(int value) {
        this.value = value;
    }

    static PriceCode getPriceCode(int value){
        if(value == 1){
            return REGULAR;
        } else if (value == 2) {
            return NEW_RELEASE;
        }
        return NONE;
    }
}