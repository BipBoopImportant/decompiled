package DI;

import cJ.C17069f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yJ.C18741j;

/* renamed from: DI.A  reason: case insensitive filesystem */
public final class C15530A<Type extends C18741j> extends s0<Type> {

    /* renamed from: a  reason: collision with root package name */
    private final C17069f f133806a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f133807b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15530A(C17069f fVar, Type type) {
        super((DefaultConstructorMarker) null);
        C17542s.j(fVar, "underlyingPropertyName");
        C17542s.j(type, "underlyingType");
        this.f133806a = fVar;
        this.f133807b = type;
    }

    public boolean a(C17069f fVar) {
        C17542s.j(fVar, "name");
        return C17542s.e(this.f133806a, fVar);
    }

    public final C17069f c() {
        return this.f133806a;
    }

    public final Type d() {
        return this.f133807b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f133806a + ", underlyingType=" + this.f133807b + ')';
    }
}
