public enum VideoType {
    VHS(1), CD(2), DVD(3), NONE(4);
    private int value;

    public int getValue() {
        return value;
    }

    VideoType(int value) {
        this.value = value;
    }

    static VideoType getVideoType(int value){
        if(value == 1){
            return VHS;
        } else if (value == 2) {
            return CD;
        } else if (value == 3) {
            return DVD;
        }
        return NONE;
    }
}