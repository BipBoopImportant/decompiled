package io.ktor.utils.io;

import dI.C17164e;
import io.ktor.utils.io.internal.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "dst", "", "limit", "b", "(Lio/ktor/utils/io/g;Lio/ktor/utils/io/j;JLdI/e;)Ljava/lang/Object;", "c", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.utils.io.ByteReadChannelJVMKt", f = "ByteReadChannelJVM.kt", l = {309, 312}, m = "copyToImpl")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f143716c;

        /* renamed from: d  reason: collision with root package name */
        Object f143717d;

        /* renamed from: e  reason: collision with root package name */
        Object f143718e;

        /* renamed from: f  reason: collision with root package name */
        long f143719f;

        /* renamed from: g  reason: collision with root package name */
        long f143720g;

        /* renamed from: h  reason: collision with root package name */
        int f143721h;

        /* renamed from: i  reason: collision with root package name */
        int f143722i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f143723j;

        /* renamed from: k  reason: collision with root package name */
        int f143724k;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f143723j = obj;
            this.f143724k |= Integer.MIN_VALUE;
            return h.c((g) null, (j) null, 0, this);
        }
    }

    public static final Object b(g gVar, j jVar, long j10, C17164e<? super Long> eVar) {
        if (gVar != jVar) {
            return j10 == 0 ? b.f(0) : (!(gVar instanceof a) || !(jVar instanceof a)) ? (!(gVar instanceof f) || !(jVar instanceof f)) ? c(gVar, jVar, j10, eVar) : j.b((f) gVar, (f) jVar, Long.MAX_VALUE, eVar) : ((a) jVar).P((a) gVar, j10, (io.ktor.utils.io.internal.d) null, eVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: SH.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: io.ktor.utils.io.j} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f A[SYNTHETIC, Splitter:B:23:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8 A[SYNTHETIC, Splitter:B:37:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(io.ktor.utils.io.g r19, io.ktor.utils.io.j r20, long r21, dI.C17164e<? super java.lang.Long> r23) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof io.ktor.utils.io.h.a
            if (r1 == 0) goto L_0x0015
            r1 = r0
            io.ktor.utils.io.h$a r1 = (io.ktor.utils.io.h.a) r1
            int r2 = r1.f143724k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f143724k = r2
            goto L_0x001a
        L_0x0015:
            io.ktor.utils.io.h$a r1 = new io.ktor.utils.io.h$a
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f143723j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r1.f143724k
            r4 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x006b
            if (r3 == r7) goto L_0x0053
            if (r3 != r6) goto L_0x004b
            int r3 = r1.f143722i
            long r8 = r1.f143720g
            int r10 = r1.f143721h
            long r11 = r1.f143719f
            java.lang.Object r13 = r1.f143718e
            SH.a r13 = (SH.C16416a) r13
            java.lang.Object r14 = r1.f143717d
            io.ktor.utils.io.j r14 = (io.ktor.utils.io.j) r14
            java.lang.Object r15 = r1.f143716c
            io.ktor.utils.io.g r15 = (io.ktor.utils.io.g) r15
            XH.y.b(r0)     // Catch:{ all -> 0x0048 }
            r4 = r1
            r1 = r14
            r0 = r15
            goto L_0x00e4
        L_0x0048:
            r0 = move-exception
            goto L_0x010f
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0053:
            long r8 = r1.f143720g
            int r3 = r1.f143721h
            long r10 = r1.f143719f
            java.lang.Object r12 = r1.f143718e
            r13 = r12
            SH.a r13 = (SH.C16416a) r13
            java.lang.Object r12 = r1.f143717d
            r14 = r12
            io.ktor.utils.io.j r14 = (io.ktor.utils.io.j) r14
            java.lang.Object r12 = r1.f143716c
            io.ktor.utils.io.g r12 = (io.ktor.utils.io.g) r12
            XH.y.b(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x00bb
        L_0x006b:
            XH.y.b(r0)
            SH.a$d r0 = SH.C16416a.f138260j
            TH.f r0 = r0.c()
            java.lang.Object r0 = r0.Q1()
            SH.a r0 = (SH.C16416a) r0
            boolean r3 = r20.o()
            r3 = r3 ^ r7
            r8 = r21
            r13 = r0
            r10 = r3
            r11 = r4
            r0 = r19
            r3 = r1
            r1 = r20
        L_0x0089:
            long r14 = r8 - r11
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x0100
            int r4 = r13.f()     // Catch:{ all -> 0x00f2 }
            long r4 = (long) r4     // Catch:{ all -> 0x00f2 }
            long r4 = java.lang.Math.min(r4, r14)     // Catch:{ all -> 0x00f2 }
            int r4 = (int) r4     // Catch:{ all -> 0x00f2 }
            r13.t(r4)     // Catch:{ all -> 0x00f2 }
            r3.f143716c = r0     // Catch:{ all -> 0x00f2 }
            r3.f143717d = r1     // Catch:{ all -> 0x00f2 }
            r3.f143718e = r13     // Catch:{ all -> 0x00f2 }
            r3.f143719f = r8     // Catch:{ all -> 0x00f2 }
            r3.f143721h = r10     // Catch:{ all -> 0x00f2 }
            r3.f143720g = r11     // Catch:{ all -> 0x00f2 }
            r3.f143724k = r7     // Catch:{ all -> 0x00f2 }
            java.lang.Object r4 = r0.g(r13, r3)     // Catch:{ all -> 0x00f2 }
            if (r4 != r2) goto L_0x00b1
            return r2
        L_0x00b1:
            r14 = r1
            r1 = r3
            r3 = r10
            r17 = r11
            r12 = r0
            r0 = r4
            r10 = r8
            r8 = r17
        L_0x00bb:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x0048 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0048 }
            r4 = -1
            if (r0 == r4) goto L_0x00fe
            r1.f143716c = r12     // Catch:{ all -> 0x0048 }
            r1.f143717d = r14     // Catch:{ all -> 0x0048 }
            r1.f143718e = r13     // Catch:{ all -> 0x0048 }
            r1.f143719f = r10     // Catch:{ all -> 0x0048 }
            r1.f143721h = r3     // Catch:{ all -> 0x0048 }
            r1.f143720g = r8     // Catch:{ all -> 0x0048 }
            r1.f143722i = r0     // Catch:{ all -> 0x0048 }
            r1.f143724k = r6     // Catch:{ all -> 0x0048 }
            java.lang.Object r4 = r14.k(r13, r1)     // Catch:{ all -> 0x0048 }
            if (r4 != r2) goto L_0x00db
            return r2
        L_0x00db:
            r4 = r1
            r1 = r14
            r17 = r3
            r3 = r0
            r0 = r12
            r11 = r10
            r10 = r17
        L_0x00e4:
            long r14 = (long) r3
            long r8 = r8 + r14
            if (r10 == 0) goto L_0x00f5
            int r3 = r0.e()     // Catch:{ all -> 0x00f2 }
            if (r3 != 0) goto L_0x00f5
            r1.flush()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f5
        L_0x00f2:
            r0 = move-exception
            r14 = r1
            goto L_0x010f
        L_0x00f5:
            r3 = r4
            r4 = 0
            r17 = r8
            r8 = r11
            r11 = r17
            goto L_0x0089
        L_0x00fe:
            r11 = r8
            goto L_0x0101
        L_0x0100:
            r14 = r1
        L_0x0101:
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.f(r11)     // Catch:{ all -> 0x0048 }
            SH.a$d r1 = SH.C16416a.f138260j
            TH.f r1 = r1.c()
            r13.D(r1)
            return r0
        L_0x010f:
            r14.a(r0)     // Catch:{ all -> 0x0113 }
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            SH.a$d r1 = SH.C16416a.f138260j
            TH.f r1 = r1.c()
            r13.D(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.c(io.ktor.utils.io.g, io.ktor.utils.io.j, long, dI.e):java.lang.Object");
    }
}
