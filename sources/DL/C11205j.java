package dl;

import Lg.c;
import Lg.e;
import Oo.b;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bl.C11102b;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00060\u000fR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldl/j;", "LLg/a;", "Ldl/k;", "Lkotlin/Function0;", "LXH/N;", "buttonClick", "<init>", "(LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Ldl/j$a;", "f", "(Landroid/view/ViewGroup;)Ldl/j$a;", "b", "LnI/a;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dl.j  reason: case insensitive filesystem */
public final class C11205j extends Lg.a<C11206k> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f96916b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldl/j$a;", "LLg/c;", "Ldl/k;", "Lbl/b;", "binding", "<init>", "(Ldl/j;Lbl/b;)V", "viewModel", "LXH/N;", "m", "(Ldl/k;)V", "h", "Lbl/b;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dl.j$a */
    public final class a extends c<C11206k> {

        /* renamed from: h  reason: collision with root package name */
        private final C11102b f96917h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C11205j f96918i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(dl.C11205j r2, bl.C11102b r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f96918i = r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 0
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f96917h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dl.C11205j.a.<init>(dl.j, bl.b):void");
        }

        /* access modifiers changed from: private */
        public static final void n(C11205j jVar, View view) {
            jVar.f96916b.invoke();
        }

        /* renamed from: m */
        public void c(C11206k kVar) {
            C17542s.j(kVar, "viewModel");
            super.c(kVar);
            C11102b bVar = this.f96917h;
            C11205j jVar = this.f96918i;
            bVar.f90468b.setText(kVar.a());
            if (kVar.b() != null) {
                TextView textView = bVar.f90471e;
                C17542s.i(textView, "errorTitle");
                textView.setVisibility(0);
                bVar.f90471e.setText(kVar.b());
            } else {
                TextView textView2 = bVar.f90471e;
                C17542s.i(textView2, "errorTitle");
                textView2.setVisibility(8);
            }
            bVar.f90469c.setText(e.a(this).getText(b.f84330B2));
            bVar.f90469c.setOnClickListener(new C11204i(jVar));
        }
    }

    public C11205j(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "buttonClick");
        this.f96916b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C11206k;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        C11102b c10 = C11102b.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
