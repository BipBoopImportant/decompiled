package Vi;

import Fz.w;
import Lg.c;
import Lg.d;
import XH.C16807N;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LVi/n0;", "LLg/a;", "LVi/o0;", "Lkotlin/Function2;", "", "LXH/N;", "selectedItem", "<init>", "(LnI/p;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/n0$a;", "f", "(Landroid/view/ViewGroup;)LVi/n0$a;", "b", "LnI/p;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 extends Lg.a<o0> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<String, String, C16807N> f88607b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LVi/n0$a;", "LLg/c;", "LVi/o0;", "LFz/w;", "binding", "<init>", "(LVi/n0;LFz/w;)V", "viewModel", "LXH/N;", "l", "(LVi/o0;)V", "h", "LFz/w;", "LLg/d;", "i", "LLg/d;", "listAdapter", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<o0> {

        /* renamed from: h  reason: collision with root package name */
        private final w f88608h;

        /* renamed from: i  reason: collision with root package name */
        private final d f88609i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ n0 f88610j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Vi.n0 r11, Fz.w r12) {
            /*
                r10 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                r10.f88610j = r11
                androidx.recyclerview.widget.RecyclerView r0 = r12.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                r1 = 0
                r10.<init>((android.view.View) r0, (boolean) r1)
                r10.f88608h = r12
                Lg.d r0 = new Lg.d
                Vi.q0 r2 = new Vi.q0
                nI.p r11 = r11.f88607b
                r2.<init>(r11)
                r11 = 1
                Lg.a[] r11 = new Lg.a[r11]
                r11[r1] = r2
                r0.<init>((Lg.a<?>[]) r11)
                r10.f88609i = r0
                androidx.recyclerview.widget.RecyclerView r11 = r12.f110214b
                androidx.recyclerview.widget.LinearLayoutManager r12 = new androidx.recyclerview.widget.LinearLayoutManager
                android.content.Context r2 = r11.getContext()
                r12.<init>(r2, r1, r1)
                r11.setLayoutManager(r12)
                r11.setAdapter(r0)
                il.f r12 = new il.f
                r0 = 16
                float r0 = Xo.e.a(r0)
                int r4 = (int) r0
                il.f$a r6 = il.f.a.HORIZONTAL
                r8 = 10
                r9 = 0
                r5 = 0
                r7 = 0
                r3 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r11.j(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Vi.n0.a.<init>(Vi.n0, Fz.w):void");
        }

        /* renamed from: l */
        public void c(o0 o0Var) {
            RecyclerView.q layoutManager;
            C17542s.j(o0Var, "viewModel");
            super.c(o0Var);
            d.q(this.f88609i, o0Var.g(), true, (C17642l) null, 4, (Object) null);
            Iterator<r0> it = o0Var.g().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (it.next().n()) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1 && (layoutManager = this.f88608h.f110214b.getLayoutManager()) != null) {
                layoutManager.X1(i10);
            }
        }
    }

    public n0(p<? super String, ? super String, C16807N> pVar) {
        C17542s.j(pVar, "selectedItem");
        this.f88607b = pVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof o0;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        w c10 = w.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
