package kb;

/* renamed from: kb.T  reason: case insensitive filesystem */
final class C9939T<E> extends C9970y<E> {

    /* renamed from: h  reason: collision with root package name */
    private static final Object[] f74899h;

    /* renamed from: i  reason: collision with root package name */
    static final C9939T<Object> f74900i;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f74901c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f74902d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f74903e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f74904f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f74905g;

    static {
        Object[] objArr = new Object[0];
        f74899h = objArr;
        f74900i = new C9939T(objArr, 0, objArr, 0, 0);
    }

    C9939T(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f74901c = objArr;
        this.f74902d = i10;
        this.f74903e = objArr2;
        this.f74904f = i11;
        this.f74905g = i12;
    }

    /* access modifiers changed from: package-private */
    public C9967v<E> C() {
        return C9967v.s(this.f74901c, this.f74905g);
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        return true;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f74903e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = C9964s.c(obj);
        while (true) {
            int i10 = c10 & this.f74904f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    public int hashCode() {
        return this.f74902d;
    }

    /* access modifiers changed from: package-private */
    public int i(Object[] objArr, int i10) {
        System.arraycopy(this.f74901c, 0, objArr, i10, this.f74905g);
        return i10 + this.f74905g;
    }

    /* access modifiers changed from: package-private */
    public Object[] j() {
        return this.f74901c;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f74905g;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return false;
    }

    /* renamed from: q */
    public e0<E> iterator() {
        return b().iterator();
    }

    public int size() {
        return this.f74905g;
    }
}
