package ea;

import G9.C6521b;
import H9.C6530d;
import H9.C6536j;
import H9.C6537k;
import H9.C6539m;
import K9.C6607e;
import K9.C6610h;
import K9.C6614l;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import j0.b0;
import java.util.Objects;
import na.C8592a;
import na.C8596e;
import na.x;
import xa.C8960a;
import xa.C8972m;

public final class I extends C6610h {

    /* renamed from: M  reason: collision with root package name */
    public static final /* synthetic */ int f50908M = 0;

    /* renamed from: I  reason: collision with root package name */
    private final b0 f50909I = new b0();

    /* renamed from: J  reason: collision with root package name */
    private final b0 f50910J = new b0();

    /* renamed from: K  reason: collision with root package name */
    private final b0 f50911K = new b0();

    /* renamed from: L  reason: collision with root package name */
    private final b0 f50912L = new b0();

    public I(Context context, Looper looper, C6607e eVar, C6530d dVar, C6539m mVar) {
        super(context, looper, 23, eVar, dVar, mVar);
    }

    private final boolean m0(C6521b bVar) {
        C6521b bVar2;
        C6521b[] n10 = n();
        if (n10 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= n10.length) {
                    bVar2 = null;
                    break;
                }
                bVar2 = n10[i10];
                if (bVar.x().equals(bVar2.x())) {
                    break;
                }
                i10++;
            }
            if (bVar2 != null && bVar2.B() >= bVar.B()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void M(int i10) {
        super.M(i10);
        synchronized (this.f50909I) {
            this.f50909I.clear();
        }
        synchronized (this.f50910J) {
            this.f50910J.clear();
        }
        synchronized (this.f50911K) {
            this.f50911K.clear();
        }
    }

    public final boolean S() {
        return true;
    }

    public final int m() {
        return 11717000;
    }

    public final void n0(C8596e eVar, C8972m mVar) {
        if (m0(x.f55169j)) {
            ((r0) D()).e3(eVar, O.B(new B(mVar)));
        } else if (m0(x.f55165f)) {
            ((r0) D()).v2(eVar, new B(mVar));
        } else {
            mVar.c(((r0) D()).zzs());
        }
    }

    public final void o0(C8592a aVar, C8960a aVar2, C8972m mVar) {
        if (m0(x.f55169j)) {
            C6614l K02 = ((r0) D()).K0(aVar, O.B(new B(mVar)));
            if (aVar2 != null) {
                aVar2.b(new N(K02));
            }
        } else if (m0(x.f55164e)) {
            C6614l b22 = ((r0) D()).b2(aVar, new B(mVar));
            if (aVar2 != null) {
                aVar2.b(new L(b22));
            }
        } else {
            C6536j b10 = C6537k.b(new C7840y(this, mVar), k0.a(), "GetCurrentLocation");
            C6536j.a b11 = b10.b();
            Objects.requireNonNull(b11);
            C7841z zVar = new C7841z(this, b10, mVar);
            C8972m mVar2 = new C8972m();
            LocationRequest.a aVar3 = new LocationRequest.a(aVar.J(), 0);
            aVar3.i(0);
            aVar3.b(aVar.x());
            aVar3.c(aVar.B());
            aVar3.e(aVar.F());
            aVar3.m(aVar.zza());
            aVar3.l(aVar.U());
            aVar3.k(true);
            aVar3.n(aVar.t0());
            p0(zVar, aVar3.a(), mVar2);
            mVar2.a().c(new K(mVar));
            if (aVar2 != null) {
                aVar2.b(new M(this, b11));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056 A[Catch:{ all -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0(ea.D r18, com.google.android.gms.location.LocationRequest r19, xa.C8972m r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            H9.j r3 = r18.zza()
            H9.j$a r4 = r3.b()
            java.util.Objects.requireNonNull(r4)
            G9.b r5 = na.x.f55169j
            boolean r5 = r1.m0(r5)
            j0.b0 r6 = r1.f50910J
            monitor-enter(r6)
            j0.b0 r7 = r1.f50910J     // Catch:{ all -> 0x002e }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x002e }
            ea.H r7 = (ea.H) r7     // Catch:{ all -> 0x002e }
            r8 = 0
            if (r7 == 0) goto L_0x0030
            if (r5 == 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            r7.K3(r3)     // Catch:{ all -> 0x002e }
            r13 = r7
            r7 = r8
            goto L_0x003d
        L_0x002e:
            r0 = move-exception
            goto L_0x0077
        L_0x0030:
            ea.H r3 = new ea.H     // Catch:{ all -> 0x002e }
            r9 = r18
            r3.<init>(r9)     // Catch:{ all -> 0x002e }
            j0.b0 r9 = r1.f50910J     // Catch:{ all -> 0x002e }
            r9.put(r4, r3)     // Catch:{ all -> 0x002e }
            r13 = r3
        L_0x003d:
            if (r5 == 0) goto L_0x0056
            android.os.IInterface r3 = r17.D()     // Catch:{ all -> 0x002e }
            ea.r0 r3 = (ea.r0) r3     // Catch:{ all -> 0x002e }
            java.lang.String r4 = r4.a()     // Catch:{ all -> 0x002e }
            ea.O r4 = ea.O.x(r7, r13, r4)     // Catch:{ all -> 0x002e }
            ea.A r5 = new ea.A     // Catch:{ all -> 0x002e }
            r5.<init>(r8, r2)     // Catch:{ all -> 0x002e }
            r3.c0(r4, r0, r5)     // Catch:{ all -> 0x002e }
            goto L_0x0075
        L_0x0056:
            android.os.IInterface r3 = r17.D()     // Catch:{ all -> 0x002e }
            ea.r0 r3 = (ea.r0) r3     // Catch:{ all -> 0x002e }
            ea.Q r11 = ea.Q.x(r8, r0)     // Catch:{ all -> 0x002e }
            ea.w r15 = new ea.w     // Catch:{ all -> 0x002e }
            r15.<init>(r2, r13)     // Catch:{ all -> 0x002e }
            java.lang.String r16 = r4.a()     // Catch:{ all -> 0x002e }
            ea.T r0 = new ea.T     // Catch:{ all -> 0x002e }
            r12 = 0
            r14 = 0
            r10 = 1
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x002e }
            r3.I0(r0)     // Catch:{ all -> 0x002e }
        L_0x0075:
            monitor-exit(r6)     // Catch:{ all -> 0x002e }
            return
        L_0x0077:
            monitor-exit(r6)     // Catch:{ all -> 0x002e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.I.p0(ea.D, com.google.android.gms.location.LocationRequest, xa.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(H9.C6536j.a r10, boolean r11, xa.C8972m r12) {
        /*
            r9 = this;
            j0.b0 r0 = r9.f50910J
            monitor-enter(r0)
            j0.b0 r1 = r9.f50910J     // Catch:{ all -> 0x0015 }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x0015 }
            r5 = r10
            ea.H r5 = (ea.H) r5     // Catch:{ all -> 0x0015 }
            if (r5 != 0) goto L_0x0017
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0015 }
            r12.c(r10)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r10 = move-exception
            goto L_0x007c
        L_0x0017:
            r5.L3()     // Catch:{ all -> 0x0015 }
            if (r11 == 0) goto L_0x0075
            G9.b r10 = na.x.f55169j     // Catch:{ all -> 0x0015 }
            boolean r10 = r9.m0(r10)     // Catch:{ all -> 0x0015 }
            if (r10 == 0) goto L_0x0059
            android.os.IInterface r10 = r9.D()     // Catch:{ all -> 0x0015 }
            ea.r0 r10 = (ea.r0) r10     // Catch:{ all -> 0x0015 }
            java.lang.String r11 = "ILocationCallback@"
            int r1 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0015 }
            int r2 = r2.length()     // Catch:{ all -> 0x0015 }
            int r2 = r2 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r3.<init>(r2)     // Catch:{ all -> 0x0015 }
            r3.append(r11)     // Catch:{ all -> 0x0015 }
            r3.append(r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0015 }
            r1 = 0
            ea.O r11 = ea.O.x(r1, r5, r11)     // Catch:{ all -> 0x0015 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0015 }
            ea.A r2 = new ea.A     // Catch:{ all -> 0x0015 }
            r2.<init>(r1, r12)     // Catch:{ all -> 0x0015 }
            r10.r1(r11, r2)     // Catch:{ all -> 0x0015 }
            goto L_0x007a
        L_0x0059:
            android.os.IInterface r10 = r9.D()     // Catch:{ all -> 0x0015 }
            ea.r0 r10 = (ea.r0) r10     // Catch:{ all -> 0x0015 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0015 }
            ea.C r7 = new ea.C     // Catch:{ all -> 0x0015 }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x0015 }
            ea.T r11 = new ea.T     // Catch:{ all -> 0x0015 }
            r6 = 0
            r8 = 0
            r2 = 2
            r3 = 0
            r4 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0015 }
            r10.I0(r11)     // Catch:{ all -> 0x0015 }
            goto L_0x007a
        L_0x0075:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0015 }
            r12.c(r10)     // Catch:{ all -> 0x0015 }
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.I.q0(H9.j$a, boolean, xa.m):void");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new q0(iBinder);
    }

    public final C6521b[] v() {
        return x.f55175p;
    }
}
