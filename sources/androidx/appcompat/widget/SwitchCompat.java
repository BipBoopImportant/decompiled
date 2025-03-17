package androidx.appcompat.widget;

import I2.C4600b0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.i;
import androidx.emoji2.text.f;
import i.C5421a;
import i.C5428h;
import i.C5430j;
import j.C5443a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m.C5521a;
import y2.C6260a;

public class SwitchCompat extends CompoundButton {

    /* renamed from: S  reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f16378S = new a(Float.class, "thumbPos");

    /* renamed from: T  reason: collision with root package name */
    private static final int[] f16379T = {16842912};

    /* renamed from: A  reason: collision with root package name */
    private int f16380A;

    /* renamed from: B  reason: collision with root package name */
    private int f16381B;

    /* renamed from: C  reason: collision with root package name */
    private int f16382C;

    /* renamed from: D  reason: collision with root package name */
    private int f16383D;

    /* renamed from: E  reason: collision with root package name */
    private int f16384E;

    /* renamed from: F  reason: collision with root package name */
    private int f16385F;

    /* renamed from: G  reason: collision with root package name */
    private int f16386G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f16387H;

    /* renamed from: I  reason: collision with root package name */
    private final TextPaint f16388I;

    /* renamed from: J  reason: collision with root package name */
    private ColorStateList f16389J;

    /* renamed from: K  reason: collision with root package name */
    private Layout f16390K;

    /* renamed from: L  reason: collision with root package name */
    private Layout f16391L;

    /* renamed from: M  reason: collision with root package name */
    private TransformationMethod f16392M;

    /* renamed from: N  reason: collision with root package name */
    ObjectAnimator f16393N;

    /* renamed from: O  reason: collision with root package name */
    private final C5003o f16394O;

    /* renamed from: P  reason: collision with root package name */
    private C4995g f16395P;

    /* renamed from: Q  reason: collision with root package name */
    private b f16396Q;

    /* renamed from: R  reason: collision with root package name */
    private final Rect f16397R;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f16398a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f16399b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f16400c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16401d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16402e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f16403f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f16404g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f16405h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16406i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16407j;

    /* renamed from: k  reason: collision with root package name */
    private int f16408k;

    /* renamed from: l  reason: collision with root package name */
    private int f16409l;

    /* renamed from: m  reason: collision with root package name */
    private int f16410m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16411n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f16412o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f16413p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f16414q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f16415r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f16416s;

    /* renamed from: t  reason: collision with root package name */
    private int f16417t;

    /* renamed from: u  reason: collision with root package name */
    private int f16418u;

    /* renamed from: v  reason: collision with root package name */
    private float f16419v;

    /* renamed from: w  reason: collision with root package name */
    private float f16420w;

    /* renamed from: x  reason: collision with root package name */
    private VelocityTracker f16421x;

    /* renamed from: y  reason: collision with root package name */
    private int f16422y;

    /* renamed from: z  reason: collision with root package name */
    float f16423z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f16423z);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends f.C0335f {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<SwitchCompat> f16424a;

        b(SwitchCompat switchCompat) {
            this.f16424a = new WeakReference(switchCompat);
        }

        public void a(Throwable th2) {
            SwitchCompat switchCompat = this.f16424a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        public void b() {
            SwitchCompat switchCompat = this.f16424a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23882L);
    }

    private void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f16378S, new float[]{z10 ? 1.0f : 0.0f});
        this.f16393N = ofFloat;
        ofFloat.setDuration(250);
        this.f16393N.setAutoCancel(true);
        this.f16393N.start();
    }

    private void b() {
        Drawable drawable = this.f16398a;
        if (drawable == null) {
            return;
        }
        if (this.f16401d || this.f16402e) {
            Drawable mutate = C6260a.r(drawable).mutate();
            this.f16398a = mutate;
            if (this.f16401d) {
                C6260a.o(mutate, this.f16399b);
            }
            if (this.f16402e) {
                C6260a.p(this.f16398a, this.f16400c);
            }
            if (this.f16398a.isStateful()) {
                this.f16398a.setState(getDrawableState());
            }
        }
    }

    private void c() {
        Drawable drawable = this.f16403f;
        if (drawable == null) {
            return;
        }
        if (this.f16406i || this.f16407j) {
            Drawable mutate = C6260a.r(drawable).mutate();
            this.f16403f = mutate;
            if (this.f16406i) {
                C6260a.o(mutate, this.f16404g);
            }
            if (this.f16407j) {
                C6260a.p(this.f16403f, this.f16405h);
            }
            if (this.f16403f.isStateful()) {
                this.f16403f.setState(getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f16393N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.f16392M);
        return f10 != null ? f10.getTransformation(charSequence, this) : charSequence;
    }

    private C4995g getEmojiTextViewHelper() {
        if (this.f16395P == null) {
            this.f16395P = new C4995g(this);
        }
        return this.f16395P;
    }

    private boolean getTargetCheckedState() {
        return this.f16423z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((U.b(this) ? 1.0f - this.f16423z : this.f16423z) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f16403f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f16397R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f16398a;
        Rect d10 = drawable2 != null ? y.d(drawable2) : y.f16576c;
        return ((((this.f16380A - this.f16382C) - rect.left) - rect.right) - d10.left) - d10.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f16398a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f16398a.getPadding(this.f16397R);
        int i10 = this.f16384E;
        int i11 = this.f16418u;
        int i12 = i10 - i11;
        int i13 = (this.f16383D + thumbOffset) - i11;
        Rect rect = this.f16397R;
        return f10 > ((float) i13) && f10 < ((float) ((((this.f16382C + i13) + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f16386G + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.f16388I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f16414q;
            if (charSequence == null) {
                charSequence = getResources().getString(C5428h.f24025b);
            }
            C4600b0.J0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f16412o;
            if (charSequence == null) {
                charSequence = getResources().getString(C5428h.f24026c);
            }
            C4600b0.J0(this, charSequence);
        }
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void p() {
        if (this.f16396Q == null && this.f16395P.b() && f.k()) {
            f c10 = f.c();
            int g10 = c10.g();
            if (g10 == 3 || g10 == 0) {
                b bVar = new b(this);
                this.f16396Q = bVar;
                c10.v(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f16417t = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.f16421x.computeCurrentVelocity(1000);
            float xVelocity = this.f16421x.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f16422y)) {
                z10 = getTargetCheckedState();
            } else if (!U.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f16414q = charSequence;
        this.f16415r = g(charSequence);
        this.f16391L = null;
        if (this.f16416s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f16412o = charSequence;
        this.f16413p = g(charSequence);
        this.f16390K = null;
        if (this.f16416s) {
            p();
        }
    }

    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f16397R;
        int i12 = this.f16383D;
        int i13 = this.f16384E;
        int i14 = this.f16385F;
        int i15 = this.f16386G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f16398a;
        Rect d10 = drawable != null ? y.d(drawable) : y.f16576c;
        Drawable drawable2 = this.f16403f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d10 != null) {
                int i17 = d10.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d10.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d10.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d10.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f16403f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f16403f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f16398a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f16382C + rect.right;
            this.f16398a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                C6260a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f16398a;
        if (drawable != null) {
            C6260a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f16403f;
        if (drawable2 != null) {
            C6260a.k(drawable2, f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16398a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f16403f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!U.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f16380A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f16410m : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (U.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f16380A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f16410m : compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.r(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f16416s;
    }

    public boolean getSplitTrack() {
        return this.f16411n;
    }

    public int getSwitchMinWidth() {
        return this.f16409l;
    }

    public int getSwitchPadding() {
        return this.f16410m;
    }

    public CharSequence getTextOff() {
        return this.f16414q;
    }

    public CharSequence getTextOn() {
        return this.f16412o;
    }

    public Drawable getThumbDrawable() {
        return this.f16398a;
    }

    /* access modifiers changed from: protected */
    public final float getThumbPosition() {
        return this.f16423z;
    }

    public int getThumbTextPadding() {
        return this.f16408k;
    }

    public ColorStateList getThumbTintList() {
        return this.f16399b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f16400c;
    }

    public Drawable getTrackDrawable() {
        return this.f16403f;
    }

    public ColorStateList getTrackTintList() {
        return this.f16404g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f16405h;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        setTextOnInternal(this.f16412o);
        setTextOffInternal(this.f16414q);
        requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16398a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f16403f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f16393N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f16393N.end();
            this.f16393N = null;
        }
    }

    public void m(Context context, int i10) {
        M t10 = M.t(context, i10, C5430j.f24048B2);
        ColorStateList c10 = t10.c(C5430j.f24064F2);
        if (c10 != null) {
            this.f16389J = c10;
        } else {
            this.f16389J = getTextColors();
        }
        int f10 = t10.f(C5430j.f24052C2, 0);
        if (f10 != 0) {
            float f11 = (float) f10;
            if (f11 != this.f16388I.getTextSize()) {
                this.f16388I.setTextSize(f11);
                requestLayout();
            }
        }
        o(t10.k(C5430j.f24056D2, -1), t10.k(C5430j.f24060E2, -1));
        if (t10.a(C5430j.f24084K2, false)) {
            this.f16392M = new C5521a(getContext());
        } else {
            this.f16392M = null;
        }
        setTextOnInternal(this.f16412o);
        setTextOffInternal(this.f16414q);
        t10.x();
    }

    public void n(Typeface typeface, int i10) {
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(defaultFromStyle);
            int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
            TextPaint textPaint = this.f16388I;
            if ((i11 & 1) != 0) {
                z10 = true;
            }
            textPaint.setFakeBoldText(z10);
            TextPaint textPaint2 = this.f16388I;
            if ((i11 & 2) != 0) {
                f10 = -0.25f;
            }
            textPaint2.setTextSkewX(f10);
            return;
        }
        this.f16388I.setFakeBoldText(false);
        this.f16388I.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16379T);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        Rect rect = this.f16397R;
        Drawable drawable = this.f16403f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.f16384E;
        int i12 = this.f16386G;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f16398a;
        if (drawable != null) {
            if (!this.f16411n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = y.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f16390K : this.f16391L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f16389J;
            if (colorStateList != null) {
                this.f16388I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f16388I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i10 = bounds.left + bounds.right;
            } else {
                i10 = getWidth();
            }
            canvas.translate((float) ((i10 / 2) - (layout.getWidth() / 2)), (float) (((i13 + i14) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f16412o : this.f16414q;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        super.onLayout(z10, i10, i11, i12, i13);
        int i20 = 0;
        if (this.f16398a != null) {
            Rect rect = this.f16397R;
            Drawable drawable = this.f16403f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = y.d(this.f16398a);
            i14 = Math.max(0, d10.left - rect.left);
            i20 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (U.b(this)) {
            i16 = getPaddingLeft() + i14;
            i15 = ((this.f16380A + i16) - i14) - i20;
        } else {
            i15 = (getWidth() - getPaddingRight()) - i20;
            i16 = (i15 - this.f16380A) + i14 + i20;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i19 = this.f16381B;
            i18 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i19 / 2);
        } else if (gravity != 80) {
            i18 = getPaddingTop();
            i19 = this.f16381B;
        } else {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.f16381B;
            this.f16383D = i16;
            this.f16384E = i18;
            this.f16386G = i17;
            this.f16385F = i15;
        }
        i17 = i19 + i18;
        this.f16383D = i16;
        this.f16384E = i18;
        this.f16386G = i17;
        this.f16385F = i15;
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f16416s) {
            if (this.f16390K == null) {
                this.f16390K = i(this.f16413p);
            }
            if (this.f16391L == null) {
                this.f16391L = i(this.f16415r);
            }
        }
        Rect rect = this.f16397R;
        Drawable drawable = this.f16398a;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f16398a.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f16398a.getIntrinsicHeight();
        } else {
            i13 = 0;
            i12 = 0;
        }
        this.f16382C = Math.max(this.f16416s ? Math.max(this.f16390K.getWidth(), this.f16391L.getWidth()) + (this.f16408k * 2) : 0, i13);
        Drawable drawable2 = this.f16403f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f16403f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f16398a;
        if (drawable3 != null) {
            Rect d10 = y.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = this.f16387H ? Math.max(this.f16409l, (this.f16382C * 2) + i15 + i16) : this.f16409l;
        int max2 = Math.max(i14, i12);
        this.f16380A = max;
        this.f16381B = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f16412o : this.f16414q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f16421x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.f16417t
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f16419v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = androidx.appcompat.widget.U.b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.f16423z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f16423z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.f16419v = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f16419v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f16418u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.f16420w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f16418u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.f16417t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f16419v = r0
            r6.f16420w = r3
            return r1
        L_0x0089:
            int r0 = r6.f16417t
            if (r0 != r2) goto L_0x0094
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.f16417t = r0
            android.view.VelocityTracker r0 = r6.f16421x
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.f16417t = r1
            r6.f16419v = r0
            r6.f16420w = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() == null || !isLaidOut()) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f16412o);
        setTextOffInternal(this.f16414q);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void setEnforceSwitchWidth(boolean z10) {
        this.f16387H = z10;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f16416s != z10) {
            this.f16416s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f16411n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f16409l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f16410m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f16388I.getTypeface() != null && !this.f16388I.getTypeface().equals(typeface)) || (this.f16388I.getTypeface() == null && typeface != null)) {
            this.f16388I.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f16398a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f16398a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f10) {
        this.f16423z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(C5443a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f16408k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f16399b = colorStateList;
        this.f16401d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f16400c = mode;
        this.f16402e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f16403f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f16403f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C5443a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f16404g = colorStateList;
        this.f16406i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f16405h = mode;
        this.f16407j = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16398a || drawable == this.f16403f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16399b = null;
        this.f16400c = null;
        this.f16401d = false;
        this.f16402e = false;
        this.f16404g = null;
        this.f16405h = null;
        this.f16406i = false;
        this.f16407j = false;
        this.f16421x = VelocityTracker.obtain();
        this.f16387H = true;
        this.f16397R = new Rect();
        H.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f16388I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        M v10 = M.v(context, attributeSet, C5430j.f24208m2, i10, 0);
        C4600b0.n0(this, context, C5430j.f24208m2, attributeSet, v10.r(), i10, 0);
        Drawable g10 = v10.g(C5430j.f24223p2);
        this.f16398a = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v10.g(C5430j.f24268y2);
        this.f16403f = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v10.p(C5430j.f24213n2));
        setTextOffInternal(v10.p(C5430j.f24218o2));
        this.f16416s = v10.a(C5430j.f24228q2, true);
        this.f16408k = v10.f(C5430j.f24253v2, 0);
        this.f16409l = v10.f(C5430j.f24238s2, 0);
        this.f16410m = v10.f(C5430j.f24243t2, 0);
        this.f16411n = v10.a(C5430j.f24233r2, false);
        ColorStateList c10 = v10.c(C5430j.f24258w2);
        if (c10 != null) {
            this.f16399b = c10;
            this.f16401d = true;
        }
        PorterDuff.Mode e10 = y.e(v10.k(C5430j.f24263x2, -1), (PorterDuff.Mode) null);
        if (this.f16400c != e10) {
            this.f16400c = e10;
            this.f16402e = true;
        }
        if (this.f16401d || this.f16402e) {
            b();
        }
        ColorStateList c11 = v10.c(C5430j.f24273z2);
        if (c11 != null) {
            this.f16404g = c11;
            this.f16406i = true;
        }
        PorterDuff.Mode e11 = y.e(v10.k(C5430j.f24043A2, -1), (PorterDuff.Mode) null);
        if (this.f16405h != e11) {
            this.f16405h = e11;
            this.f16407j = true;
        }
        if (this.f16406i || this.f16407j) {
            c();
        }
        int n10 = v10.n(C5430j.f24248u2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        C5003o oVar = new C5003o(this);
        this.f16394O = oVar;
        oVar.m(attributeSet, i10);
        v10.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16418u = viewConfiguration.getScaledTouchSlop();
        this.f16422y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
