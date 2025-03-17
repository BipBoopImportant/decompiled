package QJ;

import XJ.C16833b;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H@\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H@\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\f\u0010\t\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H@¢\u0006\u0004\b\r\u0010\t\u001aY\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "", "block", "c", "(JLnI/p;LdI/e;)Ljava/lang/Object;", "LIJ/b;", "timeout", "d", "e", "U", "LQJ/l1;", "coroutine", "b", "(LQJ/l1;LnI/p;)Ljava/lang/Object;", "time", "LQJ/a0;", "delay", "LQJ/F0;", "LQJ/k1;", "a", "(JLQJ/a0;LQJ/F0;)LQJ/k1;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
    static final class a<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        long f137650c;

        /* renamed from: d  reason: collision with root package name */
        Object f137651d;

        /* renamed from: e  reason: collision with root package name */
        Object f137652e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f137653f;

        /* renamed from: g  reason: collision with root package name */
        int f137654g;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f137653f = obj;
            this.f137654g |= Integer.MIN_VALUE;
            return m1.e(0, (p) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final QJ.k1 a(long r2, QJ.C16295a0 r4, QJ.F0 r5) {
        /*
            boolean r0 = r4 instanceof QJ.C16299c0
            if (r0 == 0) goto L_0x0007
            QJ.c0 r4 = (QJ.C16299c0) r4
            goto L_0x0008
        L_0x0007:
            r4 = 0
        L_0x0008:
            if (r4 == 0) goto L_0x0018
            IJ.b$a r0 = IJ.C15906b.f135496b
            IJ.e r0 = IJ.C15909e.MILLISECONDS
            long r0 = IJ.C15908d.t(r2, r0)
            java.lang.String r4 = r4.U(r0)
            if (r4 != 0) goto L_0x002e
        L_0x0018:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L_0x002e:
            QJ.k1 r2 = new QJ.k1
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.m1.a(long, QJ.a0, QJ.F0):QJ.k1");
    }

    private static final <U, T extends U> Object b(l1<U, ? super T> l1Var, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar) {
        I0.j(l1Var, C16297b0.d(l1Var.f139586d.getContext()).u(l1Var.f137647e, l1Var, l1Var.getContext()));
        return C16833b.c(l1Var, l1Var, pVar);
    }

    public static final <T> Object c(long j10, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        if (j10 > 0) {
            Object b10 = b(new l1(j10, eVar), pVar);
            if (b10 == C17187b.f()) {
                h.c(eVar);
            }
            return b10;
        }
        throw new k1("Timed out immediately");
    }

    public static final <T> Object d(long j10, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        return c(C16297b0.e(j10), pVar, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object e(long r7, nI.p<? super QJ.Q, ? super dI.C17164e<? super T>, ? extends java.lang.Object> r9, dI.C17164e<? super T> r10) {
        /*
            boolean r0 = r10 instanceof QJ.m1.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            QJ.m1$a r0 = (QJ.m1.a) r0
            int r1 = r0.f137654g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f137654g = r1
            goto L_0x0018
        L_0x0013:
            QJ.m1$a r0 = new QJ.m1$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f137653f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f137654g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.f137652e
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r0.f137651d
            nI.p r8 = (nI.p) r8
            XH.y.b(r10)     // Catch:{ k1 -> 0x0032 }
            goto L_0x006f
        L_0x0032:
            r8 = move-exception
            goto L_0x0070
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            XH.y.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0046
            return r3
        L_0x0046:
            kotlin.jvm.internal.O r10 = new kotlin.jvm.internal.O
            r10.<init>()
            r0.f137651d = r9     // Catch:{ k1 -> 0x0068 }
            r0.f137652e = r10     // Catch:{ k1 -> 0x0068 }
            r0.f137650c = r7     // Catch:{ k1 -> 0x0068 }
            r0.f137654g = r4     // Catch:{ k1 -> 0x0068 }
            QJ.l1 r2 = new QJ.l1     // Catch:{ k1 -> 0x0068 }
            r2.<init>(r7, r0)     // Catch:{ k1 -> 0x0068 }
            r10.f144348a = r2     // Catch:{ k1 -> 0x0068 }
            java.lang.Object r7 = b(r2, r9)     // Catch:{ k1 -> 0x0068 }
            java.lang.Object r8 = eI.C17187b.f()     // Catch:{ k1 -> 0x0068 }
            if (r7 != r8) goto L_0x006b
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ k1 -> 0x0068 }
            goto L_0x006b
        L_0x0068:
            r8 = move-exception
            r7 = r10
            goto L_0x0070
        L_0x006b:
            if (r7 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r10 = r7
        L_0x006f:
            return r10
        L_0x0070:
            QJ.F0 r9 = r8.f137644a
            T r7 = r7.f144348a
            if (r9 != r7) goto L_0x0077
            return r3
        L_0x0077:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.m1.e(long, nI.p, dI.e):java.lang.Object");
    }
}
