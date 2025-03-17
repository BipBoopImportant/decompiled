package jK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "name", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class U {

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"jK/U$a", "LjK/N;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements N<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KSerializer<T> f144066a;

        a(KSerializer<T> kSerializer) {
            this.f144066a = kSerializer;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.serialization.KSerializer<?>[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            /*
                r3 = this;
                kotlinx.serialization.KSerializer<T> r0 = r3.f144066a
                r1 = 1
                kotlinx.serialization.KSerializer[] r1 = new kotlinx.serialization.KSerializer[r1]
                r2 = 0
                r1[r2] = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: jK.U.a.childSerializers():kotlinx.serialization.KSerializer[]");
        }

        public T deserialize(Decoder decoder) {
            C17542s.j(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        public void serialize(Encoder encoder, T t10) {
            C17542s.j(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }
    }

    public static final <T> SerialDescriptor a(String str, KSerializer<T> kSerializer) {
        C17542s.j(str, "name");
        C17542s.j(kSerializer, "primitiveSerializer");
        return new T(str, new a(kSerializer));
    }
}
