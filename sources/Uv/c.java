package Uv;

import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Oo.b;
import Uv.a;
import XH.t;
import YH.C16877v;
import Yv.E;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vB.C15129b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LUv/c;", "LUv/b;", "<init>", "()V", "", "isFamilyMember", "isBokaEnabled", "isHomeProjectsEnabled", "LYv/E;", "kreativ", "LvB/b;", "carouselShoppingListState", "LKJ/f;", "LUv/a;", "b", "(ZZZLYv/E;LvB/b;)LKJ/f;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {
    /* renamed from: b */
    public C15990f<a> a(boolean z10, boolean z11, boolean z12, E e10, C15129b bVar) {
        C17542s.j(e10, "kreativ");
        C17542s.j(bVar, "carouselShoppingListState");
        List c10 = C16877v.c();
        if (z12) {
            c10.add(a.c.f40390a);
        }
        c10.add(new a.e(C13026h.a(b.f84395H7), bVar));
        if (!(e10 instanceof E.a) && !(e10 instanceof E.c)) {
            if (e10 instanceof E.b) {
                c10.add(new a.d(((E.b) e10).a()));
            } else {
                throw new t();
            }
        }
        if (z11) {
            c10.add(a.C0664a.f40384a);
        }
        if (z10) {
            c10.add(a.b.f40387a);
        }
        return C15985a.l(C16877v.a(c10));
    }
}
