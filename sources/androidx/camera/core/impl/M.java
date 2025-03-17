package androidx.camera.core.impl;

import C.C4391e0;
import C.s0;
import androidx.camera.core.impl.T;

public final class M implements W0 {

    /* renamed from: d  reason: collision with root package name */
    private final s0 f16744d;

    class a implements s0 {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f16745d;

        a(long j10) {
            this.f16745d = j10;
        }

        public long a() {
            return this.f16745d;
        }

        public s0.c c(s0.b bVar) {
            return bVar.i() == 1 ? s0.c.f5407d : s0.c.f5408e;
        }
    }

    public static final class b implements W0 {

        /* renamed from: d  reason: collision with root package name */
        private final s0 f16747d;

        public b(long j10) {
            this.f16747d = new M(j10);
        }

        public long a() {
            return this.f16747d.a();
        }

        public s0.c c(s0.b bVar) {
            if (this.f16747d.c(bVar).d()) {
                return s0.c.f5408e;
            }
            Throwable j10 = bVar.j();
            if (j10 instanceof T.b) {
                C4391e0.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((T.b) j10).a() > 0) {
                    return s0.c.f5410g;
                }
            }
            return s0.c.f5407d;
        }

        public s0 d(long j10) {
            return new b(j10);
        }
    }

    public M(long j10) {
        this.f16744d = new i1(j10, new a(j10));
    }

    public long a() {
        return this.f16744d.a();
    }

    public s0.c c(s0.b bVar) {
        return this.f16744d.c(bVar);
    }

    public s0 d(long j10) {
        return new M(j10);
    }
}
