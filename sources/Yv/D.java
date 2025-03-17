package Yv;

import HJ.C15854t;
import Op.c1;
import Rv.p;
import Vv.l;
import XH.C16796C;
import XH.t;
import YH.X;
import Yv.C;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import zv.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LYv/D;", "LYv/C;", "Lzv/b;", "analytics", "<init>", "(Lzv/b;)V", "LOp/c1;", "event", "LYv/C$a;", "a", "(LOp/c1;)LYv/C$a;", "Lzv/b;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D implements C {

    /* renamed from: a  reason: collision with root package name */
    private final b f41087a;

    public D(b bVar) {
        C17542s.j(bVar, "analytics");
        this.f41087a = bVar;
    }

    public C.a a(c1 c1Var) {
        C17542s.j(c1Var, "event");
        if (c1Var instanceof c1.a) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("AddToCart not supported", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = D.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return C.a.C0693a.f41085a;
        } else if (c1Var instanceof c1.b) {
            return new C.a.b(new l.g(((c1.b) c1Var).a()));
        } else {
            if (c1Var instanceof c1.c) {
                return new C.a.b(new l.c(((c1.c) c1Var).a()));
            }
            if (c1Var instanceof c1.d) {
                c1.d dVar = (c1.d) c1Var;
                return new C.a.b(new l.d(dVar.a(), dVar.b()));
            } else if (c1Var instanceof c1.e) {
                c1.e eVar2 = (c1.e) c1Var;
                this.f41087a.d(Rv.l.Overview, Interaction$Component.CAROUSEL_MEMBER_DISCOUNTS, X.f(C16796C.a("item_id", eVar2.a())));
                return new C.a.b(new l.e(eVar2.a()));
            } else if (c1Var instanceof c1.f) {
                Link a11 = ((c1.f) c1Var).a();
                if (a11 instanceof Link.External) {
                    return new C.a.b(new l.a(((Link.External) a11).e()));
                }
                if (a11 instanceof Link.Deeplink) {
                    return new C.a.b(new l.b(p.a(((Link.Deeplink) a11).e()), (DefaultConstructorMarker) null));
                }
                throw new t();
            } else {
                throw new t();
            }
        }
    }
}
