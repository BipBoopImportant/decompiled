package kotlinx.serialization.encoding;

import fK.r;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mK.C17611d;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0013H&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\"H&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\"H&¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020*2\u0006\u0010'\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J1\u00103\u001a\u00020\u0002\"\n\b\u0000\u00100*\u0004\u0018\u00010\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J1\u00105\u001a\u00020\u0002\"\b\b\u0000\u00100*\u00020\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b5\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "LXH/N;", "v", "()V", "o", "", "value", "r", "(Z)V", "", "g", "(B)V", "", "q", "(S)V", "", "u", "(C)V", "", "C", "(I)V", "", "l", "(J)V", "", "t", "(F)V", "", "f", "(D)V", "", "G", "(Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "descriptor", "k", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "LiK/d;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/d;", "collectionSize", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)LiK/d;", "T", "LfK/r;", "serializer", "n", "(LfK/r;Ljava/lang/Object;)V", "H", "LmK/d;", "a", "()LmK/d;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Encoder {
    void C(int i10);

    void G(String str);

    <T> void H(r<? super T> rVar, T t10) {
        C17542s.j(rVar, "serializer");
        if (rVar.getDescriptor().b()) {
            n(rVar, t10);
        } else if (t10 == null) {
            o();
        } else {
            v();
            n(rVar, t10);
        }
    }

    C17611d a();

    C17395d b(SerialDescriptor serialDescriptor);

    void f(double d10);

    void g(byte b10);

    C17395d h(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return b(serialDescriptor);
    }

    void j(SerialDescriptor serialDescriptor, int i10);

    Encoder k(SerialDescriptor serialDescriptor);

    void l(long j10);

    <T> void n(r<? super T> rVar, T t10) {
        C17542s.j(rVar, "serializer");
        rVar.serialize(this, t10);
    }

    void o();

    void q(short s10);

    void r(boolean z10);

    void t(float f10);

    void u(char c10);

    void v() {
    }
}
