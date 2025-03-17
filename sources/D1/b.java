package d1;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroidx/lifecycle/F;", "LU0/A1;", "a", "(Landroidx/lifecycle/F;LU0/m;I)LU0/A1;", "R", "initial", "b", "(Landroidx/lifecycle/F;Ljava/lang/Object;LU0/m;I)LU0/A1;", "runtime-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "LU0/M;", "LU0/L;", "b", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F<T> f23107c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5221y f23108d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<R> f23109e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"d1/b$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: d1.b$a$a  reason: collision with other inner class name */
        public static final class C0364a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ F f23110a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.L f23111b;

            public C0364a(F f10, androidx.lifecycle.L l10) {
                this.f23110a = f10;
                this.f23111b = l10;
            }

            public void b() {
                this.f23110a.removeObserver(this.f23111b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F<T> f10, C5221y yVar, C4899r0<R> r0Var) {
            super(1);
            this.f23107c = f10;
            this.f23108d = yVar;
            this.f23109e = r0Var;
        }

        /* access modifiers changed from: private */
        public static final void c(C4899r0 r0Var, Object obj) {
            r0Var.setValue(obj);
        }

        /* renamed from: b */
        public final L invoke(M m10) {
            C5273a aVar = new C5273a(this.f23109e);
            this.f23107c.observe(this.f23108d, aVar);
            return new C0364a(this.f23107c, aVar);
        }
    }

    public static final <T> A1<T> a(F<T> f10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-2027206144, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:40)");
        }
        A1<T> b10 = b(f10, f10.getValue(), mVar, i10 & 14);
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.lifecycle.F, androidx.lifecycle.F<T>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R, T extends R> U0.A1<R> b(androidx.lifecycle.F<T> r4, R r5, U0.C4889m r6, int r7) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:57)"
            r2 = 411178300(0x1882153c, float:3.3625654E-24)
            U0.C4895p.S(r2, r7, r0, r1)
        L_0x000f:
            U0.I0 r0 = j3.g.a()
            java.lang.Object r0 = r6.Q(r0)
            androidx.lifecycle.y r0 = (androidx.lifecycle.C5221y) r0
            java.lang.Object r1 = r6.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r3 = r2.a()
            if (r1 != r3) goto L_0x0038
            boolean r1 = r4.isInitialized()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r5 = r4.getValue()
        L_0x002f:
            r1 = 2
            r3 = 0
            U0.r0 r1 = U0.u1.e(r5, r3, r1, r3)
            r6.u(r1)
        L_0x0038:
            U0.r0 r1 = (U0.C4899r0) r1
            boolean r5 = r6.F(r4)
            boolean r3 = r6.F(r0)
            r5 = r5 | r3
            java.lang.Object r3 = r6.D()
            if (r5 != 0) goto L_0x004f
            java.lang.Object r5 = r2.a()
            if (r3 != r5) goto L_0x0057
        L_0x004f:
            d1.b$a r3 = new d1.b$a
            r3.<init>(r4, r0, r1)
            r6.u(r3)
        L_0x0057:
            nI.l r3 = (nI.C17642l) r3
            r5 = r7 & 14
            U0.P.b(r4, r0, r3, r6, r5)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0067
            U0.C4895p.R()
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.b(androidx.lifecycle.F, java.lang.Object, U0.m, int):U0.A1");
    }
}
