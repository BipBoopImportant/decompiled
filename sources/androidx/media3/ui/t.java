package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import w4.u;
import w4.x;

final class t {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public boolean f43348A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public boolean f43349B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f43350C = true;

    /* renamed from: a  reason: collision with root package name */
    private final PlayerControlView f43351a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final View f43352b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f43353c;

    /* renamed from: d  reason: collision with root package name */
    private final ViewGroup f43354d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f43355e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f43356f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f43357g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final ViewGroup f43358h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup f43359i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final View f43360j;

    /* renamed from: k  reason: collision with root package name */
    private final View f43361k;

    /* renamed from: l  reason: collision with root package name */
    private final AnimatorSet f43362l;

    /* renamed from: m  reason: collision with root package name */
    private final AnimatorSet f43363m;

    /* renamed from: n  reason: collision with root package name */
    private final AnimatorSet f43364n;

    /* renamed from: o  reason: collision with root package name */
    private final AnimatorSet f43365o;

    /* renamed from: p  reason: collision with root package name */
    private final AnimatorSet f43366p;

    /* renamed from: q  reason: collision with root package name */
    private final ValueAnimator f43367q;

    /* renamed from: r  reason: collision with root package name */
    private final ValueAnimator f43368r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f43369s = new g(this);

    /* renamed from: t  reason: collision with root package name */
    private final Runnable f43370t = new m(this);

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f43371u = new n(this);

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f43372v = new o(this);

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f43373w = new p(this);

    /* renamed from: x  reason: collision with root package name */
    private final View.OnLayoutChangeListener f43374x = new q(this);

    /* renamed from: y  reason: collision with root package name */
    private final List<View> f43375y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private int f43376z = 0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (t.this.f43352b != null) {
                t.this.f43352b.setVisibility(4);
            }
            if (t.this.f43353c != null) {
                t.this.f43353c.setVisibility(4);
            }
            if (t.this.f43355e != null) {
                t.this.f43355e.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if ((t.this.f43360j instanceof DefaultTimeBar) && !t.this.f43348A) {
                ((DefaultTimeBar) t.this.f43360j).h(250);
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationStart(Animator animator) {
            int i10 = 0;
            if (t.this.f43352b != null) {
                t.this.f43352b.setVisibility(0);
            }
            if (t.this.f43353c != null) {
                t.this.f43353c.setVisibility(0);
            }
            if (t.this.f43355e != null) {
                ViewGroup r10 = t.this.f43355e;
                if (!t.this.f43348A) {
                    i10 = 4;
                }
                r10.setVisibility(i10);
            }
            if ((t.this.f43360j instanceof DefaultTimeBar) && !t.this.f43348A) {
                ((DefaultTimeBar) t.this.f43360j).u(250);
            }
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerControlView f43379a;

        c(PlayerControlView playerControlView) {
            this.f43379a = playerControlView;
        }

        public void onAnimationEnd(Animator animator) {
            t.this.Z(1);
            if (t.this.f43349B) {
                this.f43379a.post(t.this.f43369s);
                boolean unused = t.this.f43349B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            t.this.Z(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerControlView f43381a;

        d(PlayerControlView playerControlView) {
            this.f43381a = playerControlView;
        }

        public void onAnimationEnd(Animator animator) {
            t.this.Z(2);
            if (t.this.f43349B) {
                this.f43381a.post(t.this.f43369s);
                boolean unused = t.this.f43349B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            t.this.Z(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerControlView f43383a;

        e(PlayerControlView playerControlView) {
            this.f43383a = playerControlView;
        }

        public void onAnimationEnd(Animator animator) {
            t.this.Z(2);
            if (t.this.f43349B) {
                this.f43383a.post(t.this.f43369s);
                boolean unused = t.this.f43349B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            t.this.Z(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        public void onAnimationEnd(Animator animator) {
            t.this.Z(0);
        }

        public void onAnimationStart(Animator animator) {
            t.this.Z(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        public void onAnimationEnd(Animator animator) {
            t.this.Z(0);
        }

        public void onAnimationStart(Animator animator) {
            t.this.Z(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        public void onAnimationEnd(Animator animator) {
            if (t.this.f43356f != null) {
                t.this.f43356f.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (t.this.f43358h != null) {
                t.this.f43358h.setVisibility(0);
                t.this.f43358h.setTranslationX((float) t.this.f43358h.getWidth());
                t.this.f43358h.scrollTo(t.this.f43358h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        public void onAnimationEnd(Animator animator) {
            if (t.this.f43358h != null) {
                t.this.f43358h.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (t.this.f43356f != null) {
                t.this.f43356f.setVisibility(0);
            }
        }
    }

    public t(PlayerControlView playerControlView) {
        this.f43351a = playerControlView;
        this.f43352b = playerControlView.findViewById(x.f57160l);
        this.f43353c = (ViewGroup) playerControlView.findViewById(x.f57155g);
        this.f43355e = (ViewGroup) playerControlView.findViewById(x.f57171w);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(x.f57153e);
        this.f43354d = viewGroup;
        this.f43359i = (ViewGroup) playerControlView.findViewById(x.f57147U);
        View findViewById = playerControlView.findViewById(x.f57135I);
        this.f43360j = findViewById;
        this.f43356f = (ViewGroup) playerControlView.findViewById(x.f57152d);
        this.f43357g = (ViewGroup) playerControlView.findViewById(x.f57163o);
        this.f43358h = (ViewGroup) playerControlView.findViewById(x.f57164p);
        View findViewById2 = playerControlView.findViewById(x.f57127A);
        this.f43361k = findViewById2;
        View findViewById3 = playerControlView.findViewById(x.f57174z);
        if (!(findViewById2 == null || findViewById3 == null)) {
            findViewById2.setOnClickListener(new r(this));
            findViewById3.setOnClickListener(new r(this));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s(this));
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new h(this));
        ofFloat2.addListener(new b());
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(u.f57104b) - resources.getDimension(u.f57105c);
        float dimension2 = resources.getDimension(u.f57104b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43362l = animatorSet;
        animatorSet.setDuration(250);
        animatorSet.addListener(new c(playerControlView));
        animatorSet.play(ofFloat).with(N(0.0f, dimension, findViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f43363m = animatorSet2;
        animatorSet2.setDuration(250);
        animatorSet2.addListener(new d(playerControlView));
        animatorSet2.play(N(dimension, dimension2, findViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f43364n = animatorSet3;
        animatorSet3.setDuration(250);
        animatorSet3.addListener(new e(playerControlView));
        animatorSet3.play(ofFloat).with(N(0.0f, dimension2, findViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f43365o = animatorSet4;
        animatorSet4.setDuration(250);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(N(dimension, 0.0f, findViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f43366p = animatorSet5;
        animatorSet5.setDuration(250);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(N(dimension2, 0.0f, findViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f43367q = ofFloat3;
        ofFloat3.setDuration(250);
        ofFloat3.addUpdateListener(new k(this));
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f43368r = ofFloat4;
        ofFloat4.setDuration(250);
        ofFloat4.addUpdateListener(new l(this));
        ofFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: private */
    public void D() {
        this.f43364n.start();
    }

    /* access modifiers changed from: private */
    public void E() {
        Z(2);
    }

    /* access modifiers changed from: private */
    public void G() {
        this.f43362l.start();
        U(this.f43371u, 2000);
    }

    /* access modifiers changed from: private */
    public void H() {
        this.f43363m.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f43352b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f43353c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f43355e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f43352b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f43353c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f43355e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator N(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", new float[]{f10, f11});
    }

    /* access modifiers changed from: private */
    public void R(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean e02 = e0();
        if (this.f43348A != e02) {
            this.f43348A = e02;
            view.post(new i(this));
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (!this.f43348A && z10) {
            view.post(new j(this));
        }
    }

    /* access modifiers changed from: private */
    public void S() {
        int i10;
        if (this.f43356f != null && this.f43357g != null) {
            int width = (this.f43351a.getWidth() - this.f43351a.getPaddingLeft()) - this.f43351a.getPaddingRight();
            while (true) {
                if (this.f43357g.getChildCount() <= 1) {
                    break;
                }
                int childCount = this.f43357g.getChildCount() - 2;
                View childAt = this.f43357g.getChildAt(childCount);
                this.f43357g.removeViewAt(childCount);
                this.f43356f.addView(childAt, 0);
            }
            View view = this.f43361k;
            if (view != null) {
                view.setVisibility(8);
            }
            int B10 = B(this.f43359i);
            int childCount2 = this.f43356f.getChildCount() - 1;
            for (int i11 = 0; i11 < childCount2; i11++) {
                B10 += B(this.f43356f.getChildAt(i11));
            }
            if (B10 > width) {
                View view2 = this.f43361k;
                if (view2 != null) {
                    view2.setVisibility(0);
                    B10 += B(this.f43361k);
                }
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.f43356f.getChildAt(i12);
                    B10 -= B(childAt2);
                    arrayList.add(childAt2);
                    if (B10 <= width) {
                        break;
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f43356f.removeViews(0, arrayList.size());
                    for (i10 = 0; i10 < arrayList.size(); i10++) {
                        this.f43357g.addView((View) arrayList.get(i10), this.f43357g.getChildCount() - 1);
                    }
                    return;
                }
                return;
            }
            ViewGroup viewGroup = this.f43358h;
            if (viewGroup != null && viewGroup.getVisibility() == 0 && !this.f43368r.isStarted()) {
                this.f43367q.cancel();
                this.f43368r.start();
            }
        }
    }

    /* access modifiers changed from: private */
    public void T(View view) {
        W();
        if (view.getId() == x.f57127A) {
            this.f43367q.start();
        } else if (view.getId() == x.f57174z) {
            this.f43368r.start();
        }
    }

    private void U(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f43351a.postDelayed(runnable, j10);
        }
    }

    /* access modifiers changed from: private */
    public void Z(int i10) {
        int i11 = this.f43376z;
        this.f43376z = i10;
        if (i10 == 2) {
            this.f43351a.setVisibility(8);
        } else if (i11 == 2) {
            this.f43351a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f43351a.f0();
        }
    }

    private boolean a0(View view) {
        int id2 = view.getId();
        return id2 == x.f57153e || id2 == x.f57134H || id2 == x.f57173y || id2 == x.f57138L || id2 == x.f57139M || id2 == x.f57165q || id2 == x.f57166r;
    }

    /* access modifiers changed from: private */
    public void c0() {
        if (!this.f43350C) {
            Z(0);
            W();
            return;
        }
        int i10 = this.f43376z;
        if (i10 == 1) {
            this.f43365o.start();
        } else if (i10 == 2) {
            this.f43366p.start();
        } else if (i10 == 3) {
            this.f43349B = true;
        } else if (i10 == 4) {
            return;
        }
        W();
    }

    /* access modifiers changed from: private */
    public void d0() {
        ViewGroup viewGroup = this.f43355e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f43348A ? 0 : 4);
        }
        if (this.f43360j != null) {
            int dimensionPixelSize = this.f43351a.getResources().getDimensionPixelSize(u.f57106d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43360j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f43348A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f43360j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f43360j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f43348A) {
                    defaultTimeBar.i(true);
                } else {
                    int i10 = this.f43376z;
                    if (i10 == 1) {
                        defaultTimeBar.i(false);
                    } else if (i10 != 3) {
                        defaultTimeBar.t();
                    }
                }
            }
        }
        for (View next : this.f43375y) {
            next.setVisibility((!this.f43348A || !a0(next)) ? 0 : 4);
        }
    }

    private boolean e0() {
        int width = (this.f43351a.getWidth() - this.f43351a.getPaddingLeft()) - this.f43351a.getPaddingRight();
        int height = (this.f43351a.getHeight() - this.f43351a.getPaddingBottom()) - this.f43351a.getPaddingTop();
        int B10 = B(this.f43353c);
        ViewGroup viewGroup = this.f43353c;
        int paddingLeft = B10 - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f43353c.getPaddingRight() : 0);
        int z10 = z(this.f43353c);
        ViewGroup viewGroup2 = this.f43353c;
        return width <= Math.max(paddingLeft, B(this.f43359i) + B(this.f43361k)) || height <= (z10 - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f43353c.getPaddingBottom() : 0)) + (z(this.f43354d) * 2);
    }

    private void y(float f10) {
        ViewGroup viewGroup = this.f43358h;
        if (viewGroup != null) {
            this.f43358h.setTranslationX((float) ((int) (((float) viewGroup.getWidth()) * (1.0f - f10))));
        }
        ViewGroup viewGroup2 = this.f43359i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f43356f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f43375y.contains(view);
    }

    public void C() {
        int i10 = this.f43376z;
        if (i10 != 3 && i10 != 2) {
            V();
            if (!this.f43350C) {
                E();
            } else if (this.f43376z == 1) {
                H();
            } else {
                D();
            }
        }
    }

    public void F() {
        int i10 = this.f43376z;
        if (i10 != 3 && i10 != 2) {
            V();
            E();
        }
    }

    public boolean I() {
        return this.f43376z == 0 && this.f43351a.e0();
    }

    public void O() {
        this.f43351a.addOnLayoutChangeListener(this.f43374x);
    }

    public void P() {
        this.f43351a.removeOnLayoutChangeListener(this.f43374x);
    }

    public void Q(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f43352b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void V() {
        this.f43351a.removeCallbacks(this.f43373w);
        this.f43351a.removeCallbacks(this.f43370t);
        this.f43351a.removeCallbacks(this.f43372v);
        this.f43351a.removeCallbacks(this.f43371u);
    }

    public void W() {
        if (this.f43376z != 3) {
            V();
            int showTimeoutMs = this.f43351a.getShowTimeoutMs();
            if (showTimeoutMs <= 0) {
                return;
            }
            if (!this.f43350C) {
                U(this.f43373w, (long) showTimeoutMs);
            } else if (this.f43376z == 1) {
                U(this.f43371u, 2000);
            } else {
                U(this.f43372v, (long) showTimeoutMs);
            }
        }
    }

    public void X(boolean z10) {
        this.f43350C = z10;
    }

    public void Y(View view, boolean z10) {
        if (view != null) {
            if (!z10) {
                view.setVisibility(8);
                this.f43375y.remove(view);
                return;
            }
            if (!this.f43348A || !a0(view)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
            this.f43375y.add(view);
        }
    }

    public void b0() {
        if (!this.f43351a.e0()) {
            this.f43351a.setVisibility(0);
            this.f43351a.o0();
            this.f43351a.k0();
        }
        c0();
    }
}
