package Vi;

import Fz.y;
import HJ.C15854t;
import Lg.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVi/i0;", "LLg/a;", "LVi/j0;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/i0$a;", "e", "(Landroid/view/ViewGroup;)LVi/i0$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 extends Lg.a<j0> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVi/i0$a;", "LLg/c;", "LVi/j0;", "LFz/y;", "binding", "<init>", "(LVi/i0;LFz/y;)V", "viewModel", "LXH/N;", "l", "(LVi/j0;)V", "h", "LFz/y;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<j0> {

        /* renamed from: h  reason: collision with root package name */
        private final y f88586h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i0 f88587i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Vi.i0 r4, Fz.y r5) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r5, r0)
                r3.f88587i = r4
                androidx.constraintlayout.widget.ConstraintLayout r4 = r5.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r4, r0)
                r0 = 2
                r1 = 0
                r2 = 0
                r3.<init>((android.view.View) r4, (boolean) r2, (int) r0, (kotlin.jvm.internal.DefaultConstructorMarker) r1)
                r3.f88586h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Vi.i0.a.<init>(Vi.i0, Fz.y):void");
        }

        /* renamed from: l */
        public void c(j0 j0Var) {
            C17542s.j(j0Var, "viewModel");
            super.c(j0Var);
            y yVar = this.f88586h;
            yVar.f110232i.setText(j0Var.c());
            if (!C15854t.v0(j0Var.a())) {
                yVar.f110225b.setVisibility(0);
                yVar.f110227d.setText(j0Var.a());
            } else {
                yVar.f110225b.setVisibility(8);
            }
            if (!C15854t.v0(j0Var.b())) {
                yVar.f110228e.setVisibility(0);
                yVar.f110230g.setText(j0Var.b());
                return;
            }
            yVar.f110228e.setVisibility(8);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof j0;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        y c10 = y.c(from, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
