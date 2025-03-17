package iK;

import fK.q;
import fK.r;
import jK.C17475r0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J%\u00106\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J%\u00108\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020#¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020&¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020)¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020,¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bF\u0010GJA\u0010K\u001a\u00020\t\"\n\b\u0000\u0010H*\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\bK\u0010LJA\u0010M\u001a\u00020\t\"\b\b\u0000\u0010H*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bM\u0010L¨\u0006N"}, d2 = {"LiK/b;", "Lkotlinx/serialization/encoding/Encoder;", "LiK/d;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/d;", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "I", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", "value", "J", "(Ljava/lang/Object;)V", "o", "r", "(Z)V", "", "g", "(B)V", "", "q", "(S)V", "C", "(I)V", "", "l", "(J)V", "", "t", "(F)V", "", "f", "(D)V", "", "u", "(C)V", "", "G", "(Ljava/lang/String;)V", "enumDescriptor", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "k", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "x", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "D", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "F", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "E", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "m", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "e", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "T", "LfK/r;", "serializer", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/r;Ljava/lang/Object;)V", "B", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iK.b  reason: case insensitive filesystem */
public abstract class C17393b implements Encoder, C17395d {
    public <T> void B(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(rVar, "serializer");
        if (I(serialDescriptor, i10)) {
            H(rVar, t10);
        }
    }

    public void C(int i10) {
        J(Integer.valueOf(i10));
    }

    public final void D(SerialDescriptor serialDescriptor, int i10, short s10) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            q(s10);
        }
    }

    public final void E(SerialDescriptor serialDescriptor, int i10, double d10) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            f(d10);
        }
    }

    public final void F(SerialDescriptor serialDescriptor, int i10, long j10) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            l(j10);
        }
    }

    public void G(String str) {
        C17542s.j(str, "value");
        J(str);
    }

    public boolean I(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return true;
    }

    public void J(Object obj) {
        C17542s.j(obj, "value");
        throw new q("Non-serializable " + P.b(obj.getClass()) + " is not supported by " + P.b(getClass()) + " encoder");
    }

    public C17395d b(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
    }

    public final Encoder e(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return I(serialDescriptor, i10) ? k(serialDescriptor.g(i10)) : C17475r0.f144154a;
    }

    public void f(double d10) {
        J(Double.valueOf(d10));
    }

    public void g(byte b10) {
        J(Byte.valueOf(b10));
    }

    public <T> void i(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(rVar, "serializer");
        if (I(serialDescriptor, i10)) {
            n(rVar, t10);
        }
    }

    public void j(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    public Encoder k(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return this;
    }

    public void l(long j10) {
        J(Long.valueOf(j10));
    }

    public final void m(SerialDescriptor serialDescriptor, int i10, char c10) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            u(c10);
        }
    }

    public void o() {
        throw new q("'null' is not supported by default");
    }

    public final void p(SerialDescriptor serialDescriptor, int i10, byte b10) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            g(b10);
        }
    }

    public void q(short s10) {
        J(Short.valueOf(s10));
    }

    public void r(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    public final void s(SerialDescriptor serialDescriptor, int i10, float f10) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            t(f10);
        }
    }

    public void t(float f10) {
        J(Float.valueOf(f10));
    }

    public void u(char c10) {
        J(Character.valueOf(c10));
    }

    public final void w(SerialDescriptor serialDescriptor, int i10, int i11) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            C(i11);
        }
    }

    public final void x(SerialDescriptor serialDescriptor, int i10, boolean z10) {
        C17542s.j(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            r(z10);
        }
    }

    public final void y(SerialDescriptor serialDescriptor, int i10, String str) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(str, "value");
        if (I(serialDescriptor, i10)) {
            G(str);
        }
    }
}
