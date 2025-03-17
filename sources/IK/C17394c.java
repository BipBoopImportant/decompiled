package iK;

import fK.C17251d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import mK.C17611d;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 32\u00020\u0001:\u00013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b)\u0010*JE\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b/\u00100JG\u00101\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b1\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066À\u0006\u0003"}, d2 = {"LiK/c;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "q", "()Z", "", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "l", "index", "D", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "", "B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "", "G", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "", "v", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "", "H", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "", "n", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "Lkotlinx/serialization/encoding/Decoder;", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "T", "LfK/d;", "deserializer", "previousValue", "o", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/d;Ljava/lang/Object;)Ljava/lang/Object;", "A", "LmK/d;", "a", "()LmK/d;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iK.c  reason: case insensitive filesystem */
public interface C17394c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143525a = a.f143526a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiK/c$a;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iK.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f143526a = new a();

        private a() {
        }
    }

    static /* synthetic */ Object e(C17394c cVar, SerialDescriptor serialDescriptor, int i10, C17251d dVar, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return cVar.o(serialDescriptor, i10, dVar, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
    }

    <T> T A(SerialDescriptor serialDescriptor, int i10, C17251d<? extends T> dVar, T t10);

    char B(SerialDescriptor serialDescriptor, int i10);

    byte C(SerialDescriptor serialDescriptor, int i10);

    boolean D(SerialDescriptor serialDescriptor, int i10);

    short G(SerialDescriptor serialDescriptor, int i10);

    double H(SerialDescriptor serialDescriptor, int i10);

    C17611d a();

    void c(SerialDescriptor serialDescriptor);

    long g(SerialDescriptor serialDescriptor, int i10);

    int j(SerialDescriptor serialDescriptor, int i10);

    int l(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return -1;
    }

    String n(SerialDescriptor serialDescriptor, int i10);

    <T> T o(SerialDescriptor serialDescriptor, int i10, C17251d<? extends T> dVar, T t10);

    int p(SerialDescriptor serialDescriptor);

    boolean q() {
        return false;
    }

    Decoder s(SerialDescriptor serialDescriptor, int i10);

    float v(SerialDescriptor serialDescriptor, int i10);
}
