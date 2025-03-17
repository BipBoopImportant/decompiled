package JI;

import TI.m;
import cJ.C17065b;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class v extends C15967h implements m {

    /* renamed from: c  reason: collision with root package name */
    private final Enum<?> f135802c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(C17069f fVar, Enum<?> enumR) {
        super(fVar, (DefaultConstructorMarker) null);
        C17542s.j(enumR, "value");
        this.f135802c = enumR;
    }

    public C17065b d() {
        Class<?> cls = this.f135802c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C17542s.g(cls);
        return C15965f.e(cls);
    }

    public C17069f e() {
        return C17069f.v(this.f135802c.name());
    }
}
