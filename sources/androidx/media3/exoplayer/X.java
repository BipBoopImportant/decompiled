package androidx.media3.exoplayer;

import A3.v1;
import G3.C6479C;
import G3.k0;
import I3.x;
import J3.C6569b;
import q3.J;
import t3.q;

public interface X {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final C6479C.b f22608a = new C6479C.b(new Object());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final v1 f22609a;

        /* renamed from: b  reason: collision with root package name */
        public final J f22610b;

        /* renamed from: c  reason: collision with root package name */
        public final C6479C.b f22611c;

        /* renamed from: d  reason: collision with root package name */
        public final long f22612d;

        /* renamed from: e  reason: collision with root package name */
        public final long f22613e;

        /* renamed from: f  reason: collision with root package name */
        public final float f22614f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f22615g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f22616h;

        /* renamed from: i  reason: collision with root package name */
        public final long f22617i;

        public a(v1 v1Var, J j10, C6479C.b bVar, long j11, long j12, float f10, boolean z10, boolean z11, long j13) {
            this.f22609a = v1Var;
            this.f22610b = j10;
            this.f22611c = bVar;
            this.f22612d = j11;
            this.f22613e = j12;
            this.f22614f = f10;
            this.f22615g = z10;
            this.f22616h = z11;
            this.f22617i = j13;
        }
    }

    boolean a(a aVar) {
        return k(aVar.f22610b, aVar.f22611c, aVar.f22613e, aVar.f22614f, aVar.f22616h, aVar.f22617i);
    }

    @Deprecated
    boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    void c(v1 v1Var) {
        j();
    }

    void d(v1 v1Var) {
        q();
    }

    @Deprecated
    long e() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Deprecated
    void f() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    void g(v1 v1Var) {
        f();
    }

    @Deprecated
    boolean h(long j10, float f10, boolean z10, long j11) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    C6569b i();

    @Deprecated
    void j() {
        throw new IllegalStateException("onStopped not implemented");
    }

    @Deprecated
    boolean k(J j10, C6479C.b bVar, long j11, float f10, boolean z10, long j12) {
        return h(j11, f10, z10, j12);
    }

    boolean l(a aVar) {
        return r(aVar.f22612d, aVar.f22613e, aVar.f22614f);
    }

    void m(a aVar, k0 k0Var, x[] xVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    long n(v1 v1Var) {
        return e();
    }

    boolean o(J j10, C6479C.b bVar, long j11) {
        q.h("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    boolean p(v1 v1Var) {
        return b();
    }

    @Deprecated
    void q() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    boolean r(long j10, long j11, float f10) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }
}
