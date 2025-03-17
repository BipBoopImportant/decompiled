package QJ;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import XH.C16807N;
import XH.t;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "a", "(LdI/e;)Ljava/lang/Object;", "", "timeMillis", "LXH/N;", "b", "(JLdI/e;)Ljava/lang/Object;", "LIJ/b;", "duration", "c", "e", "(J)J", "LdI/i;", "LQJ/a0;", "d", "(LdI/i;)LQJ/a0;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.b0  reason: case insensitive filesystem */
public final class C16297b0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
    /* renamed from: QJ.b0$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f137611c;

        /* renamed from: d  reason: collision with root package name */
        int f137612d;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f137611c = obj;
            this.f137612d |= Integer.MIN_VALUE;
            return C16297b0.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(dI.C17164e<?> r4) {
        /*
            boolean r0 = r4 instanceof QJ.C16297b0.a
            if (r0 == 0) goto L_0x0013
            r0 = r4
            QJ.b0$a r0 = (QJ.C16297b0.a) r0
            int r1 = r0.f137612d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f137612d = r1
            goto L_0x0018
        L_0x0013:
            QJ.b0$a r0 = new QJ.b0$a
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.f137611c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f137612d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002d:
            XH.y.b(r4)
            goto L_0x0052
        L_0x0031:
            XH.y.b(r4)
            r0.f137612d = r3
            QJ.p r4 = new QJ.p
            dI.e r2 = eI.C17187b.c(r0)
            r4.<init>(r2, r3)
            r4.C()
            java.lang.Object r4 = r4.w()
            java.lang.Object r2 = eI.C17187b.f()
            if (r4 != r2) goto L_0x004f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x004f:
            if (r4 != r1) goto L_0x0052
            return r1
        L_0x0052:
            XH.k r4 = new XH.k
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.C16297b0.a(dI.e):java.lang.Object");
    }

    public static final Object b(long j10, C17164e<? super C16807N> eVar) {
        if (j10 <= 0) {
            return C16807N.f139792a;
        }
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        if (j10 < Long.MAX_VALUE) {
            d(pVar.getContext()).h0(j10, pVar);
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    public static final Object c(long j10, C17164e<? super C16807N> eVar) {
        Object b10 = b(e(j10), eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public static final C16295a0 d(C17168i iVar) {
        C17168i.b bVar = iVar.get(C17165f.f142966s0);
        C16295a0 a0Var = bVar instanceof C16295a0 ? (C16295a0) bVar : null;
        return a0Var == null ? X.a() : a0Var;
    }

    public static final long e(long j10) {
        boolean Z10 = C15906b.Z(j10);
        if (Z10) {
            return C15906b.K(C15906b.a0(j10, C15908d.t(999999, C15909e.NANOSECONDS)));
        }
        if (!Z10) {
            return 0;
        }
        throw new t();
    }
}
