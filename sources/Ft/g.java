package Ft;

import Gt.a;
import Gt.f;
import IC.C13026h;
import It.A;
import It.B;
import It.C;
import It.C10750m;
import It.p;
import It.v;
import It.w;
import It.z;
import KJ.C15985a;
import KJ.C15987c;
import YH.C16877v;
import bI.C17035a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vB.C15129b;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "storeModeEnabled", "LGt/f;", "storeDetails", "LIt/z;", "storeSelectedData", "LGt/a;", "ikeaFamilyState", "LEs/a;", "inboxState", "LvB/b;", "carouselShoppingListState", "LIt/w;", "scanAndGoState", "LIt/B$c;", "a", "(ZLGt/f;LIt/z;LGt/a;LEs/a;LvB/b;LIt/w;)LIt/B$c;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.h f81061a;

        public a(A.h hVar) {
            this.f81061a = hVar;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((A) t10).a(this.f81061a)), Integer.valueOf(((A) t11).a(this.f81061a)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f81062a;

        public b(boolean z10) {
            this.f81062a = z10;
        }

        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((C) t10).c(this.f81062a)), Integer.valueOf(((C) t11).c(this.f81062a)));
        }
    }

    public static final B.c a(boolean z10, f fVar, z zVar, Gt.a aVar, Es.a aVar2, C15129b bVar, w wVar) {
        A.h hVar;
        Object obj;
        List list;
        boolean z11 = z10;
        f fVar2 = fVar;
        Gt.a aVar3 = aVar;
        Es.a aVar4 = aVar2;
        C15129b bVar2 = bVar;
        C17542s.j(fVar2, "storeDetails");
        C17542s.j(zVar, "storeSelectedData");
        C17542s.j(aVar4, "inboxState");
        C17542s.j(wVar, "scanAndGoState");
        Iterator it = zVar.c().iterator();
        while (true) {
            hVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((A) obj) instanceof A.i) {
                break;
            }
        }
        boolean z12 = obj != null;
        A.h.b bVar3 = A.h.b.f82052a;
        if (z11) {
            hVar = bVar3;
        }
        if (hVar == null) {
            hVar = A.h.a.f82051a;
        }
        List c10 = C16877v.c();
        if (bVar2 != null) {
            c10.add(new A.f(bVar2));
        }
        if (!z12 && aVar3 != null) {
            c10.add(new A.e(aVar3));
        }
        c10.addAll(zVar.c());
        C15987c h10 = C15985a.h(C16877v.g1(C16877v.a(c10), new a(hVar)));
        List h11 = C15985a.h(C16877v.g1(zVar.f(), new b(z11)));
        if (!z11) {
            list = C16877v.n();
        } else if (h11.size() > 4) {
            List W02 = C16877v.W0(C16877v.k1(h11, 3), C.b.f82082a);
            list = C16877v.n0(h11, 3);
            h11 = W02;
        } else {
            list = C16877v.n();
        }
        return new B.c(fVar.d(), new C10750m(C13026h.c(fVar.c()), b.a(aVar4, aVar3 instanceof a.C1584a)), h10, new p(fVar2, zVar.e(), C15985a.h(h11)), w.b(wVar, fVar.f(), false, false, 6, (Object) null), zVar.g(), zVar.d(), C15985a.h(list), (v) null, (Mt.a) null, 768, (DefaultConstructorMarker) null);
    }
}
