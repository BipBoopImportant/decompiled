package Sv;

import IC.C13026h;
import Jv.C6575a;
import Rv.e;
import Rv.g;
import Sv.b;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tK.C18010a;
import uK.C18146a;
import yv.C9008m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LSv/d;", "", "<init>", "()V", "", "id", "name", "imageUrl", "LSv/b$c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LSv/b$c;", "deeplink", "b", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f39955a = new d();

    private d() {
    }

    public static /* synthetic */ b.c c(d dVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return dVar.b(str, str2, str3);
    }

    public final b.c a(String str, String str2, String str3) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        return new b.c(new b.a(C18146a.f147980B5, 0, C18010a.f147417a, 2, (DefaultConstructorMarker) null), C13026h.a(C9008m.f58139L), C13026h.c(str2), new g(str), str3 != null ? new b.C0652b(str3, C6575a.Circle) : null);
    }

    public final b.c b(String str, String str2, String str3) {
        C17542s.j(str, "name");
        C17542s.j(str2, Constants.DEEPLINK);
        return new b.c(new b.a(C18146a.f148640sa, 0, 0, 6, (DefaultConstructorMarker) null), C13026h.a(C9008m.f58140M), C13026h.c(str), new e(str2), str3 != null ? new b.C0652b(str3, C6575a.Rectangle) : null);
    }
}
