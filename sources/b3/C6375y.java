package B3;

import A3.v1;
import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import q3.C5792c;
import q3.C5795f;
import q3.C5807s;
import q3.D;
import t3.C5953d;

/* renamed from: B3.y  reason: case insensitive filesystem */
public interface C6375y {

    /* renamed from: B3.y$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33102a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33103b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33104c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f33105d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f33106e;

        /* renamed from: f  reason: collision with root package name */
        public final int f33107f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f33102a = i10;
            this.f33103b = i11;
            this.f33104c = i12;
            this.f33105d = z10;
            this.f33106e = z11;
            this.f33107f = i13;
        }
    }

    /* renamed from: B3.y$d */
    public interface d {
        void a(boolean z10);

        void b(Exception exc) {
        }

        void c(a aVar) {
        }

        void d(a aVar) {
        }

        void e(long j10) {
        }

        void f() {
        }

        void g() {
        }

        void h(int i10, long j10, long j11);

        void i() {
        }

        void j();

        void k() {
        }
    }

    /* renamed from: B3.y$e */
    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final long f33112a;

        /* renamed from: b  reason: collision with root package name */
        public final long f33113b;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f33112a = j10;
            this.f33113b = j11;
        }
    }

    /* renamed from: B3.y$f */
    public static final class f extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f33114a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33115b;

        /* renamed from: c  reason: collision with root package name */
        public final C5807s f33116c;

        public f(int i10, C5807s sVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f33115b = z10;
            this.f33114a = i10;
            this.f33116c = sVar;
        }
    }

    void A(v1 v1Var) {
    }

    C6362k B(C5807s sVar) {
        return C6362k.f33064d;
    }

    void C(boolean z10);

    void D(d dVar);

    void a();

    boolean b(C5807s sVar);

    void c();

    boolean d();

    D e();

    void flush();

    void g(D d10);

    void h(float f10);

    void i();

    void j(AudioDeviceInfo audioDeviceInfo) {
    }

    boolean k();

    void l(C5792c cVar);

    void m(int i10);

    void n(int i10) {
    }

    void o();

    void p(C5953d dVar) {
    }

    void q(C5795f fVar);

    int r(C5807s sVar);

    void release() {
    }

    boolean s(ByteBuffer byteBuffer, long j10, int i10);

    void t();

    void u(int i10, int i11) {
    }

    long v(boolean z10);

    void w(long j10) {
    }

    void x();

    void y();

    void z(C5807s sVar, int i10, int[] iArr);

    /* renamed from: B3.y$b */
    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final C5807s f33108a;

        public b(Throwable th2, C5807s sVar) {
            super(th2);
            this.f33108a = sVar;
        }

        public b(String str, C5807s sVar) {
            super(str);
            this.f33108a = sVar;
        }
    }

    /* renamed from: B3.y$c */
    public static final class c extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f33109a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33110b;

        /* renamed from: c  reason: collision with root package name */
        public final C5807s f33111c;

        public c(String str, int i10, C5807s sVar, boolean z10, Throwable th2) {
            super(str, th2);
            this.f33109a = i10;
            this.f33110b = z10;
            this.f33111c = sVar;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(int r8, int r9, int r10, int r11, q3.C5807s r12, boolean r13, java.lang.Exception r14) {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r9)
                java.lang.String r9 = ", "
                r0.append(r9)
                r0.append(r10)
                r0.append(r9)
                r0.append(r11)
                java.lang.String r9 = ")"
                r0.append(r9)
                r0.append(r1)
                r0.append(r12)
                if (r13 == 0) goto L_0x0038
                java.lang.String r9 = " (recoverable)"
                goto L_0x003a
            L_0x0038:
                java.lang.String r9 = ""
            L_0x003a:
                r0.append(r9)
                java.lang.String r2 = r0.toString()
                r1 = r7
                r3 = r8
                r4 = r12
                r5 = r13
                r6 = r14
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B3.C6375y.c.<init>(int, int, int, int, q3.s, boolean, java.lang.Exception):void");
        }
    }
}
