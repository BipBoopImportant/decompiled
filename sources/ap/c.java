package ap;

import HJ.C15854t;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.o1;
import XH.C16807N;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import na.C8594c;
import na.f;
import na.g;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\u00078\n@\nX\u0002"}, d2 = {"", "activate", "", "priority", "", "intervalMillis", "LU0/A1;", "Landroid/location/Location;", "d", "(ZIJLU0/m;II)LU0/A1;", "userLocation", "core-android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ap/c$a", "Lna/f;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "LXH/N;", "b", "(Lcom/google/android/gms/location/LocationResult;)V", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<Location> f90370a;

        a(C4899r0<Location> r0Var) {
            this.f90370a = r0Var;
        }

        public void b(LocationResult locationResult) {
            C17542s.j(locationResult, "locationResult");
            c.g(this.f90370a, locationResult.x());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ap/c$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f90371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O f90372b;

        public b(O o10, O o11) {
            this.f90371a = o10;
            this.f90372b = o11;
        }

        public void b() {
            T t10;
            T t11 = this.f90371a.f144348a;
            if (t11 != null && (t10 = this.f90372b.f144348a) != null) {
                ((C8594c) t11).c((f) t10);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: ap.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: ap.b} */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r7.b(r16) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
        if (r5 == r14.a()) goto L_0x00ca;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final U0.A1<android.location.Location> d(boolean r16, int r17, long r18, U0.C4889m r20, int r21, int r22) {
        /*
            r7 = r20
            r8 = r21
            r0 = 422692761(0x1931c799, float:9.190994E-24)
            r7.W(r0)
            r1 = r22 & 2
            if (r1 == 0) goto L_0x0012
            r1 = 100
            r11 = r1
            goto L_0x0014
        L_0x0012:
            r11 = r17
        L_0x0014:
            r9 = 4
            r1 = r22 & 4
            if (r1 == 0) goto L_0x001d
            r1 = 100
            r12 = r1
            goto L_0x001f
        L_0x001d:
            r12 = r18
        L_0x001f:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x002b
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.core.android.location.rememberUserLocation (ComposeLocationRequest.kt:46)"
            U0.C4895p.S(r0, r8, r1, r2)
        L_0x002b:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r7.Q(r0)
            r10 = r0
            android.content.Context r10 = (android.content.Context) r10
            r15 = 0
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r1 = -935148856(0xffffffffc842c2c8, float:-199435.12)
            r7.W(r1)
            java.lang.Object r1 = r20.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r2 = r14.a()
            if (r1 != r2) goto L_0x0053
            ap.a r1 = new ap.a
            r1.<init>()
            r7.u(r1)
        L_0x0053:
            r3 = r1
            nI.a r3 = (nI.C17631a) r3
            r20.P()
            r5 = 3072(0xc00, float:4.305E-42)
            r6 = 6
            r1 = 0
            r2 = 0
            r4 = r20
            java.lang.Object r0 = f1.C5301c.e(r0, r1, r2, r3, r4, r5, r6)
            U0.r0 r0 = (U0.C4899r0) r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            r2 = -935145680(0xffffffffc842cf30, float:-199484.75)
            r7.W(r2)
            r2 = r8 & 14
            r3 = r2 ^ 6
            r4 = 1
            if (r3 <= r9) goto L_0x0080
            r3 = r16
            boolean r5 = r7.b(r3)
            if (r5 != 0) goto L_0x0086
            goto L_0x0082
        L_0x0080:
            r3 = r16
        L_0x0082:
            r5 = r8 & 6
            if (r5 != r9) goto L_0x0088
        L_0x0086:
            r5 = r4
            goto L_0x0089
        L_0x0088:
            r5 = r15
        L_0x0089:
            boolean r6 = r7.F(r10)
            r5 = r5 | r6
            boolean r6 = r7.V(r0)
            r5 = r5 | r6
            r6 = r8 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r9 = 32
            if (r6 <= r9) goto L_0x00a1
            boolean r6 = r7.d(r11)
            if (r6 != 0) goto L_0x00a5
        L_0x00a1:
            r6 = r8 & 48
            if (r6 != r9) goto L_0x00a7
        L_0x00a5:
            r6 = r4
            goto L_0x00a8
        L_0x00a7:
            r6 = r15
        L_0x00a8:
            r5 = r5 | r6
            r6 = r8 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r6 <= r9) goto L_0x00b7
            boolean r6 = r7.e(r12)
            if (r6 != 0) goto L_0x00bd
        L_0x00b7:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != r9) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r4 = r15
        L_0x00bd:
            r4 = r4 | r5
            java.lang.Object r5 = r20.D()
            if (r4 != 0) goto L_0x00ca
            java.lang.Object r4 = r14.a()
            if (r5 != r4) goto L_0x00d6
        L_0x00ca:
            ap.b r5 = new ap.b
            r8 = r5
            r9 = r16
            r14 = r0
            r8.<init>(r9, r10, r11, r12, r14)
            r7.u(r5)
        L_0x00d6:
            nI.l r5 = (nI.C17642l) r5
            r20.P()
            U0.P.c(r1, r5, r7, r2)
            android.location.Location r0 = f(r0)
            U0.A1 r0 = U0.p1.q(r0, r7, r15)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00ef
            U0.C4895p.R()
        L_0x00ef:
            r20.P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.c.d(boolean, int, long, U0.m, int, int):U0.A1");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 e() {
        return u1.e((Object) null, (o1) null, 2, (Object) null);
    }

    private static final Location f(C4899r0<Location> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void g(C4899r0<Location> r0Var, Location location) {
        r0Var.setValue(location);
    }

    /* access modifiers changed from: private */
    public static final L h(boolean z10, Context context, int i10, long j10, C4899r0 r0Var, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        O o10 = new O();
        O o11 = new O();
        if (z10) {
            o10.f144348a = g.b(context);
            o11.f144348a = new a(r0Var);
            LocationRequest a10 = new LocationRequest.a(i10, j10).k(true).a();
            C17542s.i(a10, "build(...)");
            try {
                C17542s.g(((C8594c) o10.f144348a).b(a10, (f) o11.f144348a, (Looper) null));
            } catch (Exception e10) {
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a("Failed to get location updates", e10);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    if (str2 == null) {
                        String name = m10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, e10, str);
                }
                C16807N n10 = C16807N.f139792a;
            }
        }
        return new b(o10, o11);
    }
}
