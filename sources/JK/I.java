package jK;

import XH.C16824o;
import XH.C16825p;
import YH.C16870n;
import fK.q;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010\u000b\u001a\u00020\n8VX\u0002¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LjK/I;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "(Ljava/lang/String;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "f", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "e", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "a", "[Ljava/lang/Enum;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "overriddenDescriptor", "LXH/o;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f144031a;

    /* renamed from: b  reason: collision with root package name */
    private SerialDescriptor f144032b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f144033c;

    public I(String str, T[] tArr) {
        C17542s.j(str, "serialName");
        C17542s.j(tArr, "values");
        this.f144031a = tArr;
        this.f144033c = C16825p.b(new H(this, str));
    }

    private final SerialDescriptor c(String str) {
        G g10 = new G(str, this.f144031a.length);
        for (T name : this.f144031a) {
            J0.q(g10, name.name(), false, 2, (Object) null);
        }
        return g10;
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor d(I i10, String str) {
        SerialDescriptor serialDescriptor = i10.f144032b;
        return serialDescriptor == null ? i10.c(str) : serialDescriptor;
    }

    /* renamed from: e */
    public T deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        int f10 = decoder.f(getDescriptor());
        if (f10 >= 0) {
            T[] tArr = this.f144031a;
            if (f10 < tArr.length) {
                return tArr[f10];
            }
        }
        throw new q(f10 + " is not among valid " + getDescriptor().i() + " enum values, values size is " + this.f144031a.length);
    }

    /* renamed from: f */
    public void serialize(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        int u02 = C16870n.u0(this.f144031a, t10);
        if (u02 != -1) {
            encoder.j(getDescriptor(), u02);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t10);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().i());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f144031a);
        C17542s.i(arrays, "toString(...)");
        sb2.append(arrays);
        throw new q(sb2.toString());
    }

    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f144033c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().i() + '>';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public I(String str, T[] tArr, SerialDescriptor serialDescriptor) {
        this(str, tArr);
        C17542s.j(str, "serialName");
        C17542s.j(tArr, "values");
        C17542s.j(serialDescriptor, "descriptor");
        this.f144032b = serialDescriptor;
    }
}
