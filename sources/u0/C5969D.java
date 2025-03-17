package u0;

import U0.C4877g1;
import U0.C4894o0;
import kotlin.Metadata;
import v0.C6128B;
import v0.u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Lu0/D;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "LXH/N;", "g", "Lu0/u;", "measureResult", "h", "(Lu0/u;)V", "i", "(I)V", "d", "Lu0/l;", "itemProvider", "j", "(Lu0/l;I)I", "<set-?>", "a", "LU0/o0;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Lv0/B;", "Lv0/B;", "()Lv0/B;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.D  reason: case insensitive filesystem */
public final class C5969D {

    /* renamed from: a  reason: collision with root package name */
    private final C4894o0 f29568a;

    /* renamed from: b  reason: collision with root package name */
    private final C4894o0 f29569b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29570c;

    /* renamed from: d  reason: collision with root package name */
    private Object f29571d;

    /* renamed from: e  reason: collision with root package name */
    private final C6128B f29572e;

    public C5969D(int i10, int i11) {
        this.f29568a = C4877g1.a(i10);
        this.f29569b = C4877g1.a(i11);
        this.f29572e = new C6128B(i10, 90, 200);
    }

    private final void e(int i10) {
        this.f29568a.g(i10);
    }

    private final void f(int i10) {
        this.f29569b.g(i10);
    }

    private final void g(int i10, int i11) {
        if (((float) i10) >= 0.0f) {
            e(i10);
            this.f29572e.m(i10);
            f(i11);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    public final int a() {
        return this.f29568a.e();
    }

    public final C6128B b() {
        return this.f29572e;
    }

    public final int c() {
        return this.f29569b.e();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f29571d = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (u0.C5998v) YH.C16870n.h0((r0 = r0.b()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(u0.C5997u r4) {
        /*
            r3 = this;
            u0.x r0 = r4.n()
            if (r0 == 0) goto L_0x0019
            u0.v[] r0 = r0.b()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = YH.C16870n.h0(r0)
            u0.v r0 = (u0.C5998v) r0
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r0.getKey()
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r3.f29571d = r0
            boolean r0 = r3.f29570c
            if (r0 != 0) goto L_0x0026
            int r0 = r4.f()
            if (r0 <= 0) goto L_0x0050
        L_0x0026:
            r0 = 1
            r3.f29570c = r0
            int r0 = r4.o()
            float r1 = (float) r0
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0051
            u0.x r4 = r4.n()
            if (r4 == 0) goto L_0x004c
            u0.v[] r4 = r4.b()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = YH.C16870n.h0(r4)
            u0.v r4 = (u0.C5998v) r4
            if (r4 == 0) goto L_0x004c
            int r4 = r4.getIndex()
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            r3.g(r4, r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "scrollOffset should be non-negative ("
            r4.append(r1)
            r4.append(r0)
            r0 = 41
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C5969D.h(u0.u):void");
    }

    public final void i(int i10) {
        if (((float) i10) >= 0.0f) {
            f(i10);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
    }

    public final int j(C5988l lVar, int i10) {
        int a10 = u.a(lVar, this.f29571d, i10);
        if (i10 != a10) {
            e(a10);
            this.f29572e.m(i10);
        }
        return a10;
    }
}
