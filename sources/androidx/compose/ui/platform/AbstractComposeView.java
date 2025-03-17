package androidx.compose.ui.platform;

import G1.m0;
import U0.C4889m;
import U0.C4895p;
import U0.C4897q;
import U0.O0;
import U0.r;
import XH.C16807N;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import c1.c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\"J7\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0004¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J!\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00109J)\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010<J#\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010?J+\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010@J+\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\bA\u0010BJ3\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010C\u001a\u00020$H\u0014¢\u0006\u0004\bA\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u00101R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010GR(\u0010N\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010I8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u000e\u0010K\"\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010PR(\u0010T\u001a\u0004\u0018\u00010\r2\b\u0010J\u001a\u0004\u0018\u00010\r8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010R\"\u0004\bS\u0010\u0015R$\u0010X\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u001d\u0010V\u0012\u0004\bW\u0010\fR0\u0010]\u001a\u00020$2\u0006\u0010J\u001a\u00020$8F@FX\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010Y\u0012\u0004\b\\\u0010\f\u001a\u0004\bZ\u00101\"\u0004\b[\u00103R\u0016\u0010^\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010YR\u0016\u0010_\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010YR\u0018\u0010b\u001a\u00020$*\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020$8TX\u0004¢\u0006\u0006\u001a\u0004\bc\u00101R\u0011\u0010f\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\be\u00101¨\u0006g"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LXH/N;", "c", "()V", "LU0/r;", "b", "(LU0/r;)LU0/r;", "j", "()LU0/r;", "f", "parent", "setParentCompositionContext", "(LU0/r;)V", "Landroidx/compose/ui/platform/s1;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/s1;)V", "a", "(LU0/m;I)V", "d", "e", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "h", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "g", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "LU0/q;", "LU0/q;", "composition", "LU0/r;", "setParentContext", "parentContext", "Lkotlin/Function0;", "LnI/a;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "creatingComposition", "isTransitionGroupSet", "i", "(LU0/r;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<r> f18998a;

    /* renamed from: b  reason: collision with root package name */
    private IBinder f18999b;

    /* renamed from: c  reason: collision with root package name */
    private C4897q f19000c;

    /* renamed from: d  reason: collision with root package name */
    private r f19001d;

    /* renamed from: e  reason: collision with root package name */
    private C17631a<C16807N> f19002e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19003f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19004g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19005h;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AbstractComposeView f19006c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AbstractComposeView abstractComposeView) {
            super(2);
            this.f19006c = abstractComposeView;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
                }
                this.f19006c.a(mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    private final r b(r rVar) {
        r rVar2 = i(rVar) ? rVar : null;
        if (rVar2 != null) {
            this.f18998a = new WeakReference<>(rVar2);
        }
        return rVar;
    }

    private final void c() {
        if (!this.f19004g) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    /* JADX INFO: finally extract failed */
    private final void f() {
        if (this.f19000c == null) {
            try {
                this.f19004g = true;
                this.f19000c = K1.c(this, j(), c.c(-656146368, true, new a(this)));
                this.f19004g = false;
            } catch (Throwable th2) {
                this.f19004g = false;
                throw th2;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean i(r rVar) {
        return !(rVar instanceof O0) || ((O0) rVar).f0().getValue().compareTo(O0.d.ShuttingDown) > 0;
    }

    private final r j() {
        r rVar;
        r rVar2 = this.f19001d;
        if (rVar2 != null) {
            return rVar2;
        }
        r d10 = H1.d(this);
        r rVar3 = null;
        r b10 = d10 != null ? b(d10) : null;
        if (b10 != null) {
            return b10;
        }
        WeakReference<r> weakReference = this.f18998a;
        if (!(weakReference == null || (rVar = weakReference.get()) == null || !i(rVar))) {
            rVar3 = rVar;
        }
        r rVar4 = rVar3;
        return rVar4 == null ? b(H1.h(this)) : rVar4;
    }

    private final void setParentContext(r rVar) {
        if (this.f19001d != rVar) {
            this.f19001d = rVar;
            if (rVar != null) {
                this.f18998a = null;
            }
            C4897q qVar = this.f19000c;
            if (qVar != null) {
                qVar.b();
                this.f19000c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f18999b != iBinder) {
            this.f18999b = iBinder;
            this.f18998a = null;
        }
    }

    public abstract void a(C4889m mVar, int i10);

    public void addView(View view) {
        c();
        super.addView(view);
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void d() {
        if (this.f19001d != null || isAttachedToWindow()) {
            f();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
    }

    public final void e() {
        C4897q qVar = this.f19000c;
        if (qVar != null) {
            qVar.b();
        }
        this.f19000c = null;
        requestLayout();
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f19000c != null;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f19003f;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public boolean isTransitionGroup() {
        return !this.f19005h || super.isTransitionGroup();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f19003f = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((m0) childAt).setShowLayoutBounds(z10);
        }
    }

    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f19005h = true;
    }

    public final void setViewCompositionStrategy(s1 s1Var) {
        C17631a<C16807N> aVar = this.f19002e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f19002e = s1Var.a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        this.f19002e = s1.f19573a.a().a(this);
    }

    public void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    public void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }
}
