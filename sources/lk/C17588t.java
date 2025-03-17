package lK;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17631a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"LlK/t;", "", "<init>", "()V", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LlK/t$a;", "key", "value", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LlK/t$a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LlK/t$a;LnI/a;)Ljava/lang/Object;", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LlK/t$a;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "Ljava/util/Map;", "map", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.t  reason: case insensitive filesystem */
public final class C17588t {

    /* renamed from: a  reason: collision with root package name */
    private final Map<SerialDescriptor, Map<a<Object>, Object>> f144540a = C17587s.a(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlK/t$a;", "", "T", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lK.t$a */
    public static final class a<T> {
    }

    public final <T> T a(SerialDescriptor serialDescriptor, a<T> aVar) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(aVar, "key");
        Map map = this.f144540a.get(serialDescriptor);
        T t10 = map != null ? map.get(aVar) : null;
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    public final <T> T b(SerialDescriptor serialDescriptor, a<T> aVar, C17631a<? extends T> aVar2) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(aVar, "key");
        C17542s.j(aVar2, "defaultValue");
        T a10 = a(serialDescriptor, aVar);
        if (a10 != null) {
            return a10;
        }
        T invoke = aVar2.invoke();
        c(serialDescriptor, aVar, invoke);
        return invoke;
    }

    public final <T> void c(SerialDescriptor serialDescriptor, a<T> aVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(aVar, "key");
        C17542s.j(t10, "value");
        Map<SerialDescriptor, Map<a<Object>, Object>> map = this.f144540a;
        Map<a<Object>, Object> map2 = map.get(serialDescriptor);
        if (map2 == null) {
            map2 = C17587s.a(2);
            map.put(serialDescriptor, map2);
        }
        map2.put(aVar, t10);
    }
}
