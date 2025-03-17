package uI;

import XH.u;
import YH.C16877v;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LuI/w;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "", "LuI/r;", "typeParameter", "<init>", "(LuI/r;)V", "", "getName", "()Ljava/lang/String;", "getGenericDeclaration", "()Ljava/lang/reflect/GenericDeclaration;", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "LuI/r;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uI.w  reason: case insensitive filesystem */
final class C18074w implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: a  reason: collision with root package name */
    private final C18069r f147790a;

    public C18074w(C18069r rVar) {
        C17542s.j(rVar, "typeParameter");
        this.f147790a = rVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            return C17542s.e(getName(), typeVariable.getName()) && C17542s.e(getGenericDeclaration(), typeVariable.getGenericDeclaration());
        }
    }

    public Type[] getBounds() {
        Iterable<C18068q> upperBounds = this.f147790a.getUpperBounds();
        ArrayList arrayList = new ArrayList(C16877v.y(upperBounds, 10));
        for (C18068q a10 : upperBounds) {
            arrayList.add(C18075x.c(a10, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    public GenericDeclaration getGenericDeclaration() {
        throw new u("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f147790a));
    }

    public String getName() {
        return this.f147790a.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
