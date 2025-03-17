package iK;

import fK.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020#H&¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b'\u0010(JA\u0010,\u001a\u00020\u0004\"\n\b\u0000\u0010)*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b,\u0010-JA\u0010.\u001a\u00020\u0004\"\b\b\u0000\u0010)*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b.\u0010-¨\u0006/À\u0006\u0003"}, d2 = {"LiK/d;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "value", "x", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "", "D", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "", "m", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "", "F", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "", "E", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "Lkotlinx/serialization/encoding/Encoder;", "e", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "T", "LfK/r;", "serializer", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/r;Ljava/lang/Object;)V", "B", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iK.d  reason: case insensitive filesystem */
public interface C17395d {
    <T> void B(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10);

    void D(SerialDescriptor serialDescriptor, int i10, short s10);

    void E(SerialDescriptor serialDescriptor, int i10, double d10);

    void F(SerialDescriptor serialDescriptor, int i10, long j10);

    void c(SerialDescriptor serialDescriptor);

    Encoder e(SerialDescriptor serialDescriptor, int i10);

    <T> void i(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10);

    void m(SerialDescriptor serialDescriptor, int i10, char c10);

    void p(SerialDescriptor serialDescriptor, int i10, byte b10);

    void s(SerialDescriptor serialDescriptor, int i10, float f10);

    void w(SerialDescriptor serialDescriptor, int i10, int i11);

    void x(SerialDescriptor serialDescriptor, int i10, boolean z10);

    void y(SerialDescriptor serialDescriptor, int i10, String str);

    boolean z(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return true;
    }
}
