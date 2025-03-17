package mK;

import XH.t;
import fK.C17251d;
import fK.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.W;
import kotlinx.serialization.KSerializer;
import mK.C17608a;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u00122\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010(R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b!\u0010(R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010(R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010(R@\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"LmK/b;", "LmK/d;", "", "LuI/d;", "LmK/a;", "class2ContextualFactory", "Lkotlinx/serialization/KSerializer;", "polyBase2Serializers", "Lkotlin/Function1;", "LfK/r;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "LfK/d;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "", "T", "baseClass", "value", "f", "(LuI/d;Ljava/lang/Object;)LfK/r;", "serializedClassName", "e", "(LuI/d;Ljava/lang/String;)LfK/d;", "kClass", "", "typeArgumentsSerializers", "b", "(LuI/d;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "LmK/h;", "collector", "LXH/N;", "a", "(LmK/h;)V", "Ljava/util/Map;", "c", "d", "Z", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mK.b  reason: case insensitive filesystem */
public final class C17609b extends C17611d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C18055d<?>, C17608a> f144559a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<C18055d<?>, Map<C18055d<?>, KSerializer<?>>> f144560b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<C18055d<?>, C17642l<?, r<?>>> f144561c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<C18055d<?>, Map<String, KSerializer<?>>> f144562d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<C18055d<?>, C17642l<String, C17251d<?>>> f144563e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f144564f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17609b(Map<C18055d<?>, ? extends C17608a> map, Map<C18055d<?>, ? extends Map<C18055d<?>, ? extends KSerializer<?>>> map2, Map<C18055d<?>, ? extends C17642l<?, ? extends r<?>>> map3, Map<C18055d<?>, ? extends Map<String, ? extends KSerializer<?>>> map4, Map<C18055d<?>, ? extends C17642l<? super String, ? extends C17251d<?>>> map5, boolean z10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(map, "class2ContextualFactory");
        C17542s.j(map2, "polyBase2Serializers");
        C17542s.j(map3, "polyBase2DefaultSerializerProvider");
        C17542s.j(map4, "polyBase2NamedSerializers");
        C17542s.j(map5, "polyBase2DefaultDeserializerProvider");
        this.f144559a = map;
        this.f144560b = map2;
        this.f144561c = map3;
        this.f144562d = map4;
        this.f144563e = map5;
        this.f144564f = z10;
    }

    public void a(C17615h hVar) {
        C17542s.j(hVar, "collector");
        for (Map.Entry next : this.f144559a.entrySet()) {
            C18055d dVar = (C18055d) next.getKey();
            C17608a aVar = (C17608a) next.getValue();
            if (aVar instanceof C17608a.C3525a) {
                C17542s.h(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> b10 = ((C17608a.C3525a) aVar).b();
                C17542s.h(b10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                hVar.f(dVar, b10);
            } else if (aVar instanceof C17608a.b) {
                hVar.d(dVar, ((C17608a.b) aVar).b());
            } else {
                throw new t();
            }
        }
        for (Map.Entry next2 : this.f144560b.entrySet()) {
            C18055d dVar2 = (C18055d) next2.getKey();
            for (Map.Entry entry : ((Map) next2.getValue()).entrySet()) {
                C18055d dVar3 = (C18055d) entry.getKey();
                KSerializer kSerializer = (KSerializer) entry.getValue();
                C17542s.h(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C17542s.h(dVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                hVar.a(dVar2, dVar3, kSerializer);
            }
        }
        for (Map.Entry next3 : this.f144561c.entrySet()) {
            C18055d dVar4 = (C18055d) next3.getKey();
            C17642l lVar = (C17642l) next3.getValue();
            C17542s.h(dVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C17542s.h(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            hVar.g(dVar4, (C17642l) W.g(lVar, 1));
        }
        for (Map.Entry next4 : this.f144563e.entrySet()) {
            C18055d dVar5 = (C18055d) next4.getKey();
            C17642l lVar2 = (C17642l) next4.getValue();
            C17542s.h(dVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C17542s.h(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            hVar.e(dVar5, (C17642l) W.g(lVar2, 1));
        }
    }

    public <T> KSerializer<T> b(C18055d<T> dVar, List<? extends KSerializer<?>> list) {
        C17542s.j(dVar, "kClass");
        C17542s.j(list, "typeArgumentsSerializers");
        C17608a aVar = this.f144559a.get(dVar);
        KSerializer<?> a10 = aVar != null ? aVar.a(list) : null;
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    public boolean d() {
        return this.f144564f;
    }

    public <T> C17251d<T> e(C18055d<? super T> dVar, String str) {
        C17542s.j(dVar, "baseClass");
        Map map = this.f144562d.get(dVar);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        C17642l<String, C17251d<?>> lVar = this.f144563e.get(dVar);
        C17642l lVar2 = W.o(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (C17251d) lVar2.invoke(str);
        }
        return null;
    }

    public <T> r<T> f(C18055d<? super T> dVar, T t10) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(t10, "value");
        if (!dVar.s(t10)) {
            return null;
        }
        Map map = this.f144560b.get(dVar);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(P.b(t10.getClass())) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        C17642l<?, r<?>> lVar = this.f144561c.get(dVar);
        C17642l lVar2 = W.o(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (r) lVar2.invoke(t10);
        }
        return null;
    }
}
