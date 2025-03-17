package wd;

/* renamed from: wd.a  reason: case insensitive filesystem */
public enum C10359a {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final C10359a[] FOR_BITS = null;
    private final int bits;

    static {
        C10359a aVar;
        C10359a aVar2;
        C10359a aVar3;
        C10359a aVar4;
        FOR_BITS = new C10359a[]{aVar2, aVar, aVar4, aVar3};
    }

    private C10359a(int i10) {
        this.bits = i10;
    }

    public int b() {
        return this.bits;
    }
}
