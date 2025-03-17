package a9;

import F8.e;
import XH.t;
import d9.C7761g;
import d9.C7772s;
import d9.C7773t;
import d9.F;
import d9.N;
import d9.P;
import d9.Q;
import d9.r;
import kotlin.jvm.internal.C17542s;

public final class F4 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final C6906p4 f41996b;

    /* renamed from: c  reason: collision with root package name */
    public final com.contentsquare.android.core.features.config.model.a f41997c;

    /* renamed from: d  reason: collision with root package name */
    public final com.contentsquare.android.core.features.config.model.a f41998d;

    /* renamed from: e  reason: collision with root package name */
    public final e f41999e;

    /* renamed from: f  reason: collision with root package name */
    public final e f42000f;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42001a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f42002b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0020 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0049 */
        static {
            /*
                a9.p4[] r0 = a9.C6906p4.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000b }
            L_0x000b:
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.contentsquare.android.core.features.config.model.a[] r0 = com.contentsquare.android.core.features.config.model.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.contentsquare.android.core.features.config.model.a r4 = com.contentsquare.android.core.features.config.model.a.LOW     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
            L_0x0020:
                com.contentsquare.android.core.features.config.model.a r4 = com.contentsquare.android.core.features.config.model.a.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.contentsquare.android.core.features.config.model.a r4 = com.contentsquare.android.core.features.config.model.a.HIGH     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0030:
                f42001a = r0
                F8.e[] r0 = F8.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                F8.e r4 = F8.e.OFFLINE     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                F8.e r1 = F8.e.CONNECTIVITY_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                F8.e r1 = F8.e.WIFI     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                f42002b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.F4.a.<clinit>():void");
        }
    }

    public F4(long j10, C6906p4 p4Var, com.contentsquare.android.core.features.config.model.a aVar, com.contentsquare.android.core.features.config.model.a aVar2, e eVar, e eVar2) {
        C17542s.j(p4Var, "changeReason");
        C17542s.j(aVar, "previousQualityLevel");
        C17542s.j(aVar2, "currentQualityLevel");
        C17542s.j(eVar, "previousConnectionType");
        C17542s.j(eVar2, "currentConnectionType");
        this.f41996b = p4Var;
        this.f41997c = aVar;
        this.f41998d = aVar2;
        this.f41999e = eVar;
        this.f42000f = eVar2;
        b(j10);
    }

    public final F c() {
        P.d dVar;
        Q q10;
        Q q11;
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        r.a.C0831a aVar = r.a.f50818b;
        P.a m10 = P.m();
        C17542s.i(m10, "newBuilder()");
        r.a a11 = aVar.a(m10);
        a11.e(a());
        int ordinal = this.f41996b.ordinal();
        if (ordinal == 0) {
            dVar = P.d.REASON_CONFIG_APPLIED;
        } else if (ordinal == 1) {
            dVar = P.d.REASON_NETWORK_CHANGED;
        } else if (ordinal == 2) {
            dVar = P.d.REASON_CPU_USAGE_CHANGED;
        } else {
            throw new t();
        }
        a11.d(dVar);
        r rVar = r.f50817a;
        C7773t.a aVar2 = C7773t.f50822b;
        P.c.a k10 = P.c.k();
        C17542s.i(k10, "newBuilder()");
        C7773t a12 = aVar2.a(k10);
        com.contentsquare.android.core.features.config.model.a aVar3 = this.f41997c;
        int[] iArr = a.f42001a;
        int i10 = iArr[aVar3.ordinal()];
        if (i10 == 1) {
            q10 = Q.RECORDING_QUALITY_LOW;
        } else if (i10 == 2) {
            q10 = Q.RECORDING_QUALITY_MEDIUM;
        } else if (i10 == 3) {
            q10 = Q.RECORDING_QUALITY_HIGH;
        } else {
            throw new t();
        }
        a12.c(q10);
        int i11 = iArr[this.f41998d.ordinal()];
        if (i11 == 1) {
            q11 = Q.RECORDING_QUALITY_LOW;
        } else if (i11 == 2) {
            q11 = Q.RECORDING_QUALITY_MEDIUM;
        } else if (i11 == 3) {
            q11 = Q.RECORDING_QUALITY_HIGH;
        } else {
            throw new t();
        }
        a12.b(q11);
        a11.c(a12.a());
        C7772s.a aVar4 = C7772s.f50820b;
        P.b.a k11 = P.b.k();
        C17542s.i(k11, "newBuilder()");
        C7772s a13 = aVar4.a(k11);
        e eVar = this.f41999e;
        int[] iArr2 = a.f42002b;
        int i12 = iArr2[eVar.ordinal()];
        a13.c((i12 == 1 || i12 == 2) ? N.NETWORK_STATUS_OFFLINE : i12 != 3 ? N.NETWORK_STATUS_CELLULAR : N.NETWORK_STATUS_WIFI);
        int i13 = iArr2[this.f42000f.ordinal()];
        a13.b((i13 == 1 || i13 == 2) ? N.NETWORK_STATUS_OFFLINE : i13 != 3 ? N.NETWORK_STATUS_CELLULAR : N.NETWORK_STATUS_WIFI);
        a11.b(a13.a());
        a10.l(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
