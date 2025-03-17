package Ni;

import com.ingka.ikea.app.ratingsandreviews.navigation.ReviewsRoute;
import com.ingka.ikea.app.ratingsandreviews.navigation.WriteReviewRoute;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rw.c;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LNi/c;", "LNi/b;", "<init>", "()V", "Lx4/o;", "navController", "", "itemNo", "LXH/N;", "b", "(Lx4/o;Ljava/lang/String;)V", "a", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ni.c  reason: case insensitive filesystem */
public final class C10797c implements C10796b {
    public void a(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C8951o.f0(oVar, new WriteReviewRoute(str), c.f28698a.c().a(), (I.a) null, 4, (Object) null);
    }

    public void b(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C8951o.f0(oVar, new ReviewsRoute(str), c.f28698a.c().a(), (I.a) null, 4, (Object) null);
    }
}
