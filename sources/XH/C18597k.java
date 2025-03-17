package xH;

import FH.d;
import QJ.C16311i0;
import QJ.C16342y0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import io.ktor.utils.io.q;
import io.ktor.utils.io.u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"LFH/d;", "Lio/ktor/utils/io/j;", "log", "a", "(LFH/d;Lio/ktor/utils/io/j;LdI/e;)Ljava/lang/Object;", "LFH/d$d;", "Lio/ktor/utils/io/g;", "b", "(LFH/d$d;)Lio/ktor/utils/io/g;", "ktor-client-logging"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.k  reason: case insensitive filesystem */
public final class C18597k {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.logging.ObservingUtilsKt", f = "ObservingUtils.kt", l = {14}, m = "observe")
    /* renamed from: xH.k$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f152260c;

        /* renamed from: d  reason: collision with root package name */
        Object f152261d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f152262e;

        /* renamed from: f  reason: collision with root package name */
        int f152263f;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f152262e = obj;
            this.f152263f |= Integer.MIN_VALUE;
            return C18597k.a((FH.d) null, (j) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1", f = "ObservingUtils.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: xH.k$b */
    static final class b extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152264c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f152265d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d.C3307d f152266e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d.C3307d dVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f152266e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f152266e, eVar);
            bVar.f152265d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((b) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152264c;
            if (i10 == 0) {
                y.b(obj);
                d.C3307d dVar = this.f152266e;
                j d10 = ((u) this.f152265d).d();
                this.f152264c = 1;
                if (dVar.e(d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: io.ktor.utils.io.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(FH.d r4, io.ktor.utils.io.j r5, dI.C17164e<? super FH.d> r6) {
        /*
            boolean r0 = r6 instanceof xH.C18597k.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xH.k$a r0 = (xH.C18597k.a) r0
            int r1 = r0.f152263f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152263f = r1
            goto L_0x0018
        L_0x0013:
            xH.k$a r0 = new xH.k$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f152262e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f152263f
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.f152261d
            r5 = r4
            io.ktor.utils.io.j r5 = (io.ktor.utils.io.j) r5
            java.lang.Object r4 = r0.f152260c
            FH.d r4 = (FH.d) r4
            XH.y.b(r6)
            goto L_0x0055
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            XH.y.b(r6)
            boolean r6 = r4 instanceof FH.d.a
            if (r6 == 0) goto L_0x0059
            r6 = r4
            FH.d$a r6 = (FH.d.a) r6
            byte[] r6 = r6.e()
            r0.f152260c = r4
            r0.f152261d = r5
            r0.f152263f = r3
            java.lang.Object r6 = io.ktor.utils.io.k.b(r5, r6, r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            io.ktor.utils.io.k.a(r5)
            goto L_0x008f
        L_0x0059:
            boolean r6 = r4 instanceof FH.d.c
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L_0x0074
            io.ktor.utils.io.c r6 = io.ktor.utils.io.e.b(r1, r3, r0)
            r0 = r4
            FH.d$c r0 = (FH.d.c) r0
            io.ktor.utils.io.g r0 = r0.e()
            JH.f.a(r0, r5, r6)
            xH.d r5 = new xH.d
            r5.<init>(r4, r6)
        L_0x0072:
            r4 = r5
            goto L_0x008f
        L_0x0074:
            boolean r6 = r4 instanceof FH.d.C3307d
            if (r6 == 0) goto L_0x008c
            io.ktor.utils.io.c r6 = io.ktor.utils.io.e.b(r1, r3, r0)
            r0 = r4
            FH.d$d r0 = (FH.d.C3307d) r0
            io.ktor.utils.io.g r0 = b(r0)
            JH.f.a(r0, r5, r6)
            xH.d r5 = new xH.d
            r5.<init>(r4, r6)
            goto L_0x0072
        L_0x008c:
            io.ktor.utils.io.k.a(r5)
        L_0x008f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xH.C18597k.a(FH.d, io.ktor.utils.io.j, dI.e):java.lang.Object");
    }

    private static final g b(d.C3307d dVar) {
        return q.c(C16342y0.f137687a, C16311i0.a(), false, new b(dVar, (C17164e<? super b>) null), 2, (Object) null).d();
    }
}
