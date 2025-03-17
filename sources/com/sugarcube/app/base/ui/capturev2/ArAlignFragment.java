package com.sugarcube.app.base.ui.capturev2;

import OE.n;
import QE.C13433j;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.P0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5222z;
import androidx.media3.ui.PlayerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.core.analytics.Trackable;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hF.C14540b;
import hF.C14542d;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import q3.E;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0003R\u001a\u0010'\u001a\u00020\"8\u0014X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/ArAlignFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "LQE/j;", "binding", "M0", "(LQE/j;)LQE/j;", "Landroid/widget/ImageView;", "imageView", "Landroid/graphics/Bitmap;", "bitmap", "LXH/N;", "L0", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "Landroid/util/Size;", "J0", "()Landroid/util/Size;", "pano", "Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "I0", "(Landroid/graphics/Bitmap;Lcom/sugarcube/app/base/ui/capturev2/W;)Landroid/graphics/Bitmap;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onStop", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Lq3/E;", "N", "Lq3/E;", "player", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArAlignFragment extends Hilt_ArAlignFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123300M = C14540b.Align;

    /* renamed from: N  reason: collision with root package name */
    private E f123301N;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.ArAlignFragment$onCreateView$1$3", f = "ArAlignFragment.kt", l = {61, 68}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123302c;

        /* renamed from: d  reason: collision with root package name */
        Object f123303d;

        /* renamed from: e  reason: collision with root package name */
        Object f123304e;

        /* renamed from: f  reason: collision with root package name */
        Object f123305f;

        /* renamed from: g  reason: collision with root package name */
        Object f123306g;

        /* renamed from: h  reason: collision with root package name */
        int f123307h;

        /* renamed from: i  reason: collision with root package name */
        int f123308i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C13433j f123309j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArAlignFragment f123310k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.capturev2.ArAlignFragment$onCreateView$1$3$2$1", f = "ArAlignFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.capturev2.ArAlignFragment$a$a  reason: collision with other inner class name */
        static final class C3035a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f123311c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ArAlignFragment f123312d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C13433j f123313e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bitmap f123314f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3035a(ArAlignFragment arAlignFragment, C13433j jVar, Bitmap bitmap, C17164e<? super C3035a> eVar) {
                super(2, eVar);
                this.f123312d = arAlignFragment;
                this.f123313e = jVar;
                this.f123314f = bitmap;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3035a(this.f123312d, this.f123313e, this.f123314f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3035a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f123311c == 0) {
                    y.b(obj);
                    ArAlignFragment arAlignFragment = this.f123312d;
                    ImageView imageView = this.f123313e.f114615j;
                    C17542s.i(imageView, "imageViewAlign");
                    arAlignFragment.L0(imageView, this.f123314f);
                    ArAlignFragment arAlignFragment2 = this.f123312d;
                    C13433j jVar = this.f123313e;
                    C17542s.g(jVar);
                    C13433j unused = arAlignFragment2.M0(jVar);
                    this.f123313e.f114616k.setVisibility(8);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13433j jVar, ArAlignFragment arAlignFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123309j = jVar;
            this.f123310k = arAlignFragment;
        }

        /* access modifiers changed from: private */
        public static final Bitmap j(ArAlignFragment arAlignFragment, Bitmap bitmap, W w10) {
            try {
                return arAlignFragment.I0(bitmap, w10);
            } catch (Exception unused) {
                return null;
            }
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123309j, this.f123310k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123308i;
            if (i10 == 0) {
                y.b(obj);
                this.f123309j.f114616k.setVisibility(0);
                h1 n02 = this.f123310k.n0();
                C14228q m02 = this.f123310k.m0();
                C14200c cVar = new C14200c(this.f123310k);
                this.f123308i = 1;
                obj = n02.M0(m02, cVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                Bitmap bitmap = (Bitmap) this.f123306g;
                C13433j jVar = (C13433j) this.f123305f;
                ArAlignFragment arAlignFragment = (ArAlignFragment) this.f123304e;
                Bitmap bitmap2 = (Bitmap) this.f123303d;
                Bitmap bitmap3 = (Bitmap) this.f123302c;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap4 = (Bitmap) obj;
            if (bitmap4 != null) {
                ArAlignFragment arAlignFragment2 = this.f123310k;
                C13433j jVar2 = this.f123309j;
                P0 c10 = C16311i0.c();
                C3035a aVar = new C3035a(arAlignFragment2, jVar2, bitmap4, (C17164e<? super C3035a>) null);
                this.f123302c = bitmap4;
                this.f123303d = bitmap4;
                this.f123304e = arAlignFragment2;
                this.f123305f = jVar2;
                this.f123306g = bitmap4;
                this.f123307h = 0;
                this.f123308i = 2;
                if (C16310i.g(c10, aVar, this) == f10) {
                    return f10;
                }
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final Bitmap I0(Bitmap bitmap, W w10) {
        int i10;
        W H10;
        W H11;
        Bitmap bitmap2 = bitmap;
        h1 n02 = n0();
        C14228q m02 = m0();
        h1.R1(n02, "panoIntrinsics=" + w10 + " cameraIntrinsics=" + (m02 != null ? m02.H() : null), (Throwable) null, 2, (Object) null);
        float b10 = w10.b();
        float c10 = w10.c();
        C14228q m03 = m0();
        float b11 = (m03 == null || (H11 = m03.H()) == null) ? b10 : H11.b();
        C14228q m04 = m0();
        float c11 = (m04 == null || (H10 = m04.H()) == null) ? c10 : H10.c();
        float d10 = w10.d();
        float e10 = w10.e();
        double d11 = (double) 1;
        int floor = (int) Math.floor((((double) (bitmap.getWidth() / 2)) - (((double) d10) * Math.tan(Math.toRadians(((double) b11) * 0.5d)))) + d11);
        int floor2 = (int) Math.floor((((double) (bitmap.getHeight() / 2)) - (((double) e10) * Math.tan(Math.toRadians(((double) c11) * 0.5d)))) + d11);
        h1.R1(n0(), "panoFOV=(" + b10 + "," + c10 + ") arFOV=(" + b11 + "," + c11 + ")", (Throwable) null, 2, (Object) null);
        if (floor * 2 >= bitmap.getWidth()) {
            h1 n03 = n0();
            n03.o1().b().captureWarningBadColsHalf(n03.r1(), n03.l1(), n03.W0(), n03.V0(), floor, bitmap.getWidth());
            int width = (bitmap.getWidth() / 2) - 1;
            h1.R1(n0(), "colsHalf out of range - adjust to " + width, (Throwable) null, 2, (Object) null);
            i10 = width;
        } else {
            i10 = floor;
        }
        if (floor2 * 2 >= bitmap.getHeight()) {
            h1 n04 = n0();
            n04.o1().b().captureWarningBadRowsHalf(n04.r1(), n04.l1(), n04.W0(), n04.V0(), floor2, bitmap.getHeight());
            floor2 = (bitmap.getHeight() / 2) - 1;
            h1.R1(n0(), "rowsHalf out of range - adjust to " + i10, (Throwable) null, 2, (Object) null);
        }
        int width2 = bitmap.getWidth() - (i10 * 2);
        int height = bitmap.getHeight() - (floor2 * 2);
        if (i10 < 0 || floor2 < 0 || width2 <= 0 || height <= 0) {
            return bitmap2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, i10, floor2, width2, height);
        C17542s.i(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final Size J0() {
        WindowManager windowManager;
        Display defaultDisplay;
        WindowManager windowManager2;
        WindowMetrics a10;
        Rect a11;
        if (Build.VERSION.SDK_INT >= 30) {
            C5191t activity = getActivity();
            if (!(activity == null || (windowManager2 = activity.getWindowManager()) == null || (a10 = windowManager2.getCurrentWindowMetrics()) == null || (a11 = a10.getBounds()) == null)) {
                return new Size(a11.right - a11.left, a11.bottom - a11.top);
            }
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C5191t activity2 = getActivity();
            if (!(activity2 == null || (windowManager = activity2.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            if (displayMetrics.widthPixels > 0 && displayMetrics.heightPixels > 0) {
                return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        return new Size(0, 0);
    }

    /* access modifiers changed from: private */
    public static final void K0(ArAlignFragment arAlignFragment, View view) {
        BaseFragment.z0(arAlignFragment, C14542d.Continue, (Trackable) null, 2, (Object) null);
        arAlignFragment.n0().t1();
    }

    /* access modifiers changed from: private */
    public final void L0(ImageView imageView, Bitmap bitmap) {
        Size J02 = J0();
        float width = ((float) J02.getWidth()) / ((float) J02.getHeight());
        float width2 = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        int width3 = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width2 > width) {
            int height2 = (int) (((float) bitmap.getHeight()) / width);
            if (height2 < bitmap.getWidth()) {
                width3 = height2;
            }
        } else {
            int width4 = (int) (((float) bitmap.getWidth()) / width);
            if (width4 < bitmap.getHeight()) {
                height = width4;
            }
        }
        h1 n02 = n0();
        int width5 = bitmap.getWidth();
        int height3 = bitmap.getHeight();
        h1.R1(n02, "[" + J02 + "] [" + width5 + "x" + height3 + "] crop=[" + width3 + "x" + height + "]", (Throwable) null, 2, (Object) null);
        imageView.setImageBitmap(Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width3) / 2, (bitmap.getHeight() - height) / 2, width3 / 2, height));
    }

    /* access modifiers changed from: private */
    public final C13433j M0(C13433j jVar) {
        jVar.f114609d.setVisibility(0);
        View view = jVar.f114610e;
        if (view != null) {
            view.setVisibility(0);
        }
        jVar.f114613h.setText(n.f113374h1);
        jVar.f114611f.setVisibility(0);
        return jVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        h1 n02 = n0();
        UUID r12 = n0().r1();
        String name = n0().f1().name();
        h1.R1(n02, "CaptureAlignFragment onCreateView " + r12 + " " + name, (Throwable) null, 2, (Object) null);
        C13433j c10 = C13433j.c(layoutInflater, viewGroup, false);
        t0(true);
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114612g;
        C17542s.i(floatingActionButton, "cancelButton");
        u0(b10, floatingActionButton);
        c10.f114611f.setOnClickListener(new C14198b(this));
        PlayerView playerView = c10.f114608c;
        if (playerView != null) {
            E x02 = x0(r0(VideoAsset.CAPTURE_ICON_ALIGN));
            this.f123301N = x02;
            playerView.setPlayer(x02);
        }
        MaterialCardView materialCardView = c10.f114607b;
        if (materialCardView != null) {
            materialCardView.setClipToOutline(true);
        }
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new a(c10, this, (C17164e<? super a>) null), 3, (Object) null);
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onResume() {
        super.onResume();
        E e10 = this.f123301N;
        if (e10 != null) {
            e10.q(true);
        }
    }

    public void onStop() {
        super.onStop();
        E e10 = this.f123301N;
        if (e10 != null) {
            e10.stop();
        }
        E e11 = this.f123301N;
        if (e11 != null) {
            e11.release();
        }
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123300M;
    }
}
