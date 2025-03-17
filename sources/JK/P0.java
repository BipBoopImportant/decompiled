package jK;

import XH.C16820k;
import hK.C17339e;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"¨\u0006+"}, d2 = {"LjK/P0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "LhK/e;", "kind", "<init>", "(Ljava/lang/String;LhK/e;)V", "", "a", "()Ljava/lang/Void;", "", "index", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "j", "(I)Z", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "f", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "i", "b", "LhK/e;", "k", "()LhK/e;", "d", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class P0 implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    private final String f144056a;

    /* renamed from: b  reason: collision with root package name */
    private final C17339e f144057b;

    public P0(String str, C17339e eVar) {
        C17542s.j(str, "serialName");
        C17542s.j(eVar, "kind");
        this.f144056a = str;
        this.f144057b = eVar;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor " + i() + " does not have elements");
    }

    public int c(String str) {
        C17542s.j(str, "name");
        a();
        throw new C16820k();
    }

    public int d() {
        return 0;
    }

    public String e(int i10) {
        a();
        throw new C16820k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        return C17542s.e(i(), p02.i()) && C17542s.e(h(), p02.h());
    }

    public List<Annotation> f(int i10) {
        a();
        throw new C16820k();
    }

    public SerialDescriptor g(int i10) {
        a();
        throw new C16820k();
    }

    public int hashCode() {
        return i().hashCode() + (h().hashCode() * 31);
    }

    public String i() {
        return this.f144056a;
    }

    public boolean j(int i10) {
        a();
        throw new C16820k();
    }

    /* renamed from: k */
    public C17339e h() {
        return this.f144057b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + i() + ')';
    }
}
