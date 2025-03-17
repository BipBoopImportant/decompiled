package com.sugarcube.app.base.ui.capturev2;

import OE.n;
import QE.C13435l;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.P0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import XH.v;
import XH.y;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.ui.hybrid.PanoTargetListener;
import com.sugarcube.app.base.ui.hybrid.PanoTargetView;
import com.sugarcube.common.R;
import com.sugarcube.core.analytics.Trackable;
import dI.C17164e;
import eI.C17187b;
import hF.C14540b;
import hF.C14541c;
import hF.C14542d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import q3.E;
import q3.w;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003R\u001a\u0010%\u001a\u00020 8\u0014X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u00107¨\u0006;"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/ArPanoFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "LQE/l;", "binding", "LXH/N;", "U0", "(LQE/l;)V", "V0", "Lcom/sugarcube/app/base/ui/capturev2/a;", "acquiredImage", "", "targetIdx", "T0", "(Lcom/sugarcube/app/base/ui/capturev2/a;I)V", "Landroid/graphics/Bitmap;", "bitmap", "P0", "(Landroid/graphics/Bitmap;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "onStop", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Landroid/widget/TextView;", "N", "Landroid/widget/TextView;", "captionTextView", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView;", "O", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView;", "panoView", "Landroid/widget/ImageView;", "P", "Landroid/widget/ImageView;", "scaleImageView", "Lq3/E;", "Q", "Lq3/E;", "player", "R", "I", "currentTarget", "S", "targetIndex", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArPanoFragment extends Hilt_ArPanoFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123320M = C14540b.Pano;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public TextView f123321N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public PanoTargetView f123322O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public ImageView f123323P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public E f123324Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public int f123325R = -1;

    /* renamed from: S  reason: collision with root package name */
    private int f123326S;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/capturev2/ArPanoFragment$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "LXH/N;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArPanoFragment f123327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f123328b;

        a(ArPanoFragment arPanoFragment, int i10) {
            this.f123327a = arPanoFragment;
            this.f123328b = i10;
        }

        public void onAnimationEnd(Animation animation) {
            ImageView M02 = this.f123327a.f123323P;
            PanoTargetView panoTargetView = null;
            if (M02 == null) {
                C17542s.z("scaleImageView");
                M02 = null;
            }
            M02.setVisibility(8);
            PanoTargetView K02 = this.f123327a.f123322O;
            if (K02 == null) {
                C17542s.z("panoView");
                K02 = null;
            }
            K02.setVisibility(0);
            PanoTargetView K03 = this.f123327a.f123322O;
            if (K03 == null) {
                C17542s.z("panoView");
                K03 = null;
            }
            K03.h(this.f123328b);
            PanoTargetView K04 = this.f123327a.f123322O;
            if (K04 == null) {
                C17542s.z("panoView");
            } else {
                panoTargetView = K04;
            }
            if (panoTargetView.f()) {
                this.f123327a.n0().u1();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f123329a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f123329a = lVar;
        }

        public final C16818i<?> c() {
            return this.f123329a;
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
            this.f123329a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.ArPanoFragment$saveImage$1", f = "ArPanoFragment.kt", l = {193}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123330c;

        /* renamed from: d  reason: collision with root package name */
        Object f123331d;

        /* renamed from: e  reason: collision with root package name */
        Object f123332e;

        /* renamed from: f  reason: collision with root package name */
        Object f123333f;

        /* renamed from: g  reason: collision with root package name */
        int f123334g;

        /* renamed from: h  reason: collision with root package name */
        int f123335h;

        /* renamed from: i  reason: collision with root package name */
        int f123336i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArPanoFragment f123337j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14196a f123338k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f123339l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.capturev2.ArPanoFragment$saveImage$1$1$1", f = "ArPanoFragment.kt", l = {}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f123340c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ArPanoFragment f123341d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Bitmap f123342e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f123343f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ArPanoFragment arPanoFragment, Bitmap bitmap, int i10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f123341d = arPanoFragment;
                this.f123342e = bitmap;
                this.f123343f = i10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f123341d, this.f123342e, this.f123343f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f123340c == 0) {
                    y.b(obj);
                    this.f123341d.P0(this.f123342e, this.f123343f);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ArPanoFragment arPanoFragment, C14196a aVar, int i10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f123337j = arPanoFragment;
            this.f123338k = aVar;
            this.f123339l = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f123337j, this.f123338k, this.f123339l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123336i;
            if (i10 == 0) {
                y.b(obj);
                this.f123337j.n0().G0(this.f123338k);
                Bitmap a10 = this.f123338k.a();
                if (a10 != null) {
                    ArPanoFragment arPanoFragment = this.f123337j;
                    int i11 = this.f123339l;
                    P0 c10 = C16311i0.c();
                    a aVar = new a(arPanoFragment, a10, i11, (C17164e<? super a>) null);
                    this.f123330c = a10;
                    this.f123331d = a10;
                    this.f123332e = arPanoFragment;
                    this.f123333f = a10;
                    this.f123334g = i11;
                    this.f123335h = 0;
                    this.f123336i = 1;
                    if (C16310i.g(c10, aVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                Bitmap bitmap = (Bitmap) this.f123333f;
                ArPanoFragment arPanoFragment2 = (ArPanoFragment) this.f123332e;
                Bitmap bitmap2 = (Bitmap) this.f123331d;
                Bitmap bitmap3 = (Bitmap) this.f123330c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/sugarcube/app/base/ui/capturev2/ArPanoFragment$d", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetListener;", "", "targetIdx", "LXH/N;", "targetAcquired", "(I)V", "targetLost", "targetSaving", "targetDone", "", "angles", "updateAngles", "([F)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements PanoTargetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArPanoFragment f123344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13435l f123345b;

        d(ArPanoFragment arPanoFragment, C13435l lVar) {
            this.f123344a = arPanoFragment;
            this.f123345b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N b(int i10, ArPanoFragment arPanoFragment, C14196a aVar) {
            C17542s.j(aVar, "it");
            if (i10 >= 0) {
                arPanoFragment.f123325R = -1;
                arPanoFragment.T0(aVar, i10);
            }
            return C16807N.f139792a;
        }

        public void targetAcquired(int i10) {
            TextView I02 = this.f123344a.f123321N;
            if (I02 == null) {
                C17542s.z("captionTextView");
                I02 = null;
            }
            I02.setText(n.f113222J0);
            this.f123344a.f123325R = i10;
            this.f123345b.f114634f.setVisibility(0);
            this.f123344a.n0().F0(new C14214j(this.f123344a.f123325R, this.f123344a));
        }

        public void targetDone(int i10) {
            E L02;
            this.f123345b.f114634f.setVisibility(8);
            if (i10 == 0 && (L02 = this.f123344a.f123324Q) != null) {
                L02.O(w.b(this.f123344a.r0(VideoAsset.CAPTURE_ICON_SNAP_RIGHT)));
            }
        }

        public void targetLost(int i10) {
            if (i10 == this.f123344a.f123325R) {
                this.f123344a.f123325R = -1;
                this.f123345b.f114634f.setVisibility(8);
            }
        }

        public void targetSaving(int i10) {
        }

        public void updateAngles(float[] fArr) {
            C17542s.j(fArr, "angles");
            this.f123344a.n0().I0(fArr);
        }
    }

    /* access modifiers changed from: private */
    public final void P0(Bitmap bitmap, int i10) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.sc_scale_down);
        loadAnimation.setAnimationListener(new a(this, i10));
        PanoTargetView panoTargetView = this.f123322O;
        ImageView imageView = null;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.setVisibility(8);
        V0();
        ImageView imageView2 = this.f123323P;
        if (imageView2 == null) {
            C17542s.z("scaleImageView");
        } else {
            imageView = imageView2;
        }
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        imageView.startAnimation(loadAnimation);
    }

    /* access modifiers changed from: private */
    public static final void Q0(ArPanoFragment arPanoFragment, C13435l lVar, View view) {
        v<Float, Float> G10;
        PanoTargetView panoTargetView = null;
        BaseFragment.z0(arPanoFragment, C14542d.Continue, (Trackable) null, 2, (Object) null);
        arPanoFragment.n0().V1();
        lVar.f114638j.setVisibility(8);
        lVar.f114632d.setVisibility(8);
        lVar.f114636h.setVisibility(0);
        lVar.f114634f.setVisibility(8);
        arPanoFragment.V0();
        C14228q m02 = arPanoFragment.m0();
        if (m02 != null && (G10 = m02.G()) != null) {
            PanoTargetView panoTargetView2 = arPanoFragment.f123322O;
            if (panoTargetView2 == null) {
                C17542s.z("panoView");
            } else {
                panoTargetView = panoTargetView2;
            }
            panoTargetView.g(G10.c().floatValue(), G10.d().floatValue());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(ArPanoFragment arPanoFragment, C13435l lVar, Boolean bool) {
        TextView textView = null;
        h1.R1(arPanoFragment.n0(), "arInitDone changed - " + bool + " " + lVar.f114638j.isEnabled(), (Throwable) null, 2, (Object) null);
        if (bool != null) {
            if (C17542s.e(bool, Boolean.FALSE) || C17542s.e(bool, Boolean.TRUE)) {
                h1.R1(arPanoFragment.n0(), "show startButton", (Throwable) null, 2, (Object) null);
                TextView textView2 = arPanoFragment.f123321N;
                if (textView2 == null) {
                    C17542s.z("captionTextView");
                } else {
                    textView = textView2;
                }
                textView.setText(n.f113464u0);
                lVar.f114638j.setVisibility(0);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(ArPanoFragment arPanoFragment) {
        PanoTargetView panoTargetView = arPanoFragment.f123322O;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.invalidate();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void T0(C14196a aVar, int i10) {
        PanoTargetView panoTargetView = this.f123322O;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        if (panoTargetView.j(i10)) {
            this.f123326S = i10 + 1;
            h1.R1(n0(), "saveImage[" + i10 + "] " + aVar, (Throwable) null, 2, (Object) null);
            F0 unused = C16314k.d(C5222z.a(this), C16311i0.b(), (T) null, new c(this, aVar, i10, (C17164e<? super c>) null), 2, (Object) null);
            return;
        }
        h1.R1(n0(), "saveImage[" + i10 + "] ignore " + aVar, (Throwable) null, 2, (Object) null);
    }

    private final void U0(C13435l lVar) {
        PanoTargetView panoTargetView = this.f123322O;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.setListener(new d(this, lVar));
    }

    private final void V0() {
        int i10 = this.f123326S + 1;
        TextView textView = this.f123321N;
        TextView textView2 = null;
        if (textView == null) {
            C17542s.z("captionTextView");
            textView = null;
        }
        textView.setVisibility(0);
        int i11 = this.f123326S;
        if (i11 == 0) {
            TextView textView3 = this.f123321N;
            if (textView3 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView3;
            }
            textView2.setText(getString(n.f113270R0, String.valueOf(i10)));
        } else if (i11 == 1 || i11 == 2 || i11 == 3) {
            TextView textView4 = this.f123321N;
            if (textView4 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView4;
            }
            textView2.setText(getString(n.f113210H0, String.valueOf(i10)));
        } else if (i11 != 4) {
            TextView textView5 = this.f123321N;
            if (textView5 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView5;
            }
            textView2.setVisibility(8);
        } else {
            TextView textView6 = this.f123321N;
            if (textView6 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView6;
            }
            textView2.setText(getString(n.f113394k0, String.valueOf(i10)));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        TextView textView = null;
        h1.R1(n0(), "ArPanoFragment onCreateView " + n0().r1() + " " + n0().f1().name(), (Throwable) null, 2, (Object) null);
        C13435l c10 = C13435l.c(layoutInflater, viewGroup, false);
        t0(true);
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114630b;
        C17542s.i(floatingActionButton, "cancelButton");
        u0(b10, floatingActionButton);
        E x02 = x0(r0(VideoAsset.CAPTURE_ICON_SNAP_LEFT));
        this.f123324Q = x02;
        c10.f114635g.setPlayer(x02);
        c10.f114633e.setClipToOutline(true);
        this.f123322O = c10.f114636h;
        this.f123323P = c10.f114637i;
        C17542s.g(c10);
        U0(c10);
        this.f123321N = c10.f114631c;
        c10.f114638j.setOnClickListener(new C14210h(this, c10));
        TextView textView2 = this.f123321N;
        if (textView2 == null) {
            C17542s.z("captionTextView");
        } else {
            textView = textView2;
        }
        textView.setText(n.f113451s1);
        c10.f114638j.setVisibility(8);
        n0().R0().observe(getViewLifecycleOwner(), new b(new C14212i(this, c10)));
        n0().a2(C14541c.ARPANO);
        n0().p2();
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onPause() {
        super.onPause();
        h1.c2(n0(), (C17631a) null, 1, (Object) null);
    }

    public void onResume() {
        super.onResume();
        E e10 = this.f123324Q;
        if (e10 != null) {
            e10.q(true);
        }
        n0().b2(new C14208g(this));
    }

    public void onStop() {
        super.onStop();
        E e10 = this.f123324Q;
        if (e10 != null) {
            e10.stop();
        }
        E e11 = this.f123324Q;
        if (e11 != null) {
            e11.release();
        }
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123320M;
    }
}
