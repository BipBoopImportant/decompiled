package DI;

import XH.v;
import YH.X;
import cJ.C17069f;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yJ.C18741j;

/* renamed from: DI.J  reason: case insensitive filesystem */
public final class C15539J<Type extends C18741j> extends s0<Type> {

    /* renamed from: a  reason: collision with root package name */
    private final List<v<C17069f, Type>> f133810a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C17069f, Type> f133811b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15539J(List<? extends v<C17069f, ? extends Type>> list) {
        super((DefaultConstructorMarker) null);
        C17542s.j(list, "underlyingPropertyNamesToTypes");
        this.f133810a = list;
        Map<C17069f, Type> v10 = X.v(c());
        if (v10.size() == c().size()) {
            this.f133811b = v10;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names");
    }

    public boolean a(C17069f fVar) {
        C17542s.j(fVar, "name");
        return this.f133811b.containsKey(fVar);
    }

    public List<v<C17069f, Type>> c() {
        return this.f133810a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
