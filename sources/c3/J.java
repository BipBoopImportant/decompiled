package C3;

import A3.v1;
import C3.C6407A;
import android.annotation.SuppressLint;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import h4.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import q3.C5797h;
import q3.C5803n;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;

public final class J implements C6407A {

    /* renamed from: d  reason: collision with root package name */
    public static final C6407A.c f33562d = new D();

    /* renamed from: a  reason: collision with root package name */
    private final UUID f33563a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f33564b;

    /* renamed from: c  reason: collision with root package name */
    private int f33565c = 1;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, v1 v1Var) {
            LogSessionId a10 = v1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                G.a(C5950a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
            }
        }
    }

    private J(UUID uuid) {
        C5950a.e(uuid);
        C5950a.b(!C5797h.f28130b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f33563a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f33564b = mediaDrm;
        if (C5797h.f28132d.equals(uuid) && C()) {
            w(mediaDrm);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(C6407A.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6407A B(UUID uuid) {
        try {
            return D(uuid);
        } catch (O unused) {
            q.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    private static boolean C() {
        return "ASUS_Z00AD".equals(N.f29465d);
    }

    public static J D(UUID uuid) {
        try {
            return new J(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new O(1, e10);
        } catch (Exception e11) {
            throw new O(2, e11);
        }
    }

    private static byte[] p(byte[] bArr) {
        B b10 = new B(bArr);
        int u10 = b10.u();
        short w10 = b10.w();
        short w11 = b10.w();
        if (w10 == 1 && w11 == 1) {
            short w12 = b10.w();
            Charset charset = StandardCharsets.UTF_16LE;
            String F10 = b10.F(w12, charset);
            if (F10.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = F10.indexOf("</DATA>");
            if (indexOf == -1) {
                q.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = F10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + F10.substring(indexOf);
            int i10 = u10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort((short) w10);
            allocate.putShort((short) w11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        q.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (N.f29462a >= 33 && "https://default.url".equals(str)) {
            String x10 = x("version");
            if (Objects.equals(x10, "1.2") || Objects.equals(x10, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return C5797h.f28131c.equals(uuid) ? C6410a.a(bArr) : bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = q3.C5797h.f28133e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = h4.o.e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = p(r4)
            byte[] r4 = h4.o.a(r0, r4)
        L_0x0018:
            int r1 = t3.N.f29462a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = q3.C5797h.f28132d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = t3.N.f29464c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = t3.N.f29465d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = h4.o.e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.J.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (N.f29462a >= 26 || !C5797h.f28131c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    private static UUID u(UUID uuid) {
        return (N.f29462a >= 27 || !C5797h.f28131c.equals(uuid)) ? uuid : C5797h.f28130b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static C5803n.b y(UUID uuid, List<C5803n.b> list) {
        if (!C5797h.f28132d.equals(uuid)) {
            return list.get(0);
        }
        if (N.f29462a >= 28 && list.size() > 1) {
            C5803n.b bVar = list.get(0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < list.size()) {
                C5803n.b bVar2 = list.get(i10);
                byte[] bArr = (byte[]) C5950a.e(bVar2.f28177e);
                if (N.d(bVar2.f28176d, bVar.f28176d) && N.d(bVar2.f28175c, bVar.f28175c) && o.c(bArr)) {
                    i11 += bArr.length;
                    i10++;
                }
            }
            byte[] bArr2 = new byte[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                byte[] bArr3 = (byte[]) C5950a.e(list.get(i13).f28177e);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i12, length);
                i12 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            C5803n.b bVar3 = list.get(i14);
            int g10 = o.g((byte[]) C5950a.e(bVar3.f28177e));
            int i15 = N.f29462a;
            if (i15 < 23 && g10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && g10 == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    private boolean z() {
        if (!this.f33563a.equals(C5797h.f28132d)) {
            return this.f33563a.equals(C5797h.f28131c);
        }
        String x10 = x("version");
        return !x10.startsWith("v5.") && !x10.startsWith("14.") && !x10.startsWith("15.") && !x10.startsWith("16.0");
    }

    public void a(C6407A.b bVar) {
        this.f33564b.setOnEventListener(bVar == null ? null : new E(this, bVar));
    }

    public Map<String, String> b(byte[] bArr) {
        return this.f33564b.queryKeyStatus(bArr);
    }

    public C6407A.d c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f33564b.getProvisionRequest();
        return new C6407A.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public byte[] d() {
        return this.f33564b.openSession();
    }

    public void e(byte[] bArr, byte[] bArr2) {
        this.f33564b.restoreKeys(bArr, bArr2);
    }

    public void f(byte[] bArr) {
        this.f33564b.provideProvisionResponse(bArr);
    }

    public int g() {
        return 2;
    }

    public void h(byte[] bArr, v1 v1Var) {
        if (N.f29462a >= 31) {
            try {
                a.b(this.f33564b, bArr, v1Var);
            } catch (UnsupportedOperationException unused) {
                q.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(byte[] r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = t3.N.f29462a
            r1 = 31
            if (r0 < r1) goto L_0x0017
            boolean r0 = r3.z()
            if (r0 == 0) goto L_0x0017
            android.media.MediaDrm r0 = r3.f33564b
            int r4 = r0.getSecurityLevel(r4)
            boolean r4 = C3.J.a.a(r0, r5, r4)
            goto L_0x0039
        L_0x0017:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x0033, all -> 0x002c }
            java.util.UUID r2 = r3.f33563a     // Catch:{ MediaCryptoException -> 0x0033, all -> 0x002c }
            r1.<init>(r2, r4)     // Catch:{ MediaCryptoException -> 0x0033, all -> 0x002c }
            boolean r4 = r1.requiresSecureDecoderComponent(r5)     // Catch:{ MediaCryptoException -> 0x002a, all -> 0x0027 }
            r1.release()
            goto L_0x0039
        L_0x0027:
            r4 = move-exception
            r0 = r1
            goto L_0x002d
        L_0x002a:
            r0 = r1
            goto L_0x0033
        L_0x002c:
            r4 = move-exception
        L_0x002d:
            if (r0 == 0) goto L_0x0032
            r0.release()
        L_0x0032:
            throw r4
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.release()
        L_0x0038:
            r4 = 1
        L_0x0039:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.J.j(byte[], java.lang.String):boolean");
    }

    public void k(byte[] bArr) {
        this.f33564b.closeSession(bArr);
    }

    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (C5797h.f28131c.equals(this.f33563a)) {
            bArr2 = C6410a.b(bArr2);
        }
        return this.f33564b.provideKeyResponse(bArr, bArr2);
    }

    @SuppressLint({"WrongConstant"})
    public C6407A.a m(byte[] bArr, List<C5803n.b> list, int i10, HashMap<String, String> hashMap) {
        C5803n.b bVar;
        String str;
        byte[] bArr2;
        if (list != null) {
            bVar = y(this.f33563a, list);
            bArr2 = s(this.f33563a, (byte[]) C5950a.e(bVar.f28177e));
            str = t(this.f33563a, bVar.f28176d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f33564b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f33563a, keyRequest.getData());
        String q10 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q10) && bVar != null && !TextUtils.isEmpty(bVar.f28175c)) {
            q10 = bVar.f28175c;
        }
        return new C6407A.a(r10, q10, N.f29462a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    public synchronized void release() {
        int i10 = this.f33565c - 1;
        this.f33565c = i10;
        if (i10 == 0) {
            this.f33564b.release();
        }
    }

    /* renamed from: v */
    public C6408B i(byte[] bArr) {
        return new C6408B(u(this.f33563a), bArr);
    }

    public String x(String str) {
        return this.f33564b.getPropertyString(str);
    }
}
