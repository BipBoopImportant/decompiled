package z4;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import android.content.Context;
import android.os.Bundle;
import dI.C17168i;
import f1.C5309k;
import f1.C5310l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import x4.C8935A;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\n\u001a\u00020\t2\"\u0010\b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx4/o;", "LU0/A1;", "Lx4/l;", "d", "(Lx4/o;LU0/m;I)LU0/A1;", "", "Lx4/I;", "Lx4/v;", "navigators", "Lx4/A;", "e", "([Lx4/I;LU0/m;I)Lx4/A;", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Lx4/A;", "Lf1/k;", "a", "(Landroid/content/Context;)Lf1/k;", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf1/m;", "Lx4/A;", "it", "Landroid/os/Bundle;", "a", "(Lf1/m;Lx4/A;)Landroid/os/Bundle;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<f1.m, C8935A, Bundle> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f58258c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Bundle invoke(f1.m mVar, C8935A a10) {
            return a10.B0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "it", "Lx4/A;", "a", "(Landroid/os/Bundle;)Lx4/A;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Bundle, C8935A> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f58259c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(1);
            this.f58259c = context;
        }

        /* renamed from: a */
        public final C8935A invoke(Bundle bundle) {
            C8935A b10 = m.c(this.f58259c);
            b10.z0(bundle);
            return b10;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx4/A;", "b", "()Lx4/A;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C8935A> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f58260c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f58260c = context;
        }

        /* renamed from: b */
        public final C8935A invoke() {
            return m.c(this.f58260c);
        }
    }

    private static final C5309k<C8935A, ?> a(Context context) {
        return C5310l.a(a.f58258c, new b(context));
    }

    /* access modifiers changed from: private */
    public static final C8935A c(Context context) {
        C8935A a10 = new C8935A(context);
        a10.O().c(new d(a10.O()));
        a10.O().c(new e());
        a10.O().c(new i());
        return a10;
    }

    public static final A1<C8948l> d(C8951o oVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-120375203, i10, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        A1<C8948l> a10 = p1.a(oVar.I(), null, (C17168i) null, mVar, 48, 2);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final x4.C8935A e(x4.I<? extends x4.v>[] r8, U0.C4889m r9, int r10) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)"
            r2 = -312215566(0xffffffffed63f7f2, float:-4.4095528E27)
            U0.C4895p.S(r2, r10, r0, r1)
        L_0x000f:
            U0.I0 r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r10 = r9.Q(r10)
            android.content.Context r10 = (android.content.Context) r10
            int r0 = r8.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r0)
            f1.k r2 = a(r10)
            boolean r0 = r9.F(r10)
            java.lang.Object r3 = r9.D()
            if (r0 != 0) goto L_0x0034
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x003c
        L_0x0034:
            z4.m$c r3 = new z4.m$c
            r3.<init>(r10)
            r9.u(r3)
        L_0x003c:
            r4 = r3
            nI.a r4 = (nI.C17631a) r4
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r9
            java.lang.Object r9 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            x4.A r9 = (x4.C8935A) r9
            int r10 = r8.length
            r0 = 0
        L_0x004b:
            if (r0 >= r10) goto L_0x0059
            r1 = r8[r0]
            x4.J r2 = r9.O()
            r2.c(r1)
            int r0 = r0 + 1
            goto L_0x004b
        L_0x0059:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0062
            U0.C4895p.R()
        L_0x0062:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.m.e(x4.I[], U0.m, int):x4.A");
    }
}
