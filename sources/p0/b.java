package P0;

import TJ.C16532g;
import TJ.C16533h;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5100f0;
import c2.k;
import c2.s;
import dI.C17164e;
import e5.C7786b;
import eI.C17187b;
import f5.C7847c;
import f5.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LP0/e;", "b", "(LU0/m;I)LP0/e;", "Lc2/r;", "c", "(LU0/m;I)J", "LU0/A1;", "", "Lf5/c;", "a", "(LU0/m;I)LU0/A1;", "adaptive_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends C7847c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f11819a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: P0.b$a$a  reason: collision with other inner class name */
        public static final class C0174a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f11820a;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$2$$inlined$map$1$2", f = "AndroidWindowAdaptiveInfo.android.kt", l = {223}, m = "emit")
            /* renamed from: P0.b$a$a$a  reason: collision with other inner class name */
            public static final class C0175a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f11821c;

                /* renamed from: d  reason: collision with root package name */
                int f11822d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0174a f11823e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0175a(C0174a aVar, C17164e eVar) {
                    super(eVar);
                    this.f11823e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f11821c = obj;
                    this.f11822d |= Integer.MIN_VALUE;
                    return this.f11823e.emit((Object) null, this);
                }
            }

            public C0174a(C16533h hVar) {
                this.f11820a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof P0.b.a.C0174a.C0175a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    P0.b$a$a$a r0 = (P0.b.a.C0174a.C0175a) r0
                    int r1 = r0.f11822d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f11822d = r1
                    goto L_0x0018
                L_0x0013:
                    P0.b$a$a$a r0 = new P0.b$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f11821c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f11822d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0062
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f11820a
                    f5.k r7 = (f5.k) r7
                    java.util.List r7 = r7.a()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L_0x0047:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L_0x0059
                    java.lang.Object r4 = r7.next()
                    boolean r5 = r4 instanceof f5.C7847c
                    if (r5 == 0) goto L_0x0047
                    r2.add(r4)
                    goto L_0x0047
                L_0x0059:
                    r0.f11822d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0062
                    return r1
                L_0x0062:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: P0.b.a.C0174a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f11819a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f11819a.collect(new C0174a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: TJ.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final U0.A1<java.util.List<f5.C7847c>> a(U0.C4889m r8, int r9) {
        /*
            r0 = -883534959(0xffffffffcb565391, float:-1.4046097E7)
            r8.C(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.adaptive.collectFoldingFeaturesAsState (AndroidWindowAdaptiveInfo.android.kt:68)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x0012:
            U0.I0 r9 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r9 = r8.Q(r9)
            android.content.Context r9 = (android.content.Context) r9
            r0 = 793549594(0x2f4c9b1a, float:1.8608795E-10)
            r8.C(r0)
            boolean r0 = r8.V(r9)
            java.lang.Object r1 = r8.D()
            if (r0 != 0) goto L_0x0034
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0046
        L_0x0034:
            f5.f$a r0 = f5.f.f51140a
            f5.f r0 = r0.d(r9)
            TJ.g r9 = r0.b(r9)
            P0.b$a r1 = new P0.b$a
            r1.<init>(r9)
            r8.u(r1)
        L_0x0046:
            r2 = r1
            TJ.g r2 = (TJ.C16532g) r2
            r8.U()
            java.util.List r3 = YH.C16877v.n()
            r6 = 48
            r7 = 2
            r4 = 0
            r5 = r8
            U0.A1 r9 = U0.p1.a(r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0062
            U0.C4895p.R()
        L_0x0062:
            r8.U()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.b.a(U0.m, int):U0.A1");
    }

    public static final e b(C4889m mVar, int i10) {
        mVar.C(-2003129230);
        if (C4895p.J()) {
            C4895p.S(-2003129230, i10, -1, "androidx.compose.material3.adaptive.currentWindowAdaptiveInfo (AndroidWindowAdaptiveInfo.android.kt:35)");
        }
        mVar.C(-1765630114);
        long X10 = ((c2.d) mVar.Q(C5100f0.e())).X(s.d(c(mVar, 0)));
        mVar.U();
        e eVar = new e(C7786b.f50839c.a(k.h(X10), k.g(X10)), a.a(a(mVar, 0).getValue()));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return eVar;
    }

    public static final long c(C4889m mVar, int i10) {
        mVar.C(-1153163183);
        if (C4895p.J()) {
            C4895p.S(-1153163183, i10, -1, "androidx.compose.material3.adaptive.currentWindowSize (AndroidWindowAdaptiveInfo.android.kt:49)");
        }
        mVar.Q(AndroidCompositionLocals_androidKt.f());
        Rect a10 = m.f51166a.a().a((Context) mVar.Q(AndroidCompositionLocals_androidKt.g())).a();
        long a11 = s.a(a10.width(), a10.height());
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return a11;
    }
}
