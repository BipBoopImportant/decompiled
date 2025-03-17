package wd;

/* renamed from: wd.b  reason: case insensitive filesystem */
public enum C10360b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    private final int bits;
    private final int[] characterCountBitsForVersions;

    private C10360b(int[] iArr, int i10) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i10;
    }

    public int b() {
        return this.bits;
    }

    public int j(C10361c cVar) {
        int f10 = cVar.f();
        return this.characterCountBitsForVersions[f10 <= 9 ? 0 : f10 <= 26 ? (char) 1 : 2];
    }
}
