package com.google.android.material.timepicker;

import Ea.C9068b;
import Ea.C9069c;
import Ea.C9070d;
import Ea.C9072f;
import Ea.C9074h;
import Ea.C9077k;
import Ea.C9078l;
import I2.C4597a;
import I2.C4600b0;
import J2.t;
import Ra.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.sugarcube.app.base.data.source.CatalogRepository;
import j.C5443a;
import java.util.Arrays;

class ClockFaceView extends RadialViewGroup implements ClockHandView.b {
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final ClockHandView f67564C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final Rect f67565D;

    /* renamed from: E  reason: collision with root package name */
    private final RectF f67566E;

    /* renamed from: F  reason: collision with root package name */
    private final Rect f67567F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final SparseArray<TextView> f67568G;

    /* renamed from: H  reason: collision with root package name */
    private final C4597a f67569H;

    /* renamed from: I  reason: collision with root package name */
    private final int[] f67570I;

    /* renamed from: J  reason: collision with root package name */
    private final float[] f67571J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final int f67572K;

    /* renamed from: L  reason: collision with root package name */
    private final int f67573L;

    /* renamed from: M  reason: collision with root package name */
    private final int f67574M;

    /* renamed from: N  reason: collision with root package name */
    private final int f67575N;

    /* renamed from: O  reason: collision with root package name */
    private String[] f67576O;

    /* renamed from: P  reason: collision with root package name */
    private float f67577P;

    /* renamed from: Q  reason: collision with root package name */
    private final ColorStateList f67578Q;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.H(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f67564C.i()) - ClockFaceView.this.f67572K);
            return true;
        }
    }

    class b extends C4597a {
        b() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            int intValue = ((Integer) view.getTag(C9072f.f59500r)).intValue();
            if (intValue > 0) {
                tVar.T0((View) ClockFaceView.this.f67568G.get(intValue - 1));
            }
            tVar.l0(t.f.a(0, 1, intValue, 1, false, view.isSelected()));
            tVar.j0(true);
            tVar.b(t.a.f8838i);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f67565D);
            long j10 = uptimeMillis;
            float centerX = (float) ClockFaceView.this.f67565D.centerX();
            float centerY = (float) ClockFaceView.this.f67565D.centerY();
            ClockFaceView.this.f67564C.onTouchEvent(MotionEvent.obtain(uptimeMillis, j10, 0, centerX, centerY, 0));
            ClockFaceView.this.f67564C.onTouchEvent(MotionEvent.obtain(uptimeMillis, j10, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59300F);
    }

    private void P() {
        RectF e10 = this.f67564C.e();
        TextView R10 = R(e10);
        for (int i10 = 0; i10 < this.f67568G.size(); i10++) {
            TextView textView = this.f67568G.get(i10);
            if (textView != null) {
                textView.setSelected(textView == R10);
                textView.getPaint().setShader(Q(e10, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.f67565D);
        this.f67566E.set(this.f67565D);
        textView.getLineBounds(0, this.f67567F);
        RectF rectF2 = this.f67566E;
        Rect rect = this.f67567F;
        rectF2.inset((float) rect.left, (float) rect.top);
        if (!RectF.intersects(rectF, this.f67566E)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f67566E.left, rectF.centerY() - this.f67566E.top, rectF.width() * 0.5f, this.f67570I, this.f67571J, Shader.TileMode.CLAMP);
    }

    private TextView R(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f67568G.size(); i10++) {
            TextView textView2 = this.f67568G.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f67565D);
                this.f67566E.set(this.f67565D);
                this.f67566E.union(rectF);
                float width = this.f67566E.width() * this.f67566E.height();
                if (width < f10) {
                    textView = textView2;
                    f10 = width;
                }
            }
        }
        return textView;
    }

    private static float S(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void U(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f67568G.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f67576O.length, size); i11++) {
            TextView textView = this.f67568G.get(i11);
            if (i11 >= this.f67576O.length) {
                removeView(textView);
                this.f67568G.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C9074h.f59530n, this, false);
                    this.f67568G.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f67576O[i11]);
                textView.setTag(C9072f.f59500r, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(C9072f.f59495m, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                C4600b0.p0(textView, this.f67569H);
                textView.setTextColor(this.f67578Q);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, new Object[]{this.f67576O[i11]}));
                }
            }
        }
        this.f67564C.q(z10);
    }

    public void H(int i10) {
        if (i10 != G()) {
            super.H(i10);
            this.f67564C.m(G());
        }
    }

    /* access modifiers changed from: protected */
    public void J() {
        super.J();
        for (int i10 = 0; i10 < this.f67568G.size(); i10++) {
            this.f67568G.get(i10).setVisibility(0);
        }
    }

    public void T(String[] strArr, int i10) {
        this.f67576O = strArr;
        U(i10);
    }

    public void a(float f10, boolean z10) {
        if (Math.abs(this.f67577P - f10) > 0.001f) {
            this.f67577P = f10;
            P();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.a1(accessibilityNodeInfo).k0(t.e.b(1, this.f67576O.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        P();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int S10 = (int) (((float) this.f67575N) / S(((float) this.f67573L) / ((float) displayMetrics.heightPixels), ((float) this.f67574M) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(S10, CatalogRepository.FETCH_FLAG_SDB);
        setMeasuredDimension(S10, S10);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f67565D = new Rect();
        this.f67566E = new RectF();
        this.f67567F = new Rect();
        this.f67568G = new SparseArray<>();
        this.f67571J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59762N1, i10, C9077k.f59589F);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, C9078l.f59782P1);
        this.f67578Q = a10;
        LayoutInflater.from(context).inflate(C9074h.f59531o, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C9072f.f59494l);
        this.f67564C = clockHandView;
        this.f67572K = resources.getDimensionPixelSize(C9070d.f59376E);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.f67570I = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C5443a.a(context, C9069c.f59367f).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, C9078l.f59772O1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f67569H = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        T(strArr, 0);
        this.f67573L = resources.getDimensionPixelSize(C9070d.f59389R);
        this.f67574M = resources.getDimensionPixelSize(C9070d.f59390S);
        this.f67575N = resources.getDimensionPixelSize(C9070d.f59378G);
    }
}
