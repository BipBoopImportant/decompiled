package jK;

import XH.C16807N;
import hK.C17335a;
import hK.k;
import hK.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0017B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"LjK/k0;", "K", "V", "LjK/a0;", "", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "k", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "i", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "j", "a", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.k0  reason: case insensitive filesystem */
public final class C17462k0<K, V> extends C17442a0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    private final SerialDescriptor f144124c;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"LjK/k0$a;", "K", "V", "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "getValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jK.k0$a */
    private static final class a<K, V> implements Map.Entry<K, V>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final K f144125a;

        /* renamed from: b  reason: collision with root package name */
        private final V f144126b;

        public a(K k10, V v10) {
            this.f144125a = k10;
            this.f144126b = v10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f144125a, aVar.f144125a) && C17542s.e(this.f144126b, aVar.f144126b);
        }

        public K getKey() {
            return this.f144125a;
        }

        public V getValue() {
            return this.f144126b;
        }

        public int hashCode() {
            K k10 = this.f144125a;
            int i10 = 0;
            int hashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f144126b;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode + i10;
        }

        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f144125a + ", value=" + this.f144126b + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17462k0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, (DefaultConstructorMarker) null);
        C17542s.j(kSerializer, "keySerializer");
        C17542s.j(kSerializer2, "valueSerializer");
        this.f144124c = k.e("kotlin.collections.Map.Entry", m.c.f143472a, new SerialDescriptor[0], new C17460j0(kSerializer, kSerializer2));
    }

    /* access modifiers changed from: private */
    public static final C16807N h(KSerializer kSerializer, KSerializer kSerializer2, C17335a aVar) {
        C17542s.j(aVar, "$this$buildSerialDescriptor");
        C17335a aVar2 = aVar;
        C17335a.b(aVar2, "key", kSerializer.getDescriptor(), (List) null, false, 12, (Object) null);
        C17335a.b(aVar2, "value", kSerializer2.getDescriptor(), (List) null, false, 12, (Object) null);
        return C16807N.f139792a;
    }

    public SerialDescriptor getDescriptor() {
        return this.f144124c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public K b(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "<this>");
        return entry.getKey();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public V d(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "<this>");
        return entry.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Map.Entry<K, V> f(K k10, V v10) {
        return new a(k10, v10);
    }
}
