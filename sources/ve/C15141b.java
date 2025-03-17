package vE;

import org.slf4j.Logger;
import yE.C15299b;

/* renamed from: vE.b  reason: case insensitive filesystem */
public class C15141b {

    /* renamed from: c  reason: collision with root package name */
    public static int f131540c = 10000;

    /* renamed from: d  reason: collision with root package name */
    public static int f131541d = 60000;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15299b f131542a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Logger f131543b;

    /* renamed from: vE.b$a */
    class a implements C15299b.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f131544a;

        a(String str) {
            this.f131544a = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc A[SYNTHETIC, Splitter:B:46:0x00cc] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd A[SYNTHETIC, Splitter:B:52:0x00dd] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String execute() {
            /*
                r7 = this;
                java.lang.String r0 = "Error closing connection"
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                java.lang.String r3 = r7.f131544a     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                vE.b r3 = vE.C15141b.this     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                org.slf4j.Logger r3 = r3.f131543b     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                java.lang.String r4 = "Requesting data file from {}"
                r3.info((java.lang.String) r4, (java.lang.Object) r2)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                vE.b r3 = vE.C15141b.this     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                yE.b r3 = r3.f131542a     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                java.net.HttpURLConnection r2 = r3.b(r2)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
                if (r2 != 0) goto L_0x0032
                if (r2 == 0) goto L_0x0031
                r2.disconnect()     // Catch:{ Exception -> 0x0027 }
                goto L_0x0031
            L_0x0027:
                r2 = move-exception
                vE.b r3 = vE.C15141b.this
                org.slf4j.Logger r3 = r3.f131543b
                r3.error((java.lang.String) r0, (java.lang.Throwable) r2)
            L_0x0031:
                return r1
            L_0x0032:
                vE.b r3 = vE.C15141b.this     // Catch:{ Exception -> 0x0078 }
                yE.b r3 = r3.f131542a     // Catch:{ Exception -> 0x0078 }
                r3.e(r2)     // Catch:{ Exception -> 0x0078 }
                int r3 = vE.C15141b.f131540c     // Catch:{ Exception -> 0x0078 }
                r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x0078 }
                int r3 = vE.C15141b.f131541d     // Catch:{ Exception -> 0x0078 }
                r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x0078 }
                r2.connect()     // Catch:{ Exception -> 0x0078 }
                int r3 = r2.getResponseCode()     // Catch:{ Exception -> 0x0078 }
                r4 = 200(0xc8, float:2.8E-43)
                if (r3 < r4) goto L_0x007a
                r4 = 300(0x12c, float:4.2E-43)
                if (r3 >= r4) goto L_0x007a
                vE.b r3 = vE.C15141b.this     // Catch:{ Exception -> 0x0078 }
                yE.b r3 = r3.f131542a     // Catch:{ Exception -> 0x0078 }
                r3.d(r2)     // Catch:{ Exception -> 0x0078 }
                vE.b r3 = vE.C15141b.this     // Catch:{ Exception -> 0x0078 }
                yE.b r3 = r3.f131542a     // Catch:{ Exception -> 0x0078 }
                java.lang.String r1 = r3.c(r2)     // Catch:{ Exception -> 0x0078 }
                r2.disconnect()     // Catch:{ Exception -> 0x006b }
                goto L_0x0075
            L_0x006b:
                r2 = move-exception
                vE.b r3 = vE.C15141b.this
                org.slf4j.Logger r3 = r3.f131543b
                r3.error((java.lang.String) r0, (java.lang.Throwable) r2)
            L_0x0075:
                return r1
            L_0x0076:
                r1 = move-exception
                goto L_0x00db
            L_0x0078:
                r3 = move-exception
                goto L_0x00bf
            L_0x007a:
                r4 = 304(0x130, float:4.26E-43)
                if (r3 != r4) goto L_0x009a
                vE.b r3 = vE.C15141b.this     // Catch:{ Exception -> 0x0078 }
                org.slf4j.Logger r3 = r3.f131543b     // Catch:{ Exception -> 0x0078 }
                java.lang.String r4 = "Data file has not been modified on the cdn"
                r3.info(r4)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r1 = ""
                r2.disconnect()     // Catch:{ Exception -> 0x008f }
                goto L_0x0099
            L_0x008f:
                r2 = move-exception
                vE.b r3 = vE.C15141b.this
                org.slf4j.Logger r3 = r3.f131543b
                r3.error((java.lang.String) r0, (java.lang.Throwable) r2)
            L_0x0099:
                return r1
            L_0x009a:
                vE.b r4 = vE.C15141b.this     // Catch:{ Exception -> 0x0078 }
                org.slf4j.Logger r4 = r4.f131543b     // Catch:{ Exception -> 0x0078 }
                java.lang.String r5 = "Unexpected response from data file cdn, status: {}"
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0078 }
                r4.error((java.lang.String) r5, (java.lang.Object) r3)     // Catch:{ Exception -> 0x0078 }
                r2.disconnect()     // Catch:{ Exception -> 0x00ad }
                goto L_0x00b7
            L_0x00ad:
                r2 = move-exception
                vE.b r3 = vE.C15141b.this
                org.slf4j.Logger r3 = r3.f131543b
                r3.error((java.lang.String) r0, (java.lang.Throwable) r2)
            L_0x00b7:
                return r1
            L_0x00b8:
                r2 = move-exception
                r6 = r2
                r2 = r1
                r1 = r6
                goto L_0x00db
            L_0x00bd:
                r3 = move-exception
                r2 = r1
            L_0x00bf:
                vE.b r4 = vE.C15141b.this     // Catch:{ all -> 0x0076 }
                org.slf4j.Logger r4 = r4.f131543b     // Catch:{ all -> 0x0076 }
                java.lang.String r5 = "Error making request"
                r4.error((java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0076 }
                if (r2 == 0) goto L_0x00da
                r2.disconnect()     // Catch:{ Exception -> 0x00d0 }
                goto L_0x00da
            L_0x00d0:
                r2 = move-exception
                vE.b r3 = vE.C15141b.this
                org.slf4j.Logger r3 = r3.f131543b
                r3.error((java.lang.String) r0, (java.lang.Throwable) r2)
            L_0x00da:
                return r1
            L_0x00db:
                if (r2 == 0) goto L_0x00eb
                r2.disconnect()     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00eb
            L_0x00e1:
                r2 = move-exception
                vE.b r3 = vE.C15141b.this
                org.slf4j.Logger r3 = r3.f131543b
                r3.error((java.lang.String) r0, (java.lang.Throwable) r2)
            L_0x00eb:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: vE.C15141b.a.execute():java.lang.String");
        }
    }

    public C15141b(C15299b bVar, Logger logger) {
        this.f131542a = bVar;
        this.f131543b = logger;
    }

    public String c(String str) {
        return (String) this.f131542a.a(new a(str), 2, 3);
    }
}
