package hf;

import Lg.c;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhf/d;", "LLg/a;", "Lhf/e;", "Lkotlin/Function1;", "", "LXH/N;", "openUrl", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lhf/d$a;", "f", "(Landroid/view/ViewGroup;)Lhf/d$a;", "b", "LnI/l;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hf.d  reason: case insensitive filesystem */
public final class C9786d extends Lg.a<C9787e> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<String, C16807N> f73582b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhf/d$a;", "LLg/c;", "Lhf/e;", "LYe/c;", "binding", "<init>", "(Lhf/d;LYe/c;)V", "viewModel", "LXH/N;", "m", "(Lhf/e;)V", "h", "LYe/c;", "getBinding", "()LYe/c;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hf.d$a */
    public final class a extends c<C9787e> {

        /* renamed from: h  reason: collision with root package name */
        private final Ye.c f73583h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C9786d f73584i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(hf.C9786d r2, Ye.c r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f73584i = r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 0
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f73583h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.C9786d.a.<init>(hf.d, Ye.c):void");
        }

        /* access modifiers changed from: private */
        public static final void n(C9786d dVar, C9787e eVar, View view) {
            dVar.f73582b.invoke(eVar.c());
        }

        /* renamed from: m */
        public void c(C9787e eVar) {
            C17542s.j(eVar, "viewModel");
            super.c(eVar);
            TextView textView = this.f73583h.f64982b;
            int i10 = 0;
            textView.setVisibility(eVar.a().length() == 0 ? 8 : 0);
            textView.setText(eVar.a());
            Button button = this.f73583h.f64984d;
            C9786d dVar = this.f73584i;
            if (eVar.c().length() == 0) {
                i10 = 8;
            }
            button.setVisibility(i10);
            if (eVar.c().length() == 0) {
                button.setOnClickListener((View.OnClickListener) null);
            } else {
                button.setOnClickListener(new C9785c(dVar, eVar));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(10);
            for (String append : eVar.b()) {
                sb2.append(append);
                sb2.append(10);
            }
            this.f73583h.f64983c.setText(sb2.toString());
        }
    }

    public C9786d(C17642l<? super String, C16807N> lVar) {
        C17542s.j(lVar, "openUrl");
        this.f73582b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9787e;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Ye.c c10 = Ye.c.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
