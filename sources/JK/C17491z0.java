package jK;

import XH.C16796C;
import XH.C16807N;
import XH.v;
import hK.C17335a;
import hK.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LjK/z0;", "K", "V", "LjK/a0;", "LXH/v;", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "k", "(Ljava/lang/Object;Ljava/lang/Object;)LXH/v;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "i", "(LXH/v;)Ljava/lang/Object;", "j", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.z0  reason: case insensitive filesystem */
public final class C17491z0<K, V> extends C17442a0<K, V, v<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    private final SerialDescriptor f144188c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17491z0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, (DefaultConstructorMarker) null);
        C17542s.j(kSerializer, "keySerializer");
        C17542s.j(kSerializer2, "valueSerializer");
        this.f144188c = k.d("kotlin.Pair", new SerialDescriptor[0], new C17489y0(kSerializer, kSerializer2));
    }

    /* access modifiers changed from: private */
    public static final C16807N h(KSerializer kSerializer, KSerializer kSerializer2, C17335a aVar) {
        C17542s.j(aVar, "$this$buildClassSerialDescriptor");
        C17335a aVar2 = aVar;
        C17335a.b(aVar2, "first", kSerializer.getDescriptor(), (List) null, false, 12, (Object) null);
        C17335a.b(aVar2, "second", kSerializer2.getDescriptor(), (List) null, false, 12, (Object) null);
        return C16807N.f139792a;
    }

    public SerialDescriptor getDescriptor() {
        return this.f144188c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public K b(v<? extends K, ? extends V> vVar) {
        C17542s.j(vVar, "<this>");
        return vVar.c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public V d(v<? extends K, ? extends V> vVar) {
        C17542s.j(vVar, "<this>");
        return vVar.d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public v<K, V> f(K k10, V v10) {
        return C16796C.a(k10, v10);
    }
}
