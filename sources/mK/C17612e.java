package mK;

import YH.X;
import fK.C17251d;
import fK.r;
import jK.C0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import mK.C17608a;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062 \u0010\u000f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0017\u001a\u00020\n\"\b\b\u0000\u0010\u0012*\u00020\u0004\"\b\b\u0001\u0010\u0013*\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\u001b\u001a\u00020\n\"\b\b\u0000\u0010\u0012*\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00190\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0011JE\u0010\u001f\u001a\u00020\n\"\b\b\u0000\u0010\u0012*\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001c\u0010\u001e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J9\u0010$\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000f\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b$\u0010%JK\u0010&\u001a\u00020\n\"\b\b\u0000\u0010\u0012*\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00190\r2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b&\u0010'JM\u0010(\u001a\u00020\n\"\b\b\u0000\u0010\u0012*\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001c\u0010\u001e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\r2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b(\u0010'JW\u0010+\u001a\u00020\n\"\b\b\u0000\u0010\u0012*\u00020\u0004\"\b\b\u0001\u0010\u0013*\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\b\b\u0002\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b.\u0010/R$\u00102\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020!008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101R8\u00104\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b00008\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00101R<\u00107\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00190\rj\u0006\u0012\u0002\b\u0003`5008\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00101R4\u00108\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R@\u0010:\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001d0\rj\u0006\u0012\u0002\b\u0003`9008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0016\u0010<\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010;¨\u0006="}, d2 = {"LmK/e;", "LmK/h;", "<init>", "()V", "", "T", "LuI/d;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "LXH/N;", "f", "(LuI/d;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "provider", "d", "(LuI/d;LnI/l;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "a", "(LuI/d;LuI/d;Lkotlinx/serialization/KSerializer;)V", "LfK/r;", "defaultSerializerProvider", "g", "", "LfK/d;", "defaultDeserializerProvider", "e", "forClass", "LmK/a;", "", "allowOverwrite", "m", "(LuI/d;LmK/a;Z)V", "j", "(LuI/d;LnI/l;Z)V", "i", "concreteClass", "concreteSerializer", "k", "(LuI/d;LuI/d;Lkotlinx/serialization/KSerializer;Z)V", "LmK/d;", "h", "()LmK/d;", "", "Ljava/util/Map;", "class2ContextualProvider", "b", "polyBase2Serializers", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "c", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "Z", "hasInterfaceContextualSerializers", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mK.e  reason: case insensitive filesystem */
public final class C17612e implements C17615h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C18055d<?>, C17608a> f144565a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<C18055d<?>, Map<C18055d<?>, KSerializer<?>>> f144566b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<C18055d<?>, C17642l<?, r<?>>> f144567c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<C18055d<?>, Map<String, KSerializer<?>>> f144568d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<C18055d<?>, C17642l<String, C17251d<?>>> f144569e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private boolean f144570f;

    public static /* synthetic */ void l(C17612e eVar, C18055d dVar, C18055d dVar2, KSerializer kSerializer, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        eVar.k(dVar, dVar2, kSerializer, z10);
    }

    public static /* synthetic */ void n(C17612e eVar, C18055d dVar, C17608a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        eVar.m(dVar, aVar, z10);
    }

    public <Base, Sub extends Base> void a(C18055d<Base> dVar, C18055d<Sub> dVar2, KSerializer<Sub> kSerializer) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(dVar2, "actualClass");
        C17542s.j(kSerializer, "actualSerializer");
        l(this, dVar, dVar2, kSerializer, false, 8, (Object) null);
    }

    public <T> void d(C18055d<T> dVar, C17642l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar) {
        C17542s.j(dVar, "kClass");
        C17542s.j(lVar, "provider");
        n(this, dVar, new C17608a.b(lVar), false, 4, (Object) null);
    }

    public <Base> void e(C18055d<Base> dVar, C17642l<? super String, ? extends C17251d<? extends Base>> lVar) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(lVar, "defaultDeserializerProvider");
        i(dVar, lVar, false);
    }

    public <T> void f(C18055d<T> dVar, KSerializer<T> kSerializer) {
        C17542s.j(dVar, "kClass");
        C17542s.j(kSerializer, "serializer");
        n(this, dVar, new C17608a.C3525a(kSerializer), false, 4, (Object) null);
    }

    public <Base> void g(C18055d<Base> dVar, C17642l<? super Base, ? extends r<? super Base>> lVar) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(lVar, "defaultSerializerProvider");
        j(dVar, lVar, false);
    }

    public final C17611d h() {
        return new C17609b(this.f144565a, this.f144566b, this.f144567c, this.f144568d, this.f144569e, this.f144570f);
    }

    public final <Base> void i(C18055d<Base> dVar, C17642l<? super String, ? extends C17251d<? extends Base>> lVar, boolean z10) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(lVar, "defaultDeserializerProvider");
        C17642l lVar2 = this.f144569e.get(dVar);
        if (lVar2 == null || C17542s.e(lVar2, lVar) || z10) {
            this.f144569e.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + dVar + " is already registered: " + lVar2);
    }

    public final <Base> void j(C18055d<Base> dVar, C17642l<? super Base, ? extends r<? super Base>> lVar, boolean z10) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(lVar, "defaultSerializerProvider");
        C17642l lVar2 = this.f144567c.get(dVar);
        if (lVar2 == null || C17542s.e(lVar2, lVar) || z10) {
            this.f144567c.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + dVar + " is already registered: " + lVar2);
    }

    public final <Base, Sub extends Base> void k(C18055d<Base> dVar, C18055d<Sub> dVar2, KSerializer<Sub> kSerializer, boolean z10) {
        Object obj;
        C18055d dVar3;
        C17542s.j(dVar, "baseClass");
        C17542s.j(dVar2, "concreteClass");
        C17542s.j(kSerializer, "concreteSerializer");
        String i10 = kSerializer.getDescriptor().i();
        Map<C18055d<?>, Map<C18055d<?>, KSerializer<?>>> map = this.f144566b;
        Map<C18055d<?>, KSerializer<?>> map2 = map.get(dVar);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(dVar, map2);
        }
        Map map3 = map2;
        Map<C18055d<?>, Map<String, KSerializer<?>>> map4 = this.f144568d;
        Map<String, KSerializer<?>> map5 = map4.get(dVar);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(dVar, map5);
        }
        Map map6 = map5;
        KSerializer kSerializer2 = (KSerializer) map3.get(dVar2);
        if (kSerializer2 != null && !C17542s.e(kSerializer2, kSerializer)) {
            if (z10) {
                KSerializer kSerializer3 = (KSerializer) map6.remove(kSerializer2.getDescriptor().i());
            } else {
                throw new C17610c(dVar, dVar2);
            }
        }
        KSerializer kSerializer4 = (KSerializer) map6.get(i10);
        if (kSerializer4 != null && !C17542s.e(kSerializer4, kSerializer)) {
            Iterator it = X.A(map3).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Map.Entry) obj).getValue() == kSerializer4) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (dVar3 = (C18055d) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + i10 + " is registered in the module but no Kotlin class is associated with it.").toString());
            } else if (z10) {
                KSerializer kSerializer5 = (KSerializer) map3.remove(dVar3);
            } else {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + dVar + "' have the same serial name '" + i10 + "': " + kSerializer + " for '" + dVar2 + "' and " + kSerializer4 + " for '" + dVar3 + '\'');
            }
        }
        map3.put(dVar2, kSerializer);
        map6.put(i10, kSerializer);
    }

    public final <T> void m(C18055d<T> dVar, C17608a aVar, boolean z10) {
        C17608a aVar2;
        C17542s.j(dVar, "forClass");
        C17542s.j(aVar, "provider");
        if (z10 || (aVar2 = this.f144565a.get(dVar)) == null || C17542s.e(aVar2, aVar)) {
            this.f144565a.put(dVar, aVar);
            if (C0.l(dVar)) {
                this.f144570f = true;
                return;
            }
            return;
        }
        throw new C17610c("Contextual serializer or serializer provider for " + dVar + " already registered in this module");
    }
}
