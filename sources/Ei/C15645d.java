package EI;

import DI.i0;
import EI.C15644c;
import cJ.C17066c;
import cJ.C17069f;
import fJ.n;
import iJ.C17373g;
import java.util.Map;
import uJ.C18096U;

/* renamed from: EI.d  reason: case insensitive filesystem */
public class C15645d implements C15644c {

    /* renamed from: a  reason: collision with root package name */
    private final C18096U f134222a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C17069f, C17373g<?>> f134223b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f134224c;

    public C15645d(C18096U u10, Map<C17069f, C17373g<?>> map, i0 i0Var) {
        if (u10 == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (i0Var == null) {
            b(2);
        }
        this.f134222a = u10;
        this.f134223b = map;
        this.f134224c = i0Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3)];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i10 == 3 || i10 == 4 || i10 == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i10 == 3 || i10 == 4 || i10 == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public Map<C17069f, C17373g<?>> a() {
        Map<C17069f, C17373g<?>> map = this.f134223b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    public C17066c f() {
        return C15644c.a.a(this);
    }

    public C18096U getType() {
        C18096U u10 = this.f134222a;
        if (u10 == null) {
            b(3);
        }
        return u10;
    }

    public i0 i() {
        i0 i0Var = this.f134224c;
        if (i0Var == null) {
            b(5);
        }
        return i0Var;
    }

    public String toString() {
        return n.f143180h.N(this, (C15646e) null);
    }
}
