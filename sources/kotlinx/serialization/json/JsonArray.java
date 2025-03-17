package kotlinx.serialization.json;

import YH.C16877v;
import fK.p;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kK.C17515d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import nI.C17642l;
import oI.C17693a;

@p(with = C17515d.class)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010*\n\u0002\b\f\b\u0007\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001.B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\"\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#H\u0001¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0006\u0010\u001d\u001a\u00020\u000bH\u0001¢\u0006\u0004\b$\u0010&J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u000b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b+\u0010\r¨\u0006/"}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "content", "<init>", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "b", "(Lkotlinx/serialization/json/JsonElement;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "i", "(I)Lkotlinx/serialization/json/JsonElement;", "k", "(Lkotlinx/serialization/json/JsonElement;)I", "m", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "size", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonArray extends JsonElement implements List<JsonElement>, C17693a {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final List<JsonElement> f144388a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<JsonArray> serializer() {
            return C17515d.f144284a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonArray(List<? extends JsonElement> list) {
        super((DefaultConstructorMarker) null);
        C17542s.j(list, "content");
        this.f144388a = list;
    }

    public int a() {
        return this.f144388a.size();
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(JsonElement jsonElement) {
        C17542s.j(jsonElement, "element");
        return this.f144388a.contains(jsonElement);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return b((JsonElement) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return this.f144388a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return C17542s.e(this.f144388a, obj);
    }

    public int hashCode() {
        return this.f144388a.hashCode();
    }

    /* renamed from: i */
    public JsonElement get(int i10) {
        return this.f144388a.get(i10);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return k((JsonElement) obj);
    }

    public boolean isEmpty() {
        return this.f144388a.isEmpty();
    }

    public Iterator<JsonElement> iterator() {
        return this.f144388a.iterator();
    }

    public int k(JsonElement jsonElement) {
        C17542s.j(jsonElement, "element");
        return this.f144388a.indexOf(jsonElement);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m((JsonElement) obj);
    }

    public ListIterator<JsonElement> listIterator() {
        return this.f144388a.listIterator();
    }

    public int m(JsonElement jsonElement) {
        C17542s.j(jsonElement, "element");
        return this.f144388a.lastIndexOf(jsonElement);
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<JsonElement> subList(int i10, int i11) {
        return this.f144388a.subList(i10, i11);
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public String toString() {
        return C16877v.G0(this.f144388a, ",", "[", "]", 0, (CharSequence) null, (C17642l) null, 56, (Object) null);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<JsonElement> listIterator(int i10) {
        return this.f144388a.listIterator(i10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        return C17534j.b(this, tArr);
    }
}
