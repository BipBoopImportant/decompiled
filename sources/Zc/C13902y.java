package ZC;

import SC.G0;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.D;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import q3.E;
import s0.C5857c;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000f\u001a\u00020\u0007*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "url", "altText", "Landroidx/compose/ui/d;", "modifier", "Li1/c;", "playPauseAlignment", "LXH/N;", "q", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;Li1/c;LU0/m;II)V", "Ls0/c;", "", "isPlaying", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "n", "(Ls0/c;ZLandroidx/media3/exoplayer/ExoPlayer;Li1/c;LU0/m;I)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function2;", "Landroidx/lifecycle/r$a;", "onEvent", "j", "(Landroidx/lifecycle/y;LnI/p;LU0/m;II)V", "video_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZC.y  reason: case insensitive filesystem */
public final class C13902y {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ZC/y$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZC.y$a */
    public static final class a implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5221y f118389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5218v f118390b;

        public a(C5221y yVar, C5218v vVar) {
            this.f118389a = yVar;
            this.f118390b = vVar;
        }

        public void b() {
            this.f118389a.getLifecycle().g(this.f118390b);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ZC/y$b", "Lq3/E$d;", "", "isPlaying", "LXH/N;", "o0", "(Z)V", "", "playbackState", "F", "(I)V", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZC.y$b */
    public static final class b implements E.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f118391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f118392b;

        b(C4899r0<Boolean> r0Var, C4899r0<Boolean> r0Var2) {
            this.f118391a = r0Var;
            this.f118392b = r0Var2;
        }

        public void F(int i10) {
            super.F(i10);
            this.f118392b.setValue(Boolean.valueOf(i10 == 2));
        }

        public void o0(boolean z10) {
            super.o0(z10);
            this.f118391a.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ZC/y$c", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZC.y$c */
    public static final class c implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExoPlayer f118393a;

        public c(ExoPlayer exoPlayer) {
            this.f118393a = exoPlayer;
        }

        public void b() {
            this.f118393a.release();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZC.y$d */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118394a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f118394a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ZC.C13902y.d.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        if ((r9 & 1) != 0) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void j(androidx.lifecycle.C5221y r5, nI.p<? super androidx.lifecycle.C5221y, ? super androidx.lifecycle.r.a, XH.C16807N> r6, U0.C4889m r7, int r8, int r9) {
        /*
            r0 = 1099613024(0x418ac360, float:17.345398)
            U0.m r7 = r7.k(r0)
            r1 = r8 & 6
            if (r1 != 0) goto L_0x001a
            r1 = r9 & 1
            if (r1 != 0) goto L_0x0017
            boolean r1 = r7.F(r5)
            if (r1 == 0) goto L_0x0017
            r1 = 4
            goto L_0x0018
        L_0x0017:
            r1 = 2
        L_0x0018:
            r1 = r1 | r8
            goto L_0x001b
        L_0x001a:
            r1 = r8
        L_0x001b:
            r2 = r9 & 2
            r3 = 32
            if (r2 == 0) goto L_0x0024
            r1 = r1 | 48
            goto L_0x0033
        L_0x0024:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x0033
            boolean r2 = r7.F(r6)
            if (r2 == 0) goto L_0x0030
            r2 = r3
            goto L_0x0032
        L_0x0030:
            r2 = 16
        L_0x0032:
            r1 = r1 | r2
        L_0x0033:
            r2 = r1 & 19
            r4 = 18
            if (r2 != r4) goto L_0x0045
            boolean r2 = r7.l()
            if (r2 != 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            r7.L()
            goto L_0x00b6
        L_0x0045:
            r7.G()
            r2 = r8 & 1
            if (r2 == 0) goto L_0x005d
            boolean r2 = r7.O()
            if (r2 == 0) goto L_0x0053
            goto L_0x005d
        L_0x0053:
            r7.L()
            r2 = r9 & 1
            if (r2 == 0) goto L_0x006c
        L_0x005a:
            r1 = r1 & -15
            goto L_0x006c
        L_0x005d:
            r2 = r9 & 1
            if (r2 == 0) goto L_0x006c
            U0.I0 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r5 = r7.Q(r5)
            androidx.lifecycle.y r5 = (androidx.lifecycle.C5221y) r5
            goto L_0x005a
        L_0x006c:
            r7.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x007b
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.ui.video.ComposableLifecycle (VideoWithLoadingAndPause.kt:165)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x007b:
            r0 = -1648125114(0xffffffff9dc39b46, float:-5.177662E-21)
            r7.W(r0)
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != r3) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            boolean r2 = r7.F(r5)
            r0 = r0 | r2
            java.lang.Object r2 = r7.D()
            if (r0 != 0) goto L_0x009b
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00a3
        L_0x009b:
            ZC.v r2 = new ZC.v
            r2.<init>(r5, r6)
            r7.u(r2)
        L_0x00a3:
            nI.l r2 = (nI.C17642l) r2
            r7.P()
            r0 = r1 & 14
            U0.P.c(r5, r2, r7, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b6
            U0.C4895p.R()
        L_0x00b6:
            U0.Y0 r7 = r7.n()
            if (r7 == 0) goto L_0x00c4
            ZC.w r0 = new ZC.w
            r0.<init>(r5, r6, r8, r9)
            r7.a(r0)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZC.C13902y.j(androidx.lifecycle.y, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final L k(C5221y yVar, p pVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        C13901x xVar = new C13901x(pVar);
        yVar.getLifecycle().c(xVar);
        return new a(yVar, xVar);
    }

    /* access modifiers changed from: private */
    public static final void l(p pVar, C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        pVar.invoke(yVar, aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C5221y yVar, p pVar, int i10, int i11, C4889m mVar, int i12) {
        j(yVar, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void n(C5857c cVar, boolean z10, ExoPlayer exoPlayer, C5437c cVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(22250350);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(exoPlayer) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.V(cVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(22250350, i11, -1, "com.ingka.ikea.ui.video.PlayPauseButtonWrapper (VideoWithLoadingAndPause.kt:140)");
            }
            k10.W(1075612442);
            boolean F10 = k10.F(exoPlayer) | ((i11 & 112) == 32);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new C13897t(exoPlayer, z10);
                k10.u(D10);
            }
            k10.P();
            C13879b.b(z10, (C17631a) D10, D.i(cVar.a(androidx.compose.ui.d.f18749a, cVar2), h.B((float) 16)), (G0) null, k10, (i11 >> 3) & 14, 8);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13898u(cVar, z10, exoPlayer, cVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(ExoPlayer exoPlayer, boolean z10) {
        if (z10) {
            exoPlayer.c();
        } else {
            if (exoPlayer.V() == 4) {
                exoPlayer.R(0);
            }
            exoPlayer.i();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C5857c cVar, boolean z10, ExoPlayer exoPlayer, C5437c cVar2, int i10, C4889m mVar, int i11) {
        n(cVar, z10, exoPlayer, cVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: androidx.media3.exoplayer.ExoPlayer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(java.lang.String r21, java.lang.String r22, androidx.compose.ui.d r23, i1.C5437c r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r21
            r2 = r22
            r5 = r26
            java.lang.String r0 = "url"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "altText"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 904268094(0x35e6093e, float:1.7139025E-6)
            r3 = r25
            U0.m r3 = r3.k(r0)
            r4 = r27 & 1
            r12 = 2
            if (r4 == 0) goto L_0x0021
            r4 = r5 | 6
            goto L_0x0031
        L_0x0021:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x0030
            boolean r4 = r3.V(r1)
            if (r4 == 0) goto L_0x002d
            r4 = 4
            goto L_0x002e
        L_0x002d:
            r4 = r12
        L_0x002e:
            r4 = r4 | r5
            goto L_0x0031
        L_0x0030:
            r4 = r5
        L_0x0031:
            r6 = r27 & 2
            if (r6 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0048
        L_0x0038:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x0048
            boolean r6 = r3.V(r2)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r4 = r4 | r6
        L_0x0048:
            r6 = r27 & 4
            if (r6 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r23
            goto L_0x0063
        L_0x0051:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r23
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r9
        L_0x0063:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r24
            goto L_0x007e
        L_0x006c:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r24
            boolean r11 = r3.V(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r11
        L_0x007e:
            r11 = r4 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r11 != r13) goto L_0x0092
            boolean r11 = r3.l()
            if (r11 != 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            r3.L()
            r13 = r8
            r4 = r10
            goto L_0x02a5
        L_0x0092:
            if (r6 == 0) goto L_0x0098
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r13 = r6
            goto L_0x0099
        L_0x0098:
            r13 = r8
        L_0x0099:
            if (r9 == 0) goto L_0x00a3
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.c()
            r14 = r6
            goto L_0x00a4
        L_0x00a3:
            r14 = r10
        L_0x00a4:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00b0
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.video.VideoWithLoadingAndPause (VideoWithLoadingAndPause.kt:46)"
            U0.C4895p.S(r0, r4, r6, r8)
        L_0x00b0:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r3.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            r6 = 1688725244(0x64a7e6fc, float:2.4778004E22)
            r3.W(r6)
            java.lang.Object r6 = r3.D()
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r8 = r15.a()
            r11 = 0
            if (r6 != r8) goto L_0x00d6
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            U0.r0 r6 = U0.u1.e(r6, r11, r12, r11)
            r3.u(r6)
        L_0x00d6:
            r10 = r6
            U0.r0 r10 = (U0.C4899r0) r10
            r3.P()
            r6 = 1688727067(0x64a7ee1b, float:2.4782109E22)
            r3.W(r6)
            java.lang.Object r6 = r3.D()
            java.lang.Object r8 = r15.a()
            if (r6 != r8) goto L_0x00f5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            U0.r0 r6 = U0.u1.e(r6, r11, r12, r11)
            r3.u(r6)
        L_0x00f5:
            r9 = r6
            U0.r0 r9 = (U0.C4899r0) r9
            r3.P()
            U0.I0 r6 = ZC.C13892o.H()
            java.lang.Object r6 = r3.Q(r6)
            x3.r r6 = (x3.r) r6
            r8 = 1688731973(0x64a80145, float:2.4793156E22)
            r3.W(r8)
            java.lang.Object r8 = r3.D()
            java.lang.Object r12 = r15.a()
            r7 = 0
            r11 = 1
            if (r8 != r12) goto L_0x0143
            androidx.media3.exoplayer.ExoPlayer$b r8 = new androidx.media3.exoplayer.ExoPlayer$b
            r8.<init>(r0)
            if (r6 == 0) goto L_0x0121
            bD.C14007a.a(r8, r0, r6)
        L_0x0121:
            androidx.media3.exoplayer.ExoPlayer r8 = r8.f()
            q3.w r6 = q3.w.c(r21)
            r8.O(r6)
            r8.d()
            r8.q(r11)
            r8.Z(r11)
            r8.h(r7)
            ZC.y$b r6 = new ZC.y$b
            r6.<init>(r10, r9)
            r8.u(r6)
            r3.u(r8)
        L_0x0143:
            r12 = r8
            androidx.media3.exoplayer.ExoPlayer r12 = (androidx.media3.exoplayer.ExoPlayer) r12
            r3.P()
            kotlin.jvm.internal.C17542s.g(r12)
            r8 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r13, r7, r11, r8)
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c r7 = r17.o()
            r11 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5077h.h(r7, r11)
            int r17 = U0.C4883j.a(r3, r11)
            U0.y r8 = r3.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r3, r6)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r11 = r19.a()
            U0.f r20 = r3.m()
            if (r20 != 0) goto L_0x0177
            U0.C4883j.c()
        L_0x0177:
            r3.I()
            boolean r20 = r3.i()
            if (r20 == 0) goto L_0x0184
            r3.p(r11)
            goto L_0x0187
        L_0x0184:
            r3.t()
        L_0x0187:
            U0.m r11 = U0.F1.a(r3)
            nI.p r1 = r19.c()
            U0.F1.c(r11, r7, r1)
            nI.p r1 = r19.e()
            U0.F1.c(r11, r8, r1)
            nI.p r1 = r19.b()
            boolean r7 = r11.i()
            if (r7 != 0) goto L_0x01b1
            java.lang.Object r7 = r11.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r7 != 0) goto L_0x01bf
        L_0x01b1:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)
            r11.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)
            r11.w(r7, r1)
        L_0x01bf:
            nI.p r1 = r19.d()
            U0.F1.c(r11, r6, r1)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            XH.N r6 = XH.C16807N.f139792a
            r7 = -284894114(0xffffffffef04dc5e, float:-4.111843E28)
            r3.W(r7)
            boolean r7 = r3.F(r12)
            java.lang.Object r8 = r3.D()
            if (r7 != 0) goto L_0x01e0
            java.lang.Object r7 = r15.a()
            if (r8 != r7) goto L_0x01e8
        L_0x01e0:
            ZC.p r8 = new ZC.p
            r8.<init>(r12)
            r3.u(r8)
        L_0x01e8:
            nI.l r8 = (nI.C17642l) r8
            r3.P()
            r11 = 6
            U0.P.c(r6, r8, r3, r11)
            r6 = -284891079(0xffffffffef04e839, float:-4.113276E28)
            r3.W(r6)
            boolean r6 = r3.F(r0)
            boolean r7 = r3.F(r12)
            r6 = r6 | r7
            r7 = r4 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r7 != r8) goto L_0x0208
            r7 = 1
            goto L_0x0209
        L_0x0208:
            r7 = 0
        L_0x0209:
            r6 = r6 | r7
            java.lang.Object r7 = r3.D()
            if (r6 != 0) goto L_0x0216
            java.lang.Object r6 = r15.a()
            if (r7 != r6) goto L_0x021e
        L_0x0216:
            ZC.q r7 = new ZC.q
            r7.<init>(r0, r12, r2)
            r3.u(r7)
        L_0x021e:
            r6 = r7
            nI.l r6 = (nI.C17642l) r6
            r3.P()
            r0 = 0
            r16 = 6
            r7 = 0
            r8 = 0
            r17 = 0
            r18 = r9
            r9 = r3
            r19 = r10
            r10 = r0
            r0 = r11
            r2 = 1
            r11 = r16
            androidx.compose.ui.viewinterop.e.a(r6, r7, r8, r9, r10, r11)
            java.lang.Object r6 = r19.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r7 = r6.booleanValue()
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r11 = r0 | r4
            r6 = r1
            r8 = r12
            r9 = r14
            r10 = r3
            n(r6, r7, r8, r9, r10, r11)
            r1 = -284873652(0xffffffffef052c4c, float:-4.121506E28)
            r3.W(r1)
            java.lang.Object r1 = r18.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x026d
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r4 = 0
            r6 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.f(r1, r6, r2, r4)
            r4 = 2
            r6 = 0
            SC.H2.b(r1, r6, r3, r0, r4)
            goto L_0x026e
        L_0x026d:
            r6 = 0
        L_0x026e:
            r3.P()
            r3.x()
            r0 = 1688791267(0x64a8e8e3, float:2.4926674E22)
            r3.W(r0)
            boolean r0 = r3.F(r12)
            java.lang.Object r1 = r3.D()
            if (r0 != 0) goto L_0x028a
            java.lang.Object r0 = r15.a()
            if (r1 != r0) goto L_0x0292
        L_0x028a:
            ZC.r r1 = new ZC.r
            r1.<init>(r12)
            r3.u(r1)
        L_0x0292:
            nI.p r1 = (nI.p) r1
            r3.P()
            r0 = 0
            j(r0, r1, r3, r6, r2)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a4
            U0.C4895p.R()
        L_0x02a4:
            r4 = r14
        L_0x02a5:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x02bd
            ZC.s r8 = new ZC.s
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r13
            r5 = r26
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x02bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZC.C13902y.q(java.lang.String, java.lang.String, androidx.compose.ui.d, i1.c, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final PlayerView r(Context context, ExoPlayer exoPlayer, String str, Context context2) {
        C17542s.j(context2, "it");
        PlayerView playerView = new PlayerView(context);
        playerView.setPlayer(exoPlayer);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playerView.setUseController(false);
        playerView.setContentDescription(str);
        return playerView;
    }

    /* access modifiers changed from: private */
    public static final L s(ExoPlayer exoPlayer, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        return new c(exoPlayer);
    }

    /* access modifiers changed from: private */
    public static final C16807N t(ExoPlayer exoPlayer, C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "<unused var>");
        C17542s.j(aVar, "event");
        int i10 = d.f118394a[aVar.ordinal()];
        if (i10 == 4) {
            exoPlayer.c();
        } else if (i10 == 6) {
            exoPlayer.release();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(String str, String str2, androidx.compose.ui.d dVar, C5437c cVar, int i10, int i11, C4889m mVar, int i12) {
        q(str, str2, dVar, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
