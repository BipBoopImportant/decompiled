package k4;

import java.util.Objects;
import kb.C9967v;
import q3.C5807s;
import t3.C5957h;

public interface s {

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54127a = new C0859a();

        /* renamed from: k4.s$a$a  reason: collision with other inner class name */
        class C0859a implements a {
            C0859a() {
            }

            public s a(C5807s sVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            public boolean b(C5807s sVar) {
                return false;
            }

            public int c(C5807s sVar) {
                return 1;
            }
        }

        s a(C5807s sVar);

        boolean b(C5807s sVar);

        int c(C5807s sVar);
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final b f54128c = new b(-9223372036854775807L, false);

        /* renamed from: a  reason: collision with root package name */
        public final long f54129a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f54130b;

        private b(long j10, boolean z10) {
            this.f54129a = j10;
            this.f54130b = z10;
        }

        public static b b() {
            return f54128c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    void a() {
    }

    C8427k b(byte[] bArr, int i10, int i11) {
        C9967v.a t10 = C9967v.t();
        b a10 = b.f54128c;
        Objects.requireNonNull(t10);
        c(bArr, i10, i11, a10, new r(t10));
        return new C8423g(t10.k());
    }

    void c(byte[] bArr, int i10, int i11, b bVar, C5957h<C8421e> hVar);

    int d();
}
