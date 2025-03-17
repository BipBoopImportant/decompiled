package kK;

import XH.C16824o;
import XH.C16825p;
import hK.l;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "LXH/N;", "h", "(Lkotlinx/serialization/encoding/Encoder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "g", "(Lkotlinx/serialization/encoding/Decoder;)V", "LkK/i;", "d", "(Lkotlinx/serialization/encoding/Decoder;)LkK/i;", "LkK/s;", "e", "(Lkotlinx/serialization/encoding/Encoder;)LkK/s;", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "f", "(LnI/a;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"kK/r$a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "f", "(I)Ljava/util/List;", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "j", "(I)Z", "a", "LXH/o;", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "i", "()Ljava/lang/String;", "serialName", "LhK/l;", "h", "()LhK/l;", "kind", "d", "()I", "elementsCount", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements SerialDescriptor {

        /* renamed from: a  reason: collision with root package name */
        private final C16824o f144327a;

        a(C17631a<? extends SerialDescriptor> aVar) {
            this.f144327a = C16825p.b(aVar);
        }

        private final SerialDescriptor a() {
            return (SerialDescriptor) this.f144327a.getValue();
        }

        public int c(String str) {
            C17542s.j(str, "name");
            return a().c(str);
        }

        public int d() {
            return a().d();
        }

        public String e(int i10) {
            return a().e(i10);
        }

        public List<Annotation> f(int i10) {
            return a().f(i10);
        }

        public SerialDescriptor g(int i10) {
            return a().g(i10);
        }

        public l h() {
            return a().h();
        }

        public String i() {
            return a().i();
        }

        public boolean j(int i10) {
            return a().j(i10);
        }
    }

    public static final i d(Decoder decoder) {
        C17542s.j(decoder, "<this>");
        i iVar = decoder instanceof i ? (i) decoder : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + P.b(decoder.getClass()));
    }

    public static final s e(Encoder encoder) {
        C17542s.j(encoder, "<this>");
        s sVar = encoder instanceof s ? (s) encoder : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + P.b(encoder.getClass()));
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor f(C17631a<? extends SerialDescriptor> aVar) {
        return new a(aVar);
    }

    /* access modifiers changed from: private */
    public static final void g(Decoder decoder) {
        d(decoder);
    }

    /* access modifiers changed from: private */
    public static final void h(Encoder encoder) {
        e(encoder);
    }
}
