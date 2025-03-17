package com.google.android.material.textfield;

import Ea.C9068b;
import Ea.C9069c;
import Ea.C9070d;
import Ea.C9072f;
import Ea.C9076j;
import Ea.C9077k;
import Fa.C9081a;
import I2.C4597a;
import I2.C4600b0;
import I2.C4638v;
import J2.t;
import La.C9138a;
import Qa.C9242i;
import Ua.C9283d;
import Ua.C9286g;
import Ua.k;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C4993e;
import androidx.appcompat.widget.y;
import androidx.core.widget.i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C7017c;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.v;
import j.C5443a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u2.C6012a;
import y2.C6260a;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c1  reason: collision with root package name */
    private static final int f67387c1 = C9077k.f59606p;

    /* renamed from: d1  reason: collision with root package name */
    private static final int[][] f67388d1 = {new int[]{16842919}, new int[0]};

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f67389A;

    /* renamed from: A0  reason: collision with root package name */
    private final RectF f67390A0;

    /* renamed from: B  reason: collision with root package name */
    private ColorStateList f67391B;

    /* renamed from: B0  reason: collision with root package name */
    private Typeface f67392B0;

    /* renamed from: C  reason: collision with root package name */
    private boolean f67393C;

    /* renamed from: C0  reason: collision with root package name */
    private Drawable f67394C0;

    /* renamed from: D  reason: collision with root package name */
    private CharSequence f67395D;

    /* renamed from: D0  reason: collision with root package name */
    private int f67396D0;

    /* renamed from: E  reason: collision with root package name */
    private boolean f67397E;

    /* renamed from: E0  reason: collision with root package name */
    private final LinkedHashSet<f> f67398E0;

    /* renamed from: F  reason: collision with root package name */
    private C9286g f67399F;

    /* renamed from: F0  reason: collision with root package name */
    private Drawable f67400F0;

    /* renamed from: G  reason: collision with root package name */
    private C9286g f67401G;

    /* renamed from: G0  reason: collision with root package name */
    private int f67402G0;

    /* renamed from: H  reason: collision with root package name */
    private StateListDrawable f67403H;

    /* renamed from: H0  reason: collision with root package name */
    private Drawable f67404H0;

    /* renamed from: I  reason: collision with root package name */
    private boolean f67405I;

    /* renamed from: I0  reason: collision with root package name */
    private ColorStateList f67406I0;

    /* renamed from: J  reason: collision with root package name */
    private C9286g f67407J;

    /* renamed from: J0  reason: collision with root package name */
    private ColorStateList f67408J0;

    /* renamed from: K  reason: collision with root package name */
    private C9286g f67409K;

    /* renamed from: K0  reason: collision with root package name */
    private int f67410K0;

    /* renamed from: L  reason: collision with root package name */
    private k f67411L;

    /* renamed from: L0  reason: collision with root package name */
    private int f67412L0;

    /* renamed from: M  reason: collision with root package name */
    private boolean f67413M;

    /* renamed from: M0  reason: collision with root package name */
    private int f67414M0;

    /* renamed from: N  reason: collision with root package name */
    private final int f67415N;

    /* renamed from: N0  reason: collision with root package name */
    private ColorStateList f67416N0;

    /* renamed from: O  reason: collision with root package name */
    private int f67417O;

    /* renamed from: O0  reason: collision with root package name */
    private int f67418O0;

    /* renamed from: P  reason: collision with root package name */
    private int f67419P;

    /* renamed from: P0  reason: collision with root package name */
    private int f67420P0;

    /* renamed from: Q  reason: collision with root package name */
    private int f67421Q;

    /* renamed from: Q0  reason: collision with root package name */
    private int f67422Q0;

    /* renamed from: R  reason: collision with root package name */
    private int f67423R;

    /* renamed from: R0  reason: collision with root package name */
    private int f67424R0;

    /* renamed from: S  reason: collision with root package name */
    private int f67425S;

    /* renamed from: S0  reason: collision with root package name */
    private int f67426S0;

    /* renamed from: T  reason: collision with root package name */
    private int f67427T;

    /* renamed from: T0  reason: collision with root package name */
    int f67428T0;

    /* renamed from: U  reason: collision with root package name */
    private int f67429U;

    /* renamed from: U0  reason: collision with root package name */
    private boolean f67430U0;

    /* renamed from: V0  reason: collision with root package name */
    final com.google.android.material.internal.b f67431V0;

    /* renamed from: W0  reason: collision with root package name */
    private boolean f67432W0;

    /* renamed from: X0  reason: collision with root package name */
    private boolean f67433X0;

    /* renamed from: Y0  reason: collision with root package name */
    private ValueAnimator f67434Y0;

    /* renamed from: Z0  reason: collision with root package name */
    private boolean f67435Z0;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f67436a;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public boolean f67437a1;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final StartCompoundLayout f67438b;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f67439b1;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final EndCompoundLayout f67440c;

    /* renamed from: d  reason: collision with root package name */
    EditText f67441d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f67442e;

    /* renamed from: f  reason: collision with root package name */
    private int f67443f;

    /* renamed from: g  reason: collision with root package name */
    private int f67444g;

    /* renamed from: h  reason: collision with root package name */
    private int f67445h;

    /* renamed from: i  reason: collision with root package name */
    private int f67446i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final t f67447j;

    /* renamed from: k  reason: collision with root package name */
    boolean f67448k;

    /* renamed from: l  reason: collision with root package name */
    private int f67449l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f67450m;

    /* renamed from: n  reason: collision with root package name */
    private e f67451n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f67452o;

    /* renamed from: p  reason: collision with root package name */
    private int f67453p;

    /* renamed from: q  reason: collision with root package name */
    private int f67454q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f67455r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f67456s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f67457t;

    /* renamed from: u  reason: collision with root package name */
    private ColorStateList f67458u;

    /* renamed from: v  reason: collision with root package name */
    private int f67459v;

    /* renamed from: w  reason: collision with root package name */
    private C7017c f67460w;

    /* renamed from: x  reason: collision with root package name */
    private C7017c f67461x;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f67462y;

    /* renamed from: y0  reason: collision with root package name */
    private final Rect f67463y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f67464z;

    /* renamed from: z0  reason: collision with root package name */
    private final Rect f67465z0;

    class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        int f67466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f67467b;

        a(EditText editText) {
            this.f67467b = editText;
            this.f67466a = editText.getLineCount();
        }

        public void afterTextChanged(Editable editable) {
            int i10;
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.v0(!textInputLayout.f67437a1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f67448k) {
                textInputLayout2.l0(editable);
            }
            if (TextInputLayout.this.f67456s) {
                TextInputLayout.this.z0(editable);
            }
            int lineCount = this.f67467b.getLineCount();
            int i11 = this.f67466a;
            if (lineCount != i11) {
                if (lineCount < i11 && C4600b0.A(this.f67467b) != (i10 = TextInputLayout.this.f67428T0)) {
                    this.f67467b.setMinimumHeight(i10);
                }
                this.f67466a = lineCount;
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.f67440c.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f67431V0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C4597a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f67471d;

        public d(TextInputLayout textInputLayout) {
            this.f67471d = textInputLayout;
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            EditText editText = this.f67471d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f67471d.getHint();
            CharSequence error = this.f67471d.getError();
            CharSequence placeholderText = this.f67471d.getPlaceholderText();
            int counterMaxLength = this.f67471d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f67471d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean Q10 = this.f67471d.Q();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = !isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = !isEmpty2 ? hint.toString() : "";
            this.f67471d.f67438b.A(tVar);
            if (!isEmpty) {
                tVar.R0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                tVar.R0(charSequence);
                if (!Q10 && placeholderText != null) {
                    tVar.R0(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                tVar.R0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                tVar.w0(charSequence);
                tVar.N0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            tVar.B0(counterMaxLength);
            if (z10) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                tVar.r0(error);
            }
            View t10 = this.f67471d.f67447j.t();
            if (t10 != null) {
                tVar.y0(t10);
            }
            this.f67471d.f67440c.m().o(view, tVar);
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f67471d.f67440c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    static class h extends O2.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f67472c;

        /* renamed from: d  reason: collision with root package name */
        boolean f67473d;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f67472c + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f67472c, parcel, i10);
            parcel.writeInt(this.f67473d ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f67472c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f67473d = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private C7017c A() {
        C7017c cVar = new C7017c();
        cVar.q0((long) C9242i.f(getContext(), C9068b.f59307M, 87));
        cVar.s0(C9242i.g(getContext(), C9068b.f59313S, C9081a.f60371a));
        return cVar;
    }

    private void A0(boolean z10, boolean z11) {
        int defaultColor = this.f67416N0.getDefaultColor();
        int colorForState = this.f67416N0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f67416N0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f67427T = colorForState2;
        } else if (z11) {
            this.f67427T = colorForState;
        } else {
            this.f67427T = defaultColor;
        }
    }

    private boolean B() {
        return this.f67393C && !TextUtils.isEmpty(this.f67395D) && (this.f67399F instanceof h);
    }

    private void C() {
        Iterator<f> it = this.f67398E0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void D(Canvas canvas) {
        C9286g gVar;
        if (this.f67409K != null && (gVar = this.f67407J) != null) {
            gVar.draw(canvas);
            if (this.f67441d.isFocused()) {
                Rect bounds = this.f67409K.getBounds();
                Rect bounds2 = this.f67407J.getBounds();
                float x10 = this.f67431V0.x();
                int centerX = bounds2.centerX();
                bounds.left = C9081a.c(centerX, bounds2.left, x10);
                bounds.right = C9081a.c(centerX, bounds2.right, x10);
                this.f67409K.draw(canvas);
            }
        }
    }

    private void E(Canvas canvas) {
        if (this.f67393C) {
            this.f67431V0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f67434Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f67434Y0.cancel();
        }
        if (!z10 || !this.f67433X0) {
            this.f67431V0.c0(0.0f);
        } else {
            l(0.0f);
        }
        if (B() && ((h) this.f67399F).r0()) {
            y();
        }
        this.f67430U0 = true;
        L();
        this.f67438b.l(true);
        this.f67440c.H(true);
    }

    private C9286g G(boolean z10) {
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(C9070d.f59431q0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f67441d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(C9070d.f59444y);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C9070d.f59425n0);
        k m10 = k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f67441d;
        C9286g m11 = C9286g.m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        m11.setShapeAppearanceModel(m10);
        m11.d0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m11;
    }

    private static Drawable H(C9286g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C9138a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f67441d.getCompoundPaddingLeft() : this.f67440c.y() : this.f67438b.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f67441d.getCompoundPaddingRight() : this.f67438b.c() : this.f67440c.y());
    }

    private static Drawable K(Context context, C9286g gVar, int i10, int[][] iArr) {
        int c10 = C9138a.c(context, C9068b.f59352q, "TextInputLayout");
        C9286g gVar2 = new C9286g(gVar.E());
        int j10 = C9138a.j(i10, c10, 0.1f);
        gVar2.b0(new ColorStateList(iArr, new int[]{j10, 0}));
        gVar2.setTint(c10);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j10, c10});
        C9286g gVar3 = new C9286g(gVar.E());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        TextView textView = this.f67457t;
        if (textView != null && this.f67456s) {
            textView.setText((CharSequence) null);
            androidx.transition.t.a(this.f67436a, this.f67461x);
            this.f67457t.setVisibility(4);
        }
    }

    private boolean R() {
        return e0() || (this.f67452o != null && this.f67450m);
    }

    private boolean T() {
        return this.f67417O == 1 && this.f67441d.getMinLines() <= 1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int U(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V() {
        this.f67441d.requestLayout();
    }

    private void W() {
        p();
        s0();
        B0();
        i0();
        k();
        if (this.f67417O != 0) {
            u0();
        }
        c0();
    }

    private void X() {
        if (B()) {
            RectF rectF = this.f67390A0;
            this.f67431V0.o(rectF, this.f67441d.getWidth(), this.f67441d.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                o(rectF);
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f67421Q));
                ((h) this.f67399F).u0(rectF);
            }
        }
    }

    private void Y() {
        if (B() && !this.f67430U0) {
            y();
            X();
        }
    }

    private static void Z(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Z((ViewGroup) childAt, z10);
            }
        }
    }

    private void b0() {
        TextView textView = this.f67457t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void c0() {
        EditText editText = this.f67441d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f67417O;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean f0() {
        return (this.f67440c.G() || ((this.f67440c.A() && M()) || this.f67440c.w() != null)) && this.f67440c.getMeasuredWidth() > 0;
    }

    private boolean g0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f67438b.getMeasuredWidth() > 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f67441d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f67399F;
        }
        int d10 = C9138a.d(this.f67441d, C9068b.f59341k);
        int i10 = this.f67417O;
        if (i10 == 2) {
            return K(getContext(), this.f67399F, d10, f67388d1);
        }
        if (i10 == 1) {
            return H(this.f67399F, this.f67429U, d10, f67388d1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f67403H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f67403H = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f67403H.addState(new int[0], G(false));
        }
        return this.f67403H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f67401G == null) {
            this.f67401G = G(true);
        }
        return this.f67401G;
    }

    private void h0() {
        if (this.f67457t != null && this.f67456s && !TextUtils.isEmpty(this.f67455r)) {
            this.f67457t.setText(this.f67455r);
            androidx.transition.t.a(this.f67436a, this.f67460w);
            this.f67457t.setVisibility(0);
            this.f67457t.bringToFront();
            announceForAccessibility(this.f67455r);
        }
    }

    private void i0() {
        if (this.f67417O != 1) {
            return;
        }
        if (Ra.c.i(getContext())) {
            this.f67419P = getResources().getDimensionPixelSize(C9070d.f59384M);
        } else if (Ra.c.h(getContext())) {
            this.f67419P = getResources().getDimensionPixelSize(C9070d.f59383L);
        }
    }

    private void j() {
        TextView textView = this.f67457t;
        if (textView != null) {
            this.f67436a.addView(textView);
            this.f67457t.setVisibility(0);
        }
    }

    private void j0(Rect rect) {
        C9286g gVar = this.f67407J;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f67423R, rect.right, i10);
        }
        C9286g gVar2 = this.f67409K;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.f67425S, rect.right, i11);
        }
    }

    private void k() {
        if (this.f67441d != null && this.f67417O == 1) {
            if (Ra.c.i(getContext())) {
                EditText editText = this.f67441d;
                C4600b0.F0(editText, C4600b0.E(editText), getResources().getDimensionPixelSize(C9070d.f59382K), C4600b0.D(this.f67441d), getResources().getDimensionPixelSize(C9070d.f59381J));
            } else if (Ra.c.h(getContext())) {
                EditText editText2 = this.f67441d;
                C4600b0.F0(editText2, C4600b0.E(editText2), getResources().getDimensionPixelSize(C9070d.f59380I), C4600b0.D(this.f67441d), getResources().getDimensionPixelSize(C9070d.f59379H));
            }
        }
    }

    private void k0() {
        if (this.f67452o != null) {
            EditText editText = this.f67441d;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void m() {
        C9286g gVar = this.f67399F;
        if (gVar != null) {
            k E10 = gVar.E();
            k kVar = this.f67411L;
            if (E10 != kVar) {
                this.f67399F.setShapeAppearanceModel(kVar);
            }
            if (w()) {
                this.f67399F.h0((float) this.f67421Q, this.f67427T);
            }
            int q10 = q();
            this.f67429U = q10;
            this.f67399F.b0(ColorStateList.valueOf(q10));
            n();
            s0();
        }
    }

    private static void m0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? C9076j.f59560c : C9076j.f59559b, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    private void n() {
        if (this.f67407J != null && this.f67409K != null) {
            if (x()) {
                this.f67407J.b0(this.f67441d.isFocused() ? ColorStateList.valueOf(this.f67410K0) : ColorStateList.valueOf(this.f67427T));
                this.f67409K.b0(ColorStateList.valueOf(this.f67427T));
            }
            invalidate();
        }
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f67452o;
        if (textView != null) {
            d0(textView, this.f67450m ? this.f67453p : this.f67454q);
            if (!this.f67450m && (colorStateList2 = this.f67462y) != null) {
                this.f67452o.setTextColor(colorStateList2);
            }
            if (this.f67450m && (colorStateList = this.f67464z) != null) {
                this.f67452o.setTextColor(colorStateList);
            }
        }
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f67415N;
        rectF.left = f10 - ((float) i10);
        rectF.right += (float) i10;
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f67389A;
        if (colorStateList2 == null) {
            colorStateList2 = C9138a.g(getContext(), C9068b.f59339j);
        }
        EditText editText = this.f67441d;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = C6260a.r(this.f67441d.getTextCursorDrawable()).mutate();
            if (R() && (colorStateList = this.f67391B) != null) {
                colorStateList2 = colorStateList;
            }
            C6260a.o(mutate, colorStateList2);
        }
    }

    private void p() {
        int i10 = this.f67417O;
        if (i10 == 0) {
            this.f67399F = null;
            this.f67407J = null;
            this.f67409K = null;
        } else if (i10 == 1) {
            this.f67399F = new C9286g(this.f67411L);
            this.f67407J = new C9286g();
            this.f67409K = new C9286g();
        } else if (i10 == 2) {
            if (!this.f67393C || (this.f67399F instanceof h)) {
                this.f67399F = new C9286g(this.f67411L);
            } else {
                this.f67399F = h.p0(this.f67411L);
            }
            this.f67407J = null;
            this.f67409K = null;
        } else {
            throw new IllegalArgumentException(this.f67417O + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private int q() {
        return this.f67417O == 1 ? C9138a.i(C9138a.e(this, C9068b.f59352q, 0), this.f67429U) : this.f67429U;
    }

    private Rect r(Rect rect) {
        if (this.f67441d != null) {
            Rect rect2 = this.f67465z0;
            boolean i10 = v.i(this);
            rect2.bottom = rect.bottom;
            int i11 = this.f67417O;
            if (i11 == 1) {
                rect2.left = I(rect.left, i10);
                rect2.top = rect.top + this.f67419P;
                rect2.right = J(rect.right, i10);
                return rect2;
            } else if (i11 != 2) {
                rect2.left = I(rect.left, i10);
                rect2.top = getPaddingTop();
                rect2.right = J(rect.right, i10);
                return rect2;
            } else {
                rect2.left = rect.left + this.f67441d.getPaddingLeft();
                rect2.top = rect.top - v();
                rect2.right = rect.right - this.f67441d.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private void r0() {
        C4600b0.t0(this.f67441d, getEditTextBoxBackground());
    }

    private int s(Rect rect, Rect rect2, float f10) {
        return T() ? (int) (((float) rect2.top) + f10) : rect.bottom - this.f67441d.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.f67441d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f67441d = editText;
            int i10 = this.f67443f;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f67445h);
            }
            int i11 = this.f67444g;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f67446i);
            }
            this.f67405I = false;
            W();
            setTextInputAccessibilityDelegate(new d(this));
            this.f67431V0.i0(this.f67441d.getTypeface());
            this.f67431V0.a0(this.f67441d.getTextSize());
            int i12 = Build.VERSION.SDK_INT;
            this.f67431V0.X(this.f67441d.getLetterSpacing());
            int gravity = this.f67441d.getGravity();
            this.f67431V0.S((gravity & -113) | 48);
            this.f67431V0.Z(gravity);
            this.f67428T0 = C4600b0.A(editText);
            this.f67441d.addTextChangedListener(new a(editText));
            if (this.f67406I0 == null) {
                this.f67406I0 = this.f67441d.getHintTextColors();
            }
            if (this.f67393C) {
                if (TextUtils.isEmpty(this.f67395D)) {
                    CharSequence hint = this.f67441d.getHint();
                    this.f67442e = hint;
                    setHint(hint);
                    this.f67441d.setHint((CharSequence) null);
                }
                this.f67397E = true;
            }
            if (i12 >= 29) {
                o0();
            }
            if (this.f67452o != null) {
                l0(this.f67441d.getText());
            }
            q0();
            this.f67447j.f();
            this.f67438b.bringToFront();
            this.f67440c.bringToFront();
            C();
            this.f67440c.x0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f67395D)) {
            this.f67395D = charSequence;
            this.f67431V0.g0(charSequence);
            if (!this.f67430U0) {
                X();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f67456s != z10) {
            if (z10) {
                j();
            } else {
                b0();
                this.f67457t = null;
            }
            this.f67456s = z10;
        }
    }

    private int t(Rect rect, float f10) {
        return T() ? (int) (((float) rect.centerY()) - (f10 / 2.0f)) : rect.top + this.f67441d.getCompoundPaddingTop();
    }

    private boolean t0() {
        int max;
        if (this.f67441d == null || this.f67441d.getMeasuredHeight() >= (max = Math.max(this.f67440c.getMeasuredHeight(), this.f67438b.getMeasuredHeight()))) {
            return false;
        }
        this.f67441d.setMinimumHeight(max);
        return true;
    }

    private Rect u(Rect rect) {
        if (this.f67441d != null) {
            Rect rect2 = this.f67465z0;
            float w10 = this.f67431V0.w();
            rect2.left = rect.left + this.f67441d.getCompoundPaddingLeft();
            rect2.top = t(rect, w10);
            rect2.right = rect.right - this.f67441d.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, w10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void u0() {
        if (this.f67417O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f67436a.getLayoutParams();
            int v10 = v();
            if (v10 != layoutParams.topMargin) {
                layoutParams.topMargin = v10;
                this.f67436a.requestLayout();
            }
        }
    }

    private int v() {
        float q10;
        if (!this.f67393C) {
            return 0;
        }
        int i10 = this.f67417O;
        if (i10 == 0) {
            q10 = this.f67431V0.q();
        } else if (i10 != 2) {
            return 0;
        } else {
            q10 = this.f67431V0.q() / 2.0f;
        }
        return (int) q10;
    }

    private boolean w() {
        return this.f67417O == 2 && x();
    }

    private void w0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f67441d;
        boolean z12 = false;
        boolean z13 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f67441d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f67406I0;
        if (colorStateList2 != null) {
            this.f67431V0.M(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f67406I0;
            this.f67431V0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f67426S0) : this.f67426S0));
        } else if (e0()) {
            this.f67431V0.M(this.f67447j.r());
        } else if (this.f67450m && (textView = this.f67452o) != null) {
            this.f67431V0.M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f67408J0) != null) {
            this.f67431V0.R(colorStateList);
        }
        if (z13 || !this.f67432W0 || (isEnabled() && z12)) {
            if (z11 || this.f67430U0) {
                z(z10);
            }
        } else if (z11 || !this.f67430U0) {
            F(z10);
        }
    }

    private boolean x() {
        return this.f67421Q > -1 && this.f67427T != 0;
    }

    private void x0() {
        EditText editText;
        if (this.f67457t != null && (editText = this.f67441d) != null) {
            this.f67457t.setGravity(editText.getGravity());
            this.f67457t.setPadding(this.f67441d.getCompoundPaddingLeft(), this.f67441d.getCompoundPaddingTop(), this.f67441d.getCompoundPaddingRight(), this.f67441d.getCompoundPaddingBottom());
        }
    }

    private void y() {
        if (B()) {
            ((h) this.f67399F).s0();
        }
    }

    private void y0() {
        EditText editText = this.f67441d;
        z0(editText == null ? null : editText.getText());
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.f67434Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f67434Y0.cancel();
        }
        if (!z10 || !this.f67433X0) {
            this.f67431V0.c0(1.0f);
        } else {
            l(1.0f);
        }
        this.f67430U0 = false;
        if (B()) {
            X();
        }
        y0();
        this.f67438b.l(false);
        this.f67440c.H(false);
    }

    /* access modifiers changed from: private */
    public void z0(Editable editable) {
        if (this.f67451n.a(editable) != 0 || this.f67430U0) {
            L();
        } else {
            h0();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f67441d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B0() {
        /*
            r5 = this;
            Ua.g r0 = r5.f67399F
            if (r0 == 0) goto L_0x00d0
            int r0 = r5.f67417O
            if (r0 != 0) goto L_0x000a
            goto L_0x00d0
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f67441d
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r5.f67441d
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r5.f67426S0
            r5.f67427T = r3
            goto L_0x007a
        L_0x003c:
            boolean r3 = r5.e0()
            if (r3 == 0) goto L_0x0051
            android.content.res.ColorStateList r3 = r5.f67416N0
            if (r3 == 0) goto L_0x004a
            r5.A0(r0, r1)
            goto L_0x007a
        L_0x004a:
            int r3 = r5.getErrorCurrentTextColors()
            r5.f67427T = r3
            goto L_0x007a
        L_0x0051:
            boolean r3 = r5.f67450m
            if (r3 == 0) goto L_0x0068
            android.widget.TextView r3 = r5.f67452o
            if (r3 == 0) goto L_0x0068
            android.content.res.ColorStateList r4 = r5.f67416N0
            if (r4 == 0) goto L_0x0061
            r5.A0(r0, r1)
            goto L_0x007a
        L_0x0061:
            int r3 = r3.getCurrentTextColor()
            r5.f67427T = r3
            goto L_0x007a
        L_0x0068:
            if (r0 == 0) goto L_0x006f
            int r3 = r5.f67414M0
            r5.f67427T = r3
            goto L_0x007a
        L_0x006f:
            if (r1 == 0) goto L_0x0076
            int r3 = r5.f67412L0
            r5.f67427T = r3
            goto L_0x007a
        L_0x0076:
            int r3 = r5.f67410K0
            r5.f67427T = r3
        L_0x007a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L_0x0083
            r5.o0()
        L_0x0083:
            com.google.android.material.textfield.EndCompoundLayout r3 = r5.f67440c
            r3.I()
            r5.a0()
            int r3 = r5.f67417O
            r4 = 2
            if (r3 != r4) goto L_0x00aa
            int r3 = r5.f67421Q
            if (r0 == 0) goto L_0x009f
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto L_0x009f
            int r4 = r5.f67425S
            r5.f67421Q = r4
            goto L_0x00a3
        L_0x009f:
            int r4 = r5.f67423R
            r5.f67421Q = r4
        L_0x00a3:
            int r4 = r5.f67421Q
            if (r4 == r3) goto L_0x00aa
            r5.Y()
        L_0x00aa:
            int r3 = r5.f67417O
            if (r3 != r2) goto L_0x00cd
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto L_0x00b9
            int r0 = r5.f67420P0
            r5.f67429U = r0
            goto L_0x00cd
        L_0x00b9:
            if (r1 == 0) goto L_0x00c2
            if (r0 != 0) goto L_0x00c2
            int r0 = r5.f67424R0
            r5.f67429U = r0
            goto L_0x00cd
        L_0x00c2:
            if (r0 == 0) goto L_0x00c9
            int r0 = r5.f67422Q0
            r5.f67429U = r0
            goto L_0x00cd
        L_0x00c9:
            int r0 = r5.f67418O0
            r5.f67429U = r0
        L_0x00cd:
            r5.m()
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.B0():void");
    }

    public boolean M() {
        return this.f67440c.F();
    }

    public boolean N() {
        return this.f67447j.A();
    }

    public boolean O() {
        return this.f67447j.B();
    }

    public boolean P() {
        return this.f67433X0;
    }

    /* access modifiers changed from: package-private */
    public final boolean Q() {
        return this.f67430U0;
    }

    public boolean S() {
        return this.f67397E;
    }

    public void a0() {
        this.f67438b.m();
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f67436a.addView(view, layoutParams2);
            this.f67436a.setLayoutParams(layoutParams);
            u0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d0(TextView textView, int i10) {
        try {
            i.p(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        i.p(textView, C9077k.f59594d);
        textView.setTextColor(C6012a.c(getContext(), C9069c.f59362a));
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f67441d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f67442e != null) {
            boolean z10 = this.f67397E;
            this.f67397E = false;
            CharSequence hint = editText.getHint();
            this.f67441d.setHint(this.f67442e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f67441d.setHint(hint);
                this.f67397E = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f67436a.getChildCount());
            for (int i11 = 0; i11 < this.f67436a.getChildCount(); i11++) {
                View childAt = this.f67436a.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f67441d) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f67437a1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f67437a1 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f67435Z0) {
            boolean z10 = true;
            this.f67435Z0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.b bVar = this.f67431V0;
            boolean f02 = bVar != null ? bVar.f0(drawableState) : false;
            if (this.f67441d != null) {
                if (!C4600b0.S(this) || !isEnabled()) {
                    z10 = false;
                }
                v0(z10);
            }
            q0();
            B0();
            if (f02) {
                invalidate();
            }
            this.f67435Z0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e0() {
        return this.f67447j.l();
    }

    public int getBaseline() {
        EditText editText = this.f67441d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C9286g getBoxBackground() {
        int i10 = this.f67417O;
        if (i10 == 1 || i10 == 2) {
            return this.f67399F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f67429U;
    }

    public int getBoxBackgroundMode() {
        return this.f67417O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f67419P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return v.i(this) ? this.f67411L.j().a(this.f67390A0) : this.f67411L.l().a(this.f67390A0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return v.i(this) ? this.f67411L.l().a(this.f67390A0) : this.f67411L.j().a(this.f67390A0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return v.i(this) ? this.f67411L.r().a(this.f67390A0) : this.f67411L.t().a(this.f67390A0);
    }

    public float getBoxCornerRadiusTopStart() {
        return v.i(this) ? this.f67411L.t().a(this.f67390A0) : this.f67411L.r().a(this.f67390A0);
    }

    public int getBoxStrokeColor() {
        return this.f67414M0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f67416N0;
    }

    public int getBoxStrokeWidth() {
        return this.f67423R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f67425S;
    }

    public int getCounterMaxLength() {
        return this.f67449l;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f67448k || !this.f67450m || (textView = this.f67452o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f67464z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f67462y;
    }

    public ColorStateList getCursorColor() {
        return this.f67389A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f67391B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f67406I0;
    }

    public EditText getEditText() {
        return this.f67441d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f67440c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f67440c.n();
    }

    public int getEndIconMinSize() {
        return this.f67440c.o();
    }

    public int getEndIconMode() {
        return this.f67440c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f67440c.q();
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f67440c.r();
    }

    public CharSequence getError() {
        if (this.f67447j.A()) {
            return this.f67447j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f67447j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f67447j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f67447j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f67440c.s();
    }

    public CharSequence getHelperText() {
        if (this.f67447j.B()) {
            return this.f67447j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f67447j.u();
    }

    public CharSequence getHint() {
        if (this.f67393C) {
            return this.f67395D;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f67431V0.q();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f67431V0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f67408J0;
    }

    public e getLengthCounter() {
        return this.f67451n;
    }

    public int getMaxEms() {
        return this.f67444g;
    }

    public int getMaxWidth() {
        return this.f67446i;
    }

    public int getMinEms() {
        return this.f67443f;
    }

    public int getMinWidth() {
        return this.f67445h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f67440c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f67440c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f67456s) {
            return this.f67455r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f67459v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f67458u;
    }

    public CharSequence getPrefixText() {
        return this.f67438b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f67438b.b();
    }

    public TextView getPrefixTextView() {
        return this.f67438b.d();
    }

    public k getShapeAppearanceModel() {
        return this.f67411L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f67438b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f67438b.f();
    }

    public int getStartIconMinSize() {
        return this.f67438b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f67438b.h();
    }

    public CharSequence getSuffixText() {
        return this.f67440c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f67440c.x();
    }

    public TextView getSuffixTextView() {
        return this.f67440c.z();
    }

    public Typeface getTypeface() {
        return this.f67392B0;
    }

    public void i(f fVar) {
        this.f67398E0.add(fVar);
        if (this.f67441d != null) {
            fVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(float f10) {
        if (this.f67431V0.x() != f10) {
            if (this.f67434Y0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f67434Y0 = valueAnimator;
                valueAnimator.setInterpolator(C9242i.g(getContext(), C9068b.f59312R, C9081a.f60372b));
                this.f67434Y0.setDuration((long) C9242i.f(getContext(), C9068b.f59305K, 167));
                this.f67434Y0.addUpdateListener(new c());
            }
            this.f67434Y0.setFloatValues(new float[]{this.f67431V0.x(), f10});
            this.f67434Y0.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void l0(Editable editable) {
        int a10 = this.f67451n.a(editable);
        boolean z10 = this.f67450m;
        int i10 = this.f67449l;
        if (i10 == -1) {
            this.f67452o.setText(String.valueOf(a10));
            this.f67452o.setContentDescription((CharSequence) null);
            this.f67450m = false;
        } else {
            this.f67450m = a10 > i10;
            m0(getContext(), this.f67452o, a10, this.f67449l, this.f67450m);
            if (z10 != this.f67450m) {
                n0();
            }
            this.f67452o.setText(G2.a.c().j(getContext().getString(C9076j.f59561d, new Object[]{Integer.valueOf(a10), Integer.valueOf(this.f67449l)})));
        }
        if (this.f67441d != null && z10 != this.f67450m) {
            v0(false);
            B0();
            q0();
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f67431V0.H(configuration);
    }

    public void onGlobalLayout() {
        this.f67440c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f67439b1 = false;
        boolean t02 = t0();
        boolean p02 = p0();
        if (t02 || p02) {
            this.f67441d.post(new y(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f67441d;
        if (editText != null) {
            Rect rect = this.f67463y0;
            com.google.android.material.internal.d.a(this, editText, rect);
            j0(rect);
            if (this.f67393C) {
                this.f67431V0.a0(this.f67441d.getTextSize());
                int gravity = this.f67441d.getGravity();
                this.f67431V0.S((gravity & -113) | 48);
                this.f67431V0.Z(gravity);
                this.f67431V0.O(r(rect));
                this.f67431V0.W(u(rect));
                this.f67431V0.J();
                if (B() && !this.f67430U0) {
                    X();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f67439b1) {
            this.f67440c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f67439b1 = true;
        }
        x0();
        this.f67440c.x0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f67472c);
        if (hVar.f67473d) {
            post(new b());
        }
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.f67413M) {
            float a10 = this.f67411L.r().a(this.f67390A0);
            float a11 = this.f67411L.t().a(this.f67390A0);
            float a12 = this.f67411L.j().a(this.f67390A0);
            float a13 = this.f67411L.l().a(this.f67390A0);
            C9283d q10 = this.f67411L.q();
            C9283d s10 = this.f67411L.s();
            k m10 = k.a().z(s10).D(q10).r(this.f67411L.k()).v(this.f67411L.i()).A(a11).E(a10).s(a13).w(a12).m();
            this.f67413M = z10;
            setShapeAppearanceModel(m10);
        }
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (e0()) {
            hVar.f67472c = getError();
        }
        hVar.f67473d = this.f67440c.E();
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean p0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f67441d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.g0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.StartCompoundLayout r0 = r10.f67438b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f67441d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f67394C0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f67396D0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f67394C0 = r6
            r10.f67396D0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f67441d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f67394C0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f67441d
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.i.j(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f67394C0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f67441d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            android.widget.EditText r6 = r10.f67441d
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.i.j(r6, r2, r7, r8, r0)
            r10.f67394C0 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.f0()
            if (r6 == 0) goto L_0x00d8
            com.google.android.material.textfield.EndCompoundLayout r2 = r10.f67440c
            android.widget.TextView r2 = r2.z()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f67441d
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.EndCompoundLayout r6 = r10.f67440c
            com.google.android.material.internal.CheckableImageButton r6 = r6.k()
            if (r6 == 0) goto L_0x0092
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = I2.C4638v.b(r6)
            int r2 = r2 + r6
        L_0x0092:
            android.widget.EditText r6 = r10.f67441d
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f67400F0
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.f67402G0
            if (r8 == r2) goto L_0x00b3
            r10.f67402G0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f67441d
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f67400F0
            r4 = r6[r4]
            androidx.core.widget.i.j(r0, r1, r2, r3, r4)
            goto L_0x00d6
        L_0x00b3:
            if (r7 != 0) goto L_0x00c1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f67400F0 = r7
            r10.f67402G0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00c1:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f67400F0
            if (r2 == r3) goto L_0x00d5
            r10.f67404H0 = r2
            android.widget.EditText r0 = r10.f67441d
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            androidx.core.widget.i.j(r0, r1, r2, r3, r4)
            goto L_0x00d6
        L_0x00d5:
            r5 = r0
        L_0x00d6:
            r0 = r5
            goto L_0x00fa
        L_0x00d8:
            android.graphics.drawable.Drawable r6 = r10.f67400F0
            if (r6 == 0) goto L_0x00fa
            android.widget.EditText r6 = r10.f67441d
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f67400F0
            if (r3 != r7) goto L_0x00f6
            android.widget.EditText r0 = r10.f67441d
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f67404H0
            r4 = r6[r4]
            androidx.core.widget.i.j(r0, r1, r3, r7, r4)
            goto L_0x00f7
        L_0x00f6:
            r5 = r0
        L_0x00f7:
            r10.f67400F0 = r2
            goto L_0x00d6
        L_0x00fa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f67441d;
        if (editText != null && this.f67417O == 0 && (background = editText.getBackground()) != null) {
            if (y.a(background)) {
                background = background.mutate();
            }
            if (e0()) {
                background.setColorFilter(C4993e.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f67450m || (textView = this.f67452o) == null) {
                C6260a.c(background);
                this.f67441d.refreshDrawableState();
            } else {
                background.setColorFilter(C4993e.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s0() {
        EditText editText = this.f67441d;
        if (editText != null && this.f67399F != null) {
            if ((this.f67405I || editText.getBackground() == null) && this.f67417O != 0) {
                r0();
                this.f67405I = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f67429U != i10) {
            this.f67429U = i10;
            this.f67418O0 = i10;
            this.f67422Q0 = i10;
            this.f67424R0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(C6012a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f67418O0 = defaultColor;
        this.f67429U = defaultColor;
        this.f67420P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f67422Q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f67424R0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.f67417O) {
            this.f67417O = i10;
            if (this.f67441d != null) {
                W();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f67419P = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f67411L = this.f67411L.v().y(i10, this.f67411L.r()).C(i10, this.f67411L.t()).q(i10, this.f67411L.j()).u(i10, this.f67411L.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f67414M0 != i10) {
            this.f67414M0 = i10;
            B0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f67410K0 = colorStateList.getDefaultColor();
            this.f67426S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f67412L0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f67414M0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f67414M0 != colorStateList.getDefaultColor()) {
            this.f67414M0 = colorStateList.getDefaultColor();
        }
        B0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f67416N0 != colorStateList) {
            this.f67416N0 = colorStateList;
            B0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f67423R = i10;
        B0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f67425S = i10;
        B0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f67448k != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f67452o = appCompatTextView;
                appCompatTextView.setId(C9072f.f59475R);
                Typeface typeface = this.f67392B0;
                if (typeface != null) {
                    this.f67452o.setTypeface(typeface);
                }
                this.f67452o.setMaxLines(1);
                this.f67447j.e(this.f67452o, 2);
                C4638v.d((ViewGroup.MarginLayoutParams) this.f67452o.getLayoutParams(), getResources().getDimensionPixelOffset(C9070d.f59441v0));
                n0();
                k0();
            } else {
                this.f67447j.C(this.f67452o, 2);
                this.f67452o = null;
            }
            this.f67448k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f67449l != i10) {
            if (i10 > 0) {
                this.f67449l = i10;
            } else {
                this.f67449l = -1;
            }
            if (this.f67448k) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f67453p != i10) {
            this.f67453p = i10;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f67464z != colorStateList) {
            this.f67464z = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f67454q != i10) {
            this.f67454q = i10;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f67462y != colorStateList) {
            this.f67462y = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f67389A != colorStateList) {
            this.f67389A = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f67391B != colorStateList) {
            this.f67391B = colorStateList;
            if (R()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f67406I0 = colorStateList;
        this.f67408J0 = colorStateList;
        if (this.f67441d != null) {
            v0(false);
        }
    }

    public void setEnabled(boolean z10) {
        Z(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f67440c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f67440c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f67440c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f67440c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f67440c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f67440c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f67440c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f67440c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f67440c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f67440c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f67440c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f67440c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f67447j.A()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f67447j.Q(charSequence);
        } else {
            this.f67447j.w();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f67447j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f67447j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f67447j.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f67440c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f67440c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f67440c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f67440c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f67440c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f67447j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f67447j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f67432W0 != z10) {
            this.f67432W0 = z10;
            v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f67447j.R(charSequence);
        } else if (O()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f67447j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f67447j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f67447j.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f67393C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.n.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f67433X0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f67393C) {
            this.f67393C = z10;
            if (!z10) {
                this.f67397E = false;
                if (!TextUtils.isEmpty(this.f67395D) && TextUtils.isEmpty(this.f67441d.getHint())) {
                    this.f67441d.setHint(this.f67395D);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f67441d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f67395D)) {
                        setHint(hint);
                    }
                    this.f67441d.setHint((CharSequence) null);
                }
                this.f67397E = true;
            }
            if (this.f67441d != null) {
                u0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f67431V0.P(i10);
        this.f67408J0 = this.f67431V0.p();
        if (this.f67441d != null) {
            v0(false);
            u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f67408J0 != colorStateList) {
            if (this.f67406I0 == null) {
                this.f67431V0.R(colorStateList);
            }
            this.f67408J0 = colorStateList;
            if (this.f67441d != null) {
                v0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f67451n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f67444g = i10;
        EditText editText = this.f67441d;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f67446i = i10;
        EditText editText = this.f67441d;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f67443f = i10;
        EditText editText = this.f67441d;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f67445h = i10;
        EditText editText = this.f67441d;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f67440c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f67440c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f67440c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f67440c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f67440c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f67457t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f67457t = appCompatTextView;
            appCompatTextView.setId(C9072f.f59478U);
            C4600b0.z0(this.f67457t, 2);
            C7017c A10 = A();
            this.f67460w = A10;
            A10.w0(67);
            this.f67461x = A();
            setPlaceholderTextAppearance(this.f67459v);
            setPlaceholderTextColor(this.f67458u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f67456s) {
                setPlaceholderTextEnabled(true);
            }
            this.f67455r = charSequence;
        }
        y0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f67459v = i10;
        TextView textView = this.f67457t;
        if (textView != null) {
            i.p(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f67458u != colorStateList) {
            this.f67458u = colorStateList;
            TextView textView = this.f67457t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f67438b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f67438b.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f67438b.p(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        C9286g gVar = this.f67399F;
        if (gVar != null && gVar.E() != kVar) {
            this.f67411L = kVar;
            m();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f67438b.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f67438b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f67438b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f67438b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f67438b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f67438b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f67438b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f67438b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f67440c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f67440c.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f67440c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f67441d;
        if (editText != null) {
            C4600b0.p0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f67392B0) {
            this.f67392B0 = typeface;
            this.f67431V0.i0(typeface);
            this.f67447j.N(typeface);
            TextView textView = this.f67452o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v0(boolean z10) {
        w0(z10, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59346m0);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f67440c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f67440c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f67440c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f67440c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f67440c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f67438b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f67438b.s(drawable);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f67387c1
            r1 = r17
            android.content.Context r1 = Xa.C9359a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f67443f = r10
            r0.f67444g = r10
            r0.f67445h = r10
            r0.f67446i = r10
            com.google.android.material.textfield.t r1 = new com.google.android.material.textfield.t
            r1.<init>(r0)
            r0.f67447j = r1
            com.google.android.material.textfield.z r1 = new com.google.android.material.textfield.z
            r1.<init>()
            r0.f67451n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f67463y0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f67465z0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f67390A0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f67398E0 = r1
            com.google.android.material.internal.b r1 = new com.google.android.material.internal.b
            r1.<init>(r0)
            r0.f67431V0 = r1
            r11 = 0
            r0.f67439b1 = r11
            android.content.Context r12 = r16.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f67436a = r14
            r14.setAddStatesFromChildren(r13)
            android.animation.TimeInterpolator r2 = Fa.C9081a.f60371a
            r1.h0(r2)
            r1.e0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.S(r2)
            int[] r3 = Ea.C9078l.f59954f8
            int r1 = Ea.C9078l.f59648C8
            int r2 = Ea.C9078l.f59626A8
            int r4 = Ea.C9078l.f59839U8
            int r5 = Ea.C9078l.f59889Z8
            int r6 = Ea.C9078l.f59933d9
            int[] r6 = new int[]{r1, r2, r4, r5, r6}
            r1 = r12
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.M r1 = com.google.android.material.internal.s.j(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.StartCompoundLayout r2 = new com.google.android.material.textfield.StartCompoundLayout
            r2.<init>(r0, r1)
            r0.f67438b = r2
            int r3 = Ea.C9078l.f59922c9
            boolean r3 = r1.a(r3, r13)
            r0.f67393C = r3
            int r3 = Ea.C9078l.f60009k8
            java.lang.CharSequence r3 = r1.p(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = Ea.C9078l.f59911b9
            boolean r3 = r1.a(r3, r13)
            r0.f67433X0 = r3
            int r3 = Ea.C9078l.f59859W8
            boolean r3 = r1.a(r3, r13)
            r0.f67432W0 = r3
            int r3 = Ea.C9078l.f60031m8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x00c8
            int r3 = Ea.C9078l.f60031m8
            int r3 = r1.k(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00d9
        L_0x00c8:
            int r3 = Ea.C9078l.f59998j8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x00d9
            int r3 = Ea.C9078l.f59998j8
            int r3 = r1.f(r3, r10)
            r0.setMinWidth(r3)
        L_0x00d9:
            int r3 = Ea.C9078l.f60020l8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x00eb
            int r3 = Ea.C9078l.f60020l8
            int r3 = r1.k(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x00fc
        L_0x00eb:
            int r3 = Ea.C9078l.f59987i8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x00fc
            int r3 = Ea.C9078l.f59987i8
            int r3 = r1.f(r3, r10)
            r0.setMaxWidth(r3)
        L_0x00fc:
            Ua.k$b r3 = Ua.k.e(r12, r7, r8, r9)
            Ua.k r3 = r3.m()
            r0.f67411L = r3
            android.content.res.Resources r3 = r12.getResources()
            int r4 = Ea.C9070d.f59435s0
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f67415N = r3
            int r3 = Ea.C9078l.f60064p8
            int r3 = r1.e(r3, r11)
            r0.f67419P = r3
            int r3 = Ea.C9078l.f60141w8
            android.content.res.Resources r4 = r12.getResources()
            int r5 = Ea.C9070d.f59437t0
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f67423R = r3
            int r3 = Ea.C9078l.f60152x8
            android.content.res.Resources r4 = r12.getResources()
            int r5 = Ea.C9070d.f59439u0
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f67425S = r3
            int r3 = r0.f67423R
            r0.f67421Q = r3
            int r3 = Ea.C9078l.f60108t8
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.d(r3, r4)
            int r5 = Ea.C9078l.f60097s8
            float r5 = r1.d(r5, r4)
            int r6 = Ea.C9078l.f60075q8
            float r6 = r1.d(r6, r4)
            int r7 = Ea.C9078l.f60086r8
            float r4 = r1.d(r7, r4)
            Ua.k r7 = r0.f67411L
            Ua.k$b r7 = r7.v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x016a
            r7.A(r3)
        L_0x016a:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0171
            r7.E(r5)
        L_0x0171:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0178
            r7.w(r6)
        L_0x0178:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x017f
            r7.s(r4)
        L_0x017f:
            Ua.k r3 = r7.m()
            r0.f67411L = r3
            int r3 = Ea.C9078l.f60042n8
            android.content.res.ColorStateList r3 = Ra.c.b(r12, r1, r3)
            if (r3 == 0) goto L_0x01e5
            int r4 = r3.getDefaultColor()
            r0.f67418O0 = r4
            r0.f67429U = r4
            boolean r4 = r3.isStateful()
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01c6
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f67420P0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r6 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f67422Q0 = r4
            int[] r4 = new int[]{r5, r6}
            int r3 = r3.getColorForState(r4, r10)
            r0.f67424R0 = r3
            goto L_0x01ef
        L_0x01c6:
            int r3 = r0.f67418O0
            r0.f67422Q0 = r3
            int r3 = Ea.C9069c.f59368g
            android.content.res.ColorStateList r3 = j.C5443a.a(r12, r3)
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f67420P0 = r4
            int[] r4 = new int[]{r5}
            int r3 = r3.getColorForState(r4, r10)
            r0.f67424R0 = r3
            goto L_0x01ef
        L_0x01e5:
            r0.f67429U = r11
            r0.f67418O0 = r11
            r0.f67420P0 = r11
            r0.f67422Q0 = r11
            r0.f67424R0 = r11
        L_0x01ef:
            int r3 = Ea.C9078l.f59976h8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x0201
            int r3 = Ea.C9078l.f59976h8
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f67408J0 = r3
            r0.f67406I0 = r3
        L_0x0201:
            int r3 = Ea.C9078l.f60119u8
            android.content.res.ColorStateList r3 = Ra.c.b(r12, r1, r3)
            int r4 = Ea.C9078l.f60119u8
            int r4 = r1.b(r4, r11)
            r0.f67414M0 = r4
            int r4 = Ea.C9069c.f59369h
            int r4 = u2.C6012a.c(r12, r4)
            r0.f67410K0 = r4
            int r4 = Ea.C9069c.f59370i
            int r4 = u2.C6012a.c(r12, r4)
            r0.f67426S0 = r4
            int r4 = Ea.C9069c.f59371j
            int r4 = u2.C6012a.c(r12, r4)
            r0.f67412L0 = r4
            if (r3 == 0) goto L_0x022c
            r0.setBoxStrokeColorStateList(r3)
        L_0x022c:
            int r3 = Ea.C9078l.f60130v8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x023d
            int r3 = Ea.C9078l.f60130v8
            android.content.res.ColorStateList r3 = Ra.c.b(r12, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x023d:
            int r3 = Ea.C9078l.f59933d9
            int r3 = r1.n(r3, r10)
            if (r3 == r10) goto L_0x024e
            int r3 = Ea.C9078l.f59933d9
            int r3 = r1.n(r3, r11)
            r0.setHintTextAppearance(r3)
        L_0x024e:
            int r3 = Ea.C9078l.f59670E8
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f67389A = r3
            int r3 = Ea.C9078l.f59681F8
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f67391B = r3
            int r3 = Ea.C9078l.f59839U8
            int r3 = r1.n(r3, r11)
            int r4 = Ea.C9078l.f59789P8
            java.lang.CharSequence r4 = r1.p(r4)
            int r5 = Ea.C9078l.f59779O8
            int r5 = r1.k(r5, r13)
            int r6 = Ea.C9078l.f59799Q8
            boolean r6 = r1.a(r6, r11)
            int r7 = Ea.C9078l.f59889Z8
            int r7 = r1.n(r7, r11)
            int r8 = Ea.C9078l.f59879Y8
            boolean r8 = r1.a(r8, r11)
            int r9 = Ea.C9078l.f59869X8
            java.lang.CharSequence r9 = r1.p(r9)
            int r12 = Ea.C9078l.f60021l9
            int r12 = r1.n(r12, r11)
            int r15 = Ea.C9078l.f60010k9
            java.lang.CharSequence r15 = r1.p(r15)
            int r13 = Ea.C9078l.f60163y8
            boolean r13 = r1.a(r13, r11)
            int r11 = Ea.C9078l.f60174z8
            int r10 = r1.k(r11, r10)
            r0.setCounterMaxLength(r10)
            int r10 = Ea.C9078l.f59648C8
            r11 = 0
            int r10 = r1.n(r10, r11)
            r0.f67454q = r10
            int r10 = Ea.C9078l.f59626A8
            int r10 = r1.n(r10, r11)
            r0.f67453p = r10
            int r10 = Ea.C9078l.f60053o8
            int r10 = r1.k(r10, r11)
            r0.setBoxBackgroundMode(r10)
            r0.setErrorContentDescription(r4)
            r0.setErrorAccessibilityLiveRegion(r5)
            int r4 = r0.f67453p
            r0.setCounterOverflowTextAppearance(r4)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.f67454q
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r15)
            r0.setPlaceholderTextAppearance(r12)
            int r3 = Ea.C9078l.f59849V8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x02ea
            int r3 = Ea.C9078l.f59849V8
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setErrorTextColor(r3)
        L_0x02ea:
            int r3 = Ea.C9078l.f59900a9
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x02fb
            int r3 = Ea.C9078l.f59900a9
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHelperTextColor(r3)
        L_0x02fb:
            int r3 = Ea.C9078l.f59944e9
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x030c
            int r3 = Ea.C9078l.f59944e9
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHintTextColor(r3)
        L_0x030c:
            int r3 = Ea.C9078l.f59659D8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x031d
            int r3 = Ea.C9078l.f59659D8
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterTextColor(r3)
        L_0x031d:
            int r3 = Ea.C9078l.f59637B8
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x032e
            int r3 = Ea.C9078l.f59637B8
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x032e:
            int r3 = Ea.C9078l.f60032m9
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x033f
            int r3 = Ea.C9078l.f60032m9
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x033f:
            com.google.android.material.textfield.EndCompoundLayout r3 = new com.google.android.material.textfield.EndCompoundLayout
            r3.<init>(r0, r1)
            r0.f67440c = r3
            int r4 = Ea.C9078l.f59965g8
            r5 = 1
            boolean r4 = r1.a(r4, r5)
            r1.x()
            r1 = 2
            I2.C4600b0.z0(r0, r1)
            I2.C4600b0.B0(r0, r5)
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r8)
            r0.setErrorEnabled(r6)
            r0.setCounterEnabled(r13)
            r0.setHelperText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
