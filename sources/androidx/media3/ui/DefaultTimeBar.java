package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.D;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import t3.C5950a;
import t3.N;
import w4.C8913c;
import w4.C8914d;

public class DefaultTimeBar extends View implements D {

    /* renamed from: A  reason: collision with root package name */
    private int f43115A;

    /* renamed from: B  reason: collision with root package name */
    private long f43116B;

    /* renamed from: C  reason: collision with root package name */
    private int f43117C;

    /* renamed from: D  reason: collision with root package name */
    private Rect f43118D;

    /* renamed from: E  reason: collision with root package name */
    private ValueAnimator f43119E;

    /* renamed from: F  reason: collision with root package name */
    private float f43120F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f43121G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f43122H;

    /* renamed from: I  reason: collision with root package name */
    private long f43123I;

    /* renamed from: J  reason: collision with root package name */
    private long f43124J;

    /* renamed from: K  reason: collision with root package name */
    private long f43125K;

    /* renamed from: L  reason: collision with root package name */
    private long f43126L;

    /* renamed from: M  reason: collision with root package name */
    private int f43127M;

    /* renamed from: N  reason: collision with root package name */
    private long[] f43128N;

    /* renamed from: O  reason: collision with root package name */
    private boolean[] f43129O;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f43130a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f43131b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f43132c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f43133d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Paint f43134e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f43135f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f43136g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f43137h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f43138i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f43139j;

    /* renamed from: k  reason: collision with root package name */
    private final Drawable f43140k;

    /* renamed from: l  reason: collision with root package name */
    private final int f43141l;

    /* renamed from: m  reason: collision with root package name */
    private final int f43142m;

    /* renamed from: n  reason: collision with root package name */
    private final int f43143n;

    /* renamed from: o  reason: collision with root package name */
    private final int f43144o;

    /* renamed from: p  reason: collision with root package name */
    private final int f43145p;

    /* renamed from: q  reason: collision with root package name */
    private final int f43146q;

    /* renamed from: r  reason: collision with root package name */
    private final int f43147r;

    /* renamed from: s  reason: collision with root package name */
    private final int f43148s;

    /* renamed from: t  reason: collision with root package name */
    private final int f43149t;

    /* renamed from: u  reason: collision with root package name */
    private final StringBuilder f43150u;

    /* renamed from: v  reason: collision with root package name */
    private final Formatter f43151v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f43152w;

    /* renamed from: x  reason: collision with root package name */
    private final CopyOnWriteArraySet<D.a> f43153x;

    /* renamed from: y  reason: collision with root package name */
    private final Point f43154y;

    /* renamed from: z  reason: collision with root package name */
    private final float f43155z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        AttributeSet attributeSet3 = attributeSet2;
        Paint paint = new Paint();
        this.f43134e = paint;
        Paint paint2 = new Paint();
        this.f43135f = paint2;
        Paint paint3 = new Paint();
        this.f43136g = paint3;
        Paint paint4 = new Paint();
        this.f43137h = paint4;
        Paint paint5 = new Paint();
        this.f43138i = paint5;
        Paint paint6 = new Paint();
        this.f43139j = paint6;
        paint6.setAntiAlias(true);
        this.f43153x = new CopyOnWriteArraySet<>();
        this.f43154y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f43155z = f10;
        this.f43149t = e(f10, -50);
        int e10 = e(f10, 4);
        int e11 = e(f10, 26);
        int e12 = e(f10, 4);
        int e13 = e(f10, 12);
        int e14 = e(f10, 0);
        int e15 = e(f10, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint4;
            Paint paint8 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, w4.D.f57048e, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(w4.D.f57070p);
                this.f43140k = drawable;
                if (drawable != null) {
                    q(drawable);
                    e11 = Math.max(drawable.getMinimumHeight(), e11);
                }
                this.f43141l = obtainStyledAttributes.getDimensionPixelSize(w4.D.f57056i, e10);
                this.f43142m = obtainStyledAttributes.getDimensionPixelSize(w4.D.f57074r, e11);
                this.f43143n = obtainStyledAttributes.getInt(w4.D.f57054h, 0);
                this.f43144o = obtainStyledAttributes.getDimensionPixelSize(w4.D.f57052g, e12);
                this.f43145p = obtainStyledAttributes.getDimensionPixelSize(w4.D.f57072q, e13);
                this.f43146q = obtainStyledAttributes.getDimensionPixelSize(w4.D.f57066n, e14);
                this.f43147r = obtainStyledAttributes.getDimensionPixelSize(w4.D.f57068o, e15);
                int i12 = obtainStyledAttributes.getInt(w4.D.f57062l, -1);
                int i13 = obtainStyledAttributes.getInt(w4.D.f57064m, -1);
                int i14 = obtainStyledAttributes.getInt(w4.D.f57058j, -855638017);
                int i15 = obtainStyledAttributes.getInt(w4.D.f57076s, 872415231);
                int i16 = obtainStyledAttributes.getInt(w4.D.f57050f, -1291845888);
                int i17 = obtainStyledAttributes.getInt(w4.D.f57060k, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint7.setColor(i16);
                paint8.setColor(i17);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f43141l = e10;
            this.f43142m = e11;
            this.f43143n = 0;
            this.f43144o = e12;
            this.f43145p = e13;
            this.f43146q = e14;
            this.f43147r = e15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f43140k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f43150u = sb2;
        this.f43151v = new Formatter(sb2, Locale.getDefault());
        this.f43152w = new C8913c(this);
        Drawable drawable2 = this.f43140k;
        if (drawable2 != null) {
            this.f43148s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f43148s = (Math.max(this.f43146q, Math.max(this.f43145p, this.f43147r)) + 1) / 2;
        }
        this.f43120F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f43119E = valueAnimator;
        valueAnimator.addUpdateListener(new C8914d(this));
        this.f43124J = -9223372036854775807L;
        this.f43116B = -9223372036854775807L;
        this.f43115A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int e(float f10, int i10) {
        return (int) ((((float) i10) * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        if (this.f43124J > 0) {
            Rect rect = this.f43133d;
            int p10 = N.p(rect.right, rect.left, this.f43131b.right);
            int centerY = this.f43133d.centerY();
            Drawable drawable = this.f43140k;
            if (drawable == null) {
                canvas.drawCircle((float) p10, (float) centerY, (float) ((int) ((((float) ((this.f43122H || isFocused()) ? this.f43147r : isEnabled() ? this.f43145p : this.f43146q)) * this.f43120F) / 2.0f)), this.f43139j);
                return;
            }
            int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f43120F)) / 2;
            int intrinsicHeight = ((int) (((float) this.f43140k.getIntrinsicHeight()) * this.f43120F)) / 2;
            this.f43140k.setBounds(p10 - intrinsicWidth, centerY - intrinsicHeight, p10 + intrinsicWidth, centerY + intrinsicHeight);
            this.f43140k.draw(canvas);
        }
    }

    private void g(Canvas canvas) {
        int height = this.f43131b.height();
        int centerY = this.f43131b.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.f43124J <= 0) {
            Rect rect = this.f43131b;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i10, this.f43136g);
            return;
        }
        Rect rect2 = this.f43132c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.f43131b.left, i12), this.f43133d.right);
        int i13 = this.f43131b.right;
        if (max < i13) {
            canvas.drawRect((float) max, (float) centerY, (float) i13, (float) i10, this.f43136g);
        }
        int max2 = Math.max(i11, this.f43133d.right);
        if (i12 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i12, (float) i10, this.f43135f);
        }
        if (this.f43133d.width() > 0) {
            Rect rect3 = this.f43133d;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i10, this.f43134e);
        }
        if (this.f43127M != 0) {
            long[] jArr = (long[]) C5950a.e(this.f43128N);
            boolean[] zArr = (boolean[]) C5950a.e(this.f43129O);
            int i14 = this.f43144o / 2;
            for (int i15 = 0; i15 < this.f43127M; i15++) {
                long q10 = N.q(jArr[i15], 0, this.f43124J);
                Rect rect4 = this.f43131b;
                int min = rect4.left + Math.min(rect4.width() - this.f43144o, Math.max(0, ((int) ((((long) this.f43131b.width()) * q10) / this.f43124J)) - i14));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f43144o), (float) i10, zArr[i15] ? this.f43138i : this.f43137h);
            }
        }
    }

    private long getPositionIncrement() {
        long j10 = this.f43116B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f43124J;
        if (j11 == -9223372036854775807L) {
            return 0;
        }
        return j11 / ((long) this.f43115A);
    }

    private String getProgressText() {
        return N.m0(this.f43150u, this.f43151v, this.f43125K);
    }

    private long getScrubberPosition() {
        if (this.f43131b.width() <= 0 || this.f43124J == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f43133d.width()) * this.f43124J) / ((long) this.f43131b.width());
    }

    private boolean j(float f10, float f11) {
        return this.f43130a.contains((int) f10, (int) f11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        w(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.f43120F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f43130a);
    }

    private void m(float f10) {
        Rect rect = this.f43133d;
        Rect rect2 = this.f43131b;
        rect.right = N.p((int) f10, rect2.left, rect2.right);
    }

    private static int n(float f10, int i10) {
        return (int) (((float) i10) / f10);
    }

    private Point o(MotionEvent motionEvent) {
        this.f43154y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f43154y;
    }

    private boolean p(long j10) {
        long j11 = this.f43124J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f43122H ? this.f43123I : this.f43125K;
        long q10 = N.q(j12 + j10, 0, j11);
        if (q10 == j12) {
            return false;
        }
        if (!this.f43122H) {
            v(q10);
        } else {
            z(q10);
        }
        x();
        return true;
    }

    private boolean q(Drawable drawable) {
        return N.f29462a >= 23 && r(drawable, getLayoutDirection());
    }

    private static boolean r(Drawable drawable, int i10) {
        return N.f29462a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void s(int i10, int i11) {
        Rect rect = this.f43118D;
        if (rect == null || rect.width() != i10 || this.f43118D.height() != i11) {
            Rect rect2 = new Rect(0, 0, i10, i11);
            this.f43118D = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    private void v(long j10) {
        this.f43123I = j10;
        this.f43122H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<D.a> it = this.f43153x.iterator();
        while (it.hasNext()) {
            it.next().C(this, j10);
        }
    }

    private void w(boolean z10) {
        removeCallbacks(this.f43152w);
        this.f43122H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<D.a> it = this.f43153x.iterator();
        while (it.hasNext()) {
            it.next().K(this, this.f43123I, z10);
        }
    }

    private void x() {
        this.f43132c.set(this.f43131b);
        this.f43133d.set(this.f43131b);
        long j10 = this.f43122H ? this.f43123I : this.f43125K;
        if (this.f43124J > 0) {
            Rect rect = this.f43132c;
            Rect rect2 = this.f43131b;
            rect.right = Math.min(rect2.left + ((int) ((((long) this.f43131b.width()) * this.f43126L) / this.f43124J)), rect2.right);
            int width = (int) ((((long) this.f43131b.width()) * j10) / this.f43124J);
            Rect rect3 = this.f43133d;
            Rect rect4 = this.f43131b;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f43132c;
            int i10 = this.f43131b.left;
            rect5.right = i10;
            this.f43133d.right = i10;
        }
        invalidate(this.f43130a);
    }

    private void y() {
        Drawable drawable = this.f43140k;
        if (drawable != null && drawable.isStateful() && this.f43140k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void z(long j10) {
        if (this.f43123I != j10) {
            this.f43123I = j10;
            Iterator<D.a> it = this.f43153x.iterator();
            while (it.hasNext()) {
                it.next().G(this, j10);
            }
        }
    }

    public void a(D.a aVar) {
        C5950a.e(aVar);
        this.f43153x.add(aVar);
    }

    public void b(long[] jArr, boolean[] zArr, int i10) {
        C5950a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f43127M = i10;
        this.f43128N = jArr;
        this.f43129O = zArr;
        x();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y();
    }

    public long getPreferredUpdateDelay() {
        int n10 = n(this.f43155z, this.f43131b.width());
        if (n10 != 0) {
            long j10 = this.f43124J;
            if (!(j10 == 0 || j10 == -9223372036854775807L)) {
                return j10 / ((long) n10);
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(long j10) {
        if (this.f43119E.isStarted()) {
            this.f43119E.cancel();
        }
        this.f43119E.setFloatValues(new float[]{this.f43120F, 0.0f});
        this.f43119E.setDuration(j10);
        this.f43119E.start();
    }

    public void i(boolean z10) {
        if (this.f43119E.isStarted()) {
            this.f43119E.cancel();
        }
        this.f43121G = z10;
        this.f43120F = 0.0f;
        invalidate(this.f43130a);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f43140k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f43122H && !z10) {
            w(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f43124J > 0) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (p(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f43152w);
        postDelayed(r4.f43152w, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.p(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f43152w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f43152w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f43122H
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.w(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.f43121G ? 0 : this.f43148s;
        if (this.f43143n == 1) {
            i15 = (i17 - getPaddingBottom()) - this.f43142m;
            int i19 = this.f43141l;
            i14 = ((i17 - getPaddingBottom()) - i19) - Math.max(i18 - (i19 / 2), 0);
        } else {
            i15 = (i17 - this.f43142m) / 2;
            i14 = (i17 - this.f43141l) / 2;
        }
        this.f43130a.set(paddingLeft, i15, paddingRight, this.f43142m + i15);
        Rect rect = this.f43131b;
        Rect rect2 = this.f43130a;
        rect.set(rect2.left + i18, i14, rect2.right - i18, this.f43141l + i14);
        if (N.f29462a >= 29) {
            s(i16, i17);
        }
        x();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f43142m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f43142m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        y();
    }

    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f43140k;
        if (drawable != null && r(drawable, i10)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            long r2 = r7.f43124J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x0076
        L_0x0010:
            android.graphics.Point r0 = r7.o(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r5 = 3
            if (r3 == r4) goto L_0x004e
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004e
            goto L_0x0076
        L_0x0028:
            boolean r8 = r7.f43122H
            if (r8 == 0) goto L_0x0076
            int r8 = r7.f43149t
            if (r0 >= r8) goto L_0x003a
            int r8 = r7.f43117C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m(r8)
            goto L_0x0040
        L_0x003a:
            r7.f43117C = r2
            float r8 = (float) r2
            r7.m(r8)
        L_0x0040:
            long r0 = r7.getScrubberPosition()
            r7.z(r0)
            r7.x()
            r7.invalidate()
            return r4
        L_0x004e:
            boolean r0 = r7.f43122H
            if (r0 == 0) goto L_0x0076
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0059
            r1 = r4
        L_0x0059:
            r7.w(r1)
            return r4
        L_0x005d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.j(r8, r0)
            if (r0 == 0) goto L_0x0076
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.v(r0)
            r7.x()
            r7.invalidate()
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f43124J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (p(-getPositionIncrement())) {
                w(false);
            }
        } else if (i10 != 4096) {
            return false;
        } else {
            if (p(getPositionIncrement())) {
                w(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f43137h.setColor(i10);
        invalidate(this.f43130a);
    }

    public void setBufferedColor(int i10) {
        this.f43135f.setColor(i10);
        invalidate(this.f43130a);
    }

    public void setBufferedPosition(long j10) {
        if (this.f43126L != j10) {
            this.f43126L = j10;
            x();
        }
    }

    public void setDuration(long j10) {
        if (this.f43124J != j10) {
            this.f43124J = j10;
            if (this.f43122H && j10 == -9223372036854775807L) {
                w(true);
            }
            x();
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f43122H && !z10) {
            w(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        C5950a.a(i10 > 0);
        this.f43115A = i10;
        this.f43116B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        C5950a.a(j10 > 0);
        this.f43115A = -1;
        this.f43116B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f43138i.setColor(i10);
        invalidate(this.f43130a);
    }

    public void setPlayedColor(int i10) {
        this.f43134e.setColor(i10);
        invalidate(this.f43130a);
    }

    public void setPosition(long j10) {
        if (this.f43125K != j10) {
            this.f43125K = j10;
            setContentDescription(getProgressText());
            x();
        }
    }

    public void setScrubberColor(int i10) {
        this.f43139j.setColor(i10);
        invalidate(this.f43130a);
    }

    public void setUnplayedColor(int i10) {
        this.f43136g.setColor(i10);
        invalidate(this.f43130a);
    }

    public void t() {
        if (this.f43119E.isStarted()) {
            this.f43119E.cancel();
        }
        this.f43121G = false;
        this.f43120F = 1.0f;
        invalidate(this.f43130a);
    }

    public void u(long j10) {
        if (this.f43119E.isStarted()) {
            this.f43119E.cancel();
        }
        this.f43121G = false;
        this.f43119E.setFloatValues(new float[]{this.f43120F, 1.0f});
        this.f43119E.setDuration(j10);
        this.f43119E.start();
    }
}
