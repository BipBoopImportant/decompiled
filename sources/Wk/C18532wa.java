package wK;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0014B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LwK/wa;", "", "", "x", "y", "LwK/wa$a;", "direction", "<init>", "(IILwK/wa$a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "LwK/wa$a;", "()LwK/wa$a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.wa  reason: case insensitive filesystem */
final class C18532wa {

    /* renamed from: a  reason: collision with root package name */
    private final int f151880a;

    /* renamed from: b  reason: collision with root package name */
    private final int f151881b;

    /* renamed from: c  reason: collision with root package name */
    private final a f151882c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LwK/wa$a;", "", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.wa$a */
    public enum a {
        Vertical,
        Horizontal;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"LwK/wa$b;", "", "<init>", "()V", "LwK/wa;", "b", "LwK/wa;", "d", "()LwK/wa;", "TopCenter", "c", "e", "TopLeft", "f", "TopRight", "a", "BottomCenter", "BottomLeft", "g", "BottomRight", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.wa$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f151883a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final C18532wa f151884b;

        /* renamed from: c  reason: collision with root package name */
        private static final C18532wa f151885c;

        /* renamed from: d  reason: collision with root package name */
        private static final C18532wa f151886d;

        /* renamed from: e  reason: collision with root package name */
        private static final C18532wa f151887e;

        /* renamed from: f  reason: collision with root package name */
        private static final C18532wa f151888f;

        /* renamed from: g  reason: collision with root package name */
        private static final C18532wa f151889g;

        static {
            a aVar = a.Vertical;
            f151884b = new C18532wa(0, -1, aVar);
            f151885c = new C18532wa(1, -1, aVar);
            f151886d = new C18532wa(-1, -1, aVar);
            f151887e = new C18532wa(0, 1, aVar);
            f151888f = new C18532wa(1, 1, aVar);
            f151889g = new C18532wa(-1, 1, aVar);
        }

        private b() {
        }

        public final C18532wa a() {
            return f151887e;
        }

        public final C18532wa b() {
            return f151888f;
        }

        public final C18532wa c() {
            return f151889g;
        }

        public final C18532wa d() {
            return f151884b;
        }

        public final C18532wa e() {
            return f151885c;
        }

        public final C18532wa f() {
            return f151886d;
        }
    }

    public C18532wa(int i10, int i11, a aVar) {
        C17542s.j(aVar, "direction");
        this.f151880a = i10;
        this.f151881b = i11;
        this.f151882c = aVar;
    }

    public final a a() {
        return this.f151882c;
    }

    public final int b() {
        return this.f151880a;
    }

    public final int c() {
        return this.f151881b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18532wa)) {
            return false;
        }
        C18532wa waVar = (C18532wa) obj;
        return this.f151880a == waVar.f151880a && this.f151881b == waVar.f151881b && this.f151882c == waVar.f151882c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f151880a) * 31) + Integer.hashCode(this.f151881b)) * 31) + this.f151882c.hashCode();
    }

    public String toString() {
        int i10 = this.f151880a;
        int i11 = this.f151881b;
        a aVar = this.f151882c;
        return "TagPosition(x=" + i10 + ", y=" + i11 + ", direction=" + aVar + ")";
    }
}
