package A;

import B.h;
import C.C4387c0;
import C.C4391e0;
import C.C4408p;
import D.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v.O0;
import w.C6172g;
import w.O;

public class a implements D.a {

    /* renamed from: a  reason: collision with root package name */
    private final O f4291a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a.C0035a> f4292b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<String>> f4293c;

    /* renamed from: d  reason: collision with root package name */
    private List<C4408p> f4294d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Set<String>> f4295e;

    /* renamed from: f  reason: collision with root package name */
    private int f4296f = 0;

    public a(O o10) {
        this.f4291a = o10;
        this.f4293c = new HashMap();
        this.f4295e = new HashSet();
        this.f4292b = new ArrayList();
        this.f4294d = new ArrayList();
        e();
    }

    private void e() {
        Set<Set> hashSet = new HashSet<>();
        try {
            hashSet = this.f4291a.e();
        } catch (C6172g unused) {
            C4391e0.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        for (Set arrayList : hashSet) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() >= 2) {
                String str = (String) arrayList2.get(0);
                String str2 = (String) arrayList2.get(1);
                try {
                    if (O0.a(this.f4291a, str) && O0.a(this.f4291a, str2)) {
                        this.f4295e.add(new HashSet(Arrays.asList(new String[]{str, str2})));
                        if (!this.f4293c.containsKey(str)) {
                            this.f4293c.put(str, new ArrayList());
                        }
                        if (!this.f4293c.containsKey(str2)) {
                            this.f4293c.put(str2, new ArrayList());
                        }
                        this.f4293c.get(str).add((String) arrayList2.get(1));
                        this.f4293c.get(str2).add((String) arrayList2.get(0));
                    }
                } catch (C4387c0 unused2) {
                    C4391e0.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
            }
        }
    }

    public String a(String str) {
        if (!this.f4293c.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f4293c.get(str)) {
            Iterator<C4408p> it = this.f4294d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str2.equals(h.a(it.next()).b())) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public void b(a.C0035a aVar) {
        this.f4292b.add(aVar);
    }

    public int c() {
        return this.f4296f;
    }

    public void d(int i10) {
        if (i10 != this.f4296f) {
            for (a.C0035a a10 : this.f4292b) {
                a10.a(this.f4296f, i10);
            }
        }
        if (this.f4296f == 2 && i10 != 2) {
            this.f4294d.clear();
        }
        this.f4296f = i10;
    }
}
