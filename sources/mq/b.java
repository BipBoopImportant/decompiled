package mq;

import Lg.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq.C11560a;
import nq.C11665a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/b;", "LLg/a;", "Lnq/a;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lmq/b$a;", "e", "(Landroid/view/ViewGroup;)Lmq/b$a;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends Lg.a<C11665a> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmq/b$a;", "LLg/c;", "Lnq/a;", "Llq/a;", "binding", "<init>", "(Llq/a;)V", "viewModel", "LXH/N;", "l", "(Lnq/a;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "Llq/a;", "getBinding", "()Llq/a;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c<C11665a> {

        /* renamed from: h  reason: collision with root package name */
        private final C11560a f99650h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C11560a aVar) {
            super((X4.a) aVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(aVar, "binding");
            this.f99650h = aVar;
        }

        public void i(View view) {
            C17542s.j(view, "view");
            if (C17542s.e(view, this.f99650h.f99462b)) {
                ((C11665a) g()).a().b().invoke();
            } else if (C17542s.e(view, this.f99650h.f99463c)) {
                ((C11665a) g()).b().b().invoke();
            }
        }

        /* renamed from: l */
        public void c(C11665a aVar) {
            C17542s.j(aVar, "viewModel");
            super.c(aVar);
            C11560a aVar2 = this.f99650h;
            aVar2.f99462b.setOnClickListener(new C11591a(this));
            aVar2.f99464d.setContentDescription(aVar.a().a());
            ImageView imageView = aVar2.f99464d;
            C17542s.i(imageView, "energyImage1");
            es.c.g(imageView, aVar.a().c());
            aVar2.f99463c.setOnClickListener(new C11591a(this));
            aVar2.f99465e.setContentDescription(aVar.b().a());
            ImageView imageView2 = aVar2.f99465e;
            C17542s.i(imageView2, "energyImage2");
            es.c.g(imageView2, aVar.b().c());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C11665a;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        C11560a c10 = C11560a.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }
}
