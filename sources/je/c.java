package Je;

import Ge.j;
import XH.C16807N;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00060\u0013R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LJe/c;", "LLg/a;", "LJe/d;", "", "enableStreetNumberButton", "Lkotlin/Function1;", "", "LXH/N;", "onAddStreetNumberClicked", "LOe/a;", "onAddressClicked", "<init>", "(ZLnI/l;LnI/l;)V", "", "item", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LJe/c$a;", "h", "(Landroid/view/ViewGroup;)LJe/c$a;", "b", "Z", "c", "LnI/l;", "d", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends Lg.a<d> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f61263b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<String, C16807N> f61264c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17642l<Oe.a, C16807N> f61265d;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LJe/c$a;", "LLg/c;", "LJe/d;", "LQe/a;", "binding", "<init>", "(LJe/c;LQe/a;)V", "viewModel", "LXH/N;", "l", "(LJe/d;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "LQe/a;", "getBinding", "()LQe/a;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends Lg.c<d> {

        /* renamed from: h  reason: collision with root package name */
        private final Qe.a f61266h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f61267i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, Qe.a aVar) {
            super((X4.a) aVar, true);
            C17542s.j(aVar, "binding");
            this.f61267i = cVar;
            this.f61266h = aVar;
        }

        public void i(View view) {
            C17542s.j(view, "view");
            this.f61267i.f61265d.invoke(new Oe.a(((d) g()).a(), ((d) g()).c()));
        }

        /* renamed from: l */
        public void c(d dVar) {
            C17542s.j(dVar, "viewModel");
            super.c(dVar);
            this.f61266h.f63070c.setText(dVar.a());
            this.f61266h.f63071d.setText(dVar.b());
            TextView textView = this.f61266h.f63069b;
            C17542s.i(textView, "addStreetNumber");
            j.b(textView, this.f61267i.f61263b, dVar.a(), dVar.b(), this.f61267i.f61264c);
        }
    }

    public c(boolean z10, C17642l<? super String, C16807N> lVar, C17642l<? super Oe.a, C16807N> lVar2) {
        C17542s.j(lVar, "onAddStreetNumberClicked");
        C17542s.j(lVar2, "onAddressClicked");
        this.f61263b = z10;
        this.f61264c = lVar;
        this.f61265d = lVar2;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof d;
    }

    /* renamed from: h */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        Qe.a c10 = Qe.a.c(from, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
