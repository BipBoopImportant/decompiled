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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0014\u0010)\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0001\u0005*+,-.¨\u0006/"}, d2 = {"LjK/f0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "j", "(I)Z", "", "", "f", "(I)Ljava/util/List;", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "I", "d", "elementsCount", "LhK/l;", "h", "()LhK/l;", "kind", "LjK/d;", "LjK/e;", "LjK/Q;", "LjK/d0;", "LjK/N0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.f0  reason: case insensitive filesystem */
public abstract class C17452f0 implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    private final SerialDescriptor f144099a;

    /* renamed from: b  reason: collision with root package name */
    private final int f144100b;

    public /* synthetic */ C17452f0(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
    }

    public int c(String str) {
        C17542s.j(str, "name");
        Integer t10 = C15854t.t(str);
        if (t10 != null) {
            return t10.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    public int d() {
        return this.f144100b;
    }

    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17452f0)) {
            return false;
        }
        C17452f0 f0Var = (C17452f0) obj;
        return C17542s.e(this.f144099a, f0Var.f144099a) && C17542s.e(i(), f0Var.i());
    }

    public List<Annotation> f(int i10) {
        if (i10 >= 0) {
            return C16877v.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public SerialDescriptor g(int i10) {
        if (i10 >= 0) {
            return this.f144099a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public l h() {
        return m.b.f143471a;
    }

    public int hashCode() {
        return (this.f144099a.hashCode() * 31) + i().hashCode();
    }

    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.f144099a + ')';
    }

    private C17452f0(SerialDescriptor serialDescriptor) {
        this.f144099a = serialDescriptor;
        this.f144100b = 1;
    }
}
