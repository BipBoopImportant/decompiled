package uI;

import YH.C16870n;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"LuI/v;", "Ljava/lang/reflect/ParameterizedType;", "", "Ljava/lang/Class;", "rawType", "Ljava/lang/reflect/Type;", "ownerType", "", "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "getRawType", "()Ljava/lang/reflect/Type;", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/lang/Class;", "b", "Ljava/lang/reflect/Type;", "c", "[Ljava/lang/reflect/Type;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uI.v  reason: case insensitive filesystem */
final class C18073v implements ParameterizedType, Type {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f147786a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f147787b;

    /* renamed from: c  reason: collision with root package name */
    private final Type[] f147788c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uI.v$a */
    /* synthetic */ class a extends C17540p implements C17642l<Type, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f147789a = new a();

        a() {
            super(1, C18075x.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        /* renamed from: t */
        public final String invoke(Type type) {
            C17542s.j(type, "p0");
            return C18075x.h(type);
        }
    }

    public C18073v(Class<?> cls, Type type, List<? extends Type> list) {
        C17542s.j(cls, "rawType");
        C17542s.j(list, "typeArguments");
        this.f147786a = cls;
        this.f147787b = type;
        this.f147788c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return C17542s.e(this.f147786a, parameterizedType.getRawType()) && C17542s.e(this.f147787b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    public Type[] getActualTypeArguments() {
        return this.f147788c;
    }

    public Type getOwnerType() {
        return this.f147787b;
    }

    public Type getRawType() {
        return this.f147786a;
    }

    public String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f147787b;
        if (type != null) {
            sb2.append(C18075x.h(type));
            sb2.append("$");
            sb2.append(this.f147786a.getSimpleName());
        } else {
            sb2.append(C18075x.h(this.f147786a));
        }
        Type[] typeArr = this.f147788c;
        if (!(typeArr.length == 0)) {
            C16870n.y0(typeArr, sb2, (CharSequence) null, "<", ">", 0, (CharSequence) null, a.f147789a, 50, (Object) null);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int hashCode = this.f147786a.hashCode();
        Type type = this.f147787b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
