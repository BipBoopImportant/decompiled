package androidx.compose.ui.window;

import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.r;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8B@BX\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010/\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R$\u00101\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00158\u0014@RX\u000e¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b0\u0010,R\u0014\u00104\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b5\u00103¨\u00067"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/i;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "LU0/r;", "parent", "Lkotlin/Function0;", "LXH/N;", "content", "l", "(LU0/r;LnI/p;)V", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "a", "(LU0/m;I)V", "i", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "j", "LU0/r0;", "getContent", "()LnI/p;", "setContent", "(LnI/p;)V", "k", "Z", "()Z", "m", "(Z)V", "usePlatformDefaultWidth", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DialogLayout extends AbstractComposeView implements i {

    /* renamed from: i  reason: collision with root package name */
    private final Window f19837i;

    /* renamed from: j  reason: collision with root package name */
    private final C4899r0 f19838j = u1.e(f.f19939a.a(), (o1) null, 2, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private boolean f19839k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f19840l;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DialogLayout f19841c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f19842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DialogLayout dialogLayout, int i10) {
            super(2);
            this.f19841c = dialogLayout;
            this.f19842d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f19841c.a(mVar, M0.a(this.f19842d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public DialogLayout(Context context, Window window) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f19837i = window;
    }

    private final p<C4889m, Integer, C16807N> getContent() {
        return (p) this.f19838j.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f19838j.setValue(pVar);
    }

    public void a(C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1735448596);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1735448596, i11, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().invoke(k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(this, i10));
        }
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.g(z10, i10, i11, i12, i13);
        if (!this.f19839k && (childAt = getChildAt(0)) != null) {
            getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f19840l;
    }

    public Window getWindow() {
        return this.f19837i;
    }

    public void h(int i10, int i11) {
        if (this.f19839k) {
            super.h(i10, i11);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final boolean k() {
        return this.f19839k;
    }

    public final void l(r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        setParentCompositionContext(rVar);
        setContent(pVar);
        this.f19840l = true;
        d();
    }

    public final void m(boolean z10) {
        this.f19839k = z10;
    }
}
