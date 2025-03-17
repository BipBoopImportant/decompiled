package jK;

import HJ.C15854t;
import hK.C17339e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import uI.C18055d;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0012\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"", "serialName", "LhK/e;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "(Ljava/lang/String;LhK/e;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "LXH/N;", "c", "(Ljava/lang/String;)V", "", "T", "LuI/d;", "Lkotlinx/serialization/KSerializer;", "b", "(LuI/d;)Lkotlinx/serialization/KSerializer;", "", "Ljava/util/Map;", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<C18055d<?>, KSerializer<?>> f144058a = C0.i();

    public static final SerialDescriptor a(String str, C17339e eVar) {
        C17542s.j(str, "serialName");
        C17542s.j(eVar, "kind");
        c(str);
        return new P0(str, eVar);
    }

    public static final <T> KSerializer<T> b(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        return f144058a.get(dVar);
    }

    public static final void c(String str) {
        C17542s.j(str, "serialName");
        for (KSerializer next : f144058a.values()) {
            if (C17542s.e(str, next.getDescriptor().i())) {
                throw new IllegalArgumentException(C15854t.m("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + P.b(next.getClass()).f() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
