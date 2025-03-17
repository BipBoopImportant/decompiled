package iK;

import fK.C17251d;
import fK.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J5\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\n\b\u0002\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00122\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00182\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020!2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020$2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010MJ=\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bN\u0010OJC\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020\u00052\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bP\u0010O¨\u0006Q"}, d2 = {"LiK/a;", "Lkotlinx/serialization/encoding/Decoder;", "LiK/c;", "<init>", "()V", "", "K", "()Ljava/lang/Object;", "", "F", "()Z", "", "k", "()Ljava/lang/Void;", "x", "", "I", "()B", "", "t", "()S", "", "i", "()I", "", "m", "()J", "", "u", "()F", "", "w", "()D", "", "y", "()C", "", "z", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "f", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "descriptor", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "LfK/d;", "deserializer", "previousValue", "J", "(LfK/d;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/c;", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "index", "D", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "G", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "v", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "H", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "n", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "o", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/d;Ljava/lang/Object;)Ljava/lang/Object;", "A", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iK.a  reason: case insensitive filesystem */
public abstract class C17392a implements Decoder, C17394c {
    public final <T> T A(SerialDescriptor serialDescriptor, int i10, C17251d<? extends T> dVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(dVar, "deserializer");
        return (dVar.getDescriptor().b() || F()) ? J(dVar, t10) : k();
    }

    public final char B(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return y();
    }

    public final byte C(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return I();
    }

    public final boolean D(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return x();
    }

    public boolean F() {
        return true;
    }

    public final short G(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return t();
    }

    public final double H(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return w();
    }

    public byte I() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) K10).byteValue();
    }

    public <T> T J(C17251d<? extends T> dVar, T t10) {
        C17542s.j(dVar, "deserializer");
        return E(dVar);
    }

    public Object K() {
        throw new q(P.b(getClass()) + " can't retrieve untyped values");
    }

    public C17394c b(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
    }

    public int f(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "enumDescriptor");
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) K10).intValue();
    }

    public final long g(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return m();
    }

    public int i() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) K10).intValue();
    }

    public final int j(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return i();
    }

    public Void k() {
        return null;
    }

    public long m() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) K10).longValue();
    }

    public final String n(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return z();
    }

    public <T> T o(SerialDescriptor serialDescriptor, int i10, C17251d<? extends T> dVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(dVar, "deserializer");
        return J(dVar, t10);
    }

    public Decoder r(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return this;
    }

    public Decoder s(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return r(serialDescriptor.g(i10));
    }

    public short t() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) K10).shortValue();
    }

    public float u() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) K10).floatValue();
    }

    public final float v(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return u();
    }

    public double w() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) K10).doubleValue();
    }

    public boolean x() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) K10).booleanValue();
    }

    public char y() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) K10).charValue();
    }

    public String z() {
        Object K10 = K();
        C17542s.h(K10, "null cannot be cast to non-null type kotlin.String");
        return (String) K10;
    }
}
