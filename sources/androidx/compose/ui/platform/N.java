package androidx.compose.ui.platform;

import I1.c;
import XH.C16807N;
import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import o1.C5669i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0016@RX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/N;", "Landroidx/compose/ui/platform/m1;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lo1/i;", "rect", "Lkotlin/Function0;", "LXH/N;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "c", "(Lo1/i;LnI/a;LnI/a;LnI/a;LnI/a;)V", "b", "()V", "a", "Landroid/view/View;", "Landroid/view/ActionMode;", "Landroid/view/ActionMode;", "actionMode", "LI1/c;", "LI1/c;", "textActionModeCallback", "Landroidx/compose/ui/platform/o1;", "<set-?>", "d", "Landroidx/compose/ui/platform/o1;", "i", "()Landroidx/compose/ui/platform/o1;", "status", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N implements m1 {

    /* renamed from: a  reason: collision with root package name */
    private final View f19301a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ActionMode f19302b;

    /* renamed from: c  reason: collision with root package name */
    private final c f19303c = new c(new a(this), (C5669i) null, (C17631a) null, (C17631a) null, (C17631a) null, (C17631a) null, 62, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private o1 f19304d = o1.Hidden;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f19305c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N n10) {
            super(0);
            this.f19305c = n10;
        }

        public final void invoke() {
            this.f19305c.f19302b = null;
        }
    }

    public N(View view) {
        this.f19301a = view;
    }

    public void b() {
        this.f19304d = o1.Hidden;
        ActionMode actionMode = this.f19302b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f19302b = null;
    }

    public void c(C5669i iVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4) {
        this.f19303c.l(iVar);
        this.f19303c.h(aVar);
        this.f19303c.i(aVar3);
        this.f19303c.j(aVar2);
        this.f19303c.k(aVar4);
        ActionMode actionMode = this.f19302b;
        if (actionMode == null) {
            this.f19304d = o1.Shown;
            this.f19302b = n1.f19531a.b(this.f19301a, new I1.a(this.f19303c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    public o1 i() {
        return this.f19304d;
    }
}
