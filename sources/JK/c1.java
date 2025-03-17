package jK;

import YH.C16877v;
import fK.q;
import fK.r;
import iK.C17395d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010KJ%\u0010M\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b_\u0010`JA\u0010c\u001a\u00020\u0012\"\n\b\u0001\u0010**\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00010a2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\bc\u0010dJA\u0010e\u001a\u00020\u0012\"\b\b\u0001\u0010**\u00020\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00010a2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\be\u0010dJ\u0017\u0010g\u001a\u00020\u00122\u0006\u0010f\u001a\u00028\u0000H\u0004¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00028\u0000H\u0004¢\u0006\u0004\bi\u0010jR$\u0010o\u001a\u0012\u0012\u0004\u0012\u00028\u00000kj\b\u0012\u0004\u0012\u00028\u0000`l8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00028\u00008DX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010jR\u0016\u0010s\u001a\u0004\u0018\u00018\u00008DX\u0004¢\u0006\u0006\u001a\u0004\br\u0010j¨\u0006t"}, d2 = {"LjK/c1;", "", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "LiK/d;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "", "index", "", "I", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "X", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "value", "LXH/N;", "Q", "(Ljava/lang/Object;I)V", "", "K", "(Ljava/lang/Object;B)V", "", "S", "(Ljava/lang/Object;S)V", "", "R", "(Ljava/lang/Object;J)V", "", "O", "(Ljava/lang/Object;F)V", "", "M", "(Ljava/lang/Object;D)V", "J", "(Ljava/lang/Object;Z)V", "", "L", "(Ljava/lang/Object;C)V", "", "T", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "N", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "inlineDescriptor", "P", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "descriptor", "k", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "r", "(Z)V", "g", "(B)V", "q", "(S)V", "C", "(I)V", "l", "(J)V", "t", "(F)V", "f", "(D)V", "u", "(C)V", "G", "(Ljava/lang/String;)V", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "U", "x", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "D", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "F", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "E", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "m", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "e", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "LfK/r;", "serializer", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/r;Ljava/lang/Object;)V", "B", "name", "Z", "(Ljava/lang/Object;)V", "Y", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "tagStack", "V", "currentTag", "W", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c1<Tag> implements Encoder, C17395d {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Tag> f144091a = new ArrayList<>();

    private final boolean I(SerialDescriptor serialDescriptor, int i10) {
        Z(X(serialDescriptor, i10));
        return true;
    }

    public <T> void B(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(rVar, "serializer");
        if (I(serialDescriptor, i10)) {
            H(rVar, t10);
        }
    }

    public final void C(int i10) {
        Q(Y(), i10);
    }

    public final void D(SerialDescriptor serialDescriptor, int i10, short s10) {
        C17542s.j(serialDescriptor, "descriptor");
        S(X(serialDescriptor, i10), s10);
    }

    public final void E(SerialDescriptor serialDescriptor, int i10, double d10) {
        C17542s.j(serialDescriptor, "descriptor");
        M(X(serialDescriptor, i10), d10);
    }

    public final void F(SerialDescriptor serialDescriptor, int i10, long j10) {
        C17542s.j(serialDescriptor, "descriptor");
        R(X(serialDescriptor, i10), j10);
    }

    public final void G(String str) {
        C17542s.j(str, "value");
        T(Y(), str);
    }

    /* access modifiers changed from: protected */
    public abstract void J(Tag tag, boolean z10);

    /* access modifiers changed from: protected */
    public abstract void K(Tag tag, byte b10);

    /* access modifiers changed from: protected */
    public abstract void L(Tag tag, char c10);

    /* access modifiers changed from: protected */
    public abstract void M(Tag tag, double d10);

    /* access modifiers changed from: protected */
    public abstract void N(Tag tag, SerialDescriptor serialDescriptor, int i10);

    /* access modifiers changed from: protected */
    public abstract void O(Tag tag, float f10);

    /* access modifiers changed from: protected */
    public Encoder P(Tag tag, SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "inlineDescriptor");
        Z(tag);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract void Q(Tag tag, int i10);

    /* access modifiers changed from: protected */
    public abstract void R(Tag tag, long j10);

    /* access modifiers changed from: protected */
    public abstract void S(Tag tag, short s10);

    /* access modifiers changed from: protected */
    public abstract void T(Tag tag, String str);

    /* access modifiers changed from: protected */
    public abstract void U(SerialDescriptor serialDescriptor);

    /* access modifiers changed from: protected */
    public final Tag V() {
        return C16877v.I0(this.f144091a);
    }

    /* access modifiers changed from: protected */
    public final Tag W() {
        return C16877v.K0(this.f144091a);
    }

    /* access modifiers changed from: protected */
    public abstract Tag X(SerialDescriptor serialDescriptor, int i10);

    /* access modifiers changed from: protected */
    public final Tag Y() {
        if (!this.f144091a.isEmpty()) {
            ArrayList<Tag> arrayList = this.f144091a;
            return arrayList.remove(C16877v.p(arrayList));
        }
        throw new q("No tag in stack for requested element");
    }

    /* access modifiers changed from: protected */
    public final void Z(Tag tag) {
        this.f144091a.add(tag);
    }

    public final void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (!this.f144091a.isEmpty()) {
            Y();
        }
        U(serialDescriptor);
    }

    public final Encoder e(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return P(X(serialDescriptor, i10), serialDescriptor.g(i10));
    }

    public final void f(double d10) {
        M(Y(), d10);
    }

    public final void g(byte b10) {
        K(Y(), b10);
    }

    public <T> void i(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(rVar, "serializer");
        if (I(serialDescriptor, i10)) {
            n(rVar, t10);
        }
    }

    public final void j(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "enumDescriptor");
        N(Y(), serialDescriptor, i10);
    }

    public Encoder k(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return P(Y(), serialDescriptor);
    }

    public final void l(long j10) {
        R(Y(), j10);
    }

    public final void m(SerialDescriptor serialDescriptor, int i10, char c10) {
        C17542s.j(serialDescriptor, "descriptor");
        L(X(serialDescriptor, i10), c10);
    }

    public final void p(SerialDescriptor serialDescriptor, int i10, byte b10) {
        C17542s.j(serialDescriptor, "descriptor");
        K(X(serialDescriptor, i10), b10);
    }

    public final void q(short s10) {
        S(Y(), s10);
    }

    public final void r(boolean z10) {
        J(Y(), z10);
    }

    public final void s(SerialDescriptor serialDescriptor, int i10, float f10) {
        C17542s.j(serialDescriptor, "descriptor");
        O(X(serialDescriptor, i10), f10);
    }

    public final void t(float f10) {
        O(Y(), f10);
    }

    public final void u(char c10) {
        L(Y(), c10);
    }

    public final void w(SerialDescriptor serialDescriptor, int i10, int i11) {
        C17542s.j(serialDescriptor, "descriptor");
        Q(X(serialDescriptor, i10), i11);
    }

    public final void x(SerialDescriptor serialDescriptor, int i10, boolean z10) {
        C17542s.j(serialDescriptor, "descriptor");
        J(X(serialDescriptor, i10), z10);
    }

    public final void y(SerialDescriptor serialDescriptor, int i10, String str) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(str, "value");
        T(X(serialDescriptor, i10), str);
    }
}
