package jK;

import HJ.C15854t;
import YH.C16877v;
import hK.l;
import hK.m;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010*\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u001dR\u0014\u0010.\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0001\u0002/0¨\u00061"}, d2 = {"LjK/l0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "j", "(I)Z", "", "", "f", "(I)Ljava/util/List;", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKeyDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getValueDescriptor", "d", "I", "elementsCount", "LhK/l;", "h", "()LhK/l;", "kind", "LjK/O;", "LjK/b0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.l0  reason: case insensitive filesystem */
public abstract class C17464l0 implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    private final String f144130a;

    /* renamed from: b  reason: collision with root package name */
    private final SerialDescriptor f144131b;

    /* renamed from: c  reason: collision with root package name */
    private final SerialDescriptor f144132c;

    /* renamed from: d  reason: collision with root package name */
    private final int f144133d;

    public /* synthetic */ C17464l0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    public int c(String str) {
        C17542s.j(str, "name");
        Integer t10 = C15854t.t(str);
        if (t10 != null) {
            return t10.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    public int d() {
        return this.f144133d;
    }

    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17464l0)) {
            return false;
        }
        C17464l0 l0Var = (C17464l0) obj;
        return C17542s.e(i(), l0Var.i()) && C17542s.e(this.f144131b, l0Var.f144131b) && C17542s.e(this.f144132c, l0Var.f144132c);
    }

    public List<Annotation> f(int i10) {
        if (i10 >= 0) {
            return C16877v.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public SerialDescriptor g(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f144131b;
            }
            if (i11 == 1) {
                return this.f144132c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public l h() {
        return m.c.f143472a;
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + this.f144131b.hashCode()) * 31) + this.f144132c.hashCode();
    }

    public String i() {
        return this.f144130a;
    }

    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.f144131b + ", " + this.f144132c + ')';
    }

    private C17464l0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f144130a = str;
        this.f144131b = serialDescriptor;
        this.f144132c = serialDescriptor2;
        this.f144133d = 2;
    }
}
