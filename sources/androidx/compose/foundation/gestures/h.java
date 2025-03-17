package androidx.compose.foundation.gestures;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o1.C5667g;
import p0.F;
import z1.C6271a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0012\u0010\u001a\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/h;", "Lz1/a;", "Lp0/F;", "scrollingLogic", "", "enabled", "<init>", "(Lp0/F;Z)V", "Lo1/g;", "consumed", "available", "Lz1/e;", "source", "N0", "(JJI)J", "Lc2/y;", "g0", "(JJLdI/e;)Ljava/lang/Object;", "a", "Lp0/F;", "getScrollingLogic", "()Lp0/F;", "b", "Z", "getEnabled", "()Z", "(Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h implements C6271a {

    /* renamed from: a  reason: collision with root package name */
    private final F f17828a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17829b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {865}, m = "onPostFling-RZ2iAVY")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        long f17830c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f17831d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f17832e;

        /* renamed from: f  reason: collision with root package name */
        int f17833f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f17832e = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17831d = obj;
            this.f17833f |= Integer.MIN_VALUE;
            return this.f17832e.g0(0, 0, this);
        }
    }

    public h(F f10, boolean z10) {
        this.f17828a = f10;
        this.f17829b = z10;
    }

    public long N0(long j10, long j11, int i10) {
        return this.f17829b ? this.f17828a.r(j11) : C5667g.f26701b.c();
    }

    public final void a(boolean z10) {
        this.f17829b = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g0(long r3, long r5, dI.C17164e<? super c2.y> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.h.a
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.foundation.gestures.h$a r3 = (androidx.compose.foundation.gestures.h.a) r3
            int r4 = r3.f17833f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.f17833f = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.h$a r3 = new androidx.compose.foundation.gestures.h$a
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.f17831d
            java.lang.Object r7 = eI.C17187b.f()
            int r0 = r3.f17833f
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r5 = r3.f17830c
            XH.y.b(r4)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0033:
            XH.y.b(r4)
            boolean r4 = r2.f17829b
            if (r4 == 0) goto L_0x0052
            p0.F r4 = r2.f17828a
            r3.f17830c = r5
            r3.f17833f = r1
            java.lang.Object r4 = r4.n(r5, r3)
            if (r4 != r7) goto L_0x0047
            return r7
        L_0x0047:
            c2.y r4 = (c2.y) r4
            long r3 = r4.o()
            long r3 = c2.y.k(r5, r3)
            goto L_0x0058
        L_0x0052:
            c2.y$a r3 = c2.y.f23066b
            long r3 = r3.a()
        L_0x0058:
            c2.y r3 = c2.y.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.g0(long, long, dI.e):java.lang.Object");
    }
}
