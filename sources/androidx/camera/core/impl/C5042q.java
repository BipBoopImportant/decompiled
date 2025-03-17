package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.core.impl.q  reason: case insensitive filesystem */
public final class C5042q {

    /* renamed from: androidx.camera.core.impl.q$a */
    public static final class a extends C5040p {

        /* renamed from: a  reason: collision with root package name */
        private final List<C5040p> f16992a = new ArrayList();

        a(List<C5040p> list) {
            for (C5040p next : list) {
                if (!(next instanceof b)) {
                    this.f16992a.add(next);
                }
            }
        }

        public void a(int i10) {
            for (C5040p a10 : this.f16992a) {
                a10.a(i10);
            }
        }

        public void b(int i10, C5059z zVar) {
            for (C5040p b10 : this.f16992a) {
                b10.b(i10, zVar);
            }
        }

        public void c(int i10, r rVar) {
            for (C5040p c10 : this.f16992a) {
                c10.c(i10, rVar);
            }
        }

        public void d(int i10) {
            for (C5040p d10 : this.f16992a) {
                d10.d(i10);
            }
        }

        public List<C5040p> e() {
            return this.f16992a;
        }
    }

    /* renamed from: androidx.camera.core.impl.q$b */
    static final class b extends C5040p {
        b() {
        }

        public void b(int i10, C5059z zVar) {
        }

        public void c(int i10, r rVar) {
        }

        public void d(int i10) {
        }
    }

    static C5040p a(List<C5040p> list) {
        return list.isEmpty() ? c() : list.size() == 1 ? list.get(0) : new a(list);
    }

    public static C5040p b(C5040p... pVarArr) {
        return a(Arrays.asList(pVarArr));
    }

    public static C5040p c() {
        return new b();
    }
}
