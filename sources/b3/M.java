package B3;

import A3.v1;
import B3.C6349A;
import B3.C6375y;
import B3.U;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kb.C9967v;
import kb.e0;
import q3.A;
import q3.C5792c;
import q3.C5795f;
import q3.C5807s;
import q3.D;
import r3.b;
import t3.C5950a;
import t3.C5953d;
import t3.N;
import t3.q;

public final class M implements C6375y {

    /* renamed from: l0  reason: collision with root package name */
    public static boolean f32869l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    private static final Object f32870m0 = new Object();

    /* renamed from: n0  reason: collision with root package name */
    private static ScheduledExecutorService f32871n0;

    /* renamed from: o0  reason: collision with root package name */
    private static int f32872o0;

    /* renamed from: A  reason: collision with root package name */
    private l f32873A;

    /* renamed from: B  reason: collision with root package name */
    private C5792c f32874B;

    /* renamed from: C  reason: collision with root package name */
    private k f32875C;

    /* renamed from: D  reason: collision with root package name */
    private k f32876D;

    /* renamed from: E  reason: collision with root package name */
    private D f32877E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f32878F;

    /* renamed from: G  reason: collision with root package name */
    private ByteBuffer f32879G;

    /* renamed from: H  reason: collision with root package name */
    private int f32880H;

    /* renamed from: I  reason: collision with root package name */
    private long f32881I;

    /* renamed from: J  reason: collision with root package name */
    private long f32882J;

    /* renamed from: K  reason: collision with root package name */
    private long f32883K;

    /* renamed from: L  reason: collision with root package name */
    private long f32884L;

    /* renamed from: M  reason: collision with root package name */
    private int f32885M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f32886N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f32887O;

    /* renamed from: P  reason: collision with root package name */
    private long f32888P;

    /* renamed from: Q  reason: collision with root package name */
    private float f32889Q;

    /* renamed from: R  reason: collision with root package name */
    private ByteBuffer f32890R;

    /* renamed from: S  reason: collision with root package name */
    private int f32891S;

    /* renamed from: T  reason: collision with root package name */
    private ByteBuffer f32892T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f32893U;

    /* renamed from: V  reason: collision with root package name */
    private boolean f32894V;
    /* access modifiers changed from: private */

    /* renamed from: W  reason: collision with root package name */
    public boolean f32895W;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public boolean f32896X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f32897Y;

    /* renamed from: Z  reason: collision with root package name */
    private int f32898Z;

    /* renamed from: a  reason: collision with root package name */
    private final Context f32899a;

    /* renamed from: a0  reason: collision with root package name */
    private C5795f f32900a0;

    /* renamed from: b  reason: collision with root package name */
    private final r3.c f32901b;

    /* renamed from: b0  reason: collision with root package name */
    private C6361j f32902b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f32903c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f32904c0;

    /* renamed from: d  reason: collision with root package name */
    private final C6350B f32905d;

    /* renamed from: d0  reason: collision with root package name */
    private long f32906d0;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f32907e;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public long f32908e0;

    /* renamed from: f  reason: collision with root package name */
    private final C9967v<r3.b> f32909f;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f32910f0;

    /* renamed from: g  reason: collision with root package name */
    private final C9967v<r3.b> f32911g;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f32912g0;

    /* renamed from: h  reason: collision with root package name */
    private final C6349A f32913h;

    /* renamed from: h0  reason: collision with root package name */
    private Looper f32914h0;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayDeque<k> f32915i;

    /* renamed from: i0  reason: collision with root package name */
    private long f32916i0;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f32917j;

    /* renamed from: j0  reason: collision with root package name */
    private long f32918j0;

    /* renamed from: k  reason: collision with root package name */
    private int f32919k;

    /* renamed from: k0  reason: collision with root package name */
    private Handler f32920k0;

    /* renamed from: l  reason: collision with root package name */
    private o f32921l;

    /* renamed from: m  reason: collision with root package name */
    private final m<C6375y.c> f32922m;

    /* renamed from: n  reason: collision with root package name */
    private final m<C6375y.f> f32923n;

    /* renamed from: o  reason: collision with root package name */
    private final e f32924o;

    /* renamed from: p  reason: collision with root package name */
    private final d f32925p;

    /* renamed from: q  reason: collision with root package name */
    private final ExoPlayer.a f32926q;

    /* renamed from: r  reason: collision with root package name */
    private final f f32927r;

    /* renamed from: s  reason: collision with root package name */
    private v1 f32928s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C6375y.d f32929t;

    /* renamed from: u  reason: collision with root package name */
    private h f32930u;

    /* renamed from: v  reason: collision with root package name */
    private h f32931v;

    /* renamed from: w  reason: collision with root package name */
    private r3.a f32932w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public AudioTrack f32933x;

    /* renamed from: y  reason: collision with root package name */
    private C6356e f32934y;

    /* renamed from: z  reason: collision with root package name */
    private C6360i f32935z;

    private static final class b {
        public static void a(AudioTrack audioTrack, C6361j jVar) {
            audioTrack.setPreferredDevice(jVar == null ? null : jVar.f33063a);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, v1 v1Var) {
            LogSessionId a10 = v1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(a10);
            }
        }
    }

    public interface d {
        C6362k a(C5807s sVar, C5792c cVar);
    }

    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f32936a = new U.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f32937a = new W();

        AudioTrack a(C6375y.a aVar, C5792c cVar, int i10);
    }

    public static final class g {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f32938a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C6356e f32939b = C6356e.f33039c;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public r3.c f32940c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f32941d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f32942e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f32943f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public e f32944g = e.f32936a;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public f f32945h = f.f32937a;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public d f32946i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public ExoPlayer.a f32947j;

        public g(Context context) {
            this.f32938a = context;
        }

        public M j() {
            C5950a.g(!this.f32943f);
            this.f32943f = true;
            if (this.f32940c == null) {
                this.f32940c = new i(new r3.b[0]);
            }
            if (this.f32946i == null) {
                this.f32946i = new D(this.f32938a);
            }
            return new M(this);
        }

        public g k(boolean z10) {
            this.f32942e = z10;
            return this;
        }

        public g l(boolean z10) {
            this.f32941d = z10;
            return this;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final C5807s f32948a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32949b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32950c;

        /* renamed from: d  reason: collision with root package name */
        public final int f32951d;

        /* renamed from: e  reason: collision with root package name */
        public final int f32952e;

        /* renamed from: f  reason: collision with root package name */
        public final int f32953f;

        /* renamed from: g  reason: collision with root package name */
        public final int f32954g;

        /* renamed from: h  reason: collision with root package name */
        public final int f32955h;

        /* renamed from: i  reason: collision with root package name */
        public final r3.a f32956i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f32957j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f32958k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f32959l;

        public h(C5807s sVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, r3.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f32948a = sVar;
            this.f32949b = i10;
            this.f32950c = i11;
            this.f32951d = i12;
            this.f32952e = i13;
            this.f32953f = i14;
            this.f32954g = i15;
            this.f32955h = i16;
            this.f32956i = aVar;
            this.f32957j = z10;
            this.f32958k = z11;
            this.f32959l = z12;
        }

        public C6375y.a a() {
            int i10 = this.f32954g;
            int i11 = this.f32952e;
            int i12 = this.f32953f;
            boolean z10 = this.f32959l;
            boolean z11 = true;
            if (this.f32950c != 1) {
                z11 = false;
            }
            return new C6375y.a(i10, i11, i12, z10, z11, this.f32955h);
        }

        public boolean b(h hVar) {
            return hVar.f32950c == this.f32950c && hVar.f32954g == this.f32954g && hVar.f32952e == this.f32952e && hVar.f32953f == this.f32953f && hVar.f32951d == this.f32951d && hVar.f32957j == this.f32957j && hVar.f32958k == this.f32958k;
        }

        public h c(int i10) {
            return new h(this.f32948a, this.f32949b, this.f32950c, this.f32951d, this.f32952e, this.f32953f, this.f32954g, i10, this.f32956i, this.f32957j, this.f32958k, this.f32959l);
        }

        public long d(long j10) {
            return N.Y0(j10, this.f32952e);
        }

        public long e(long j10) {
            return N.Y0(j10, this.f32948a.f28220E);
        }

        public boolean f() {
            return this.f32950c == 1;
        }
    }

    public static class i implements r3.c {

        /* renamed from: a  reason: collision with root package name */
        private final r3.b[] f32960a;

        /* renamed from: b  reason: collision with root package name */
        private final a0 f32961b;

        /* renamed from: c  reason: collision with root package name */
        private final r3.f f32962c;

        public i(r3.b... bVarArr) {
            this(bVarArr, new a0(), new r3.f());
        }

        public long a(long j10) {
            return this.f32962c.c() ? this.f32962c.h(j10) : j10;
        }

        public r3.b[] b() {
            return this.f32960a;
        }

        public D c(D d10) {
            this.f32962c.j(d10.f27859a);
            this.f32962c.i(d10.f27860b);
            return d10;
        }

        public long d() {
            return this.f32961b.v();
        }

        public boolean e(boolean z10) {
            this.f32961b.E(z10);
            return z10;
        }

        public i(r3.b[] bVarArr, a0 a0Var, r3.f fVar) {
            r3.b[] bVarArr2 = new r3.b[(bVarArr.length + 2)];
            this.f32960a = bVarArr2;
            System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
            this.f32961b = a0Var;
            this.f32962c = fVar;
            bVarArr2[bVarArr.length] = a0Var;
            bVarArr2[bVarArr.length + 1] = fVar;
        }
    }

    public static final class j extends RuntimeException {
        private j(String str) {
            super(str);
        }
    }

    private static final class k {

        /* renamed from: a  reason: collision with root package name */
        public final D f32963a;

        /* renamed from: b  reason: collision with root package name */
        public final long f32964b;

        /* renamed from: c  reason: collision with root package name */
        public final long f32965c;

        /* renamed from: d  reason: collision with root package name */
        public long f32966d;

        private k(D d10, long j10, long j11) {
            this.f32963a = d10;
            this.f32964b = j10;
            this.f32965c = j11;
        }
    }

    private static final class l {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f32967a;

        /* renamed from: b  reason: collision with root package name */
        private final C6360i f32968b;

        /* renamed from: c  reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f32969c = new P(this);

        public l(AudioTrack audioTrack, C6360i iVar) {
            this.f32967a = audioTrack;
            this.f32968b = iVar;
            audioTrack.addOnRoutingChangedListener(this.f32969c, new Handler(Looper.myLooper()));
        }

        /* access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            if (this.f32969c != null && audioRouting.getRoutedDevice() != null) {
                this.f32968b.i(audioRouting.getRoutedDevice());
            }
        }

        public void c() {
            this.f32967a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) C5950a.e(this.f32969c));
            this.f32969c = null;
        }
    }

    private static final class m<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private T f32970a;

        /* renamed from: b  reason: collision with root package name */
        private long f32971b = -9223372036854775807L;

        /* renamed from: c  reason: collision with root package name */
        private long f32972c = -9223372036854775807L;

        public void a() {
            this.f32970a = null;
            this.f32971b = -9223372036854775807L;
            this.f32972c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f32970a == null) {
                return false;
            }
            if (M.b0()) {
                return true;
            }
            return SystemClock.elapsedRealtime() < this.f32972c;
        }

        public void c(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f32970a == null) {
                this.f32970a = t10;
            }
            if (this.f32971b == -9223372036854775807L && !M.b0()) {
                this.f32971b = 200 + elapsedRealtime;
            }
            long j10 = this.f32971b;
            if (j10 == -9223372036854775807L || elapsedRealtime < j10) {
                this.f32972c = elapsedRealtime + 50;
                return;
            }
            T t11 = this.f32970a;
            if (t11 != t10) {
                t11.addSuppressed(t10);
            }
            T t12 = this.f32970a;
            a();
            throw t12;
        }
    }

    private final class n implements C6349A.a {
        private n() {
        }

        public void a(int i10, long j10) {
            if (M.this.f32929t != null) {
                M.this.f32929t.h(i10, j10, SystemClock.elapsedRealtime() - M.this.f32908e0);
            }
        }

        public void b(long j10) {
            q.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + M.this.Y() + ", " + M.this.Z();
            if (!M.f32869l0) {
                q.h("DefaultAudioSink", str);
                return;
            }
            throw new j(str);
        }

        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + M.this.Y() + ", " + M.this.Z();
            if (!M.f32869l0) {
                q.h("DefaultAudioSink", str);
                return;
            }
            throw new j(str);
        }

        public void e(long j10) {
            if (M.this.f32929t != null) {
                M.this.f32929t.e(j10);
            }
        }
    }

    private final class o {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f32974a = new Handler(Looper.myLooper());

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f32975b;

        class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ M f32977a;

            a(M m10) {
                this.f32977a = m10;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(M.this.f32933x) && M.this.f32929t != null && M.this.f32896X) {
                    M.this.f32929t.k();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(M.this.f32933x)) {
                    boolean unused = M.this.f32895W = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(M.this.f32933x) && M.this.f32929t != null && M.this.f32896X) {
                    M.this.f32929t.k();
                }
            }
        }

        public o() {
            this.f32975b = new a(M.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f32974a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new T(handler), this.f32975b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f32975b);
            this.f32974a.removeCallbacksAndMessages((Object) null);
        }
    }

    private static int A0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int B0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (N.f29462a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f32879G == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f32879G = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f32879G.putInt(1431633921);
        }
        if (this.f32880H == 0) {
            this.f32879G.putInt(4, i10);
            this.f32879G.putLong(8, j10 * 1000);
            this.f32879G.position(0);
            this.f32880H = i10;
        }
        int remaining = this.f32879G.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f32879G, remaining, 1);
            if (write < 0) {
                this.f32880H = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int A02 = A0(audioTrack, byteBuffer, i10);
        if (A02 < 0) {
            this.f32880H = 0;
            return A02;
        }
        this.f32880H -= A02;
        return A02;
    }

    private void O(long j10) {
        D d10;
        if (!z0()) {
            d10 = x0() ? this.f32901b.c(this.f32877E) : D.f27856d;
            this.f32877E = d10;
        } else {
            d10 = D.f27856d;
        }
        D d11 = d10;
        this.f32878F = x0() ? this.f32901b.e(this.f32878F) : false;
        this.f32915i.add(new k(d11, Math.max(0, j10), this.f32931v.d(Z())));
        w0();
        C6375y.d dVar = this.f32929t;
        if (dVar != null) {
            dVar.a(this.f32878F);
        }
    }

    private long P(long j10) {
        while (!this.f32915i.isEmpty() && j10 >= this.f32915i.getFirst().f32965c) {
            this.f32876D = this.f32915i.remove();
        }
        k kVar = this.f32876D;
        long j11 = j10 - kVar.f32965c;
        long d02 = N.d0(j11, kVar.f32963a.f27859a);
        if (this.f32915i.isEmpty()) {
            long a10 = this.f32901b.a(j11);
            k kVar2 = this.f32876D;
            long j12 = kVar2.f32964b + a10;
            kVar2.f32966d = a10 - d02;
            return j12;
        }
        k kVar3 = this.f32876D;
        return kVar3.f32964b + d02 + kVar3.f32966d;
    }

    private long Q(long j10) {
        long d10 = this.f32901b.d();
        long d11 = j10 + this.f32931v.d(d10);
        long j11 = this.f32916i0;
        if (d10 > j11) {
            long d12 = this.f32931v.d(d10 - j11);
            this.f32916i0 = d10;
            a0(d12);
        }
        return d11;
    }

    private AudioTrack R(C6375y.a aVar, C5792c cVar, int i10, C5807s sVar) {
        try {
            AudioTrack a10 = this.f32927r.a(aVar, cVar, i10);
            int state = a10.getState();
            if (state == 1) {
                return a10;
            }
            try {
                a10.release();
            } catch (Exception unused) {
            }
            throw new C6375y.c(state, aVar.f33103b, aVar.f33104c, aVar.f33102a, sVar, aVar.f33106e, (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new C6375y.c(0, aVar.f33103b, aVar.f33104c, aVar.f33102a, sVar, aVar.f33106e, e10);
        }
    }

    private AudioTrack S(h hVar) {
        try {
            AudioTrack R10 = R(hVar.a(), this.f32874B, this.f32898Z, hVar.f32948a);
            ExoPlayer.a aVar = this.f32926q;
            if (aVar != null) {
                aVar.B(f0(R10));
            }
            return R10;
        } catch (C6375y.c e10) {
            C6375y.d dVar = this.f32929t;
            if (dVar != null) {
                dVar.b(e10);
            }
            throw e10;
        }
    }

    private AudioTrack T() {
        try {
            return S((h) C5950a.e(this.f32931v));
        } catch (C6375y.c e10) {
            h hVar = this.f32931v;
            if (hVar.f32955h > 1000000) {
                h c10 = hVar.c(1000000);
                try {
                    AudioTrack S10 = S(c10);
                    this.f32931v = c10;
                    return S10;
                } catch (C6375y.c e11) {
                    e10.addSuppressed(e11);
                    i0();
                    throw e10;
                }
            }
            i0();
            throw e10;
        }
    }

    private void U(long j10) {
        int i10;
        C6375y.d dVar;
        if (this.f32892T != null && !this.f32923n.b()) {
            int remaining = this.f32892T.remaining();
            boolean z10 = false;
            if (this.f32904c0) {
                C5950a.g(j10 != -9223372036854775807L);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.f32906d0;
                } else {
                    this.f32906d0 = j10;
                }
                i10 = B0(this.f32933x, this.f32892T, remaining, j10);
            } else {
                i10 = A0(this.f32933x, this.f32892T, remaining);
            }
            this.f32908e0 = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                if (d0(i10)) {
                    if (Z() <= 0) {
                        if (f0(this.f32933x)) {
                            i0();
                        }
                    }
                    z10 = true;
                }
                C6375y.f fVar = new C6375y.f(i10, this.f32931v.f32948a, z10);
                C6375y.d dVar2 = this.f32929t;
                if (dVar2 != null) {
                    dVar2.b(fVar);
                }
                if (!fVar.f33115b) {
                    this.f32923n.c(fVar);
                } else {
                    this.f32934y = C6356e.f33039c;
                    throw fVar;
                }
            } else {
                this.f32923n.a();
                if (f0(this.f32933x)) {
                    if (this.f32884L > 0) {
                        this.f32912g0 = false;
                    }
                    if (this.f32896X && (dVar = this.f32929t) != null && i10 < remaining && !this.f32912g0) {
                        dVar.g();
                    }
                }
                int i11 = this.f32931v.f32950c;
                if (i11 == 0) {
                    this.f32883K += (long) i10;
                }
                if (i10 == remaining) {
                    if (i11 != 0) {
                        if (this.f32892T == this.f32890R) {
                            z10 = true;
                        }
                        C5950a.g(z10);
                        this.f32884L += ((long) this.f32885M) * ((long) this.f32891S);
                    }
                    this.f32892T = null;
                }
            }
        }
    }

    private boolean V() {
        if (!this.f32932w.f()) {
            U(Long.MIN_VALUE);
            return this.f32892T == null;
        }
        this.f32932w.h();
        o0(Long.MIN_VALUE);
        if (!this.f32932w.e()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f32892T;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private static int W(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        C5950a.g(minBufferSize != -2);
        return minBufferSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        return N3.C6664b.e(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int X(int r2, java.nio.ByteBuffer r3) {
        /*
            r0 = 20
            if (r2 == r0) goto L_0x0063
            r0 = 30
            if (r2 == r0) goto L_0x005e
            r0 = -1
            r1 = 1024(0x400, float:1.435E-42)
            switch(r2) {
                case 5: goto L_0x0059;
                case 6: goto L_0x0059;
                case 7: goto L_0x005e;
                case 8: goto L_0x005e;
                case 9: goto L_0x0044;
                case 10: goto L_0x0043;
                case 11: goto L_0x0040;
                case 12: goto L_0x0040;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r2) {
                case 14: goto L_0x0031;
                case 15: goto L_0x002e;
                case 16: goto L_0x002d;
                case 17: goto L_0x0028;
                case 18: goto L_0x0059;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected audio encoding: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L_0x0028:
            int r2 = N3.C6665c.e(r3)
            return r2
        L_0x002d:
            return r1
        L_0x002e:
            r2 = 512(0x200, float:7.175E-43)
            return r2
        L_0x0031:
            int r2 = N3.C6664b.b(r3)
            if (r2 != r0) goto L_0x0039
            r2 = 0
            goto L_0x003f
        L_0x0039:
            int r2 = N3.C6664b.i(r3, r2)
            int r2 = r2 * 16
        L_0x003f:
            return r2
        L_0x0040:
            r2 = 2048(0x800, float:2.87E-42)
            return r2
        L_0x0043:
            return r1
        L_0x0044:
            int r2 = r3.position()
            int r2 = t3.N.P(r3, r2)
            int r2 = N3.C6660F.m(r2)
            if (r2 == r0) goto L_0x0053
            return r2
        L_0x0053:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L_0x0059:
            int r2 = N3.C6664b.e(r3)
            return r2
        L_0x005e:
            int r2 = N3.C6677o.f(r3)
            return r2
        L_0x0063:
            int r2 = N3.C6662H.h(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.M.X(int, java.nio.ByteBuffer):int");
    }

    /* access modifiers changed from: private */
    public long Y() {
        h hVar = this.f32931v;
        return hVar.f32950c == 0 ? this.f32881I / ((long) hVar.f32949b) : this.f32882J;
    }

    /* access modifiers changed from: private */
    public long Z() {
        h hVar = this.f32931v;
        return hVar.f32950c == 0 ? N.l(this.f32883K, (long) hVar.f32951d) : this.f32884L;
    }

    private void a0(long j10) {
        this.f32918j0 += j10;
        if (this.f32920k0 == null) {
            this.f32920k0 = new Handler(Looper.myLooper());
        }
        this.f32920k0.removeCallbacksAndMessages((Object) null);
        this.f32920k0.postDelayed(new J(this), 100);
    }

    /* access modifiers changed from: private */
    public static boolean b0() {
        boolean z10;
        synchronized (f32870m0) {
            z10 = f32872o0 > 0;
        }
        return z10;
    }

    private boolean c0() {
        C6360i iVar;
        v1 v1Var;
        if (this.f32922m.b()) {
            return false;
        }
        AudioTrack T10 = T();
        this.f32933x = T10;
        if (f0(T10)) {
            p0(this.f32933x);
            h hVar = this.f32931v;
            if (hVar.f32958k) {
                AudioTrack audioTrack = this.f32933x;
                C5807s sVar = hVar.f32948a;
                audioTrack.setOffloadDelayPadding(sVar.f28222G, sVar.f28223H);
            }
        }
        int i10 = N.f29462a;
        if (i10 >= 31 && (v1Var = this.f32928s) != null) {
            c.a(this.f32933x, v1Var);
        }
        this.f32898Z = this.f32933x.getAudioSessionId();
        C6349A a10 = this.f32913h;
        AudioTrack audioTrack2 = this.f32933x;
        h hVar2 = this.f32931v;
        a10.r(audioTrack2, hVar2.f32950c == 2, hVar2.f32954g, hVar2.f32951d, hVar2.f32955h);
        v0();
        int i11 = this.f32900a0.f28126a;
        if (i11 != 0) {
            this.f32933x.attachAuxEffect(i11);
            this.f32933x.setAuxEffectSendLevel(this.f32900a0.f28127b);
        }
        C6361j jVar = this.f32902b0;
        if (jVar != null && i10 >= 23) {
            b.a(this.f32933x, jVar);
            C6360i iVar2 = this.f32935z;
            if (iVar2 != null) {
                iVar2.i(this.f32902b0.f33063a);
            }
        }
        if (i10 >= 24 && (iVar = this.f32935z) != null) {
            this.f32873A = new l(this.f32933x, iVar);
        }
        this.f32887O = true;
        C6375y.d dVar = this.f32929t;
        if (dVar != null) {
            dVar.d(this.f32931v.a());
        }
        return true;
    }

    private static boolean d0(int i10) {
        return (N.f29462a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean e0() {
        return this.f32933x != null;
    }

    private static boolean f0(AudioTrack audioTrack) {
        return N.f29462a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h0(AudioTrack audioTrack, C6375y.d dVar, Handler handler, C6375y.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new L(dVar, aVar));
            }
            synchronized (f32870m0) {
                try {
                    int i10 = f32872o0 - 1;
                    f32872o0 = i10;
                    if (i10 == 0) {
                        f32871n0.shutdown();
                        f32871n0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new L(dVar, aVar));
            }
            synchronized (f32870m0) {
                int i11 = f32872o0 - 1;
                f32872o0 = i11;
                if (i11 == 0) {
                    f32871n0.shutdown();
                    f32871n0 = null;
                }
                throw th3;
            }
        } finally {
            while (true) {
            }
        }
    }

    private void i0() {
        if (this.f32931v.f()) {
            this.f32910f0 = true;
        }
    }

    private ByteBuffer j0(ByteBuffer byteBuffer) {
        if (this.f32931v.f32950c != 0) {
            return byteBuffer;
        }
        int F10 = (int) N.F(N.P0(20), this.f32931v.f32952e);
        long Z10 = Z();
        if (Z10 >= ((long) F10)) {
            return byteBuffer;
        }
        h hVar = this.f32931v;
        return Z.a(byteBuffer, hVar.f32954g, hVar.f32951d, (int) Z10, F10);
    }

    /* access modifiers changed from: private */
    public void k0() {
        if (this.f32918j0 >= 300000) {
            this.f32929t.f();
            this.f32918j0 = 0;
        }
    }

    private void l0() {
        if (this.f32935z == null && this.f32899a != null) {
            this.f32914h0 = Looper.myLooper();
            C6360i iVar = new C6360i(this.f32899a, new K(this), this.f32874B, this.f32902b0);
            this.f32935z = iVar;
            this.f32934y = iVar.g();
        }
    }

    private void n0() {
        if (!this.f32894V) {
            this.f32894V = true;
            this.f32913h.f(Z());
            if (f0(this.f32933x)) {
                this.f32895W = false;
            }
            this.f32933x.stop();
            this.f32880H = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r0 = r2.f32890R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r0.hasRemaining() != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r2.f32932w.i(r2.f32890R);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o0(long r3) {
        /*
            r2 = this;
            r2.U(r3)
            java.nio.ByteBuffer r0 = r2.f32892T
            if (r0 == 0) goto L_0x0008
            return
        L_0x0008:
            r3.a r0 = r2.f32932w
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x001b
            java.nio.ByteBuffer r0 = r2.f32890R
            if (r0 == 0) goto L_0x001a
            r2.u0(r0)
            r2.U(r3)
        L_0x001a:
            return
        L_0x001b:
            r3.a r0 = r2.f32932w
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x004d
        L_0x0023:
            r3.a r0 = r2.f32932w
            java.nio.ByteBuffer r0 = r0.d()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x003a
            r2.u0(r0)
            r2.U(r3)
            java.nio.ByteBuffer r0 = r2.f32892T
            if (r0 == 0) goto L_0x0023
            return
        L_0x003a:
            java.nio.ByteBuffer r0 = r2.f32890R
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            r3.a r0 = r2.f32932w
            java.nio.ByteBuffer r1 = r2.f32890R
            r0.i(r1)
            goto L_0x001b
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.M.o0(long):void");
    }

    private void p0(AudioTrack audioTrack) {
        if (this.f32921l == null) {
            this.f32921l = new o();
        }
        this.f32921l.a(audioTrack);
    }

    private static void q0(AudioTrack audioTrack, C6375y.d dVar, C6375y.a aVar) {
        Handler handler = new Handler(Looper.myLooper());
        synchronized (f32870m0) {
            try {
                if (f32871n0 == null) {
                    f32871n0 = N.R0("ExoPlayer:AudioTrackReleaseThread");
                }
                f32872o0++;
                f32871n0.schedule(new I(audioTrack, dVar, handler, aVar), 20, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void r0() {
        this.f32881I = 0;
        this.f32882J = 0;
        this.f32883K = 0;
        this.f32884L = 0;
        this.f32912g0 = false;
        this.f32885M = 0;
        this.f32876D = new k(this.f32877E, 0, 0);
        this.f32888P = 0;
        this.f32875C = null;
        this.f32915i.clear();
        this.f32890R = null;
        this.f32891S = 0;
        this.f32892T = null;
        this.f32894V = false;
        this.f32893U = false;
        this.f32895W = false;
        this.f32879G = null;
        this.f32880H = 0;
        this.f32907e.o();
        w0();
    }

    private void s0(D d10) {
        k kVar = new k(d10, -9223372036854775807L, -9223372036854775807L);
        if (e0()) {
            this.f32875C = kVar;
        } else {
            this.f32876D = kVar;
        }
    }

    private void t0() {
        if (e0()) {
            try {
                this.f32933x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f32877E.f27859a).setPitch(this.f32877E.f27860b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                q.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            D d10 = new D(this.f32933x.getPlaybackParams().getSpeed(), this.f32933x.getPlaybackParams().getPitch());
            this.f32877E = d10;
            this.f32913h.s(d10.f27859a);
        }
    }

    private void u0(ByteBuffer byteBuffer) {
        C5950a.g(this.f32892T == null);
        if (byteBuffer.hasRemaining()) {
            this.f32892T = j0(byteBuffer);
        }
    }

    private void v0() {
        if (e0()) {
            this.f32933x.setVolume(this.f32889Q);
        }
    }

    private void w0() {
        r3.a aVar = this.f32931v.f32956i;
        this.f32932w = aVar;
        aVar.b();
    }

    private boolean x0() {
        if (!this.f32904c0) {
            h hVar = this.f32931v;
            return hVar.f32950c == 0 && !y0(hVar.f32948a.f28221F);
        }
    }

    private boolean y0(int i10) {
        return this.f32903c && N.D0(i10);
    }

    private boolean z0() {
        h hVar = this.f32931v;
        return hVar != null && hVar.f32957j && N.f29462a >= 23;
    }

    public void A(v1 v1Var) {
        this.f32928s = v1Var;
    }

    public C6362k B(C5807s sVar) {
        return this.f32910f0 ? C6362k.f33064d : this.f32925p.a(sVar, this.f32874B);
    }

    public void C(boolean z10) {
        this.f32878F = z10;
        s0(z0() ? D.f27856d : this.f32877E);
    }

    public void D(C6375y.d dVar) {
        this.f32929t = dVar;
    }

    public void a() {
        flush();
        e0<r3.b> q10 = this.f32909f.iterator();
        while (q10.hasNext()) {
            q10.next().a();
        }
        e0<r3.b> q11 = this.f32911g.iterator();
        while (q11.hasNext()) {
            q11.next().a();
        }
        r3.a aVar = this.f32932w;
        if (aVar != null) {
            aVar.j();
        }
        this.f32896X = false;
        this.f32910f0 = false;
    }

    public boolean b(C5807s sVar) {
        return r(sVar) != 0;
    }

    public void c() {
        this.f32896X = false;
        if (!e0()) {
            return;
        }
        if (this.f32913h.o() || f0(this.f32933x)) {
            this.f32933x.pause();
        }
    }

    public boolean d() {
        return !e0() || (this.f32893U && !k());
    }

    public D e() {
        return this.f32877E;
    }

    public void flush() {
        l lVar;
        if (e0()) {
            r0();
            if (this.f32913h.h()) {
                this.f32933x.pause();
            }
            if (f0(this.f32933x)) {
                ((o) C5950a.e(this.f32921l)).b(this.f32933x);
            }
            C6375y.a a10 = this.f32931v.a();
            h hVar = this.f32930u;
            if (hVar != null) {
                this.f32931v = hVar;
                this.f32930u = null;
            }
            this.f32913h.p();
            if (N.f29462a >= 24 && (lVar = this.f32873A) != null) {
                lVar.c();
                this.f32873A = null;
            }
            q0(this.f32933x, this.f32929t, a10);
            this.f32933x = null;
        }
        this.f32923n.a();
        this.f32922m.a();
        this.f32916i0 = 0;
        this.f32918j0 = 0;
        Handler handler = this.f32920k0;
        if (handler != null) {
            ((Handler) C5950a.e(handler)).removeCallbacksAndMessages((Object) null);
        }
    }

    public void g(D d10) {
        this.f32877E = new D(N.o(d10.f27859a, 0.1f, 8.0f), N.o(d10.f27860b, 0.1f, 8.0f));
        if (z0()) {
            t0();
        } else {
            s0(d10);
        }
    }

    public void h(float f10) {
        if (this.f32889Q != f10) {
            this.f32889Q = f10;
            v0();
        }
    }

    public void i() {
        this.f32896X = true;
        if (e0()) {
            this.f32913h.u();
            this.f32933x.play();
        }
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        this.f32902b0 = audioDeviceInfo == null ? null : new C6361j(audioDeviceInfo);
        C6360i iVar = this.f32935z;
        if (iVar != null) {
            iVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f32933x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f32902b0);
        }
    }

    public boolean k() {
        return e0() && (N.f29462a < 29 || !this.f32933x.isOffloadedPlayback() || !this.f32895W) && this.f32913h.g(Z());
    }

    public void l(C5792c cVar) {
        if (!this.f32874B.equals(cVar)) {
            this.f32874B = cVar;
            if (!this.f32904c0) {
                C6360i iVar = this.f32935z;
                if (iVar != null) {
                    iVar.h(cVar);
                }
                flush();
            }
        }
    }

    public void m(int i10) {
        if (this.f32898Z != i10) {
            this.f32898Z = i10;
            this.f32897Y = i10 != 0;
            flush();
        }
    }

    public void m0(C6356e eVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f32914h0;
        if (looper != myLooper) {
            String str = "null";
            String name = looper == null ? str : looper.getThread().getName();
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + str + ") is not the playback looper (" + name + ")");
        } else if (!eVar.equals(this.f32934y)) {
            this.f32934y = eVar;
            C6375y.d dVar = this.f32929t;
            if (dVar != null) {
                dVar.i();
            }
        }
    }

    public void n(int i10) {
        C5950a.g(N.f29462a >= 29);
        this.f32919k = i10;
    }

    public void o() {
        if (this.f32904c0) {
            this.f32904c0 = false;
            flush();
        }
    }

    public void p(C5953d dVar) {
        this.f32913h.t(dVar);
    }

    public void q(C5795f fVar) {
        if (!this.f32900a0.equals(fVar)) {
            int i10 = fVar.f28126a;
            float f10 = fVar.f28127b;
            AudioTrack audioTrack = this.f32933x;
            if (audioTrack != null) {
                if (this.f32900a0.f28126a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f32933x.setAuxEffectSendLevel(f10);
                }
            }
            this.f32900a0 = fVar;
        }
    }

    public int r(C5807s sVar) {
        l0();
        if (!"audio/raw".equals(sVar.f28244o)) {
            return this.f32934y.k(sVar, this.f32874B) ? 2 : 0;
        }
        if (!N.E0(sVar.f28221F)) {
            q.h("DefaultAudioSink", "Invalid PCM encoding: " + sVar.f28221F);
            return 0;
        }
        int i10 = sVar.f28221F;
        return (i10 == 2 || (this.f32903c && i10 == 4)) ? 2 : 1;
    }

    public void release() {
        C6360i iVar = this.f32935z;
        if (iVar != null) {
            iVar.j();
        }
    }

    public boolean s(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        int i11 = i10;
        ByteBuffer byteBuffer3 = this.f32890R;
        C5950a.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f32930u != null) {
            if (!V()) {
                return false;
            }
            if (!this.f32930u.b(this.f32931v)) {
                n0();
                if (k()) {
                    return false;
                }
                flush();
            } else {
                this.f32931v = this.f32930u;
                this.f32930u = null;
                AudioTrack audioTrack = this.f32933x;
                if (audioTrack != null && f0(audioTrack) && this.f32931v.f32958k) {
                    if (this.f32933x.getPlayState() == 3) {
                        this.f32933x.setOffloadEndOfStream();
                        this.f32913h.a();
                    }
                    AudioTrack audioTrack2 = this.f32933x;
                    C5807s sVar = this.f32931v.f32948a;
                    audioTrack2.setOffloadDelayPadding(sVar.f28222G, sVar.f28223H);
                    this.f32912g0 = true;
                }
            }
            O(j11);
        }
        if (!e0()) {
            try {
                if (!c0()) {
                    return false;
                }
            } catch (C6375y.c e10) {
                C6375y.c cVar = e10;
                if (!cVar.f33110b) {
                    this.f32922m.c(cVar);
                    return false;
                }
                throw cVar;
            }
        }
        this.f32922m.a();
        if (this.f32887O) {
            this.f32888P = Math.max(0, j11);
            this.f32886N = false;
            this.f32887O = false;
            if (z0()) {
                t0();
            }
            O(j11);
            if (this.f32896X) {
                i();
            }
        }
        if (!this.f32913h.j(Z())) {
            return false;
        }
        if (this.f32890R == null) {
            C5950a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f32931v;
            if (hVar.f32950c != 0 && this.f32885M == 0) {
                int X10 = X(hVar.f32954g, byteBuffer2);
                this.f32885M = X10;
                if (X10 == 0) {
                    return true;
                }
            }
            if (this.f32875C != null) {
                if (!V()) {
                    return false;
                }
                O(j11);
                this.f32875C = null;
            }
            long e11 = this.f32888P + this.f32931v.e(Y() - this.f32907e.n());
            if (!this.f32886N && Math.abs(e11 - j11) > 200000) {
                C6375y.d dVar = this.f32929t;
                if (dVar != null) {
                    dVar.b(new C6375y.e(j11, e11));
                }
                this.f32886N = true;
            }
            if (this.f32886N) {
                if (!V()) {
                    return false;
                }
                long j12 = j11 - e11;
                this.f32888P += j12;
                this.f32886N = false;
                O(j11);
                C6375y.d dVar2 = this.f32929t;
                if (!(dVar2 == null || j12 == 0)) {
                    dVar2.j();
                }
            }
            if (this.f32931v.f32950c == 0) {
                this.f32881I += (long) byteBuffer.remaining();
            } else {
                this.f32882J += ((long) this.f32885M) * ((long) i11);
            }
            this.f32890R = byteBuffer2;
            this.f32891S = i11;
        }
        o0(j11);
        if (!this.f32890R.hasRemaining()) {
            this.f32890R = null;
            this.f32891S = 0;
            return true;
        } else if (!this.f32913h.i(Z())) {
            return false;
        } else {
            q.h("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public void t() {
        if (!this.f32893U && e0() && V()) {
            n0();
            this.f32893U = true;
        }
    }

    public void u(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f32933x;
        if (audioTrack != null && f0(audioTrack) && (hVar = this.f32931v) != null && hVar.f32958k) {
            this.f32933x.setOffloadDelayPadding(i10, i11);
        }
    }

    public long v(boolean z10) {
        if (!e0() || this.f32887O) {
            return Long.MIN_VALUE;
        }
        return Q(P(Math.min(this.f32913h.c(z10), this.f32931v.d(Z()))));
    }

    public void x() {
        this.f32886N = true;
    }

    public void y() {
        C5950a.g(this.f32897Y);
        if (!this.f32904c0) {
            this.f32904c0 = true;
            flush();
        }
    }

    public void z(C5807s sVar, int i10, int[] iArr) {
        boolean z10;
        boolean z11;
        r3.a aVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C5807s sVar2 = sVar;
        l0();
        if ("audio/raw".equals(sVar2.f28244o)) {
            C5950a.a(N.E0(sVar2.f28221F));
            i16 = N.h0(sVar2.f28221F, sVar2.f28219D);
            C9967v.a aVar2 = new C9967v.a();
            if (y0(sVar2.f28221F)) {
                aVar2.j(this.f32911g);
            } else {
                aVar2.j(this.f32909f);
                aVar2.i(this.f32901b.b());
            }
            r3.a aVar3 = new r3.a(aVar2.k());
            if (aVar3.equals(this.f32932w)) {
                aVar3 = this.f32932w;
            }
            this.f32907e.p(sVar2.f28222G, sVar2.f28223H);
            this.f32905d.n(iArr);
            try {
                b.a a10 = aVar3.a(new b.a(sVar2));
                int i22 = a10.f28647c;
                int i23 = a10.f28645a;
                int M10 = N.M(a10.f28646b);
                i11 = 0;
                z10 = false;
                i13 = N.h0(i22, a10.f28646b);
                aVar = aVar3;
                i12 = i23;
                i14 = M10;
                z11 = this.f32917j;
                i15 = i22;
            } catch (b.C0454b e10) {
                throw new C6375y.b((Throwable) e10, sVar2);
            }
        } else {
            r3.a aVar4 = new r3.a(C9967v.E());
            int i24 = sVar2.f28220E;
            C6362k B10 = this.f32919k != 0 ? B(sVar) : C6362k.f33064d;
            if (this.f32919k == 0 || !B10.f33065a) {
                Pair<Integer, Integer> i25 = this.f32934y.i(sVar2, this.f32874B);
                if (i25 != null) {
                    int intValue = ((Integer) i25.first).intValue();
                    aVar = aVar4;
                    i16 = -1;
                    i13 = -1;
                    z10 = false;
                    i12 = i24;
                    i14 = ((Integer) i25.second).intValue();
                    i15 = intValue;
                    z11 = this.f32917j;
                    i11 = 2;
                } else {
                    throw new C6375y.b("Unable to configure passthrough for: " + sVar2, sVar2);
                }
            } else {
                int f10 = A.f((String) C5950a.e(sVar2.f28244o), sVar2.f28240k);
                int M11 = N.M(sVar2.f28219D);
                aVar = aVar4;
                i11 = 1;
                z11 = true;
                i16 = -1;
                i13 = -1;
                i12 = i24;
                z10 = B10.f33066b;
                i15 = f10;
                i14 = M11;
            }
        }
        if (i15 == 0) {
            throw new C6375y.b("Invalid output encoding (mode=" + i11 + ") for: " + sVar2, sVar2);
        } else if (i14 != 0) {
            int i26 = sVar2.f28239j;
            if ("audio/vnd.dts.hd;profile=lbr".equals(sVar2.f28244o) && i26 == -1) {
                i26 = 768000;
            }
            int i27 = i26;
            if (i10 != 0) {
                i21 = i10;
                i19 = i15;
                i18 = i14;
                i17 = i13;
                i20 = i12;
            } else {
                e eVar = this.f32924o;
                int W10 = W(i12, i14, i15);
                i19 = i15;
                i18 = i14;
                int i28 = i27;
                i17 = i13;
                i20 = i12;
                i21 = eVar.a(W10, i15, i11, i13 != -1 ? i13 : 1, i12, i28, z11 ? 8.0d : 1.0d);
            }
            this.f32910f0 = false;
            h hVar = r2;
            h hVar2 = new h(sVar, i16, i11, i17, i20, i18, i19, i21, aVar, z11, z10, this.f32904c0);
            if (e0()) {
                this.f32930u = hVar;
            } else {
                this.f32931v = hVar;
            }
        } else {
            throw new C6375y.b("Invalid output channel config (mode=" + i11 + ") for: " + sVar2, sVar2);
        }
    }

    private M(g gVar) {
        C6356e eVar;
        Context a10 = gVar.f32938a;
        this.f32899a = a10;
        C5792c cVar = C5792c.f28108g;
        this.f32874B = cVar;
        if (a10 != null) {
            eVar = C6356e.e(a10, cVar, (AudioDeviceInfo) null);
        } else {
            eVar = gVar.f32939b;
        }
        this.f32934y = eVar;
        this.f32901b = gVar.f32940c;
        this.f32903c = gVar.f32941d;
        this.f32917j = N.f29462a >= 23 && gVar.f32942e;
        this.f32919k = 0;
        this.f32924o = gVar.f32944g;
        this.f32925p = (d) C5950a.e(gVar.f32946i);
        this.f32913h = new C6349A(new n());
        C6350B b10 = new C6350B();
        this.f32905d = b10;
        c0 c0Var = new c0();
        this.f32907e = c0Var;
        this.f32909f = C9967v.H(new r3.g(), b10, c0Var);
        this.f32911g = C9967v.F(new b0());
        this.f32889Q = 1.0f;
        this.f32898Z = 0;
        this.f32900a0 = new C5795f(0, 0.0f);
        D d10 = D.f27856d;
        this.f32876D = new k(d10, 0, 0);
        this.f32877E = d10;
        this.f32878F = false;
        this.f32915i = new ArrayDeque<>();
        this.f32922m = new m<>();
        this.f32923n = new m<>();
        this.f32926q = gVar.f32947j;
        this.f32927r = gVar.f32945h;
    }
}
