package JI;

import TI.y;
import YH.C16877v;
import cJ.C17066c;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class F extends u implements j, y {

    /* renamed from: a  reason: collision with root package name */
    private final TypeVariable<?> f135752a;

    public F(TypeVariable<?> typeVariable) {
        C17542s.j(typeVariable, "typeVariable");
        this.f135752a = typeVariable;
    }

    public boolean E() {
        return false;
    }

    /* renamed from: R */
    public List<s> getUpperBounds() {
        Type[] bounds = this.f135752a.getBounds();
        C17542s.i(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type sVar : bounds) {
            arrayList.add(new s(sVar));
        }
        s sVar2 = (s) C16877v.d1(arrayList);
        return C17542s.e(sVar2 != null ? sVar2.R() : null, Object.class) ? C16877v.n() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof F) && C17542s.e(this.f135752a, ((F) obj).f135752a);
    }

    public C17069f getName() {
        C17069f v10 = C17069f.v(this.f135752a.getName());
        C17542s.i(v10, "identifier(...)");
        return v10;
    }

    public int hashCode() {
        return this.f135752a.hashCode();
    }

    public AnnotatedElement s() {
        TypeVariable<?> typeVariable = this.f135752a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public String toString() {
        return F.class.getName() + ": " + this.f135752a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = JI.k.b((r0 = r0.getDeclaredAnnotations()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<JI.C15966g> getAnnotations() {
        /*
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.s()
            if (r0 == 0) goto L_0x0012
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = JI.k.b(r0)
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.util.List r0 = YH.C16877v.n()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: JI.F.getAnnotations():java.util.List");
    }

    public C15966g v(C17066c cVar) {
        Annotation[] declaredAnnotations;
        C17542s.j(cVar, "fqName");
        AnnotatedElement s10 = s();
        if (s10 == null || (declaredAnnotations = s10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }
}
