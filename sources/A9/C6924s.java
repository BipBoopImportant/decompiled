package a9;

import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.internal.core.telemetry.performance.CpuCollector$dataFlow$1", f = "CpuCollector.kt", l = {68, 69}, m = "invokeSuspend")
/* renamed from: a9.s  reason: case insensitive filesystem */
public final class C6924s extends l implements p<C16533h<? super Float>, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42838c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f42839d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ I f42840e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6924s(I i10, C17164e<? super C6924s> eVar) {
        super(2, eVar);
        this.f42840e = i10;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        C6924s sVar = new C6924s(this.f42840e, eVar);
        sVar.f42839d = obj;
        return sVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        C6924s sVar = new C6924s(this.f42840e, (C17164e) obj2);
        sVar.f42839d = (C16533h) obj;
        return sVar.invokeSuspend(C16807N.f139792a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.String[]} */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:(1:(5:4|10|(2:12|(1:14))|47|48)(2:5|6))(1:7))(5:9|10|(1:47)(0)|47|48)|8|15|16|17|18|19|(2:21|(1:23))|26|27|28|29|39|(1:41)(1:42)|43|(1:45)(5:46|10|(0)|47|48)|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        a9.H1.a((D8.c) r6.f42060d.getValue(), "failed to read " + r6.f42057a + " => " + XH.C16816g.b(r0), r0);
        r0 = r7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = eI.C17187b.f()
            int r0 = r1.f42838c
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r4) goto L_0x0020
            if (r0 != r3) goto L_0x0018
            java.lang.Object r0 = r1.f42839d
            TJ.h r0 = (TJ.C16533h) r0
            XH.y.b(r18)
            goto L_0x0030
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0020:
            java.lang.Object r0 = r1.f42839d
            TJ.h r0 = (TJ.C16533h) r0
            XH.y.b(r18)
        L_0x0027:
            r5 = r0
            goto L_0x0047
        L_0x0029:
            XH.y.b(r18)
            java.lang.Object r0 = r1.f42839d
            TJ.h r0 = (TJ.C16533h) r0
        L_0x0030:
            dI.i r5 = r17.getContext()
            boolean r5 = QJ.I0.p(r5)
            if (r5 == 0) goto L_0x0141
            r1.f42839d = r0
            r1.f42838c = r4
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Object r5 = QJ.C16297b0.b(r5, r1)
            if (r5 != r2) goto L_0x0027
            return r2
        L_0x0047:
            a9.I r6 = r1.f42840e
            java.lang.String r0 = a9.I.f42056g
            r6.getClass()
            r0 = 0
            java.lang.String[] r7 = new java.lang.String[r0]
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ IOException -> 0x008a }
            java.io.FileReader r9 = new java.io.FileReader     // Catch:{ IOException -> 0x008a }
            java.lang.String r10 = r6.f42057a     // Catch:{ IOException -> 0x008a }
            r9.<init>(r10)     // Catch:{ IOException -> 0x008a }
            r8.<init>(r9)     // Catch:{ IOException -> 0x008a }
            java.lang.String r11 = r8.readLine()     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0082
            int r9 = r11.length()     // Catch:{ all -> 0x007f }
            if (r9 <= 0) goto L_0x0082
            java.lang.String r9 = " "
            java.lang.String[] r12 = new java.lang.String[]{r9}     // Catch:{ all -> 0x007f }
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            java.util.List r9 = HJ.C15854t.Y0(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x007f }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x007f }
            java.lang.Object[] r7 = r9.toArray(r0)     // Catch:{ all -> 0x007f }
            goto L_0x0082
        L_0x007f:
            r0 = move-exception
            r9 = r0
            goto L_0x008c
        L_0x0082:
            r0 = r7
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x007f }
            r9 = 0
            jI.C17416c.a(r8, r9)     // Catch:{ IOException -> 0x008a }
            goto L_0x00bd
        L_0x008a:
            r0 = move-exception
            goto L_0x0093
        L_0x008c:
            throw r9     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r10 = r0
            jI.C17416c.a(r8, r9)     // Catch:{ IOException -> 0x008a }
            throw r10     // Catch:{ IOException -> 0x008a }
        L_0x0093:
            XH.o r8 = r6.f42060d
            java.lang.Object r8 = r8.getValue()
            D8.c r8 = (D8.c) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "failed to read "
            r9.<init>(r10)
            java.lang.String r10 = r6.f42057a
            r9.append(r10)
            java.lang.String r10 = " => "
            r9.append(r10)
            java.lang.String r10 = XH.C16816g.b(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            a9.H1.a(r8, r9, r0)
            r0 = r7
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x00bd:
            int r7 = r0.length
            r8 = 21
            if (r7 <= r8) goto L_0x012d
            r7 = 13
            r7 = r0[r7]
            float r7 = java.lang.Float.parseFloat(r7)
            r9 = 14
            r9 = r0[r9]
            float r9 = java.lang.Float.parseFloat(r9)
            r10 = 15
            r10 = r0[r10]
            float r10 = java.lang.Float.parseFloat(r10)
            r11 = 16
            r11 = r0[r11]
            float r11 = java.lang.Float.parseFloat(r11)
            r0 = r0[r8]
            float r0 = java.lang.Float.parseFloat(r0)
            float r7 = r7 + r9
            float r7 = r7 + r10
            float r7 = r7 + r11
            XH.o r8 = r6.f42061e
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            float r8 = (float) r8
            float r7 = r7 / r8
            long r8 = android.os.SystemClock.elapsedRealtime()
            float r8 = (float) r8
            r9 = 1000(0x3e8, float:1.401E-42)
            float r9 = (float) r9
            float r8 = r8 / r9
            XH.o r9 = r6.f42061e
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            float r9 = (float) r9
            float r0 = r0 / r9
            float r8 = r8 - r0
            float r0 = r6.f42058b
            float r0 = r7 - r0
            float r9 = r6.f42059c
            float r9 = r8 - r9
            r10 = 100
            float r10 = (float) r10
            float r0 = r0 / r9
            float r0 = r0 * r10
            java.lang.Runtime r9 = java.lang.Runtime.getRuntime()
            int r9 = r9.availableProcessors()
            float r9 = (float) r9
            float r0 = r0 / r9
            r6.f42058b = r7
            r6.f42059c = r8
            goto L_0x012f
        L_0x012d:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x012f:
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.b.d(r0)
            r1.f42839d = r5
            r1.f42838c = r3
            java.lang.Object r0 = r5.emit(r0, r1)
            if (r0 != r2) goto L_0x013e
            return r2
        L_0x013e:
            r0 = r5
            goto L_0x0030
        L_0x0141:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6924s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
