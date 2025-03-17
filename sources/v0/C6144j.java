package v0;

import W0.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lv0/j;", "", "<init>", "()V", "", "start", "end", "Lv0/j$a;", "a", "(II)Lv0/j$a;", "interval", "LXH/N;", "e", "(Lv0/j$a;)V", "", "d", "()Z", "LW0/b;", "LW0/b;", "beyondBoundsItems", "c", "()I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.j  reason: case insensitive filesystem */
public final class C6144j {

    /* renamed from: b  reason: collision with root package name */
    public static final int f30898b = b.f14622d;

    /* renamed from: a  reason: collision with root package name */
    private final b<a> f30899a = new b<>(new a[16], 0);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lv0/j$a;", "", "", "start", "end", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.j$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f30900a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30901b;

        public a(int i10, int i11) {
            this.f30900a = i10;
            this.f30901b = i11;
            if (i10 < 0) {
                throw new IllegalArgumentException("negative start index");
            } else if (i11 < i10) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int a() {
            return this.f30901b;
        }

        public final int b() {
            return this.f30900a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30900a == aVar.f30900a && this.f30901b == aVar.f30901b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f30900a) * 31) + Integer.hashCode(this.f30901b);
        }

        public String toString() {
            return "Interval(start=" + this.f30900a + ", end=" + this.f30901b + ')';
        }
    }

    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f30899a.b(aVar);
        return aVar;
    }

    public final int b() {
        int a10 = this.f30899a.p().a();
        b<a> bVar = this.f30899a;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i10 = 0;
            do {
                a aVar = (a) q10[i10];
                if (aVar.a() > a10) {
                    a10 = aVar.a();
                }
                i10++;
            } while (i10 < r10);
        }
        return a10;
    }

    public final int c() {
        int b10 = this.f30899a.p().b();
        b<a> bVar = this.f30899a;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i10 = 0;
            do {
                a aVar = (a) q10[i10];
                if (aVar.b() < b10) {
                    b10 = aVar.b();
                }
                i10++;
            } while (i10 < r10);
        }
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.f30899a.v();
    }

    public final void e(a aVar) {
        this.f30899a.y(aVar);
    }
}
