package nts;

import android.app.Activity;
import android.app.ProgressDialog;
import qE.C14941a;
import qE.C14952l;

/* renamed from: nts.Ͼ  reason: contains not printable characters */
public class C3582 implements C14952l {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C4140 f314;

    /* renamed from: ગ  reason: contains not printable characters */
    public final String f315;

    /* renamed from: ഇ  reason: contains not printable characters */
    public final String f316;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3705 f317;

    /* renamed from: nts.Ͼ$ગ  reason: contains not printable characters */
    public class C3583 implements Runnable {
        public C3583() {
        }

        public void run() {
            C4140 r02 = C3582.this.f314;
            if (r02 != null) {
                r02.dismiss();
            }
        }
    }

    /* renamed from: nts.Ͼ$ഇ  reason: contains not printable characters */
    public class C3584 implements Runnable {

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ Activity f320;

        public C3584(Activity activity) {
            this.f320 = activity;
        }

        public void run() {
            C3582 r02 = C3582.this;
            Activity activity = this.f320;
            if (r02.f314 == null) {
                C3734 r22 = C3734.f1057;
                String r32 = C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 247, 26, 25);
                C3730 r42 = r22.f1064;
                if (r42 != null) {
                    r42.m1101(2, r32, C3734.f1055);
                }
                C4176 r33 = r22.f1067;
                boolean z10 = r33.f3872;
                boolean z11 = r33.f3874;
                String str = r02.f316;
                C4140 r62 = new C4140(activity);
                if (r22.f1067.f3870) {
                    r62.f3724 = 2000;
                }
                r62.f3722 = z11;
                r62.f3728 = z10;
                r62.f3723 = str;
                r62.f3727 = true;
                r02.f314 = r62;
            }
            r02.f314.show();
        }
    }

    public C3582(String str, String str2) {
        this.f316 = str;
        this.f315 = str2;
    }

    public void close() {
        C3734 r02 = C3734.f1057;
        String r12 = C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 273, 18, 55);
        C3730 r22 = r02.f1064;
        if (r22 != null) {
            r22.m1101(2, r12, C3734.f1055);
        }
        this.f317 = null;
        C4140 r23 = this.f314;
        if (r23 != null) {
            r23.dismiss();
        }
        this.f314 = null;
        r02.m1121();
        r02.f1064.m1099();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doChallenge(android.app.Activity r9, qE.C14942b r10, qE.C14943c r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r1 = 5
            r2 = 80
            java.lang.String r3 = "\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b"
            if (r12 < r1) goto L_0x012a
            boolean r1 = nts.C3956.f2333
            if (r1 != 0) goto L_0x0014
            nts.ഴ r9 = nts.C3734.f1057
            r10 = 3
            r9.m1122(r10, r10)
            return
        L_0x0014:
            r1 = 4
            nts.C3952.m2192(r1)
            nts.ഴ r1 = nts.C3734.f1057
            nts.ϴ r4 = new nts.ϴ
            r4.<init>(r11)
            r1.f1065 = r4
            r1.m1121()
            nts.ഗ r11 = r1.f1064
            nts.Ͼ$ഇ r1 = new nts.Ͼ$ഇ     // Catch:{ all -> 0x004b }
            r1.<init>(r9)     // Catch:{ all -> 0x004b }
            r9.runOnUiThread(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r10.e()     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r4 = r10.d()     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r4 = java.util.Objects.toString(r4, r0)     // Catch:{ ࢧ -> 0x004e }
            r11.m1115(r4)     // Catch:{ ࢧ -> 0x004e }
            r4 = 0
            if (r1 == 0) goto L_0x0051
            int r5 = r1.length()     // Catch:{ ࢧ -> 0x004e }
            if (r5 != 0) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            r11.m1103((java.lang.String) r1)     // Catch:{ ࢧ -> 0x004e }
            goto L_0x00ba
        L_0x004b:
            r10 = move-exception
            goto L_0x0121
        L_0x004e:
            r10 = move-exception
            goto L_0x00f5
        L_0x0051:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ࢧ -> 0x004e }
            r1.<init>()     // Catch:{ ࢧ -> 0x004e }
            r5 = 17
            r6 = 138(0x8a, float:1.93E-43)
            r7 = 127(0x7f, float:1.78E-43)
            java.lang.String r6 = nts.C3727.m1052((java.lang.String) r3, (int) r6, (int) r5, (int) r7)     // Catch:{ ࢧ -> 0x004e }
            r1.append(r6)     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r6 = r10.c()     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r6 = java.util.Objects.toString(r6, r0)     // Catch:{ ࢧ -> 0x004e }
            r1.append(r6)     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ ࢧ -> 0x004e }
            r11.m1095((java.lang.String) r1)     // Catch:{ ࢧ -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ࢧ -> 0x004e }
            r1.<init>()     // Catch:{ ࢧ -> 0x004e }
            r6 = 155(0x9b, float:2.17E-43)
            r7 = 20
            java.lang.String r6 = nts.C3727.m1052((java.lang.String) r3, (int) r6, (int) r7, (int) r5)     // Catch:{ ࢧ -> 0x004e }
            r1.append(r6)     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r6 = r10.a()     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r6 = java.util.Objects.toString(r6, r0)     // Catch:{ ࢧ -> 0x004e }
            r1.append(r6)     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ ࢧ -> 0x004e }
            r11.m1095((java.lang.String) r1)     // Catch:{ ࢧ -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ࢧ -> 0x004e }
            r1.<init>()     // Catch:{ ࢧ -> 0x004e }
            r6 = 175(0xaf, float:2.45E-43)
            java.lang.String r5 = nts.C3727.m1052((java.lang.String) r3, (int) r6, (int) r5, (int) r2)     // Catch:{ ࢧ -> 0x004e }
            r1.append(r5)     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r10 = r10.b()     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r10 = java.util.Objects.toString(r10, r0)     // Catch:{ ࢧ -> 0x004e }
            r1.append(r10)     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r10 = r1.toString()     // Catch:{ ࢧ -> 0x004e }
            r11.m1095((java.lang.String) r10)     // Catch:{ ࢧ -> 0x004e }
            r11.m1103((java.lang.String) r4)     // Catch:{ ࢧ -> 0x004e }
        L_0x00ba:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ࢧ -> 0x004e }
            r10.<init>()     // Catch:{ ࢧ -> 0x004e }
            r0 = 192(0xc0, float:2.69E-43)
            r1 = 14
            r5 = 91
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r3, (int) r0, (int) r1, (int) r5)     // Catch:{ ࢧ -> 0x004e }
            r10.append(r0)     // Catch:{ ࢧ -> 0x004e }
            r10.append(r12)     // Catch:{ ࢧ -> 0x004e }
            java.lang.String r10 = r10.toString()     // Catch:{ ࢧ -> 0x004e }
            r11.m1095((java.lang.String) r10)     // Catch:{ ࢧ -> 0x004e }
            boolean r10 = nts.C4158.m3479((android.os.Handler) r4)     // Catch:{ all -> 0x004b }
            if (r10 != 0) goto L_0x00e5
            nts.Ͼ$ગ r10 = new nts.Ͼ$ગ
            r10.<init>()
            r9.runOnUiThread(r10)
            return
        L_0x00e5:
            nts.Ͼ$ગ r10 = new nts.Ͼ$ગ
            r10.<init>()
            r9.runOnUiThread(r10)
            android.content.Intent r10 = nts.C3727.m1047((nts.C3730) r11, (android.app.Activity) r9)
            r9.startActivity(r10)
            return
        L_0x00f5:
            nts.ഴ r11 = nts.C3734.f1057     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r12.<init>()     // Catch:{ all -> 0x004b }
            r0 = 206(0xce, float:2.89E-43)
            r1 = 41
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r3, (int) r0, (int) r1, (int) r2)     // Catch:{ all -> 0x004b }
            r12.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x004b }
            r12.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x004b }
            r11.m1125(r12)     // Catch:{ all -> 0x004b }
            r11.m1124((nts.C3675) r10)     // Catch:{ all -> 0x004b }
            nts.Ͼ$ગ r10 = new nts.Ͼ$ગ
            r10.<init>()
            r9.runOnUiThread(r10)
            return
        L_0x0121:
            nts.Ͼ$ગ r11 = new nts.Ͼ$ગ
            r11.<init>()
            r9.runOnUiThread(r11)
            throw r10
        L_0x012a:
            tE.a r9 = new tE.a
            r10 = 90
            r11 = 48
            java.lang.String r10 = nts.C3727.m1052((java.lang.String) r3, (int) r10, (int) r11, (int) r2)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3582.doChallenge(android.app.Activity, qE.b, qE.c, int):void");
    }

    public C14941a getAuthenticationRequestParameters() {
        String str;
        if (!C3956.f2333) {
            C3734.f1057.m1122(3, 3);
            return null;
        }
        if (this.f317 == null) {
            C3734 r12 = C3734.f1057;
            r12.m1121();
            C3730 r13 = r12.f1064;
            r13.m1096();
            C3952.m2192(8);
            try {
                r13.m1095(C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 0, 16, 77) + this.f315);
                r13.m1113(this.f316);
                C4208 r22 = r13.f1036;
                String str2 = "";
                if (r22 == null) {
                    str = str2;
                } else {
                    if (!r22.f4073) {
                        r22.m3768();
                        r22.f4073 = true;
                    }
                    str = r22.f4076.m661();
                }
                String r72 = r13.m1095(C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 16, 10, 4));
                String r82 = r13.m1095(C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 26, 21, 9));
                String r10 = r13.m1095(C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 47, 18, 58));
                String r62 = r13.m1110();
                C4208 r14 = r13.f1036;
                if (r14 != null) {
                    str2 = r14.f4076.m2901();
                }
                this.f317 = new C3705(r62, r72, r82, str2, r10, this.f315, str);
            } catch (C3625 e10) {
                throw new C3675(e10);
            } catch (C3675 e11) {
                C3734 r23 = C3734.f1057;
                r23.m1125(C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 65, 25, 108) + e11.toString());
                throw new C3986(e11);
            }
        }
        return this.f317;
    }

    public ProgressDialog getProgressView(Activity activity) {
        if (this.f314 == null) {
            C3734 r02 = C3734.f1057;
            String r12 = C3727.m1052("\r.0*6;46\u00031%%8?=oZzjty~QwpxUCO@rkelk}maZ~jet_pkTBNVfddrj`niEdjrdrT_[UU\u0012GS\u001d]PV_S\\\u0004FJNEOV\u0019\fnS]\u0019SVRT_F]\u0011B^YPE^\\\tGAXHPUAM\u0006TLDvw8{{?)=z~dbrg;¥¦µ³£ÉÍúîëÿéÌë÷ùçôñçùþàÆè°¯¬¿¾¤ÃÆÐÜÛðèÇûðùðëí¥ñ×ÜØÖÖÄÐÞÔÞÙÒÆÓÑÌÆÌÕÉÌÏÙÅÄÄÚòååûýáôª¿·ÒÞ¯£ÃwYYDU\u0011FA]SM^[MSTJ\u000b", 247, 26, 25);
            C3730 r22 = r02.f1064;
            if (r22 != null) {
                r22.m1101(2, r12, C3734.f1055);
            }
            C4176 r13 = r02.f1067;
            boolean z10 = r13.f3872;
            boolean z11 = r13.f3874;
            String str = this.f316;
            C4140 r42 = new C4140(activity);
            if (r02.f1067.f3870) {
                r42.f3724 = 2000;
            }
            r42.f3722 = z11;
            r42.f3728 = z10;
            r42.f3723 = str;
            r42.f3727 = true;
            this.f314 = r42;
        }
        return this.f314;
    }
}
