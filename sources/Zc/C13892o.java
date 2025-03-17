package ZC;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4910x;
import U0.I0;
import U0.L;
import U0.M;
import U0.M0;
import U0.o1;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import eI.C17187b;
import j3.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import q3.C;
import q3.E;
import q3.S;
import q3.w;
import x3.r;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aM\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aG\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0019\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\"(\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006&²\u0006\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u0002²\u0006\u0012\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u0002"}, d2 = {"", "videoResId", "Landroidx/compose/ui/d;", "modifier", "", "loop", "Lkotlin/Function0;", "LXH/N;", "onPlaybackStarted", "onPlaybackError", "n", "(ILandroidx/compose/ui/d;ZLnI/a;LnI/a;LU0/m;II)V", "", "url", "onFeatureContentReady", "onError", "o", "(Ljava/lang/String;Landroidx/compose/ui/d;ZLnI/a;LnI/a;LU0/m;II)V", "Landroid/net/Uri;", "videoUri", "v", "(Landroid/net/Uri;LnI/a;LnI/a;Landroidx/compose/ui/d;ZLU0/m;II)V", "Landroid/view/TextureView;", "Lq3/S;", "videoSize", "G", "(Landroid/view/TextureView;Lq3/S;)V", "LU0/I0;", "Lx3/r;", "a", "LU0/I0;", "H", "()LU0/I0;", "getLocalSimpleCacheProvider$annotations", "()V", "LocalSimpleCacheProvider", "onPlayStateReady", "onPlayerError", "video_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZC.o  reason: case insensitive filesystem */
public final class C13892o {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<r> f118353a = C4910x.d((o1) null, new C13882e(), 1, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.ui.video.VideoKt$VideoInternal$1$1", f = "Video.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ZC.o$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ExoPlayer f118355d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Uri f118356e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f118357f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ExoPlayer exoPlayer, Uri uri, boolean z10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f118355d = exoPlayer;
            this.f118356e = uri;
            this.f118357f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f118355d, this.f118356e, this.f118357f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118354c == 0) {
                y.b(obj);
                ExoPlayer exoPlayer = this.f118355d;
                Uri uri = this.f118356e;
                boolean z10 = this.f118357f;
                exoPlayer.O(w.b(uri));
                exoPlayer.d();
                exoPlayer.q(true);
                exoPlayer.Z(z10 ? 2 : 0);
                exoPlayer.h(0.0f);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ZC/o$b", "Lq3/E$d;", "Lq3/S;", "videoSize", "LXH/N;", "e", "(Lq3/S;)V", "", "playbackState", "F", "(I)V", "Lq3/C;", "error", "S", "(Lq3/C;)V", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZC.o$b */
    public static final class b implements E.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextureView f118358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1<C17631a<C16807N>> f118359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C17631a<C16807N>> f118360c;

        b(TextureView textureView, A1<? extends C17631a<C16807N>> a12, A1<? extends C17631a<C16807N>> a13) {
            this.f118358a = textureView;
            this.f118359b = a12;
            this.f118360c = a13;
        }

        public void F(int i10) {
            if (i10 == 3) {
                C13892o.w(this.f118359b).invoke();
            }
        }

        public void S(C c10) {
            C17542s.j(c10, UiComponentContainer.RESULT_ERROR);
            C13892o.x(this.f118360c).invoke();
        }

        public void e(S s10) {
            C17542s.j(s10, "videoSize");
            C13892o.G(this.f118358a, s10);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ZC/o$c", "Lj3/e;", "LXH/N;", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZC.o$c */
    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j3.f f118361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExoPlayer f118362b;

        public c(j3.f fVar, ExoPlayer exoPlayer) {
            this.f118361a = fVar;
            this.f118362b = exoPlayer;
        }

        public void a() {
            this.f118362b.c();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ZC/o$d", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZC.o$d */
    public static final class d implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExoPlayer f118363a;

        public d(ExoPlayer exoPlayer) {
            this.f118363a = exoPlayer;
        }

        public void b() {
            this.f118363a.release();
        }
    }

    /* access modifiers changed from: private */
    public static final TextureView A(ExoPlayer exoPlayer, A1 a12, A1 a13, Context context) {
        C17542s.j(context, "context");
        TextureView textureView = new TextureView(context);
        textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        exoPlayer.u(new b(textureView, a12, a13));
        textureView.getViewTreeObserver().addOnGlobalLayoutListener(new C13889l(exoPlayer, textureView));
        exoPlayer.b(2);
        exoPlayer.E(textureView);
        return textureView;
    }

    /* access modifiers changed from: private */
    public static final void B(ExoPlayer exoPlayer, TextureView textureView) {
        S N10 = exoPlayer.N();
        C17542s.i(N10, "getVideoSize(...)");
        if (!C17542s.e(N10, S.f28064e)) {
            G(textureView, N10);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N C(Uri uri, C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        v(uri, aVar, aVar2, dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void G(TextureView textureView, S s10) {
        float f10 = ((float) s10.f28069b) / (((float) s10.f28068a) * s10.f28071d);
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        if (textureView.getHeight() > ((int) (((float) textureView.getWidth()) * f10))) {
            width = (int) (((float) textureView.getHeight()) / f10);
        } else {
            height = (int) (((float) textureView.getWidth()) * f10);
        }
        Matrix matrix = new Matrix();
        textureView.getTransform(matrix);
        matrix.setScale(((float) width) / ((float) textureView.getWidth()), ((float) height) / ((float) textureView.getHeight()));
        matrix.postTranslate((float) ((textureView.getWidth() - width) / 2), (float) ((textureView.getHeight() - height) / 2));
        textureView.setTransform(matrix);
    }

    public static final I0<r> H() {
        return f118353a;
    }

    /* access modifiers changed from: private */
    public static final r m() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(int r17, androidx.compose.ui.d r18, boolean r19, nI.C17631a<XH.C16807N> r20, nI.C17631a<XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r6 = r23
            r0 = 425998502(0x196438a6, float:1.1798764E-23)
            r1 = r22
            U0.m r1 = r1.k(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r6 | 6
            r3 = r2
            r2 = r17
            goto L_0x0029
        L_0x0015:
            r2 = r6 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r17
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0026:
            r2 = r17
            r3 = r6
        L_0x0029:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r18
            goto L_0x0044
        L_0x0032:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r18
            boolean r7 = r1.V(r5)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r24 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r19
            goto L_0x005f
        L_0x004d:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r19
            boolean r9 = r1.b(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r24 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r20
            goto L_0x007a
        L_0x0068:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r20
            boolean r11 = r1.F(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r24 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r21
            goto L_0x0095
        L_0x0083:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r21
            boolean r13 = r1.F(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00aa
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00a2
            goto L_0x00aa
        L_0x00a2:
            r1.L()
            r4 = r5
            r3 = r8
            r5 = r12
            goto L_0x013a
        L_0x00aa:
            if (r4 == 0) goto L_0x00af
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00b0
        L_0x00af:
            r4 = r5
        L_0x00b0:
            if (r7 == 0) goto L_0x00b4
            r5 = 1
            goto L_0x00b5
        L_0x00b4:
            r5 = r8
        L_0x00b5:
            if (r9 == 0) goto L_0x00d8
            r7 = 248830141(0xed4d8bd, float:5.2470746E-30)
            r1.W(r7)
            java.lang.Object r7 = r1.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00d1
            ZC.m r7 = new ZC.m
            r7.<init>()
            r1.u(r7)
        L_0x00d1:
            nI.a r7 = (nI.C17631a) r7
            r1.P()
            r15 = r7
            goto L_0x00d9
        L_0x00d8:
            r15 = r10
        L_0x00d9:
            if (r11 == 0) goto L_0x00fd
            r7 = 248831357(0xed4dd7d, float:5.247532E-30)
            r1.W(r7)
            java.lang.Object r7 = r1.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00f5
            ZC.n r7 = new ZC.n
            r7.<init>()
            r1.u(r7)
        L_0x00f5:
            nI.a r7 = (nI.C17631a) r7
            r1.P()
            r16 = r7
            goto L_0x00ff
        L_0x00fd:
            r16 = r12
        L_0x00ff:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x010b
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.video.Video (Video.kt:53)"
            U0.C4895p.S(r0, r3, r7, r8)
        L_0x010b:
            android.net.Uri r7 = w3.z.buildRawResourceUri(r17)
            java.lang.String r0 = "buildRawResourceUri(...)"
            kotlin.jvm.internal.C17542s.i(r7, r0)
            int r0 = r3 >> 6
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            int r3 = r3 << 6
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r13 = r0 | r3
            r14 = 0
            r8 = r15
            r9 = r16
            r10 = r4
            r11 = r5
            r12 = r1
            v(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0136
            U0.C4895p.R()
        L_0x0136:
            r3 = r5
            r10 = r15
            r5 = r16
        L_0x013a:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x0151
            ZC.d r9 = new ZC.d
            r0 = r9
            r1 = r17
            r2 = r4
            r4 = r10
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZC.C13892o.n(int, androidx.compose.ui.d, boolean, nI.a, nI.a, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(java.lang.String r17, androidx.compose.ui.d r18, boolean r19, nI.C17631a<XH.C16807N> r20, nI.C17631a<XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r1 = r17
            r6 = r23
            java.lang.String r0 = "url"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            r0 = -793281250(0xffffffffd0b77d1e, float:-2.46274417E10)
            r2 = r22
            U0.m r2 = r2.k(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r6 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0028:
            r3 = r6
        L_0x0029:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r18
            goto L_0x0044
        L_0x0032:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r18
            boolean r7 = r2.V(r5)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r24 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r19
            goto L_0x005f
        L_0x004d:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r19
            boolean r9 = r2.b(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r24 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r20
            goto L_0x007a
        L_0x0068:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r20
            boolean r11 = r2.F(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r24 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r21
            goto L_0x0095
        L_0x0083:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r21
            boolean r13 = r2.F(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00aa
            boolean r13 = r2.l()
            if (r13 != 0) goto L_0x00a2
            goto L_0x00aa
        L_0x00a2:
            r2.L()
            r4 = r5
            r3 = r8
            r5 = r12
            goto L_0x0135
        L_0x00aa:
            if (r4 == 0) goto L_0x00af
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00b0
        L_0x00af:
            r4 = r5
        L_0x00b0:
            if (r7 == 0) goto L_0x00b4
            r5 = 1
            goto L_0x00b5
        L_0x00b4:
            r5 = r8
        L_0x00b5:
            if (r9 == 0) goto L_0x00d8
            r7 = 248846013(0xed516bd, float:5.253045E-30)
            r2.W(r7)
            java.lang.Object r7 = r2.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00d1
            ZC.c r7 = new ZC.c
            r7.<init>()
            r2.u(r7)
        L_0x00d1:
            nI.a r7 = (nI.C17631a) r7
            r2.P()
            r15 = r7
            goto L_0x00d9
        L_0x00d8:
            r15 = r10
        L_0x00d9:
            if (r11 == 0) goto L_0x00fd
            r7 = 248846973(0xed51a7d, float:5.253406E-30)
            r2.W(r7)
            java.lang.Object r7 = r2.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00f5
            ZC.f r7 = new ZC.f
            r7.<init>()
            r2.u(r7)
        L_0x00f5:
            nI.a r7 = (nI.C17631a) r7
            r2.P()
            r16 = r7
            goto L_0x00ff
        L_0x00fd:
            r16 = r12
        L_0x00ff:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x010b
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.video.Video (Video.kt:73)"
            U0.C4895p.S(r0, r3, r7, r8)
        L_0x010b:
            android.net.Uri r7 = android.net.Uri.parse(r17)
            int r0 = r3 >> 6
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            int r3 = r3 << 6
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r13 = r0 | r3
            r14 = 0
            r8 = r15
            r9 = r16
            r10 = r4
            r11 = r5
            r12 = r2
            v(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0131
            U0.C4895p.R()
        L_0x0131:
            r3 = r5
            r10 = r15
            r5 = r16
        L_0x0135:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x014c
            ZC.g r9 = new ZC.g
            r0 = r9
            r1 = r17
            r2 = r4
            r4 = r10
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZC.C13892o.o(java.lang.String, androidx.compose.ui.d, boolean, nI.a, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, androidx.compose.ui.d dVar, boolean z10, C17631a aVar, C17631a aVar2, int i10, int i11, C4889m mVar, int i12) {
        o(str, dVar, z10, aVar, aVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(int i10, androidx.compose.ui.d dVar, boolean z10, C17631a aVar, C17631a aVar2, int i11, int i12, C4889m mVar, int i13) {
        n(i10, dVar, z10, aVar, aVar2, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u() {
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void v(android.net.Uri r19, nI.C17631a<XH.C16807N> r20, nI.C17631a<XH.C16807N> r21, androidx.compose.ui.d r22, boolean r23, U0.C4889m r24, int r25, int r26) {
        /*
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r25
            r0 = 16
            r1 = 2
            r2 = 4
            r10 = 6
            r3 = 107351600(0x6660e30, float:4.3268615E-35)
            r4 = r24
            U0.m r15 = r4.k(r3)
            r4 = 1
            r5 = r26 & 1
            if (r5 == 0) goto L_0x001e
            r5 = r9 | 6
            goto L_0x002e
        L_0x001e:
            r5 = r9 & 6
            if (r5 != 0) goto L_0x002d
            boolean r5 = r15.F(r6)
            if (r5 == 0) goto L_0x002a
            r5 = r2
            goto L_0x002b
        L_0x002a:
            r5 = r1
        L_0x002b:
            r5 = r5 | r9
            goto L_0x002e
        L_0x002d:
            r5 = r9
        L_0x002e:
            r1 = r26 & 2
            if (r1 == 0) goto L_0x0035
            r5 = r5 | 48
            goto L_0x0044
        L_0x0035:
            r1 = r9 & 48
            if (r1 != 0) goto L_0x0044
            boolean r1 = r15.F(r7)
            if (r1 == 0) goto L_0x0042
            r1 = 32
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            r5 = r5 | r1
        L_0x0044:
            r1 = r26 & 4
            if (r1 == 0) goto L_0x004b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005b
        L_0x004b:
            r1 = r9 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x005b
            boolean r1 = r15.F(r8)
            if (r1 == 0) goto L_0x0058
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r1 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r5 = r5 | r1
        L_0x005b:
            r1 = r26 & 8
            if (r1 == 0) goto L_0x0064
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r2 = r22
            goto L_0x0076
        L_0x0064:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0061
            r2 = r22
            boolean r11 = r15.V(r2)
            if (r11 == 0) goto L_0x0073
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r5 = r5 | r11
        L_0x0076:
            r0 = r26 & 16
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0081
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x007e:
            r12 = r23
            goto L_0x0092
        L_0x0081:
            r12 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007e
            r12 = r23
            boolean r13 = r15.b(r12)
            if (r13 == 0) goto L_0x008f
            r13 = r11
            goto L_0x0091
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r5 = r5 | r13
        L_0x0092:
            r13 = r5 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00a7
            boolean r13 = r15.l()
            if (r13 != 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            r15.L()
            r4 = r2
            r5 = r12
            r2 = r15
            goto L_0x0266
        L_0x00a7:
            if (r1 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r14 = r1
            goto L_0x00ae
        L_0x00ad:
            r14 = r2
        L_0x00ae:
            if (r0 == 0) goto L_0x00b2
            r13 = r4
            goto L_0x00b3
        L_0x00b2:
            r13 = r12
        L_0x00b3:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00bf
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.ui.video.VideoInternal (Video.kt:91)"
            U0.C4895p.S(r3, r5, r0, r1)
        L_0x00bf:
            int r0 = r5 >> 3
            r0 = r0 & 14
            U0.A1 r12 = U0.p1.q(r7, r15, r0)
            int r0 = r5 >> 6
            r0 = r0 & 14
            U0.A1 r3 = U0.p1.q(r8, r15, r0)
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r15.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            U0.I0<x3.r> r1 = f118353a
            java.lang.Object r1 = r15.Q(r1)
            x3.r r1 = (x3.r) r1
            r2 = -1846555093(0xffffffff91efce2b, float:-3.7834612E-28)
            r15.W(r2)
            java.lang.Object r2 = r15.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r4 = r16.a()
            if (r2 != r4) goto L_0x0104
            androidx.media3.exoplayer.ExoPlayer$b r2 = new androidx.media3.exoplayer.ExoPlayer$b
            r2.<init>(r0)
            if (r1 == 0) goto L_0x00fd
            bD.C14007a.a(r2, r0, r1)
        L_0x00fd:
            androidx.media3.exoplayer.ExoPlayer r2 = r2.f()
            r15.u(r2)
        L_0x0104:
            r4 = r2
            androidx.media3.exoplayer.ExoPlayer r4 = (androidx.media3.exoplayer.ExoPlayer) r4
            r15.P()
            kotlin.jvm.internal.C17542s.g(r4)
            r0 = -1846549026(0xffffffff91efe5de, float:-3.7849218E-28)
            r15.W(r0)
            boolean r0 = r15.F(r4)
            boolean r1 = r15.F(r6)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            r2 = 0
            if (r1 != r11) goto L_0x0125
            r1 = 1
            goto L_0x0126
        L_0x0125:
            r1 = r2
        L_0x0126:
            r0 = r0 | r1
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x0133
            java.lang.Object r0 = r16.a()
            if (r1 != r0) goto L_0x013c
        L_0x0133:
            ZC.o$a r1 = new ZC.o$a
            r0 = 0
            r1.<init>(r4, r6, r13, r0)
            r15.u(r1)
        L_0x013c:
            nI.p r1 = (nI.p) r1
            r15.P()
            r5 = r5 & 14
            U0.P.g(r6, r1, r15, r5)
            r0 = -1846537625(0xffffffff91f01267, float:-3.7876665E-28)
            r15.W(r0)
            boolean r0 = r15.F(r4)
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x015c
            java.lang.Object r0 = r16.a()
            if (r1 != r0) goto L_0x0164
        L_0x015c:
            ZC.h r1 = new ZC.h
            r1.<init>(r4)
            r15.u(r1)
        L_0x0164:
            r11 = r1
            nI.l r11 = (nI.C17642l) r11
            r15.P()
            r17 = 2
            r1 = 0
            r0 = r19
            r10 = r2
            r2 = r11
            r11 = r3
            r3 = r15
            r18 = r4
            r4 = r5
            r5 = r17
            j3.c.c(r0, r1, r2, r3, r4, r5)
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c r0 = r0.o()
            E1.I r0 = androidx.compose.foundation.layout.C5077h.h(r0, r10)
            int r1 = U0.C4883j.a(r15, r10)
            U0.y r2 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r14)
            G1.g$a r4 = G1.C4504g.f6515W
            nI.a r5 = r4.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x01a0
            U0.C4883j.c()
        L_0x01a0:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x01ad
            r15.p(r5)
            goto L_0x01b0
        L_0x01ad:
            r15.t()
        L_0x01b0:
            U0.m r5 = U0.F1.a(r15)
            nI.p r10 = r4.c()
            U0.F1.c(r5, r0, r10)
            nI.p r0 = r4.e()
            U0.F1.c(r5, r2, r0)
            nI.p r0 = r4.b()
            boolean r2 = r5.i()
            if (r2 != 0) goto L_0x01da
            java.lang.Object r2 = r5.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r10)
            if (r2 != 0) goto L_0x01e8
        L_0x01da:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.u(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.w(r1, r0)
        L_0x01e8:
            nI.p r0 = r4.d()
            U0.F1.c(r5, r3, r0)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            XH.N r0 = XH.C16807N.f139792a
            r1 = -2083540452(0xffffffff83cfb21c, float:-1.2207258E-36)
            r15.W(r1)
            r2 = r18
            boolean r1 = r15.F(r2)
            java.lang.Object r3 = r15.D()
            if (r1 != 0) goto L_0x020b
            java.lang.Object r1 = r16.a()
            if (r3 != r1) goto L_0x0213
        L_0x020b:
            ZC.i r3 = new ZC.i
            r3.<init>(r2)
            r15.u(r3)
        L_0x0213:
            nI.l r3 = (nI.C17642l) r3
            r15.P()
            r1 = 6
            U0.P.c(r0, r3, r15, r1)
            r0 = -2083536304(0xffffffff83cfc250, float:-1.22109785E-36)
            r15.W(r0)
            boolean r0 = r15.V(r12)
            boolean r1 = r15.V(r11)
            r0 = r0 | r1
            boolean r1 = r15.F(r2)
            r0 = r0 | r1
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x023c
            java.lang.Object r0 = r16.a()
            if (r1 != r0) goto L_0x0244
        L_0x023c:
            ZC.j r1 = new ZC.j
            r1.<init>(r2, r12, r11)
            r15.u(r1)
        L_0x0244:
            r11 = r1
            nI.l r11 = (nI.C17642l) r11
            r15.P()
            r0 = 0
            r16 = 6
            r12 = 0
            r1 = 0
            r4 = r13
            r13 = r1
            r1 = r14
            r14 = r15
            r2 = r15
            r15 = r0
            androidx.compose.ui.viewinterop.e.a(r11, r12, r13, r14, r15, r16)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0264
            U0.C4895p.R()
        L_0x0264:
            r5 = r4
            r4 = r1
        L_0x0266:
            U0.Y0 r10 = r2.n()
            if (r10 == 0) goto L_0x027f
            ZC.k r11 = new ZC.k
            r0 = r11
            r1 = r19
            r2 = r20
            r3 = r21
            r6 = r25
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.a(r11)
        L_0x027f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZC.C13892o.v(android.net.Uri, nI.a, nI.a, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> w(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> x(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final e y(ExoPlayer exoPlayer, j3.f fVar) {
        C17542s.j(fVar, "$this$LifecycleResumeEffect");
        exoPlayer.i();
        return new c(fVar, exoPlayer);
    }

    /* access modifiers changed from: private */
    public static final L z(ExoPlayer exoPlayer, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        return new d(exoPlayer);
    }
}
