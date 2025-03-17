package Vi;

import Ez.f;
import Fz.o;
import G2.b;
import Lg.c;
import XH.C16807N;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import jp.C11441c;
import jp.g;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LVi/G;", "LLg/a;", "LVi/H;", "Lkotlin/Function1;", "", "LXH/N;", "continueClicked", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/G$a;", "f", "(Landroid/view/ViewGroup;)LVi/G$a;", "b", "LnI/l;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G extends Lg.a<H> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<String, C16807N> f88490b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LVi/G$a;", "LLg/c;", "LVi/H;", "LFz/o;", "binding", "<init>", "(LVi/G;LFz/o;)V", "LXH/N;", "p", "()V", "viewModel", "o", "(LVi/H;)V", "h", "LFz/o;", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "i", "Landroid/content/res/Resources;", "resources", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<H> {

        /* renamed from: h  reason: collision with root package name */
        private final o f88491h;

        /* renamed from: i  reason: collision with root package name */
        private final Resources f88492i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ G f88493j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(G g10, o oVar) {
            super((X4.a) oVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(oVar, "binding");
            this.f88493j = g10;
            this.f88491h = oVar;
            this.f88492i = oVar.getRoot().getResources();
        }

        private final void p() {
            O o10 = new O();
            o10.f144348a = "";
            o oVar = this.f88491h;
            G g10 = this.f88493j;
            oVar.f110167d.setEndIconVisible(false);
            oVar.f110168e.setText(b.a(this.f88492i.getString(f.f109669I), 0));
            TextInputEditText textInputEditText = oVar.f110165b;
            textInputEditText.post(new D(textInputEditText));
            C17542s.g(textInputEditText);
            C11441c.a(textInputEditText, new E(o10, oVar));
            oVar.f110169f.setOnClickListener(new F(g10, o10));
        }

        /* access modifiers changed from: private */
        public static final void q(TextInputEditText textInputEditText) {
            textInputEditText.requestFocus();
            C17542s.g(textInputEditText);
            g.c(textInputEditText);
        }

        /* access modifiers changed from: private */
        public static final C16807N r(O o10, o oVar, String str) {
            C17542s.j(str, "text");
            o10.f144348a = str;
            boolean z10 = str.length() == 8;
            oVar.f110169f.setEnabled(z10);
            oVar.f110167d.setEndIconVisible(z10);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final void s(G g10, O o10, View view) {
            g10.f88490b.invoke(o10.f144348a);
        }

        /* renamed from: o */
        public void c(H h10) {
            C17542s.j(h10, "viewModel");
            super.c(h10);
            p();
        }
    }

    public G(C17642l<? super String, C16807N> lVar) {
        C17542s.j(lVar, "continueClicked");
        this.f88490b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof H;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        o c10 = o.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
