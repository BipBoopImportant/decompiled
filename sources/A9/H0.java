package a9;

import D8.c;
import XH.C16807N;
import dI.C17164e;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;

public final class H0 implements C6857j3 {

    /* renamed from: a  reason: collision with root package name */
    public final C6973y0 f42029a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42030b;

    public H0(C6973y0 y0Var) {
        C17542s.j(y0Var, "staticCollector");
        this.f42029a = y0Var;
    }

    public final int a() {
        return this.f42030b ? 1 : 2;
    }

    public final Object b(C17164e<? super JSONObject> eVar) {
        C6973y0 y0Var = this.f42029a;
        y0Var.getClass();
        try {
            return new JSONObject(y0Var.f42965e);
        } catch (JSONException e10) {
            c cVar = y0Var.f42966f;
            H1.a(cVar, "Failed to create json object: " + e10.getCause(), e10);
            return new JSONObject();
        }
    }

    public final void c() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [int] */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r19 = this;
            r1 = r19
            r2 = 1
            boolean r0 = r1.f42030b
            if (r0 != 0) goto L_0x024a
            a9.y0 r3 = r1.f42029a
            a9.m3 r4 = r3.f42963c
            r4.getClass()
            java.util.List r5 = YH.C16877v.c()
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.f42708c
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r7 = r0.size()
            int r7 = YH.X.e(r7)
            r6.<init>(r7)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0029:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x008a
            java.lang.Object r7 = r0.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length()
            r10.<init>(r11)
        L_0x0045:
            int r11 = r9.length()
            if (r8 >= r11) goto L_0x0072
            char r11 = r9.charAt(r8)
            r12 = 97
            if (r12 > r11) goto L_0x005e
            r13 = 123(0x7b, float:1.72E-43)
            if (r11 >= r13) goto L_0x005e
            int r11 = r11 + -83
        L_0x0059:
            int r11 = r11 % 26
            int r11 = r11 + r12
            char r11 = (char) r11
            goto L_0x0069
        L_0x005e:
            r12 = 65
            if (r12 > r11) goto L_0x0069
            r13 = 91
            if (r11 >= r13) goto L_0x0069
            int r11 = r11 + -51
            goto L_0x0059
        L_0x0069:
            java.lang.Character r11 = java.lang.Character.valueOf(r11)
            r10.add(r11)
            int r8 = r8 + r2
            goto L_0x0045
        L_0x0072:
            r17 = 62
            r18 = 0
            java.lang.String r11 = ""
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r8 = YH.C16877v.G0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = r7.getValue()
            r6.put(r8, r7)
            goto L_0x0029
        L_0x008a:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x0092:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.ClassLoader r7 = r4.f42706a     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.Object r9 = r0.getKey()     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ ClassNotFoundException -> 0x00cd }
            r7.loadClass(r9)     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.Object r7 = r0.getValue()     // Catch:{ ClassNotFoundException -> 0x00cd }
            r5.add(r7)     // Catch:{ ClassNotFoundException -> 0x00cd }
            D8.c r7 = r4.f42707b     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00cd }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.String r10 = "Class found in app: "
            r9.append(r10)     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.Object r0 = r0.getKey()     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException -> 0x00cd }
            r9.append(r0)     // Catch:{ ClassNotFoundException -> 0x00cd }
            java.lang.String r0 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x00cd }
            r7.f(r0)     // Catch:{ ClassNotFoundException -> 0x00cd }
            goto L_0x0092
        L_0x00cd:
            r0 = move-exception
            D8.c r7 = r4.f42707b
            java.lang.String r0 = r0.getMessage()
            r7.f(r0)
            goto L_0x0092
        L_0x00d8:
            java.util.List r0 = YH.C16877v.a(r5)
            java.util.HashMap<java.lang.String, java.lang.Object> r4 = r3.f42965e
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            java.lang.String r5 = r5.b()
            java.lang.String r6 = "app_id"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            java.lang.String r5 = r5.c()
            java.lang.String r6 = "app_name"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            java.lang.String r5 = r5.d()
            java.lang.String r6 = "app_version"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            long r5 = r5.e()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "app_build_version"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            java.lang.String r5 = r5.i()
            java.lang.String r6 = "sdk_version"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            int r5 = r5.h()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "sdk_build_version"
            r4.put(r6, r5)
            java.lang.String r5 = "os_type"
            java.lang.String r6 = "Android"
            r4.put(r5, r6)
            F8.g r5 = r3.f42961a
            java.lang.String r5 = r5.g()
            java.lang.String r6 = "os_version"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            java.lang.String r5 = r5.f()
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x015d
            r5 = r6
        L_0x015d:
            java.lang.String r7 = "device_model"
            r4.put(r7, r5)
            F8.g r5 = r3.f42961a
            java.lang.String r5 = r5.e()
            if (r5 != 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r6 = r5
        L_0x016c:
            java.lang.String r5 = "device_manufacturer"
            r4.put(r5, r6)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            int r5 = r5.g()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "metadata.android_app_min_sdk_version"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            int r5 = r5.j()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "metadata.android_app_target_sdk_version"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            int r5 = r5.f()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "metadata.android_app_compile_sdk_version"
            r4.put(r6, r5)
            android.content.Context r5 = r3.f42964d
            java.lang.String r6 = "contentsquare_telemetry_gradle_version"
            java.lang.String r5 = G8.g.k(r5, r6)
            java.lang.String r6 = "metadata.android_app_gradle_version"
            r4.put(r6, r5)
            android.content.Context r5 = r3.f42964d
            java.lang.String r6 = "contentsquare_telemetry_agp_version"
            java.lang.String r5 = G8.g.k(r5, r6)
            java.lang.String r6 = "metadata.android_app_agp_version"
            r4.put(r6, r5)
            F8.g r5 = r3.f42961a
            G8.d r5 = r5.c()
            java.lang.String r5 = r5.a()
            java.lang.String r6 = "metadata.android_app_kotlin_version"
            r4.put(r6, r5)
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r5 = r3.f42962b
            if (r5 == 0) goto L_0x01dc
            int r5 = r5.d()
            goto L_0x01dd
        L_0x01dc:
            r5 = -1
        L_0x01dd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "bucket"
            r4.put(r6, r5)
            XH.o r5 = a9.X0.f42375a
            android.content.Context r3 = r3.f42964d
            boolean r3 = a9.X0.a(r3)
            if (r3 == 0) goto L_0x01f3
            java.lang.String r3 = "autostart"
            goto L_0x01f5
        L_0x01f3:
            java.lang.String r3 = "manual"
        L_0x01f5:
            java.lang.String r5 = "start_mode"
            r4.put(r5, r3)
            java.lang.String r3 = "env"
            r4.put(r3, r0)
            r3 = 13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r0.contains(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "is_unified_sdk_present"
            r4.put(r5, r3)
            r3 = 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r0.contains(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "is_heap_integration_present"
            r4.put(r5, r3)
            r3 = 15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r3 = "is_heap_sdk_present"
            r4.put(r3, r0)
            com.contentsquare.android.internal.features.initialize.ContentsquareModule r0 = com.contentsquare.android.internal.features.initialize.ContentsquareModule.b()
            if (r0 == 0) goto L_0x023f
            r8 = r2
        L_0x023f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            java.lang.String r3 = "is_cs_started"
            r4.put(r3, r0)
            r1.f42030b = r2
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.H0.start():void");
    }

    public final Object a(C17164e<? super C16807N> eVar) {
        this.f42030b = false;
        return C16807N.f139792a;
    }

    public final C6882m4 b() {
        return C6882m4.STATIC;
    }
}
