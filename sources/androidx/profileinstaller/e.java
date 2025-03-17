package androidx.profileinstaller;

enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    private e(long j10) {
        this.mValue = j10;
    }

    public long b() {
        return this.mValue;
    }
}
