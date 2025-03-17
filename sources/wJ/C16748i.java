package WJ;

import QJ.C16301d0;
import QJ.C16323o0;
import QJ.M;
import QJ.e1;
import XH.C16807N;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"LQJ/M;", "LdI/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "LXH/N;", "c", "(LQJ/M;LdI/i;Ljava/lang/Runnable;)V", "", "d", "(LQJ/M;LdI/i;)Z", "T", "LdI/e;", "LXH/x;", "result", "b", "(LdI/e;Ljava/lang/Object;)V", "LWJ/h;", "e", "(LWJ/h;)Z", "LWJ/D;", "a", "LWJ/D;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.i  reason: case insensitive filesystem */
public final class C16748i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16735D f139555a = new C16735D("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final C16735D f139556b = new C16735D("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r0.g1() != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r0.g1() != false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(dI.C17164e<? super T> r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof WJ.C16747h
            if (r0 == 0) goto L_0x00b1
            WJ.h r6 = (WJ.C16747h) r6
            java.lang.Object r0 = QJ.C16287E.b(r7)
            QJ.M r1 = r6.f139551d
            dI.i r2 = r6.getContext()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x0026
            r6.f139553f = r0
            r6.f137629c = r2
            QJ.M r7 = r6.f139551d
            dI.i r0 = r6.getContext()
            c(r7, r0, r6)
            goto L_0x00b4
        L_0x0026:
            QJ.e1 r1 = QJ.e1.f137624a
            QJ.o0 r1 = r1.b()
            boolean r3 = r1.Y0()
            if (r3 == 0) goto L_0x003b
            r6.f139553f = r0
            r6.f137629c = r2
            r1.S0(r6)
            goto L_0x00b4
        L_0x003b:
            r1.W0(r2)
            dI.i r3 = r6.getContext()     // Catch:{ all -> 0x0067 }
            QJ.F0$b r4 = QJ.F0.f137562d0     // Catch:{ all -> 0x0067 }
            dI.i$b r3 = r3.get(r4)     // Catch:{ all -> 0x0067 }
            QJ.F0 r3 = (QJ.F0) r3     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.c()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r7 = r3.x()     // Catch:{ all -> 0x0067 }
            r6.a(r0, r7)     // Catch:{ all -> 0x0067 }
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = XH.y.a(r7)     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = XH.x.b(r7)     // Catch:{ all -> 0x0067 }
            r6.resumeWith(r7)     // Catch:{ all -> 0x0067 }
            goto L_0x0091
        L_0x0067:
            r7 = move-exception
            goto L_0x00a8
        L_0x0069:
            dI.e<T> r0 = r6.f139552e     // Catch:{ all -> 0x0067 }
            java.lang.Object r3 = r6.f139554g     // Catch:{ all -> 0x0067 }
            dI.i r4 = r0.getContext()     // Catch:{ all -> 0x0067 }
            java.lang.Object r3 = WJ.K.i(r4, r3)     // Catch:{ all -> 0x0067 }
            WJ.D r5 = WJ.K.f139530a     // Catch:{ all -> 0x0067 }
            if (r3 == r5) goto L_0x007e
            QJ.o1 r0 = QJ.C16293K.m(r0, r4, r3)     // Catch:{ all -> 0x0067 }
            goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            dI.e<T> r5 = r6.f139552e     // Catch:{ all -> 0x009b }
            r5.resumeWith(r7)     // Catch:{ all -> 0x009b }
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x008e
            boolean r7 = r0.g1()     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0091
        L_0x008e:
            WJ.K.f(r4, r3)     // Catch:{ all -> 0x0067 }
        L_0x0091:
            boolean r7 = r1.h1()     // Catch:{ all -> 0x0067 }
            if (r7 != 0) goto L_0x0091
        L_0x0097:
            r1.P0(r2)
            goto L_0x00b4
        L_0x009b:
            r7 = move-exception
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r0.g1()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x00a7
        L_0x00a4:
            WJ.K.f(r4, r3)     // Catch:{ all -> 0x0067 }
        L_0x00a7:
            throw r7     // Catch:{ all -> 0x0067 }
        L_0x00a8:
            r6.g(r7)     // Catch:{ all -> 0x00ac }
            goto L_0x0097
        L_0x00ac:
            r6 = move-exception
            r1.P0(r2)
            throw r6
        L_0x00b1:
            r6.resumeWith(r7)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WJ.C16748i.b(dI.e, java.lang.Object):void");
    }

    public static final void c(M m10, C17168i iVar, Runnable runnable) {
        try {
            m10.E0(iVar, runnable);
        } catch (Throwable th2) {
            throw new C16301d0(th2, m10, iVar);
        }
    }

    public static final boolean d(M m10, C17168i iVar) {
        try {
            return m10.I0(iVar);
        } catch (Throwable th2) {
            throw new C16301d0(th2, m10, iVar);
        }
    }

    public static final boolean e(C16747h<? super C16807N> hVar) {
        C16807N n10 = C16807N.f139792a;
        C16323o0 b10 = e1.f137624a.b();
        if (b10.a1()) {
            return false;
        }
        if (b10.Y0()) {
            hVar.f139553f = n10;
            hVar.f137629c = 1;
            b10.S0(hVar);
            return true;
        }
        b10.W0(true);
        try {
            hVar.run();
            do {
            } while (b10.h1());
        } catch (Throwable th2) {
            b10.P0(true);
            throw th2;
        }
        b10.P0(true);
        return false;
    }
}
