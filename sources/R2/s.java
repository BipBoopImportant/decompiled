package R2;

import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import XH.C16807N;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"LR2/s;", "", "<init>", "()V", "LXH/N;", "b", "(LdI/e;)Ljava/lang/Object;", "a", "c", "LbK/a;", "LbK/a;", "runMutex", "LQJ/x;", "LQJ/x;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private final C17052a f12474a = g.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final C16339x<C16807N> f12475b = C16343z.b((F0) null, 1, (Object) null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f12476c;

        /* renamed from: d  reason: collision with root package name */
        Object f12477d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f12478e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f12479f;

        /* renamed from: g  reason: collision with root package name */
        int f12480g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s sVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f12479f = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12478e = obj;
            this.f12480g |= Integer.MIN_VALUE;
            return this.f12479f.c(this);
        }
    }

    public final Object a(C17164e<? super C16807N> eVar) {
        Object f10 = this.f12475b.f(eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public abstract Object b(C17164e<? super C16807N> eVar);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A[SYNTHETIC, Splitter:B:33:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof R2.s.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            R2.s$a r0 = (R2.s.a) r0
            int r1 = r0.f12480g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12480g = r1
            goto L_0x0018
        L_0x0013:
            R2.s$a r0 = new R2.s$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f12478e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12480g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f12477d
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r0 = r0.f12476c
            R2.s r0 = (R2.s) r0
            XH.y.b(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x008b
        L_0x0035:
            r7 = move-exception
            goto L_0x0096
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003f:
            java.lang.Object r2 = r0.f12477d
            bK.a r2 = (bK.C17052a) r2
            java.lang.Object r4 = r0.f12476c
            R2.s r4 = (R2.s) r4
            XH.y.b(r7)
            r7 = r2
            goto L_0x006a
        L_0x004c:
            XH.y.b(r7)
            QJ.x<XH.N> r7 = r6.f12475b
            boolean r7 = r7.h()
            if (r7 == 0) goto L_0x005a
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x005a:
            bK.a r7 = r6.f12474a
            r0.f12476c = r6
            r0.f12477d = r7
            r0.f12480g = r4
            java.lang.Object r2 = r7.e(r5, r0)
            if (r2 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r4 = r6
        L_0x006a:
            QJ.x<XH.N> r2 = r4.f12475b     // Catch:{ all -> 0x0078 }
            boolean r2 = r2.h()     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x007c
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0078 }
            r7.d(r5)
            return r0
        L_0x0078:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L_0x0096
        L_0x007c:
            r0.f12476c = r4     // Catch:{ all -> 0x0078 }
            r0.f12477d = r7     // Catch:{ all -> 0x0078 }
            r0.f12480g = r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r4.b(r0)     // Catch:{ all -> 0x0078 }
            if (r0 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r1 = r7
            r0 = r4
        L_0x008b:
            QJ.x<XH.N> r7 = r0.f12475b     // Catch:{ all -> 0x0035 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0035 }
            r7.J(r0)     // Catch:{ all -> 0x0035 }
            r1.d(r5)
            return r0
        L_0x0096:
            r1.d(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.s.c(dI.e):java.lang.Object");
    }
}
