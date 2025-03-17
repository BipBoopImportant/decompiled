package Vi;

import Fz.s;
import G2.b;
import Lg.c;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVi/d;", "LLg/a;", "LVi/e;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.d  reason: case insensitive filesystem */
public final class C10964d extends Lg.a<C10965e> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVi/d$a;", "LLg/c;", "LVi/e;", "LFz/s;", "binding", "<init>", "(LVi/d;LFz/s;)V", "viewModel", "LXH/N;", "l", "(LVi/e;)V", "h", "LFz/s;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vi.d$a */
    public final class a extends c<C10965e> {

        /* renamed from: h  reason: collision with root package name */
        private final s f88551h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C10964d f88552i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Vi.C10964d r2, Fz.s r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f88552i = r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 0
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f88551h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Vi.C10964d.a.<init>(Vi.d, Fz.s):void");
        }

        /* renamed from: l */
        public void c(C10965e eVar) {
            C17542s.j(eVar, "viewModel");
            super.c(eVar);
            s sVar = this.f88551h;
            sVar.f110191d.setText(eVar.b());
            sVar.f110190c.setText(b.b(eVar.a(), 0, (Html.ImageGetter) null, (Html.TagHandler) null));
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10965e;
    }

    public c<C10965e> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        s c10 = s.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
