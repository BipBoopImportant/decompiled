package kF;

import E1.C4478k;
import G3.C6497q;
import JF.V;
import JF.Z;
import QE.C13428e;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4910x;
import U0.I0;
import U0.L;
import U0.M;
import U0.M0;
import U0.o1;
import XH.C16807N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.compose.foundation.layout.J;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.K;
import androidx.lifecycle.r;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.sugarcube.common.R;
import i1.C5437c;
import kF.C14681B;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p1.C5747v0;
import p1.C5749w0;
import p1.i1;
import q3.E;
import q3.w;
import u2.C6012a;
import w3.m;
import x3.c;
import x3.r;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\"(\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001d8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&²\u0006\u000e\u0010%\u001a\u00020\b8\n@\nX\u0002"}, d2 = {"Landroid/net/Uri;", "videoUri", "", "videoFrame", "LkF/a;", "aspectRatio", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "showControls", "autoStart", "Lkotlin/Function1;", "LkF/B;", "LXH/N;", "onStateChange", "Landroidx/lifecycle/K;", "LkF/z;", "playbackActionLD", "LkF/A;", "buttonVariant", "l", "(Landroid/net/Uri;ILkF/a;Landroidx/lifecycle/y;ZZLnI/l;Landroidx/lifecycle/K;LkF/A;LU0/m;II)V", "Landroid/content/Context;", "context", "Lx3/r;", "cache", "Landroidx/media3/exoplayer/ExoPlayer;", "B", "(Landroid/content/Context;Landroid/net/Uri;ZLx3/r;)Landroidx/media3/exoplayer/ExoPlayer;", "LU0/I0;", "a", "LU0/I0;", "getLocalSimpleCacheProvider", "()LU0/I0;", "getLocalSimpleCacheProvider$annotations", "()V", "LocalSimpleCacheProvider", "frameVisibility", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<r> f128748a = C4910x.d((o1) null, new C14701W(), 1, (Object) null);

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"kF/b0$a", "Lq3/E$d;", "", "playbackState", "LXH/N;", "F", "(I)V", "", "isPlaying", "o0", "(Z)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements E.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O<C13428e> f128749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExoPlayer f128750b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<C14681B> f128751c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f128752d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f128753e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C14681B, C16807N> f128754f;

        a(O<C13428e> o10, ExoPlayer exoPlayer, O<C14681B> o11, boolean z10, C4899r0<Boolean> r0Var, C17642l<? super C14681B, C16807N> lVar) {
            this.f128749a = o10;
            this.f128750b = exoPlayer;
            this.f128751c = o11;
            this.f128752d = z10;
            this.f128753e = r0Var;
            this.f128754f = lVar;
        }

        public void F(int i10) {
            super.F(i10);
            O<C13428e> o10 = this.f128749a;
            if (((C13428e) o10.f144348a) != null) {
                ExoPlayer exoPlayer = this.f128750b;
                O<C14681B> o11 = this.f128751c;
                boolean z10 = this.f128752d;
                C4899r0<Boolean> r0Var = this.f128753e;
                if (i10 == 3 || i10 == 4) {
                    b0.x(o10, exoPlayer, o11, z10, r0Var, false, 32, (Object) null);
                }
            }
        }

        public void o0(boolean z10) {
            super.o0(z10);
            b0.z(this.f128750b, this.f128751c, this.f128754f);
            b0.x(this.f128749a, this.f128750b, this.f128751c, this.f128752d, this.f128753e, false, 32, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f128755a;

        b(int i10) {
            this.f128755a = i10;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-398441195, i10, -1, "com.sugarcube.app.base.ui.compose.common.VideoView.<anonymous>.<anonymous> (VideoView.kt:275)");
            }
            C5583F.a(J1.e.c(this.f128755a, mVar, 0), "Video thumbnail", androidx.compose.foundation.b.d(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), C5747v0.f27350b.h(), (i1) null, 2, (Object) null), (C5437c) null, C4478k.f5915a.a(), 0.0f, (C5749w0) null, mVar, 25008, 104);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kF/b0$c", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExoPlayer f128756a;

        public c(ExoPlayer exoPlayer) {
            this.f128756a = exoPlayer;
        }

        public void b() {
            ExoPlayer exoPlayer = this.f128756a;
            if (exoPlayer != null) {
                exoPlayer.release();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kF/b0$d", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5221y f128757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5218v f128758b;

        public d(C5221y yVar, C5218v vVar) {
            this.f128757a = yVar;
            this.f128758b = vVar;
        }

        public void b() {
            this.f128757a.getLifecycle().g(this.f128758b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f128759a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kF.a[] r0 = kF.C14705a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kF.a r1 = kF.C14705a.RATIO_16_10     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kF.a r1 = kF.C14705a.RATIO_16_9     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kF.a r1 = kF.C14705a.RATIO_4_3     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kF.a r1 = kF.C14705a.RATIO_1_1     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f128759a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kF.b0.e.<clinit>():void");
        }
    }

    private static final ExoPlayer B(Context context, Uri uri, boolean z10, r rVar) {
        ExoPlayer.b bVar = new ExoPlayer.b(context);
        if (rVar != null) {
            c.C0495c e10 = new c.C0495c().d(rVar).e(new m.b());
            C17542s.i(e10, "setUpstreamDataSourceFactory(...)");
            bVar.l(new C6497q(context).q(e10));
        }
        ExoPlayer f10 = bVar.f();
        f10.Z(0);
        w b10 = w.b(uri);
        C17542s.i(b10, "fromUri(...)");
        f10.O(b10);
        f10.d();
        f10.q(z10);
        C17542s.i(f10, "also(...)");
        return f10;
    }

    /* access modifiers changed from: private */
    public static final r k() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(android.net.Uri r33, int r34, kF.C14705a r35, androidx.lifecycle.C5221y r36, boolean r37, boolean r38, nI.C17642l<? super kF.C14681B, XH.C16807N> r39, androidx.lifecycle.K<kF.C14730z> r40, kF.C14680A r41, U0.C4889m r42, int r43, int r44) {
        /*
            r1 = r33
            r2 = r34
            r10 = r43
            r11 = r44
            r0 = 128(0x80, float:1.794E-43)
            r4 = 16
            r5 = 32
            r6 = 6
            java.lang.String r7 = "videoUri"
            kotlin.jvm.internal.C17542s.j(r1, r7)
            r7 = -256512077(0xfffffffff0b5efb3, float:-4.5045252E29)
            r8 = r42
            U0.m r8 = r8.k(r7)
            r9 = 1
            r12 = r11 & 1
            r13 = 4
            r14 = 2
            if (r12 == 0) goto L_0x0027
            r12 = r10 | 6
            goto L_0x0037
        L_0x0027:
            r12 = r10 & 6
            if (r12 != 0) goto L_0x0036
            boolean r12 = r8.F(r1)
            if (r12 == 0) goto L_0x0033
            r12 = r13
            goto L_0x0034
        L_0x0033:
            r12 = r14
        L_0x0034:
            r12 = r12 | r10
            goto L_0x0037
        L_0x0036:
            r12 = r10
        L_0x0037:
            r15 = r11 & 2
            if (r15 == 0) goto L_0x003e
            r12 = r12 | 48
            goto L_0x004c
        L_0x003e:
            r15 = r10 & 48
            if (r15 != 0) goto L_0x004c
            boolean r15 = r8.d(r2)
            if (r15 == 0) goto L_0x004a
            r15 = r5
            goto L_0x004b
        L_0x004a:
            r15 = r4
        L_0x004b:
            r12 = r12 | r15
        L_0x004c:
            r15 = r11 & 4
            if (r15 == 0) goto L_0x0055
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r6 = r35
            goto L_0x0068
        L_0x0055:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0052
            r6 = r35
            boolean r17 = r8.V(r6)
            if (r17 == 0) goto L_0x0064
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r17 = r0
        L_0x0066:
            r12 = r12 | r17
        L_0x0068:
            r13 = r10 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0082
            r13 = r11 & 8
            if (r13 != 0) goto L_0x007b
            r13 = r36
            boolean r17 = r8.F(r13)
            if (r17 == 0) goto L_0x007d
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007b:
            r13 = r36
        L_0x007d:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r12 = r12 | r17
            goto L_0x0084
        L_0x0082:
            r13 = r36
        L_0x0084:
            r4 = r4 & r11
            if (r4 == 0) goto L_0x008c
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0089:
            r14 = r37
            goto L_0x009f
        L_0x008c:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0089
            r14 = r37
            boolean r18 = r8.b(r14)
            if (r18 == 0) goto L_0x009b
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r12 = r12 | r18
        L_0x009f:
            r5 = r5 & r11
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00a9
            r12 = r12 | r18
            r7 = r38
            goto L_0x00bc
        L_0x00a9:
            r18 = r10 & r18
            r7 = r38
            if (r18 != 0) goto L_0x00bc
            boolean r19 = r8.b(r7)
            if (r19 == 0) goto L_0x00b8
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r12 = r12 | r19
        L_0x00bc:
            r19 = r11 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c7
            r12 = r12 | r20
            r9 = r39
            goto L_0x00da
        L_0x00c7:
            r20 = r10 & r20
            r9 = r39
            if (r20 != 0) goto L_0x00da
            boolean r21 = r8.F(r9)
            if (r21 == 0) goto L_0x00d6
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r12 = r12 | r21
        L_0x00da:
            r0 = r0 & r11
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e4
            r12 = r12 | r21
        L_0x00e1:
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x00f8
        L_0x00e4:
            r21 = r10 & r21
            r3 = r40
            if (r21 != 0) goto L_0x00e1
            boolean r22 = r8.F(r3)
            if (r22 == 0) goto L_0x00f3
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f3:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r12 = r12 | r22
            goto L_0x00e1
        L_0x00f8:
            r3 = r3 & r11
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0102
            r12 = r12 | r21
            r6 = r41
            goto L_0x0115
        L_0x0102:
            r21 = r10 & r21
            r6 = r41
            if (r21 != 0) goto L_0x0115
            boolean r21 = r8.V(r6)
            if (r21 == 0) goto L_0x0111
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x0111:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r12 = r12 | r21
        L_0x0115:
            r21 = 38347923(0x2492493, float:1.4777644E-37)
            r6 = r12 & r21
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 != r7) goto L_0x0136
            boolean r6 = r8.l()
            if (r6 != 0) goto L_0x0126
            goto L_0x0136
        L_0x0126:
            r8.L()
            r3 = r35
            r6 = r38
            r10 = r41
            r7 = r9
            r4 = r13
            r5 = r14
            r9 = r40
            goto L_0x043b
        L_0x0136:
            r8.G()
            r6 = 1
            r7 = r10 & 1
            if (r7 == 0) goto L_0x015a
            boolean r7 = r8.O()
            if (r7 == 0) goto L_0x0145
            goto L_0x015a
        L_0x0145:
            r8.L()
            r0 = r11 & 8
            if (r0 == 0) goto L_0x014e
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x014e:
            r7 = r35
            r4 = r38
            r5 = r40
            r15 = r41
        L_0x0156:
            r0 = r13
            r3 = r14
            r14 = r12
            goto L_0x018e
        L_0x015a:
            if (r15 == 0) goto L_0x015f
            kF.a r7 = kF.C14705a.RATIO_16_9
            goto L_0x0161
        L_0x015f:
            r7 = r35
        L_0x0161:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x0171
            U0.I0 r13 = j3.g.a()
            java.lang.Object r13 = r8.Q(r13)
            androidx.lifecycle.y r13 = (androidx.lifecycle.C5221y) r13
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0171:
            if (r4 == 0) goto L_0x0174
            r14 = 1
        L_0x0174:
            if (r5 == 0) goto L_0x0178
            r4 = 1
            goto L_0x017a
        L_0x0178:
            r4 = r38
        L_0x017a:
            if (r19 == 0) goto L_0x017d
            r9 = 0
        L_0x017d:
            if (r0 == 0) goto L_0x0181
            r0 = 0
            goto L_0x0183
        L_0x0181:
            r0 = r40
        L_0x0183:
            if (r3 == 0) goto L_0x018a
            kF.A$a r3 = kF.C14680A.a.f128656a
            r5 = r0
            r15 = r3
            goto L_0x0156
        L_0x018a:
            r15 = r41
            r5 = r0
            goto L_0x0156
        L_0x018e:
            r8.y()
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x01a0
            r12 = -1
            java.lang.String r13 = "com.sugarcube.app.base.ui.compose.common.VideoView (VideoView.kt:100)"
            r6 = -256512077(0xfffffffff0b5efb3, float:-4.5045252E29)
            U0.C4895p.S(r6, r14, r12, r13)
        L_0x01a0:
            U0.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r8.Q(r6)
            android.content.Context r6 = (android.content.Context) r6
            U0.I0<x3.r> r12 = f128748a
            java.lang.Object r12 = r8.Q(r12)
            x3.r r12 = (x3.r) r12
            kotlin.jvm.internal.O r13 = new kotlin.jvm.internal.O
            r13.<init>()
            kF.B$b r10 = kF.C14681B.b.f128659a
            r13.f144348a = r10
            r10 = 490045616(0x1d3580b0, float:2.402168E-21)
            r8.W(r10)
            U0.I0 r10 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r10 = r8.Q(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x01d3
            r10 = 0
            goto L_0x01f1
        L_0x01d3:
            r10 = 490047749(0x1d358905, float:2.4025988E-21)
            r8.W(r10)
            java.lang.Object r10 = r8.D()
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r11 = r18.a()
            if (r10 != r11) goto L_0x01ec
            androidx.media3.exoplayer.ExoPlayer r10 = B(r6, r1, r4, r12)
            r8.u(r10)
        L_0x01ec:
            androidx.media3.exoplayer.ExoPlayer r10 = (androidx.media3.exoplayer.ExoPlayer) r10
            r8.P()
        L_0x01f1:
            r8.P()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r12 = 0
            r41 = r4
            r29 = r5
            r1 = 1
            r4 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r11, r12, r1, r4)
            int[] r4 = kF.b0.e.f128759a
            int r18 = r7.ordinal()
            r4 = r4[r18]
            r12 = 3
            if (r4 == r1) goto L_0x0222
            r1 = 2
            if (r4 == r1) goto L_0x021e
            if (r4 == r12) goto L_0x021a
            r1 = 4
            if (r4 == r1) goto L_0x0217
            r1 = 1
        L_0x0215:
            r4 = 1
            goto L_0x0226
        L_0x0217:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0215
        L_0x021a:
            r1 = 1068149419(0x3faaaaab, float:1.3333334)
            goto L_0x0215
        L_0x021e:
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            goto L_0x0215
        L_0x0222:
            r1 = 1070386381(0x3fcccccd, float:1.6)
            goto L_0x0215
        L_0x0226:
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.C5074e.a(r11, r1, r4)
            kF.a r4 = kF.C14705a.UNCONSTRAINED
            if (r7 == r4) goto L_0x0230
            r4 = r7
            goto L_0x0231
        L_0x0230:
            r4 = 0
        L_0x0231:
            if (r4 == 0) goto L_0x023b
            androidx.compose.ui.d r1 = r5.s(r1)
            if (r1 != 0) goto L_0x023a
            goto L_0x023b
        L_0x023a:
            r5 = r1
        L_0x023b:
            kF.A$b r1 = kF.C14680A.b.f128657a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r15, r1)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.c()
            r12 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r12)
            int r12 = U0.C4883j.a(r8, r12)
            r30 = r7
            U0.y r7 = r8.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r8, r5)
            G1.g$a r19 = G1.C4504g.f6515W
            r31 = r15
            nI.a r15 = r19.a()
            U0.f r21 = r8.m()
            if (r21 != 0) goto L_0x026b
            U0.C4883j.c()
        L_0x026b:
            r8.I()
            boolean r21 = r8.i()
            if (r21 == 0) goto L_0x0278
            r8.p(r15)
            goto L_0x027b
        L_0x0278:
            r8.t()
        L_0x027b:
            U0.m r15 = U0.F1.a(r8)
            r32 = r11
            nI.p r11 = r19.c()
            U0.F1.c(r15, r4, r11)
            nI.p r4 = r19.e()
            U0.F1.c(r15, r7, r4)
            nI.p r4 = r19.b()
            boolean r7 = r15.i()
            if (r7 != 0) goto L_0x02a7
            java.lang.Object r7 = r15.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x02b5
        L_0x02a7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r15.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r15.w(r7, r4)
        L_0x02b5:
            nI.p r4 = r19.d()
            U0.F1.c(r15, r5, r4)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            kotlin.jvm.internal.O r4 = new kotlin.jvm.internal.O
            r4.<init>()
            r5 = -151094445(0xfffffffff6fe7b53, float:-2.5807514E33)
            r8.W(r5)
            java.lang.Object r5 = r8.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r11 = r7.a()
            if (r5 != r11) goto L_0x02e0
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r11 = 2
            r12 = 0
            U0.r0 r5 = U0.u1.e(r5, r12, r11, r12)
            r8.u(r5)
        L_0x02e0:
            U0.r0 r5 = (U0.C4899r0) r5
            r8.P()
            kF.Q r11 = new kF.Q
            r21 = r11
            r22 = r6
            r23 = r10
            r24 = r4
            r25 = r13
            r26 = r1
            r27 = r5
            r28 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r12 = 0
            r13 = 6
            r15 = 0
            r17 = 0
            r35 = r11
            r36 = r15
            r37 = r17
            r38 = r8
            r39 = r12
            r40 = r13
            androidx.compose.ui.viewinterop.e.a(r35, r36, r37, r38, r39, r40)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r12 = -150975032(0xfffffffff7004dc8, float:-2.602311E33)
            r8.W(r12)
            boolean r12 = r8.F(r10)
            java.lang.Object r13 = r8.D()
            if (r12 != 0) goto L_0x0326
            java.lang.Object r12 = r7.a()
            if (r13 != r12) goto L_0x032e
        L_0x0326:
            kF.S r13 = new kF.S
            r13.<init>(r10)
            r8.u(r13)
        L_0x032e:
            nI.l r13 = (nI.C17642l) r13
            r8.P()
            r12 = 6
            U0.P.c(r11, r13, r8, r12)
            r11 = -150968744(0xfffffffff7006658, float:-2.604257E33)
            r8.W(r11)
            boolean r11 = r8.F(r10)
            boolean r12 = r8.F(r0)
            r11 = r11 | r12
            java.lang.Object r12 = r8.D()
            if (r11 != 0) goto L_0x0352
            java.lang.Object r7 = r7.a()
            if (r12 != r7) goto L_0x035a
        L_0x0352:
            kF.T r12 = new kF.T
            r12.<init>(r0, r10)
            r8.u(r12)
        L_0x035a:
            nI.l r12 = (nI.C17642l) r12
            r8.P()
            int r7 = r14 >> 9
            r7 = r7 & 14
            U0.P.c(r0, r12, r8, r7)
            boolean r12 = u(r5)
            r5 = 0
            r7 = 0
            r11 = 3
            androidx.compose.animation.k r15 = androidx.compose.animation.g.q(r5, r7, r11, r5)
            kF.b0$b r5 = new kF.b0$b
            r5.<init>(r2)
            r7 = 54
            r11 = -398441195(0xffffffffe8404515, float:-3.6318748E24)
            r13 = 1
            c1.a r17 = c1.c.e(r11, r13, r5, r8, r7)
            r19 = 199680(0x30c00, float:2.79811E-40)
            r20 = 22
            r13 = 0
            r5 = 0
            r16 = 0
            r7 = r14
            r14 = r5
            r5 = r31
            r18 = r8
            l0.d.g(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r11 = -150939075(0xfffffffff700da3d, float:-2.613439E33)
            r8.W(r11)
            if (r3 == 0) goto L_0x03bf
            r11 = 10
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            r12 = r32
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.i(r12, r11)
            kF.U r12 = new kF.U
            r12.<init>(r4, r6, r1, r10)
            r1 = 48
            r4 = 4
            r6 = 0
            r35 = r12
            r36 = r11
            r37 = r6
            r38 = r8
            r39 = r1
            r40 = r4
            androidx.compose.ui.viewinterop.e.a(r35, r36, r37, r38, r39, r40)
        L_0x03bf:
            r8.P()
            r8.x()
            if (r29 != 0) goto L_0x03cb
            r4 = r29
            r1 = 0
            goto L_0x03d5
        L_0x03cb:
            int r1 = r7 >> 21
            r1 = r1 & 14
            r4 = r29
            U0.A1 r1 = d1.b.a(r4, r8, r1)
        L_0x03d5:
            if (r1 == 0) goto L_0x03de
            java.lang.Object r1 = r1.getValue()
            kF.z r1 = (kF.C14730z) r1
            goto L_0x03df
        L_0x03de:
            r1 = 0
        L_0x03df:
            if (r4 == 0) goto L_0x03e7
            r6 = 0
            r4.setValue(r6)
            XH.N r6 = XH.C16807N.f139792a
        L_0x03e7:
            if (r1 == 0) goto L_0x0427
            kF.z$a r6 = kF.C14730z.a.f128878a
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x03f2
            goto L_0x0427
        L_0x03f2:
            kF.z$b r6 = kF.C14730z.b.f128879a
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x0402
            if (r10 == 0) goto L_0x0429
            r10.c()
            XH.N r1 = XH.C16807N.f139792a
            goto L_0x0429
        L_0x0402:
            kF.z$c r6 = kF.C14730z.c.f128880a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r1 == 0) goto L_0x0421
            if (r10 == 0) goto L_0x0429
            long r6 = r10.h0()
            long r11 = r10.K()
            int r1 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r1 < 0) goto L_0x041d
            r6 = 0
            r10.R(r6)
        L_0x041d:
            r10.i()
            goto L_0x0429
        L_0x0421:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0427:
            XH.N r1 = XH.C16807N.f139792a
        L_0x0429:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0432
            U0.C4895p.R()
        L_0x0432:
            r6 = r41
            r10 = r5
            r7 = r9
            r5 = r3
            r9 = r4
            r3 = r30
            r4 = r0
        L_0x043b:
            U0.Y0 r12 = r8.n()
            if (r12 == 0) goto L_0x0454
            kF.V r13 = new kF.V
            r0 = r13
            r1 = r33
            r2 = r34
            r8 = r9
            r9 = r10
            r10 = r43
            r11 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0454:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kF.b0.l(android.net.Uri, int, kF.a, androidx.lifecycle.y, boolean, boolean, nI.l, androidx.lifecycle.K, kF.A, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final PlayerView m(Context context, ExoPlayer exoPlayer, O o10, O o11, boolean z10, C4899r0 r0Var, C17642l lVar, Context context2) {
        ExoPlayer exoPlayer2 = exoPlayer;
        C17542s.j(context2, "it");
        Context context3 = context;
        PlayerView playerView = new PlayerView(context);
        if (exoPlayer2 != null) {
            playerView.setPlayer(exoPlayer);
            playerView.setControllerHideOnTouch(false);
            playerView.setUseController(false);
            playerView.setResizeMode(4);
            E player = playerView.getPlayer();
            if (player != null) {
                player.u(new a(o10, exoPlayer, o11, z10, r0Var, lVar));
                x(o10, exoPlayer, o11, z10, r0Var, false, 32, (Object) null);
                O o12 = o10;
                V.c(player, new C14702X(o10), 0, 2, (Object) null);
            }
        }
        return playerView;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(O o10, int i10) {
        ProgressBar progressBar;
        C13428e eVar = (C13428e) o10.f144348a;
        if (!(eVar == null || (progressBar = eVar.f114557d) == null)) {
            progressBar.setProgress(i10, true);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L o(ExoPlayer exoPlayer, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        return new c(exoPlayer);
    }

    /* access modifiers changed from: private */
    public static final L p(C5221y yVar, ExoPlayer exoPlayer, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        a0 a0Var = new a0(exoPlayer);
        yVar.getLifecycle().c(a0Var);
        return new d(yVar, a0Var);
    }

    /* access modifiers changed from: private */
    public static final void q(ExoPlayer exoPlayer, C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "<unused var>");
        C17542s.j(aVar, "event");
        if (aVar == r.a.ON_PAUSE && exoPlayer != null) {
            exoPlayer.c();
        }
    }

    /* access modifiers changed from: private */
    public static final ConstraintLayout r(O o10, Context context, boolean z10, ExoPlayer exoPlayer, Context context2) {
        C17542s.j(context2, "it");
        T c10 = C13428e.c(LayoutInflater.from(context));
        if (z10) {
            c10.f114557d.setVisibility(8);
            c10.f114556c.setBackgroundTintList(ColorStateList.valueOf(C6012a.c(context, R.color.transparent)));
            c10.f114555b.setBackgroundTintList(ColorStateList.valueOf(C6012a.c(context, R.color.transparent)));
        } else {
            c10.f114557d.setVisibility(0);
            c10.f114556c.setBackgroundTintList(ColorStateList.valueOf(C6012a.c(context, R.color.grey_900_semi_transparent)));
            c10.f114555b.setBackgroundTintList(ColorStateList.valueOf(C6012a.c(context, R.color.grey_900_semi_transparent)));
        }
        c10.f114556c.setOnClickListener(new C14703Y(exoPlayer));
        c10.f114555b.setOnClickListener(new C14704Z(exoPlayer));
        o10.f144348a = c10;
        return c10.getRoot();
    }

    /* access modifiers changed from: private */
    public static final void s(ExoPlayer exoPlayer, View view) {
        if (exoPlayer != null) {
            if (exoPlayer.h0() >= exoPlayer.K()) {
                exoPlayer.R(0);
            }
            exoPlayer.i();
        }
    }

    /* access modifiers changed from: private */
    public static final void t(ExoPlayer exoPlayer, View view) {
        if (exoPlayer != null) {
            exoPlayer.c();
        }
    }

    private static final boolean u(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void v(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final void w(O<C13428e> o10, ExoPlayer exoPlayer, O<C14681B> o11, boolean z10, C4899r0<Boolean> r0Var, boolean z11) {
        C4899r0<Boolean> r0Var2 = r0Var;
        C13428e eVar = (C13428e) o10.f144348a;
        if (eVar != null) {
            if (exoPlayer == null || !exoPlayer.W()) {
                eVar.f114556c.setVisibility(0);
                if (z10) {
                    eVar.f114555b.setVisibility(8);
                    eVar.f114557d.setVisibility(8);
                } else if (z11) {
                    ImageButton imageButton = eVar.f114555b;
                    C17542s.i(imageButton, "exoPause");
                    Z.o(imageButton, 0, false, (C17631a) null, 7, (Object) null);
                    ProgressBar progressBar = eVar.f114557d;
                    C17542s.i(progressBar, "playerControlsProgressBar");
                    Z.o(progressBar, 0, false, (C17631a) null, 7, (Object) null);
                } else {
                    eVar.f114555b.setVisibility(8);
                    eVar.f114557d.setVisibility(8);
                }
            } else {
                eVar.f114555b.setVisibility(0);
                if (z10) {
                    eVar.f114556c.setVisibility(8);
                    eVar.f114557d.setVisibility(8);
                } else if (z11) {
                    ImageButton imageButton2 = eVar.f114556c;
                    C17542s.i(imageButton2, "exoPlay");
                    Z.o(imageButton2, 0, false, (C17631a) null, 7, (Object) null);
                    ProgressBar progressBar2 = eVar.f114557d;
                    C17542s.i(progressBar2, "playerControlsProgressBar");
                    Z.l(progressBar2, 0, (C17631a) null, 3, (Object) null);
                } else {
                    eVar.f114556c.setVisibility(8);
                    eVar.f114557d.setVisibility(0);
                }
            }
        }
        if (exoPlayer != null && exoPlayer.W()) {
            v(r0Var2, false);
        } else if (C17542s.e(o11.f144348a, C14681B.a.f128658a)) {
            v(r0Var2, true);
        }
    }

    static /* synthetic */ void x(O o10, ExoPlayer exoPlayer, O o11, boolean z10, C4899r0 r0Var, boolean z11, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z11 = true;
        }
        w(o10, exoPlayer, o11, z10, r0Var, z11);
    }

    /* access modifiers changed from: private */
    public static final C16807N y(Uri uri, int i10, C14705a aVar, C5221y yVar, boolean z10, boolean z11, C17642l lVar, K k10, C14680A a10, int i11, int i12, C4889m mVar, int i13) {
        l(uri, i10, aVar, yVar, z10, z11, lVar, k10, a10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void z(ExoPlayer exoPlayer, O<C14681B> o10, C17642l<? super C14681B, C16807N> lVar) {
        T t10 = (exoPlayer == null || !exoPlayer.W()) ? (exoPlayer == null || exoPlayer.W()) ? null : Math.abs(exoPlayer.h0() - exoPlayer.a()) < 500 ? C14681B.a.f128658a : C14681B.b.f128659a : exoPlayer.h0() < 500 ? C14681B.d.f128661a : C14681B.c.f128660a;
        if (t10 != null && !C17542s.e(o10.f144348a, t10)) {
            o10.f144348a = t10;
            if (lVar != null) {
                lVar.invoke(t10);
            }
        }
    }
}
