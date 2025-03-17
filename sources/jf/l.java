package Jf;

import hK.C17339e;
import hK.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LJf/l;", "Lkotlinx/serialization/KSerializer;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/StringBuilder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/StringBuilder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l implements KSerializer<StringBuilder> {

    /* renamed from: a  reason: collision with root package name */
    public static final l f61310a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f61311b = k.b("StringBuilder", C17339e.i.f143447a);

    private l() {
    }

    /* renamed from: b */
    public StringBuilder deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return new StringBuilder(decoder.z());
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, StringBuilder sb2) {
        C17542s.j(encoder, "encoder");
        C17542s.j(sb2, "value");
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        encoder.G(sb3);
    }

    public SerialDescriptor getDescriptor() {
        return f61311b;
    }
}
