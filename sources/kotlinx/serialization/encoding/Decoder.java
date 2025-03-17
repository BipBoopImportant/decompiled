package kotlinx.serialization.encoding;

import fK.C17251d;
import iK.C17394c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mK.C17611d;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020!H&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020!H&¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "", "F", "()Z", "", "k", "()Ljava/lang/Void;", "x", "", "I", "()B", "", "t", "()S", "", "y", "()C", "", "i", "()I", "", "m", "()J", "", "u", "()F", "", "w", "()D", "", "z", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "f", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "descriptor", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "LiK/c;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/c;", "T", "LfK/d;", "deserializer", "E", "(LfK/d;)Ljava/lang/Object;", "LmK/d;", "a", "()LmK/d;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Decoder {
    <T> T E(C17251d<? extends T> dVar) {
        C17542s.j(dVar, "deserializer");
        return dVar.deserialize(this);
    }

    boolean F();

    byte I();

    C17611d a();

    C17394c b(SerialDescriptor serialDescriptor);

    int f(SerialDescriptor serialDescriptor);

    int i();

    Void k();

    long m();

    Decoder r(SerialDescriptor serialDescriptor);

    short t();

    float u();

    double w();

    boolean x();

    char y();

    String z();
}
