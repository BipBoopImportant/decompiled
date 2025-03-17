package androidx.compose.ui.graphics.layer;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5674n;
import p1.C5701G;
import p1.C5732n0;
import p1.C5734o0;
import r1.C5815a;
import r1.e;
import r1.f;
import s1.C5905c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b'\u0010\u001d\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R*\u0010>\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b8\u0000@@X\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u00105R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "ownerView", "Lp1/o0;", "canvasHolder", "Lr1/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;Lp1/o0;Lr1/a;)V", "Landroid/graphics/Outline;", "outline", "", "d", "(Landroid/graphics/Outline;)Z", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Ls1/c;", "parentLayer", "Lkotlin/Function1;", "Lr1/f;", "LXH/N;", "drawBlock", "c", "(Lc2/d;Lc2/t;Ls1/c;LnI/l;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Lp1/o0;", "getCanvasHolder", "()Lp1/o0;", "Lr1/a;", "Z", "setInvalidated", "(Z)V", "isInvalidated", "e", "Landroid/graphics/Outline;", "layerOutline", "value", "f", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "g", "Lc2/d;", "h", "Lc2/t;", "i", "LnI/l;", "j", "Ls1/c;", "k", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewLayer extends View {

    /* renamed from: k  reason: collision with root package name */
    public static final b f18950k = new b((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private static final ViewOutlineProvider f18951l = new a();

    /* renamed from: a  reason: collision with root package name */
    private final View f18952a;

    /* renamed from: b  reason: collision with root package name */
    private final C5734o0 f18953b;

    /* renamed from: c  reason: collision with root package name */
    private final C5815a f18954c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18955d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Outline f18956e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18957f = true;

    /* renamed from: g  reason: collision with root package name */
    private d f18958g = e.a();

    /* renamed from: h  reason: collision with root package name */
    private t f18959h = t.Ltr;

    /* renamed from: i  reason: collision with root package name */
    private C17642l<? super f, C16807N> f18960i = a.f18962a.a();

    /* renamed from: j  reason: collision with root package name */
    private C5905c f18961j;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/graphics/layer/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "LXH/N;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            Outline a10;
            if ((view instanceof ViewLayer) && (a10 = ((ViewLayer) view).f18956e) != null) {
                outline.set(a10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer$b;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public ViewLayer(View view, C5734o0 o0Var, C5815a aVar) {
        super(view.getContext());
        this.f18952a = view;
        this.f18953b = o0Var;
        this.f18954c = aVar;
        setOutlineProvider(f18951l);
        setWillNotDraw(false);
        setClipBounds((Rect) null);
    }

    public final boolean b() {
        return this.f18955d;
    }

    public final void c(d dVar, t tVar, C5905c cVar, C17642l<? super f, C16807N> lVar) {
        this.f18958g = dVar;
        this.f18959h = tVar;
        this.f18960i = lVar;
        this.f18961j = cVar;
    }

    public final boolean d(Outline outline) {
        this.f18956e = outline;
        return b.f18966a.a(this);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C5734o0 o0Var = this.f18953b;
        Canvas a10 = o0Var.a().a();
        o0Var.a().b(canvas);
        C5701G a11 = o0Var.a();
        C5815a aVar = this.f18954c;
        d dVar = this.f18958g;
        t tVar = this.f18959h;
        long a12 = C5674n.a((float) getWidth(), (float) getHeight());
        C5905c cVar = this.f18961j;
        C17642l<? super f, C16807N> lVar = this.f18960i;
        d density = aVar.I1().getDensity();
        t layoutDirection = aVar.I1().getLayoutDirection();
        C5732n0 e10 = aVar.I1().e();
        long b10 = aVar.I1().b();
        C5905c h10 = aVar.I1().h();
        Canvas canvas2 = a10;
        r1.d I12 = aVar.I1();
        I12.a(dVar);
        I12.d(tVar);
        I12.f(a11);
        I12.g(a12);
        I12.i(cVar);
        a11.t();
        try {
            lVar.invoke(aVar);
            a11.n();
            r1.d I13 = aVar.I1();
            I13.a(density);
            I13.d(layoutDirection);
            I13.f(e10);
            I13.g(b10);
            I13.i(h10);
            o0Var.a().b(canvas2);
            this.f18955d = false;
        } catch (Throwable th2) {
            C5905c cVar2 = h10;
            Throwable th3 = th2;
            a11.n();
            r1.d I14 = aVar.I1();
            I14.a(density);
            I14.d(layoutDirection);
            I14.f(e10);
            I14.g(b10);
            I14.i(cVar2);
            throw th3;
        }
    }

    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f18957f;
    }

    public final C5734o0 getCanvasHolder() {
        return this.f18953b;
    }

    public final View getOwnerView() {
        return this.f18952a;
    }

    public boolean hasOverlappingRendering() {
        return this.f18957f;
    }

    public void invalidate() {
        if (!this.f18955d) {
            this.f18955d = true;
            super.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f18957f != z10) {
            this.f18957f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f18955d = z10;
    }
}
