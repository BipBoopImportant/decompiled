package androidx.compose.material.ripple;

import N0.k;
import XH.C16807N;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import o1.C5667g;
import o1.C5673m;
import pI.C17752b;
import r0.o;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010\u0016\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0(ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u001aJ(\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u001aR\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u00103R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u00108R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010:\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bounded", "LXH/N;", "c", "(Z)V", "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lr0/o$b;", "interaction", "Lo1/m;", "size", "radius", "Lp1/v0;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Lr0/o$b;ZJIJFLnI/a;)V", "e", "f", "(JJF)V", "d", "Landroidx/compose/material/ripple/b;", "a", "Landroidx/compose/material/ripple/b;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "LnI/a;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RippleHostView extends View {

    /* renamed from: f  reason: collision with root package name */
    public static final a f18625f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18626g = 8;

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f18627h = {16842919, 16842910};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f18628i = new int[0];

    /* renamed from: a  reason: collision with root package name */
    private b f18629a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f18630b;

    /* renamed from: c  reason: collision with root package name */
    private Long f18631c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f18632d;

    /* renamed from: e  reason: collision with root package name */
    private C17631a<C16807N> f18633e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView$a;", "", "<init>", "()V", "", "MinimumRippleStateChangeTime", "J", "", "PressedState", "[I", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RippleHostView(Context context) {
        super(context);
    }

    private final void c(boolean z10) {
        b bVar = new b(z10);
        setBackground(bVar);
        this.f18629a = bVar;
    }

    private final void setRippleState(boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f18632d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f18631c;
        long longValue = currentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0);
        if (z10 || longValue >= 5) {
            int[] iArr = z10 ? f18627h : f18628i;
            b bVar = this.f18629a;
            if (bVar != null) {
                bVar.setState(iArr);
            }
        } else {
            k kVar = new k(this);
            this.f18632d = kVar;
            postDelayed(kVar, 50);
        }
        this.f18631c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        b bVar = rippleHostView.f18629a;
        if (bVar != null) {
            bVar.setState(f18628i);
        }
        rippleHostView.f18632d = null;
    }

    public final void b(o.b bVar, boolean z10, long j10, int i10, long j11, float f10, C17631a<C16807N> aVar) {
        boolean z11 = z10;
        if (this.f18629a == null || !C17542s.e(Boolean.valueOf(z10), this.f18630b)) {
            c(z10);
            this.f18630b = Boolean.valueOf(z10);
        }
        b bVar2 = this.f18629a;
        C17542s.g(bVar2);
        this.f18633e = aVar;
        int i11 = i10;
        bVar2.c(i10);
        f(j10, j11, f10);
        if (z11) {
            bVar2.setHotspot(C5667g.m(bVar.a()), C5667g.n(bVar.a()));
        } else {
            bVar2.setHotspot((float) bVar2.getBounds().centerX(), (float) bVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f18633e = null;
        Runnable runnable = this.f18632d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f18632d;
            C17542s.g(runnable2);
            runnable2.run();
        } else {
            b bVar = this.f18629a;
            if (bVar != null) {
                bVar.setState(f18628i);
            }
        }
        b bVar2 = this.f18629a;
        if (bVar2 != null) {
            bVar2.setVisible(false, false);
            unscheduleDrawable(bVar2);
        }
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, long j11, float f10) {
        b bVar = this.f18629a;
        if (bVar != null) {
            bVar.b(j11, f10);
            Rect rect = new Rect(0, 0, C17752b.e(C5673m.l(j10)), C17752b.e(C5673m.i(j10)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            bVar.setBounds(rect);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C17631a<C16807N> aVar = this.f18633e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }
}
