package com.google.android.material.tabs;

import Ea.C9068b;
import Ea.C9074h;
import Ea.C9076j;
import Ea.C9077k;
import Ga.C9092a;
import Ga.C9094c;
import H2.h;
import I2.C4600b0;
import I2.M;
import J2.t;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.i;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.v;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import com.sugarcube.app.base.data.source.CatalogRepository;
import j.C5443a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import y2.C6260a;

@ViewPager.c
public class TabLayout extends HorizontalScrollView {

    /* renamed from: y0  reason: collision with root package name */
    private static final int f67234y0 = C9077k.f59604n;

    /* renamed from: z0  reason: collision with root package name */
    private static final H2.f<e> f67235z0 = new h(16);

    /* renamed from: A  reason: collision with root package name */
    int f67236A;

    /* renamed from: B  reason: collision with root package name */
    int f67237B;

    /* renamed from: C  reason: collision with root package name */
    int f67238C;

    /* renamed from: D  reason: collision with root package name */
    int f67239D;

    /* renamed from: E  reason: collision with root package name */
    boolean f67240E;

    /* renamed from: F  reason: collision with root package name */
    boolean f67241F;

    /* renamed from: G  reason: collision with root package name */
    int f67242G;

    /* renamed from: H  reason: collision with root package name */
    int f67243H;

    /* renamed from: I  reason: collision with root package name */
    boolean f67244I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public c f67245J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final TimeInterpolator f67246K;

    /* renamed from: L  reason: collision with root package name */
    private c f67247L;

    /* renamed from: M  reason: collision with root package name */
    private final ArrayList<c> f67248M;

    /* renamed from: N  reason: collision with root package name */
    private c f67249N;

    /* renamed from: O  reason: collision with root package name */
    private ValueAnimator f67250O;

    /* renamed from: P  reason: collision with root package name */
    ViewPager f67251P;

    /* renamed from: Q  reason: collision with root package name */
    private f f67252Q;

    /* renamed from: R  reason: collision with root package name */
    private b f67253R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f67254S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public int f67255T;

    /* renamed from: U  reason: collision with root package name */
    private final H2.f<TabView> f67256U;

    /* renamed from: a  reason: collision with root package name */
    int f67257a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<e> f67258b;

    /* renamed from: c  reason: collision with root package name */
    private e f67259c;

    /* renamed from: d  reason: collision with root package name */
    final SlidingTabIndicator f67260d;

    /* renamed from: e  reason: collision with root package name */
    int f67261e;

    /* renamed from: f  reason: collision with root package name */
    int f67262f;

    /* renamed from: g  reason: collision with root package name */
    int f67263g;

    /* renamed from: h  reason: collision with root package name */
    int f67264h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final int f67265i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final int f67266j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f67267k;

    /* renamed from: l  reason: collision with root package name */
    ColorStateList f67268l;

    /* renamed from: m  reason: collision with root package name */
    ColorStateList f67269m;

    /* renamed from: n  reason: collision with root package name */
    ColorStateList f67270n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f67271o;

    /* renamed from: p  reason: collision with root package name */
    private int f67272p;

    /* renamed from: q  reason: collision with root package name */
    PorterDuff.Mode f67273q;

    /* renamed from: r  reason: collision with root package name */
    float f67274r;

    /* renamed from: s  reason: collision with root package name */
    float f67275s;

    /* renamed from: t  reason: collision with root package name */
    float f67276t;

    /* renamed from: u  reason: collision with root package name */
    final int f67277u;

    /* renamed from: v  reason: collision with root package name */
    int f67278v;

    /* renamed from: w  reason: collision with root package name */
    private final int f67279w;

    /* renamed from: x  reason: collision with root package name */
    private final int f67280x;

    /* renamed from: y  reason: collision with root package name */
    private final int f67281y;

    /* renamed from: z  reason: collision with root package name */
    private int f67282z;

    class SlidingTabIndicator extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        ValueAnimator f67283a;

        /* renamed from: b  reason: collision with root package name */
        private int f67284b = -1;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f67286a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f67287b;

            a(View view, View view2) {
                this.f67286a = view;
                this.f67287b = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SlidingTabIndicator.this.j(this.f67286a, this.f67287b, valueAnimator.getAnimatedFraction());
            }
        }

        SlidingTabIndicator(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f67257a == -1) {
                tabLayout.f67257a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f67257a);
        }

        private void f(int i10) {
            if (TabLayout.this.f67255T == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                c e10 = TabLayout.this.f67245J;
                TabLayout tabLayout = TabLayout.this;
                e10.c(tabLayout, childAt, tabLayout.f67271o);
                TabLayout.this.f67257a = i10;
            }
        }

        /* access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f67271o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f67271o.getBounds().bottom);
            } else {
                c e10 = TabLayout.this.f67245J;
                TabLayout tabLayout = TabLayout.this;
                e10.d(tabLayout, view, view2, f10, tabLayout.f67271o);
            }
            C4600b0.f0(this);
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f67257a != i10) {
                View childAt = getChildAt(tabLayout.getSelectedTabPosition());
                View childAt2 = getChildAt(i10);
                if (childAt2 == null) {
                    g();
                    return;
                }
                TabLayout.this.f67257a = i10;
                a aVar = new a(childAt, childAt2);
                if (z10) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f67283a = valueAnimator;
                    valueAnimator.setInterpolator(TabLayout.this.f67246K);
                    valueAnimator.setDuration((long) i11);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.start();
                    return;
                }
                this.f67283a.removeAllUpdateListeners();
                this.f67283a.addUpdateListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f67283a;
            if (!(valueAnimator == null || !valueAnimator.isRunning() || TabLayout.this.f67257a == i10)) {
                this.f67283a.cancel();
            }
            k(true, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(Canvas canvas) {
            int i10;
            int height = TabLayout.this.f67271o.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f67271o.getIntrinsicHeight();
            }
            int i11 = TabLayout.this.f67238C;
            if (i11 == 0) {
                i10 = getHeight() - height;
                height = getHeight();
            } else if (i11 != 1) {
                i10 = 0;
                if (i11 != 2) {
                    height = i11 != 3 ? 0 : getHeight();
                }
            } else {
                i10 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            }
            if (TabLayout.this.f67271o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f67271o.getBounds();
                TabLayout.this.f67271o.setBounds(bounds.left, i10, bounds.right, height);
                TabLayout.this.f67271o.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, float f10) {
            TabLayout.this.f67257a = Math.round(((float) i10) + f10);
            ValueAnimator valueAnimator = this.f67283a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f67283a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        /* access modifiers changed from: package-private */
        public void i(int i10) {
            Rect bounds = TabLayout.this.f67271o.getBounds();
            TabLayout.this.f67271o.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f67283a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z10 = true;
                if (tabLayout.f67236A == 1 || tabLayout.f67239D == 2) {
                    int childCount = getChildCount();
                    int i12 = 0;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = getChildAt(i13);
                        if (childAt.getVisibility() == 0) {
                            i12 = Math.max(i12, childAt.getMeasuredWidth());
                        }
                    }
                    if (i12 > 0) {
                        if (i12 * childCount <= getMeasuredWidth() - (((int) v.d(getContext(), 16)) * 2)) {
                            boolean z11 = false;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                                if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i12;
                                    layoutParams.weight = 0.0f;
                                    z11 = true;
                                }
                            }
                            z10 = z11;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f67236A = 0;
                            tabLayout2.U(false);
                        }
                        if (z10) {
                            super.onMeasure(i10, i11);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public final class TabView extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private e f67289a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f67290b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f67291c;

        /* renamed from: d  reason: collision with root package name */
        private View f67292d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public C9092a f67293e;

        /* renamed from: f  reason: collision with root package name */
        private View f67294f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f67295g;

        /* renamed from: h  reason: collision with root package name */
        private ImageView f67296h;

        /* renamed from: i  reason: collision with root package name */
        private Drawable f67297i;

        /* renamed from: j  reason: collision with root package name */
        private int f67298j = 2;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f67300a;

            a(View view) {
                this.f67300a = view;
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f67300a.getVisibility() == 0) {
                    TabView.this.u(this.f67300a);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            w(context);
            C4600b0.F0(this, TabLayout.this.f67261e, TabLayout.this.f67262f, TabLayout.this.f67263g, TabLayout.this.f67264h);
            setGravity(17);
            setOrientation(TabLayout.this.f67240E ^ true ? 1 : 0);
            setClickable(true);
            C4600b0.G0(this, M.b(getContext(), CashAppPayProcessorActivity.RESULT_ERROR));
        }

        /* access modifiers changed from: private */
        public C9092a getBadge() {
            return this.f67293e;
        }

        /* access modifiers changed from: private */
        public C9092a getOrCreateBadge() {
            if (this.f67293e == null) {
                this.f67293e = C9092a.d(getContext());
            }
            t();
            C9092a aVar = this.f67293e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void h(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new a(view));
            }
        }

        private float i(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void j(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        private FrameLayout k() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        public void l(Canvas canvas) {
            Drawable drawable = this.f67297i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f67297i.draw(canvas);
            }
        }

        private FrameLayout m(View view) {
            if ((view == this.f67291c || view == this.f67290b) && C9094c.f60570a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        public boolean n() {
            return this.f67293e != null;
        }

        private void o() {
            ViewGroup viewGroup;
            if (C9094c.f60570a) {
                viewGroup = k();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C9074h.f59520d, viewGroup, false);
            this.f67291c = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void p() {
            ViewGroup viewGroup;
            if (C9094c.f60570a) {
                viewGroup = k();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C9074h.f59521e, viewGroup, false);
            this.f67290b = textView;
            viewGroup.addView(textView);
        }

        private void r(View view) {
            if (n() && view != null) {
                j(false);
                C9094c.a(this.f67293e, view, m(view));
                this.f67292d = view;
            }
        }

        private void s() {
            if (n()) {
                j(true);
                View view = this.f67292d;
                if (view != null) {
                    C9094c.b(this.f67293e, view);
                    this.f67292d = null;
                }
            }
        }

        private void t() {
            e eVar;
            e eVar2;
            if (n()) {
                if (this.f67294f != null) {
                    s();
                } else if (this.f67291c != null && (eVar2 = this.f67289a) != null && eVar2.g() != null) {
                    View view = this.f67292d;
                    ImageView imageView = this.f67291c;
                    if (view != imageView) {
                        s();
                        r(this.f67291c);
                        return;
                    }
                    u(imageView);
                } else if (this.f67290b == null || (eVar = this.f67289a) == null || eVar.j() != 1) {
                    s();
                } else {
                    View view2 = this.f67292d;
                    TextView textView = this.f67290b;
                    if (view2 != textView) {
                        s();
                        r(this.f67290b);
                        return;
                    }
                    u(textView);
                }
            }
        }

        /* access modifiers changed from: private */
        public void u(View view) {
            if (n() && view == this.f67292d) {
                C9094c.c(this.f67293e, view, m(view));
            }
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void w(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f67277u
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = j.C5443a.b(r6, r0)
                r5.f67297i = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f67297i
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f67297i = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f67270n
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f67270n
                android.content.res.ColorStateList r2 = Sa.C9270b.a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f67244I
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                I2.C4600b0.t0(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.w(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            if (com.google.android.material.tabs.TabLayout.e.b(r7.f67289a) == 1) goto L_0x0061;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void z(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$e r0 = r7.f67289a
                r1 = 0
                if (r0 == 0) goto L_0x001a
                android.graphics.drawable.Drawable r0 = r0.g()
                if (r0 == 0) goto L_0x001a
                com.google.android.material.tabs.TabLayout$e r0 = r7.f67289a
                android.graphics.drawable.Drawable r0 = r0.g()
                android.graphics.drawable.Drawable r0 = y2.C6260a.r(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x001b
            L_0x001a:
                r0 = r1
            L_0x001b:
                if (r0 == 0) goto L_0x002d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f67269m
                y2.C6260a.o(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f67273q
                if (r2 == 0) goto L_0x002d
                y2.C6260a.p(r0, r2)
            L_0x002d:
                com.google.android.material.tabs.TabLayout$e r2 = r7.f67289a
                if (r2 == 0) goto L_0x0036
                java.lang.CharSequence r2 = r2.l()
                goto L_0x0037
            L_0x0036:
                r2 = r1
            L_0x0037:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L_0x004e
                if (r0 == 0) goto L_0x0048
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L_0x004e
            L_0x0048:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L_0x004e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L_0x0077
                if (r0 != 0) goto L_0x0060
                com.google.android.material.tabs.TabLayout$e r5 = r7.f67289a
                int r5 = r5.f67311g
                r6 = 1
                if (r5 != r6) goto L_0x0060
                goto L_0x0061
            L_0x0060:
                r6 = r4
            L_0x0061:
                if (r0 != 0) goto L_0x0065
                r5 = r2
                goto L_0x0066
            L_0x0065:
                r5 = r1
            L_0x0066:
                r8.setText(r5)
                if (r6 == 0) goto L_0x006d
                r5 = r4
                goto L_0x006e
            L_0x006d:
                r5 = r3
            L_0x006e:
                r8.setVisibility(r5)
                if (r0 != 0) goto L_0x0078
                r7.setVisibility(r4)
                goto L_0x0078
            L_0x0077:
                r6 = r4
            L_0x0078:
                if (r10 == 0) goto L_0x00bc
                if (r9 == 0) goto L_0x00bc
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L_0x0094
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L_0x0094
                android.content.Context r10 = r7.getContext()
                float r10 = com.google.android.material.internal.v.d(r10, r3)
                int r10 = (int) r10
                goto L_0x0095
            L_0x0094:
                r10 = r4
            L_0x0095:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.f67240E
                if (r3 == 0) goto L_0x00ad
                int r3 = I2.C4638v.a(r8)
                if (r10 == r3) goto L_0x00bc
                I2.C4638v.c(r8, r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto L_0x00bc
            L_0x00ad:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto L_0x00bc
                r8.bottomMargin = r10
                I2.C4638v.c(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            L_0x00bc:
                com.google.android.material.tabs.TabLayout$e r8 = r7.f67289a
                if (r8 == 0) goto L_0x00c4
                java.lang.CharSequence r1 = r8.f67308d
            L_0x00c4:
                if (r0 != 0) goto L_0x00c7
                goto L_0x00c8
            L_0x00c7:
                r2 = r1
            L_0x00c8:
                androidx.appcompat.widget.S.a(r7, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.z(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f67297i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f67297i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f67290b, this.f67291c, this.f67294f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        /* access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f67290b, this.f67291c, this.f67294f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public e getTab() {
            return this.f67289a;
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            t a12 = t.a1(accessibilityNodeInfo);
            C9092a aVar = this.f67293e;
            if (aVar != null && aVar.isVisible()) {
                a12.m0(this.f67293e.h());
            }
            a12.l0(t.f.a(0, 1, this.f67289a.i(), 1, false, isSelected()));
            if (isSelected()) {
                a12.j0(false);
                a12.a0(t.a.f8838i);
            }
            a12.J0(getResources().getString(C9076j.f59565h));
        }

        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f67278v, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f67290b != null) {
                float f10 = TabLayout.this.f67274r;
                int i12 = this.f67298j;
                ImageView imageView = this.f67291c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f67290b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f67276t;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f67290b.getTextSize();
                int lineCount = this.f67290b.getLineCount();
                int d10 = i.d(this.f67290b);
                int i13 = (f10 > textSize ? 1 : (f10 == textSize ? 0 : -1));
                if (i13 == 0 && (d10 < 0 || i12 == d10)) {
                    return;
                }
                if (TabLayout.this.f67239D != 1 || i13 <= 0 || lineCount != 1 || ((layout = this.f67290b.getLayout()) != null && i(layout, 0, f10) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                    this.f67290b.setTextSize(0, f10);
                    this.f67290b.setMaxLines(i12);
                    super.onMeasure(i10, i11);
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f67289a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f67289a.o();
            return true;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            setTab((e) null);
            setSelected(false);
        }

        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f67290b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f67291c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f67294f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(e eVar) {
            if (eVar != this.f67289a) {
                this.f67289a = eVar;
                v();
            }
        }

        /* access modifiers changed from: package-private */
        public final void v() {
            y();
            e eVar = this.f67289a;
            setSelected(eVar != null && eVar.m());
        }

        /* access modifiers changed from: package-private */
        public final void x() {
            setOrientation(TabLayout.this.f67240E ^ true ? 1 : 0);
            TextView textView = this.f67295g;
            if (textView == null && this.f67296h == null) {
                z(this.f67290b, this.f67291c, true);
            } else {
                z(textView, this.f67296h, false);
            }
        }

        /* access modifiers changed from: package-private */
        public final void y() {
            ViewParent parent;
            e eVar = this.f67289a;
            View f10 = eVar != null ? eVar.f() : null;
            if (f10 != null) {
                ViewParent parent2 = f10.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(f10);
                    }
                    View view = this.f67294f;
                    if (!(view == null || (parent = view.getParent()) == null)) {
                        ((ViewGroup) parent).removeView(this.f67294f);
                    }
                    addView(f10);
                }
                this.f67294f = f10;
                TextView textView = this.f67290b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f67291c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f67291c.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) f10.findViewById(16908308);
                this.f67295g = textView2;
                if (textView2 != null) {
                    this.f67298j = i.d(textView2);
                }
                this.f67296h = (ImageView) f10.findViewById(16908294);
            } else {
                View view2 = this.f67294f;
                if (view2 != null) {
                    removeView(view2);
                    this.f67294f = null;
                }
                this.f67295g = null;
                this.f67296h = null;
            }
            if (this.f67294f == null) {
                if (this.f67291c == null) {
                    o();
                }
                if (this.f67290b == null) {
                    p();
                    this.f67298j = i.d(this.f67290b);
                }
                i.p(this.f67290b, TabLayout.this.f67265i);
                if (!isSelected() || TabLayout.this.f67267k == -1) {
                    i.p(this.f67290b, TabLayout.this.f67266j);
                } else {
                    i.p(this.f67290b, TabLayout.this.f67267k);
                }
                ColorStateList colorStateList = TabLayout.this.f67268l;
                if (colorStateList != null) {
                    this.f67290b.setTextColor(colorStateList);
                }
                z(this.f67290b, this.f67291c, true);
                t();
                h(this.f67291c);
                h(this.f67290b);
            } else {
                TextView textView3 = this.f67295g;
                if (!(textView3 == null && this.f67296h == null)) {
                    z(textView3, this.f67296h, false);
                }
            }
            if (eVar != null && !TextUtils.isEmpty(eVar.f67308d)) {
                setContentDescription(eVar.f67308d);
            }
        }
    }

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f67303a;

        b() {
        }

        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f67251P == viewPager) {
                tabLayout.M(aVar2, this.f67303a);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
            this.f67303a = z10;
        }
    }

    @Deprecated
    public interface c<T extends e> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public interface d extends c<e> {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private Object f67305a;

        /* renamed from: b  reason: collision with root package name */
        private Drawable f67306b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f67307c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f67308d;

        /* renamed from: e  reason: collision with root package name */
        private int f67309e = -1;

        /* renamed from: f  reason: collision with root package name */
        private View f67310f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f67311g = 1;

        /* renamed from: h  reason: collision with root package name */
        public TabLayout f67312h;

        /* renamed from: i  reason: collision with root package name */
        public TabView f67313i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f67314j = -1;

        public C9092a e() {
            return this.f67313i.getBadge();
        }

        public View f() {
            return this.f67310f;
        }

        public Drawable g() {
            return this.f67306b;
        }

        public C9092a h() {
            return this.f67313i.getOrCreateBadge();
        }

        public int i() {
            return this.f67309e;
        }

        public int j() {
            return this.f67311g;
        }

        public Object k() {
            return this.f67305a;
        }

        public CharSequence l() {
            return this.f67307c;
        }

        public boolean m() {
            TabLayout tabLayout = this.f67312h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.f67309e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public void n() {
            this.f67312h = null;
            this.f67313i = null;
            this.f67305a = null;
            this.f67306b = null;
            this.f67314j = -1;
            this.f67307c = null;
            this.f67308d = null;
            this.f67309e = -1;
            this.f67310f = null;
        }

        public void o() {
            TabLayout tabLayout = this.f67312h;
            if (tabLayout != null) {
                tabLayout.K(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public e p(CharSequence charSequence) {
            this.f67308d = charSequence;
            w();
            return this;
        }

        public e q(int i10) {
            return r(LayoutInflater.from(this.f67313i.getContext()).inflate(i10, this.f67313i, false));
        }

        public e r(View view) {
            this.f67310f = view;
            w();
            return this;
        }

        public e s(Drawable drawable) {
            this.f67306b = drawable;
            TabLayout tabLayout = this.f67312h;
            if (tabLayout.f67236A == 1 || tabLayout.f67239D == 2) {
                tabLayout.U(true);
            }
            w();
            if (C9094c.f60570a && this.f67313i.n() && this.f67313i.f67293e.isVisible()) {
                this.f67313i.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public void t(int i10) {
            this.f67309e = i10;
        }

        public e u(Object obj) {
            this.f67305a = obj;
            return this;
        }

        public e v(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f67308d) && !TextUtils.isEmpty(charSequence)) {
                this.f67313i.setContentDescription(charSequence);
            }
            this.f67307c = charSequence;
            w();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void w() {
            TabView tabView = this.f67313i;
            if (tabView != null) {
                tabView.v();
            }
        }
    }

    public static class f implements ViewPager.g {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabLayout> f67315a;

        /* renamed from: b  reason: collision with root package name */
        private int f67316b;

        /* renamed from: c  reason: collision with root package name */
        private int f67317c;

        public f(TabLayout tabLayout) {
            this.f67315a = new WeakReference<>(tabLayout);
        }

        public void a(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f67315a.get();
            if (tabLayout != null) {
                int i12 = this.f67317c;
                tabLayout.P(i10, f10, i12 != 2 || this.f67316b == 1, (i12 == 2 && this.f67316b == 0) ? false : true, false);
            }
        }

        public void b(int i10) {
            this.f67316b = this.f67317c;
            this.f67317c = i10;
            TabLayout tabLayout = this.f67315a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f67317c);
            }
        }

        public void c(int i10) {
            TabLayout tabLayout = this.f67315a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f67317c;
                tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f67316b == 0));
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f67317c = 0;
            this.f67316b = 0;
        }
    }

    public static class g implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f67318a;

        public g(ViewPager viewPager) {
            this.f67318a = viewPager;
        }

        public void a(e eVar) {
            this.f67318a.setCurrentItem(eVar.i());
        }

        public void b(e eVar) {
        }

        public void c(e eVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59338i0);
    }

    private void A() {
        if (this.f67250O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f67250O = valueAnimator;
            valueAnimator.setInterpolator(this.f67246K);
            this.f67250O.setDuration((long) this.f67237B);
            this.f67250O.addUpdateListener(new a());
        }
    }

    private boolean C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void J(int i10) {
        TabView tabView = (TabView) this.f67260d.getChildAt(i10);
        this.f67260d.removeViewAt(i10);
        if (tabView != null) {
            tabView.q();
            this.f67256U.a(tabView);
        }
        requestLayout();
    }

    private void R(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f67251P;
        if (viewPager2 != null) {
            f fVar = this.f67252Q;
            if (fVar != null) {
                viewPager2.B(fVar);
            }
            b bVar = this.f67253R;
            if (bVar != null) {
                this.f67251P.A(bVar);
            }
        }
        c cVar = this.f67249N;
        if (cVar != null) {
            I(cVar);
            this.f67249N = null;
        }
        if (viewPager != null) {
            this.f67251P = viewPager;
            if (this.f67252Q == null) {
                this.f67252Q = new f(this);
            }
            this.f67252Q.d();
            viewPager.b(this.f67252Q);
            g gVar = new g(viewPager);
            this.f67249N = gVar;
            g(gVar);
            viewPager.getAdapter();
            if (this.f67253R == null) {
                this.f67253R = new b();
            }
            this.f67253R.b(z10);
            viewPager.a(this.f67253R);
            N(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f67251P = null;
            M((androidx.viewpager.widget.a) null, false);
        }
        this.f67254S = z11;
    }

    private void S() {
        int size = this.f67258b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f67258b.get(i10).w();
        }
    }

    private void T(LinearLayout.LayoutParams layoutParams) {
        if (this.f67239D == 1 && this.f67236A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.f67258b.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            e eVar = this.f67258b.get(i10);
            if (eVar == null || eVar.g() == null || TextUtils.isEmpty(eVar.l())) {
                i10++;
            } else if (!this.f67240E) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f67279w;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f67239D;
        if (i11 == 0 || i11 == 2) {
            return this.f67281y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f67260d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void l(TabItem tabItem) {
        e E10 = E();
        CharSequence charSequence = tabItem.f67231a;
        if (charSequence != null) {
            E10.v(charSequence);
        }
        Drawable drawable = tabItem.f67232b;
        if (drawable != null) {
            E10.s(drawable);
        }
        int i10 = tabItem.f67233c;
        if (i10 != 0) {
            E10.q(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            E10.p(tabItem.getContentDescription());
        }
        i(E10);
    }

    private void m(e eVar) {
        TabView tabView = eVar.f67313i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f67260d.addView(tabView, eVar.i(), u());
    }

    private void n(View view) {
        if (view instanceof TabItem) {
            l((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void o(int i10) {
        if (i10 != -1) {
            if (getWindowToken() == null || !C4600b0.S(this) || this.f67260d.d()) {
                N(i10, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int r10 = r(i10, 0.0f);
            if (scrollX != r10) {
                A();
                this.f67250O.setIntValues(new int[]{scrollX, r10});
                this.f67250O.start();
            }
            this.f67260d.c(i10, this.f67237B);
        }
    }

    private void p(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f67260d.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f67260d.setGravity(8388611);
    }

    private void q() {
        int i10 = this.f67239D;
        C4600b0.F0(this.f67260d, (i10 == 0 || i10 == 2) ? Math.max(0, this.f67282z - this.f67261e) : 0, 0, 0, 0);
        int i11 = this.f67239D;
        if (i11 == 0) {
            p(this.f67236A);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f67236A == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f67260d.setGravity(1);
        }
        U(true);
    }

    private int r(int i10, float f10) {
        View childAt;
        int i11 = this.f67239D;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f67260d.getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        View childAt2 = i13 < this.f67260d.getChildCount() ? this.f67260d.getChildAt(i13) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i12 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i14 = (int) (((float) (width + i12)) * 0.5f * f10);
        return C4600b0.z(this) == 0 ? left + i14 : left - i14;
    }

    private void s(e eVar, int i10) {
        eVar.t(i10);
        this.f67258b.add(i10, eVar);
        int size = this.f67258b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (this.f67258b.get(i12).i() == this.f67257a) {
                i11 = i12;
            }
            this.f67258b.get(i12).t(i12);
        }
        this.f67257a = i11;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f67260d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f67260d.getChildAt(i11);
                boolean z10 = true;
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    if (i11 != i10) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                } else {
                    childAt.setSelected(i11 == i10);
                    if (i11 != i10) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).y();
                    }
                }
                i11++;
            }
        }
    }

    private static ColorStateList t(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        T(layoutParams);
        return layoutParams;
    }

    private TabView w(e eVar) {
        H2.f<TabView> fVar = this.f67256U;
        TabView b10 = fVar != null ? fVar.b() : null;
        if (b10 == null) {
            b10 = new TabView(getContext());
        }
        b10.setTab(eVar);
        b10.setFocusable(true);
        b10.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(eVar.f67308d)) {
            b10.setContentDescription(eVar.f67307c);
        } else {
            b10.setContentDescription(eVar.f67308d);
        }
        return b10;
    }

    private void x(e eVar) {
        for (int size = this.f67248M.size() - 1; size >= 0; size--) {
            this.f67248M.get(size).c(eVar);
        }
    }

    private void y(e eVar) {
        for (int size = this.f67248M.size() - 1; size >= 0; size--) {
            this.f67248M.get(size).a(eVar);
        }
    }

    private void z(e eVar) {
        for (int size = this.f67248M.size() - 1; size >= 0; size--) {
            this.f67248M.get(size).b(eVar);
        }
    }

    public e B(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f67258b.get(i10);
    }

    public boolean D() {
        return this.f67241F;
    }

    public e E() {
        e v10 = v();
        v10.f67312h = this;
        v10.f67313i = w(v10);
        if (v10.f67314j != -1) {
            v10.f67313i.setId(v10.f67314j);
        }
        return v10;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        H();
    }

    /* access modifiers changed from: protected */
    public boolean G(e eVar) {
        return f67235z0.a(eVar);
    }

    public void H() {
        for (int childCount = this.f67260d.getChildCount() - 1; childCount >= 0; childCount--) {
            J(childCount);
        }
        Iterator<e> it = this.f67258b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            it.remove();
            next.n();
            G(next);
        }
        this.f67259c = null;
    }

    @Deprecated
    public void I(c cVar) {
        this.f67248M.remove(cVar);
    }

    public void K(e eVar) {
        L(eVar, true);
    }

    public void L(e eVar, boolean z10) {
        e eVar2 = this.f67259c;
        if (eVar2 != eVar) {
            int i10 = eVar != null ? eVar.i() : -1;
            if (z10) {
                if ((eVar2 == null || eVar2.i() == -1) && i10 != -1) {
                    N(i10, 0.0f, true);
                } else {
                    o(i10);
                }
                if (i10 != -1) {
                    setSelectedTabView(i10);
                }
            }
            this.f67259c = eVar;
            if (!(eVar2 == null || eVar2.f67312h == null)) {
                z(eVar2);
            }
            if (eVar != null) {
                y(eVar);
            }
        } else if (eVar2 != null) {
            x(eVar);
            o(eVar.i());
        }
    }

    /* access modifiers changed from: package-private */
    public void M(androidx.viewpager.widget.a aVar, boolean z10) {
        F();
    }

    public void N(int i10, float f10, boolean z10) {
        O(i10, f10, z10, true);
    }

    public void O(int i10, float f10, boolean z10, boolean z11) {
        P(i10, f10, z10, z11, true);
    }

    /* access modifiers changed from: package-private */
    public void P(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int round = Math.round(((float) i10) + f10);
        if (round >= 0 && round < this.f67260d.getChildCount()) {
            if (z11) {
                this.f67260d.h(i10, f10);
            }
            ValueAnimator valueAnimator = this.f67250O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f67250O.cancel();
            }
            int r10 = r(i10, f10);
            int scrollX = getScrollX();
            boolean z13 = (i10 < getSelectedTabPosition() && r10 >= scrollX) || (i10 > getSelectedTabPosition() && r10 <= scrollX) || i10 == getSelectedTabPosition();
            if (C4600b0.z(this) == 1) {
                z13 = (i10 < getSelectedTabPosition() && r10 <= scrollX) || (i10 > getSelectedTabPosition() && r10 >= scrollX) || i10 == getSelectedTabPosition();
            }
            if (z13 || this.f67255T == 1 || z12) {
                if (i10 < 0) {
                    r10 = 0;
                }
                scrollTo(r10, 0);
            }
            if (z10) {
                setSelectedTabView(round);
            }
        }
    }

    public void Q(ViewPager viewPager, boolean z10) {
        R(viewPager, z10, false);
    }

    /* access modifiers changed from: package-private */
    public void U(boolean z10) {
        for (int i10 = 0; i10 < this.f67260d.getChildCount(); i10++) {
            View childAt = this.f67260d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            T((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i10) {
        this.f67255T = i10;
    }

    public void addView(View view) {
        n(view);
    }

    @Deprecated
    public void g(c cVar) {
        if (!this.f67248M.contains(cVar)) {
            this.f67248M.add(cVar);
        }
    }

    public int getSelectedTabPosition() {
        e eVar = this.f67259c;
        if (eVar != null) {
            return eVar.i();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f67258b.size();
    }

    public int getTabGravity() {
        return this.f67236A;
    }

    public ColorStateList getTabIconTint() {
        return this.f67269m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f67243H;
    }

    public int getTabIndicatorGravity() {
        return this.f67238C;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f67278v;
    }

    public int getTabMode() {
        return this.f67239D;
    }

    public ColorStateList getTabRippleColor() {
        return this.f67270n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f67271o;
    }

    public ColorStateList getTabTextColors() {
        return this.f67268l;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(e eVar) {
        k(eVar, this.f67258b.isEmpty());
    }

    public void j(e eVar, int i10, boolean z10) {
        if (eVar.f67312h == this) {
            s(eVar, i10);
            m(eVar);
            if (z10) {
                eVar.o();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void k(e eVar, boolean z10) {
        j(eVar, this.f67258b.size(), z10);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ua.h.e(this);
        if (this.f67251P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                R((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f67254S) {
            setupWithViewPager((ViewPager) null);
            this.f67254S = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f67260d.getChildCount(); i10++) {
            View childAt = this.f67260d.getChildAt(i10);
            if (childAt instanceof TabView) {
                ((TabView) childAt).l(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.a1(accessibilityNodeInfo).k0(t.e.b(1, getTabCount(), false, 1));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int round = Math.round(v.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), CatalogRepository.FETCH_FLAG_SDB);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int i12 = this.f67280x;
            if (i12 <= 0) {
                i12 = (int) (((float) size) - v.d(getContext(), 56));
            }
            this.f67278v = i12;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i13 = this.f67239D;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), CatalogRepository.FETCH_FLAG_SDB), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                } else if (i13 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), CatalogRepository.FETCH_FLAG_SDB), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        Ua.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f67240E != z10) {
            this.f67240E = z10;
            for (int i10 = 0; i10 < this.f67260d.getChildCount(); i10++) {
                View childAt = this.f67260d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).x();
                }
            }
            q();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.f67250O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = C6260a.r(drawable).mutate();
        this.f67271o = mutate;
        com.google.android.material.drawable.d.k(mutate, this.f67272p);
        int i10 = this.f67242G;
        if (i10 == -1) {
            i10 = this.f67271o.getIntrinsicHeight();
        }
        this.f67260d.i(i10);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f67272p = i10;
        com.google.android.material.drawable.d.k(this.f67271o, i10);
        U(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f67238C != i10) {
            this.f67238C = i10;
            C4600b0.f0(this.f67260d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f67242G = i10;
        this.f67260d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f67236A != i10) {
            this.f67236A = i10;
            q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f67269m != colorStateList) {
            this.f67269m = colorStateList;
            S();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(C5443a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f67243H = i10;
        if (i10 == 0) {
            this.f67245J = new c();
        } else if (i10 == 1) {
            this.f67245J = new a();
        } else if (i10 == 2) {
            this.f67245J = new b();
        } else {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f67241F = z10;
        this.f67260d.g();
        C4600b0.f0(this.f67260d);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f67239D) {
            this.f67239D = i10;
            q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f67270n != colorStateList) {
            this.f67270n = colorStateList;
            for (int i10 = 0; i10 < this.f67260d.getChildCount(); i10++) {
                View childAt = this.f67260d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).w(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(C5443a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f67268l != colorStateList) {
            this.f67268l = colorStateList;
            S();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        M(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f67244I != z10) {
            this.f67244I = z10;
            for (int i10 = 0; i10 < this.f67260d.getChildCount(); i10++) {
                View childAt = this.f67260d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).w(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        Q(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* access modifiers changed from: protected */
    public e v() {
        e b10 = f67235z0.b();
        return b10 == null ? new e() : b10;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f67234y0
            android.content.Context r10 = Xa.C9359a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f67257a = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f67258b = r0
            r9.f67267k = r10
            r6 = 0
            r9.f67272p = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            r9.f67278v = r0
            r9.f67242G = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f67248M = r0
            H2.g r0 = new H2.g
            r1 = 12
            r0.<init>(r1)
            r9.f67256U = r0
            android.content.Context r7 = r9.getContext()
            r9.setHorizontalScrollBarEnabled(r6)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r8 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator
            r8.<init>(r7)
            r9.f67260d = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r10)
            super.addView(r8, r6, r0)
            int[] r2 = Ea.C9078l.f60041n7
            int r0 = Ea.C9078l.f59757M7
            int[] r5 = new int[]{r0}
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.content.res.ColorStateList r12 = com.google.android.material.drawable.d.f(r12)
            if (r12 == 0) goto L_0x0074
            Ua.g r0 = new Ua.g
            r0.<init>()
            r0.b0(r12)
            r0.Q(r7)
            float r12 = I2.C4600b0.u(r9)
            r0.a0(r12)
            I2.C4600b0.t0(r9, r0)
        L_0x0074:
            int r12 = Ea.C9078l.f60107t7
            android.graphics.drawable.Drawable r12 = Ra.c.d(r7, r11, r12)
            r9.setSelectedTabIndicator((android.graphics.drawable.Drawable) r12)
            int r12 = Ea.C9078l.f60140w7
            int r12 = r11.getColor(r12, r6)
            r9.setSelectedTabIndicatorColor(r12)
            int r12 = Ea.C9078l.f60173z7
            int r12 = r11.getDimensionPixelSize(r12, r10)
            r8.i(r12)
            int r12 = Ea.C9078l.f60162y7
            int r12 = r11.getInt(r12, r6)
            r9.setSelectedTabIndicatorGravity(r12)
            int r12 = Ea.C9078l.f60129v7
            int r12 = r11.getInt(r12, r6)
            r9.setTabIndicatorAnimationMode(r12)
            int r12 = Ea.C9078l.f60151x7
            r0 = 1
            boolean r12 = r11.getBoolean(r12, r0)
            r9.setTabIndicatorFullWidth(r12)
            int r12 = Ea.C9078l.f59669E7
            int r12 = r11.getDimensionPixelSize(r12, r6)
            r9.f67264h = r12
            r9.f67263g = r12
            r9.f67262f = r12
            r9.f67261e = r12
            int r1 = Ea.C9078l.f59702H7
            int r12 = r11.getDimensionPixelSize(r1, r12)
            r9.f67261e = r12
            int r12 = Ea.C9078l.f59713I7
            int r1 = r9.f67262f
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.f67262f = r12
            int r12 = Ea.C9078l.f59691G7
            int r1 = r9.f67263g
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.f67263g = r12
            int r12 = Ea.C9078l.f59680F7
            int r1 = r9.f67264h
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.f67264h = r12
            boolean r12 = com.google.android.material.internal.s.g(r7)
            if (r12 == 0) goto L_0x00ea
            int r12 = Ea.C9068b.f59344l0
            r9.f67265i = r12
            goto L_0x00ee
        L_0x00ea:
            int r12 = Ea.C9068b.f59340j0
            r9.f67265i = r12
        L_0x00ee:
            int r12 = Ea.C9078l.f59757M7
            int r1 = Ea.C9077k.f59595e
            int r12 = r11.getResourceId(r12, r1)
            r9.f67266j = r12
            int[] r1 = i.C5430j.f24048B2
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r12, r1)
            int r2 = i.C5430j.f24052C2     // Catch:{ all -> 0x021d }
            int r2 = r1.getDimensionPixelSize(r2, r6)     // Catch:{ all -> 0x021d }
            float r2 = (float) r2     // Catch:{ all -> 0x021d }
            r9.f67274r = r2     // Catch:{ all -> 0x021d }
            int r2 = i.C5430j.f24064F2     // Catch:{ all -> 0x021d }
            android.content.res.ColorStateList r2 = Ra.c.a(r7, r1, r2)     // Catch:{ all -> 0x021d }
            r9.f67268l = r2     // Catch:{ all -> 0x021d }
            r1.recycle()
            int r1 = Ea.C9078l.f59735K7
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto L_0x0122
            int r1 = Ea.C9078l.f59735K7
            int r12 = r11.getResourceId(r1, r12)
            r9.f67267k = r12
        L_0x0122:
            int r12 = r9.f67267k
            if (r12 == r10) goto L_0x0166
            int[] r1 = i.C5430j.f24048B2
            android.content.res.TypedArray r12 = r7.obtainStyledAttributes(r12, r1)
            int r1 = i.C5430j.f24052C2     // Catch:{ all -> 0x015c }
            float r2 = r9.f67274r     // Catch:{ all -> 0x015c }
            int r2 = (int) r2     // Catch:{ all -> 0x015c }
            int r1 = r12.getDimensionPixelSize(r1, r2)     // Catch:{ all -> 0x015c }
            float r1 = (float) r1     // Catch:{ all -> 0x015c }
            r9.f67275s = r1     // Catch:{ all -> 0x015c }
            int r1 = i.C5430j.f24064F2     // Catch:{ all -> 0x015c }
            android.content.res.ColorStateList r1 = Ra.c.a(r7, r12, r1)     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x015e
            android.content.res.ColorStateList r2 = r9.f67268l     // Catch:{ all -> 0x015c }
            int r2 = r2.getDefaultColor()     // Catch:{ all -> 0x015c }
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r3 = new int[]{r3}     // Catch:{ all -> 0x015c }
            int r4 = r1.getDefaultColor()     // Catch:{ all -> 0x015c }
            int r1 = r1.getColorForState(r3, r4)     // Catch:{ all -> 0x015c }
            android.content.res.ColorStateList r1 = t(r2, r1)     // Catch:{ all -> 0x015c }
            r9.f67268l = r1     // Catch:{ all -> 0x015c }
            goto L_0x015e
        L_0x015c:
            r10 = move-exception
            goto L_0x0162
        L_0x015e:
            r12.recycle()
            goto L_0x0166
        L_0x0162:
            r12.recycle()
            throw r10
        L_0x0166:
            int r12 = Ea.C9078l.f59768N7
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x0176
            int r12 = Ea.C9078l.f59768N7
            android.content.res.ColorStateList r12 = Ra.c.a(r7, r11, r12)
            r9.f67268l = r12
        L_0x0176:
            int r12 = Ea.C9078l.f59746L7
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x0190
            int r12 = Ea.C9078l.f59746L7
            int r12 = r11.getColor(r12, r6)
            android.content.res.ColorStateList r1 = r9.f67268l
            int r1 = r1.getDefaultColor()
            android.content.res.ColorStateList r12 = t(r1, r12)
            r9.f67268l = r12
        L_0x0190:
            int r12 = Ea.C9078l.f60085r7
            android.content.res.ColorStateList r12 = Ra.c.a(r7, r11, r12)
            r9.f67269m = r12
            int r12 = Ea.C9078l.f60096s7
            int r12 = r11.getInt(r12, r10)
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = com.google.android.material.internal.v.k(r12, r1)
            r9.f67273q = r12
            int r12 = Ea.C9078l.f59724J7
            android.content.res.ColorStateList r12 = Ra.c.a(r7, r11, r12)
            r9.f67270n = r12
            int r12 = Ea.C9078l.f60118u7
            r1 = 300(0x12c, float:4.2E-43)
            int r12 = r11.getInt(r12, r1)
            r9.f67237B = r12
            int r12 = Ea.C9068b.f59312R
            android.animation.TimeInterpolator r1 = Fa.C9081a.f60372b
            android.animation.TimeInterpolator r12 = Qa.C9242i.g(r7, r12, r1)
            r9.f67246K = r12
            int r12 = Ea.C9078l.f59647C7
            int r12 = r11.getDimensionPixelSize(r12, r10)
            r9.f67279w = r12
            int r12 = Ea.C9078l.f59636B7
            int r10 = r11.getDimensionPixelSize(r12, r10)
            r9.f67280x = r10
            int r10 = Ea.C9078l.f60052o7
            int r10 = r11.getResourceId(r10, r6)
            r9.f67277u = r10
            int r10 = Ea.C9078l.f60063p7
            int r10 = r11.getDimensionPixelSize(r10, r6)
            r9.f67282z = r10
            int r10 = Ea.C9078l.f59658D7
            int r10 = r11.getInt(r10, r0)
            r9.f67239D = r10
            int r10 = Ea.C9078l.f60074q7
            int r10 = r11.getInt(r10, r6)
            r9.f67236A = r10
            int r10 = Ea.C9078l.f59625A7
            boolean r10 = r11.getBoolean(r10, r6)
            r9.f67240E = r10
            int r10 = Ea.C9078l.f59778O7
            boolean r10 = r11.getBoolean(r10, r6)
            r9.f67244I = r10
            r11.recycle()
            android.content.res.Resources r10 = r9.getResources()
            int r11 = Ea.C9070d.f59416j
            int r11 = r10.getDimensionPixelSize(r11)
            float r11 = (float) r11
            r9.f67276t = r11
            int r11 = Ea.C9070d.f59414i
            int r10 = r10.getDimensionPixelSize(r11)
            r9.f67281y = r10
            r9.q()
            return
        L_0x021d:
            r10 = move-exception
            r1.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View view, int i10) {
        n(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f67247L;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.f67247L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(C5443a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
