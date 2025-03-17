package vz;

import Fz.r;
import Lg.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvz/b;", "LLg/a;", "LHz/a;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lvz/b$a;", "e", "(Landroid/view/ViewGroup;)Lvz/b$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vz.b  reason: case insensitive filesystem */
public final class C15150b extends Lg.a<Hz.a> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvz/b$a;", "LLg/c;", "LHz/a;", "LFz/r;", "binding", "<init>", "(Lvz/b;LFz/r;)V", "viewModel", "LXH/N;", "m", "(LHz/a;)V", "h", "LFz/r;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vz.b$a */
    public final class a extends c<Hz.a> {

        /* renamed from: h  reason: collision with root package name */
        private final r f131582h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C15150b f131583i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(vz.C15150b r2, Fz.r r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f131583i = r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 1
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f131582h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vz.C15150b.a.<init>(vz.b, Fz.r):void");
        }

        /* access modifiers changed from: private */
        public static final void n(Hz.a aVar, View view) {
            aVar.h().invoke();
        }

        /* renamed from: m */
        public void c(Hz.a aVar) {
            C17542s.j(aVar, "viewModel");
            super.c(aVar);
            r rVar = this.f131582h;
            rVar.f110187c.setText(aVar.i());
            rVar.f110186b.setOnClickListener(new C15149a(aVar));
            if (aVar.g() != null) {
                rVar.f110186b.setVisibility(0);
                rVar.f110186b.setImageResource(aVar.g().intValue());
                return;
            }
            rVar.f110186b.setVisibility(8);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof Hz.a;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        r c10 = r.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
