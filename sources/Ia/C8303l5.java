package ia;

/* renamed from: ia.l5  reason: case insensitive filesystem */
final class C8303l5 extends C8344r5 {

    /* renamed from: a  reason: collision with root package name */
    private String f53693a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f53694b;

    /* renamed from: c  reason: collision with root package name */
    private int f53695c;

    /* renamed from: d  reason: collision with root package name */
    private byte f53696d;

    C8303l5() {
    }

    public final C8344r5 a(boolean z10) {
        this.f53694b = true;
        this.f53696d = (byte) (1 | this.f53696d);
        return this;
    }

    public final C8344r5 b(int i10) {
        this.f53695c = 1;
        this.f53696d = (byte) (this.f53696d | 2);
        return this;
    }

    public final C8351s5 c() {
        String str;
        if (this.f53696d == 3 && (str = this.f53693a) != null) {
            return new C8324o5(str, this.f53694b, this.f53695c, (C8310m5) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f53693a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f53696d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f53696d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final C8344r5 d(String str) {
        this.f53693a = "vision-common";
        return this;
    }
}
