package hf;

import Lg.a;
import Lg.c;
import Ye.b;
import android.view.ViewGroup;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhf/a;", "LLg/a;", "Lhf/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lhf/a$a;", "e", "(Landroid/view/ViewGroup;)Lhf/a$a;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hf.a  reason: case insensitive filesystem */
public final class C9783a extends a<C9784b> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhf/a$a;", "LLg/c;", "Lhf/b;", "LYe/b;", "binding", "<init>", "(Lhf/a;LYe/b;)V", "viewModel", "LXH/N;", "l", "(Lhf/b;)V", "h", "LYe/b;", "getBinding", "()LYe/b;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hf.a$a  reason: collision with other inner class name */
    public final class C1284a extends c<C9784b> {

        /* renamed from: h  reason: collision with root package name */
        private final b f73577h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C9783a f73578i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1284a(hf.C9783a r2, Ye.b r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f73578i = r2
                android.widget.TextView r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 0
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f73577h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.C9783a.C1284a.<init>(hf.a, Ye.b):void");
        }

        /* renamed from: l */
        public void c(C9784b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            this.f73577h.f64980b.setText(bVar.a());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9784b;
    }

    /* renamed from: e */
    public C1284a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        b c10 = b.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new C1284a(this, c10);
    }
}
