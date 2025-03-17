package R8;

import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"LR8/b;", "", "", "jsonBody", "<init>", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "a", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "jsonObject", "Lorg/json/JSONArray;", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "jsonArray", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f39737a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONArray f39738b;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[SYNTHETIC, Splitter:B:8:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 == 0) goto L_0x000c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x000c }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x000c }
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            r2.f39737a = r1
            if (r3 == 0) goto L_0x0017
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0017 }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x0017 }
            r0 = r1
        L_0x0017:
            r2.f39738b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.b.<init>(java.lang.String):void");
    }

    public final JSONArray a() {
        return this.f39738b;
    }

    public final JSONObject b() {
        return this.f39737a;
    }
}
