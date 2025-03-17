package Fp;

import Ep.b;
import Lg.c;
import Lg.e;
import Xo.f;
import android.view.View;
import android.view.ViewGroup;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFp/d;", "LLg/a;", "LFp/c;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends Lg.a<c> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LFp/d$a;", "LLg/c;", "LFp/c;", "LEp/b;", "binding", "<init>", "(LFp/d;LEp/b;)V", "viewModel", "LXH/N;", "l", "(LFp/c;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "LEp/b;", "getBinding", "()LEp/b;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<c> {

        /* renamed from: h  reason: collision with root package name */
        private final b f81005h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f81006i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Fp.d r2, Ep.b r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f81006i = r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 1
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f81005h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fp.d.a.<init>(Fp.d, Ep.b):void");
        }

        public void i(View view) {
            C17542s.j(view, "view");
            ((c) g()).c().invoke();
        }

        /* renamed from: l */
        public void c(c cVar) {
            C17542s.j(cVar, "viewModel");
            super.c(cVar);
            this.f81005h.f80748c.setText(f.a(e.c(this, Oo.b.f84400I2)));
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof c;
    }

    public c<c> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        b c10 = b.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
