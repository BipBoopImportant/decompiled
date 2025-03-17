package org.ocpsoft.prettytime.impl;

import NL.C16126a;
import NL.f;
import OL.C16182a;

public class a extends C16182a {

    /* renamed from: o  reason: collision with root package name */
    private final ResourcesTimeUnit f146219o;

    /* renamed from: p  reason: collision with root package name */
    private f f146220p;

    /* renamed from: q  reason: collision with root package name */
    private String f146221q;

    public a(ResourcesTimeUnit resourcesTimeUnit, String str) {
        this.f146219o = resourcesTimeUnit;
        this.f146221q = str;
    }

    public String a(C16126a aVar, String str) {
        f fVar = this.f146220p;
        return fVar == null ? super.a(aVar, str) : fVar.a(aVar, str);
    }

    public String c(C16126a aVar) {
        f fVar = this.f146220p;
        return fVar == null ? super.c(aVar) : fVar.c(aVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:16|17|18|19|20|21|22|(2:23|24)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x011f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x013d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x015b */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000d  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.ocpsoft.prettytime.impl.a r(java.util.Locale r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f146221q
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.util.ResourceBundle r0 = java.util.ResourceBundle.getBundle(r0, r3)     // Catch:{ Exception -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 != 0) goto L_0x0017
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r0 = r2.f146219o
            java.lang.String r0 = r0.c()
            java.util.ResourceBundle r0 = java.util.ResourceBundle.getBundle(r0, r3)
        L_0x0017:
            boolean r3 = r0 instanceof PL.C16214b
            if (r3 == 0) goto L_0x0029
            r3 = r0
            PL.b r3 = (PL.C16214b) r3
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            NL.f r3 = r3.a(r1)
            if (r3 == 0) goto L_0x002b
            r2.f146220p = r3
            goto L_0x002b
        L_0x0029:
            r2.f146220p = r1
        L_0x002b:
            NL.f r3 = r2.f146220p
            if (r3 != 0) goto L_0x0179
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "Pattern"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r0.getString(r3)
            r2.w(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "FuturePrefix"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r0.getString(r3)
            r2.o(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "FutureSuffix"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r0.getString(r3)
            r2.q(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "PastPrefix"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r0.getString(r3)
            r2.t(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "PastSuffix"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r0.getString(r3)
            r2.v(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "SingularName"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r0.getString(r3)
            r2.y(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "PluralName"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r0.getString(r3)
            r2.x(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011f }
            r3.<init>()     // Catch:{ Exception -> 0x011f }
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o     // Catch:{ Exception -> 0x011f }
            java.lang.String r1 = r1.d()     // Catch:{ Exception -> 0x011f }
            r3.append(r1)     // Catch:{ Exception -> 0x011f }
            java.lang.String r1 = "FuturePluralName"
            r3.append(r1)     // Catch:{ Exception -> 0x011f }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x011f }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x011f }
            r2.n(r3)     // Catch:{ Exception -> 0x011f }
        L_0x011f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013d }
            r3.<init>()     // Catch:{ Exception -> 0x013d }
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = r1.d()     // Catch:{ Exception -> 0x013d }
            r3.append(r1)     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = "FutureSingularName"
            r3.append(r1)     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x013d }
            r2.p(r3)     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015b }
            r3.<init>()     // Catch:{ Exception -> 0x015b }
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o     // Catch:{ Exception -> 0x015b }
            java.lang.String r1 = r1.d()     // Catch:{ Exception -> 0x015b }
            r3.append(r1)     // Catch:{ Exception -> 0x015b }
            java.lang.String r1 = "PastPluralName"
            r3.append(r1)     // Catch:{ Exception -> 0x015b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x015b }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x015b }
            r2.s(r3)     // Catch:{ Exception -> 0x015b }
        L_0x015b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r3.<init>()     // Catch:{ Exception -> 0x0179 }
            org.ocpsoft.prettytime.impl.ResourcesTimeUnit r1 = r2.f146219o     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = r1.d()     // Catch:{ Exception -> 0x0179 }
            r3.append(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = "PastSingularName"
            r3.append(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x0179 }
            r2.u(r3)     // Catch:{ Exception -> 0x0179 }
        L_0x0179:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.impl.a.r(java.util.Locale):org.ocpsoft.prettytime.impl.a");
    }
}
