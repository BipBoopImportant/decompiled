package jK;

import YH.C16877v;
import fK.C17251d;
import iK.C17394c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00028\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\rH\u0014¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b0\u00101J3\u00105\u001a\u00028\u0001\"\n\b\u0001\u0010!*\u0004\u0018\u00010\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u0001022\b\u00104\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u00020\rH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0018¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u000e¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001d¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020 ¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020#¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020&¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020)¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\bO\u0010PJ\u001d\u0010Q\u001a\u00020\u00122\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bQ\u0010RJ\u001d\u0010S\u001a\u00020\u00152\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bS\u0010TJ\u001d\u0010U\u001a\u00020\u00182\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bU\u0010VJ\u001d\u0010W\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bW\u0010XJ\u001d\u0010Y\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bY\u0010ZJ\u001d\u0010[\u001a\u00020 2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020#2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020&2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b_\u0010`J\u001d\u0010a\u001a\u00020)2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\ba\u0010bJ\u001d\u0010c\u001a\u00020\u00032\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bc\u0010dJA\u0010e\u001a\u00028\u0001\"\n\b\u0001\u0010!*\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u0001022\b\u00104\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\be\u0010fJC\u0010g\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010!*\u00020\u00012\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001022\b\u00104\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bg\u0010fJ\u0017\u0010j\u001a\u00020i2\u0006\u0010h\u001a\u00028\u0000H\u0004¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00028\u0000H\u0004¢\u0006\u0004\bl\u0010mR*\u0010t\u001a\u0012\u0012\u0004\u0012\u00028\u00000nj\b\u0012\u0004\u0012\u00028\u0000`o8\u0000X\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0016\u0010w\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010x\u001a\u0004\u0018\u00018\u00008DX\u0004¢\u0006\u0006\u001a\u0004\bv\u0010m¨\u0006y"}, d2 = {"LjK/b1;", "", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "LiK/c;", "<init>", "()V", "E", "tag", "Lkotlin/Function0;", "block", "e0", "(Ljava/lang/Object;LnI/a;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "a0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "", "O", "(Ljava/lang/Object;)Z", "", "P", "(Ljava/lang/Object;)B", "", "X", "(Ljava/lang/Object;)S", "V", "(Ljava/lang/Object;)I", "", "W", "(Ljava/lang/Object;)J", "", "T", "(Ljava/lang/Object;)F", "", "R", "(Ljava/lang/Object;)D", "", "Q", "(Ljava/lang/Object;)C", "", "Y", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "S", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "U", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "LfK/d;", "deserializer", "previousValue", "N", "(LfK/d;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "", "k", "()Ljava/lang/Void;", "x", "()Z", "I", "()B", "t", "()S", "i", "()I", "m", "()J", "u", "()F", "w", "()D", "y", "()C", "z", "()Ljava/lang/String;", "f", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "D", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "G", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "v", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "H", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "n", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "o", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/d;Ljava/lang/Object;)Ljava/lang/Object;", "A", "name", "LXH/N;", "d0", "(Ljava/lang/Object;)V", "c0", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "b0", "()Ljava/util/ArrayList;", "tagStack", "c", "Z", "flag", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b1<Tag> implements Decoder, C17394c {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Tag> f144088b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f144089c;

    /* access modifiers changed from: private */
    public static final Object L(b1 b1Var, C17251d dVar, Object obj) {
        return (dVar.getDescriptor().b() || b1Var.F()) ? b1Var.N(dVar, obj) : b1Var.k();
    }

    /* access modifiers changed from: private */
    public static final Object M(b1 b1Var, C17251d dVar, Object obj) {
        return b1Var.N(dVar, obj);
    }

    private final <E> E e0(Tag tag, C17631a<? extends E> aVar) {
        d0(tag);
        E invoke = aVar.invoke();
        if (!this.f144089c) {
            c0();
        }
        this.f144089c = false;
        return invoke;
    }

    public final <T> T A(SerialDescriptor serialDescriptor, int i10, C17251d<? extends T> dVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(dVar, "deserializer");
        return e0(a0(serialDescriptor, i10), new a1(this, dVar, t10));
    }

    public final char B(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return Q(a0(serialDescriptor, i10));
    }

    public final byte C(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return P(a0(serialDescriptor, i10));
    }

    public final boolean D(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return O(a0(serialDescriptor, i10));
    }

    public final short G(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return X(a0(serialDescriptor, i10));
    }

    public final double H(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return R(a0(serialDescriptor, i10));
    }

    public final byte I() {
        return P(c0());
    }

    /* access modifiers changed from: protected */
    public <T> T N(C17251d<? extends T> dVar, T t10) {
        C17542s.j(dVar, "deserializer");
        return E(dVar);
    }

    /* access modifiers changed from: protected */
    public abstract boolean O(Tag tag);

    /* access modifiers changed from: protected */
    public abstract byte P(Tag tag);

    /* access modifiers changed from: protected */
    public abstract char Q(Tag tag);

    /* access modifiers changed from: protected */
    public abstract double R(Tag tag);

    /* access modifiers changed from: protected */
    public abstract int S(Tag tag, SerialDescriptor serialDescriptor);

    /* access modifiers changed from: protected */
    public abstract float T(Tag tag);

    /* access modifiers changed from: protected */
    public Decoder U(Tag tag, SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "inlineDescriptor");
        d0(tag);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract int V(Tag tag);

    /* access modifiers changed from: protected */
    public abstract long W(Tag tag);

    /* access modifiers changed from: protected */
    public abstract short X(Tag tag);

    /* access modifiers changed from: protected */
    public abstract String Y(Tag tag);

    /* access modifiers changed from: protected */
    public final Tag Z() {
        return C16877v.K0(this.f144088b);
    }

    /* access modifiers changed from: protected */
    public abstract Tag a0(SerialDescriptor serialDescriptor, int i10);

    public final ArrayList<Tag> b0() {
        return this.f144088b;
    }

    /* access modifiers changed from: protected */
    public final Tag c0() {
        ArrayList<Tag> arrayList = this.f144088b;
        Tag remove = arrayList.remove(C16877v.p(arrayList));
        this.f144089c = true;
        return remove;
    }

    /* access modifiers changed from: protected */
    public final void d0(Tag tag) {
        this.f144088b.add(tag);
    }

    public final int f(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "enumDescriptor");
        return S(c0(), serialDescriptor);
    }

    public final long g(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return W(a0(serialDescriptor, i10));
    }

    public final int i() {
        return V(c0());
    }

    public final int j(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return V(a0(serialDescriptor, i10));
    }

    public final Void k() {
        return null;
    }

    public final long m() {
        return W(c0());
    }

    public final String n(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return Y(a0(serialDescriptor, i10));
    }

    public final <T> T o(SerialDescriptor serialDescriptor, int i10, C17251d<? extends T> dVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(dVar, "deserializer");
        return e0(a0(serialDescriptor, i10), new Z0(this, dVar, t10));
    }

    public Decoder r(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return U(c0(), serialDescriptor);
    }

    public final Decoder s(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return U(a0(serialDescriptor, i10), serialDescriptor.g(i10));
    }

    public final short t() {
        return X(c0());
    }

    public final float u() {
        return T(c0());
    }

    public final float v(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return T(a0(serialDescriptor, i10));
    }

    public final double w() {
        return R(c0());
    }

    public final boolean x() {
        return O(c0());
    }

    public final char y() {
        return Q(c0());
    }

    public final String z() {
        return Y(c0());
    }
}
