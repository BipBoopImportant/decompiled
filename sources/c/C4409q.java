package C;

import H2.i;
import androidx.camera.core.impl.C5052v0;
import androidx.camera.core.impl.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: C.q  reason: case insensitive filesystem */
public final class C4409q {

    /* renamed from: c  reason: collision with root package name */
    public static final C4409q f5394c = new a().c(0).b();

    /* renamed from: d  reason: collision with root package name */
    public static final C4409q f5395d = new a().c(1).b();

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<C4407o> f5396a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5397b;

    /* renamed from: C.q$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedHashSet<C4407o> f5398a = new LinkedHashSet<>();

        /* renamed from: b  reason: collision with root package name */
        private String f5399b;

        public a a(C4407o oVar) {
            this.f5398a.add(oVar);
            return this;
        }

        public C4409q b() {
            return new C4409q(this.f5398a, this.f5399b);
        }

        public a c(int i10) {
            i.j(i10 != -1, "The specified lens facing is invalid.");
            this.f5398a.add(new C5052v0(i10));
            return this;
        }
    }

    C4409q(LinkedHashSet<C4407o> linkedHashSet, String str) {
        this.f5396a = linkedHashSet;
        this.f5397b = str;
    }

    public LinkedHashSet<J> a(LinkedHashSet<J> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<J> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        List<C4408p> b10 = b(arrayList);
        LinkedHashSet<J> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<J> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            J next = it2.next();
            if (b10.contains(next.b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<C4408p> b(List<C4408p> list) {
        List<C4408p> arrayList = new ArrayList<>(list);
        Iterator<C4407o> it = this.f5396a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<C4407o> c() {
        return this.f5396a;
    }

    public Integer d() {
        Iterator<C4407o> it = this.f5396a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            C4407o next = it.next();
            if (next instanceof C5052v0) {
                Integer valueOf = Integer.valueOf(((C5052v0) next).c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public J e(LinkedHashSet<J> linkedHashSet) {
        Iterator<J> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
