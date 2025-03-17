package kotlinx.serialization.json;

import YH.C16877v;
import fK.p;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kK.C17508B;
import kK.C17510D;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import lK.g0;
import oI.C17693a;

@p(with = C17510D.class)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001)B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\"8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R&\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010&0\u001e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b'\u0010 ¨\u0006*"}, d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "key", "i", "(Ljava/lang/String;)Z", "value", "k", "(Lkotlinx/serialization/json/JsonElement;)Z", "m", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "a", "Ljava/util/Map;", "size", "", "q", "()Ljava/util/Set;", "keys", "", "s", "()Ljava/util/Collection;", "values", "", "p", "entries", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, C17693a {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, JsonElement> f144390a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<JsonObject> serializer() {
            return C17510D.f144272a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonObject(Map<String, ? extends JsonElement> map) {
        super((DefaultConstructorMarker) null);
        C17542s.j(map, "content");
        this.f144390a = map;
    }

    /* access modifiers changed from: private */
    public static final CharSequence x(Map.Entry entry) {
        C17542s.j(entry, "<destruct>");
        StringBuilder sb2 = new StringBuilder();
        g0.c(sb2, (String) entry.getKey());
        sb2.append(':');
        sb2.append((JsonElement) entry.getValue());
        return sb2.toString();
    }

    public int a() {
        return this.f144390a.size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return i((String) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return k((JsonElement) obj);
    }

    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return p();
    }

    public boolean equals(Object obj) {
        return C17542s.e(this.f144390a, obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m((String) obj);
    }

    public int hashCode() {
        return this.f144390a.hashCode();
    }

    public boolean i(String str) {
        C17542s.j(str, "key");
        return this.f144390a.containsKey(str);
    }

    public boolean isEmpty() {
        return this.f144390a.isEmpty();
    }

    public boolean k(JsonElement jsonElement) {
        C17542s.j(jsonElement, "value");
        return this.f144390a.containsValue(jsonElement);
    }

    public final /* bridge */ Set<String> keySet() {
        return q();
    }

    public JsonElement m(String str) {
        C17542s.j(str, "key");
        return this.f144390a.get(str);
    }

    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<Map.Entry<String, JsonElement>> p() {
        return this.f144390a.entrySet();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<String> q() {
        return this.f144390a.keySet();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection<JsonElement> s() {
        return this.f144390a.values();
    }

    public final /* bridge */ int size() {
        return a();
    }

    /* renamed from: t */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return C16877v.G0(this.f144390a.entrySet(), ",", "{", "}", 0, (CharSequence) null, new C17508B(), 24, (Object) null);
    }

    public final /* bridge */ Collection<JsonElement> values() {
        return s();
    }

    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
