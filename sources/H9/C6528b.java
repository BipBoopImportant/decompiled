package H9;

import K9.C6619q;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* renamed from: H9.b  reason: case insensitive filesystem */
public final class C6528b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f36546a;

    /* renamed from: b  reason: collision with root package name */
    private final a f36547b;

    /* renamed from: c  reason: collision with root package name */
    private final a.d f36548c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36549d;

    private C6528b(a aVar, a.d dVar, String str) {
        this.f36547b = aVar;
        this.f36548c = dVar;
        this.f36549d = str;
        this.f36546a = C6619q.c(aVar, dVar, str);
    }

    public static <O extends a.d> C6528b<O> a(a<O> aVar, O o10, String str) {
        return new C6528b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f36547b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6528b)) {
            return false;
        }
        C6528b bVar = (C6528b) obj;
        return C6619q.b(this.f36547b, bVar.f36547b) && C6619q.b(this.f36548c, bVar.f36548c) && C6619q.b(this.f36549d, bVar.f36549d);
    }

    public final int hashCode() {
        return this.f36546a;
    }
}
