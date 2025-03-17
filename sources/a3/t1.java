package A3;

import A3.C6300b;
import A3.u1;
import B3.C6375y;
import C3.C6417h;
import C3.C6422m;
import C3.O;
import E3.C6452A;
import G3.C6477A;
import G3.C6479C;
import G3.C6503x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.exoplayer.C5233j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import kb.C9967v;
import kb.e0;
import q3.B;
import q3.C;
import q3.C5797h;
import q3.C5803n;
import q3.C5807s;
import q3.E;
import q3.J;
import q3.N;
import q3.S;
import q3.w;
import t3.C5950a;
import t3.N;
import t3.v;
import w3.D;
import w3.p;
import w3.r;
import w3.s;
import w3.t;
import z3.C6279b;

public final class t1 implements C6300b, u1.a {

    /* renamed from: A  reason: collision with root package name */
    private boolean f32626A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f32627a;

    /* renamed from: b  reason: collision with root package name */
    private final u1 f32628b;

    /* renamed from: c  reason: collision with root package name */
    private final PlaybackSession f32629c;

    /* renamed from: d  reason: collision with root package name */
    private final long f32630d = SystemClock.elapsedRealtime();

    /* renamed from: e  reason: collision with root package name */
    private final J.c f32631e = new J.c();

    /* renamed from: f  reason: collision with root package name */
    private final J.b f32632f = new J.b();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, Long> f32633g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, Long> f32634h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private String f32635i;

    /* renamed from: j  reason: collision with root package name */
    private PlaybackMetrics.Builder f32636j;

    /* renamed from: k  reason: collision with root package name */
    private int f32637k;

    /* renamed from: l  reason: collision with root package name */
    private int f32638l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f32639m = 0;

    /* renamed from: n  reason: collision with root package name */
    private C f32640n;

    /* renamed from: o  reason: collision with root package name */
    private b f32641o;

    /* renamed from: p  reason: collision with root package name */
    private b f32642p;

    /* renamed from: q  reason: collision with root package name */
    private b f32643q;

    /* renamed from: r  reason: collision with root package name */
    private C5807s f32644r;

    /* renamed from: s  reason: collision with root package name */
    private C5807s f32645s;

    /* renamed from: t  reason: collision with root package name */
    private C5807s f32646t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f32647u;

    /* renamed from: v  reason: collision with root package name */
    private int f32648v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f32649w;

    /* renamed from: x  reason: collision with root package name */
    private int f32650x;

    /* renamed from: y  reason: collision with root package name */
    private int f32651y;

    /* renamed from: z  reason: collision with root package name */
    private int f32652z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f32653a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32654b;

        public a(int i10, int i11) {
            this.f32653a = i10;
            this.f32654b = i11;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C5807s f32655a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32656b;

        /* renamed from: c  reason: collision with root package name */
        public final String f32657c;

        public b(C5807s sVar, int i10, String str) {
            this.f32655a = sVar;
            this.f32656b = i10;
            this.f32657c = str;
        }
    }

    private t1(Context context, PlaybackSession playbackSession) {
        this.f32627a = context.getApplicationContext();
        this.f32629c = playbackSession;
        C6332r0 r0Var = new C6332r0();
        this.f32628b = r0Var;
        r0Var.d(this);
    }

    private static a A0(C c10, Context context, boolean z10) {
        boolean z11;
        int i10;
        if (c10.f27853a == 1001) {
            return new a(20, 0);
        }
        if (c10 instanceof C5233j) {
            C5233j jVar = (C5233j) c10;
            z11 = jVar.f22783j == 1;
            i10 = jVar.f22787n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) C5950a.e(c10.getCause());
        if (th2 instanceof IOException) {
            if (th2 instanceof t) {
                return new a(5, ((t) th2).f31502d);
            }
            if ((th2 instanceof s) || (th2 instanceof B)) {
                return new a(z10 ? 10 : 11, 0);
            }
            boolean z12 = th2 instanceof r;
            if (z12 || (th2 instanceof D.a)) {
                if (v.d(context).f() == 1) {
                    return new a(3, 0);
                }
                Throwable cause = th2.getCause();
                return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (!z12 || ((r) th2).f31500c != 1) ? new a(8, 0) : new a(4, 0);
            } else if (c10.f27853a == 1002) {
                return new a(21, 0);
            } else {
                if (th2 instanceof C6422m.a) {
                    Throwable th3 = (Throwable) C5950a.e(th2.getCause());
                    if (!(th3 instanceof MediaDrm.MediaDrmStateException)) {
                        return (N.f29462a < 23 || !(th3 instanceof MediaDrmResetException)) ? th3 instanceof NotProvisionedException ? new a(24, 0) : th3 instanceof DeniedByServerException ? new a(29, 0) : th3 instanceof O ? new a(23, 0) : th3 instanceof C6417h.e ? new a(28, 0) : new a(30, 0) : new a(27, 0);
                    }
                    int Z10 = N.Z(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
                    return new a(x0(Z10), Z10);
                } else if (!(th2 instanceof p.b) || !(th2.getCause() instanceof FileNotFoundException)) {
                    return new a(9, 0);
                } else {
                    Throwable cause2 = ((Throwable) C5950a.e(th2.getCause())).getCause();
                    return (!(cause2 instanceof ErrnoException) || ((ErrnoException) cause2).errno != OsConstants.EACCES) ? new a(31, 0) : new a(32, 0);
                }
            }
        } else if (z11 && (i10 == 0 || i10 == 1)) {
            return new a(35, 0);
        } else {
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof C6452A.c) {
                return new a(13, N.Z(((C6452A.c) th2).f34736d));
            }
            if (th2 instanceof E3.s) {
                return new a(14, ((E3.s) th2).f34822c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof C6375y.c) {
                return new a(17, ((C6375y.c) th2).f33109a);
            }
            if (th2 instanceof C6375y.f) {
                return new a(18, ((C6375y.f) th2).f33114a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(x0(errorCode), errorCode);
        }
    }

    private static Pair<String, String> B0(String str) {
        String[] h12 = N.h1(str, "-");
        return Pair.create(h12[0], h12.length >= 2 ? h12[1] : null);
    }

    private static int D0(Context context) {
        switch (v.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
            default:
                return 1;
        }
    }

    private static int E0(w wVar) {
        w.h hVar = wVar.f28319b;
        if (hVar == null) {
            return 0;
        }
        int y02 = N.y0(hVar.f28411a, hVar.f28412b);
        if (y02 == 0) {
            return 3;
        }
        if (y02 != 1) {
            return y02 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int F0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void G0(C6300b.C0501b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int b10 = bVar.b(i10);
            C6300b.a c10 = bVar.c(b10);
            if (b10 == 0) {
                this.f32628b.e(c10);
            } else if (b10 == 11) {
                this.f32628b.g(c10, this.f32637k);
            } else {
                this.f32628b.b(c10);
            }
        }
    }

    private void H0(long j10) {
        int D02 = D0(this.f32627a);
        if (D02 != this.f32639m) {
            this.f32639m = D02;
            this.f32629c.reportNetworkEvent(D0.a().setNetworkType(D02).setTimeSinceCreatedMillis(j10 - this.f32630d).build());
        }
    }

    private void I0(long j10) {
        C c10 = this.f32640n;
        if (c10 != null) {
            a A02 = A0(c10, this.f32627a, this.f32648v == 4);
            this.f32629c.reportPlaybackErrorEvent(Z0.a().setTimeSinceCreatedMillis(j10 - this.f32630d).setErrorCode(A02.f32653a).setSubErrorCode(A02.f32654b).setException(c10).build());
            this.f32626A = true;
            this.f32640n = null;
        }
    }

    private void J0(E e10, C6300b.C0501b bVar, long j10) {
        if (e10.V() != 2) {
            this.f32647u = false;
        }
        if (e10.p() == null) {
            this.f32649w = false;
        } else if (bVar.a(10)) {
            this.f32649w = true;
        }
        int R02 = R0(e10);
        if (this.f32638l != R02) {
            this.f32638l = R02;
            this.f32626A = true;
            this.f32629c.reportPlaybackStateEvent(k1.a().setState(this.f32638l).setTimeSinceCreatedMillis(j10 - this.f32630d).build());
        }
    }

    private void K0(E e10, C6300b.C0501b bVar, long j10) {
        if (bVar.a(2)) {
            q3.N r10 = e10.r();
            boolean c10 = r10.c(2);
            boolean c11 = r10.c(1);
            boolean c12 = r10.c(3);
            if (c10 || c11 || c12) {
                if (!c10) {
                    P0(j10, (C5807s) null, 0);
                }
                if (!c11) {
                    L0(j10, (C5807s) null, 0);
                }
                if (!c12) {
                    N0(j10, (C5807s) null, 0);
                }
            }
        }
        if (u0(this.f32641o)) {
            b bVar2 = this.f32641o;
            C5807s sVar = bVar2.f32655a;
            if (sVar.f28252w != -1) {
                P0(j10, sVar, bVar2.f32656b);
                this.f32641o = null;
            }
        }
        if (u0(this.f32642p)) {
            b bVar3 = this.f32642p;
            L0(j10, bVar3.f32655a, bVar3.f32656b);
            this.f32642p = null;
        }
        if (u0(this.f32643q)) {
            b bVar4 = this.f32643q;
            N0(j10, bVar4.f32655a, bVar4.f32656b);
            this.f32643q = null;
        }
    }

    private void L0(long j10, C5807s sVar, int i10) {
        if (!N.d(this.f32645s, sVar)) {
            if (this.f32645s == null && i10 == 0) {
                i10 = 1;
            }
            this.f32645s = sVar;
            Q0(0, j10, sVar, i10);
        }
    }

    private void M0(E e10, C6300b.C0501b bVar) {
        C5803n y02;
        if (bVar.a(0)) {
            C6300b.a c10 = bVar.c(0);
            if (this.f32636j != null) {
                O0(c10.f32515b, c10.f32517d);
            }
        }
        if (!(!bVar.a(2) || this.f32636j == null || (y02 = y0(e10.r().a())) == null)) {
            PlaybackMetrics.Builder unused = L0.a(N.i(this.f32636j)).setDrmType(z0(y02));
        }
        if (bVar.a(1011)) {
            this.f32652z++;
        }
    }

    private void N0(long j10, C5807s sVar, int i10) {
        if (!N.d(this.f32646t, sVar)) {
            if (this.f32646t == null && i10 == 0) {
                i10 = 1;
            }
            this.f32646t = sVar;
            Q0(2, j10, sVar, i10);
        }
    }

    private void O0(J j10, C6479C.b bVar) {
        int b10;
        PlaybackMetrics.Builder builder = this.f32636j;
        if (bVar != null && (b10 = j10.b(bVar.f35620a)) != -1) {
            j10.f(b10, this.f32632f);
            j10.n(this.f32632f.f27904c, this.f32631e);
            PlaybackMetrics.Builder unused = builder.setStreamType(E0(this.f32631e.f27927c));
            J.c cVar = this.f32631e;
            if (cVar.f27937m != -9223372036854775807L && !cVar.f27935k && !cVar.f27933i && !cVar.f()) {
                PlaybackMetrics.Builder unused2 = builder.setMediaDurationMillis(this.f32631e.d());
            }
            PlaybackMetrics.Builder unused3 = builder.setPlaybackType(this.f32631e.f() ? 2 : 1);
            this.f32626A = true;
        }
    }

    private void P0(long j10, C5807s sVar, int i10) {
        if (!N.d(this.f32644r, sVar)) {
            if (this.f32644r == null && i10 == 0) {
                i10 = 1;
            }
            this.f32644r = sVar;
            Q0(1, j10, sVar, i10);
        }
    }

    private void Q0(int i10, long j10, C5807s sVar, int i11) {
        TrackChangeEvent.Builder a10 = C6334s0.a(i10).setTimeSinceCreatedMillis(j10 - this.f32630d);
        if (sVar != null) {
            TrackChangeEvent.Builder unused = a10.setTrackState(1);
            TrackChangeEvent.Builder unused2 = a10.setTrackChangeReason(F0(i11));
            String str = sVar.f28243n;
            if (str != null) {
                TrackChangeEvent.Builder unused3 = a10.setContainerMimeType(str);
            }
            String str2 = sVar.f28244o;
            if (str2 != null) {
                TrackChangeEvent.Builder unused4 = a10.setSampleMimeType(str2);
            }
            String str3 = sVar.f28240k;
            if (str3 != null) {
                TrackChangeEvent.Builder unused5 = a10.setCodecName(str3);
            }
            int i12 = sVar.f28239j;
            if (i12 != -1) {
                TrackChangeEvent.Builder unused6 = a10.setBitrate(i12);
            }
            int i13 = sVar.f28251v;
            if (i13 != -1) {
                TrackChangeEvent.Builder unused7 = a10.setWidth(i13);
            }
            int i14 = sVar.f28252w;
            if (i14 != -1) {
                TrackChangeEvent.Builder unused8 = a10.setHeight(i14);
            }
            int i15 = sVar.f28219D;
            if (i15 != -1) {
                TrackChangeEvent.Builder unused9 = a10.setChannelCount(i15);
            }
            int i16 = sVar.f28220E;
            if (i16 != -1) {
                TrackChangeEvent.Builder unused10 = a10.setAudioSampleRate(i16);
            }
            String str4 = sVar.f28233d;
            if (str4 != null) {
                Pair<String, String> B02 = B0(str4);
                TrackChangeEvent.Builder unused11 = a10.setLanguage((String) B02.first);
                Object obj = B02.second;
                if (obj != null) {
                    TrackChangeEvent.Builder unused12 = a10.setLanguageRegion((String) obj);
                }
            }
            float f10 = sVar.f28253x;
            if (f10 != -1.0f) {
                TrackChangeEvent.Builder unused13 = a10.setVideoFrameRate(f10);
            }
        } else {
            TrackChangeEvent.Builder unused14 = a10.setTrackState(0);
        }
        this.f32626A = true;
        this.f32629c.reportTrackChangeEvent(a10.build());
    }

    private int R0(E e10) {
        int V10 = e10.V();
        if (this.f32647u) {
            return 5;
        }
        if (this.f32649w) {
            return 13;
        }
        if (V10 == 4) {
            return 11;
        }
        if (V10 == 2) {
            int i10 = this.f32638l;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (!e10.H()) {
                return 7;
            }
            return e10.y() != 0 ? 10 : 6;
        } else if (V10 == 3) {
            if (!e10.H()) {
                return 4;
            }
            return e10.y() != 0 ? 9 : 3;
        } else if (V10 != 1 || this.f32638l == 0) {
            return this.f32638l;
        } else {
            return 12;
        }
    }

    private boolean u0(b bVar) {
        return bVar != null && bVar.f32657c.equals(this.f32628b.a());
    }

    public static t1 v0(Context context) {
        MediaMetricsManager a10 = o1.a(context.getSystemService("media_metrics"));
        if (a10 == null) {
            return null;
        }
        return new t1(context, a10.createPlaybackSession());
    }

    private void w0() {
        PlaybackMetrics.Builder builder = this.f32636j;
        if (builder != null && this.f32626A) {
            PlaybackMetrics.Builder unused = builder.setAudioUnderrunCount(this.f32652z);
            PlaybackMetrics.Builder unused2 = this.f32636j.setVideoFramesDropped(this.f32650x);
            PlaybackMetrics.Builder unused3 = this.f32636j.setVideoFramesPlayed(this.f32651y);
            Long l10 = this.f32633g.get(this.f32635i);
            PlaybackMetrics.Builder unused4 = this.f32636j.setNetworkTransferDurationMillis(l10 == null ? 0 : l10.longValue());
            Long l11 = this.f32634h.get(this.f32635i);
            PlaybackMetrics.Builder unused5 = this.f32636j.setNetworkBytesRead(l11 == null ? 0 : l11.longValue());
            PlaybackMetrics.Builder unused6 = this.f32636j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f32629c.reportPlaybackMetrics(this.f32636j.build());
        }
        this.f32636j = null;
        this.f32635i = null;
        this.f32652z = 0;
        this.f32650x = 0;
        this.f32651y = 0;
        this.f32644r = null;
        this.f32645s = null;
        this.f32646t = null;
        this.f32626A = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int x0(int i10) {
        switch (N.Y(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static C5803n y0(C9967v<N.a> vVar) {
        C5803n nVar;
        e0<N.a> q10 = vVar.iterator();
        while (q10.hasNext()) {
            N.a next = q10.next();
            int i10 = 0;
            while (true) {
                if (i10 < next.f28058a) {
                    if (next.g(i10) && (nVar = next.b(i10).f28248s) != null) {
                        return nVar;
                    }
                    i10++;
                }
            }
        }
        return null;
    }

    private static int z0(C5803n nVar) {
        for (int i10 = 0; i10 < nVar.f28172d; i10++) {
            UUID uuid = nVar.c(i10).f28174b;
            if (uuid.equals(C5797h.f28132d)) {
                return 3;
            }
            if (uuid.equals(C5797h.f28133e)) {
                return 2;
            }
            if (uuid.equals(C5797h.f28131c)) {
                return 6;
            }
        }
        return 1;
    }

    public LogSessionId C0() {
        return this.f32629c.getSessionId();
    }

    public void O(C6300b.a aVar, C c10) {
        this.f32640n = c10;
    }

    public void T(E e10, C6300b.C0501b bVar) {
        if (bVar.d() != 0) {
            G0(bVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            M0(e10, bVar);
            I0(elapsedRealtime);
            K0(e10, bVar, elapsedRealtime);
            H0(elapsedRealtime);
            J0(e10, bVar, elapsedRealtime);
            if (bVar.a(1028)) {
                this.f32628b.f(bVar.c(1028));
            }
        }
    }

    public void a(C6300b.a aVar, C6279b bVar) {
        this.f32650x += bVar.f32412g;
        this.f32651y += bVar.f32410e;
    }

    public void e0(C6300b.a aVar, String str) {
    }

    public void h(C6300b.a aVar, int i10, long j10, long j11) {
        C6479C.b bVar = aVar.f32517d;
        if (bVar != null) {
            String c10 = this.f32628b.c(aVar.f32515b, (C6479C.b) C5950a.e(bVar));
            Long l10 = this.f32634h.get(c10);
            Long l11 = this.f32633g.get(c10);
            long j12 = 0;
            this.f32634h.put(c10, Long.valueOf((l10 == null ? 0 : l10.longValue()) + j10));
            HashMap<String, Long> hashMap = this.f32633g;
            if (l11 != null) {
                j12 = l11.longValue();
            }
            hashMap.put(c10, Long.valueOf(j12 + ((long) i10)));
        }
    }

    public void h0(C6300b.a aVar, S s10) {
        b bVar = this.f32641o;
        if (bVar != null) {
            C5807s sVar = bVar.f32655a;
            if (sVar.f28252w == -1) {
                this.f32641o = new b(sVar.b().x0(s10.f28068a).c0(s10.f28069b).M(), bVar.f32656b, bVar.f32657c);
            }
        }
    }

    public void o(C6300b.a aVar, String str, String str2) {
    }

    public void o0(C6300b.a aVar, E.e eVar, E.e eVar2, int i10) {
        if (i10 == 1) {
            this.f32647u = true;
        }
        this.f32637k = i10;
    }

    public void p(C6300b.a aVar, C6477A a10) {
        if (aVar.f32517d != null) {
            b bVar = new b((C5807s) C5950a.e(a10.f35614c), a10.f35615d, this.f32628b.c(aVar.f32515b, (C6479C.b) C5950a.e(aVar.f32517d)));
            int i10 = a10.f35613b;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f32642p = bVar;
                    return;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.f32643q = bVar;
                        return;
                    }
                    return;
                }
            }
            this.f32641o = bVar;
        }
    }

    public void u(C6300b.a aVar, String str, boolean z10) {
        C6479C.b bVar = aVar.f32517d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f32635i)) {
            w0();
        }
        this.f32633g.remove(str);
        this.f32634h.remove(str);
    }

    public void v(C6300b.a aVar, String str) {
        C6479C.b bVar = aVar.f32517d;
        if (bVar == null || !bVar.b()) {
            w0();
            this.f32635i = str;
            this.f32636j = O0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.1");
            O0(aVar.f32515b, aVar.f32517d);
        }
    }

    public void w(C6300b.a aVar, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
        this.f32648v = a10.f35612a;
    }
}
