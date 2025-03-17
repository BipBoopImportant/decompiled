package Vi;

import Fz.z;
import Lg.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVi/k0;", "LLg/a;", "LVi/m0;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/k0$a;", "e", "(Landroid/view/ViewGroup;)LVi/k0$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 extends Lg.a<m0> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVi/k0$a;", "LLg/c;", "LVi/m0;", "LFz/z;", "binding", "<init>", "(LFz/z;)V", "viewModel", "LXH/N;", "l", "(LVi/m0;)V", "h", "LFz/z;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c<m0> {

        /* renamed from: h  reason: collision with root package name */
        private final z f88593h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(z zVar) {
            super((X4.a) zVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(zVar, "binding");
            this.f88593h = zVar;
        }

        /* renamed from: l */
        public void c(m0 m0Var) {
            C17542s.j(m0Var, "viewModel");
            super.c(m0Var);
            l0.a(this.f88593h, m0Var);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof m0;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        z c10 = z.c(from, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }
}
