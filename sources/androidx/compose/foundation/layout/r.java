package androidx.compose.foundation.layout;

import E1.C4484q;
import E1.H;
import E1.a0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.q;
import c2.C5267b;
import j0.C5456l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import s0.C5830A;
import s0.C5833D;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010%R\"\u00106\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010%\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b7\u0010%\"\u0004\b8\u00105R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010<R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010<R\u001e\u0010A\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u0010@R\u001e\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b4\u0010@R,\u0010E\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010DR\u0014\u0010F\u001a\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b>\u0010%\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/foundation/layout/r;", "", "Landroidx/compose/foundation/layout/q$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Landroidx/compose/foundation/layout/q$a;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "Lj0/l;", "f", "(ZII)Lj0/l;", "Landroidx/compose/foundation/layout/o$a;", "e", "(ZII)Landroidx/compose/foundation/layout/o$a;", "LE1/q;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "Lc2/b;", "constraints", "LXH/N;", "l", "(LE1/q;LE1/q;ZJ)V", "Landroidx/compose/foundation/layout/s;", "measurePolicy", "LE1/H;", "m", "(Landroidx/compose/foundation/layout/s;LE1/H;LE1/H;J)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/layout/q$a;", "i", "()Landroidx/compose/foundation/layout/q$a;", "b", "I", "g", "c", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "d", "getItemShown$foundation_layout_release", "k", "(I)V", "itemShown", "getItemCount$foundation_layout_release", "j", "itemCount", "LE1/H;", "LE1/a0;", "LE1/a0;", "seeMorePlaceable", "h", "collapsePlaceable", "Lj0/l;", "seeMoreSize", "collapseSize", "Lkotlin/Function2;", "LnI/p;", "getOverflowMeasurable", "noOfItemsShown", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final q.a f18184a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18185b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18186c;

    /* renamed from: d  reason: collision with root package name */
    private int f18187d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f18188e;

    /* renamed from: f  reason: collision with root package name */
    private H f18189f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a0 f18190g;

    /* renamed from: h  reason: collision with root package name */
    private H f18191h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public a0 f18192i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C5456l f18193j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C5456l f18194k;

    /* renamed from: l  reason: collision with root package name */
    private p<? super Boolean, ? super Integer, ? extends H> f18195l;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18196a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.foundation.layout.q$a[] r0 = androidx.compose.foundation.layout.q.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.layout.q$a r1 = androidx.compose.foundation.layout.q.a.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.layout.q$a r1 = androidx.compose.foundation.layout.q.a.Clip     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.layout.q$a r1 = androidx.compose.foundation.layout.q.a.ExpandIndicator     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.foundation.layout.q$a r1 = androidx.compose.foundation.layout.q.a.ExpandOrCollapseIndicator     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f18196a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.r.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/a0;", "placeable", "LXH/N;", "a", "(LE1/a0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<a0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f18197c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s f18198d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar, s sVar) {
            super(1);
            this.f18197c = rVar;
            this.f18198d = sVar;
        }

        public final void a(a0 a0Var) {
            int i10;
            int i11;
            if (a0Var != null) {
                s sVar = this.f18198d;
                i10 = sVar.c(a0Var);
                i11 = sVar.e(a0Var);
            } else {
                i10 = 0;
                i11 = 0;
            }
            this.f18197c.f18193j = C5456l.a(C5456l.b(i10, i11));
            this.f18197c.f18190g = a0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/a0;", "placeable", "LXH/N;", "a", "(LE1/a0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<a0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f18199c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s f18200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar, s sVar) {
            super(1);
            this.f18199c = rVar;
            this.f18200d = sVar;
        }

        public final void a(a0 a0Var) {
            int i10;
            int i11;
            if (a0Var != null) {
                s sVar = this.f18200d;
                i10 = sVar.c(a0Var);
                i11 = sVar.e(a0Var);
            } else {
                i10 = 0;
                i11 = 0;
            }
            this.f18199c.f18194k = C5456l.a(C5456l.b(i10, i11));
            this.f18199c.f18192i = a0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0) obj);
            return C16807N.f139792a;
        }
    }

    public r(q.a aVar, int i10, int i11) {
        this.f18184a = aVar;
        this.f18185b = i10;
        this.f18186c = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.layout.o.a e(boolean r12, int r13, int r14) {
        /*
            r11 = this;
            androidx.compose.foundation.layout.q$a r0 = r11.f18184a
            int[] r1 = androidx.compose.foundation.layout.r.a.f18196a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0086
            r3 = 2
            if (r0 == r3) goto L_0x0086
            r3 = 3
            if (r0 == r3) goto L_0x001e
            r3 = 4
            if (r0 != r3) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        L_0x001e:
            if (r12 == 0) goto L_0x0046
            nI.p<? super java.lang.Boolean, ? super java.lang.Integer, ? extends E1.H> r12 = r11.f18195l
            if (r12 == 0) goto L_0x0036
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            int r14 = r11.h()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r12 = r12.invoke(r13, r14)
            E1.H r12 = (E1.H) r12
            if (r12 != 0) goto L_0x0038
        L_0x0036:
            E1.H r12 = r11.f18189f
        L_0x0038:
            j0.l r13 = r11.f18193j
            nI.p<? super java.lang.Boolean, ? super java.lang.Integer, ? extends E1.H> r14 = r11.f18195l
            if (r14 != 0) goto L_0x0043
            E1.a0 r14 = r11.f18190g
        L_0x0040:
            r4 = r12
            r5 = r14
            goto L_0x0072
        L_0x0043:
            r4 = r12
            r5 = r2
            goto L_0x0072
        L_0x0046:
            int r12 = r11.f18185b
            int r12 = r12 - r1
            if (r13 < r12) goto L_0x0068
            int r12 = r11.f18186c
            if (r14 < r12) goto L_0x0068
            nI.p<? super java.lang.Boolean, ? super java.lang.Integer, ? extends E1.H> r12 = r11.f18195l
            if (r12 == 0) goto L_0x0065
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            int r14 = r11.h()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r12 = r12.invoke(r13, r14)
            E1.H r12 = (E1.H) r12
            if (r12 != 0) goto L_0x0069
        L_0x0065:
            E1.H r12 = r11.f18191h
            goto L_0x0069
        L_0x0068:
            r12 = r2
        L_0x0069:
            j0.l r13 = r11.f18194k
            nI.p<? super java.lang.Boolean, ? super java.lang.Integer, ? extends E1.H> r14 = r11.f18195l
            if (r14 != 0) goto L_0x0043
            E1.a0 r14 = r11.f18192i
            goto L_0x0040
        L_0x0072:
            if (r4 != 0) goto L_0x0075
            return r2
        L_0x0075:
            androidx.compose.foundation.layout.o$a r2 = new androidx.compose.foundation.layout.o$a
            kotlin.jvm.internal.C17542s.g(r13)
            long r6 = r13.i()
            r9 = 8
            r10 = 0
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r8, r9, r10)
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.r.e(boolean, int, int):androidx.compose.foundation.layout.o$a");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f18184a == rVar.f18184a && this.f18185b == rVar.f18185b && this.f18186c == rVar.f18186c;
    }

    public final C5456l f(boolean z10, int i10, int i11) {
        int i12 = a.f18196a[this.f18184a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 != 3) {
            if (i12 != 4) {
                throw new t();
            } else if (z10) {
                return this.f18193j;
            } else {
                if (i10 + 1 < this.f18185b || i11 < this.f18186c) {
                    return null;
                }
                return this.f18194k;
            }
        } else if (z10) {
            return this.f18193j;
        } else {
            return null;
        }
    }

    public final int g() {
        return this.f18185b;
    }

    public final int h() {
        int i10 = this.f18187d;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    public int hashCode() {
        return (((this.f18184a.hashCode() * 31) + Integer.hashCode(this.f18185b)) * 31) + Integer.hashCode(this.f18186c);
    }

    public final q.a i() {
        return this.f18184a;
    }

    public final void j(int i10) {
        this.f18188e = i10;
    }

    public final void k(int i10) {
        this.f18187d = i10;
    }

    public final void l(C4484q qVar, C4484q qVar2, boolean z10, long j10) {
        long c10 = C5833D.c(j10, z10 ? C5830A.Horizontal : C5830A.Vertical);
        if (qVar != null) {
            int i10 = p.i(qVar, z10, C5267b.k(c10));
            this.f18193j = C5456l.a(C5456l.b(i10, p.f(qVar, z10, i10)));
            this.f18189f = qVar instanceof H ? (H) qVar : null;
            this.f18190g = null;
        }
        if (qVar2 != null) {
            int i11 = p.i(qVar2, z10, C5267b.k(c10));
            this.f18194k = C5456l.a(C5456l.b(i11, p.f(qVar2, z10, i11)));
            this.f18191h = qVar2 instanceof H ? (H) qVar2 : null;
            this.f18192i = null;
        }
    }

    public final void m(s sVar, H h10, H h11, long j10) {
        C5830A a10 = sVar.f() ? C5830A.Horizontal : C5830A.Vertical;
        long f10 = C5833D.f(C5833D.e(C5833D.c(j10, a10), 0, 0, 0, 0, 10, (Object) null), a10);
        if (h10 != null) {
            p.k(h10, sVar, f10, new b(this, sVar));
            this.f18189f = h10;
        }
        if (h11 != null) {
            p.k(h11, sVar, f10, new c(this, sVar));
            this.f18191h = h11;
        }
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.f18184a + ", minLinesToShowCollapse=" + this.f18185b + ", minCrossAxisSizeToShowCollapse=" + this.f18186c + ')';
    }
}
