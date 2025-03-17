package androidx.compose.ui.platform;

import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0014@RX\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LXH/N;", "a", "(LU0/m;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "content", "setContent", "(LnI/p;)V", "LU0/r0;", "i", "LU0/r0;", "", "<set-?>", "j", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeView extends AbstractComposeView {

    /* renamed from: k  reason: collision with root package name */
    public static final int f19171k = 8;

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0<p<C4889m, Integer, C16807N>> f19172i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19173j;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ComposeView f19174c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f19175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ComposeView composeView, int i10) {
            super(2);
            this.f19174c = composeView;
            this.f19175d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f19174c.a(mVar, M0.a(this.f19175d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public void a(C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(420213850);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            p value = this.f19172i.getValue();
            if (value == null) {
                k10.W(358373017);
            } else {
                k10.W(150107752);
                value.invoke(k10, 0);
            }
            k10.P();
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

    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f19173j;
    }

    public final void setContent(p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f19173j = true;
        this.f19172i.setValue(pVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19172i = u1.e((Object) null, (o1) null, 2, (Object) null);
    }
}
