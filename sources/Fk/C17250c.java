package fK;

import XH.C16820k;
import YH.C16870n;
import hK.C17336b;
import hK.k;
import hK.l;
import jK.D0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mK.C17611d;
import uI.C18055d;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020 8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LfK/c;", "", "T", "Lkotlinx/serialization/KSerializer;", "LuI/d;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(LuI/d;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V", "LmK/d;", "serializersModule", "d", "(LmK/d;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "LuI/d;", "b", "Lkotlinx/serialization/KSerializer;", "", "c", "Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fK.c  reason: case insensitive filesystem */
public final class C17250c<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C18055d<T> f143256a;

    /* renamed from: b  reason: collision with root package name */
    private final KSerializer<T> f143257b;

    /* renamed from: c  reason: collision with root package name */
    private final List<KSerializer<?>> f143258c;

    /* renamed from: d  reason: collision with root package name */
    private final SerialDescriptor f143259d;

    public C17250c(C18055d<T> dVar, KSerializer<T> kSerializer, KSerializer<?>[] kSerializerArr) {
        C17542s.j(dVar, "serializableClass");
        C17542s.j(kSerializerArr, "typeArgumentsSerializers");
        this.f143256a = dVar;
        this.f143257b = kSerializer;
        this.f143258c = C16870n.f(kSerializerArr);
        this.f143259d = C17336b.c(k.e("kotlinx.serialization.ContextualSerializer", l.a.f143468a, new SerialDescriptor[0], new C17249b(this)), dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.getDescriptor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N c(fK.C17250c r1, hK.C17335a r2) {
        /*
            java.lang.String r0 = "$this$buildSerialDescriptor"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            kotlinx.serialization.KSerializer<T> r1 = r1.f143257b
            if (r1 == 0) goto L_0x0014
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.getDescriptor()
            if (r1 == 0) goto L_0x0014
            java.util.List r1 = r1.getAnnotations()
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 != 0) goto L_0x001b
            java.util.List r1 = YH.C16877v.n()
        L_0x001b:
            r2.h(r1)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fK.C17250c.c(fK.c, hK.a):XH.N");
    }

    private final KSerializer<T> d(C17611d dVar) {
        KSerializer<T> b10 = dVar.b(this.f143256a, this.f143258c);
        if (b10 != null || (b10 = this.f143257b) != null) {
            return b10;
        }
        D0.f(this.f143256a);
        throw new C16820k();
    }

    public T deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return decoder.E(d(decoder.a()));
    }

    public SerialDescriptor getDescriptor() {
        return this.f143259d;
    }

    public void serialize(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        encoder.n(d(encoder.a()), t10);
    }
}
