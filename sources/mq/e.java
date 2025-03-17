package mq;

import Lg.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nq.C11667c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/e;", "LLg/a;", "Lnq/c;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lmq/e$a;", "e", "(Landroid/view/ViewGroup;)Lmq/e$a;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends Lg.a<C11667c> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmq/e$a;", "LLg/c;", "Lnq/c;", "Llq/e;", "binding", "<init>", "(Llq/e;)V", "viewModel", "LXH/N;", "l", "(Lnq/c;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "Llq/e;", "getBinding", "()Llq/e;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c<C11667c> {

        /* renamed from: h  reason: collision with root package name */
        private final lq.e f99653h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(lq.e eVar) {
            super((X4.a) eVar, true);
            C17542s.j(eVar, "binding");
            this.f99653h = eVar;
        }

        public void i(View view) {
            C17542s.j(view, "view");
            ((C11667c) g()).b().invoke();
        }

        /* renamed from: l */
        public void c(C11667c cVar) {
            C17542s.j(cVar, "viewModel");
            super.c(cVar);
            TextView textView = this.f99653h.f99478b;
            textView.setContentDescription(cVar.a());
            C17542s.g(textView);
            jp.e.b(textView, cVar.c());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C11667c;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        lq.e c10 = lq.e.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }
}
