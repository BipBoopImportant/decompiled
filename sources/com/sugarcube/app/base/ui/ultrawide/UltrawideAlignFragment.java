package com.sugarcube.app.base.ui.ultrawide;

import OE.n;
import QE.O;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import XH.y;
import YE.C13868b;
import YE.e;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
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
import androidx.lifecycle.L;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003¨\u0006 "}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideAlignFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "LQE/O;", "binding", "LXH/N;", "K0", "(LQE/O;)V", "P0", "Landroid/widget/ImageView;", "imageView", "Landroid/graphics/Bitmap;", "bitmap", "O0", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "Landroid/util/Size;", "J0", "()Landroid/util/Size;", "pano", "I0", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStop", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideAlignFragment extends Hilt_UltrawideAlignFragment {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideAlignFragment$onCreateView$1$4$1", f = "UltrawideAlignFragment.kt", l = {79}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125437c;

        /* renamed from: d  reason: collision with root package name */
        Object f125438d;

        /* renamed from: e  reason: collision with root package name */
        Object f125439e;

        /* renamed from: f  reason: collision with root package name */
        Object f125440f;

        /* renamed from: g  reason: collision with root package name */
        Object f125441g;

        /* renamed from: h  reason: collision with root package name */
        Object f125442h;

        /* renamed from: i  reason: collision with root package name */
        int f125443i;

        /* renamed from: j  reason: collision with root package name */
        int f125444j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ UltrawideAlignFragment f125445k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Bitmap f125446l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f125447m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ O f125448n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UltrawideAlignFragment ultrawideAlignFragment, Bitmap bitmap, boolean z10, O o10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f125445k = ultrawideAlignFragment;
            this.f125446l = bitmap;
            this.f125447m = z10;
            this.f125448n = o10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f125445k, this.f125446l, this.f125447m, this.f125448n, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125444j;
            if (i10 == 0) {
                y.b(obj);
                Bitmap F02 = this.f125445k.I0(this.f125446l);
                if (F02 != null) {
                    UltrawideAlignFragment ultrawideAlignFragment = this.f125445k;
                    O o10 = this.f125448n;
                    ImageView imageView = o10.f114423h;
                    C17542s.i(imageView, "imageViewAlign");
                    ultrawideAlignFragment.O0(imageView, F02);
                    I0 x02 = ultrawideAlignFragment.x0();
                    this.f125437c = F02;
                    this.f125438d = F02;
                    this.f125439e = ultrawideAlignFragment;
                    this.f125440f = o10;
                    this.f125441g = F02;
                    this.f125442h = imageView;
                    this.f125443i = 0;
                    this.f125444j = 1;
                    if (x02.P1(F02, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                ImageView imageView2 = (ImageView) this.f125442h;
                Bitmap bitmap = (Bitmap) this.f125441g;
                O o11 = (O) this.f125440f;
                UltrawideAlignFragment ultrawideAlignFragment2 = (UltrawideAlignFragment) this.f125439e;
                Bitmap bitmap2 = (Bitmap) this.f125438d;
                Bitmap bitmap3 = (Bitmap) this.f125437c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.f125447m) {
                UltrawideAlignFragment ultrawideAlignFragment3 = this.f125445k;
                O o12 = this.f125448n;
                C17542s.g(o12);
                ultrawideAlignFragment3.P0(o12);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f125449a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f125449a = lVar;
        }

        public final C16818i<?> c() {
            return this.f125449a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f125449a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public final Bitmap I0(Bitmap bitmap) {
        Bitmap bitmap2;
        C14286a w10;
        C14286a w11;
        C14286a j12 = x0().j1();
        C14304j w02 = w0();
        String str = "panoIntrinsics=" + j12 + " cameraIntrinsics=" + (w02 != null ? w02.w() : null);
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b bVar = C13868b.f118106a;
        e eVar = e.Capture;
        bVar.b(str, eVar);
        float b10 = x0().j1().b();
        float c10 = x0().j1().c();
        C14304j w03 = w0();
        float b11 = (w03 == null || (w11 = w03.w()) == null) ? b10 : w11.b();
        C14304j w04 = w0();
        float c11 = (w04 == null || (w10 = w04.w()) == null) ? c10 : w10.c();
        float f10 = x0().j1().f();
        float g10 = x0().j1().g();
        double tan = Math.tan(Math.toRadians(((double) b11) * 0.5d));
        C13868b bVar2 = bVar;
        double d10 = (double) 1;
        int floor = (int) Math.floor((((double) (bitmap.getWidth() / 2)) - (((double) f10) * tan)) + d10);
        Log.d(AnyKt.SUGARCUBE_TAG, "fovH=" + b11 + " tanH=" + tan + " fx=" + f10 + " colsHalf=" + floor + " ");
        double tan2 = Math.tan(Math.toRadians(((double) c11) * 0.5d));
        int floor2 = (int) Math.floor((((double) (bitmap.getHeight() / 2)) - (((double) g10) * tan2)) + d10);
        Log.d(AnyKt.SUGARCUBE_TAG, "fovV=" + c11 + " tanV=" + tan2 + " fy=" + g10 + " rowsHalf=" + floor2);
        String str2 = "panoFOV=(" + b10 + "," + c10 + ") arFOV=(" + b11 + "," + c11 + ")";
        Log.d(AnyKt.SUGARCUBE_TAG, str2);
        C13868b bVar3 = bVar2;
        e eVar2 = eVar;
        bVar3.b(str2, eVar2);
        if (floor * 2 >= bitmap.getWidth()) {
            I0 x02 = x0();
            x02.u1().b().captureWarningBadColsHalf(x02.x1(), x02.p1(), x02.a1(), x02.Z0(), floor, bitmap.getWidth());
            floor = (bitmap.getWidth() / 2) - 1;
            bVar3.b("colsHalf out of range - adjust to " + floor, eVar2);
        }
        if (floor2 * 2 >= bitmap.getHeight()) {
            I0 x03 = x0();
            x03.u1().b().captureWarningBadRowsHalf(x03.x1(), x03.p1(), x03.a1(), x03.Z0(), floor2, bitmap.getHeight());
            floor2 = (bitmap.getHeight() / 2) - 1;
            bVar3.b("rowsHalf out of range - adjust to " + floor, eVar2);
        }
        try {
            bitmap2 = bitmap;
            try {
                return Bitmap.createBitmap(bitmap2, floor, floor2, bitmap.getWidth() - (floor * 2), bitmap.getHeight() - (floor2 * 2));
            } catch (IllegalArgumentException e10) {
                e = e10;
                FirebaseInteractions f12 = x0().f1();
                f12.log("crop pano [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]->[" + floor + "x" + floor2 + "]");
                f12.recordException(e);
                return bitmap2;
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
            bitmap2 = bitmap;
            FirebaseInteractions f122 = x0().f1();
            f122.log("crop pano [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]->[" + floor + "x" + floor2 + "]");
            f122.recordException(e);
            return bitmap2;
        }
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

    private final void K0(O o10) {
        o10.f114421f.setText(n.f113451s1);
        o10.f114419d.setVisibility(8);
        x0().W0().observe(getViewLifecycleOwner(), new b(new C14320x(o10, this)));
        x0().s2();
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(O o10, UltrawideAlignFragment ultrawideAlignFragment, Boolean bool) {
        Log.d(AnyKt.SUGARCUBE_TAG, "arInitDone changed - " + bool);
        if (bool != null) {
            if (C17542s.e(bool, Boolean.FALSE) || C17542s.e(bool, Boolean.TRUE)) {
                Log.d(AnyKt.SUGARCUBE_TAG, "show startButton");
                C13868b.f118106a.b("show startButton", e.Capture);
                ultrawideAlignFragment.P0(o10);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(UltrawideAlignFragment ultrawideAlignFragment) {
        I0 x02 = ultrawideAlignFragment.x0();
        x02.u1().b().captureAlignExit(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void N0(UltrawideAlignFragment ultrawideAlignFragment, View view) {
        I0 x02 = ultrawideAlignFragment.x0();
        x02.u1().b().captureAlignEnd(x02.x1(), x02.p1(), true, x02.a1(), x02.Z0());
        ultrawideAlignFragment.x0().M1();
        C8951o.f0(androidx.navigation.fragment.a.a(ultrawideAlignFragment), Kreativ.Capture.d.c.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void O0(ImageView imageView, Bitmap bitmap) {
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
        String str = "[" + J02 + "] [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] crop=[" + width3 + "x" + height + "]";
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, e.Capture);
        try {
            imageView.setImageBitmap(Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width3) / 2, (bitmap.getHeight() - height) / 2, width3 / 2, height));
        } catch (IllegalArgumentException e10) {
            FirebaseInteractions f12 = x0().f1();
            f12.log("crop bitmap [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]->[" + width3 + "x" + height + "]");
            f12.recordException(e10);
        }
    }

    /* access modifiers changed from: private */
    public final void P0(O o10) {
        o10.f114417b.setVisibility(0);
        o10.f114418c.setVisibility(0);
        o10.f114421f.setText(n.f113374h1);
        o10.f114419d.setVisibility(0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        O c10 = O.c(layoutInflater, viewGroup, false);
        y0(true);
        I0 x02 = x0();
        x02.u1().b().captureAlignStart(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114420e;
        C17542s.i(floatingActionButton, "cancelButton");
        z0(b10, floatingActionButton, new C14318v(this));
        c10.f114419d.setOnClickListener(new C14319w(this));
        boolean D12 = x0().D1();
        if (D12) {
            C17542s.g(c10);
            K0(c10);
        }
        if (x0().V0() == null) {
            Bitmap i12 = x0().i1();
            if (i12 != null) {
                F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new a(this, i12, D12, c10, (C17164e<? super a>) null), 3, (Object) null);
            }
        } else {
            Bitmap V02 = x0().V0();
            if (V02 != null) {
                ImageView imageView = c10.f114423h;
                C17542s.i(imageView, "imageViewAlign");
                O0(imageView, V02);
                if (!D12) {
                    C17542s.g(c10);
                    P0(c10);
                }
            }
        }
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onStop() {
        super.onStop();
        x0().u2();
    }
}
