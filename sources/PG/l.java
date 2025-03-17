package pg;

import Lg.c;
import android.view.View;
import android.view.ViewGroup;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10128b;
import qg.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpg/l;", "LLg/a;", "Lqg/m;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/l$a;", "e", "(Landroid/view/ViewGroup;)Lpg/l$a;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends Lg.a<m> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpg/l$a;", "LLg/c;", "Lqg/m;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/l;Landroid/view/View;)V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<m> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f75914h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l lVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f75914h = lVar;
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof m;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75741b, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
