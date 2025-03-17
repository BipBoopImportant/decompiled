package JI;

import TI.C16494B;
import cJ.C17066c;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class G extends u implements C16494B {

    /* renamed from: a  reason: collision with root package name */
    private final E f135753a;

    /* renamed from: b  reason: collision with root package name */
    private final Annotation[] f135754b;

    /* renamed from: c  reason: collision with root package name */
    private final String f135755c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f135756d;

    public G(E e10, Annotation[] annotationArr, String str, boolean z10) {
        C17542s.j(e10, "type");
        C17542s.j(annotationArr, "reflectAnnotations");
        this.f135753a = e10;
        this.f135754b = annotationArr;
        this.f135755c = str;
        this.f135756d = z10;
    }

    public boolean E() {
        return false;
    }

    /* renamed from: R */
    public E getType() {
        return this.f135753a;
    }

    public boolean b() {
        return this.f135756d;
    }

    public C17069f getName() {
        String str = this.f135755c;
        if (str != null) {
            return C17069f.n(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G.class.getName());
        sb2.append(": ");
        sb2.append(b() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    public List<C15966g> getAnnotations() {
        return k.b(this.f135754b);
    }

    public C15966g v(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return k.a(this.f135754b, cVar);
    }
}
