package xo;

import XH.C16818i;
import androidx.lifecycle.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qg.C10192b;
import qg.C10193c;
import qg.C10195e;
import qg.i;
import qg.k;
import qg.l;
import qg.m;
import qg.o;
import qg.q;
import qg.t;
import qg.u;
import qg.v;
import qg.w;
import yo.e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lqg/i;", "Lyo/e;", "a", "(Ljava/util/List;)Lyo/e;", "", "b", "(Lqg/i;)Ljava/lang/String;", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f106172a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f106172a = lVar;
        }

        public final C16818i<?> c() {
            return this.f106172a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f106172a.invoke(obj);
        }
    }

    public static final e a(List<? extends i<?>> list) {
        String str;
        Object obj;
        String str2;
        C17542s.j(list, "<this>");
        Iterable<i> iterable = list;
        Iterator it = iterable.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((i) obj) instanceof C10193c) {
                break;
            }
        }
        C10193c cVar = obj instanceof C10193c ? (C10193c) obj : null;
        ArrayList arrayList = new ArrayList();
        for (i b10 : iterable) {
            String b11 = b(b10);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (cVar == null || (str2 = cVar.h()) == null) {
            str2 = "";
        }
        if (cVar != null) {
            str = cVar.e();
        }
        return new e(str2, str, arrayList);
    }

    private static final String b(i<?> iVar) {
        if ((iVar instanceof C10192b) || (iVar instanceof q) || (iVar instanceof C10195e) || (iVar instanceof u) || (iVar instanceof k) || (iVar instanceof w) || (iVar instanceof o) || (iVar instanceof t) || (iVar instanceof v) || (iVar instanceof l)) {
            String h10 = iVar.h();
            if (h10 == null || h10.length() == 0) {
                return null;
            }
            return h10;
        } else if ((iVar instanceof C10193c) || (iVar instanceof m)) {
            return null;
        } else {
            throw new XH.t();
        }
    }
}
