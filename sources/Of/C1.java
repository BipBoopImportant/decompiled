package Of;

import Oo.b;
import Qf.a;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\u0003\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\u0003\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LQf/a$b;", "", "d", "(LQf/a$b;)I", "", "postalCode", "e", "(LQf/a$b;Ljava/lang/String;)Ljava/lang/String;", "c", "a", "LOf/s;", "b", "(LQf/a$b;)LOf/s;", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C1 {
    public static final int a(a.b bVar) {
        C17542s.j(bVar, "<this>");
        if (bVar instanceof a.b.C1070a) {
            return C18146a.f148352a2;
        }
        if (bVar instanceof a.b.C1071b) {
            return C18146a.f148385c3;
        }
        throw new t();
    }

    public static final C9209s b(a.b bVar) {
        C17542s.j(bVar, "<this>");
        if (bVar instanceof a.b.C1070a) {
            return C9209s.CLICK_AND_COLLECT;
        }
        if (bVar instanceof a.b.C1071b) {
            return C9209s.HOME;
        }
        throw new t();
    }

    public static final int c(a.b bVar) {
        C17542s.j(bVar, "<this>");
        if (bVar instanceof a.b.C1070a) {
            return b.f84641f8;
        }
        if (bVar instanceof a.b.C1071b) {
            return b.f84663h8;
        }
        throw new t();
    }

    public static final int d(a.b bVar) {
        C17542s.j(bVar, "<this>");
        if (bVar instanceof a.b.C1070a) {
            String f10 = ((a.b.C1070a) bVar).f();
            return (f10 == null || f10.length() == 0) ? b.f84368F0 : b.f84396H8;
        } else if (bVar instanceof a.b.C1071b) {
            return b.f84855z5;
        } else {
            throw new t();
        }
    }

    public static final String e(a.b bVar, String str) {
        C17542s.j(bVar, "<this>");
        if (bVar instanceof a.b.C1070a) {
            a.b.C1070a aVar = (a.b.C1070a) bVar;
            String f10 = aVar.f();
            if (f10 == null || f10.length() == 0) {
                return null;
            }
            return aVar.f();
        } else if (bVar instanceof a.b.C1071b) {
            return str;
        } else {
            throw new t();
        }
    }
}
