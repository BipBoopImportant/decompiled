package wq;

import Eq.a;
import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kK.C17509C;
import kK.C17514c;
import kK.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "", "eventList", "a", "(Ljava/util/List;)Ljava/lang/String;", "events", "Lkotlinx/serialization/json/JsonObject;", "b", "(Ljava/util/List;)Lkotlinx/serialization/json/JsonObject;", "common", "Lkotlinx/serialization/json/JsonElement;", "c", "(Ljava/util/List;Lkotlinx/serialization/json/JsonObject;)Ljava/util/List;", "episod-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: wq.a  reason: case insensitive filesystem */
public final class C12298a {
    public static final String a(List<String> list) {
        C17542s.j(list, "eventList");
        JsonObject b10 = b(list);
        List<JsonElement> c10 = c(list, b10);
        C17509C c11 = new C17509C();
        c11.b("commons", b10);
        c11.b("events", new JsonArray(C16877v.t0(c10)));
        JsonObject a10 = c11.a();
        C17514c a11 = a.f80751a.a();
        a11.a();
        return a11.b(JsonObject.Companion.serializer(), a10);
    }

    private static final JsonObject b(List<String> list) {
        if (list.isEmpty()) {
            return new JsonObject(X.j());
        }
        Iterable<String> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (String i10 : iterable) {
            arrayList.add(j.i(a.f80751a.a().i(i10)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : ((JsonObject) C16877v.w0(arrayList)).keySet()) {
            JsonElement jsonElement = (JsonElement) ((JsonObject) C16877v.w0(arrayList)).get(str);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!C17542s.e(((JsonObject) it.next()).get(str), jsonElement)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C17542s.g(jsonElement);
            linkedHashMap.put(str, jsonElement);
        }
        return new JsonObject(linkedHashMap);
    }

    private static final List<JsonElement> c(List<String> list, JsonObject jsonObject) {
        ArrayList arrayList = new ArrayList();
        for (String i10 : list) {
            JsonObject i11 = j.i(a.f80751a.a().i(i10));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : i11.entrySet()) {
                if (!C17542s.e(jsonObject.get((String) entry.getKey()), (JsonElement) entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            JsonObject jsonObject2 = !linkedHashMap.isEmpty() ? new JsonObject(linkedHashMap) : null;
            if (jsonObject2 != null) {
                arrayList.add(jsonObject2);
            }
        }
        return arrayList;
    }
}
