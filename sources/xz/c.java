package xz;

import Fz.C;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00060\u000fR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lxz/c;", "LLg/a;", "Lxz/d;", "Lkotlin/Function0;", "LXH/N;", "onTermsAndConditionsAccepted", "<init>", "(LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lxz/c$a;", "f", "(Landroid/view/ViewGroup;)Lxz/c$a;", "b", "LnI/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends Lg.a<d> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f132129b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxz/c$a;", "LLg/c;", "Lxz/d;", "LFz/C;", "binding", "<init>", "(Lxz/c;LFz/C;)V", "LXH/N;", "o", "()V", "viewModel", "n", "(Lxz/d;)V", "h", "LFz/C;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends Lg.c<d> {

        /* renamed from: h  reason: collision with root package name */
        private final C f132130h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f132131i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, C c10) {
            super((X4.a) c10, false);
            C17542s.j(c10, "binding");
            this.f132131i = cVar;
            this.f132130h = c10;
        }

        private final void o() {
            C c10 = this.f132130h;
            c cVar = this.f132131i;
            c10.f110062c.setOnCheckedChangeListener(new C15275a(c10));
            c10.f110063d.setOnClickListener(new b(cVar));
        }

        /* access modifiers changed from: private */
        public static final void p(C c10, CompoundButton compoundButton, boolean z10) {
            c10.f110063d.setEnabled(z10);
        }

        /* access modifiers changed from: private */
        public static final void q(c cVar, View view) {
            cVar.f132129b.invoke();
        }

        /* renamed from: n */
        public void c(d dVar) {
            C17542s.j(dVar, "viewModel");
            super.c(dVar);
            o();
        }
    }

    public c(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onTermsAndConditionsAccepted");
        this.f132129b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof d;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        C c10 = C.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
