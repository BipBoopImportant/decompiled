package wo;

import Co.c;
import HJ.C15854t;
import Il.a;
import Nn.C;
import Nn.C10803f;
import Nn.C10804g;
import Nn.C10813p;
import Nn.C10814q;
import Nn.F;
import Nn.K;
import Nn.u;
import Nn.x;
import Wn.b;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import jo.C11435a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwo/f;", "Lwo/e;", "LWn/b;", "analytics", "LNn/x;", "checkoutRepository", "LIl/a;", "appConfigApi", "<init>", "(LWn/b;LNn/x;LIl/a;)V", "", "checkoutId", "LRg/a;", "checkoutType", "", "LNn/g;", "productList", "", "showTotalExclTax", "LXH/N;", "a", "(Ljava/lang/String;LRg/a;Ljava/util/List;Ljava/lang/Boolean;)V", "LWn/b;", "b", "LNn/x;", "c", "LIl/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wo.f  reason: case insensitive filesystem */
public final class C12295f implements C12294e {

    /* renamed from: a  reason: collision with root package name */
    private final b f105926a;

    /* renamed from: b  reason: collision with root package name */
    private final x f105927b;

    /* renamed from: c  reason: collision with root package name */
    private final a f105928c;

    public C12295f(b bVar, x xVar, a aVar) {
        C17542s.j(bVar, "analytics");
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(aVar, "appConfigApi");
        this.f105926a = bVar;
        this.f105927b = xVar;
        this.f105928c = aVar;
    }

    public void a(String str, Rg.a aVar, List<C10804g> list, Boolean bool) {
        String c10;
        List list2;
        List<F> g10;
        String str2 = str;
        List<C10804g> list3 = list;
        C17542s.j(str2, "checkoutId");
        C17542s.j(aVar, "checkoutType");
        C17542s.j(list3, "productList");
        C10803f s10 = this.f105927b.s(str2);
        K i10 = s10 != null ? s10.i() : null;
        C i11 = this.f105927b.i(str2);
        boolean z10 = false;
        if (s10 == null || i10 == null) {
            if (s10 != null) {
                z10 = true;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Unable to track purchase, checkoutExists: " + z10);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    String name = C12295f.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str4, false, illegalStateException, str3);
            }
            return;
        }
        if (!this.f105928c.p()) {
            c10 = s10.c();
        } else if (i11 == null || (c10 = i11.d()) == null) {
            c10 = s10.c();
        }
        String str5 = c10;
        b bVar2 = this.f105926a;
        String b10 = this.f105928c.s().b();
        C10813p c11 = i10.c();
        u e10 = i10.e();
        Iterable<K.b> a11 = i10.a();
        ArrayList arrayList2 = new ArrayList(C16877v.y(a11, 10));
        for (K.b a12 : a11) {
            arrayList2.add(C11435a.f98597j.a(a12, i10.c(), s10.f(), s10.d(), (List<C10814q>) null, (C11435a.b) null));
        }
        b.a.C1896b bVar3 = new b.a.C1896b(c11, e10, arrayList2);
        String c12 = s10.c();
        b.a.C1894a a13 = b.a.C1894a.f89076e.a(s10.h());
        Iterable<C10804g> iterable = list3;
        ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
        for (C10804g c13 : iterable) {
            arrayList3.add(c.c(c13, bool != null ? bool.booleanValue() : false));
        }
        b.a aVar2 = new b.a(c12, a13, arrayList3, bVar3);
        if (i11 == null || (g10 = i11.g()) == null) {
            list2 = C16877v.n();
        } else {
            ArrayList<F> arrayList4 = new ArrayList<>();
            for (Object next2 : g10) {
                if (((F) next2).g()) {
                    arrayList4.add(next2);
                }
            }
            list2 = new ArrayList();
            for (F b11 : arrayList4) {
                String b12 = b11.b();
                if (b12 != null) {
                    list2.add(b12);
                }
            }
        }
        bVar2.y(aVar, str5, b10, aVar2, list2);
    }
}
