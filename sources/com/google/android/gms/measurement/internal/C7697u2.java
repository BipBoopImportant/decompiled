package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7297f7;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.u2  reason: case insensitive filesystem */
public final class C7697u2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f50434a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f50435b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    private Bundle f50436c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7683s2 f50437d;

    public C7697u2(C7683s2 s2Var, String str, Bundle bundle) {
        this.f50437d = s2Var;
        C6620s.f(str);
        this.f50434a = str;
    }

    private final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", next);
                    if (C7297f7.a()) {
                        if (this.f50437d.a().r(K.f49725R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "d");
                            } else {
                                this.f50437d.f().E().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("t", "l");
                    } else if (obj instanceof Double) {
                        jSONObject.put("t", "d");
                    } else {
                        this.f50437d.f().E().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e10) {
                    this.f50437d.f().E().b("Cannot serialize bundle value to SharedPreferences", e10);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:63|64|75) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r13.f50437d.f().E().a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0128 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0120 A[Catch:{ NumberFormatException | JSONException -> 0x0128 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r13 = this;
            android.os.Bundle r0 = r13.f50436c
            if (r0 != 0) goto L_0x0155
            com.google.android.gms.measurement.internal.s2 r0 = r13.f50437d
            android.content.SharedPreferences r0 = r0.H()
            java.lang.String r1 = r13.f50434a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x014d
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x013e }
            r1.<init>()     // Catch:{ JSONException -> 0x013e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013e }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x013e }
            r0 = 0
            r3 = r0
        L_0x001f:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x013e }
            if (r3 >= r4) goto L_0x013b
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r8 = 100
            r9 = 2
            r10 = 3
            r11 = 4
            r12 = 1
            if (r7 == r8) goto L_0x007a
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0070
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x0066
            r8 = 3352(0xd18, float:4.697E-42)
            if (r7 == r8) goto L_0x005c
            r8 = 3445(0xd75, float:4.827E-42)
            if (r7 == r8) goto L_0x0052
            goto L_0x0084
        L_0x0052:
            java.lang.String r7 = "la"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r11
            goto L_0x0085
        L_0x005c:
            java.lang.String r7 = "ia"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r10
            goto L_0x0085
        L_0x0066:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r0
            goto L_0x0085
        L_0x0070:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r9
            goto L_0x0085
        L_0x007a:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r12
            goto L_0x0085
        L_0x0084:
            r7 = -1
        L_0x0085:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x0120
            if (r7 == r12) goto L_0x0114
            if (r7 == r9) goto L_0x0108
            if (r7 == r10) goto L_0x00d5
            if (r7 == r11) goto L_0x00a2
            com.google.android.gms.measurement.internal.s2 r4 = r13.f50437d     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x00a2:
            boolean r6 = com.google.android.gms.internal.measurement.C7297f7.a()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            com.google.android.gms.measurement.internal.s2 r6 = r13.f50437d     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.i r6 = r6.a()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.K.f49725R0     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            boolean r6 = r6.r(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r6.<init>(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r4 = r6.length()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            long[] r7 = new long[r4]     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r8 = r0
        L_0x00c6:
            if (r8 >= r4) goto L_0x00d1
            long r9 = r6.optLong(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r7[r8] = r9     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r8 = r8 + 1
            goto L_0x00c6
        L_0x00d1:
            r1.putLongArray(r5, r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x00d5:
            boolean r6 = com.google.android.gms.internal.measurement.C7297f7.a()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            com.google.android.gms.measurement.internal.s2 r6 = r13.f50437d     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.i r6 = r6.a()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.K.f49725R0     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            boolean r6 = r6.r(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r6.<init>(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r4 = r6.length()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int[] r7 = new int[r4]     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r8 = r0
        L_0x00f9:
            if (r8 >= r4) goto L_0x0104
            int r9 = r6.optInt(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r7[r8] = r9     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r8 = r8 + 1
            goto L_0x00f9
        L_0x0104:
            r1.putIntArray(r5, r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0108:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0114:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0120:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0128:
            com.google.android.gms.measurement.internal.s2 r4 = r13.f50437d     // Catch:{ JSONException -> 0x013e }
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()     // Catch:{ JSONException -> 0x013e }
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()     // Catch:{ JSONException -> 0x013e }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.a(r5)     // Catch:{ JSONException -> 0x013e }
        L_0x0137:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x013b:
            r13.f50436c = r1     // Catch:{ JSONException -> 0x013e }
            goto L_0x014d
        L_0x013e:
            com.google.android.gms.measurement.internal.s2 r0 = r13.f50437d
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.E()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.a(r1)
        L_0x014d:
            android.os.Bundle r0 = r13.f50436c
            if (r0 != 0) goto L_0x0155
            android.os.Bundle r0 = r13.f50435b
            r13.f50436c = r0
        L_0x0155:
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r13.f50436c
            java.lang.Object r1 = K9.C6620s.l(r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7697u2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor edit = this.f50437d.H().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f50434a);
        } else {
            edit.putString(this.f50434a, c(bundle2));
        }
        edit.apply();
        this.f50436c = bundle2;
    }
}
