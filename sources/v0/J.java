package v0;

import XH.C16807N;
import YH.C16870n;
import androidx.compose.foundation.lazy.layout.c;
import j0.K;
import j0.Q;
import j0.S;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import tI.C17974j;
import v0.C6138d;
import v0.C6149o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Lv0/J;", "Landroidx/compose/foundation/lazy/layout/c;", "LtI/j;", "nearestRange", "Lv0/o;", "intervalContent", "<init>", "(LtI/j;Lv0/o;)V", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "d", "(I)Ljava/lang/Object;", "Lj0/Q;", "b", "Lj0/Q;", "map", "", "[Ljava/lang/Object;", "keys", "I", "keysStartIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class J implements c {

    /* renamed from: b  reason: collision with root package name */
    private final Q<Object> f30827b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f30828c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f30829d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv0/d$a;", "Lv0/o$a;", "it", "LXH/N;", "a", "(Lv0/d$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C6138d.a<? extends C6149o.a>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30830c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30831d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K<Object> f30832e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ J f30833f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, K<Object> k10, J j10) {
            super(1);
            this.f30830c = i10;
            this.f30831d = i11;
            this.f30832e = k10;
            this.f30833f = j10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
            if (r3 == null) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(v0.C6138d.a<? extends v0.C6149o.a> r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                v0.o$a r0 = (v0.C6149o.a) r0
                nI.l r0 = r0.getKey()
                int r1 = r6.f30830c
                int r2 = r7.b()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f30831d
                int r3 = r7.b()
                int r4 = r7.a()
                int r3 = r3 + r4
                int r3 = r3 + -1
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L_0x0057
            L_0x0027:
                if (r0 == 0) goto L_0x0039
                int r3 = r7.b()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L_0x003d
            L_0x0039:
                java.lang.Object r3 = v0.C6134H.a(r1)
            L_0x003d:
                j0.K<java.lang.Object> r4 = r6.f30832e
                r4.s(r3, r1)
                v0.J r4 = r6.f30833f
                java.lang.Object[] r4 = r4.f30828c
                v0.J r5 = r6.f30833f
                int r5 = r5.f30829d
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L_0x0057
                int r1 = r1 + 1
                goto L_0x0027
            L_0x0057:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.J.a.a(v0.d$a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6138d.a) obj);
            return C16807N.f139792a;
        }
    }

    public J(C17974j jVar, C6149o<?> oVar) {
        C6138d<?> n10 = oVar.n();
        int p10 = jVar.p();
        if (p10 >= 0) {
            int min = Math.min(jVar.q(), n10.a() - 1);
            if (min < p10) {
                this.f30827b = S.a();
                this.f30828c = new Object[0];
                this.f30829d = 0;
                return;
            }
            int i10 = (min - p10) + 1;
            this.f30828c = new Object[i10];
            this.f30829d = p10;
            K k10 = new K(i10);
            n10.b(p10, min, new a(p10, min, k10, this));
            this.f30827b = k10;
            return;
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public int c(Object obj) {
        Q<Object> q10 = this.f30827b;
        int b10 = q10.b(obj);
        if (b10 >= 0) {
            return q10.f24553c[b10];
        }
        return -1;
    }

    public Object d(int i10) {
        Object[] objArr = this.f30828c;
        int i11 = i10 - this.f30829d;
        if (i11 < 0 || i11 > C16870n.n0(objArr)) {
            return null;
        }
        return objArr[i11];
    }
}
