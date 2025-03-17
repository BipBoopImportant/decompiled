package uI;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LuI/a;", "Ljava/lang/reflect/GenericArrayType;", "", "Ljava/lang/reflect/Type;", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "getGenericComponentType", "()Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/lang/reflect/Type;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uI.a  reason: case insensitive filesystem */
final class C18052a implements GenericArrayType, Type {

    /* renamed from: a  reason: collision with root package name */
    private final Type f147780a;

    public C18052a(Type type) {
        C17542s.j(type, "elementType");
        this.f147780a = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C17542s.e(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    public Type getGenericComponentType() {
        return this.f147780a;
    }

    public String getTypeName() {
        return C18075x.h(this.f147780a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
