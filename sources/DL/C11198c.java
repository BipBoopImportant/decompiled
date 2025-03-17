package dl;

import Lg.c;
import al.C11067a;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.L;
import com.google.android.material.button.MaterialButton;
import dl.C11199d;
import jp.g;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ldl/c;", "Ldl/d;", "T", "LLg/a;", "", "layoutRes", "<init>", "(I)V", "Landroid/view/ViewGroup;", "container", "Ldl/c$a;", "e", "(Landroid/view/ViewGroup;)Ldl/c$a;", "b", "I", "getLayoutRes", "()I", "a", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dl.c  reason: case insensitive filesystem */
public abstract class C11198c<T extends C11199d> extends Lg.a<T> {

    /* renamed from: b  reason: collision with root package name */
    private final int f96885b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Ldl/c$a;", "LLg/c;", "Landroid/view/View;", "itemView", "<init>", "(Ldl/c;Landroid/view/View;)V", "viewModel", "LXH/N;", "m", "(Ldl/d;)V", "view", "i", "(Landroid/view/View;)V", "j", "()V", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "button", "Landroidx/lifecycle/L;", "", "Landroidx/lifecycle/L;", "isButtonEnabledObserver", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dl.c$a */
    public final class a extends c<T> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f96886h;

        /* renamed from: i  reason: collision with root package name */
        private final L<Boolean> f96887i = new C11196a(this);

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C11198c<T> f96888j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C11198c cVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f96888j = cVar;
            View findViewById = view.findViewById(C11067a.f90290d);
            C17542s.i(findViewById, "findViewById(...)");
            TextView textView = (TextView) findViewById;
            this.f96886h = textView;
            textView.setOnClickListener(new C11197b(this));
        }

        /* access modifiers changed from: private */
        public static final void n(a aVar, boolean z10) {
            aVar.f96886h.setEnabled(z10);
        }

        public void i(View view) {
            C17542s.j(view, "view");
            ((C11199d) g()).d().invoke(Integer.valueOf(getBindingAdapterPosition()));
        }

        public void j() {
            ((C11199d) g()).f().removeObserver(this.f96887i);
            super.j();
        }

        /* renamed from: m */
        public void c(T t10) {
            C17542s.j(t10, "viewModel");
            super.c(t10);
            t10.f().observeForever(this.f96887i);
            TextView textView = this.f96886h;
            textView.setText(t10.e());
            Integer c10 = t10.c();
            if (c10 != null) {
                g.e(textView, 0, c10.intValue(), 0, 0, 13, (Object) null);
            }
            Integer b10 = t10.b();
            if (b10 != null) {
                g.e(this.f96886h, 0, 0, 0, b10.intValue(), 7, (Object) null);
            }
            if (textView instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) textView;
                materialButton.setIcon(t10.a());
                materialButton.setIconTint((ColorStateList) null);
                materialButton.setIconGravity(2);
            }
        }
    }

    public C11198c(int i10) {
        this.f96885b = i10;
    }

    /* renamed from: e */
    public C11198c<T>.defpackage.a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, this.f96885b, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
