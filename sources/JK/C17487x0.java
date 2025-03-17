package jK;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16870n;
import YH.C16877v;
import fK.q;
import hK.C17335a;
import hK.k;
import hK.m;
import iK.C17394c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bB'\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8VX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LjK/x0;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "LXH/o;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.x0  reason: case insensitive filesystem */
public final class C17487x0<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f144179a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends Annotation> f144180b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f144181c;

    public C17487x0(String str, T t10) {
        C17542s.j(str, "serialName");
        C17542s.j(t10, "objectInstance");
        this.f144179a = t10;
        this.f144180b = C16877v.n();
        this.f144181c = C16825p.a(s.PUBLICATION, new C17483v0(str, this));
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor d(String str, C17487x0 x0Var) {
        return k.e(str, m.d.f143473a, new SerialDescriptor[0], new C17485w0(x0Var));
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17487x0 x0Var, C17335a aVar) {
        C17542s.j(aVar, "$this$buildSerialDescriptor");
        aVar.h(x0Var.f144180b);
        return C16807N.f139792a;
    }

    public T deserialize(Decoder decoder) {
        int p10;
        C17542s.j(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        C17394c b10 = decoder.b(descriptor);
        if (!b10.q() && (p10 = b10.p(getDescriptor())) != -1) {
            throw new q("Unexpected index " + p10);
        }
        C16807N n10 = C16807N.f139792a;
        b10.c(descriptor);
        return this.f144179a;
    }

    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f144181c.getValue();
    }

    public void serialize(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17487x0(String str, T t10, Annotation[] annotationArr) {
        this(str, t10);
        C17542s.j(str, "serialName");
        C17542s.j(t10, "objectInstance");
        C17542s.j(annotationArr, "classAnnotations");
        this.f144180b = C16870n.f(annotationArr);
    }
}
