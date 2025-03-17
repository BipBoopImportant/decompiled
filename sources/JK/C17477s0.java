package jK;

import XH.C16820k;
import hK.l;
import hK.m;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0019R\u0014\u0010*\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001f¨\u0006+"}, d2 = {"LjK/s0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "", "a", "()Ljava/lang/Void;", "", "index", "", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "j", "(I)Z", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "f", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "LhK/l;", "b", "LhK/l;", "h", "()LhK/l;", "kind", "Ljava/lang/String;", "i", "serialName", "d", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.s0  reason: case insensitive filesystem */
public final class C17477s0 implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public static final C17477s0 f144158a = new C17477s0();

    /* renamed from: b  reason: collision with root package name */
    private static final l f144159b = m.d.f143473a;

    /* renamed from: c  reason: collision with root package name */
    private static final String f144160c = "kotlin.Nothing";

    private C17477s0() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return this == obj;
    }

    public List<Annotation> f(int i10) {
        a();
        throw new C16820k();
    }

    public SerialDescriptor g(int i10) {
        a();
        throw new C16820k();
    }

    public l h() {
        return f144159b;
    }

    public int hashCode() {
        return i().hashCode() + (h().hashCode() * 31);
    }

    public String i() {
        return f144160c;
    }

    public boolean j(int i10) {
        a();
        throw new C16820k();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
