package ea;

import java.util.Objects;

final class f0 extends e0 {

    /* renamed from: e  reason: collision with root package name */
    static final e0 f50951e = new f0(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f50952c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f50953d;

    f0(Object[] objArr, int i10) {
        this.f50952c = objArr;
        this.f50953d = i10;
    }

    public final Object get(int i10) {
        Y.a(i10, this.f50953d, "index");
        Object obj = this.f50952c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final Object[] i() {
        return this.f50952c;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int k() {
        return this.f50953d;
    }

    /* access modifiers changed from: package-private */
    public final boolean p() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int q(Object[] objArr, int i10) {
        System.arraycopy(this.f50952c, 0, objArr, 0, this.f50953d);
        return this.f50953d;
    }

    public final int size() {
        return this.f50953d;
    }
}
