package pg;

import android.view.View;
import android.view.ViewGroup;
import com.ingka.ikea.dynamicfields.datalayer.c;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import og.C10128b;
import pg.x;
import qg.v;
import sg.g;
import sg.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00060\nR\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpg/e;", "Lpg/x;", "Lsg/g;", "formController", "Lsg/m;", "urlHandler", "<init>", "(Lsg/g;Lsg/m;)V", "Landroid/view/ViewGroup;", "container", "Lpg/x$a;", "g", "(Landroid/view/ViewGroup;)Lpg/x$a;", "", "item", "", "a", "(Ljava/lang/Object;)Z", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pg.e  reason: case insensitive filesystem */
public final class C10151e extends x {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10151e(g gVar, m mVar) {
        super(gVar, mVar);
        C17542s.j(gVar, "formController");
        C17542s.j(mVar, "urlHandler");
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return (obj instanceof v) && ((v) obj).z() == c.CHECKBOX;
    }

    /* renamed from: g */
    public x.a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75740a, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new x.a(this, c10);
    }
}
