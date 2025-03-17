package B0;

import E1.C4488v;
import N1.P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\t*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d\"\u0004\b \u0010\u001f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LB0/d0;", "", "LN1/P;", "value", "LE1/v;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(LN1/P;LE1/v;LE1/v;)V", "Lo1/g;", "a", "(J)J", "position", "", "coerceInVisibleBounds", "", "d", "(JZ)I", "offset", "g", "(J)Z", "j", "k", "LN1/P;", "f", "()LN1/P;", "b", "LE1/v;", "c", "()LE1/v;", "i", "(LE1/v;)V", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final P f4826a;

    /* renamed from: b  reason: collision with root package name */
    private C4488v f4827b;

    /* renamed from: c  reason: collision with root package name */
    private C4488v f4828c;

    public d0(P p10, C4488v vVar, C4488v vVar2) {
        this.f4826a = p10;
        this.f4827b = vVar;
        this.f4828c = vVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long a(long r6) {
        /*
            r5 = this;
            E1.v r0 = r5.f4827b
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0016
            E1.v r1 = r5.f4828c
            r2 = 0
            if (r1 == 0) goto L_0x001c
            r3 = 0
            r4 = 2
            o1.i r2 = E1.C4488v.T(r1, r0, r3, r4, r2)
            goto L_0x001c
        L_0x0016:
            o1.i$a r0 = o1.C5669i.f26706e
            o1.i r2 = r0.a()
        L_0x001c:
            if (r2 != 0) goto L_0x0024
        L_0x001e:
            o1.i$a r0 = o1.C5669i.f26706e
            o1.i r2 = r0.a()
        L_0x0024:
            long r6 = B0.e0.b(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.d0.a(long):long");
    }

    public static /* synthetic */ int e(d0 d0Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return d0Var.d(j10, z10);
    }

    public final C4488v b() {
        return this.f4828c;
    }

    public final C4488v c() {
        return this.f4827b;
    }

    public final int d(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f4826a.x(j(j10));
    }

    public final P f() {
        return this.f4826a;
    }

    public final boolean g(long j10) {
        long j11 = j(a(j10));
        int r10 = this.f4826a.r(C5667g.n(j11));
        return C5667g.m(j11) >= this.f4826a.s(r10) && C5667g.m(j11) <= this.f4826a.t(r10);
    }

    public final void h(C4488v vVar) {
        this.f4828c = vVar;
    }

    public final void i(C4488v vVar) {
        this.f4827b = vVar;
    }

    public final long j(long j10) {
        C4488v vVar;
        C4488v vVar2 = this.f4827b;
        if (vVar2 == null) {
            return j10;
        }
        C4488v vVar3 = null;
        if (!vVar2.c()) {
            vVar2 = null;
        }
        if (vVar2 == null || (vVar = this.f4828c) == null) {
            return j10;
        }
        if (vVar.c()) {
            vVar3 = vVar;
        }
        return vVar3 == null ? j10 : vVar2.E(vVar3, j10);
    }

    public final long k(long j10) {
        C4488v vVar;
        C4488v vVar2 = this.f4827b;
        if (vVar2 == null) {
            return j10;
        }
        C4488v vVar3 = null;
        if (!vVar2.c()) {
            vVar2 = null;
        }
        if (vVar2 == null || (vVar = this.f4828c) == null) {
            return j10;
        }
        if (vVar.c()) {
            vVar3 = vVar;
        }
        return vVar3 == null ? j10 : vVar3.E(vVar2, j10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(P p10, C4488v vVar, C4488v vVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(p10, (i10 & 2) != 0 ? null : vVar, (i10 & 4) != 0 ? null : vVar2);
    }
}
