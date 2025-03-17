package Zd;

import Lg.c;
import Sd.d;
import Sd.f;
import Zo.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;
import je.C9906a;
import je.C9909d;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZd/a;", "LLg/a;", "LZd/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LZd/a$a;", "e", "(Landroid/view/ViewGroup;)LZd/a$a;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends Lg.a<b> {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LZd/a$a;", "LLg/c;", "LZd/b;", "Lje/d;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(LZd/b;)V", "view", "i", "", "direction", "a", "(I)V", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "name", "street", "j", "postalCode", "Lje/a;", "b", "()Lje/a;", "supportedSwipeDirections", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zd.a$a  reason: collision with other inner class name */
    public static final class C1139a extends c<b> implements C9909d {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f65148h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f65149i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f65150j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1139a(View view) {
            super(view, true);
            C17542s.j(view, "itemView");
            View findViewById = view.findViewById(Sd.c.f63345j);
            C17542s.i(findViewById, "findViewById(...)");
            this.f65148h = (TextView) findViewById;
            View findViewById2 = view.findViewById(Sd.c.f63347l);
            C17542s.i(findViewById2, "findViewById(...)");
            this.f65149i = (TextView) findViewById2;
            View findViewById3 = view.findViewById(Sd.c.f63346k);
            C17542s.i(findViewById3, "findViewById(...)");
            this.f65150j = (TextView) findViewById3;
        }

        public void a(int i10) {
            ((b) g()).c().invoke(Integer.valueOf(getBindingAdapterPosition()));
        }

        public C9906a b() {
            return !((b) g()).a().h() ? C9906a.START : C9906a.NONE;
        }

        public void i(View view) {
            C17542s.j(view, "view");
            ((b) g()).b().invoke(Integer.valueOf(getBindingAdapterPosition()));
        }

        /* renamed from: l */
        public void c(b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            String string = this.itemView.getContext().getString(f.f63363c);
            C17542s.i(string, "getString(...)");
            TextView textView = this.f65148h;
            V v10 = V.f144353a;
            b bVar2 = b.f90092a;
            Locale d10 = bVar2.d();
            String d11 = bVar.a().d();
            String str = "";
            if (d11 == null) {
                d11 = str;
            }
            String f10 = bVar.a().f();
            if (f10 == null) {
                f10 = str;
            }
            String format = String.format(d10, string, Arrays.copyOf(new Object[]{d11, f10}, 2));
            C17542s.i(format, "format(...)");
            textView.setText(format);
            TextView textView2 = this.f65150j;
            Locale d12 = bVar2.d();
            String g10 = bVar.a().g();
            if (g10 == null) {
                g10 = str;
            }
            String b10 = bVar.a().b();
            if (b10 != null) {
                str = b10;
            }
            String format2 = String.format(d12, string, Arrays.copyOf(new Object[]{g10, str}, 2));
            C17542s.i(format2, "format(...)");
            textView2.setText(format2);
            this.f65149i.setText(bVar.a().a());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof b;
    }

    /* renamed from: e */
    public C1139a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, d.f63351c, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new C1139a(c10);
    }
}
