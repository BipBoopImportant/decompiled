package D6;

import E6.b;
import I6.d;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;
import y6.l;

public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34504a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34505b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34506c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f34504a = str;
        this.f34505b = aVar;
        this.f34506c = z10;
    }

    public C8986c a(o oVar, C8927i iVar, b bVar) {
        if (oVar.z()) {
            return new l(this);
        }
        d.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f34505b;
    }

    public String c() {
        return this.f34504a;
    }

    public boolean d() {
        return this.f34506c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f34505b + '}';
    }
}
