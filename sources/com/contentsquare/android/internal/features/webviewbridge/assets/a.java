package com.contentsquare.android.internal.features.webviewbridge.assets;

import D8.c;
import YH.C16877v;
import a9.C6807d1;
import a9.C6823f1;
import a9.C6934t1;
import a9.M0;
import a9.U0;
import com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset;
import com.contentsquare.android.sdk.C7131j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f46877d = new c("WebViewAssetsProcessor");

    /* renamed from: a  reason: collision with root package name */
    public final M0 f46878a;

    /* renamed from: b  reason: collision with root package name */
    public final C6807d1 f46879b;

    /* renamed from: c  reason: collision with root package name */
    public final C6934t1 f46880c;

    public a(M0 m02, C6807d1 d1Var, C6934t1 t1Var) {
        C17542s.j(m02, "webViewAssetsCache");
        C17542s.j(d1Var, "staticResourceManager");
        C17542s.j(t1Var, "cssProcessor");
        this.f46878a = m02;
        this.f46879b = d1Var;
        this.f46880c = t1Var;
    }

    public static void b(ArrayList arrayList) {
        C7131j jVar = C7131j.f47442k;
        if (jVar != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((WebViewAsset) next).f46862e != null) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                U0 u02 = new U0(arrayList2);
                C17542s.j(u02, "event");
                jVar.f47451e.a(u02);
            }
            c cVar = f46877d;
            cVar.f("Sent " + arrayList2.size() + " asset hash events to SR");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset r12) {
        /*
            r11 = this;
            a9.d1 r0 = r11.f46879b
            A8.b r0 = r0.f42502e
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = r0.b()
            if (r0 == 0) goto L_0x0015
            com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager r0 = r0.q()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.a()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x0020
            D8.c r12 = f46877d
            java.lang.String r0 = "Static Resource Manager feature disabled"
            r12.f(r0)
            return
        L_0x0020:
            java.lang.String r0 = r12.f46862e
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent r1 = r12.f46861d
            r2 = 0
            if (r1 == 0) goto L_0x002a
            byte[] r3 = r1.f46875c
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            java.lang.String r1 = r1.f46873a
            goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            if (r0 == 0) goto L_0x010b
            if (r3 == 0) goto L_0x010b
            if (r1 != 0) goto L_0x0039
            goto L_0x010b
        L_0x0039:
            a9.d1 r4 = r11.f46879b
            monitor-enter(r4)
            java.lang.String r5 = "key"
            kotlin.jvm.internal.C17542s.j(r0, r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "data"
            kotlin.jvm.internal.C17542s.j(r3, r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "mimeType"
            kotlin.jvm.internal.C17542s.j(r1, r5)     // Catch:{ all -> 0x0078 }
            com.contentsquare.android.internal.features.srm.SrmKeysCache r5 = r4.f42499b     // Catch:{ all -> 0x0078 }
            r5.getClass()     // Catch:{ all -> 0x0078 }
            java.lang.String r6 = "element"
            kotlin.jvm.internal.C17542s.j(r0, r6)     // Catch:{ all -> 0x0078 }
            java.util.LinkedHashSet r5 = r5.f46845d     // Catch:{ all -> 0x0078 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0078 }
            r7 = 10
            int r7 = YH.C16877v.y(r5, r7)     // Catch:{ all -> 0x0078 }
            r6.<init>(r7)     // Catch:{ all -> 0x0078 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0078 }
        L_0x0066:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x007b
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0078 }
            com.contentsquare.android.internal.features.srm.SrmKeysCache$Key r7 = (com.contentsquare.android.internal.features.srm.SrmKeysCache.Key) r7     // Catch:{ all -> 0x0078 }
            java.lang.String r7 = r7.f46852a     // Catch:{ all -> 0x0078 }
            r6.add(r7)     // Catch:{ all -> 0x0078 }
            goto L_0x0066
        L_0x0078:
            r12 = move-exception
            goto L_0x0109
        L_0x007b:
            boolean r5 = r6.contains(r0)     // Catch:{ all -> 0x0078 }
            if (r5 != 0) goto L_0x00c1
            java.util.LinkedHashSet r5 = r4.f42506i     // Catch:{ all -> 0x0078 }
            a9.a0 r6 = new a9.a0     // Catch:{ all -> 0x0078 }
            r6.<init>(r0, r3, r1)     // Catch:{ all -> 0x0078 }
            r5.add(r6)     // Catch:{ all -> 0x0078 }
            java.util.LinkedHashSet r0 = r4.f42506i     // Catch:{ all -> 0x0078 }
            int r0 = r0.size()     // Catch:{ all -> 0x0078 }
            int r1 = r4.f42501d     // Catch:{ all -> 0x0078 }
            if (r0 < r1) goto L_0x00c1
            D8.c r0 = r4.f42503f     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Max bucket size reached"
            r0.f(r1)     // Catch:{ all -> 0x0078 }
            A8.b r0 = r4.f42502e     // Catch:{ all -> 0x0078 }
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = r0.b()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.g()     // Catch:{ all -> 0x0078 }
            java.util.LinkedHashSet r1 = r4.f42506i     // Catch:{ all -> 0x0078 }
            java.util.List r1 = YH.C16877v.t1(r1)     // Catch:{ all -> 0x0078 }
            QJ.Q r5 = r4.f42505h     // Catch:{ all -> 0x0078 }
            a9.R0 r8 = new a9.R0     // Catch:{ all -> 0x0078 }
            r8.<init>(r4, r1, r0, r2)     // Catch:{ all -> 0x0078 }
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0078 }
            java.util.LinkedHashSet r0 = r4.f42506i     // Catch:{ all -> 0x0078 }
            r0.clear()     // Catch:{ all -> 0x0078 }
        L_0x00c1:
            monitor-exit(r4)
            r12.f46861d = r2
            a9.M0 r0 = r11.f46878a
            java.lang.String r1 = r12.f46858a
            r0.getClass()
            java.lang.String r2 = "assetId"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.util.HashMap<java.lang.String, com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset> r0 = r0.f42139a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x00e9
            a9.M0 r0 = r11.f46878a
            r0.getClass()
            java.lang.String r1 = "asset"
            kotlin.jvm.internal.C17542s.j(r12, r1)
            java.util.HashMap<java.lang.String, com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset> r0 = r0.f42139a
            java.lang.String r1 = r12.f46858a
            r0.put(r1, r12)
        L_0x00e9:
            D8.c r0 = f46877d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Asset sent to SRM: "
            r1.<init>(r2)
            java.lang.String r2 = r12.f46858a
            r1.append(r2)
            java.lang.String r2 = " => "
            r1.append(r2)
            java.lang.String r12 = r12.f46862e
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.f(r12)
            return
        L_0x0109:
            monitor-exit(r4)
            throw r12
        L_0x010b:
            D8.c r0 = f46877d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Asset "
            r1.<init>(r2)
            java.lang.String r12 = r12.f46858a
            r1.append(r12)
            java.lang.String r12 = " not sent to SRM: hash, payload or mimeType are null"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.f(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.webviewbridge.assets.a.a(com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset):void");
    }

    public final void c(List<WebViewAsset> list, String str, boolean z10) {
        C7131j jVar;
        C17542s.j(list, "assets");
        if (z10) {
            for (WebViewAsset next : list) {
                next.f46861d = null;
                M0 m02 = this.f46878a;
                String str2 = next.f46858a;
                m02.getClass();
                C17542s.j(str2, "assetId");
                if (!m02.f42139a.containsKey(str2)) {
                    M0 m03 = this.f46878a;
                    m03.getClass();
                    C17542s.j(next, "asset");
                    m03.f42139a.put(next.f46858a, next);
                }
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (WebViewAsset next2 : list) {
            M0 m04 = this.f46878a;
            String str3 = next2.f46858a;
            m04.getClass();
            C17542s.j(str3, "assetId");
            WebViewAsset webViewAsset = m04.f42139a.get(str3);
            if (webViewAsset != null) {
                if (webViewAsset.f46863f == WebViewAsset.a.DATA_CSS && str != null) {
                    webViewAsset = null;
                }
                if (webViewAsset != null) {
                    next2 = webViewAsset;
                }
            }
            next2.f46864g = str;
            int ordinal = next2.f46863f.ordinal();
            if (ordinal == 0) {
                arrayList3.add(next2);
            } else if (ordinal == 1) {
                arrayList2.add(next2);
            } else if (ordinal == 2) {
                arrayList.add(next2);
            } else if (ordinal == 3) {
                f46877d.f("Cannot process unsupported asset " + next2.f46858a);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a((WebViewAsset) it.next());
        }
        if (str != null) {
            Iterator it2 = this.f46880c.a(arrayList3, arrayList2).iterator();
            while (it2.hasNext()) {
                a((WebViewAsset) it2.next());
            }
            return;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            a((WebViewAsset) it3.next());
        }
        if (!arrayList.isEmpty() && (jVar = C7131j.f47442k) != null) {
            ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((WebViewAsset) it4.next()).f46858a);
            }
            C6823f1 f1Var = new C6823f1(arrayList4);
            C17542s.j(f1Var, "event");
            jVar.f47450d.a(f1Var);
            f46877d.f("Sent " + arrayList4.size() + " remote asset events to SR");
        }
        b(arrayList2);
        b(arrayList3);
    }
}
