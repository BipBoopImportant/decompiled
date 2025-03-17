package com.airbnb.lottie;

import B6.e;
import I6.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import j.C5443a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import w6.C8917A;
import w6.C8919a;
import w6.C8920b;
import w6.C8921c;
import w6.C8923e;
import w6.C8924f;
import w6.C8925g;
import w6.C8926h;
import w6.C8927i;
import w6.D;
import w6.E;
import w6.F;
import w6.G;
import w6.H;
import w6.I;
import w6.r;
import w6.w;
import w6.y;
import w6.z;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: r  reason: collision with root package name */
    private static final String f46081r = "LottieAnimationView";
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final w<Throwable> f46082s = new C8925g();

    /* renamed from: d  reason: collision with root package name */
    private final w<C8927i> f46083d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    private final w<Throwable> f46084e = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public w<Throwable> f46085f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f46086g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final o f46087h = new o();

    /* renamed from: i  reason: collision with root package name */
    private String f46088i;

    /* renamed from: j  reason: collision with root package name */
    private int f46089j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46090k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46091l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46092m = true;

    /* renamed from: n  reason: collision with root package name */
    private final Set<b> f46093n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    private final Set<y> f46094o = new HashSet();

    /* renamed from: p  reason: collision with root package name */
    private p<C8927i> f46095p;

    /* renamed from: q  reason: collision with root package name */
    private C8927i f46096q;

    private static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0805a();

        /* renamed from: a  reason: collision with root package name */
        String f46097a;

        /* renamed from: b  reason: collision with root package name */
        int f46098b;

        /* renamed from: c  reason: collision with root package name */
        float f46099c;

        /* renamed from: d  reason: collision with root package name */
        boolean f46100d;

        /* renamed from: e  reason: collision with root package name */
        String f46101e;

        /* renamed from: f  reason: collision with root package name */
        int f46102f;

        /* renamed from: g  reason: collision with root package name */
        int f46103g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$a$a  reason: collision with other inner class name */
        class C0805a implements Parcelable.Creator<a> {
            C0805a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel, (a) null);
            }

            /* renamed from: b */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* synthetic */ a(Parcel parcel, a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f46097a);
            parcel.writeFloat(this.f46099c);
            parcel.writeInt(this.f46100d ? 1 : 0);
            parcel.writeString(this.f46101e);
            parcel.writeInt(this.f46102f);
            parcel.writeInt(this.f46103g);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        private a(Parcel parcel) {
            super(parcel);
            this.f46097a = parcel.readString();
            this.f46099c = parcel.readFloat();
            this.f46100d = parcel.readInt() != 1 ? false : true;
            this.f46101e = parcel.readString();
            this.f46102f = parcel.readInt();
            this.f46103g = parcel.readInt();
        }
    }

    private enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class c implements w<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f46104a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f46104a = new WeakReference<>(lottieAnimationView);
        }

        /* renamed from: a */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f46104a.get();
            if (lottieAnimationView != null) {
                if (lottieAnimationView.f46086g != 0) {
                    lottieAnimationView.setImageResource(lottieAnimationView.f46086g);
                }
                (lottieAnimationView.f46085f == null ? LottieAnimationView.f46082s : lottieAnimationView.f46085f).onResult(th2);
            }
        }
    }

    private static class d implements w<C8927i> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f46105a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f46105a = new WeakReference<>(lottieAnimationView);
        }

        /* renamed from: a */
        public void onResult(C8927i iVar) {
            LottieAnimationView lottieAnimationView = this.f46105a.get();
            if (lottieAnimationView != null) {
                lottieAnimationView.setComposition(iVar);
            }
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o(attributeSet, E.f57209a);
    }

    private void j() {
        p<C8927i> pVar = this.f46095p;
        if (pVar != null) {
            pVar.j(this.f46083d);
            this.f46095p.i(this.f46084e);
        }
    }

    private void k() {
        this.f46096q = null;
        this.f46087h.t();
    }

    private p<C8927i> m(String str) {
        return isInEditMode() ? new p<>(new C8924f(this, str), true) : this.f46092m ? r.k(getContext(), str) : r.l(getContext(), str, (String) null);
    }

    private p<C8927i> n(int i10) {
        return isInEditMode() ? new p<>(new C8926h(this, i10), true) : this.f46092m ? r.t(getContext(), i10) : r.u(getContext(), i10, (String) null);
    }

    private void o(AttributeSet attributeSet, int i10) {
        String string;
        boolean z10 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, F.f57210a, i10, 0);
        this.f46092m = obtainStyledAttributes.getBoolean(F.f57213d, true);
        boolean hasValue = obtainStyledAttributes.hasValue(F.f57224o);
        boolean hasValue2 = obtainStyledAttributes.hasValue(F.f57219j);
        boolean hasValue3 = obtainStyledAttributes.hasValue(F.f57229t);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(F.f57224o, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(F.f57219j);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(F.f57229t)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(F.f57218i, 0));
            if (obtainStyledAttributes.getBoolean(F.f57212c, false)) {
                this.f46091l = true;
            }
            if (obtainStyledAttributes.getBoolean(F.f57222m, false)) {
                this.f46087h.X0(-1);
            }
            if (obtainStyledAttributes.hasValue(F.f57227r)) {
                setRepeatMode(obtainStyledAttributes.getInt(F.f57227r, 1));
            }
            if (obtainStyledAttributes.hasValue(F.f57226q)) {
                setRepeatCount(obtainStyledAttributes.getInt(F.f57226q, -1));
            }
            if (obtainStyledAttributes.hasValue(F.f57228s)) {
                setSpeed(obtainStyledAttributes.getFloat(F.f57228s, 1.0f));
            }
            if (obtainStyledAttributes.hasValue(F.f57214e)) {
                setClipToCompositionBounds(obtainStyledAttributes.getBoolean(F.f57214e, true));
            }
            if (obtainStyledAttributes.hasValue(F.f57216g)) {
                setDefaultFontFileExtension(obtainStyledAttributes.getString(F.f57216g));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(F.f57221l));
            z(obtainStyledAttributes.getFloat(F.f57223n, 0.0f), obtainStyledAttributes.hasValue(F.f57223n));
            l(obtainStyledAttributes.getBoolean(F.f57217h, false));
            if (obtainStyledAttributes.hasValue(F.f57215f)) {
                i(new e("**"), z.f57302K, new J6.c(new H(C5443a.a(getContext(), obtainStyledAttributes.getResourceId(F.f57215f, -1)).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(F.f57225p)) {
                int i11 = F.f57225p;
                G g10 = G.AUTOMATIC;
                int i12 = obtainStyledAttributes.getInt(i11, g10.ordinal());
                if (i12 >= G.values().length) {
                    i12 = g10.ordinal();
                }
                setRenderMode(G.values()[i12]);
            }
            if (obtainStyledAttributes.hasValue(F.f57211b)) {
                int i13 = F.f57211b;
                C8919a aVar = C8919a.AUTOMATIC;
                int i14 = obtainStyledAttributes.getInt(i13, aVar.ordinal());
                if (i14 >= G.values().length) {
                    i14 = aVar.ordinal();
                }
                setAsyncUpdates(C8919a.values()[i14]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(F.f57220k, false));
            if (obtainStyledAttributes.hasValue(F.f57230u)) {
                setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(F.f57230u, false));
            }
            obtainStyledAttributes.recycle();
            o oVar = this.f46087h;
            if (j.f(getContext()) != 0.0f) {
                z10 = true;
            }
            oVar.b1(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8917A q(String str) {
        return this.f46092m ? r.m(getContext(), str) : r.n(getContext(), str, (String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8917A r(int i10) {
        return this.f46092m ? r.v(getContext(), i10) : r.w(getContext(), i10, (String) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void s(Throwable th2) {
        if (j.k(th2)) {
            I6.d.d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    private void setCompositionTask(p<C8927i> pVar) {
        this.f46093n.add(b.SET_ANIMATION);
        k();
        j();
        this.f46095p = pVar.d(this.f46083d).c(this.f46084e);
    }

    private void y() {
        boolean p10 = p();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.f46087h);
        if (p10) {
            this.f46087h.x0();
        }
    }

    private void z(float f10, boolean z10) {
        if (z10) {
            this.f46093n.add(b.SET_PROGRESS);
        }
        this.f46087h.V0(f10);
    }

    public C8919a getAsyncUpdates() {
        return this.f46087h.D();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f46087h.E();
    }

    public boolean getClipToCompositionBounds() {
        return this.f46087h.G();
    }

    public C8927i getComposition() {
        return this.f46096q;
    }

    public long getDuration() {
        C8927i iVar = this.f46096q;
        if (iVar != null) {
            return (long) iVar.d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f46087h.K();
    }

    public String getImageAssetsFolder() {
        return this.f46087h.M();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f46087h.O();
    }

    public float getMaxFrame() {
        return this.f46087h.P();
    }

    public float getMinFrame() {
        return this.f46087h.Q();
    }

    public D getPerformanceTracker() {
        return this.f46087h.R();
    }

    public float getProgress() {
        return this.f46087h.S();
    }

    public G getRenderMode() {
        return this.f46087h.T();
    }

    public int getRepeatCount() {
        return this.f46087h.U();
    }

    public int getRepeatMode() {
        return this.f46087h.V();
    }

    public float getSpeed() {
        return this.f46087h.W();
    }

    public <T> void i(e eVar, T t10, J6.c<T> cVar) {
        this.f46087h.q(eVar, t10, cVar);
    }

    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof o) && ((o) drawable).T() == G.SOFTWARE) {
            this.f46087h.invalidateSelf();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        o oVar = this.f46087h;
        if (drawable2 == oVar) {
            super.invalidateDrawable(oVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void l(boolean z10) {
        this.f46087h.y(z10);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f46091l) {
            this.f46087h.u0();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f46088i = aVar.f46097a;
        Set<b> set = this.f46093n;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f46088i)) {
            setAnimation(this.f46088i);
        }
        this.f46089j = aVar.f46098b;
        if (!this.f46093n.contains(bVar) && (i10 = this.f46089j) != 0) {
            setAnimation(i10);
        }
        if (!this.f46093n.contains(b.SET_PROGRESS)) {
            z(aVar.f46099c, false);
        }
        if (!this.f46093n.contains(b.PLAY_OPTION) && aVar.f46100d) {
            u();
        }
        if (!this.f46093n.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(aVar.f46101e);
        }
        if (!this.f46093n.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(aVar.f46102f);
        }
        if (!this.f46093n.contains(b.SET_REPEAT_COUNT)) {
            setRepeatCount(aVar.f46103g);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f46097a = this.f46088i;
        aVar.f46098b = this.f46089j;
        aVar.f46099c = this.f46087h.S();
        aVar.f46100d = this.f46087h.b0();
        aVar.f46101e = this.f46087h.M();
        aVar.f46102f = this.f46087h.V();
        aVar.f46103g = this.f46087h.U();
        return aVar;
    }

    public boolean p() {
        return this.f46087h.a0();
    }

    public void setAnimation(int i10) {
        this.f46089j = i10;
        this.f46088i = null;
        setCompositionTask(n(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        x(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f46092m ? r.x(getContext(), str) : r.y(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f46087h.z0(z10);
    }

    public void setAsyncUpdates(C8919a aVar) {
        this.f46087h.A0(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f46092m = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f46087h.B0(z10);
    }

    public void setComposition(C8927i iVar) {
        if (C8923e.f57233a) {
            String str = f46081r;
            Log.v(str, "Set Composition \n" + iVar);
        }
        this.f46087h.setCallback(this);
        this.f46096q = iVar;
        this.f46090k = true;
        boolean C02 = this.f46087h.C0(iVar);
        this.f46090k = false;
        if (getDrawable() != this.f46087h || C02) {
            if (!C02) {
                y();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (y a10 : this.f46094o) {
                a10.a(iVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f46087h.D0(str);
    }

    public void setFailureListener(w<Throwable> wVar) {
        this.f46085f = wVar;
    }

    public void setFallbackResource(int i10) {
        this.f46086g = i10;
    }

    public void setFontAssetDelegate(C8920b bVar) {
        this.f46087h.E0(bVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f46087h.F0(map);
    }

    public void setFrame(int i10) {
        this.f46087h.G0(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f46087h.H0(z10);
    }

    public void setImageAssetDelegate(C8921c cVar) {
        this.f46087h.I0(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f46087h.J0(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        j();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        j();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i10) {
        j();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f46087h.K0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f46087h.L0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f46087h.N0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f46087h.P0(str);
    }

    public void setMinFrame(int i10) {
        this.f46087h.Q0(i10);
    }

    public void setMinProgress(float f10) {
        this.f46087h.S0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f46087h.T0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f46087h.U0(z10);
    }

    public void setProgress(float f10) {
        z(f10, true);
    }

    public void setRenderMode(G g10) {
        this.f46087h.W0(g10);
    }

    public void setRepeatCount(int i10) {
        this.f46093n.add(b.SET_REPEAT_COUNT);
        this.f46087h.X0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f46093n.add(b.SET_REPEAT_MODE);
        this.f46087h.Y0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f46087h.Z0(z10);
    }

    public void setSpeed(float f10) {
        this.f46087h.a1(f10);
    }

    public void setTextDelegate(I i10) {
        this.f46087h.c1(i10);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f46087h.d1(z10);
    }

    public void t() {
        this.f46091l = false;
        this.f46087h.t0();
    }

    public void u() {
        this.f46093n.add(b.PLAY_OPTION);
        this.f46087h.u0();
    }

    public void unscheduleDrawable(Drawable drawable) {
        o oVar;
        if (!this.f46090k && drawable == (oVar = this.f46087h) && oVar.a0()) {
            t();
        } else if (!this.f46090k && (drawable instanceof o)) {
            o oVar2 = (o) drawable;
            if (oVar2.a0()) {
                oVar2.t0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f46093n.add(b.PLAY_OPTION);
        this.f46087h.x0();
    }

    public void w(InputStream inputStream, String str) {
        setCompositionTask(r.o(inputStream, str));
    }

    public void x(String str, String str2) {
        w(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f46087h.M0(str);
    }

    public void setMinFrame(String str) {
        this.f46087h.R0(str);
    }

    public void setAnimation(String str) {
        this.f46088i = str;
        this.f46089j = 0;
        setCompositionTask(m(str));
    }
}
