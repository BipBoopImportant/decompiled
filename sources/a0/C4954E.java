package a0;

import C.C4391e0;
import H2.i;
import I.n;
import a0.C4965i;
import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.h1;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.concurrent.futures.c;
import b0.C5251a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

/* renamed from: a0.E  reason: case insensitive filesystem */
public class C4954E implements C4965i {

    /* renamed from: E  reason: collision with root package name */
    private static final Range<Long> f14976E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: A  reason: collision with root package name */
    private boolean f14977A = false;

    /* renamed from: B  reason: collision with root package name */
    private boolean f14978B = false;

    /* renamed from: C  reason: collision with root package name */
    boolean f14979C = false;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public Future<?> f14980D;

    /* renamed from: a  reason: collision with root package name */
    final String f14981a;

    /* renamed from: b  reason: collision with root package name */
    final Object f14982b = new Object();

    /* renamed from: c  reason: collision with root package name */
    final boolean f14983c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final MediaFormat f14984d;

    /* renamed from: e  reason: collision with root package name */
    final MediaCodec f14985e;

    /* renamed from: f  reason: collision with root package name */
    final C4965i.a f14986f;

    /* renamed from: g  reason: collision with root package name */
    private final Y f14987g;

    /* renamed from: h  reason: collision with root package name */
    final Executor f14988h;

    /* renamed from: i  reason: collision with root package name */
    private final C10101e<Void> f14989i;

    /* renamed from: j  reason: collision with root package name */
    private final c.a<Void> f14990j;

    /* renamed from: k  reason: collision with root package name */
    final Queue<Integer> f14991k = new ArrayDeque();

    /* renamed from: l  reason: collision with root package name */
    private final Queue<c.a<a0>> f14992l = new ArrayDeque();

    /* renamed from: m  reason: collision with root package name */
    private final Set<a0> f14993m = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    final Set<C4964h> f14994n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    final Deque<Range<Long>> f14995o = new ArrayDeque();

    /* renamed from: p  reason: collision with root package name */
    final h1 f14996p;

    /* renamed from: q  reason: collision with root package name */
    final h0 f14997q = new g0();

    /* renamed from: r  reason: collision with root package name */
    C4966j f14998r = C4966j.f15110a;

    /* renamed from: s  reason: collision with root package name */
    Executor f14999s = H.a.a();

    /* renamed from: t  reason: collision with root package name */
    d f15000t;

    /* renamed from: u  reason: collision with root package name */
    Range<Long> f15001u = f14976E;

    /* renamed from: v  reason: collision with root package name */
    long f15002v = 0;

    /* renamed from: w  reason: collision with root package name */
    boolean f15003w = false;

    /* renamed from: x  reason: collision with root package name */
    Long f15004x = null;

    /* renamed from: y  reason: collision with root package name */
    Future<?> f15005y = null;

    /* renamed from: z  reason: collision with root package name */
    private e f15006z = null;

    /* renamed from: a0.E$a */
    class a implements I.c<a0> {

        /* renamed from: a0.E$a$a  reason: collision with other inner class name */
        class C0220a implements I.c<Void> {
            C0220a() {
            }

            public void b(Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    C4954E.this.I((MediaCodec.CodecException) th2);
                } else {
                    C4954E.this.H(0, th2.getMessage(), th2);
                }
            }

            /* renamed from: c */
            public void a(Void voidR) {
            }
        }

        a() {
        }

        public void b(Throwable th2) {
            C4954E.this.H(0, "Unable to acquire InputBuffer.", th2);
        }

        /* renamed from: c */
        public void a(a0 a0Var) {
            a0Var.c(C4954E.this.F());
            a0Var.a(true);
            a0Var.b();
            n.j(a0Var.d(), new C0220a(), C4954E.this.f14988h);
        }
    }

    /* renamed from: a0.E$b */
    private static class b {
        static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* renamed from: a0.E$c */
    class c implements C4965i.a, H0 {

        /* renamed from: a  reason: collision with root package name */
        private final Map<H0.a<? super X.c>, Executor> f15009a = new LinkedHashMap();

        /* renamed from: b  reason: collision with root package name */
        private X.c f15010b = X.c.INACTIVE;

        /* renamed from: c  reason: collision with root package name */
        private final List<C10101e<a0>> f15011c = new ArrayList();

        c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(H0.a aVar, Executor executor) {
            this.f15009a.put((H0.a) i.g(aVar), (Executor) i.g(executor));
            executor.execute(new K(aVar, this.f15010b));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(c.a aVar) {
            aVar.c(this.f15010b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object n(c.a aVar) {
            C4954E.this.f14988h.execute(new J(this, aVar));
            return "fetchData";
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(H0.a aVar) {
            this.f15009a.remove(i.g(aVar));
        }

        public C10101e<X.c> a() {
            return androidx.concurrent.futures.c.a(new C4956G(this));
        }

        public void c(Executor executor, H0.a<? super X.c> aVar) {
            C4954E.this.f14988h.execute(new C4955F(this, aVar, executor));
        }

        public void d(H0.a<? super X.c> aVar) {
            C4954E.this.f14988h.execute(new I(this, aVar));
        }

        /* access modifiers changed from: package-private */
        public void q(boolean z10) {
            X.c cVar = z10 ? X.c.ACTIVE : X.c.INACTIVE;
            if (this.f15010b != cVar) {
                this.f15010b = cVar;
                if (cVar == X.c.INACTIVE) {
                    for (C10101e<a0> cancel : this.f15011c) {
                        cancel.cancel(true);
                    }
                    this.f15011c.clear();
                }
                for (Map.Entry next : this.f15009a.entrySet()) {
                    try {
                        ((Executor) next.getValue()).execute(new H(next, cVar));
                    } catch (RejectedExecutionException e10) {
                        C4391e0.d(C4954E.this.f14981a, "Unable to post to the supplied executor.", e10);
                    }
                }
            }
        }
    }

    /* renamed from: a0.E$d */
    enum d {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* renamed from: a0.E$e */
    class e extends MediaCodec.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final c0.e f15013a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15014b = true;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15015c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15016d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15017e = false;

        /* renamed from: f  reason: collision with root package name */
        private long f15018f = 0;

        /* renamed from: g  reason: collision with root package name */
        private long f15019g = 0;

        /* renamed from: h  reason: collision with root package name */
        private boolean f15020h = false;

        /* renamed from: i  reason: collision with root package name */
        private boolean f15021i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f15022j = false;

        /* renamed from: a0.E$e$a */
        class a implements I.c<Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4964h f15024a;

            a(C4964h hVar) {
                this.f15024a = hVar;
            }

            public void b(Throwable th2) {
                C4954E.this.f14994n.remove(this.f15024a);
                if (th2 instanceof MediaCodec.CodecException) {
                    C4954E.this.I((MediaCodec.CodecException) th2);
                } else {
                    C4954E.this.H(0, th2.getMessage(), th2);
                }
            }

            /* renamed from: c */
            public void a(Void voidR) {
                C4954E.this.f14994n.remove(this.f15024a);
            }
        }

        e() {
            if (C4954E.this.f14983c) {
                this.f15013a = new c0.e(C4954E.this.f14997q, C4954E.this.f14996p, (CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f15013a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.a.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk != null && codecStuckOnFlushQuirk.g(C4954E.this.f14984d.getString("mime"))) {
                this.f15014b = false;
            }
        }

        private boolean h(MediaCodec.BufferInfo bufferInfo) {
            if (this.f15017e) {
                C4391e0.a(C4954E.this.f14981a, "Drop buffer by already reach end of stream.");
                return false;
            } else if (bufferInfo.size <= 0) {
                C4391e0.a(C4954E.this.f14981a, "Drop buffer by invalid buffer size.");
                return false;
            } else if ((bufferInfo.flags & 2) != 0) {
                C4391e0.a(C4954E.this.f14981a, "Drop buffer by codec config.");
                return false;
            } else {
                c0.e eVar = this.f15013a;
                if (eVar != null) {
                    bufferInfo.presentationTimeUs = eVar.b(bufferInfo.presentationTimeUs);
                }
                long j10 = bufferInfo.presentationTimeUs;
                if (j10 <= this.f15018f) {
                    C4391e0.a(C4954E.this.f14981a, "Drop buffer by out of order buffer from MediaCodec.");
                    return false;
                }
                this.f15018f = j10;
                if (!C4954E.this.f15001u.contains(Long.valueOf(j10))) {
                    C4391e0.a(C4954E.this.f14981a, "Drop buffer by not in start-stop range.");
                    C4954E e10 = C4954E.this;
                    if (e10.f15003w && bufferInfo.presentationTimeUs >= e10.f15001u.getUpper().longValue()) {
                        Future<?> future = C4954E.this.f15005y;
                        if (future != null) {
                            future.cancel(true);
                        }
                        C4954E.this.f15004x = Long.valueOf(bufferInfo.presentationTimeUs);
                        C4954E.this.l0();
                        C4954E.this.f15003w = false;
                    }
                    return false;
                } else if (v(bufferInfo)) {
                    C4391e0.a(C4954E.this.f14981a, "Drop buffer by pause.");
                    return false;
                } else if (C4954E.this.G(bufferInfo) <= this.f15019g) {
                    C4391e0.a(C4954E.this.f14981a, "Drop buffer by adjusted time is less than the last sent time.");
                    if (C4954E.this.f14983c && C4954E.N(bufferInfo)) {
                        this.f15021i = true;
                    }
                    return false;
                } else {
                    if (!this.f15016d && !this.f15021i && C4954E.this.f14983c) {
                        this.f15021i = true;
                    }
                    if (this.f15021i) {
                        if (!C4954E.N(bufferInfo)) {
                            C4391e0.a(C4954E.this.f14981a, "Drop buffer by not a key frame.");
                            C4954E.this.h0();
                            return false;
                        }
                        this.f15021i = false;
                    }
                    return true;
                }
            }
        }

        private boolean i(MediaCodec.BufferInfo bufferInfo) {
            return C4954E.K(bufferInfo) || (this.f15014b && j(bufferInfo));
        }

        private boolean j(MediaCodec.BufferInfo bufferInfo) {
            C4954E e10 = C4954E.this;
            return e10.f14979C && bufferInfo.presentationTimeUs > e10.f15001u.getUpper().longValue();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(MediaCodec.CodecException codecException) {
            switch (C4954E.this.f15000t.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    C4954E.this.I(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C4954E.this.f15000t);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(int i10) {
            if (this.f15022j) {
                C4391e0.l(C4954E.this.f14981a, "Receives input frame after codec is reset.");
                return;
            }
            switch (C4954E.this.f15000t.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    C4954E.this.f14991k.offer(Integer.valueOf(i10));
                    C4954E.this.e0();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C4954E.this.f15000t);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
            C4966j jVar;
            Executor executor;
            if (this.f15022j) {
                C4391e0.l(C4954E.this.f14981a, "Receives frame after codec is reset.");
                return;
            }
            switch (C4954E.this.f15000t.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    synchronized (C4954E.this.f14982b) {
                        C4954E e10 = C4954E.this;
                        jVar = e10.f14998r;
                        executor = e10.f14999s;
                    }
                    if (!this.f15015c) {
                        this.f15015c = true;
                        try {
                            Objects.requireNonNull(jVar);
                            executor.execute(new Q(jVar));
                        } catch (RejectedExecutionException e11) {
                            C4391e0.d(C4954E.this.f14981a, "Unable to post to the supplied executor.", e11);
                        }
                    }
                    if (h(bufferInfo)) {
                        if (!this.f15016d) {
                            this.f15016d = true;
                            String str = C4954E.this.f14981a;
                            C4391e0.a(str, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + C4954E.this.f14996p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo s10 = s(bufferInfo);
                        this.f15019g = s10.presentationTimeUs;
                        try {
                            t(new C4964h(mediaCodec, i10, s10), jVar, executor);
                        } catch (MediaCodec.CodecException e12) {
                            C4954E.this.I(e12);
                            return;
                        }
                    } else {
                        try {
                            C4954E.this.f14985e.releaseOutputBuffer(i10, false);
                        } catch (MediaCodec.CodecException e13) {
                            C4954E.this.I(e13);
                            return;
                        }
                    }
                    if (!this.f15017e && i(bufferInfo)) {
                        r();
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C4954E.this.f15000t);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(MediaFormat mediaFormat) {
            C4966j jVar;
            Executor executor;
            if (this.f15022j) {
                C4391e0.l(C4954E.this.f14981a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (C4954E.this.f15000t.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    synchronized (C4954E.this.f14982b) {
                        C4954E e10 = C4954E.this;
                        jVar = e10.f14998r;
                        executor = e10.f14999s;
                    }
                    try {
                        executor.execute(new S(jVar, mediaFormat));
                        return;
                    } catch (RejectedExecutionException e11) {
                        C4391e0.d(C4954E.this.f14981a, "Unable to post to the supplied executor.", e11);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + C4954E.this.f15000t);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(Executor executor, C4966j jVar) {
            if (C4954E.this.f15000t != d.ERROR) {
                try {
                    Objects.requireNonNull(jVar);
                    executor.execute(new M(jVar));
                } catch (RejectedExecutionException e10) {
                    C4391e0.d(C4954E.this.f14981a, "Unable to post to the supplied executor.", e10);
                }
            }
        }

        private MediaCodec.BufferInfo s(MediaCodec.BufferInfo bufferInfo) {
            long G10 = C4954E.this.G(bufferInfo);
            if (bufferInfo.presentationTimeUs == G10) {
                return bufferInfo;
            }
            i.i(G10 > this.f15019g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, G10, bufferInfo.flags);
            return bufferInfo2;
        }

        private void t(C4964h hVar, C4966j jVar, Executor executor) {
            C4954E.this.f14994n.add(hVar);
            n.j(hVar.d(), new a(hVar), C4954E.this.f14988h);
            try {
                executor.execute(new U(jVar, hVar));
            } catch (RejectedExecutionException e10) {
                C4391e0.d(C4954E.this.f14981a, "Unable to post to the supplied executor.", e10);
                hVar.close();
            }
        }

        private boolean v(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            C4966j jVar;
            C4954E.this.p0(bufferInfo.presentationTimeUs);
            boolean M10 = C4954E.this.M(bufferInfo.presentationTimeUs);
            boolean z10 = this.f15020h;
            if (!z10 && M10) {
                C4391e0.a(C4954E.this.f14981a, "Switch to pause state");
                this.f15020h = true;
                synchronized (C4954E.this.f14982b) {
                    C4954E e10 = C4954E.this;
                    executor = e10.f14999s;
                    jVar = e10.f14998r;
                }
                Objects.requireNonNull(jVar);
                executor.execute(new W(jVar));
                C4954E e11 = C4954E.this;
                if (e11.f15000t == d.PAUSED && ((e11.f14983c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!C4954E.this.f14983c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    C4965i.a aVar = C4954E.this.f14986f;
                    if (aVar instanceof c) {
                        ((c) aVar).q(false);
                    }
                    C4954E.this.j0(true);
                }
                C4954E.this.f15004x = Long.valueOf(bufferInfo.presentationTimeUs);
                C4954E e12 = C4954E.this;
                if (e12.f15003w) {
                    Future<?> future = e12.f15005y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    C4954E.this.l0();
                    C4954E.this.f15003w = false;
                }
            } else if (z10 && !M10) {
                C4391e0.a(C4954E.this.f14981a, "Switch to resume state");
                this.f15020h = false;
                if (C4954E.this.f14983c && !C4954E.N(bufferInfo)) {
                    this.f15021i = true;
                }
            }
            return this.f15020h;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C4954E.this.f14988h.execute(new O(this, codecException));
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
            C4954E.this.f14988h.execute(new L(this, i10));
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
            C4954E.this.f14988h.execute(new N(this, bufferInfo, mediaCodec, i10));
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C4954E.this.f14988h.execute(new P(this, mediaFormat));
        }

        /* access modifiers changed from: package-private */
        public void r() {
            C4954E e10;
            C4966j jVar;
            Executor executor;
            if (!this.f15017e) {
                this.f15017e = true;
                if (C4954E.this.f14980D != null) {
                    C4954E.this.f14980D.cancel(false);
                    Future unused = C4954E.this.f14980D = null;
                }
                synchronized (C4954E.this.f14982b) {
                    e10 = C4954E.this;
                    jVar = e10.f14998r;
                    executor = e10.f14999s;
                }
                e10.o0(new T(this, executor, jVar));
            }
        }

        /* access modifiers changed from: package-private */
        public void u() {
            this.f15022j = true;
        }
    }

    /* renamed from: a0.E$f */
    class f implements C4965i.b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f15026a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private Surface f15027b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<Surface> f15028c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private C4965i.b.a f15029d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f15030e;

        f() {
        }

        private void d(Executor executor, C4965i.b.a aVar, Surface surface) {
            try {
                executor.execute(new X(aVar, surface));
            } catch (RejectedExecutionException e10) {
                C4391e0.d(C4954E.this.f14981a, "Unable to post to the supplied executor.", e10);
            }
        }

        public void b(Executor executor, C4965i.b.a aVar) {
            Surface surface;
            synchronized (this.f15026a) {
                this.f15029d = (C4965i.b.a) i.g(aVar);
                this.f15030e = (Executor) i.g(executor);
                surface = this.f15027b;
            }
            if (surface != null) {
                d(executor, aVar, surface);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.f15026a) {
                surface = this.f15027b;
                this.f15027b = null;
                hashSet = new HashSet<>(this.f15028c);
                this.f15028c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface release : hashSet) {
                release.release();
            }
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        public void f() {
            Surface surface;
            C4965i.b.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f15026a) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    try {
                        if (this.f15027b == null) {
                            surface = b.a();
                            this.f15027b = surface;
                        } else {
                            surface = null;
                        }
                        b.b(C4954E.this.f14985e, this.f15027b);
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                } else {
                    Surface surface2 = this.f15027b;
                    if (surface2 != null) {
                        this.f15028c.add(surface2);
                    }
                    surface = C4954E.this.f14985e.createInputSurface();
                    this.f15027b = surface;
                }
                aVar = this.f15029d;
                executor = this.f15030e;
            }
            if (surface != null && aVar != null && executor != null) {
                d(executor, aVar, surface);
            }
        }
    }

    public C4954E(Executor executor, C4967k kVar) {
        i.g(executor);
        i.g(kVar);
        MediaCodec a10 = C5251a.a(kVar);
        this.f14985e = a10;
        MediaCodecInfo codecInfo = a10.getCodecInfo();
        this.f14988h = H.a.f(executor);
        MediaFormat b10 = kVar.b();
        this.f14984d = b10;
        h1 c10 = kVar.c();
        this.f14996p = c10;
        if (kVar instanceof C4957a) {
            this.f14981a = "AudioEncoder";
            this.f14983c = false;
            this.f14986f = new c();
            this.f14987g = new C4958b(codecInfo, kVar.a());
        } else if (kVar instanceof i0) {
            this.f14981a = "VideoEncoder";
            this.f14983c = true;
            this.f14986f = new f();
            m0 m0Var = new m0(codecInfo, kVar.a());
            E(m0Var, b10);
            this.f14987g = m0Var;
        } else {
            throw new d0("Unknown encoder config type");
        }
        String str = this.f14981a;
        C4391e0.a(str, "mInputTimebase = " + c10);
        String str2 = this.f14981a;
        C4391e0.a(str2, "mMediaFormat = " + b10);
        try {
            i0();
            AtomicReference atomicReference = new AtomicReference();
            this.f14989i = n.B(androidx.concurrent.futures.c.a(new C4952C(atomicReference)));
            this.f14990j = (c.a) i.g((c.a) atomicReference.get());
            k0(d.CONFIGURED);
        } catch (MediaCodec.CodecException e10) {
            throw new d0((Throwable) e10);
        }
    }

    private void D() {
        if (androidx.camera.video.internal.compat.quirk.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            e eVar = this.f15006z;
            Executor executor = this.f14988h;
            Future<?> future = this.f14980D;
            if (future != null) {
                future.cancel(false);
            }
            this.f14980D = H.a.d().schedule(new r(executor, eVar), 1000, TimeUnit.MILLISECONDS);
        }
    }

    private void E(k0 k0Var, MediaFormat mediaFormat) {
        i.i(this.f14983c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = k0Var.g().clamp(Integer.valueOf(integer)).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                String str = this.f14981a;
                C4391e0.a(str, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    static boolean K(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    private boolean L() {
        return androidx.camera.video.internal.compat.quirk.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    static boolean N(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(c.a aVar) {
        this.f14992l.remove(aVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Q(Executor executor, e eVar) {
        Objects.requireNonNull(eVar);
        executor.execute(new C4976u(eVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(c0 c0Var) {
        this.f14993m.remove(c0Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V(long j10) {
        switch (this.f15000t.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
            case 7:
                return;
            case 1:
                String str = this.f14981a;
                C4391e0.a(str, "Pause on " + X.d.c(j10));
                this.f14995o.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                k0(d.PAUSED);
                return;
            case 4:
                k0(d.PENDING_START_PAUSED);
                return;
            case 6:
            case 8:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f15000t);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void W() {
        switch (this.f15000t.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 7:
                g0();
                return;
            case 3:
            case 4:
            case 5:
                k0(d.PENDING_RELEASE);
                return;
            case 6:
            case 8:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f15000t);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X() {
        int ordinal = this.f15000t.ordinal();
        if (ordinal == 1) {
            h0();
        } else if (ordinal == 6 || ordinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f14978B = true;
        if (this.f14977A) {
            this.f14985e.stop();
            i0();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Z(long j10) {
        switch (this.f15000t.ordinal()) {
            case 0:
                this.f15004x = null;
                String str = this.f14981a;
                C4391e0.a(str, "Start on " + X.d.c(j10));
                try {
                    if (this.f14977A) {
                        i0();
                    }
                    this.f15001u = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                    this.f14985e.start();
                    C4965i.a aVar = this.f14986f;
                    if (aVar instanceof c) {
                        ((c) aVar).q(true);
                    }
                    k0(d.STARTED);
                    return;
                } catch (MediaCodec.CodecException e10) {
                    I(e10);
                    return;
                }
            case 1:
            case 4:
            case 7:
                return;
            case 2:
                this.f15004x = null;
                Range removeLast = this.f14995o.removeLast();
                i.j(removeLast != null && ((Long) removeLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l10 = (Long) removeLast.getLower();
                long longValue = l10.longValue();
                this.f14995o.addLast(Range.create(l10, Long.valueOf(j10)));
                String str2 = this.f14981a;
                C4391e0.a(str2, "Resume on " + X.d.c(j10) + "\nPaused duration = " + X.d.c(j10 - longValue));
                if ((this.f14983c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.f14983c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    j0(false);
                    C4965i.a aVar2 = this.f14986f;
                    if (aVar2 instanceof c) {
                        ((c) aVar2).q(true);
                    }
                }
                if (this.f14983c) {
                    h0();
                }
                k0(d.STARTED);
                return;
            case 3:
            case 5:
                k0(d.PENDING_START);
                return;
            case 6:
            case 8:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f15000t);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a0() {
        if (this.f15003w) {
            C4391e0.l(this.f14981a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.f15004x = null;
            l0();
            this.f15003w = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b0() {
        this.f14988h.execute(new C4970n(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void c0(long r7, long r9) {
        /*
            r6 = this;
            a0.E$d r0 = r6.f15000t
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x0031;
                case 2: goto L_0x0031;
                case 3: goto L_0x00bb;
                case 4: goto L_0x002a;
                case 5: goto L_0x002a;
                case 6: goto L_0x0022;
                case 7: goto L_0x00bb;
                case 8: goto L_0x0022;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown state: "
            r8.append(r9)
            a0.E$d r9 = r6.f15000t
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0022:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Encoder is released"
            r7.<init>(r8)
            throw r7
        L_0x002a:
            a0.E$d r7 = a0.C4954E.d.CONFIGURED
            r6.k0(r7)
            goto L_0x00bb
        L_0x0031:
            a0.E$d r0 = r6.f15000t
            a0.E$d r1 = a0.C4954E.d.STOPPING
            r6.k0(r1)
            android.util.Range<java.lang.Long> r1 = r6.f15001u
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00b3
            r4 = -1
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0054
            goto L_0x005f
        L_0x0054:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0060
            java.lang.String r7 = r6.f14981a
            java.lang.String r8 = "The expected stop time is less than the start time. Use current time as stop time."
            C.C4391e0.l(r7, r8)
        L_0x005f:
            r7 = r9
        L_0x0060:
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 < 0) goto L_0x00ab
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            android.util.Range r9 = android.util.Range.create(r1, r9)
            r6.f15001u = r9
            java.lang.String r9 = r6.f14981a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Stop on "
            r10.append(r1)
            java.lang.String r7 = X.d.c(r7)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            C.C4391e0.a(r9, r7)
            a0.E$d r7 = a0.C4954E.d.PAUSED
            if (r0 != r7) goto L_0x0094
            java.lang.Long r7 = r6.f15004x
            if (r7 == 0) goto L_0x0094
            r6.l0()
            goto L_0x00bb
        L_0x0094:
            r7 = 1
            r6.f15003w = r7
            java.util.concurrent.ScheduledExecutorService r7 = H.a.d()
            a0.z r8 = new a0.z
            r8.<init>(r6)
            r9 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r8, r9, r0)
            r6.f15005y = r7
            goto L_0x00bb
        L_0x00ab:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "The start time should be before the stop time."
            r7.<init>(r8)
            throw r7
        L_0x00b3:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "There should be a \"start\" before \"stop\""
            r7.<init>(r8)
            throw r7
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C4954E.c0(long, long):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0(List list, Runnable runnable) {
        if (this.f15000t != d.ERROR) {
            if (!list.isEmpty()) {
                C4391e0.a(this.f14981a, "encoded data and input buffers are returned");
            }
            if (!(this.f14986f instanceof f) || this.f14978B || L()) {
                this.f14985e.stop();
            } else {
                this.f14985e.flush();
                this.f14977A = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        J();
    }

    private void g0() {
        if (this.f14977A) {
            this.f14985e.stop();
            this.f14977A = false;
        }
        this.f14985e.release();
        C4965i.a aVar = this.f14986f;
        if (aVar instanceof f) {
            ((f) aVar).e();
        }
        k0(d.RELEASED);
        this.f14990j.c(null);
    }

    private void i0() {
        this.f15001u = f14976E;
        this.f15002v = 0;
        this.f14995o.clear();
        this.f14991k.clear();
        for (c.a<a0> d10 : this.f14992l) {
            d10.d();
        }
        this.f14992l.clear();
        this.f14985e.reset();
        this.f14977A = false;
        this.f14978B = false;
        this.f14979C = false;
        this.f15003w = false;
        Future<?> future = this.f15005y;
        if (future != null) {
            future.cancel(true);
            this.f15005y = null;
        }
        Future<?> future2 = this.f14980D;
        if (future2 != null) {
            future2.cancel(false);
            this.f14980D = null;
        }
        e eVar = this.f15006z;
        if (eVar != null) {
            eVar.u();
        }
        e eVar2 = new e();
        this.f15006z = eVar2;
        this.f14985e.setCallback(eVar2);
        this.f14985e.configure(this.f14984d, (Surface) null, (MediaCrypto) null, 1);
        C4965i.a aVar = this.f14986f;
        if (aVar instanceof f) {
            ((f) aVar).f();
        }
    }

    private void k0(d dVar) {
        if (this.f15000t != dVar) {
            String str = this.f14981a;
            C4391e0.a(str, "Transitioning encoder internal state: " + this.f15000t + " --> " + dVar);
            this.f15000t = dVar;
        }
    }

    /* access modifiers changed from: private */
    public void m0() {
        n.j(C(), new a(), this.f14988h);
    }

    /* access modifiers changed from: package-private */
    public C10101e<a0> C() {
        switch (this.f15000t.ordinal()) {
            case 0:
                return n.n(new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                C10101e<a0> a10 = androidx.concurrent.futures.c.a(new C4974s(atomicReference));
                c.a aVar = (c.a) i.g((c.a) atomicReference.get());
                this.f14992l.offer(aVar);
                aVar.a(new C4975t(this, aVar), this.f14988h);
                e0();
                return a10;
            case 7:
                return n.n(new IllegalStateException("Encoder is in error state."));
            case 8:
                return n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f15000t);
        }
    }

    /* access modifiers changed from: package-private */
    public long F() {
        return this.f14997q.b();
    }

    /* access modifiers changed from: package-private */
    public long G(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f15002v;
        return j10 > 0 ? bufferInfo.presentationTimeUs - j10 : bufferInfo.presentationTimeUs;
    }

    /* access modifiers changed from: package-private */
    public void H(int i10, String str, Throwable th2) {
        switch (this.f15000t.ordinal()) {
            case 0:
                R(i10, str, th2);
                i0();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                k0(d.ERROR);
                o0(new C4980y(this, i10, str, th2));
                return;
            case 7:
                String str2 = this.f14981a;
                C4391e0.m(str2, "Get more than one error: " + str + "(" + i10 + ")", th2);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void I(MediaCodec.CodecException codecException) {
        H(1, codecException.getMessage(), codecException);
    }

    /* access modifiers changed from: package-private */
    public void J() {
        d dVar = this.f15000t;
        if (dVar == d.PENDING_RELEASE) {
            g0();
            return;
        }
        if (!this.f14977A) {
            i0();
        }
        k0(d.CONFIGURED);
        if (dVar == d.PENDING_START || dVar == d.PENDING_START_PAUSED) {
            start();
            if (dVar == d.PENDING_START_PAUSED) {
                c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean M(long j10) {
        for (Range next : this.f14995o) {
            if (!next.contains(Long.valueOf(j10))) {
                if (j10 < ((Long) next.getLower()).longValue()) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public C4965i.a a() {
        return this.f14986f;
    }

    public void b(long j10) {
        this.f14988h.execute(new C4978w(this, j10, F()));
    }

    public void c() {
        this.f14988h.execute(new C4979x(this, F()));
    }

    public Y d() {
        return this.f14987g;
    }

    public void e(C4966j jVar, Executor executor) {
        synchronized (this.f14982b) {
            this.f14998r = jVar;
            this.f14999s = executor;
        }
    }

    /* access modifiers changed from: package-private */
    public void e0() {
        while (!this.f14992l.isEmpty() && !this.f14991k.isEmpty()) {
            c.a poll = this.f14992l.poll();
            Objects.requireNonNull(poll);
            Integer poll2 = this.f14991k.poll();
            Objects.requireNonNull(poll2);
            try {
                c0 c0Var = new c0(this.f14985e, poll2.intValue());
                if (poll.c(c0Var)) {
                    this.f14993m.add(c0Var);
                    c0Var.d().a(new C4951B(this, c0Var), this.f14988h);
                } else {
                    c0Var.f();
                }
            } catch (MediaCodec.CodecException e10) {
                I(e10);
                return;
            }
        }
    }

    public C10101e<Void> f() {
        return this.f14989i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void R(int i10, String str, Throwable th2) {
        C4966j jVar;
        Executor executor;
        synchronized (this.f14982b) {
            jVar = this.f14998r;
            executor = this.f14999s;
        }
        try {
            executor.execute(new C4953D(jVar, i10, str, th2));
        } catch (RejectedExecutionException e10) {
            C4391e0.d(this.f14981a, "Unable to post to the supplied executor.", e10);
        }
    }

    public void g() {
        this.f14988h.execute(new C4973q(this));
    }

    public int h() {
        if (this.f14984d.containsKey("bitrate")) {
            return this.f14984d.getInteger("bitrate");
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void h0() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f14985e.setParameters(bundle);
    }

    /* access modifiers changed from: package-private */
    public void j0(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z10 ? 1 : 0);
        this.f14985e.setParameters(bundle);
    }

    /* access modifiers changed from: package-private */
    public void l0() {
        C4391e0.a(this.f14981a, "signalCodecStop");
        C4965i.a aVar = this.f14986f;
        if (aVar instanceof c) {
            ((c) aVar).q(false);
            ArrayList arrayList = new ArrayList();
            for (a0 d10 : this.f14993m) {
                arrayList.add(d10.d());
            }
            n.F(arrayList).a(new C4972p(this), this.f14988h);
        } else if (aVar instanceof f) {
            try {
                D();
                this.f14985e.signalEndOfInputStream();
                this.f14979C = true;
            } catch (MediaCodec.CodecException e10) {
                I(e10);
            }
        }
    }

    public void n0() {
        this.f14988h.execute(new C4977v(this));
    }

    /* access modifiers changed from: package-private */
    public void o0(Runnable runnable) {
        C4391e0.a(this.f14981a, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        for (C4964h d10 : this.f14994n) {
            arrayList.add(d10.d());
        }
        for (a0 d11 : this.f14993m) {
            arrayList.add(d11.d());
        }
        if (!arrayList.isEmpty()) {
            String str = this.f14981a;
            C4391e0.a(str, "Waiting for resources to return. encoded data = " + this.f14994n.size() + ", input buffers = " + this.f14993m.size());
        }
        n.F(arrayList).a(new C4971o(this, arrayList, runnable), this.f14988h);
    }

    /* access modifiers changed from: package-private */
    public void p0(long j10) {
        while (!this.f14995o.isEmpty()) {
            Range first = this.f14995o.getFirst();
            if (j10 > ((Long) first.getUpper()).longValue()) {
                this.f14995o.removeFirst();
                this.f15002v += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
                C4391e0.a(this.f14981a, "Total paused duration = " + X.d.c(this.f15002v));
            } else {
                return;
            }
        }
    }

    public void release() {
        this.f14988h.execute(new C4969m(this));
    }

    public void start() {
        this.f14988h.execute(new C4950A(this, F()));
    }
}
