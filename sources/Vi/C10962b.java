package Vi;

import Fz.C12911a;
import Lg.c;
import android.view.ViewGroup;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVi/b;", "LLg/a;", "LVi/c;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/b$a;", "e", "(Landroid/view/ViewGroup;)LVi/b$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.b  reason: case insensitive filesystem */
public final class C10962b extends Lg.a<C10963c> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LVi/b$a;", "LLg/c;", "LVi/c;", "LFz/a;", "binding", "<init>", "(LVi/b;LFz/a;)V", "", "articleNumber", "m", "(Ljava/lang/String;)Ljava/lang/String;", "viewModel", "LXH/N;", "l", "(LVi/c;)V", "h", "LFz/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vi.b$a */
    public final class a extends c<C10963c> {

        /* renamed from: h  reason: collision with root package name */
        private final C12911a f88544h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C10962b f88545i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C10962b bVar, C12911a aVar) {
            super((X4.a) aVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(aVar, "binding");
            this.f88545i = bVar;
            this.f88544h = aVar;
        }

        private final String m(String str) {
            StringBuilder sb2 = new StringBuilder(str);
            for (int i10 = 3; i10 < sb2.length(); i10 += 4) {
                sb2.insert(i10, ".");
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "toString(...)");
            return sb3;
        }

        /* renamed from: l */
        public void c(C10963c cVar) {
            C17542s.j(cVar, "viewModel");
            super.c(cVar);
            this.f88544h.f110066b.setText(m(cVar.a()));
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10963c;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        C12911a c10 = C12911a.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
