package R7;

import R7.o;
import android.content.Context;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.r;
import com.bumptech.glide.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class m {

    /* renamed from: a  reason: collision with root package name */
    final Map<r, l> f39705a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final o.b f39706b;

    class a implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f39707a;

        a(r rVar) {
            this.f39707a = rVar;
        }

        public void g() {
        }

        public void k() {
        }

        public void l() {
            m.this.f39705a.remove(this.f39707a);
        }
    }

    private final class b implements p {

        /* renamed from: a  reason: collision with root package name */
        private final FragmentManager f39709a;

        b(FragmentManager fragmentManager) {
            this.f39709a = fragmentManager;
        }

        private void b(FragmentManager fragmentManager, Set<l> set) {
            List<C5187o> G02 = fragmentManager.G0();
            int size = G02.size();
            for (int i10 = 0; i10 < size; i10++) {
                C5187o oVar = G02.get(i10);
                b(oVar.getChildFragmentManager(), set);
                l a10 = m.this.a(oVar.getLifecycle());
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }

        public Set<l> a() {
            HashSet hashSet = new HashSet();
            b(this.f39709a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f39706b = bVar;
    }

    /* access modifiers changed from: package-private */
    public l a(r rVar) {
        Y7.l.a();
        return this.f39705a.get(rVar);
    }

    /* access modifiers changed from: package-private */
    public l b(Context context, com.bumptech.glide.b bVar, r rVar, FragmentManager fragmentManager, boolean z10) {
        Y7.l.a();
        l a10 = a(rVar);
        if (a10 != null) {
            return a10;
        }
        k kVar = new k(rVar);
        l a11 = this.f39706b.a(bVar, kVar, new b(fragmentManager), context);
        this.f39705a.put(rVar, a11);
        kVar.a(new a(rVar));
        if (z10) {
            a11.k();
        }
        return a11;
    }
}
