package Fy;

import By.C12674m;
import Ey.b;
import Jy.j;
import Lg.c;
import XH.C16807N;
import Xo.f;
import YH.C16877v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB+\u0012\"\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R3\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LFy/e;", "LLg/a;", "LJy/j;", "Lkotlin/Function2;", "", "LJy/j$a;", "LXH/N;", "Lcom/ingka/ikea/scanandgo/cart/impl/delegate/OnCartSortByClicked;", "onClick", "<init>", "(LnI/p;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/p;", "e", "()LnI/p;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends Lg.a<j> {

    /* renamed from: b  reason: collision with root package name */
    private final p<List<? extends j.a>, j.a, C16807N> f110000b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFy/e$a;", "LLg/c;", "LJy/j;", "LEy/b;", "binding", "<init>", "(LFy/e;LEy/b;)V", "viewModel", "LXH/N;", "m", "(LJy/j;)V", "h", "LEy/b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a extends c<j> {

        /* renamed from: h  reason: collision with root package name */
        private final b f110001h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f110002i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, b bVar) {
            super((X4.a) bVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(bVar, "binding");
            this.f110002i = eVar;
            this.f110001h = bVar;
        }

        /* access modifiers changed from: private */
        public static final void n(e eVar, j jVar, View view) {
            eVar.e().invoke(C16877v.t1(j.a.j()), jVar.g());
        }

        /* renamed from: m */
        public void c(j jVar) {
            C17542s.j(jVar, "viewModel");
            e eVar = this.f110002i;
            super.c(jVar);
            MaterialButton materialButton = this.f110001h.f109485b;
            materialButton.setText(f.a(Lg.e.d(this, C12674m.f108298p0, Lg.e.c(this, jVar.g().m()))));
            materialButton.setOnClickListener(new d(eVar, jVar));
        }
    }

    public e(p<? super List<? extends j.a>, ? super j.a, C16807N> pVar) {
        C17542s.j(pVar, "onClick");
        this.f110000b = pVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof j;
    }

    public c<j> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        b c10 = b.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }

    public final p<List<? extends j.a>, j.a, C16807N> e() {
        return this.f110000b;
    }
}
