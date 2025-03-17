package a9;

import E8.c;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

/* renamed from: a9.h5  reason: case insensitive filesystem */
public final class C6843h5 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f42598c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ E f42599d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Y4 f42600e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C6903p1 f42601f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f42602g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6843h5(c cVar, E e10, Y4 y42, C6903p1 p1Var, boolean z10) {
        super(0);
        this.f42598c = cVar;
        this.f42599d = e10;
        this.f42600e = y42;
        this.f42601f = p1Var;
        this.f42602g = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r5 = r5.o();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r10 = this;
            E8.c r0 = r10.f42598c
            a9.E r1 = r10.f42599d
            a9.Y4 r2 = r10.f42600e
            a9.p1 r3 = r10.f42601f
            boolean r4 = r10.f42602g
            A8.b r5 = r1.f41974b
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r5 = r5.b()
            r6 = 0
            if (r5 == 0) goto L_0x001e
            com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r5 = r5.o()
            if (r5 == 0) goto L_0x001e
            float r5 = r5.i()
            goto L_0x001f
        L_0x001e:
            r5 = r6
        L_0x001f:
            E8.b r7 = E8.b.RECORDING_RATE_CONFIG
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = r0.c(r7, r8)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            int r6 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            if (r4 == 0) goto L_0x0037
        L_0x0033:
            r0.i(r7, r5)
            goto L_0x0038
        L_0x0037:
            r5 = r9
        L_0x0038:
            r6 = 100
            float r7 = (float) r6
            float r5 = r5 * r7
            int r5 = pI.C17752b.e(r5)
            E8.b r7 = E8.b.RECORDING_SEGMENT_SAMPLE
            r8 = -1
            int r9 = r0.d(r7, r8)
            if (r9 == r8) goto L_0x004b
            if (r4 == 0) goto L_0x0057
        L_0x004b:
            r2.getClass()
            java.util.Random r2 = a9.Y4.f42404a
            int r9 = r2.nextInt(r6)
            r0.j(r7, r9)
        L_0x0057:
            r0 = 1
            r2 = 0
            if (r9 >= r5) goto L_0x005d
            r6 = r0
            goto L_0x005e
        L_0x005d:
            r6 = r2
        L_0x005e:
            if (r6 == 0) goto L_0x0065
            a9.k1 r1 = a9.C6863k1.RANDOM_SAMPLING
            r3.f42791a = r1
            goto L_0x008d
        L_0x0065:
            E8.c r7 = r1.f41973a
            E8.b r8 = E8.b.SESSION_REPLAY_ETR_ENABLED
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L_0x0078
            if (r4 != 0) goto L_0x0078
            E8.c r1 = r1.f41973a
            boolean r1 = r1.b(r8, r2)
            goto L_0x0085
        L_0x0078:
            E8.c r4 = r1.f41973a
            boolean r7 = r1.a()
            r4.h(r8, r7)
            boolean r1 = r1.a()
        L_0x0085:
            if (r1 == 0) goto L_0x008c
            a9.k1 r1 = a9.C6863k1.ETR_SAMPLING
            r3.f42791a = r1
            goto L_0x008d
        L_0x008c:
            r0 = r2
        L_0x008d:
            D8.c r1 = a9.C6907p5.f42800a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "recordingRate = "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = ", randomSegmentSample = "
            r2.append(r4)
            r2.append(r9)
            java.lang.String r4 = ", isRandomlyDrawnForRecording = "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = ", samplingMode = "
            r2.append(r4)
            a9.k1 r3 = r3.f42791a
            java.lang.String r3 = r3.name()
            r2.append(r3)
            java.lang.String r3 = "isDrawnForRecording = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.f(r2)
            if (r0 == 0) goto L_0x00cb
            a9.P0 r0 = a9.P0.PROPAGATE_START
            goto L_0x00cd
        L_0x00cb:
            a9.P0 r0 = a9.P0.PROPAGATE_STOP
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6843h5.invoke():java.lang.Object");
    }
}
