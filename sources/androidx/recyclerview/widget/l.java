package androidx.recyclerview.widget;

import I2.C4600b0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class l extends RecyclerView.p implements RecyclerView.s {

    /* renamed from: A  reason: collision with root package name */
    private f f44099A;

    /* renamed from: B  reason: collision with root package name */
    private final RecyclerView.u f44100B = new b();

    /* renamed from: C  reason: collision with root package name */
    private Rect f44101C;

    /* renamed from: D  reason: collision with root package name */
    private long f44102D;

    /* renamed from: a  reason: collision with root package name */
    final List<View> f44103a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final float[] f44104b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    RecyclerView.G f44105c = null;

    /* renamed from: d  reason: collision with root package name */
    float f44106d;

    /* renamed from: e  reason: collision with root package name */
    float f44107e;

    /* renamed from: f  reason: collision with root package name */
    private float f44108f;

    /* renamed from: g  reason: collision with root package name */
    private float f44109g;

    /* renamed from: h  reason: collision with root package name */
    float f44110h;

    /* renamed from: i  reason: collision with root package name */
    float f44111i;

    /* renamed from: j  reason: collision with root package name */
    private float f44112j;

    /* renamed from: k  reason: collision with root package name */
    private float f44113k;

    /* renamed from: l  reason: collision with root package name */
    int f44114l = -1;

    /* renamed from: m  reason: collision with root package name */
    e f44115m;

    /* renamed from: n  reason: collision with root package name */
    private int f44116n = 0;

    /* renamed from: o  reason: collision with root package name */
    int f44117o;

    /* renamed from: p  reason: collision with root package name */
    List<g> f44118p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private int f44119q;

    /* renamed from: r  reason: collision with root package name */
    RecyclerView f44120r;

    /* renamed from: s  reason: collision with root package name */
    final Runnable f44121s = new a();

    /* renamed from: t  reason: collision with root package name */
    VelocityTracker f44122t;

    /* renamed from: u  reason: collision with root package name */
    private List<RecyclerView.G> f44123u;

    /* renamed from: v  reason: collision with root package name */
    private List<Integer> f44124v;

    /* renamed from: w  reason: collision with root package name */
    private RecyclerView.l f44125w;

    /* renamed from: x  reason: collision with root package name */
    View f44126x = null;

    /* renamed from: y  reason: collision with root package name */
    int f44127y = -1;

    /* renamed from: z  reason: collision with root package name */
    GestureDetector f44128z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            l lVar = l.this;
            if (lVar.f44105c != null && lVar.E()) {
                l lVar2 = l.this;
                RecyclerView.G g10 = lVar2.f44105c;
                if (g10 != null) {
                    lVar2.z(g10);
                }
                l lVar3 = l.this;
                lVar3.f44120r.removeCallbacks(lVar3.f44121s);
                C4600b0.g0(l.this.f44120r, this);
            }
        }
    }

    class b implements RecyclerView.u {
        b() {
        }

        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            l.this.f44128z.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = l.this.f44122t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (l.this.f44114l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(l.this.f44114l);
                if (findPointerIndex >= 0) {
                    l.this.o(actionMasked, motionEvent, findPointerIndex);
                }
                l lVar = l.this;
                RecyclerView.G g10 = lVar.f44105c;
                if (g10 != null) {
                    int i10 = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = lVar.f44122t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                l lVar2 = l.this;
                                if (pointerId == lVar2.f44114l) {
                                    if (actionIndex == 0) {
                                        i10 = 1;
                                    }
                                    lVar2.f44114l = motionEvent.getPointerId(i10);
                                    l lVar3 = l.this;
                                    lVar3.K(motionEvent, lVar3.f44117o, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            lVar.K(motionEvent, lVar.f44117o, findPointerIndex);
                            l.this.z(g10);
                            l lVar4 = l.this;
                            lVar4.f44120r.removeCallbacks(lVar4.f44121s);
                            l.this.f44121s.run();
                            l.this.f44120r.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    l.this.F((RecyclerView.G) null, 0);
                    l.this.f44114l = -1;
                }
            }
        }

        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g s10;
            l.this.f44128z.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                l.this.f44114l = motionEvent.getPointerId(0);
                l.this.f44106d = motionEvent.getX();
                l.this.f44107e = motionEvent.getY();
                l.this.A();
                l lVar = l.this;
                if (lVar.f44105c == null && (s10 = lVar.s(motionEvent)) != null) {
                    l lVar2 = l.this;
                    lVar2.f44106d -= s10.f44151j;
                    lVar2.f44107e -= s10.f44152k;
                    lVar2.r(s10.f44146e, true);
                    if (l.this.f44103a.remove(s10.f44146e.itemView)) {
                        l lVar3 = l.this;
                        lVar3.f44115m.c(lVar3.f44120r, s10.f44146e);
                    }
                    l.this.F(s10.f44146e, s10.f44147f);
                    l lVar4 = l.this;
                    lVar4.K(motionEvent, lVar4.f44117o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                l lVar5 = l.this;
                lVar5.f44114l = -1;
                lVar5.F((RecyclerView.G) null, 0);
            } else {
                int i10 = l.this.f44114l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    l.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = l.this.f44122t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return l.this.f44105c != null;
        }

        public void e(boolean z10) {
            if (z10) {
                l.this.F((RecyclerView.G) null, 0);
            }
        }
    }

    class c extends g {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f44131o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ RecyclerView.G f44132p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ l f44133q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, RecyclerView.G g10, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.G g11) {
            super(g10, i10, i11, f10, f11, f12, f13);
            this.f44133q = lVar;
            this.f44131o = i12;
            this.f44132p = g11;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f44153l) {
                if (this.f44131o <= 0) {
                    l lVar = this.f44133q;
                    lVar.f44115m.c(lVar.f44120r, this.f44132p);
                } else {
                    this.f44133q.f44103a.add(this.f44132p.itemView);
                    this.f44150i = true;
                    int i10 = this.f44131o;
                    if (i10 > 0) {
                        this.f44133q.B(this, i10);
                    }
                }
                l lVar2 = this.f44133q;
                View view = lVar2.f44126x;
                View view2 = this.f44132p.itemView;
                if (view == view2) {
                    lVar2.D(view2);
                }
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f44134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44135b;

        d(g gVar, int i10) {
            this.f44134a = gVar;
            this.f44135b = i10;
        }

        public void run() {
            RecyclerView recyclerView = l.this.f44120r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                g gVar = this.f44134a;
                if (!gVar.f44153l && gVar.f44146e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.n itemAnimator = l.this.f44120r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning((RecyclerView.n.a) null)) && !l.this.x()) {
                        l.this.f44115m.B(this.f44134a.f44146e, this.f44135b);
                    } else {
                        l.this.f44120r.post(this);
                    }
                }
            }
        }
    }

    public static abstract class e {

        /* renamed from: b  reason: collision with root package name */
        private static final Interpolator f44137b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final Interpolator f44138c = new b();

        /* renamed from: a  reason: collision with root package name */
        private int f44139a = -1;

        class a implements Interpolator {
            a() {
            }

            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        class b implements Interpolator {
            b() {
            }

            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int e(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= -789517 & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        private int i(RecyclerView recyclerView) {
            if (this.f44139a == -1) {
                this.f44139a = recyclerView.getResources().getDimensionPixelSize(M4.b.f38482d);
            }
            return this.f44139a;
        }

        public static int s(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int t(int i10, int i11) {
            int s10 = s(0, i11 | i10);
            return s(2, i10) | s(1, i11) | s10;
        }

        public void A(RecyclerView.G g10, int i10) {
            if (g10 != null) {
                n.f44159a.b(g10.itemView);
            }
        }

        public abstract void B(RecyclerView.G g10, int i10);

        public boolean a(RecyclerView recyclerView, RecyclerView.G g10, RecyclerView.G g11) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.G b(RecyclerView.G g10, List<RecyclerView.G> list, int i10, int i11) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.G g11 = g10;
            int width = i10 + g11.itemView.getWidth();
            int height = i11 + g11.itemView.getHeight();
            int left2 = i10 - g11.itemView.getLeft();
            int top2 = i11 - g11.itemView.getTop();
            int size = list.size();
            RecyclerView.G g12 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.G g13 = list.get(i13);
                if (left2 > 0 && (right = g13.itemView.getRight() - width) < 0 && g13.itemView.getRight() > g11.itemView.getRight() && (abs4 = Math.abs(right)) > i12) {
                    g12 = g13;
                    i12 = abs4;
                }
                if (left2 < 0 && (left = g13.itemView.getLeft() - i10) > 0 && g13.itemView.getLeft() < g11.itemView.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    g12 = g13;
                    i12 = abs3;
                }
                if (top2 < 0 && (top = g13.itemView.getTop() - i11) > 0 && g13.itemView.getTop() < g11.itemView.getTop() && (abs2 = Math.abs(top)) > i12) {
                    g12 = g13;
                    i12 = abs2;
                }
                if (top2 > 0 && (bottom = g13.itemView.getBottom() - height) < 0 && g13.itemView.getBottom() > g11.itemView.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    g12 = g13;
                    i12 = abs;
                }
            }
            return g12;
        }

        public void c(RecyclerView recyclerView, RecyclerView.G g10) {
            n.f44159a.a(g10.itemView);
        }

        public int d(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= -3158065 & i15;
                i12 = (i15 & 3158064) >> 2;
            }
            return i14 | i12;
        }

        /* access modifiers changed from: package-private */
        public final int f(RecyclerView recyclerView, RecyclerView.G g10) {
            return d(k(recyclerView, g10), recyclerView.getLayoutDirection());
        }

        public long g(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.n itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i10 == 8 ? 200 : 250 : i10 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int h() {
            return 0;
        }

        public float j(RecyclerView.G g10) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.G g10);

        public float l(float f10) {
            return f10;
        }

        public float m(RecyclerView.G g10) {
            return 0.5f;
        }

        public float n(float f10) {
            return f10;
        }

        /* access modifiers changed from: package-private */
        public boolean o(RecyclerView recyclerView, RecyclerView.G g10) {
            return (f(recyclerView, g10) & 16711680) != 0;
        }

        public int p(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            float f10 = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i11)) * i(recyclerView))) * f44138c.getInterpolation(Math.min(1.0f, (((float) Math.abs(i11)) * 1.0f) / ((float) i10))));
            if (j10 <= 2000) {
                f10 = ((float) j10) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f44137b.getInterpolation(f10));
            return interpolation == 0 ? i11 > 0 ? 1 : -1 : interpolation;
        }

        public boolean q() {
            return true;
        }

        public boolean r() {
            return true;
        }

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.G g10, float f10, float f11, int i10, boolean z10) {
            n.f44159a.c(canvas, recyclerView, g10.itemView, f10, f11, i10, z10);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.G g10, float f10, float f11, int i10, boolean z10) {
            n.f44159a.d(canvas, recyclerView, g10.itemView, f10, f11, i10, z10);
        }

        /* access modifiers changed from: package-private */
        public void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.G g10, List<g> list, int i10, float f10, float f11) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                gVar.e();
                int save = canvas.save();
                u(canvas, recyclerView, gVar.f44146e, gVar.f44151j, gVar.f44152k, gVar.f44147f, false);
                canvas.restoreToCount(save);
            }
            if (g10 != null) {
                int save2 = canvas.save();
                u(canvas, recyclerView, g10, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        /* access modifiers changed from: package-private */
        public void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.G g10, List<g> list, int i10, float f10, float f11) {
            Canvas canvas2 = canvas;
            List<g> list2 = list;
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list2.get(i11);
                int save = canvas.save();
                v(canvas, recyclerView, gVar.f44146e, gVar.f44151j, gVar.f44152k, gVar.f44147f, false);
                canvas.restoreToCount(save);
            }
            if (g10 != null) {
                int save2 = canvas.save();
                v(canvas, recyclerView, g10, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = list2.get(i12);
                boolean z11 = gVar2.f44154m;
                if (z11 && !gVar2.f44150i) {
                    list2.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.G g10, RecyclerView.G g11);

        public void z(RecyclerView recyclerView, RecyclerView.G g10, int i10, RecyclerView.G g11, int i11, int i12, int i13) {
            RecyclerView.q layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof i) {
                ((i) layoutManager).n(g10.itemView, g11.itemView, i12, i13);
                return;
            }
            if (layoutManager.M()) {
                if (layoutManager.s0(g11.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.w1(i11);
                }
                if (layoutManager.v0(g11.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.w1(i11);
                }
            }
            if (layoutManager.N()) {
                if (layoutManager.w0(g11.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.w1(i11);
                }
                if (layoutManager.q0(g11.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.w1(i11);
                }
            }
        }
    }

    private class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f44140a = true;

        f() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f44140a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View t10;
            RecyclerView.G o02;
            int i10;
            if (this.f44140a && (t10 = l.this.t(motionEvent)) != null && (o02 = l.this.f44120r.o0(t10)) != null) {
                l lVar = l.this;
                if (lVar.f44115m.o(lVar.f44120r, o02) && motionEvent.getPointerId(0) == (i10 = l.this.f44114l)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    l lVar2 = l.this;
                    lVar2.f44106d = x10;
                    lVar2.f44107e = y10;
                    lVar2.f44111i = 0.0f;
                    lVar2.f44110h = 0.0f;
                    if (lVar2.f44115m.r()) {
                        l.this.F(o02, 2);
                    }
                }
            }
        }
    }

    static class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final float f44142a;

        /* renamed from: b  reason: collision with root package name */
        final float f44143b;

        /* renamed from: c  reason: collision with root package name */
        final float f44144c;

        /* renamed from: d  reason: collision with root package name */
        final float f44145d;

        /* renamed from: e  reason: collision with root package name */
        final RecyclerView.G f44146e;

        /* renamed from: f  reason: collision with root package name */
        final int f44147f;

        /* renamed from: g  reason: collision with root package name */
        final ValueAnimator f44148g;

        /* renamed from: h  reason: collision with root package name */
        final int f44149h;

        /* renamed from: i  reason: collision with root package name */
        boolean f44150i;

        /* renamed from: j  reason: collision with root package name */
        float f44151j;

        /* renamed from: k  reason: collision with root package name */
        float f44152k;

        /* renamed from: l  reason: collision with root package name */
        boolean f44153l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f44154m = false;

        /* renamed from: n  reason: collision with root package name */
        private float f44155n;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        g(RecyclerView.G g10, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f44147f = i11;
            this.f44149h = i10;
            this.f44146e = g10;
            this.f44142a = f10;
            this.f44143b = f11;
            this.f44144c = f12;
            this.f44145d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f44148g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(g10.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f44148g.cancel();
        }

        public void b(long j10) {
            this.f44148g.setDuration(j10);
        }

        public void c(float f10) {
            this.f44155n = f10;
        }

        public void d() {
            this.f44146e.setIsRecyclable(false);
            this.f44148g.start();
        }

        public void e() {
            float f10 = this.f44142a;
            float f11 = this.f44144c;
            if (f10 == f11) {
                this.f44151j = this.f44146e.itemView.getTranslationX();
            } else {
                this.f44151j = f10 + (this.f44155n * (f11 - f10));
            }
            float f12 = this.f44143b;
            float f13 = this.f44145d;
            if (f12 == f13) {
                this.f44152k = this.f44146e.itemView.getTranslationY();
            } else {
                this.f44152k = f12 + (this.f44155n * (f13 - f12));
            }
        }

        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f44154m) {
                this.f44146e.setIsRecyclable(true);
            }
            this.f44154m = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class h extends e {

        /* renamed from: d  reason: collision with root package name */
        private int f44157d;

        /* renamed from: e  reason: collision with root package name */
        private int f44158e;

        public h(int i10, int i11) {
            this.f44157d = i11;
            this.f44158e = i10;
        }

        public int C(RecyclerView recyclerView, RecyclerView.G g10) {
            return this.f44158e;
        }

        public int D(RecyclerView recyclerView, RecyclerView.G g10) {
            return this.f44157d;
        }

        public int k(RecyclerView recyclerView, RecyclerView.G g10) {
            return e.t(C(recyclerView, g10), D(recyclerView, g10));
        }
    }

    public interface i {
        void n(View view, View view2, int i10, int i11);
    }

    public l(e eVar) {
        this.f44115m = eVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.f44122t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f44122t = null;
        }
    }

    private void G() {
        this.f44119q = ViewConfiguration.get(this.f44120r.getContext()).getScaledTouchSlop();
        this.f44120r.j(this);
        this.f44120r.m(this.f44100B);
        this.f44120r.l(this);
        H();
    }

    private void H() {
        this.f44099A = new f();
        this.f44128z = new GestureDetector(this.f44120r.getContext(), this.f44099A);
    }

    private void I() {
        f fVar = this.f44099A;
        if (fVar != null) {
            fVar.a();
            this.f44099A = null;
        }
        if (this.f44128z != null) {
            this.f44128z = null;
        }
    }

    private int J(RecyclerView.G g10) {
        if (this.f44116n == 2) {
            return 0;
        }
        int k10 = this.f44115m.k(this.f44120r, g10);
        int d10 = (this.f44115m.d(k10, this.f44120r.getLayoutDirection()) & 65280) >> 8;
        if (d10 == 0) {
            return 0;
        }
        int i10 = (k10 & 65280) >> 8;
        if (Math.abs(this.f44110h) > Math.abs(this.f44111i)) {
            int n10 = n(g10, d10);
            if (n10 > 0) {
                return (i10 & n10) == 0 ? e.e(n10, this.f44120r.getLayoutDirection()) : n10;
            }
            int p10 = p(g10, d10);
            if (p10 > 0) {
                return p10;
            }
        } else {
            int p11 = p(g10, d10);
            if (p11 > 0) {
                return p11;
            }
            int n11 = n(g10, d10);
            if (n11 > 0) {
                return (i10 & n11) == 0 ? e.e(n11, this.f44120r.getLayoutDirection()) : n11;
            }
        }
        return 0;
    }

    private void l() {
    }

    private int n(RecyclerView.G g10, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = 4;
        int i12 = this.f44110h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f44122t;
        if (velocityTracker != null && this.f44114l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f44115m.n(this.f44109g));
            float xVelocity = this.f44122t.getXVelocity(this.f44114l);
            float yVelocity = this.f44122t.getYVelocity(this.f44114l);
            if (xVelocity > 0.0f) {
                i11 = 8;
            }
            float abs = Math.abs(xVelocity);
            if ((i11 & i10) != 0 && i12 == i11 && abs >= this.f44115m.l(this.f44108f) && abs > Math.abs(yVelocity)) {
                return i11;
            }
        }
        float width = ((float) this.f44120r.getWidth()) * this.f44115m.m(g10);
        if ((i10 & i12) == 0 || Math.abs(this.f44110h) <= width) {
            return 0;
        }
        return i12;
    }

    private int p(RecyclerView.G g10, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = 1;
        int i12 = this.f44111i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f44122t;
        if (velocityTracker != null && this.f44114l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f44115m.n(this.f44109g));
            float xVelocity = this.f44122t.getXVelocity(this.f44114l);
            float yVelocity = this.f44122t.getYVelocity(this.f44114l);
            if (yVelocity > 0.0f) {
                i11 = 2;
            }
            float abs = Math.abs(yVelocity);
            if ((i11 & i10) != 0 && i11 == i12 && abs >= this.f44115m.l(this.f44108f) && abs > Math.abs(xVelocity)) {
                return i11;
            }
        }
        float height = ((float) this.f44120r.getHeight()) * this.f44115m.m(g10);
        if ((i10 & i12) == 0 || Math.abs(this.f44111i) <= height) {
            return 0;
        }
        return i12;
    }

    private void q() {
        this.f44120r.k1(this);
        this.f44120r.m1(this.f44100B);
        this.f44120r.l1(this);
        for (int size = this.f44118p.size() - 1; size >= 0; size--) {
            g gVar = this.f44118p.get(0);
            gVar.a();
            this.f44115m.c(this.f44120r, gVar.f44146e);
        }
        this.f44118p.clear();
        this.f44126x = null;
        this.f44127y = -1;
        C();
        I();
    }

    private List<RecyclerView.G> u(RecyclerView.G g10) {
        RecyclerView.G g11 = g10;
        List<RecyclerView.G> list = this.f44123u;
        if (list == null) {
            this.f44123u = new ArrayList();
            this.f44124v = new ArrayList();
        } else {
            list.clear();
            this.f44124v.clear();
        }
        int h10 = this.f44115m.h();
        int round = Math.round(this.f44112j + this.f44110h) - h10;
        int round2 = Math.round(this.f44113k + this.f44111i) - h10;
        int i10 = h10 * 2;
        int width = g11.itemView.getWidth() + round + i10;
        int height = g11.itemView.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.q layoutManager = this.f44120r.getLayoutManager();
        int l02 = layoutManager.l0();
        int i13 = 0;
        while (i13 < l02) {
            View k02 = layoutManager.k0(i13);
            if (k02 != g11.itemView && k02.getBottom() >= round2 && k02.getTop() <= height && k02.getRight() >= round && k02.getLeft() <= width) {
                RecyclerView.G o02 = this.f44120r.o0(k02);
                if (this.f44115m.a(this.f44120r, this.f44105c, o02)) {
                    int abs = Math.abs(i11 - ((k02.getLeft() + k02.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((k02.getTop() + k02.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f44123u.size();
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < size && i14 > this.f44124v.get(i15).intValue()) {
                        i16++;
                        i15++;
                        RecyclerView.G g12 = g10;
                    }
                    this.f44123u.add(i16, o02);
                    this.f44124v.add(i16, Integer.valueOf(i14));
                }
            }
            i13++;
            g11 = g10;
        }
        return this.f44123u;
    }

    private RecyclerView.G v(MotionEvent motionEvent) {
        View t10;
        RecyclerView.q layoutManager = this.f44120r.getLayoutManager();
        int i10 = this.f44114l;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f44106d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f44107e);
        int i11 = this.f44119q;
        if (abs < ((float) i11) && abs2 < ((float) i11)) {
            return null;
        }
        if (abs > abs2 && layoutManager.M()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.N()) && (t10 = t(motionEvent)) != null) {
            return this.f44120r.o0(t10);
        }
        return null;
    }

    private void w(float[] fArr) {
        if ((this.f44117o & 12) != 0) {
            fArr[0] = (this.f44112j + this.f44110h) - ((float) this.f44105c.itemView.getLeft());
        } else {
            fArr[0] = this.f44105c.itemView.getTranslationX();
        }
        if ((this.f44117o & 3) != 0) {
            fArr[1] = (this.f44113k + this.f44111i) - ((float) this.f44105c.itemView.getTop());
        } else {
            fArr[1] = this.f44105c.itemView.getTranslationY();
        }
    }

    private static boolean y(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    /* access modifiers changed from: package-private */
    public void A() {
        VelocityTracker velocityTracker = this.f44122t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f44122t = VelocityTracker.obtain();
    }

    /* access modifiers changed from: package-private */
    public void B(g gVar, int i10) {
        this.f44120r.post(new d(gVar, i10));
    }

    /* access modifiers changed from: package-private */
    public void D(View view) {
        if (view == this.f44126x) {
            this.f44126x = null;
            if (this.f44125w != null) {
                this.f44120r.setChildDrawingOrderCallback((RecyclerView.l) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1 > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean E() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$G r1 = r0.f44105c
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f44102D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f44102D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f44120r
            androidx.recyclerview.widget.RecyclerView$q r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f44101C
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f44101C = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$G r9 = r0.f44105c
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.f44101C
            r1.L(r9, r10)
            boolean r9 = r1.M()
            r10 = 0
            if (r9 == 0) goto L_0x007d
            float r9 = r0.f44112j
            float r11 = r0.f44110h
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f44101C
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f44120r
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f44110h
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x007e
        L_0x0059:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$G r11 = r0.f44105c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f44101C
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f44120r
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f44120r
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007d
            r12 = r9
            goto L_0x007e
        L_0x007d:
            r12 = r2
        L_0x007e:
            boolean r1 = r1.N()
            if (r1 == 0) goto L_0x00c4
            float r1 = r0.f44113k
            float r9 = r0.f44111i
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f44101C
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f44120r
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f44111i
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a1
            if (r9 >= 0) goto L_0x00a1
            r1 = r9
            goto L_0x00c5
        L_0x00a1:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView$G r9 = r0.f44105c
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f44101C
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f44120r
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f44120r
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = r2
        L_0x00c5:
            if (r12 == 0) goto L_0x00de
            androidx.recyclerview.widget.l$e r9 = r0.f44115m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f44120r
            androidx.recyclerview.widget.RecyclerView$G r11 = r0.f44105c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f44120r
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.p(r10, r11, r12, r13, r14)
        L_0x00de:
            r14 = r12
            if (r1 == 0) goto L_0x00fd
            androidx.recyclerview.widget.l$e r9 = r0.f44115m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f44120r
            androidx.recyclerview.widget.RecyclerView$G r11 = r0.f44105c
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f44120r
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.p(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x00fe
        L_0x00fd:
            r12 = r14
        L_0x00fe:
            if (r12 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r0.f44102D = r3
            return r2
        L_0x0106:
            long r7 = r0.f44102D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010e
            r0.f44102D = r5
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f44120r
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.E():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(androidx.recyclerview.widget.RecyclerView.G r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$G r0 = r11.f44105c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f44116n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f44102D = r0
            int r4 = r11.f44116n
            r14 = 1
            r11.r(r12, r14)
            r11.f44116n = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.f44126x = r0
            r23.l()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$G r9 = r11.f44105c
            r8 = 0
            if (r9 == 0) goto L_0x00ed
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00d9
            if (r4 != r15) goto L_0x004a
            r7 = r8
            goto L_0x004f
        L_0x004a:
            int r0 = r11.J(r9)
            r7 = r0
        L_0x004f:
            r23.C()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007c
            if (r7 == r15) goto L_0x007c
            if (r7 == r0) goto L_0x0069
            if (r7 == r10) goto L_0x0069
            r2 = 16
            if (r7 == r2) goto L_0x0069
            r2 = 32
            if (r7 == r2) goto L_0x0069
            r17 = r1
            r18 = r17
            goto L_0x008e
        L_0x0069:
            float r2 = r11.f44110h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f44120r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r1
            r17 = r2
            goto L_0x008e
        L_0x007c:
            float r2 = r11.f44111i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f44120r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r1
            r18 = r2
        L_0x008e:
            if (r4 != r15) goto L_0x0092
            r6 = r10
            goto L_0x0097
        L_0x0092:
            if (r7 <= 0) goto L_0x0096
            r6 = r15
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            float[] r0 = r11.f44104b
            r11.w(r0)
            float[] r0 = r11.f44104b
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.l$c r5 = new androidx.recyclerview.widget.l$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.l$e r0 = r11.f44115m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f44120r
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.g(r1, r15, r2, r3)
            r14.b(r0)
            java.util.List<androidx.recyclerview.widget.l$g> r0 = r11.f44118p
            r0.add(r14)
            r14.d()
            r8 = 1
            goto L_0x00e9
        L_0x00d9:
            r0 = r9
            r21 = r10
            android.view.View r1 = r0.itemView
            r11.D(r1)
            androidx.recyclerview.widget.l$e r1 = r11.f44115m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f44120r
            r1.c(r2, r0)
            r8 = 0
        L_0x00e9:
            r0 = 0
            r11.f44105c = r0
            goto L_0x00f0
        L_0x00ed:
            r21 = r10
            r8 = 0
        L_0x00f0:
            if (r12 == 0) goto L_0x0121
            androidx.recyclerview.widget.l$e r0 = r11.f44115m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f44120r
            int r0 = r0.f(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f44116n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f44117o = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f44112j = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f44113k = r0
            r11.f44105c = r12
            r0 = 2
            if (r13 != r0) goto L_0x0121
            android.view.View r0 = r12.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f44120r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0134
            androidx.recyclerview.widget.RecyclerView$G r2 = r11.f44105c
            if (r2 == 0) goto L_0x0130
            r14 = 1
            goto L_0x0131
        L_0x0130:
            r14 = r1
        L_0x0131:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0134:
            if (r8 != 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView r0 = r11.f44120r
            androidx.recyclerview.widget.RecyclerView$q r0 = r0.getLayoutManager()
            r0.U1()
        L_0x013f:
            androidx.recyclerview.widget.l$e r0 = r11.f44115m
            androidx.recyclerview.widget.RecyclerView$G r1 = r11.f44105c
            int r2 = r11.f44116n
            r0.A(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f44120r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.F(androidx.recyclerview.widget.RecyclerView$G, int):void");
    }

    /* access modifiers changed from: package-private */
    public void K(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f44106d;
        this.f44110h = f10;
        this.f44111i = y10 - this.f44107e;
        if ((i10 & 4) == 0) {
            this.f44110h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f44110h = Math.min(0.0f, this.f44110h);
        }
        if ((i10 & 1) == 0) {
            this.f44111i = Math.max(0.0f, this.f44111i);
        }
        if ((i10 & 2) == 0) {
            this.f44111i = Math.min(0.0f, this.f44111i);
        }
    }

    public void b(View view) {
        D(view);
        RecyclerView.G o02 = this.f44120r.o0(view);
        if (o02 != null) {
            RecyclerView.G g10 = this.f44105c;
            if (g10 == null || o02 != g10) {
                r(o02, false);
                if (this.f44103a.remove(o02.itemView)) {
                    this.f44115m.c(this.f44120r, o02);
                    return;
                }
                return;
            }
            F((RecyclerView.G) null, 0);
        }
    }

    public void d(View view) {
    }

    @SuppressLint({"UnknownNullness"})
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        rect.setEmpty();
    }

    @SuppressLint({"UnknownNullness"})
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        float f10;
        float f11;
        this.f44127y = -1;
        if (this.f44105c != null) {
            w(this.f44104b);
            float[] fArr = this.f44104b;
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.f44115m.w(canvas, recyclerView, this.f44105c, this.f44118p, this.f44116n, f11, f10);
    }

    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        float f10;
        float f11;
        if (this.f44105c != null) {
            w(this.f44104b);
            float[] fArr = this.f44104b;
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.f44115m.x(canvas, recyclerView, this.f44105c, this.f44118p, this.f44116n, f11, f10);
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f44120r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                q();
            }
            this.f44120r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f44108f = resources.getDimension(M4.b.f38484f);
                this.f44109g = resources.getDimension(M4.b.f38483e);
                G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.G v10;
        int f10;
        if (this.f44105c == null && i10 == 2 && this.f44116n != 2 && this.f44115m.q() && this.f44120r.getScrollState() != 1 && (v10 = v(motionEvent)) != null && (f10 = (this.f44115m.f(this.f44120r, v10) & 65280) >> 8) != 0) {
            float x10 = motionEvent.getX(i11);
            float y10 = motionEvent.getY(i11);
            float f11 = x10 - this.f44106d;
            float f12 = y10 - this.f44107e;
            float abs = Math.abs(f11);
            float abs2 = Math.abs(f12);
            int i12 = this.f44119q;
            if (abs >= ((float) i12) || abs2 >= ((float) i12)) {
                if (abs > abs2) {
                    if (f11 < 0.0f && (f10 & 4) == 0) {
                        return;
                    }
                    if (f11 > 0.0f && (f10 & 8) == 0) {
                        return;
                    }
                } else if (f12 < 0.0f && (f10 & 1) == 0) {
                    return;
                } else {
                    if (f12 > 0.0f && (f10 & 2) == 0) {
                        return;
                    }
                }
                this.f44111i = 0.0f;
                this.f44110h = 0.0f;
                this.f44114l = motionEvent.getPointerId(0);
                F(v10, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(RecyclerView.G g10, boolean z10) {
        for (int size = this.f44118p.size() - 1; size >= 0; size--) {
            g gVar = this.f44118p.get(size);
            if (gVar.f44146e == g10) {
                gVar.f44153l |= z10;
                if (!gVar.f44154m) {
                    gVar.a();
                }
                this.f44118p.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public g s(MotionEvent motionEvent) {
        if (this.f44118p.isEmpty()) {
            return null;
        }
        View t10 = t(motionEvent);
        for (int size = this.f44118p.size() - 1; size >= 0; size--) {
            g gVar = this.f44118p.get(size);
            if (gVar.f44146e.itemView == t10) {
                return gVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View t(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.G g10 = this.f44105c;
        if (g10 != null) {
            View view = g10.itemView;
            if (y(view, x10, y10, this.f44112j + this.f44110h, this.f44113k + this.f44111i)) {
                return view;
            }
        }
        for (int size = this.f44118p.size() - 1; size >= 0; size--) {
            g gVar = this.f44118p.get(size);
            View view2 = gVar.f44146e.itemView;
            if (y(view2, x10, y10, gVar.f44151j, gVar.f44152k)) {
                return view2;
            }
        }
        return this.f44120r.X(x10, y10);
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        int size = this.f44118p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f44118p.get(i10).f44154m) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void z(RecyclerView.G g10) {
        if (!this.f44120r.isLayoutRequested() && this.f44116n == 2) {
            float j10 = this.f44115m.j(g10);
            int i10 = (int) (this.f44112j + this.f44110h);
            int i11 = (int) (this.f44113k + this.f44111i);
            if (((float) Math.abs(i11 - g10.itemView.getTop())) >= ((float) g10.itemView.getHeight()) * j10 || ((float) Math.abs(i10 - g10.itemView.getLeft())) >= ((float) g10.itemView.getWidth()) * j10) {
                List<RecyclerView.G> u10 = u(g10);
                if (u10.size() != 0) {
                    RecyclerView.G b10 = this.f44115m.b(g10, u10, i10, i11);
                    if (b10 == null) {
                        this.f44123u.clear();
                        this.f44124v.clear();
                        return;
                    }
                    int absoluteAdapterPosition = b10.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = g10.getAbsoluteAdapterPosition();
                    if (this.f44115m.y(this.f44120r, g10, b10)) {
                        this.f44115m.z(this.f44120r, g10, absoluteAdapterPosition2, b10, absoluteAdapterPosition, i10, i11);
                    }
                }
            }
        }
    }
}
