package NI;

import DI.i0;
import OI.C16165g;
import PI.C16201k;
import TI.C16498b;
import YH.X;
import cJ.C17066c;
import cJ.C17069f;
import iJ.C17373g;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import tJ.C17989i;
import tJ.C17993m;
import uI.C18064m;
import uJ.C18113f0;

/* renamed from: NI.c  reason: case insensitive filesystem */
public class C16099c implements C16165g {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f136544f = {P.h(new G(C16099c.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* renamed from: a  reason: collision with root package name */
    private final C17066c f136545a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f136546b;

    /* renamed from: c  reason: collision with root package name */
    private final C17989i f136547c;

    /* renamed from: d  reason: collision with root package name */
    private final C16498b f136548d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f136549e;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        r2 = r3.i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16099c(PI.C16201k r2, TI.C16497a r3, cJ.C17066c r4) {
        /*
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r1.<init>()
            r1.f136545a = r4
            if (r3 == 0) goto L_0x0020
            PI.d r4 = r2.a()
            SI.b r4 = r4.t()
            SI.a r4 = r4.a(r3)
            if (r4 == 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            DI.i0 r4 = DI.i0.f133841a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.C17542s.i(r4, r0)
        L_0x0027:
            r1.f136546b = r4
            tJ.n r4 = r2.e()
            NI.b r0 = new NI.b
            r0.<init>(r2, r1)
            tJ.i r2 = r4.d(r0)
            r1.f136547c = r2
            if (r3 == 0) goto L_0x0049
            java.util.Collection r2 = r3.i()
            if (r2 == 0) goto L_0x0049
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = YH.C16877v.x0(r2)
            TI.b r2 = (TI.C16498b) r2
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            r1.f136548d = r2
            r2 = 0
            if (r3 == 0) goto L_0x0057
            boolean r3 = r3.d()
            r4 = 1
            if (r3 != r4) goto L_0x0057
            r2 = r4
        L_0x0057:
            r1.f136549e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: NI.C16099c.<init>(PI.k, TI.a, cJ.c):void");
    }

    /* access modifiers changed from: private */
    public static final C18113f0 g(C16201k kVar, C16099c cVar) {
        C18113f0 r10 = kVar.d().p().p(cVar.f()).r();
        C17542s.i(r10, "getDefaultType(...)");
        return r10;
    }

    public Map<C17069f, C17373g<?>> a() {
        return X.j();
    }

    /* access modifiers changed from: protected */
    public final C16498b c() {
        return this.f136548d;
    }

    public boolean d() {
        return this.f136549e;
    }

    /* renamed from: e */
    public C18113f0 getType() {
        return (C18113f0) C17993m.a(this.f136547c, this, f136544f[0]);
    }

    public C17066c f() {
        return this.f136545a;
    }

    public i0 i() {
        return this.f136546b;
    }
}
