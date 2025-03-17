package a9;

import GJ.C15767j;
import XH.C16807N;
import XH.v;
import dI.C17164e;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import nI.p;

@f(c = "com.contentsquare.android.internal.features.sessionreplay.processing.batch.BatchStorageProcessor$getBatchesFromStorage$1", f = "BatchStorageProcessor.kt", l = {41}, m = "invokeSuspend")
/* renamed from: a9.l2  reason: case insensitive filesystem */
public final class C6872l2 extends k implements p<C15767j<? super v<? extends Long, ? extends C6848i2>>, C17164e<? super C16807N>, Object> {

    /* renamed from: d  reason: collision with root package name */
    public C6943u2 f42676d;

    /* renamed from: e  reason: collision with root package name */
    public Iterator f42677e;

    /* renamed from: f  reason: collision with root package name */
    public int f42678f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f42679g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C6943u2 f42680h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6872l2(C6943u2 u2Var, C17164e<? super C6872l2> eVar) {
        super(2, eVar);
        this.f42680h = u2Var;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        C6872l2 l2Var = new C6872l2(this.f42680h, eVar);
        l2Var.f42679g = obj;
        return l2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        C6872l2 l2Var = new C6872l2(this.f42680h, (C17164e) obj2);
        l2Var.f42679g = (C15767j) obj;
        return l2Var.invokeSuspend(C16807N.f139792a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: GJ.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r13.f42678f
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.util.Iterator r1 = r13.f42677e
            a9.u2 r3 = r13.f42676d
            java.lang.Object r4 = r13.f42679g
            GJ.j r4 = (GJ.C15767j) r4
            XH.y.b(r14)
            goto L_0x0084
        L_0x0017:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001f:
            XH.y.b(r14)
            java.lang.Object r14 = r13.f42679g
            r4 = r14
            GJ.j r4 = (GJ.C15767j) r4
            a9.u2 r14 = r13.f42680h
            a9.F2 r14 = r14.f42882a
            r14.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            G8.h r3 = r14.f41991a
            java.lang.String r5 = r14.f41995e
            java.lang.String[] r3 = r3.n(r5)
            if (r3 != 0) goto L_0x0045
            D8.c r14 = r14.f41993c
            java.lang.String r3 = "error while listing folder, returning an empty array."
            r14.l(r3)
            goto L_0x007e
        L_0x0045:
            java.util.Iterator r3 = kotlin.jvm.internal.C17527c.a(r3)
        L_0x0049:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            long r6 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0061 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0061 }
            r1.add(r6)     // Catch:{ NumberFormatException -> 0x0061 }
            goto L_0x0049
        L_0x0061:
            r6 = move-exception
            D8.c r7 = r14.f41993c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to parse the file name "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = " to Long"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            a9.H1.a(r7, r5, r6)
            goto L_0x0049
        L_0x007b:
            YH.C16877v.B(r1)
        L_0x007e:
            a9.u2 r3 = r13.f42680h
            java.util.Iterator r1 = r1.iterator()
        L_0x0084:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x013f
            java.lang.Object r14 = r1.next()
            java.lang.Number r14 = (java.lang.Number) r14
            long r5 = r14.longValue()
            a9.F2 r14 = r3.f42882a
            D8.c r7 = r14.f41993c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Retrieving file content for id "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r7.f(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r14.f41995e
            r7.append(r8)
            java.lang.String r8 = java.io.File.separator
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            G8.h r14 = r14.f41991a
            byte[] r14 = r14.p(r7)
            D8.c r7 = a9.C6848i2.f42607c
            r7 = 0
            if (r14 != 0) goto L_0x00cb
            goto L_0x0120
        L_0x00cb:
            int r8 = r14.length
            r9 = 4
            if (r8 > r9) goto L_0x00d7
            D8.c r14 = a9.C6848i2.f42607c
            java.lang.String r8 = "couldn't transform bytes because data is too small"
            r14.h(r8)
            goto L_0x0120
        L_0x00d7:
            r8 = 0
            int r10 = a9.C6848i2.a.a(r14, r8)
            if (r10 != r2) goto L_0x0108
            int r9 = a9.C6848i2.a.a(r14, r9)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r10 = a9.C6848i2.a.b(r14, r9)     // Catch:{ Exception -> 0x00ff }
            int r11 = r9 + 8
            int r11 = a9.C6848i2.a.a(r14, r11)     // Catch:{ Exception -> 0x00ff }
            int r9 = r9 + 12
            java.lang.String r12 = "bytes"
            kotlin.jvm.internal.C17542s.j(r14, r12)     // Catch:{ Exception -> 0x00ff }
            byte[] r12 = new byte[r11]     // Catch:{ Exception -> 0x00ff }
            java.lang.System.arraycopy(r14, r9, r12, r8, r11)     // Catch:{ Exception -> 0x00ff }
            a9.i2 r14 = new a9.i2     // Catch:{ Exception -> 0x00ff }
            r14.<init>(r10, r12)     // Catch:{ Exception -> 0x00ff }
            r7 = r14
            goto L_0x0120
        L_0x00ff:
            r14 = move-exception
            D8.c r8 = a9.C6848i2.f42607c
            java.lang.String r9 = "couldn't transform bytes because of an unexpected error"
            a9.H1.a(r8, r9, r14)
            goto L_0x0120
        L_0x0108:
            D8.c r14 = a9.C6848i2.f42607c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "couldn't transform bytes because version "
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r9 = " is unknown"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r14.h(r8)
        L_0x0120:
            if (r7 != 0) goto L_0x0127
            r3.a(r5)
            goto L_0x0084
        L_0x0127:
            XH.v r14 = new XH.v
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.b.f(r5)
            r14.<init>(r5, r7)
            r13.f42679g = r4
            r13.f42676d = r3
            r13.f42677e = r1
            r13.f42678f = r2
            java.lang.Object r14 = r4.d(r14, r13)
            if (r14 != r0) goto L_0x0084
            return r0
        L_0x013f:
            XH.N r14 = XH.C16807N.f139792a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6872l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
