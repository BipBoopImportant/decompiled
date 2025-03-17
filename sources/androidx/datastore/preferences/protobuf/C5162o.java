package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5170x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o  reason: case insensitive filesystem */
public class C5162o {

    /* renamed from: b  reason: collision with root package name */
    private static volatile C5162o f21399b;

    /* renamed from: c  reason: collision with root package name */
    static final C5162o f21400c = new C5162o(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, C5170x.e<?, ?>> f21401a;

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f21402a;

        /* renamed from: b  reason: collision with root package name */
        private final int f21403b;

        a(Object obj, int i10) {
            this.f21402a = obj;
            this.f21403b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21402a == aVar.f21402a && this.f21403b == aVar.f21403b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f21402a) * 65535) + this.f21403b;
        }
    }

    C5162o() {
        this.f21401a = new HashMap();
    }

    public static C5162o b() {
        if (d0.f21299d) {
            return f21400c;
        }
        C5162o oVar = f21399b;
        if (oVar == null) {
            synchronized (C5162o.class) {
                try {
                    oVar = f21399b;
                    if (oVar == null) {
                        oVar = C5161n.a();
                        f21399b = oVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return oVar;
    }

    public <ContainingType extends S> C5170x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return this.f21401a.get(new a(containingtype, i10));
    }

    C5162o(boolean z10) {
        this.f21401a = Collections.emptyMap();
    }
}
