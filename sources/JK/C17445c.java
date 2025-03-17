package jK;

import XH.C16820k;
import fK.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "subClassName", "LuI/d;", "baseClass", "", "a", "(Ljava/lang/String;LuI/d;)Ljava/lang/Void;", "subClass", "b", "(LuI/d;LuI/d;)Ljava/lang/Void;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.c  reason: case insensitive filesystem */
public final class C17445c {
    public static final Void a(String str, C18055d<?> dVar) {
        String str2;
        C17542s.j(dVar, "baseClass");
        String str3 = "in the polymorphic scope of '" + dVar.f() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + dVar.f() + "' has to be sealed and '@Serializable'.";
        }
        throw new q(str2);
    }

    public static final Void b(C18055d<?> dVar, C18055d<?> dVar2) {
        C17542s.j(dVar, "subClass");
        C17542s.j(dVar2, "baseClass");
        String f10 = dVar.f();
        if (f10 == null) {
            f10 = String.valueOf(dVar);
        }
        a(f10, dVar2);
        throw new C16820k();
    }
}
