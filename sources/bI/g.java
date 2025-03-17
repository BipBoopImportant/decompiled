package BI;

import BI.f;
import HJ.C15854t;
import YH.C16877v;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f133291c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final g f133292d = new g(C16877v.q(f.a.f133287e, f.d.f133290e, f.b.f133288e, f.c.f133289e));

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f133293a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C17066c, List<f>> f133294b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f133292d;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f133295a;

        /* renamed from: b  reason: collision with root package name */
        private final int f133296b;

        public b(f fVar, int i10) {
            C17542s.j(fVar, "kind");
            this.f133295a = fVar;
            this.f133296b = i10;
        }

        public final f a() {
            return this.f133295a;
        }

        public final int b() {
            return this.f133296b;
        }

        public final f c() {
            return this.f133295a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f133295a, bVar.f133295a) && this.f133296b == bVar.f133296b;
        }

        public int hashCode() {
            return (this.f133295a.hashCode() * 31) + Integer.hashCode(this.f133296b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f133295a + ", arity=" + this.f133296b + ')';
        }
    }

    public g(List<? extends f> list) {
        C17542s.j(list, "kinds");
        this.f133293a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            C17066c b10 = ((f) next).b();
            Object obj = linkedHashMap.get(b10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b10, obj);
            }
            ((List) obj).add(next);
        }
        this.f133294b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int charAt = str.charAt(i11) - '0';
            if (charAt < 0 || charAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + charAt;
        }
        return Integer.valueOf(i10);
    }

    public final f b(C17066c cVar, String str) {
        C17542s.j(cVar, "packageFqName");
        C17542s.j(str, "className");
        b c10 = c(cVar, str);
        if (c10 != null) {
            return c10.c();
        }
        return null;
    }

    public final b c(C17066c cVar, String str) {
        C17542s.j(cVar, "packageFqName");
        C17542s.j(str, "className");
        List<f> list = this.f133294b.get(cVar);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (C15854t.W(str, fVar.a(), false, 2, (Object) null)) {
                String substring = str.substring(fVar.a().length());
                C17542s.i(substring, "substring(...)");
                Integer d10 = d(substring);
                if (d10 != null) {
                    return new b(fVar, d10.intValue());
                }
            }
        }
        return null;
    }
}
