package N8;

import HJ.C15838d;
import M8.a;
import M8.d;
import M8.e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import org.json.JSONObject;
import y8.C8993b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001a\u00020\u00012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aG\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010!\u001a\u00020 *\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ly8/b;", "LM8/a;", "rules", "LJ8/b;", "symmetricCryptor", "LM8/d;", "telemetrySender", "d", "(Ly8/b;LM8/a;LJ8/b;LM8/d;)Ly8/b;", "", "", "headers", "LM8/e;", "type", "LN8/d;", "c", "(LM8/a;Ljava/util/Map;LM8/e;LJ8/b;LM8/d;)LN8/d;", "aggregatedRules", "requestHeaders", "e", "(LM8/a;Ljava/util/Map;)Ljava/util/Map;", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader;", "headerRules", "", "anonymize", "g", "(Ljava/util/List;Ljava/util/Map;Z)Ljava/util/Map;", "data", "", "f", "(LJ8/b;Ljava/util/Map;)[B", "", "h", "(Ljava/util/Map;)J", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    private static final d c(a aVar, Map<String, String> map, e eVar, J8.b bVar, d dVar) {
        f fVar = new f(bVar, g(aVar.c(false, eVar), map, true), g(aVar.c(true, eVar), map, false), e(aVar, map), eVar);
        fVar.a(dVar);
        return fVar.b();
    }

    public static final C8993b d(C8993b bVar, a aVar, J8.b bVar2, d dVar) {
        a aVar2 = aVar;
        J8.b bVar3 = bVar2;
        d dVar2 = dVar;
        C17542s.j(bVar, "<this>");
        C17542s.j(aVar2, "rules");
        C17542s.j(bVar3, "symmetricCryptor");
        C17542s.j(dVar2, "telemetrySender");
        d c10 = c(aVar2, bVar.s(), e.REQUEST, bVar3, dVar2);
        d c11 = c(aVar2, bVar.x(), e.RESPONSE, bVar3, dVar2);
        byte[] a10 = c10.a();
        Map<String, String> b10 = c10.b();
        return C8993b.b(bVar, 0, (String) null, (String) null, 0, 0, 0, (byte[]) null, (Integer) null, (byte[]) null, (Integer) null, c10.c(), c11.c(), a10, c11.a(), (byte[]) null, (byte[]) null, (byte[]) null, (Long) null, (Map) null, (Map) null, (String) null, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, b10, c11.b(), 67093503, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = R8.a.c(r1, I8.a.f37083a.c());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Map<java.lang.String, java.lang.String> e(M8.a r0, java.util.Map<java.lang.String, java.lang.String> r1) {
        /*
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x001c
            if (r1 == 0) goto L_0x0019
            I8.a r0 = I8.a.f37083a
            java.lang.String[] r0 = r0.c()
            java.util.Map r0 = R8.a.c(r1, r0)
            if (r0 == 0) goto L_0x0019
            java.util.Map r0 = R8.e.a(r0)
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x0020
        L_0x001c:
            java.util.Map r0 = YH.X.j()
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N8.b.e(M8.a, java.util.Map):java.util.Map");
    }

    /* access modifiers changed from: private */
    public static final byte[] f(J8.b bVar, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String jSONObject = new JSONObject(map).toString();
        C17542s.i(jSONObject, "JSONObject(data).toString()");
        byte[] bytes = jSONObject.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        return J8.b.c(bVar, bytes, false, (Integer) null, (Long) null, (C17642l) null, 28, (Object) null);
    }

    private static final Map<String, String> g(List<JsonConfig.ApiErrorsV2.CustomHeader> list, Map<String, String> map, boolean z10) {
        Set<Map.Entry<String, String>> entrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (JsonConfig.ApiErrorsV2.CustomHeader customHeader : list) {
            T t10 = null;
            if (!(map == null || (entrySet = map.entrySet()) == null)) {
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    Locale locale = Locale.ROOT;
                    String lowerCase = ((String) ((Map.Entry) next).getKey()).toLowerCase(locale);
                    C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = customHeader.b().toLowerCase(locale);
                    C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (C17542s.e(lowerCase, lowerCase2)) {
                        t10 = next;
                        break;
                    }
                }
                t10 = (Map.Entry) t10;
            }
            if (t10 != null) {
                String str = (String) t10.getKey();
                String str2 = (String) t10.getValue();
                if (z10) {
                    str2 = R8.a.a(str2);
                }
                linkedHashMap.put(str, str2);
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    public static final long h(Map<String, String> map) {
        Set<String> keySet;
        long j10 = 0;
        if (!(map == null || (keySet = map.keySet()) == null)) {
            for (String str : keySet) {
                long a10 = j10 + ((long) R8.d.a(str));
                String str2 = map.get(str);
                j10 = a10 + ((long) (str2 != null ? R8.d.a(str2) : 0));
            }
        }
        return j10;
    }
}
