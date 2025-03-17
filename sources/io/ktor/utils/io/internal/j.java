package io.ktor.utils.io.internal;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/f;", "dst", "", "limit", "b", "(Lio/ktor/utils/io/f;Lio/ktor/utils/io/f;JLdI/e;)Ljava/lang/Object;", "c", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", l = {26, 31, 39}, m = "copyToSequentialImpl")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f143773c;

        /* renamed from: d  reason: collision with root package name */
        Object f143774d;

        /* renamed from: e  reason: collision with root package name */
        long f143775e;

        /* renamed from: f  reason: collision with root package name */
        long f143776f;

        /* renamed from: g  reason: collision with root package name */
        long f143777g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f143778h;

        /* renamed from: i  reason: collision with root package name */
        int f143779i;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f143778h = obj;
            this.f143779i |= Integer.MIN_VALUE;
            return j.b((io.ktor.utils.io.f) null, (io.ktor.utils.io.f) null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", l = {60, 66}, m = "copyToTail")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f143780c;

        /* renamed from: d  reason: collision with root package name */
        Object f143781d;

        /* renamed from: e  reason: collision with root package name */
        int f143782e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f143783f;

        /* renamed from: g  reason: collision with root package name */
        int f143784g;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f143783f = obj;
            this.f143784g |= Integer.MIN_VALUE;
            return j.c((io.ktor.utils.io.f) null, (io.ktor.utils.io.f) null, 0, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(io.ktor.utils.io.f r18, io.ktor.utils.io.f r19, long r20, dI.C17164e<? super java.lang.Long> r22) {
        /*
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof io.ktor.utils.io.internal.j.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            io.ktor.utils.io.internal.j$a r2 = (io.ktor.utils.io.internal.j.a) r2
            int r3 = r2.f143779i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f143779i = r3
            goto L_0x001c
        L_0x0017:
            io.ktor.utils.io.internal.j$a r2 = new io.ktor.utils.io.internal.j$a
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.f143778h
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f143779i
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x006f
            if (r4 == r7) goto L_0x005d
            if (r4 == r6) goto L_0x004c
            if (r4 != r5) goto L_0x0044
            long r10 = r2.f143777g
            long r12 = r2.f143776f
            long r14 = r2.f143775e
            java.lang.Object r0 = r2.f143774d
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.f) r0
            java.lang.Object r4 = r2.f143773c
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            XH.y.b(r1)
            goto L_0x00f3
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            long r10 = r2.f143776f
            long r12 = r2.f143775e
            java.lang.Object r0 = r2.f143774d
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.f) r0
            java.lang.Object r4 = r2.f143773c
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            XH.y.b(r1)
            goto L_0x00cd
        L_0x005d:
            long r10 = r2.f143776f
            long r12 = r2.f143775e
            java.lang.Object r0 = r2.f143774d
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.f) r0
            java.lang.Object r4 = r2.f143773c
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            XH.y.b(r1)
            r14 = r12
            r12 = r10
            goto L_0x00a7
        L_0x006f:
            XH.y.b(r1)
            r1 = r18
            if (r1 == r0) goto L_0x0109
            java.lang.Throwable r4 = r18.c()
            if (r4 == 0) goto L_0x0088
            java.lang.Throwable r1 = r18.c()
            r0.a(r1)
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.f(r8)
            return r0
        L_0x0088:
            r10 = r20
            r12 = r10
        L_0x008b:
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0103
            r2.f143773c = r1
            r2.f143774d = r0
            r2.f143775e = r12
            r2.f143776f = r10
            r2.f143779i = r7
            java.lang.Object r4 = r1.A(r2)
            if (r4 != r3) goto L_0x00a0
            return r3
        L_0x00a0:
            r14 = r12
            r12 = r10
            r16 = r4
            r4 = r1
            r1 = r16
        L_0x00a7:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00b2
            r10 = r12
            r12 = r14
            goto L_0x0103
        L_0x00b2:
            long r10 = r4.X(r0, r12)
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00da
            r2.f143773c = r4
            r2.f143774d = r0
            r2.f143775e = r14
            r2.f143776f = r12
            r2.f143779i = r6
            java.lang.Object r1 = c(r4, r0, r12, r2)
            if (r1 != r3) goto L_0x00cb
            return r3
        L_0x00cb:
            r10 = r12
            r12 = r14
        L_0x00cd:
            java.lang.Number r1 = (java.lang.Number) r1
            long r14 = r1.longValue()
            int r1 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00d8
            goto L_0x0103
        L_0x00d8:
            r1 = r4
            goto L_0x00fa
        L_0x00da:
            int r1 = r0.K()
            if (r1 != 0) goto L_0x00f3
            r2.f143773c = r4
            r2.f143774d = r0
            r2.f143775e = r14
            r2.f143776f = r12
            r2.f143777g = r10
            r2.f143779i = r5
            java.lang.Object r1 = r0.z(r7, r2)
            if (r1 != r3) goto L_0x00f3
            return r3
        L_0x00f3:
            r1 = r4
            r16 = r12
            r12 = r14
            r14 = r10
            r10 = r16
        L_0x00fa:
            long r10 = r10 - r14
            int r4 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x008b
            r0.flush()
            goto L_0x008b
        L_0x0103:
            long r12 = r12 - r10
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.f(r12)
            return r0
        L_0x0109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.j.b(io.ktor.utils.io.f, io.ktor.utils.io.f, long, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: SH.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b A[SYNTHETIC, Splitter:B:32:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(io.ktor.utils.io.f r8, io.ktor.utils.io.f r9, long r10, dI.C17164e<? super java.lang.Long> r12) {
        /*
            boolean r0 = r12 instanceof io.ktor.utils.io.internal.j.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            io.ktor.utils.io.internal.j$b r0 = (io.ktor.utils.io.internal.j.b) r0
            int r1 = r0.f143784g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143784g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.internal.j$b r0 = new io.ktor.utils.io.internal.j$b
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f143783f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143784g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r8 = r0.f143782e
            java.lang.Object r9 = r0.f143780c
            SH.a r9 = (SH.C16416a) r9
            XH.y.b(r12)     // Catch:{ all -> 0x0033 }
            goto L_0x00ac
        L_0x0033:
            r8 = move-exception
            goto L_0x00bb
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            java.lang.Object r8 = r0.f143781d
            r9 = r8
            SH.a r9 = (SH.C16416a) r9
            java.lang.Object r8 = r0.f143780c
            io.ktor.utils.io.f r8 = (io.ktor.utils.io.f) r8
            XH.y.b(r12)     // Catch:{ all -> 0x0033 }
            r7 = r9
            r9 = r8
            r8 = r12
            r12 = r7
            goto L_0x0078
        L_0x004f:
            XH.y.b(r12)
            SH.a$d r12 = SH.C16416a.f138260j
            TH.f r12 = r12.c()
            java.lang.Object r12 = r12.Q1()
            SH.a r12 = (SH.C16416a) r12
            int r2 = r12.f()     // Catch:{ all -> 0x0098 }
            long r5 = (long) r2     // Catch:{ all -> 0x0098 }
            long r10 = tI.C17978n.j(r10, r5)     // Catch:{ all -> 0x0098 }
            int r10 = (int) r10     // Catch:{ all -> 0x0098 }
            r12.t(r10)     // Catch:{ all -> 0x0098 }
            r0.f143780c = r9     // Catch:{ all -> 0x0098 }
            r0.f143781d = r12     // Catch:{ all -> 0x0098 }
            r0.f143784g = r4     // Catch:{ all -> 0x0098 }
            java.lang.Object r8 = r8.g(r12, r0)     // Catch:{ all -> 0x0098 }
            if (r8 != r1) goto L_0x0078
            return r1
        L_0x0078:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ all -> 0x0098 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0098 }
            r10 = -1
            if (r8 != r10) goto L_0x009b
            SH.a$d r8 = SH.C16416a.f138260j     // Catch:{ all -> 0x0098 }
            TH.f r9 = r8.c()     // Catch:{ all -> 0x0098 }
            r12.D(r9)     // Catch:{ all -> 0x0098 }
            r9 = 0
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.b.f(r9)     // Catch:{ all -> 0x0098 }
            TH.f r8 = r8.c()
            r12.D(r8)
            return r9
        L_0x0098:
            r8 = move-exception
            r9 = r12
            goto L_0x00bb
        L_0x009b:
            r0.f143780c = r12     // Catch:{ all -> 0x0098 }
            r10 = 0
            r0.f143781d = r10     // Catch:{ all -> 0x0098 }
            r0.f143782e = r8     // Catch:{ all -> 0x0098 }
            r0.f143784g = r3     // Catch:{ all -> 0x0098 }
            java.lang.Object r9 = r9.k(r12, r0)     // Catch:{ all -> 0x0098 }
            if (r9 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            r9 = r12
        L_0x00ac:
            long r10 = (long) r8
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.b.f(r10)     // Catch:{ all -> 0x0033 }
            SH.a$d r10 = SH.C16416a.f138260j
            TH.f r10 = r10.c()
            r9.D(r10)
            return r8
        L_0x00bb:
            SH.a$d r10 = SH.C16416a.f138260j
            TH.f r10 = r10.c()
            r9.D(r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.j.c(io.ktor.utils.io.f, io.ktor.utils.io.f, long, dI.e):java.lang.Object");
    }
}
