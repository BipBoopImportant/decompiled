package a9;

import E8.c;
import kotlin.jvm.internal.C17542s;

public final class S0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42271a;

    /* renamed from: b  reason: collision with root package name */
    public final D8.c f42272b = new D8.c("UserId");

    /* renamed from: c  reason: collision with root package name */
    public final String f42273c = "";

    public S0(c cVar) {
        C17542s.j(cVar, "preferencesStore");
        this.f42271a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r4 = this;
            r0 = 0
            E8.c r1 = r4.f42271a     // Catch:{ JSONException -> 0x001a }
            E8.b r2 = E8.b.USER_ID     // Catch:{ JSONException -> 0x001a }
            java.lang.String r3 = r4.f42273c     // Catch:{ JSONException -> 0x001a }
            java.lang.String r1 = r1.f(r2, r3)     // Catch:{ JSONException -> 0x001a }
            if (r1 == 0) goto L_0x0022
            int r2 = r1.length()     // Catch:{ JSONException -> 0x001a }
            if (r2 != 0) goto L_0x0014
            goto L_0x0022
        L_0x0014:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001a }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x001a }
            goto L_0x0023
        L_0x001a:
            r1 = move-exception
            D8.c r2 = r4.f42272b
            java.lang.String r3 = "Cannot parse the user id."
            a9.H1.a(r2, r3, r1)
        L_0x0022:
            r2 = r0
        L_0x0023:
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = r4.f42273c
            java.lang.String r1 = "uid"
            java.lang.String r0 = r2.optString(r1, r0)
        L_0x002d:
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r4.f42273c
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.S0.a():java.lang.String");
    }
}
