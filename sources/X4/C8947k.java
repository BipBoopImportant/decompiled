package x4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "Lx4/i;", "Lkotlin/Function1;", "", "isArgumentMissing", "", "a", "(Ljava/util/Map;LnI/l;)Ljava/util/List;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: x4.k  reason: case insensitive filesystem */
public final class C8947k {
    public static final List<String> a(Map<String, C8945i> map, C17642l<? super String, Boolean> lVar) {
        C17542s.j(map, "<this>");
        C17542s.j(lVar, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            C8945i iVar = (C8945i) next.getValue();
            Boolean valueOf = iVar != null ? Boolean.valueOf(iVar.d()) : null;
            C17542s.g(valueOf);
            if (!valueOf.booleanValue() && !iVar.b()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object next2 : linkedHashMap.keySet()) {
            if (lVar.invoke((String) next2).booleanValue()) {
                arrayList.add(next2);
            }
        }
        return arrayList;
    }
}
