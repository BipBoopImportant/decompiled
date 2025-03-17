package jL;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qL.C17844a;
import uI.C18055d;
import uL.C18149a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007*4\u0010\f\u001a\u0004\b\u0000\u0010\b\"\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\t2\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\t*\n\u0010\r\"\u00020\u00052\u00020\u0005¨\u0006\u000e"}, d2 = {"LuI/d;", "clazz", "LqL/a;", "typeQualifier", "scopeQualifier", "", "a", "(LuI/d;LqL/a;LqL/a;)Ljava/lang/String;", "T", "Lkotlin/Function2;", "LsL/a;", "LpL/a;", "Definition", "IndexKey", "koin-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: jL.b  reason: case insensitive filesystem */
public final class C17493b {
    public static final String a(C18055d<?> dVar, C17844a aVar, C17844a aVar2) {
        String str;
        C17542s.j(dVar, "clazz");
        C17542s.j(aVar2, "scopeQualifier");
        if (aVar == null || (str = aVar.getValue()) == null) {
            str = "";
        }
        return C18149a.a(dVar) + ':' + str + ':' + aVar2;
    }
}
