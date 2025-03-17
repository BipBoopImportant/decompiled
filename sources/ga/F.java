package ga;

final class F extends J {

    /* renamed from: a  reason: collision with root package name */
    private String f51355a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f51356b;

    /* renamed from: c  reason: collision with root package name */
    private int f51357c;

    /* renamed from: d  reason: collision with root package name */
    private byte f51358d;

    F() {
    }

    public final J a(boolean z10) {
        this.f51356b = true;
        this.f51358d = (byte) (1 | this.f51358d);
        return this;
    }

    public final J b(int i10) {
        this.f51357c = 1;
        this.f51358d = (byte) (this.f51358d | 2);
        return this;
    }

    public final K c() {
        String str;
        if (this.f51358d == 3 && (str = this.f51355a) != null) {
            return new H(str, this.f51356b, this.f51357c, (G) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f51355a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f51358d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f51358d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final J d(String str) {
        this.f51355a = "common";
        return this;
    }
}
