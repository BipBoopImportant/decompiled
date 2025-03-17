package Je;

import Ge.j;
import HJ.C15854t;
import Je.b;
import Lg.c;
import Qe.b;
import XH.C16807N;
import XH.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10027d;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00060\u0012R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"LJe/a;", "LLg/a;", "LJe/b;", "", "enableStreetNumberButton", "Lkotlin/Function1;", "", "LXH/N;", "addStreetNumberClicked", "onClicked", "<init>", "(ZLnI/l;LnI/l;)V", "", "item", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LJe/a$a;", "h", "(Landroid/view/ViewGroup;)LJe/a$a;", "b", "Z", "c", "LnI/l;", "d", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends Lg.a<b> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f61254b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<String, C16807N> f61255c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17642l<b, C16807N> f61256d;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LJe/a$a;", "LLg/c;", "LJe/b;", "LQe/b;", "binding", "<init>", "(LJe/a;LQe/b;)V", "viewModel", "LXH/N;", "l", "(LJe/b;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "LQe/b;", "getBinding", "()LQe/b;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Je.a$a  reason: collision with other inner class name */
    public final class C1012a extends c<b> {

        /* renamed from: h  reason: collision with root package name */
        private final b f61257h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f61258i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1012a(Je.a r2, Qe.b r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f61258i = r2
                android.widget.LinearLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 1
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f61257h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Je.a.C1012a.<init>(Je.a, Qe.b):void");
        }

        public void i(View view) {
            C17542s.j(view, "view");
            super.i(view);
            Object g10 = g();
            this.f61258i.f61256d.invoke((b) g10);
        }

        /* renamed from: l */
        public void c(b bVar) {
            String str;
            String str2;
            String str3;
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            boolean z10 = bVar instanceof b.a;
            if (z10) {
                str = ((b.a) bVar).a().getAddressName();
            } else if (bVar instanceof b.C1013b) {
                str = ((b.C1013b) bVar).a();
            } else {
                throw new t();
            }
            if (z10) {
                str2 = ((b.a) bVar).a().getSubAddressName();
            } else if (bVar instanceof b.C1013b) {
                str2 = ((b.C1013b) bVar).c();
            } else {
                throw new t();
            }
            this.f61257h.f63075d.setBackgroundResource(C10027d.f75275f);
            this.f61257h.f63074c.setText(str);
            TextView textView = this.f61257h.f63076e;
            if (str2 == null || C15854t.v0(str2)) {
                str3 = null;
            } else {
                str3 = String.format("(%s)", Arrays.copyOf(new Object[]{str2}, 1));
                C17542s.i(str3, "format(...)");
            }
            textView.setText(str3);
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || C15854t.v0(text)) ? 8 : 0);
            if (z10) {
                this.f61257h.f63077f.setText(((b.a) bVar).a().getPostalCode());
            } else if (bVar instanceof b.C1013b) {
                this.f61257h.f63077f.setVisibility(8);
            } else {
                throw new t();
            }
            TextView textView2 = this.f61257h.f63073b;
            C17542s.i(textView2, "addStreetNumber");
            j.b(textView2, this.f61258i.f61254b, str, str2, this.f61258i.f61255c);
        }
    }

    public a(boolean z10, C17642l<? super String, C16807N> lVar, C17642l<? super b, C16807N> lVar2) {
        C17542s.j(lVar, "addStreetNumberClicked");
        C17542s.j(lVar2, "onClicked");
        this.f61254b = z10;
        this.f61255c = lVar;
        this.f61256d = lVar2;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof b;
    }

    /* renamed from: h */
    public C1012a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        Qe.b c10 = Qe.b.c(from, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new C1012a(this, c10);
    }
}
