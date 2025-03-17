package mK;

import fK.C17251d;
import fK.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJI\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010\f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\r\u0010\u000eJM\u0010\u0014\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0018\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\nH&¢\u0006\u0004\b\u0018\u0010\u000eJE\u0010\u001c\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u001b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\nH&¢\u0006\u0004\b\u001c\u0010\u000e¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"LmK/h;", "", "T", "LuI/d;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "LXH/N;", "f", "(LuI/d;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "provider", "d", "(LuI/d;LnI/l;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "a", "(LuI/d;LuI/d;Lkotlinx/serialization/KSerializer;)V", "LfK/r;", "defaultSerializerProvider", "g", "", "LfK/d;", "defaultDeserializerProvider", "e", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mK.h  reason: case insensitive filesystem */
public interface C17615h {
    /* access modifiers changed from: private */
    static KSerializer c(KSerializer kSerializer, List list) {
        C17542s.j(list, "it");
        return kSerializer;
    }

    <Base, Sub extends Base> void a(C18055d<Base> dVar, C18055d<Sub> dVar2, KSerializer<Sub> kSerializer);

    <T> void d(C18055d<T> dVar, C17642l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar);

    <Base> void e(C18055d<Base> dVar, C17642l<? super String, ? extends C17251d<? extends Base>> lVar);

    <T> void f(C18055d<T> dVar, KSerializer<T> kSerializer) {
        C17542s.j(dVar, "kClass");
        C17542s.j(kSerializer, "serializer");
        d(dVar, new C17614g(kSerializer));
    }

    <Base> void g(C18055d<Base> dVar, C17642l<? super Base, ? extends r<? super Base>> lVar);
}
