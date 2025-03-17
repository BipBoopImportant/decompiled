package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.android.volley.b;
import com.android.volley.g;
import com.android.volley.v;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class d implements com.android.volley.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f46257a;

    /* renamed from: b  reason: collision with root package name */
    private long f46258b;

    /* renamed from: c  reason: collision with root package name */
    private final c f46259c;

    /* renamed from: d  reason: collision with root package name */
    private final int f46260d;

    public interface c {
        File get();
    }

    public d(c cVar, int i10) {
        this.f46257a = new LinkedHashMap(16, 0.75f, true);
        this.f46258b = 0;
        this.f46259c = cVar;
        this.f46260d = i10;
    }

    private String g(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    private void h() {
        if (!this.f46259c.get().exists()) {
            v.b("Re-initializing cache after external clearing.", new Object[0]);
            this.f46257a.clear();
            this.f46258b = 0;
            b();
        }
    }

    private void i() {
        if (this.f46258b >= ((long) this.f46260d)) {
            int i10 = 0;
            if (v.f46286b) {
                v.e("Pruning old cache entries.", new Object[0]);
            }
            long j10 = this.f46258b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, a>> it = this.f46257a.entrySet().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next().getValue();
                if (f(aVar.f46262b).delete()) {
                    this.f46258b -= aVar.f46261a;
                } else {
                    String str = aVar.f46262b;
                    v.b("Could not delete cache entry for key=%s, filename=%s", str, g(str));
                }
                it.remove();
                i10++;
                if (((float) this.f46258b) < ((float) this.f46260d) * 0.9f) {
                    break;
                }
            }
            if (v.f46286b) {
                v.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f46258b - j10), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    private void j(String str, a aVar) {
        if (!this.f46257a.containsKey(str)) {
            this.f46258b += aVar.f46261a;
        } else {
            this.f46258b += aVar.f46261a - this.f46257a.get(str).f46261a;
        }
        this.f46257a.put(str, aVar);
    }

    private static int k(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static List<g> l(b bVar) {
        int m10 = m(bVar);
        if (m10 >= 0) {
            List<g> emptyList = m10 == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i10 = 0; i10 < m10; i10++) {
                emptyList.add(new g(o(bVar).intern(), o(bVar).intern()));
            }
            return emptyList;
        }
        throw new IOException("readHeaderList size=" + m10);
    }

    static int m(InputStream inputStream) {
        return (k(inputStream) << 24) | k(inputStream) | (k(inputStream) << 8) | (k(inputStream) << 16);
    }

    static long n(InputStream inputStream) {
        return (((long) k(inputStream)) & 255) | ((((long) k(inputStream)) & 255) << 8) | ((((long) k(inputStream)) & 255) << 16) | ((((long) k(inputStream)) & 255) << 24) | ((((long) k(inputStream)) & 255) << 32) | ((((long) k(inputStream)) & 255) << 40) | ((((long) k(inputStream)) & 255) << 48) | ((255 & ((long) k(inputStream))) << 56);
    }

    static String o(b bVar) {
        return new String(r(bVar, n(bVar)), Constants.ENCODING);
    }

    private void q(String str) {
        a remove = this.f46257a.remove(str);
        if (remove != null) {
            this.f46258b -= remove.f46261a;
        }
    }

    static byte[] r(b bVar, long j10) {
        long c10 = bVar.c();
        if (j10 >= 0 && j10 <= c10) {
            int i10 = (int) j10;
            if (((long) i10) == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + c10);
    }

    static void s(List<g> list, OutputStream outputStream) {
        if (list != null) {
            t(outputStream, list.size());
            for (g next : list) {
                v(outputStream, next.a());
                v(outputStream, next.b());
            }
            return;
        }
        t(outputStream, 0);
    }

    static void t(OutputStream outputStream, int i10) {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void u(OutputStream outputStream, long j10) {
        outputStream.write((byte) ((int) j10));
        outputStream.write((byte) ((int) (j10 >>> 8)));
        outputStream.write((byte) ((int) (j10 >>> 16)));
        outputStream.write((byte) ((int) (j10 >>> 24)));
        outputStream.write((byte) ((int) (j10 >>> 32)));
        outputStream.write((byte) ((int) (j10 >>> 40)));
        outputStream.write((byte) ((int) (j10 >>> 48)));
        outputStream.write((byte) ((int) (j10 >>> 56)));
    }

    static void v(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes(Constants.ENCODING);
        u(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    public synchronized void a(String str, boolean z10) {
        try {
            b.a aVar = get(str);
            if (aVar != null) {
                aVar.f46196f = 0;
                if (z10) {
                    aVar.f46195e = 0;
                }
                c(str, aVar);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.android.volley.toolbox.d$c r0 = r9.f46259c     // Catch:{ all -> 0x0021 }
            java.io.File r0 = r0.get()     // Catch:{ all -> 0x0021 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0025
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = "Unable to create cache dir %s"
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0021 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0021 }
            com.android.volley.v.c(r1, r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0023
        L_0x0021:
            r0 = move-exception
            goto L_0x0061
        L_0x0023:
            monitor-exit(r9)
            return
        L_0x0025:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x002d
            monitor-exit(r9)
            return
        L_0x002d:
            int r1 = r0.length     // Catch:{ all -> 0x0021 }
            r2 = 0
        L_0x002f:
            if (r2 >= r1) goto L_0x005f
            r3 = r0[r2]     // Catch:{ all -> 0x0021 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.android.volley.toolbox.d$b r6 = new com.android.volley.toolbox.d$b     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = r9.d(r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.android.volley.toolbox.d$a r7 = com.android.volley.toolbox.d.a.b(r6)     // Catch:{ all -> 0x0054 }
            r7.f46261a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f46262b     // Catch:{ all -> 0x0054 }
            r9.j(r4, r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0021 }
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            monitor-exit(r9)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.d.b():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|(1:21)|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r0.delete() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        com.android.volley.v.b("Could not clean up file %s", r0.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        h();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(java.lang.String r7, com.android.volley.b.a r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.f46258b     // Catch:{ all -> 0x001c }
            byte[] r2 = r8.f46191a     // Catch:{ all -> 0x001c }
            int r3 = r2.length     // Catch:{ all -> 0x001c }
            long r3 = (long) r3     // Catch:{ all -> 0x001c }
            long r0 = r0 + r3
            int r3 = r6.f46260d     // Catch:{ all -> 0x001c }
            long r4 = (long) r3     // Catch:{ all -> 0x001c }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            int r0 = r2.length     // Catch:{ all -> 0x001c }
            float r0 = (float) r0
            float r1 = (float) r3
            r2 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            monitor-exit(r6)
            return
        L_0x001c:
            r7 = move-exception
            goto L_0x0079
        L_0x001e:
            java.io.File r0 = r6.f(r7)     // Catch:{ all -> 0x001c }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0061 }
            java.io.OutputStream r2 = r6.e(r0)     // Catch:{ IOException -> 0x0061 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0061 }
            com.android.volley.toolbox.d$a r2 = new com.android.volley.toolbox.d$a     // Catch:{ IOException -> 0x0061 }
            r2.<init>(r7, r8)     // Catch:{ IOException -> 0x0061 }
            boolean r3 = r2.d(r1)     // Catch:{ IOException -> 0x0061 }
            if (r3 == 0) goto L_0x004b
            byte[] r8 = r8.f46191a     // Catch:{ IOException -> 0x0061 }
            r1.write(r8)     // Catch:{ IOException -> 0x0061 }
            r1.close()     // Catch:{ IOException -> 0x0061 }
            long r3 = r0.length()     // Catch:{ IOException -> 0x0061 }
            r2.f46261a = r3     // Catch:{ IOException -> 0x0061 }
            r6.j(r7, r2)     // Catch:{ IOException -> 0x0061 }
            r6.i()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0077
        L_0x004b:
            r1.close()     // Catch:{ IOException -> 0x0061 }
            java.lang.String r7 = "Failed to write header for %s"
            java.lang.String r8 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0061 }
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch:{ IOException -> 0x0061 }
            com.android.volley.v.b(r7, r8)     // Catch:{ IOException -> 0x0061 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0061 }
            r7.<init>()     // Catch:{ IOException -> 0x0061 }
            throw r7     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            boolean r7 = r0.delete()     // Catch:{ all -> 0x001c }
            if (r7 != 0) goto L_0x0074
            java.lang.String r7 = "Could not clean up file %s"
            java.lang.String r8 = r0.getAbsolutePath()     // Catch:{ all -> 0x001c }
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch:{ all -> 0x001c }
            com.android.volley.v.b(r7, r8)     // Catch:{ all -> 0x001c }
        L_0x0074:
            r6.h()     // Catch:{ all -> 0x001c }
        L_0x0077:
            monitor-exit(r6)
            return
        L_0x0079:
            monitor-exit(r6)     // Catch:{ all -> 0x001c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.d.c(java.lang.String, com.android.volley.b$a):void");
    }

    /* access modifiers changed from: package-private */
    public InputStream d(File file) {
        return new FileInputStream(file);
    }

    /* access modifiers changed from: package-private */
    public OutputStream e(File file) {
        return new FileOutputStream(file);
    }

    public File f(String str) {
        return new File(this.f46259c.get(), g(str));
    }

    public synchronized b.a get(String str) {
        b bVar;
        a aVar = this.f46257a.get(str);
        if (aVar == null) {
            return null;
        }
        File f10 = f(str);
        try {
            bVar = new b(new BufferedInputStream(d(f10)), f10.length());
            a b10 = a.b(bVar);
            if (!TextUtils.equals(str, b10.f46262b)) {
                v.b("%s: key=%s, found=%s", f10.getAbsolutePath(), str, b10.f46262b);
                q(str);
                bVar.close();
                return null;
            }
            b.a c10 = aVar.c(r(bVar, bVar.c()));
            bVar.close();
            return c10;
        } catch (IOException e10) {
            v.b("%s: %s", f10.getAbsolutePath(), e10.toString());
            p(str);
            return null;
        } catch (Throwable th2) {
            bVar.close();
            throw th2;
        }
    }

    public synchronized void p(String str) {
        boolean delete = f(str).delete();
        q(str);
        if (!delete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, g(str));
        }
    }

    static class b extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final long f46269a;

        /* renamed from: b  reason: collision with root package name */
        private long f46270b;

        b(InputStream inputStream, long j10) {
            super(inputStream);
            this.f46269a = j10;
        }

        /* access modifiers changed from: package-private */
        public long c() {
            return this.f46269a - this.f46270b;
        }

        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f46270b++;
            }
            return read;
        }

        public int read(byte[] bArr, int i10, int i11) {
            int read = super.read(bArr, i10, i11);
            if (read != -1) {
                this.f46270b += (long) read;
            }
            return read;
        }
    }

    public d(c cVar) {
        this(cVar, 5242880);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f46261a;

        /* renamed from: b  reason: collision with root package name */
        final String f46262b;

        /* renamed from: c  reason: collision with root package name */
        final String f46263c;

        /* renamed from: d  reason: collision with root package name */
        final long f46264d;

        /* renamed from: e  reason: collision with root package name */
        final long f46265e;

        /* renamed from: f  reason: collision with root package name */
        final long f46266f;

        /* renamed from: g  reason: collision with root package name */
        final long f46267g;

        /* renamed from: h  reason: collision with root package name */
        final List<g> f46268h;

        private a(String str, String str2, long j10, long j11, long j12, long j13, List<g> list) {
            this.f46262b = str;
            this.f46263c = "".equals(str2) ? null : str2;
            this.f46264d = j10;
            this.f46265e = j11;
            this.f46266f = j12;
            this.f46267g = j13;
            this.f46268h = list;
        }

        private static List<g> a(b.a aVar) {
            List<g> list = aVar.f46198h;
            return list != null ? list : e.h(aVar.f46197g);
        }

        static a b(b bVar) {
            if (d.m(bVar) == 538247942) {
                return new a(d.o(bVar), d.o(bVar), d.n(bVar), d.n(bVar), d.n(bVar), d.n(bVar), d.l(bVar));
            }
            throw new IOException();
        }

        /* access modifiers changed from: package-private */
        public b.a c(byte[] bArr) {
            b.a aVar = new b.a();
            aVar.f46191a = bArr;
            aVar.f46192b = this.f46263c;
            aVar.f46193c = this.f46264d;
            aVar.f46194d = this.f46265e;
            aVar.f46195e = this.f46266f;
            aVar.f46196f = this.f46267g;
            aVar.f46197g = e.i(this.f46268h);
            aVar.f46198h = Collections.unmodifiableList(this.f46268h);
            return aVar;
        }

        /* access modifiers changed from: package-private */
        public boolean d(OutputStream outputStream) {
            try {
                d.t(outputStream, 538247942);
                d.v(outputStream, this.f46262b);
                String str = this.f46263c;
                if (str == null) {
                    str = "";
                }
                d.v(outputStream, str);
                d.u(outputStream, this.f46264d);
                d.u(outputStream, this.f46265e);
                d.u(outputStream, this.f46266f);
                d.u(outputStream, this.f46267g);
                d.s(this.f46268h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e10) {
                v.b("%s", e10.toString());
                return false;
            }
        }

        a(String str, b.a aVar) {
            this(str, aVar.f46192b, aVar.f46193c, aVar.f46194d, aVar.f46195e, aVar.f46196f, a(aVar));
        }
    }
}
