package dq;

import hK.C17339e;
import hK.k;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ldq/a;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "Lkotlin/Function1;", "", "serialize", "deserialize", "<init>", "(Ljava/lang/String;LnI/l;LnI/l;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "a", "LnI/l;", "getSerialize", "()LnI/l;", "getDeserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dq.a  reason: case insensitive filesystem */
public class C11217a<T extends Enum<?>> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<T, Integer> f96971a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<Integer, T> f96972b;

    /* renamed from: c  reason: collision with root package name */
    private final SerialDescriptor f96973c;

    public C11217a(String str, C17642l<? super T, Integer> lVar, C17642l<? super Integer, ? extends T> lVar2) {
        C17542s.j(str, "serialName");
        C17542s.j(lVar, "serialize");
        C17542s.j(lVar2, "deserialize");
        this.f96971a = lVar;
        this.f96972b = lVar2;
        this.f96973c = k.b(str, C17339e.f.f143444a);
    }

    /* renamed from: b */
    public T deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return (Enum) this.f96972b.invoke(Integer.valueOf(decoder.i()));
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        encoder.C(this.f96971a.invoke(t10).intValue());
    }

    public SerialDescriptor getDescriptor() {
        return this.f96973c;
    }
}
