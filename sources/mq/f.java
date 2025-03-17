package mq;

import Lg.c;
import android.view.ViewGroup;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nq.C11669e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/f;", "LLg/a;", "Lnq/e;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lmq/f$a;", "e", "(Landroid/view/ViewGroup;)Lmq/f$a;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends Lg.a<C11669e> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/f$a;", "LLg/c;", "Lnq/e;", "Llq/f;", "binding", "<init>", "(Llq/f;)V", "viewModel", "LXH/N;", "l", "(Lnq/e;)V", "h", "Llq/f;", "getBinding", "()Llq/f;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c<C11669e> {

        /* renamed from: h  reason: collision with root package name */
        private final lq.f f99654h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(lq.f fVar) {
            super((X4.a) fVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(fVar, "binding");
            this.f99654h = fVar;
        }

        /* renamed from: l */
        public void c(C11669e eVar) {
            C17542s.j(eVar, "viewModel");
            super.c(eVar);
            lq.f fVar = this.f99654h;
            fVar.f99481c.setText(eVar.a());
            fVar.f99482d.setText(eVar.b());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C11669e;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        lq.f c10 = lq.f.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }
}
