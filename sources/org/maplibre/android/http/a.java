package org.maplibre.android.http;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import org.maplibre.android.MapLibre;
import org.maplibre.android.c;
import org.maplibre.android.log.Logger;

class a extends AsyncTask<String, Void, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private C4247a f145531a;

    /* renamed from: org.maplibre.android.http.a$a  reason: collision with other inner class name */
    public interface C4247a {
        void a(byte[] bArr);
    }

    a(C4247a aVar) {
        this.f145531a = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0034 A[SYNTHETIC, Splitter:B:25:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(android.content.res.AssetManager r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ IOException -> 0x0021 }
            int r3 = r2.available()     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            byte[] r0 = new byte[r3]     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            r2.read(r0)     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            r2.close()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0031
        L_0x0012:
            r2 = move-exception
            c(r2)
            goto L_0x0031
        L_0x0017:
            r3 = move-exception
            r0 = r2
            goto L_0x0032
        L_0x001a:
            r3 = move-exception
            r1 = r0
            r0 = r2
            r2 = r1
            goto L_0x0023
        L_0x001f:
            r3 = move-exception
            goto L_0x0032
        L_0x0021:
            r3 = move-exception
            r2 = r0
        L_0x0023:
            c(r3)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r3 = move-exception
            c(r3)
        L_0x0030:
            r0 = r2
        L_0x0031:
            return r0
        L_0x0032:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r2 = move-exception
            c(r2)
        L_0x003c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.http.a.b(android.content.res.AssetManager, java.lang.String):byte[]");
    }

    private static void c(Exception exc) {
        Logger.e("Mbgl-LocalRequestTask", "Load file failed", exc);
        c.c("Load file failed", exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] doInBackground(String... strArr) {
        AssetManager assets = MapLibre.getApplicationContext().getAssets();
        return b(assets, "integration/" + strArr[0].substring(8).replaceAll("%20", " ").replaceAll("%2c", ","));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void onPostExecute(byte[] bArr) {
        C4247a aVar;
        super.onPostExecute(bArr);
        if (bArr != null && (aVar = this.f145531a) != null) {
            aVar.a(bArr);
        }
    }
}
