package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerControlView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import kb.C9967v;
import q3.C;
import q3.C5790a;
import q3.C5804o;
import q3.E;
import q3.J;
import q3.S;
import t3.C5950a;
import t3.N;
import u2.C6012a;
import w4.C8910B;
import w4.D;
import w4.i;
import w4.j;
import w4.l;
import w4.n;
import w4.o;
import w4.t;
import w4.v;
import w4.x;
import w4.z;

public class PlayerView extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    private boolean f43254A;

    /* renamed from: B  reason: collision with root package name */
    private CharSequence f43255B;

    /* renamed from: C  reason: collision with root package name */
    private int f43256C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f43257D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public boolean f43258E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f43259F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public boolean f43260G;

    /* renamed from: a  reason: collision with root package name */
    private final c f43261a;

    /* renamed from: b  reason: collision with root package name */
    private final AspectRatioFrameLayout f43262b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final View f43263c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final View f43264d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f43265e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final f f43266f;

    /* renamed from: g  reason: collision with root package name */
    private final ImageView f43267g;

    /* renamed from: h  reason: collision with root package name */
    private final ImageView f43268h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SubtitleView f43269i;

    /* renamed from: j  reason: collision with root package name */
    private final View f43270j;

    /* renamed from: k  reason: collision with root package name */
    private final TextView f43271k;

    /* renamed from: l  reason: collision with root package name */
    private final PlayerControlView f43272l;

    /* renamed from: m  reason: collision with root package name */
    private final FrameLayout f43273m;

    /* renamed from: n  reason: collision with root package name */
    private final FrameLayout f43274n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Handler f43275o;

    /* renamed from: p  reason: collision with root package name */
    private final Class<?> f43276p;

    /* renamed from: q  reason: collision with root package name */
    private final Method f43277q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f43278r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public E f43279s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f43280t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public d f43281u;

    /* renamed from: v  reason: collision with root package name */
    private PlayerControlView.m f43282v;

    /* renamed from: w  reason: collision with root package name */
    private int f43283w;

    /* renamed from: x  reason: collision with root package name */
    private int f43284x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f43285y;

    /* renamed from: z  reason: collision with root package name */
    private int f43286z;

    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class c implements E.d, View.OnClickListener, PlayerControlView.m, PlayerControlView.d {

        /* renamed from: a  reason: collision with root package name */
        private final J.b f43287a = new J.b();

        /* renamed from: b  reason: collision with root package name */
        private Object f43288b;

        public c() {
        }

        public void C(int i10) {
            PlayerView.this.a0();
            if (PlayerView.this.f43281u != null) {
                PlayerView.this.f43281u.a(i10);
            }
        }

        public void F(int i10) {
            PlayerView.this.Z();
            PlayerView.this.c0();
            PlayerView.this.b0();
        }

        public void G(boolean z10) {
            e unused = PlayerView.this.getClass();
        }

        public void N(E.e eVar, E.e eVar2, int i10) {
            if (PlayerView.this.K() && PlayerView.this.f43258E) {
                PlayerView.this.G();
            }
        }

        public void Q() {
            if (PlayerView.this.f43263c != null) {
                PlayerView.this.f43263c.setVisibility(4);
                if (PlayerView.this.C()) {
                    PlayerView.this.H();
                } else {
                    PlayerView.this.E();
                }
            }
        }

        public void V(int i10, int i11) {
            if (N.f29462a == 34 && (PlayerView.this.f43264d instanceof SurfaceView) && PlayerView.this.f43260G) {
                ((f) C5950a.e(PlayerView.this.f43266f)).f(PlayerView.this.f43275o, (SurfaceView) PlayerView.this.f43264d, new l(PlayerView.this));
            }
        }

        public void c0(q3.N n10) {
            E e10 = (E) C5950a.e(PlayerView.this.f43279s);
            J z10 = e10.w(17) ? e10.z() : J.f27893a;
            if (z10.q()) {
                this.f43288b = null;
            } else if (!e10.w(30) || e10.r().b()) {
                Object obj = this.f43288b;
                if (obj != null) {
                    int b10 = z10.b(obj);
                    if (b10 == -1 || e10.Y() != z10.f(b10, this.f43287a).f27904c) {
                        this.f43288b = null;
                    } else {
                        return;
                    }
                }
            } else {
                this.f43288b = z10.g(e10.L(), this.f43287a, true).f27903b;
            }
            PlayerView.this.d0(false);
        }

        public void e(S s10) {
            if (!s10.equals(S.f28064e) && PlayerView.this.f43279s != null && PlayerView.this.f43279s.V() != 1) {
                PlayerView.this.Y();
            }
        }

        public void l0(boolean z10, int i10) {
            PlayerView.this.Z();
            PlayerView.this.b0();
        }

        public void onClick(View view) {
            PlayerView.this.X();
        }

        public void x(s3.b bVar) {
            if (PlayerView.this.f43269i != null) {
                PlayerView.this.f43269i.setCues(bVar.f29078a);
            }
        }
    }

    public interface d {
        void a(int i10);
    }

    public interface e {
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        SurfaceSyncGroup f43290a;

        private f() {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl a10 = surfaceView.getRootSurfaceControl();
            if (a10 != null) {
                SurfaceSyncGroup a11 = n.a("exo-sync-b-334901521");
                this.f43290a = a11;
                C5950a.g(a11.add(a10, new v()));
                runnable.run();
                boolean unused = a10.applyTransactionOnDraw(o.a());
            }
        }

        public void e() {
            SurfaceSyncGroup surfaceSyncGroup = this.f43290a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f43290a = null;
            }
        }

        public void f(Handler handler, SurfaceView surfaceView, Runnable runnable) {
            handler.post(new u(this, surfaceView, runnable));
        }
    }

    public PlayerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(N.X(context, resources, v.f57107a));
        imageView.setBackgroundColor(resources.getColor(t.f57102a, (Resources.Theme) null));
    }

    /* access modifiers changed from: private */
    public boolean C() {
        E e10 = this.f43279s;
        return e10 != null && this.f43278r != null && e10.w(30) && e10.r().c(4);
    }

    private boolean D() {
        E e10 = this.f43279s;
        return e10 != null && e10.w(30) && e10.r().c(2);
    }

    /* access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.f43267g;
        if (imageView != null) {
            imageView.setImageResource(17170445);
        }
    }

    private void F() {
        ImageView imageView = this.f43268h;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f43268h.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.f43267g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean I(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r0.getDrawable();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean J() {
        /*
            r2 = this;
            android.widget.ImageView r0 = r2.f43267g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getAlpha()
            if (r0 == 0) goto L_0x0013
            r1 = 1
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.J():boolean");
    }

    /* access modifiers changed from: private */
    public boolean K() {
        E e10 = this.f43279s;
        return e10 != null && e10.w(16) && this.f43279s.f() && this.f43279s.H();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object L(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        P(objArr[1]);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (!D()) {
            W();
            y();
        }
    }

    private void N(boolean z10) {
        if ((!K() || !this.f43258E) && g0()) {
            boolean z11 = this.f43272l.c0() && this.f43272l.getShowTimeoutMs() <= 0;
            boolean T10 = T();
            if (z10 || z11 || T10) {
                V(T10);
            }
        }
    }

    private void P(Bitmap bitmap) {
        this.f43275o.post(new j(this, bitmap));
    }

    private boolean Q(E e10) {
        byte[] bArr;
        if (e10 == null || !e10.w(18) || (bArr = e10.g0().f28505i) == null) {
            return false;
        }
        return R(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean R(Drawable drawable) {
        if (!(this.f43268h == null || drawable == null)) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f43283w == 2) {
                    f10 = ((float) getWidth()) / ((float) getHeight());
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                O(this.f43262b, f10);
                this.f43268h.setScaleType(scaleType);
                this.f43268h.setImageDrawable(drawable);
                this.f43268h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void S(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean T() {
        E e10 = this.f43279s;
        if (e10 == null) {
            return true;
        }
        int V10 = e10.V();
        return this.f43257D && (!this.f43279s.w(17) || !this.f43279s.z().q()) && (V10 == 1 || V10 == 4 || !((E) C5950a.e(this.f43279s)).H());
    }

    private void V(boolean z10) {
        if (g0()) {
            this.f43272l.setShowTimeoutMs(z10 ? 0 : this.f43256C);
            this.f43272l.n0();
        }
    }

    private void W() {
        ImageView imageView = this.f43267g;
        if (imageView != null) {
            imageView.setVisibility(0);
            e0();
        }
    }

    /* access modifiers changed from: private */
    public void X() {
        if (g0() && this.f43279s != null) {
            if (!this.f43272l.c0()) {
                N(true);
            } else if (this.f43259F) {
                this.f43272l.Y();
            }
        }
    }

    /* access modifiers changed from: private */
    public void Y() {
        E e10 = this.f43279s;
        S N10 = e10 != null ? e10.N() : S.f28064e;
        int i10 = N10.f28068a;
        int i11 = N10.f28069b;
        float f10 = 0.0f;
        float f11 = (i11 == 0 || i10 == 0) ? 0.0f : (((float) i10) * N10.f28071d) / ((float) i11);
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f43262b;
        if (!this.f43265e) {
            f10 = f11;
        }
        O(aspectRatioFrameLayout, f10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4.f43279s.H() == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Z() {
        /*
            r4 = this;
            android.view.View r0 = r4.f43270j
            if (r0 == 0) goto L_0x002b
            q3.E r0 = r4.f43279s
            r1 = 0
            if (r0 == 0) goto L_0x0020
            int r0 = r0.V()
            r2 = 2
            if (r0 != r2) goto L_0x0020
            int r0 = r4.f43286z
            r3 = 1
            if (r0 == r2) goto L_0x0021
            if (r0 != r3) goto L_0x0020
            q3.E r0 = r4.f43279s
            boolean r0 = r0.H()
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            android.view.View r0 = r4.f43270j
            if (r3 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 8
        L_0x0028:
            r0.setVisibility(r1)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.Z():void");
    }

    /* access modifiers changed from: private */
    public void a0() {
        PlayerControlView playerControlView = this.f43272l;
        String str = null;
        if (playerControlView == null || !this.f43280t) {
            setContentDescription((CharSequence) null);
        } else if (playerControlView.c0()) {
            if (this.f43259F) {
                str = getResources().getString(C8910B.f56991e);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(C8910B.f56998l));
        }
    }

    /* access modifiers changed from: private */
    public void b0() {
        if (!K() || !this.f43258E) {
            N(false);
        } else {
            G();
        }
    }

    /* access modifiers changed from: private */
    public void c0() {
        TextView textView = this.f43271k;
        if (textView != null) {
            CharSequence charSequence = this.f43255B;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f43271k.setVisibility(0);
                return;
            }
            E e10 = this.f43279s;
            if (e10 != null) {
                e10.p();
            }
            this.f43271k.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void d0(boolean z10) {
        E e10 = this.f43279s;
        boolean z11 = false;
        boolean z12 = e10 != null && e10.w(30) && !e10.r().b();
        if (!this.f43254A && (!z12 || z10)) {
            F();
            y();
            E();
        }
        if (z12) {
            boolean D10 = D();
            boolean C10 = C();
            if (!D10 && !C10) {
                y();
                E();
            }
            View view = this.f43263c;
            if (view != null && view.getVisibility() == 4 && J()) {
                z11 = true;
            }
            if (C10 && !D10 && z11) {
                y();
                W();
            } else if (D10 && !C10 && z11) {
                E();
            }
            if (D10 || C10 || !f0() || (!Q(e10) && !R(this.f43285y))) {
                F();
            }
        }
    }

    private void e0() {
        Drawable drawable;
        ImageView imageView = this.f43267g;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f43284x == 1) {
                    f10 = ((float) getWidth()) / ((float) getHeight());
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                if (this.f43267g.getVisibility() == 0) {
                    O(this.f43262b, f10);
                }
                this.f43267g.setScaleType(scaleType);
            }
        }
    }

    private boolean f0() {
        if (this.f43283w == 0) {
            return false;
        }
        C5950a.i(this.f43268h);
        return true;
    }

    private boolean g0() {
        if (!this.f43280t) {
            return false;
        }
        C5950a.i(this.f43272l);
        return true;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f43267g;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            e0();
        }
    }

    private void setImageOutput(E e10) {
        Class<?> cls = this.f43276p;
        if (cls != null && cls.isAssignableFrom(e10.getClass())) {
            try {
                ((Method) C5950a.e(this.f43277q)).invoke(e10, new Object[]{C5950a.e(this.f43278r)});
            } catch (IllegalAccessException | InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    private void x(E e10) {
        Class<?> cls = this.f43276p;
        if (cls != null && cls.isAssignableFrom(e10.getClass())) {
            try {
                ((Method) C5950a.e(this.f43277q)).invoke(e10, new Object[]{null});
            } catch (IllegalAccessException | InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    private void y() {
        View view = this.f43263c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(N.X(context, resources, v.f57107a));
        imageView.setBackgroundColor(resources.getColor(t.f57102a));
    }

    public boolean B(KeyEvent keyEvent) {
        return g0() && this.f43272l.U(keyEvent);
    }

    public void G() {
        PlayerControlView playerControlView = this.f43272l;
        if (playerControlView != null) {
            playerControlView.Y();
        }
    }

    /* access modifiers changed from: protected */
    public void O(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void U() {
        V(T());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (N.f29462a == 34 && (fVar = this.f43266f) != null && this.f43260G) {
            fVar.e();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        E e10 = this.f43279s;
        if (e10 != null && e10.w(16) && this.f43279s.f()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean I10 = I(keyEvent.getKeyCode());
        if (I10 && g0() && !this.f43272l.c0()) {
            N(true);
            return true;
        } else if (B(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            N(true);
            return true;
        } else {
            if (I10 && g0()) {
                N(true);
            }
            return false;
        }
    }

    public List<C5790a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f43274n;
        if (frameLayout != null) {
            arrayList.add(new C5790a.C0447a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        PlayerControlView playerControlView = this.f43272l;
        if (playerControlView != null) {
            arrayList.add(new C5790a.C0447a(playerControlView, 1).a());
        }
        return C9967v.A(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C5950a.j(this.f43273m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f43283w;
    }

    public boolean getControllerAutoShow() {
        return this.f43257D;
    }

    public boolean getControllerHideOnTouch() {
        return this.f43259F;
    }

    public int getControllerShowTimeoutMs() {
        return this.f43256C;
    }

    public Drawable getDefaultArtwork() {
        return this.f43285y;
    }

    public int getImageDisplayMode() {
        return this.f43284x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f43274n;
    }

    public E getPlayer() {
        return this.f43279s;
    }

    public int getResizeMode() {
        C5950a.i(this.f43262b);
        return this.f43262b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f43269i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f43283w != 0;
    }

    public boolean getUseController() {
        return this.f43280t;
    }

    public View getVideoSurfaceView() {
        return this.f43264d;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!g0() || this.f43279s == null) {
            return false;
        }
        N(true);
        return true;
    }

    public boolean performClick() {
        X();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        C5950a.g(i10 == 0 || this.f43268h != null);
        if (this.f43283w != i10) {
            this.f43283w = i10;
            d0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        C5950a.i(this.f43262b);
        this.f43262b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f43257D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f43258E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43259F = z10;
        a0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.d dVar) {
        C5950a.i(this.f43272l);
        this.f43272l.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        C5950a.i(this.f43272l);
        this.f43256C = i10;
        if (this.f43272l.c0()) {
            U();
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        if (dVar != null) {
            setControllerVisibilityListener((PlayerControlView.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C5950a.g(this.f43271k != null);
        this.f43255B = charSequence;
        c0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f43285y != drawable) {
            this.f43285y = drawable;
            d0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f43260G = z10;
    }

    public void setErrorMessageProvider(C5804o<? super C> oVar) {
        if (oVar != null) {
            c0();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        C5950a.i(this.f43272l);
        this.f43272l.setOnFullScreenModeChangedListener(this.f43261a);
    }

    public void setFullscreenButtonState(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.t0(z10);
    }

    public void setImageDisplayMode(int i10) {
        C5950a.g(this.f43267g != null);
        if (this.f43284x != i10) {
            this.f43284x = i10;
            e0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f43254A != z10) {
            this.f43254A = z10;
            d0(false);
        }
    }

    public void setPlayer(E e10) {
        C5950a.g(Looper.myLooper() == Looper.getMainLooper());
        C5950a.a(e10 == null || e10.B() == Looper.getMainLooper());
        E e11 = this.f43279s;
        if (e11 != e10) {
            if (e11 != null) {
                e11.A(this.f43261a);
                if (e11.w(27)) {
                    View view = this.f43264d;
                    if (view instanceof TextureView) {
                        e11.M((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        e11.a0((SurfaceView) view);
                    }
                }
                x(e11);
            }
            SubtitleView subtitleView = this.f43269i;
            if (subtitleView != null) {
                subtitleView.setCues((List<s3.a>) null);
            }
            this.f43279s = e10;
            if (g0()) {
                this.f43272l.setPlayer(e10);
            }
            Z();
            c0();
            d0(true);
            if (e10 != null) {
                if (e10.w(27)) {
                    View view2 = this.f43264d;
                    if (view2 instanceof TextureView) {
                        e10.E((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        e10.n((SurfaceView) view2);
                    }
                    if (!e10.w(30) || e10.r().d(2)) {
                        Y();
                    }
                }
                if (this.f43269i != null && e10.w(28)) {
                    this.f43269i.setCues(e10.t().f29078a);
                }
                e10.u(this.f43261a);
                setImageOutput(e10);
                N(false);
                return;
            }
            G();
        }
    }

    public void setRepeatToggleModes(int i10) {
        C5950a.i(this.f43272l);
        this.f43272l.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        C5950a.i(this.f43262b);
        this.f43262b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f43286z != i10) {
            this.f43286z = i10;
            Z();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        C5950a.i(this.f43272l);
        this.f43272l.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f43263c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(z10 ^ true ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        C5950a.g(!z10 || this.f43272l != null);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f43280t != z10) {
            this.f43280t = z10;
            if (g0()) {
                this.f43272l.setPlayer(this.f43279s);
            } else {
                PlayerControlView playerControlView = this.f43272l;
                if (playerControlView != null) {
                    playerControlView.Y();
                    this.f43272l.setPlayer((E) null);
                }
            }
            a0();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f43264d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.m mVar) {
        C5950a.i(this.f43272l);
        PlayerControlView.m mVar2 = this.f43282v;
        if (mVar2 != mVar) {
            if (mVar2 != null) {
                this.f43272l.j0(mVar2);
            }
            this.f43282v = mVar;
            if (mVar != null) {
                this.f43272l.S(mVar);
                setControllerVisibilityListener((d) null);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        int i12;
        boolean z15;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        a aVar;
        Method method;
        Object obj;
        boolean z18;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        c cVar = new c();
        this.f43261a = cVar;
        this.f43275o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f43262b = null;
            this.f43263c = null;
            this.f43264d = null;
            this.f43265e = false;
            this.f43266f = null;
            this.f43267g = null;
            this.f43268h = null;
            this.f43269i = null;
            this.f43270j = null;
            this.f43271k = null;
            this.f43272l = null;
            this.f43273m = null;
            this.f43274n = null;
            this.f43276p = null;
            this.f43277q = null;
            this.f43278r = null;
            ImageView imageView = new ImageView(context2);
            if (N.f29462a >= 23) {
                A(context2, getResources(), imageView);
            } else {
                z(context2, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i19 = z.f57179c;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, D.f57043b0, i10, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(D.f57067n0);
                int color = obtainStyledAttributes.getColor(D.f57067n0, 0);
                int resourceId = obtainStyledAttributes.getResourceId(D.f57059j0, i19);
                boolean z19 = obtainStyledAttributes.getBoolean(D.f57071p0, true);
                int i20 = obtainStyledAttributes.getInt(D.f57045c0, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(D.f57049e0, 0);
                int i21 = obtainStyledAttributes.getInt(D.f57055h0, 0);
                boolean z20 = obtainStyledAttributes.getBoolean(D.f57073q0, true);
                int i22 = obtainStyledAttributes.getInt(D.f57069o0, 1);
                int i23 = obtainStyledAttributes.getInt(D.f57061k0, 0);
                int i24 = resourceId;
                z13 = obtainStyledAttributes.getInt(D.f57065m0, 5000);
                boolean z21 = obtainStyledAttributes.getBoolean(D.f57053g0, true);
                z11 = obtainStyledAttributes.getBoolean(D.f57047d0, true);
                int integer = obtainStyledAttributes.getInteger(D.f57063l0, 0);
                this.f43254A = obtainStyledAttributes.getBoolean(D.f57057i0, this.f43254A);
                boolean z22 = obtainStyledAttributes.getBoolean(D.f57051f0, true);
                obtainStyledAttributes.recycle();
                i15 = resourceId2;
                z16 = z21;
                z12 = z22;
                z14 = z19;
                i18 = i24;
                z10 = z20;
                z15 = hasValue;
                i14 = i23;
                i17 = i21;
                i11 = i20;
                i12 = color;
                i13 = i22;
                i16 = integer;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z13 = true;
            i18 = i19;
            z10 = true;
            z16 = true;
            i17 = 0;
            i16 = 0;
            i15 = 0;
            i14 = 0;
            i13 = 1;
            z15 = false;
            i12 = 0;
            z14 = true;
            i11 = 1;
            z12 = true;
            z11 = true;
        }
        LayoutInflater.from(context).inflate(i18, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(x.f57157i);
        this.f43262b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            S(aspectRatioFrameLayout, i14);
        }
        View findViewById = findViewById(x.f57142P);
        this.f43263c = findViewById;
        if (findViewById != null && z15) {
            findViewById.setBackgroundColor(i12);
        }
        if (aspectRatioFrameLayout == null || i13 == 0) {
            aVar = null;
            this.f43264d = null;
            z17 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 != 2) {
                Class<Context> cls = Context.class;
                if (i13 == 3) {
                    Class<SphericalGLSurfaceView> cls2 = SphericalGLSurfaceView.class;
                    try {
                        int i25 = SphericalGLSurfaceView.f43019m;
                        this.f43264d = cls2.getConstructor(new Class[]{cls}).newInstance(new Object[]{context});
                        z17 = true;
                        this.f43264d.setLayoutParams(layoutParams);
                        this.f43264d.setOnClickListener(cVar);
                        this.f43264d.setClickable(false);
                        aspectRatioFrameLayout.addView(this.f43264d, 0);
                        aVar = null;
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                } else if (i13 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context2);
                    if (N.f29462a >= 34) {
                        b.a(surfaceView);
                    }
                    this.f43264d = surfaceView;
                } else {
                    Class<VideoDecoderGLSurfaceView> cls3 = VideoDecoderGLSurfaceView.class;
                    try {
                        int i26 = VideoDecoderGLSurfaceView.f43002b;
                        this.f43264d = cls3.getConstructor(new Class[]{cls}).newInstance(new Object[]{context});
                    } catch (Exception e11) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
            } else {
                this.f43264d = new TextureView(context2);
            }
            z17 = false;
            this.f43264d.setLayoutParams(layoutParams);
            this.f43264d.setOnClickListener(cVar);
            this.f43264d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f43264d, 0);
            aVar = null;
        }
        this.f43265e = z17;
        this.f43266f = N.f29462a == 34 ? new f() : null;
        this.f43273m = (FrameLayout) findViewById(x.f57149a);
        this.f43274n = (FrameLayout) findViewById(x.f57128B);
        this.f43267g = (ImageView) findViewById(x.f57169u);
        this.f43284x = i17;
        Class<ExoPlayer> cls4 = ExoPlayer.class;
        Class<ImageOutput> cls5 = ImageOutput.class;
        try {
            ImageOutput imageOutput = ImageOutput.f43001a;
            method = cls4.getMethod("setImageOutput", new Class[]{cls5});
            obj = Proxy.newProxyInstance(cls5.getClassLoader(), new Class[]{cls5}, new i(this));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls4 = null;
            obj = null;
            method = null;
        }
        this.f43276p = cls4;
        this.f43277q = method;
        this.f43278r = obj;
        ImageView imageView2 = (ImageView) findViewById(x.f57150b);
        this.f43268h = imageView2;
        this.f43283w = (!z14 || i11 == 0 || imageView2 == null) ? 0 : i11;
        if (i15 != 0) {
            this.f43285y = C6012a.e(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(x.f57145S);
        this.f43269i = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View findViewById2 = findViewById(x.f57154f);
        this.f43270j = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f43286z = i16;
        TextView textView = (TextView) findViewById(x.f57162n);
        this.f43271k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(x.f57158j);
        View findViewById3 = findViewById(x.f57159k);
        if (playerControlView != null) {
            this.f43272l = playerControlView;
            z18 = false;
        } else if (findViewById3 != null) {
            z18 = false;
            PlayerControlView playerControlView2 = new PlayerControlView(context2, (AttributeSet) null, 0, attributeSet2);
            this.f43272l = playerControlView2;
            playerControlView2.setId(x.f57158j);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            z18 = false;
            this.f43272l = null;
        }
        PlayerControlView playerControlView3 = this.f43272l;
        this.f43256C = playerControlView3 != null ? z13 : z18 ? 1 : 0;
        this.f43259F = z16;
        this.f43257D = z11;
        this.f43258E = z12;
        this.f43280t = (!z10 || playerControlView3 == null) ? z18 : true;
        if (playerControlView3 != null) {
            playerControlView3.Z();
            this.f43272l.S(this.f43261a);
        }
        if (z10) {
            setClickable(true);
        }
        a0();
    }
}
