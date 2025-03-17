package ha;

/* renamed from: ha.e8  reason: case insensitive filesystem */
final class C7997e8 extends C8047j8 {

    /* renamed from: a  reason: collision with root package name */
    private String f52506a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52507b;

    /* renamed from: c  reason: collision with root package name */
    private int f52508c;

    /* renamed from: d  reason: collision with root package name */
    private byte f52509d;

    C7997e8() {
    }

    public final C8047j8 a(boolean z10) {
        this.f52507b = true;
        this.f52509d = (byte) (1 | this.f52509d);
        return this;
    }

    public final C8047j8 b(int i10) {
        this.f52508c = 1;
        this.f52509d = (byte) (this.f52509d | 2);
        return this;
    }

    public final C8057k8 c() {
        String str;
        if (this.f52509d == 3 && (str = this.f52506a) != null) {
            return new C8017g8(str, this.f52507b, this.f52508c, (C8007f8) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f52506a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f52509d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f52509d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final C8047j8 d(String str) {
        this.f52506a = str;
        return this;
    }
}
