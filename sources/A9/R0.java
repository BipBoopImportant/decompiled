package a9;

import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.internal.features.srm.StaticResourceManager$processResources$1", f = "StaticResourceManager.kt", l = {71}, m = "invokeSuspend")
public final class R0 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42232c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6807d1 f42233d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ List<C6782a0> f42234e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f42235f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R0(C6807d1 d1Var, List<C6782a0> list, int i10, C17164e<? super R0> eVar) {
        super(2, eVar);
        this.f42233d = d1Var;
        this.f42234e = list;
        this.f42235f = i10;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new R0(this.f42233d, this.f42234e, this.f42235f, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((R0) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r13.f42232c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            XH.y.b(r14)
            goto L_0x0104
        L_0x0011:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0019:
            XH.y.b(r14)
            a9.d1 r14 = r13.f42233d
            D8.c r14 = r14.f42503f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Try to process "
            r1.<init>(r4)
            java.util.List<a9.a0> r4 = r13.f42234e
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r4 = " resources."
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r14.f(r1)
            java.util.List<a9.a0> r14 = r13.f42234e
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r4 = YH.C16877v.y(r14, r4)
            r1.<init>(r4)
            java.util.Iterator r14 = r14.iterator()
        L_0x004d:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x005f
            java.lang.Object r4 = r14.next()
            a9.a0 r4 = (a9.C6782a0) r4
            java.lang.String r4 = r4.f42429a
            r1.add(r4)
            goto L_0x004d
        L_0x005f:
            a9.d1 r14 = r13.f42233d
            a9.p r14 = r14.f42498a
            int r4 = r13.f42235f
            r14.getClass()
            java.lang.String r5 = "keys"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            com.contentsquare.android.internal.features.srm.SrmJson$Payload r5 = new com.contentsquare.android.internal.features.srm.SrmJson$Payload
            r5.<init>(r4, r1)
            kK.c$a r4 = kK.C17514c.f144280d
            r4.a()
            com.contentsquare.android.internal.features.srm.SrmJson$Payload$a r6 = com.contentsquare.android.internal.features.srm.SrmJson$Payload.Companion
            kotlinx.serialization.KSerializer r6 = r6.serializer()
            java.lang.String r9 = r4.b(r6, r5)
            C8.a r7 = r14.f42785a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            XH.o r6 = r14.f42788d
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r5.append(r6)
            java.lang.String r6 = "/exist"
            r5.append(r6)
            java.lang.String r8 = r5.toString()
            r11 = 4
            r12 = 0
            r10 = 0
            C8.d r5 = C8.a.g(r7, r8, r9, r10, r11, r12)
            java.lang.Throwable r7 = r5.d()
            if (r7 == 0) goto L_0x00c8
            D8.c r4 = r14.f42787c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to request resources existence at: "
            r5.<init>(r8)
            XH.o r14 = r14.f42788d
            java.lang.Object r14 = r14.getValue()
            java.lang.String r14 = (java.lang.String) r14
            r5.append(r14)
            r5.append(r6)
            java.lang.String r14 = r5.toString()
            r4.i(r7, r14)
            goto L_0x00eb
        L_0x00c8:
            java.lang.String r5 = r5.g()     // Catch:{ q -> 0x00e3, IllegalArgumentException -> 0x00e1 }
            if (r5 == 0) goto L_0x00eb
            r4.a()     // Catch:{ q -> 0x00e3, IllegalArgumentException -> 0x00e1 }
            jK.f r6 = new jK.f     // Catch:{ q -> 0x00e3, IllegalArgumentException -> 0x00e1 }
            jK.Y0 r7 = jK.Y0.f144077a     // Catch:{ q -> 0x00e3, IllegalArgumentException -> 0x00e1 }
            r6.<init>(r7)     // Catch:{ q -> 0x00e3, IllegalArgumentException -> 0x00e1 }
            kotlinx.serialization.KSerializer r6 = gK.C17294a.u(r6)     // Catch:{ q -> 0x00e3, IllegalArgumentException -> 0x00e1 }
            java.lang.Object r14 = r4.c(r6, r5)     // Catch:{ q -> 0x00e3, IllegalArgumentException -> 0x00e1 }
            goto L_0x00ec
        L_0x00e1:
            r4 = move-exception
            goto L_0x00e4
        L_0x00e3:
            r4 = move-exception
        L_0x00e4:
            D8.c r14 = r14.f42787c
            java.lang.String r5 = "Failed to parse exist JSON response"
            a9.H1.a(r14, r5, r4)
        L_0x00eb:
            r14 = r3
        L_0x00ec:
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L_0x011a
            a9.d1 r14 = r13.f42233d
            D8.c r14 = r14.f42503f
            java.lang.String r1 = "Retry mechanism will wait 10 seconds and try to process resources again"
            r14.f(r1)
            r13.f42232c = r2
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r14 = QJ.C16297b0.b(r1, r13)
            if (r14 != r0) goto L_0x0104
            return r0
        L_0x0104:
            a9.d1 r14 = r13.f42233d
            int r0 = r13.f42235f
            java.util.List<a9.a0> r1 = r13.f42234e
            QJ.Q r4 = r14.f42505h
            a9.R0 r7 = new a9.R0
            r7.<init>(r14, r1, r0, r3)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            QJ.F0 unused = QJ.C16314k.d(r4, r5, r6, r7, r8, r9)
            goto L_0x0347
        L_0x011a:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0129
            a9.d1 r14 = r13.f42233d
            com.contentsquare.android.internal.features.srm.SrmKeysCache r14 = r14.f42499b
            r14.c(r1)
            goto L_0x0347
        L_0x0129:
            a9.d1 r0 = r13.f42233d
            com.contentsquare.android.internal.features.srm.SrmKeysCache r0 = r0.f42499b
            r0.c(r1)
            java.util.List<a9.a0> r0 = r13.f42234e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x013b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0154
            java.lang.Object r2 = r0.next()
            r4 = r2
            a9.a0 r4 = (a9.C6782a0) r4
            java.lang.String r4 = r4.f42429a
            boolean r4 = r14.contains(r4)
            if (r4 == 0) goto L_0x013b
            r1.add(r2)
            goto L_0x013b
        L_0x0154:
            a9.d1 r14 = r13.f42233d
            D8.c r14 = r14.f42503f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Resources to cache: "
            r0.<init>(r2)
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r2 = " elements"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r14.f(r0)
            a9.d1 r14 = r13.f42233d
            int r0 = r13.f42235f
            a9.S r2 = r14.f42504g
            r2.getClass()
            java.lang.String r4 = "resourcesToSend"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            a9.L r4 = new a9.L
            r4.<init>(r0, r2, r1, r3)
            GJ.h r0 = GJ.C15768k.b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x018d:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "data"
            if (r1 == 0) goto L_0x01f7
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            a9.Z6 r3 = r14.f42500c
            r3.getClass()
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r3.f42428e
            r2.append(r4)
            java.lang.String r4 = java.io.File.separator
            r2.append(r4)
            G8.t r4 = r3.f42425b
            long r4 = r4.a()
            r2.append(r4)
            r4 = 95
            r2.append(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f42427d
            int r4 = r4.incrementAndGet()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            D8.c r4 = r3.f42426c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Storing srm file to path: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r6 = ". Size: "
            r5.append(r6)
            int r6 = r1.length
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f(r5)
            G8.h r4 = r3.f42424a
            java.lang.String r5 = r3.f42428e
            r4.o(r5)
            G8.h r3 = r3.f42424a
            r4 = 0
            r3.s(r2, r1, r4)
            goto L_0x018d
        L_0x01f7:
            a9.d1 r14 = r13.f42233d
            a9.Z6 r0 = r14.f42500c
            G8.h r1 = r0.f42424a
            java.lang.String r3 = r0.f42428e
            a9.Q6 r4 = a9.Q6.f42231c
            java.util.List r1 = r1.m(r3, r4)
            D8.c r3 = r0.f42426c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Loading srm file from disk: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.f(r4)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0221:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0265
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.f42428e
            r5.append(r6)
            java.lang.String r6 = java.io.File.separator
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            G8.h r6 = r0.f42424a
            byte[] r5 = r6.p(r5)
            G8.h$a r6 = G8.h.f36271b
            byte[] r6 = r6.a()
            boolean r6 = java.util.Arrays.equals(r5, r6)
            if (r6 != 0) goto L_0x0221
            XH.v r4 = XH.C16796C.a(r4, r5)
            java.lang.Object r5 = r4.c()
            java.lang.Object r4 = r4.d()
            r3.put(r5, r4)
            goto L_0x0221
        L_0x0265:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x026d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0347
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            r6 = r1
            byte[] r6 = (byte[]) r6
            a9.p r1 = r14.f42498a
            r1.getClass()
            kotlin.jvm.internal.C17542s.j(r6, r2)
            C8.a r4 = r1.f42785a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            XH.o r7 = r1.f42788d
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r5.append(r7)
            java.lang.String r11 = "/put"
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r9 = 8
            r10 = 0
            java.lang.String r7 = "1"
            r8 = 0
            C8.d r4 = C8.a.i(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Throwable r5 = r4.d()
            if (r5 == 0) goto L_0x02d8
            D8.c r0 = r1.f42787c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to send static resources at: "
            r2.<init>(r3)
            XH.o r1 = r1.f42788d
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            r0.i(r5, r1)
            goto L_0x02de
        L_0x02d8:
            java.lang.String r4 = r4.g()
            if (r4 != 0) goto L_0x02e6
        L_0x02de:
            D8.c r14 = r14.f42503f
            java.lang.String r0 = "Something went wrong, a resources file could not be sent to the server."
            r14.f(r0)
            goto L_0x0347
        L_0x02e6:
            D8.c r1 = r1.f42787c
            java.lang.String r5 = "Static resources successfully sent. SRM response: "
            java.lang.String r4 = r5.concat(r4)
            r1.f(r4)
            D8.c r1 = r14.f42503f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "File successfully sent to server: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            r1.f(r4)
            a9.Z6 r1 = r14.f42500c
            r1.getClass()
            java.lang.String r4 = "filePath"
            kotlin.jvm.internal.C17542s.j(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r1.f42428e
            r4.append(r5)
            java.lang.String r5 = java.io.File.separator
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            G8.h r5 = r1.f42424a
            boolean r4 = r5.b(r4)
            D8.c r1 = r1.f42426c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Deleted srm file path: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ". Success: "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r1.f(r3)
            goto L_0x026d
        L_0x0347:
            XH.N r14 = XH.C16807N.f139792a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.R0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
