package androidx.compose.ui.platform;

import XH.C16807N;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Landroidx/lifecycle/r;", "lifecycle", "Lkotlin/Function0;", "LXH/N;", "c", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/lifecycle/r;)LnI/a;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v1 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f19669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5218v f19670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, C5218v vVar) {
            super(0);
            this.f19669c = rVar;
            this.f19670d = vVar;
        }

        public final void invoke() {
            this.f19669c.g(this.f19670d);
        }
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> c(AbstractComposeView abstractComposeView, r rVar) {
        if (rVar.d().compareTo(r.b.DESTROYED) > 0) {
            u1 u1Var = new u1(abstractComposeView);
            rVar.c(u1Var);
            return new a(rVar, u1Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + rVar + "is already destroyed").toString());
    }

    /* access modifiers changed from: private */
    public static final void d(AbstractComposeView abstractComposeView, C5221y yVar, r.a aVar) {
        if (aVar == r.a.ON_DESTROY) {
            abstractComposeView.e();
        }
    }
}
