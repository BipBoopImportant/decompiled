package OH;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"LOH/a;", "", "LuI/d;", "type", "Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "LuI/q;", "kotlinType", "<init>", "(LuI/d;Ljava/lang/reflect/Type;LuI/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LuI/d;", "b", "()LuI/d;", "Ljava/lang/reflect/Type;", "getReifiedType", "()Ljava/lang/reflect/Type;", "c", "LuI/q;", "()LuI/q;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: OH.a  reason: case insensitive filesystem */
public final class C16158a {

    /* renamed from: a  reason: collision with root package name */
    private final C18055d<?> f136903a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f136904b;

    /* renamed from: c  reason: collision with root package name */
    private final C18068q f136905c;

    public C16158a(C18055d<?> dVar, Type type, C18068q qVar) {
        C17542s.j(dVar, "type");
        C17542s.j(type, "reifiedType");
        this.f136903a = dVar;
        this.f136904b = type;
        this.f136905c = qVar;
    }

    public final C18068q a() {
        return this.f136905c;
    }

    public final C18055d<?> b() {
        return this.f136903a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16158a)) {
            return false;
        }
        C16158a aVar = (C16158a) obj;
        return C17542s.e(this.f136903a, aVar.f136903a) && C17542s.e(this.f136904b, aVar.f136904b) && C17542s.e(this.f136905c, aVar.f136905c);
    }

    public int hashCode() {
        int hashCode = ((this.f136903a.hashCode() * 31) + this.f136904b.hashCode()) * 31;
        C18068q qVar = this.f136905c;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public String toString() {
        return "TypeInfo(type=" + this.f136903a + ", reifiedType=" + this.f136904b + ", kotlinType=" + this.f136905c + ')';
    }
}
