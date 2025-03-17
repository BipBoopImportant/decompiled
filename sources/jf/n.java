package Jf;

import hK.C17339e;
import hK.k;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LJf/n;", "Lkotlinx/serialization/KSerializer;", "Ljava/net/URL;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/net/URL;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/net/URL;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n implements KSerializer<URL> {

    /* renamed from: a  reason: collision with root package name */
    public static final n f61314a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f61315b = k.b("URL", C17339e.i.f143447a);

    private n() {
    }

    /* renamed from: b */
    public URL deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return new URL(decoder.z());
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, URL url) {
        C17542s.j(encoder, "encoder");
        C17542s.j(url, "value");
        String externalForm = url.toExternalForm();
        C17542s.i(externalForm, "toExternalForm(...)");
        encoder.G(externalForm);
    }

    public SerialDescriptor getDescriptor() {
        return f61315b;
    }
}
