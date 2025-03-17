package pE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: pE.b  reason: case insensitive filesystem */
public class C14917b implements C14920e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static boolean f130334a;

    /* renamed from: pE.b$a */
    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ Exception -> 0x0038 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                java.lang.String r0 = "api.mixpanel.com"
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ Exception -> 0x0038 }
                java.lang.String r1 = "decide.mixpanel.com"
                java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch:{ Exception -> 0x0038 }
                boolean r2 = r0.isLoopbackAddress()     // Catch:{ Exception -> 0x0038 }
                if (r2 != 0) goto L_0x0027
                boolean r0 = r0.isAnyLocalAddress()     // Catch:{ Exception -> 0x0038 }
                if (r0 != 0) goto L_0x0027
                boolean r0 = r1.isLoopbackAddress()     // Catch:{ Exception -> 0x0038 }
                if (r0 != 0) goto L_0x0027
                boolean r0 = r1.isAnyLocalAddress()     // Catch:{ Exception -> 0x0038 }
                if (r0 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r0 = 0
                goto L_0x0028
            L_0x0027:
                r0 = 1
            L_0x0028:
                boolean unused = pE.C14917b.f130334a = r0     // Catch:{ Exception -> 0x0038 }
                boolean r0 = pE.C14917b.f130334a     // Catch:{ Exception -> 0x0038 }
                if (r0 == 0) goto L_0x0038
                java.lang.String r0 = "MixpanelAPI.Message"
                java.lang.String r1 = "AdBlocker is enabled. Won't be able to use Mixpanel services."
                pE.C14918c.i(r0, r1)     // Catch:{ Exception -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pE.C14917b.a.run():void");
        }
    }

    private boolean f(C14919d dVar) {
        if (dVar == null) {
            return false;
        }
        try {
            return dVar.a();
        } catch (Exception e10) {
            C14918c.j("MixpanelAPI.Message", "Client State should not throw exception, will assume is not on offline mode", e10);
            return false;
        }
    }

    private static byte[] g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public boolean a(Context context, C14919d dVar) {
        if (f130334a || f(dVar)) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                C14918c.i("MixpanelAPI.Message", "A default network has not been set so we cannot be certain whether we are offline");
                return true;
            }
            boolean isConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ConnectivityManager says we ");
            sb2.append(isConnectedOrConnecting ? "are" : "are not");
            sb2.append(" online");
            C14918c.i("MixpanelAPI.Message", sb2.toString());
            return isConnectedOrConnecting;
        } catch (SecurityException unused) {
            C14918c.i("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0145 A[SYNTHETIC, Splitter:B:101:0x0145] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014a A[SYNTHETIC, Splitter:B:105:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fd A[SYNTHETIC, Splitter:B:67:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0128 A[SYNTHETIC, Splitter:B:82:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d A[SYNTHETIC, Splitter:B:86:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0132 A[SYNTHETIC, Splitter:B:90:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0140 A[SYNTHETIC, Splitter:B:97:0x0140] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] b(java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, javax.net.ssl.SSLSocketFactory r14) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting request to "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MixpanelAPI.Message"
            pE.C14918c.i(r1, r0)
            r0 = 0
            r2 = 0
            r4 = r0
            r3 = r2
        L_0x001a:
            r5 = 3
            if (r2 >= r5) goto L_0x0153
            if (r3 != 0) goto L_0x0153
            java.net.URL r5 = new java.net.URL     // Catch:{ EOFException -> 0x00f7, IOException -> 0x00f2, all -> 0x00ed }
            r5.<init>(r12)     // Catch:{ EOFException -> 0x00f7, IOException -> 0x00f2, all -> 0x00ed }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ EOFException -> 0x00f7, IOException -> 0x00f2, all -> 0x00ed }
            java.lang.Object r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r5)     // Catch:{ EOFException -> 0x00f7, IOException -> 0x00f2, all -> 0x00ed }
            java.net.URLConnection r5 = (java.net.URLConnection) r5     // Catch:{ EOFException -> 0x00f7, IOException -> 0x00f2, all -> 0x00ed }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ EOFException -> 0x00f7, IOException -> 0x00f2, all -> 0x00ed }
            if (r14 == 0) goto L_0x004e
            boolean r6 = r5 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            if (r6 == 0) goto L_0x004e
            r6 = r5
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            r6.setSSLSocketFactory(r14)     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            goto L_0x004e
        L_0x003d:
            r12 = move-exception
            r7 = r0
        L_0x003f:
            r8 = r7
            goto L_0x013e
        L_0x0042:
            r12 = move-exception
            r7 = r0
            r8 = r7
        L_0x0045:
            r9 = r8
        L_0x0046:
            r0 = r5
            goto L_0x00fb
        L_0x0049:
            r7 = r0
        L_0x004a:
            r8 = r7
        L_0x004b:
            r9 = r8
            goto L_0x011f
        L_0x004e:
            r6 = 2000(0x7d0, float:2.803E-42)
            r5.setConnectTimeout(r6)     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            r6 = 30000(0x7530, float:4.2039E-41)
            r5.setReadTimeout(r6)     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            r6 = 1
            if (r13 == 0) goto L_0x00d1
            android.net.Uri$Builder r7 = new android.net.Uri$Builder     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            r7.<init>()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.util.Set r8 = r13.entrySet()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
        L_0x0068:
            boolean r9 = r8.hasNext()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            if (r9 == 0) goto L_0x0086
            java.lang.Object r9 = r8.next()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.lang.Object r10 = r9.getKey()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.lang.Object r9 = r9.getValue()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.lang.String r9 = r9.toString()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            r7.appendQueryParameter(r10, r9)     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            goto L_0x0068
        L_0x0086:
            android.net.Uri r7 = r7.build()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.lang.String r7 = r7.getEncodedQuery()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            byte[] r8 = r7.getBytes()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            int r8 = r8.length     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            r5.setFixedLengthStreamingMode(r8)     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            r5.setDoOutput(r6)     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.lang.String r8 = "POST"
            r5.setRequestMethod(r8)     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.io.OutputStream r8 = r5.getOutputStream()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ EOFException -> 0x00c2, IOException -> 0x00be, all -> 0x00ba }
            r9.<init>(r8)     // Catch:{ EOFException -> 0x00c2, IOException -> 0x00be, all -> 0x00ba }
            java.lang.String r10 = "UTF-8"
            byte[] r7 = r7.getBytes(r10)     // Catch:{ EOFException -> 0x00cf, IOException -> 0x00cb, all -> 0x00c6 }
            r9.write(r7)     // Catch:{ EOFException -> 0x00cf, IOException -> 0x00cb, all -> 0x00c6 }
            r9.flush()     // Catch:{ EOFException -> 0x00cf, IOException -> 0x00cb, all -> 0x00c6 }
            r9.close()     // Catch:{ EOFException -> 0x00cf, IOException -> 0x00cb, all -> 0x00c6 }
            r8.close()     // Catch:{ EOFException -> 0x00c2, IOException -> 0x00be, all -> 0x00ba }
            goto L_0x00d1
        L_0x00ba:
            r12 = move-exception
            r7 = r0
            goto L_0x013e
        L_0x00be:
            r12 = move-exception
            r7 = r0
            r9 = r7
            goto L_0x0046
        L_0x00c2:
            r7 = r0
            r9 = r7
            goto L_0x011f
        L_0x00c6:
            r12 = move-exception
            r7 = r0
        L_0x00c8:
            r0 = r9
            goto L_0x013e
        L_0x00cb:
            r12 = move-exception
            r7 = r0
            goto L_0x0046
        L_0x00cf:
            r7 = r0
            goto L_0x011f
        L_0x00d1:
            java.io.InputStream r7 = r5.getInputStream()     // Catch:{ EOFException -> 0x0049, IOException -> 0x0042, all -> 0x003d }
            byte[] r4 = g(r7)     // Catch:{ EOFException -> 0x00ea, IOException -> 0x00e6, all -> 0x00e2 }
            r7.close()     // Catch:{ EOFException -> 0x00ea, IOException -> 0x00e6, all -> 0x00e2 }
            r5.disconnect()
            r3 = r6
            goto L_0x001a
        L_0x00e2:
            r12 = move-exception
            r8 = r0
            goto L_0x013e
        L_0x00e6:
            r12 = move-exception
            r8 = r0
            goto L_0x0045
        L_0x00ea:
            r8 = r0
            goto L_0x004b
        L_0x00ed:
            r12 = move-exception
            r5 = r0
            r7 = r5
            goto L_0x003f
        L_0x00f2:
            r12 = move-exception
            r7 = r0
            r8 = r7
            r9 = r8
            goto L_0x00fb
        L_0x00f7:
            r5 = r0
            r7 = r5
            goto L_0x004a
        L_0x00fb:
            if (r0 == 0) goto L_0x011e
            int r13 = r0.getResponseCode()     // Catch:{ all -> 0x011b }
            r14 = 500(0x1f4, float:7.0E-43)
            if (r13 < r14) goto L_0x011e
            int r13 = r0.getResponseCode()     // Catch:{ all -> 0x011b }
            r14 = 599(0x257, float:8.4E-43)
            if (r13 > r14) goto L_0x011e
            pE.e$a r12 = new pE.e$a     // Catch:{ all -> 0x011b }
            java.lang.String r13 = "Service Unavailable"
            java.lang.String r14 = "Retry-After"
            java.lang.String r14 = r0.getHeaderField(r14)     // Catch:{ all -> 0x011b }
            r12.<init>(r13, r14)     // Catch:{ all -> 0x011b }
            throw r12     // Catch:{ all -> 0x011b }
        L_0x011b:
            r12 = move-exception
            r5 = r0
            goto L_0x00c8
        L_0x011e:
            throw r12     // Catch:{ all -> 0x011b }
        L_0x011f:
            java.lang.String r6 = "Failure to connect, likely caused by a known issue with Android lib. Retrying."
            pE.C14918c.a(r1, r6)     // Catch:{ all -> 0x013c }
            int r2 = r2 + 1
            if (r9 == 0) goto L_0x012b
            r9.close()     // Catch:{ IOException -> 0x012b }
        L_0x012b:
            if (r8 == 0) goto L_0x0130
            r8.close()     // Catch:{ IOException -> 0x0130 }
        L_0x0130:
            if (r7 == 0) goto L_0x0135
            r7.close()     // Catch:{ IOException -> 0x0135 }
        L_0x0135:
            if (r5 == 0) goto L_0x001a
            r5.disconnect()
            goto L_0x001a
        L_0x013c:
            r12 = move-exception
            goto L_0x00c8
        L_0x013e:
            if (r0 == 0) goto L_0x0143
            r0.close()     // Catch:{ IOException -> 0x0143 }
        L_0x0143:
            if (r8 == 0) goto L_0x0148
            r8.close()     // Catch:{ IOException -> 0x0148 }
        L_0x0148:
            if (r7 == 0) goto L_0x014d
            r7.close()     // Catch:{ IOException -> 0x014d }
        L_0x014d:
            if (r5 == 0) goto L_0x0152
            r5.disconnect()
        L_0x0152:
            throw r12
        L_0x0153:
            if (r2 < r5) goto L_0x015a
            java.lang.String r12 = "Could not connect to Mixpanel service after three retries."
            pE.C14918c.i(r1, r12)
        L_0x015a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pE.C14917b.b(java.lang.String, java.util.Map, javax.net.ssl.SSLSocketFactory):byte[]");
    }

    public void c() {
        new Thread(new a()).start();
    }
}
