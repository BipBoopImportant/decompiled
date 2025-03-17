package a9;

import java.util.ArrayList;
import org.json.JSONObject;

public final class B5 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f41932a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f41933b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f41934c = new JSONObject();

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f41935d = new JSONObject();

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f41936e = new JSONObject();

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f41937f = new JSONObject();

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079 A[LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0116 A[SYNTHETIC] */
    public final java.lang.Object a(java.util.ArrayList r7, dI.C17164e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a9.C6922r5
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a9.r5 r0 = (a9.C6922r5) r0
            int r1 = r0.f42836h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42836h = r1
            goto L_0x0018
        L_0x0013:
            a9.r5 r0 = new a9.r5
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f42834f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42836h
            switch(r2) {
                case 0: goto L_0x006b;
                case 1: goto L_0x005e;
                case 2: goto L_0x0051;
                case 3: goto L_0x005e;
                case 4: goto L_0x0044;
                case 5: goto L_0x0037;
                case 6: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002b:
            java.lang.Object r7 = r0.f42833e
            a9.B5 r7 = (a9.B5) r7
            java.util.Iterator r2 = r0.f42832d
            a9.B5 r3 = r0.f42831c
            XH.y.b(r8)
            goto L_0x00a2
        L_0x0037:
            java.lang.Object r7 = r0.f42833e
            a9.B5 r7 = (a9.B5) r7
            java.util.Iterator r2 = r0.f42832d
            a9.B5 r3 = r0.f42831c
            XH.y.b(r8)
            goto L_0x00b9
        L_0x0044:
            java.lang.Object r7 = r0.f42833e
            a9.B5 r7 = (a9.B5) r7
            java.util.Iterator r2 = r0.f42832d
            a9.B5 r3 = r0.f42831c
            XH.y.b(r8)
            goto L_0x00cf
        L_0x0051:
            java.lang.Object r7 = r0.f42833e
            a9.B5 r7 = (a9.B5) r7
            java.util.Iterator r2 = r0.f42832d
            a9.B5 r3 = r0.f42831c
            XH.y.b(r8)
            goto L_0x00e5
        L_0x005e:
            java.lang.Object r7 = r0.f42833e
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r2 = r0.f42832d
            a9.B5 r3 = r0.f42831c
            XH.y.b(r8)
            goto L_0x0112
        L_0x006b:
            XH.y.b(r8)
            java.util.ArrayList r8 = r6.f41932a
            r8.clear()
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r7 = r6
        L_0x0079:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0116
            java.lang.Object r8 = r2.next()
            a9.j3 r8 = (a9.C6857j3) r8
            a9.m4 r3 = r8.b()
            int r3 = r3.ordinal()
            switch(r3) {
                case 0: goto L_0x0100;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00d4;
                case 3: goto L_0x0100;
                case 4: goto L_0x00be;
                case 5: goto L_0x00a8;
                case 6: goto L_0x0091;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x0079
        L_0x0091:
            r0.f42831c = r7
            r0.f42832d = r2
            r0.f42833e = r7
            r3 = 6
            r0.f42836h = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r3 = r7
        L_0x00a2:
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            r7.f41937f = r8
        L_0x00a6:
            r7 = r3
            goto L_0x0079
        L_0x00a8:
            r0.f42831c = r7
            r0.f42832d = r2
            r0.f42833e = r7
            r3 = 5
            r0.f42836h = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r3 = r7
        L_0x00b9:
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            r7.f41936e = r8
            goto L_0x00a6
        L_0x00be:
            r0.f42831c = r7
            r0.f42832d = r2
            r0.f42833e = r7
            r3 = 4
            r0.f42836h = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            r3 = r7
        L_0x00cf:
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            r7.f41935d = r8
            goto L_0x00a6
        L_0x00d4:
            r0.f42831c = r7
            r0.f42832d = r2
            r0.f42833e = r7
            r3 = 2
            r0.f42836h = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            r3 = r7
        L_0x00e5:
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            r7.f41934c = r8
            goto L_0x00a6
        L_0x00ea:
            java.util.ArrayList r3 = r7.f41933b
            r0.f42831c = r7
            r0.f42832d = r2
            r0.f42833e = r3
            r4 = 1
            r0.f42836h = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x00fc
            return r1
        L_0x00fc:
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0112
        L_0x0100:
            java.util.ArrayList r3 = r7.f41932a
            r0.f42831c = r7
            r0.f42832d = r2
            r0.f42833e = r3
            r4 = 3
            r0.f42836h = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x00fc
            return r1
        L_0x0112:
            r7.add(r8)
            goto L_0x00a6
        L_0x0116:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.B5.a(java.util.ArrayList, dI.e):java.lang.Object");
    }
}
