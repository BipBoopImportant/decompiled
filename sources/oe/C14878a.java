package oE;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import oE.C14884g;
import org.json.JSONException;
import org.json.JSONObject;
import pE.C14917b;
import pE.C14918c;
import pE.C14919d;
import pE.C14920e;

/* renamed from: oE.a  reason: case insensitive filesystem */
class C14878a {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Context, C14878a> f129996d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final i f129997a = d();

    /* renamed from: b  reason: collision with root package name */
    protected final Context f129998b;

    /* renamed from: c  reason: collision with root package name */
    protected final C14883f f129999c;

    /* renamed from: oE.a$a  reason: collision with other inner class name */
    static class C3202a extends e {

        /* renamed from: c  reason: collision with root package name */
        private final String f130000c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f130001d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f130002e;

        public C3202a(String str, JSONObject jSONObject, String str2) {
            this(str, jSONObject, str2, false, new JSONObject());
        }

        public String c() {
            return this.f130000c;
        }

        public JSONObject d() {
            return b();
        }

        public JSONObject e() {
            return this.f130001d;
        }

        public boolean f() {
            return this.f130002e;
        }

        public C3202a(String str, JSONObject jSONObject, String str2, boolean z10, JSONObject jSONObject2) {
            super(str2, jSONObject);
            this.f130000c = str;
            this.f130002e = z10;
            this.f130001d = jSONObject2;
        }
    }

    /* renamed from: oE.a$b */
    static class b extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f130003b;

        public b(String str) {
            this(str, true);
        }

        public boolean b() {
            return this.f130003b;
        }

        protected b(String str, boolean z10) {
            super(str);
            this.f130003b = z10;
        }
    }

    /* renamed from: oE.a$c */
    static class c extends e {
        public String toString() {
            return b().toString();
        }
    }

    /* renamed from: oE.a$d */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f130004a;

        public d(String str) {
            this.f130004a = str;
        }

        public String a() {
            return this.f130004a;
        }
    }

    /* renamed from: oE.a$e */
    static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final JSONObject f130005b;

        public e(String str, JSONObject jSONObject) {
            super(str);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.get(next).toString();
                    } catch (AssertionError e10) {
                        jSONObject.remove(next);
                        C14918c.d("MixpanelAPI.Messages", "Removing people profile property from update (see https://github.com/mixpanel/mixpanel-android/issues/567)", e10);
                    } catch (JSONException unused) {
                    }
                }
            }
            this.f130005b = jSONObject;
        }

        public JSONObject b() {
            return this.f130005b;
        }
    }

    /* renamed from: oE.a$f */
    static class f extends e {
        public f(JSONObject jSONObject, String str) {
            super(str, jSONObject);
        }

        public boolean c() {
            return !b().has("$distinct_id");
        }

        public String toString() {
            return b().toString();
        }
    }

    /* renamed from: oE.a$g */
    static class g extends d {

        /* renamed from: b  reason: collision with root package name */
        private final String f130006b;

        public g(String str, String str2) {
            super(str2);
            this.f130006b = str;
        }

        public String b() {
            return this.f130006b;
        }

        public String toString() {
            return this.f130006b;
        }
    }

    /* renamed from: oE.a$h */
    static class h extends d {

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f130007b;

        public Map<String, String> b() {
            return this.f130007b;
        }
    }

    /* renamed from: oE.a$i */
    class i {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Object f130008a = new Object();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Handler f130009b = f();

        /* renamed from: c  reason: collision with root package name */
        private long f130010c = 0;

        /* renamed from: d  reason: collision with root package name */
        private long f130011d = 0;

        /* renamed from: e  reason: collision with root package name */
        private long f130012e = -1;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C14891n f130013f;

        /* renamed from: oE.a$i$a  reason: collision with other inner class name */
        class C3203a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            private C14884g f130015a = null;

            /* renamed from: b  reason: collision with root package name */
            private final C14880c f130016b;

            /* renamed from: c  reason: collision with root package name */
            private final long f130017c;

            /* renamed from: d  reason: collision with root package name */
            private long f130018d;

            /* renamed from: e  reason: collision with root package name */
            private long f130019e;

            /* renamed from: f  reason: collision with root package name */
            private int f130020f;

            public C3203a(Looper looper) {
                super(looper);
                C14891n unused = i.this.f130013f = C14891n.f(C14878a.this.f129998b);
                this.f130016b = a();
                this.f130017c = (long) C14878a.this.f129999c.j();
            }

            private JSONObject b() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mp_lib", "android");
                jSONObject.put("$lib_version", "6.5.2");
                jSONObject.put("$os", "Android");
                String str = Build.VERSION.RELEASE;
                String str2 = "UNKNOWN";
                if (str == null) {
                    str = str2;
                }
                jSONObject.put("$os_version", str);
                String str3 = Build.MANUFACTURER;
                if (str3 == null) {
                    str3 = str2;
                }
                jSONObject.put("$manufacturer", str3);
                String str4 = Build.BRAND;
                if (str4 == null) {
                    str4 = str2;
                }
                jSONObject.put("$brand", str4);
                String str5 = Build.MODEL;
                if (str5 != null) {
                    str2 = str5;
                }
                jSONObject.put("$model", str2);
                DisplayMetrics e10 = i.this.f130013f.e();
                jSONObject.put("$screen_dpi", e10.densityDpi);
                jSONObject.put("$screen_height", e10.heightPixels);
                jSONObject.put("$screen_width", e10.widthPixels);
                String b10 = i.this.f130013f.b();
                if (b10 != null) {
                    jSONObject.put("$app_version", b10);
                    jSONObject.put("$app_version_string", b10);
                }
                Integer a10 = i.this.f130013f.a();
                if (a10 != null) {
                    String valueOf = String.valueOf(a10);
                    jSONObject.put("$app_release", valueOf);
                    jSONObject.put("$app_build_number", valueOf);
                }
                jSONObject.put("$has_nfc", i.this.f130013f.g());
                jSONObject.put("$has_telephone", i.this.f130013f.h());
                String d10 = i.this.f130013f.d();
                if (d10 != null && !d10.trim().isEmpty()) {
                    jSONObject.put("$carrier", d10);
                }
                Boolean j10 = i.this.f130013f.j();
                if (j10 != null) {
                    jSONObject.put("$wifi", j10.booleanValue());
                }
                Boolean i10 = i.this.f130013f.i();
                if (i10 != null) {
                    jSONObject.put("$bluetooth_enabled", i10);
                }
                String c10 = i.this.f130013f.c();
                if (c10 != null) {
                    jSONObject.put("$bluetooth_version", c10);
                }
                return jSONObject;
            }

            private JSONObject c(C3202a aVar) {
                JSONObject jSONObject = new JSONObject();
                JSONObject d10 = aVar.d();
                JSONObject b10 = b();
                b10.put("token", aVar.a());
                if (d10 != null) {
                    Iterator<String> keys = d10.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b10.put(next, d10.get(next));
                    }
                }
                jSONObject.put("event", aVar.c());
                jSONObject.put("properties", b10);
                jSONObject.put("$mp_metadata", aVar.e());
                return jSONObject;
            }

            private void d(C14884g gVar, String str) {
                C14920e i10 = C14878a.this.i();
                C14878a aVar = C14878a.this;
                Context context = aVar.f129998b;
                aVar.f129999c.q();
                if (!i10.a(context, (C14919d) null)) {
                    C14878a.this.k("Not flushing data to Mixpanel because the device is not connected to the internet.");
                    return;
                }
                e(gVar, str, C14884g.b.EVENTS, C14878a.this.f129999c.h());
                e(gVar, str, C14884g.b.PEOPLE, C14878a.this.f129999c.r());
                e(gVar, str, C14884g.b.GROUPS, C14878a.this.f129999c.l());
            }

            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
                r16 = r9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
                r16 = r9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
                r16 = r9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
                r16 = r9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
                r16 = r9;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0091 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:15:0x0062] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0096 A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:15:0x0062] */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x009b A[ExcHandler: a (e pE.e$a), Splitter:B:15:0x0062] */
            /* JADX WARNING: Removed duplicated region for block: B:68:0x01ad  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01ce A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void e(oE.C14884g r18, java.lang.String r19, oE.C14884g.b r20, java.lang.String r21) {
                /*
                    r17 = this;
                    r1 = r17
                    r2 = r18
                    r3 = r19
                    r4 = r20
                    r5 = r21
                    java.lang.String r6 = "MixpanelAPI.Messages"
                    java.lang.String r7 = "Cannot post message to "
                    java.lang.String r8 = "."
                    oE.a$i r0 = oE.C14878a.i.this
                    oE.a r0 = oE.C14878a.this
                    pE.e r9 = r0.i()
                    oE.c r0 = r1.f130016b
                    oE.d r0 = r0.c(r3)
                    r10 = 0
                    r11 = 1
                    if (r0 == 0) goto L_0x002b
                    java.lang.Boolean r0 = r0.c()
                    if (r0 != 0) goto L_0x0029
                    goto L_0x002b
                L_0x0029:
                    r12 = r11
                    goto L_0x002c
                L_0x002b:
                    r12 = r10
                L_0x002c:
                    java.lang.String[] r0 = r2.q(r4, r3, r12)
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
                    r14 = 2
                    if (r0 == 0) goto L_0x003d
                    r13 = r0[r14]
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                L_0x003d:
                    if (r0 == 0) goto L_0x0224
                    int r15 = r13.intValue()
                    if (r15 <= 0) goto L_0x0224
                    r15 = r0[r10]
                    r0 = r0[r11]
                    java.lang.String r11 = pE.C14916a.c(r0)
                    java.util.HashMap r14 = new java.util.HashMap
                    r14.<init>()
                    java.lang.String r10 = "data"
                    r14.put(r10, r11)
                    boolean r10 = oE.C14883f.f130038t
                    if (r10 == 0) goto L_0x0062
                    java.lang.String r10 = "verbose"
                    java.lang.String r11 = "1"
                    r14.put(r10, r11)
                L_0x0062:
                    oE.a$i r10 = oE.C14878a.i.this     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    oE.a r10 = oE.C14878a.this     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    oE.f r10 = r10.f129999c     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    javax.net.ssl.SSLSocketFactory r10 = r10.s()     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    byte[] r10 = r9.b(r5, r14, r10)     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    if (r10 != 0) goto L_0x00ae
                    oE.a$i r0 = oE.C14878a.i.this     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    oE.a r0 = oE.C14878a.this     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r10.<init>()     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    java.lang.String r11 = "Response was null, unexpected failure posting to "
                    r10.append(r11)     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r10.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r10.append(r8)     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r0.k(r10)     // Catch:{ OutOfMemoryError -> 0x00a7, MalformedURLException -> 0x00a0, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r16 = r9
                    goto L_0x013b
                L_0x0091:
                    r0 = move-exception
                    r16 = r9
                    goto L_0x0122
                L_0x0096:
                    r0 = move-exception
                    r16 = r9
                    goto L_0x013d
                L_0x009b:
                    r0 = move-exception
                    r16 = r9
                    goto L_0x0157
                L_0x00a0:
                    r0 = move-exception
                    r16 = r9
                    r9 = r0
                    r0 = 0
                    goto L_0x017a
                L_0x00a7:
                    r0 = move-exception
                    r16 = r9
                    r9 = r0
                    r0 = 0
                    goto L_0x0194
                L_0x00ae:
                    java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0117 }
                    java.lang.String r14 = "UTF-8"
                    r11.<init>(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x0117 }
                    int r10 = r1.f130020f     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    if (r10 <= 0) goto L_0x00cf
                    r10 = 0
                    r1.f130020f = r10     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r14 = 2
                    r1.removeMessages(r14, r3)     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    goto L_0x00d0
                L_0x00c1:
                    r0 = move-exception
                    r16 = r9
                L_0x00c4:
                    r9 = r0
                    r0 = 1
                    goto L_0x017a
                L_0x00c8:
                    r0 = move-exception
                    r16 = r9
                L_0x00cb:
                    r9 = r0
                    r0 = 1
                    goto L_0x0194
                L_0x00cf:
                    r10 = 0
                L_0x00d0:
                    oE.a$i r14 = oE.C14878a.i.this     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    oE.a r14 = oE.C14878a.this     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r10.<init>()     // Catch:{ OutOfMemoryError -> 0x00c8, MalformedURLException -> 0x00c1, a -> 0x009b, SocketTimeoutException -> 0x0096, IOException -> 0x0091 }
                    r16 = r9
                    java.lang.String r9 = "Successfully posted to "
                    r10.append(r9)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    r10.append(r5)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    java.lang.String r9 = ": \n"
                    r10.append(r9)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    r10.append(r0)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    java.lang.String r0 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    r14.k(r0)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    oE.a$i r0 = oE.C14878a.i.this     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    oE.a r0 = oE.C14878a.this     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    r9.<init>()     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    java.lang.String r10 = "Response was "
                    r9.append(r10)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    r9.append(r11)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    java.lang.String r9 = r9.toString()     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    r0.k(r9)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    r0 = 1
                    goto L_0x01ab
                L_0x010d:
                    r0 = move-exception
                    goto L_0x0122
                L_0x010f:
                    r0 = move-exception
                    goto L_0x013d
                L_0x0111:
                    r0 = move-exception
                    goto L_0x0157
                L_0x0113:
                    r0 = move-exception
                    goto L_0x00c4
                L_0x0115:
                    r0 = move-exception
                    goto L_0x00cb
                L_0x0117:
                    r0 = move-exception
                    r16 = r9
                    java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    java.lang.String r10 = "UTF not supported on this platform?"
                    r9.<init>(r10, r0)     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                    throw r9     // Catch:{ OutOfMemoryError -> 0x0115, MalformedURLException -> 0x0113, a -> 0x0111, SocketTimeoutException -> 0x010f, IOException -> 0x010d }
                L_0x0122:
                    oE.a$i r9 = oE.C14878a.i.this
                    oE.a r9 = oE.C14878a.this
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r7)
                    r10.append(r5)
                    r10.append(r8)
                    java.lang.String r10 = r10.toString()
                    r9.l(r10, r0)
                L_0x013b:
                    r0 = 0
                    goto L_0x01ab
                L_0x013d:
                    oE.a$i r9 = oE.C14878a.i.this
                    oE.a r9 = oE.C14878a.this
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r7)
                    r10.append(r5)
                    r10.append(r8)
                    java.lang.String r10 = r10.toString()
                    r9.l(r10, r0)
                    goto L_0x013b
                L_0x0157:
                    oE.a$i r9 = oE.C14878a.i.this
                    oE.a r9 = oE.C14878a.this
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r7)
                    r10.append(r5)
                    r10.append(r8)
                    java.lang.String r10 = r10.toString()
                    r9.l(r10, r0)
                    int r0 = r0.a()
                    int r0 = r0 * 1000
                    long r9 = (long) r0
                    r1.f130019e = r9
                    goto L_0x013b
                L_0x017a:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r11 = "Cannot interpret "
                    r10.append(r11)
                    r10.append(r5)
                    java.lang.String r11 = " as a URL."
                    r10.append(r11)
                    java.lang.String r10 = r10.toString()
                    pE.C14918c.d(r6, r10, r9)
                    goto L_0x01ab
                L_0x0194:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r11 = "Out of memory when posting to "
                    r10.append(r11)
                    r10.append(r5)
                    r10.append(r8)
                    java.lang.String r10 = r10.toString()
                    pE.C14918c.d(r6, r10, r9)
                L_0x01ab:
                    if (r0 == 0) goto L_0x01ce
                    oE.a$i r0 = oE.C14878a.i.this
                    oE.a r0 = oE.C14878a.this
                    java.lang.String r9 = "Not retrying this batch of events, deleting them from DB."
                    r0.k(r9)
                    r2.o(r15, r4, r3, r12)
                    java.lang.String[] r0 = r2.q(r4, r3, r12)
                    r9 = 2
                    if (r0 == 0) goto L_0x01c7
                    r10 = r0[r9]
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    r13 = r10
                L_0x01c7:
                    r14 = r9
                    r9 = r16
                    r10 = 0
                    r11 = 1
                    goto L_0x003d
                L_0x01ce:
                    r9 = 2
                    r1.removeMessages(r9, r3)
                    int r0 = r1.f130020f
                    double r4 = (double) r0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    double r4 = java.lang.Math.pow(r6, r4)
                    long r4 = (long) r4
                    r6 = 60000(0xea60, double:2.9644E-319)
                    long r4 = r4 * r6
                    long r6 = r1.f130019e
                    long r4 = java.lang.Math.max(r4, r6)
                    r1.f130019e = r4
                    r6 = 600000(0x927c0, double:2.964394E-318)
                    long r4 = java.lang.Math.min(r4, r6)
                    r1.f130019e = r4
                    android.os.Message r0 = android.os.Message.obtain()
                    r2 = 2
                    r0.what = r2
                    r0.obj = r3
                    long r2 = r1.f130019e
                    r1.sendMessageDelayed(r0, r2)
                    int r0 = r1.f130020f
                    r2 = 1
                    int r0 = r0 + r2
                    r1.f130020f = r0
                    oE.a$i r0 = oE.C14878a.i.this
                    oE.a r0 = oE.C14878a.this
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Retrying this batch of events in "
                    r2.append(r3)
                    long r3 = r1.f130019e
                    r2.append(r3)
                    java.lang.String r3 = " ms"
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r0.k(r2)
                L_0x0224:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: oE.C14878a.i.C3203a.e(oE.g, java.lang.String, oE.g$b, java.lang.String):void");
            }

            /* access modifiers changed from: protected */
            public C14880c a() {
                C14878a aVar = C14878a.this;
                return new C14880c(aVar.f129998b, aVar.f129999c);
            }

            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:104:0x02fe A[SYNTHETIC, Splitter:B:104:0x02fe] */
            /* JADX WARNING: Removed duplicated region for block: B:112:0x0325 A[Catch:{ RuntimeException -> 0x004f }] */
            /* JADX WARNING: Removed duplicated region for block: B:130:? A[Catch:{  }, RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:133:? A[Catch:{  }, RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r12) {
                /*
                    r11 = this;
                    oE.g r0 = r11.f130015a
                    if (r0 != 0) goto L_0x003a
                    oE.a$i r0 = oE.C14878a.i.this
                    oE.a r0 = oE.C14878a.this
                    android.content.Context r1 = r0.f129998b
                    oE.g r0 = r0.m(r1)
                    r11.f130015a = r0
                    long r1 = java.lang.System.currentTimeMillis()
                    oE.a$i r3 = oE.C14878a.i.this
                    oE.a r3 = oE.C14878a.this
                    oE.f r3 = r3.f129999c
                    long r3 = r3.b()
                    long r1 = r1 - r3
                    oE.g$b r3 = oE.C14884g.b.EVENTS
                    r0.n(r1, r3)
                    oE.g r0 = r11.f130015a
                    long r1 = java.lang.System.currentTimeMillis()
                    oE.a$i r3 = oE.C14878a.i.this
                    oE.a r3 = oE.C14878a.this
                    oE.f r3 = r3.f129999c
                    long r3 = r3.b()
                    long r1 = r1 - r3
                    oE.g$b r3 = oE.C14884g.b.PEOPLE
                    r0.n(r1, r3)
                L_0x003a:
                    r0 = 0
                    int r1 = r12.what     // Catch:{ RuntimeException -> 0x004f }
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 != 0) goto L_0x0092
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$f r12 = (oE.C14878a.f) r12     // Catch:{ RuntimeException -> 0x004f }
                    boolean r1 = r12.c()     // Catch:{ RuntimeException -> 0x004f }
                    if (r1 == 0) goto L_0x0052
                    oE.g$b r1 = oE.C14884g.b.ANONYMOUS_PEOPLE     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x0054
                L_0x004f:
                    r12 = move-exception
                    goto L_0x035f
                L_0x0052:
                    oE.g$b r1 = oE.C14884g.b.PEOPLE     // Catch:{ RuntimeException -> 0x004f }
                L_0x0054:
                    oE.a$i r5 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r5 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r6 = "Queuing people record for sending later"
                    r5.k(r6)     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$i r5 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r5 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r6.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r7 = "    "
                    r6.append(r7)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r7 = r12.toString()     // Catch:{ RuntimeException -> 0x004f }
                    r6.append(r7)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r6 = r6.toString()     // Catch:{ RuntimeException -> 0x004f }
                    r5.k(r6)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r5 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r6 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    org.json.JSONObject r7 = r12.b()     // Catch:{ RuntimeException -> 0x004f }
                    int r1 = r6.j(r7, r5, r1, r4)     // Catch:{ RuntimeException -> 0x004f }
                    boolean r12 = r12.c()     // Catch:{ RuntimeException -> 0x004f }
                    if (r12 == 0) goto L_0x008f
                    goto L_0x02b5
                L_0x008f:
                    r4 = r1
                    goto L_0x02b5
                L_0x0092:
                    r5 = 3
                    if (r1 != r5) goto L_0x00d0
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$c r12 = (oE.C14878a.c) r12     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$i r1 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r1 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r5 = "Queuing group record for sending later"
                    r1.k(r5)     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$i r1 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r1 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r5.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r6 = "    "
                    r5.append(r6)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r6 = r12.toString()     // Catch:{ RuntimeException -> 0x004f }
                    r5.append(r6)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x004f }
                    r1.k(r5)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r5 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    org.json.JSONObject r12 = r12.b()     // Catch:{ RuntimeException -> 0x004f }
                    oE.g$b r6 = oE.C14884g.b.GROUPS     // Catch:{ RuntimeException -> 0x004f }
                    int r4 = r1.j(r12, r5, r6, r4)     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x02b5
                L_0x00d0:
                    r5 = -3
                    if (r1 != r3) goto L_0x014c
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$a r12 = (oE.C14878a.C3202a) r12     // Catch:{ RuntimeException -> 0x004f }
                    org.json.JSONObject r1 = r11.c(r12)     // Catch:{ JSONException -> 0x012b }
                    oE.a$i r4 = oE.C14878a.i.this     // Catch:{ JSONException -> 0x012b }
                    oE.a r4 = oE.C14878a.this     // Catch:{ JSONException -> 0x012b }
                    java.lang.String r6 = "Queuing event for sending later"
                    r4.k(r6)     // Catch:{ JSONException -> 0x012b }
                    oE.a$i r4 = oE.C14878a.i.this     // Catch:{ JSONException -> 0x012b }
                    oE.a r4 = oE.C14878a.this     // Catch:{ JSONException -> 0x012b }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x012b }
                    r6.<init>()     // Catch:{ JSONException -> 0x012b }
                    java.lang.String r7 = "    "
                    r6.append(r7)     // Catch:{ JSONException -> 0x012b }
                    java.lang.String r7 = r1.toString()     // Catch:{ JSONException -> 0x012b }
                    r6.append(r7)     // Catch:{ JSONException -> 0x012b }
                    java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x012b }
                    r4.k(r6)     // Catch:{ JSONException -> 0x012b }
                    java.lang.String r4 = r12.a()     // Catch:{ JSONException -> 0x012b }
                    oE.c r6 = r11.f130016b     // Catch:{ JSONException -> 0x0119 }
                    oE.d r6 = r6.c(r4)     // Catch:{ JSONException -> 0x0119 }
                    if (r6 == 0) goto L_0x011b
                    boolean r7 = r12.f()     // Catch:{ JSONException -> 0x0119 }
                    if (r7 == 0) goto L_0x011b
                    boolean r6 = r6.f()     // Catch:{ JSONException -> 0x0119 }
                    if (r6 != 0) goto L_0x011b
                    return
                L_0x0119:
                    r1 = move-exception
                    goto L_0x012d
                L_0x011b:
                    oE.g r6 = r11.f130015a     // Catch:{ JSONException -> 0x0119 }
                    oE.g$b r7 = oE.C14884g.b.EVENTS     // Catch:{ JSONException -> 0x0119 }
                    boolean r8 = r12.f()     // Catch:{ JSONException -> 0x0119 }
                    int r12 = r6.j(r1, r4, r7, r8)     // Catch:{ JSONException -> 0x0119 }
                    r5 = r4
                    r4 = r12
                    goto L_0x02b5
                L_0x012b:
                    r1 = move-exception
                    r4 = r0
                L_0x012d:
                    java.lang.String r6 = "MixpanelAPI.Messages"
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r7.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r8 = "Exception tracking event "
                    r7.append(r8)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = r12.c()     // Catch:{ RuntimeException -> 0x004f }
                    r7.append(r12)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = r7.toString()     // Catch:{ RuntimeException -> 0x004f }
                    pE.C14918c.d(r6, r12, r1)     // Catch:{ RuntimeException -> 0x004f }
                    r10 = r5
                    r5 = r4
                    r4 = r10
                    goto L_0x02b5
                L_0x014c:
                    r6 = 4
                    if (r1 != r6) goto L_0x0163
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$g r12 = (oE.C14878a.g) r12     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r1 = r12.b()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r5 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r12 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    int r4 = r12.t(r5, r1)     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x02b5
                L_0x0163:
                    r6 = 7
                    if (r1 != r6) goto L_0x0179
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$d r12 = (oE.C14878a.d) r12     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    oE.g$b r4 = oE.C14884g.b.ANONYMOUS_PEOPLE     // Catch:{ RuntimeException -> 0x004f }
                    r1.k(r4, r12)     // Catch:{ RuntimeException -> 0x004f }
                L_0x0175:
                    r4 = r5
                    r5 = r12
                    goto L_0x02b5
                L_0x0179:
                    r6 = 8
                    if (r1 != r6) goto L_0x01a7
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$h r12 = (oE.C14878a.h) r12     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    java.util.Map r4 = r12.b()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r1.u(r4, r12)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r1 = "MixpanelAPI.Messages"
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r4.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    r4.append(r12)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = " stored events were updated with new properties."
                    r4.append(r12)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = r4.toString()     // Catch:{ RuntimeException -> 0x004f }
                    pE.C14918c.a(r1, r12)     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x02b3
                L_0x01a7:
                    if (r1 != r2) goto L_0x01f2
                    oE.a$i r1 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r1 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r6 = "Flushing queue due to scheduled or forced flush"
                    r1.k(r6)     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$i r1 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    r1.h()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.Object r1 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r1 = (java.lang.String) r1     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12.arg1     // Catch:{ RuntimeException -> 0x004f }
                    if (r12 != r3) goto L_0x01c0
                    r4 = r3
                L_0x01c0:
                    oE.g r12 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    r11.d(r12, r1)     // Catch:{ RuntimeException -> 0x004f }
                    if (r4 == 0) goto L_0x01ee
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x004f }
                    long r8 = r11.f130018d     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r12 < 0) goto L_0x01ee
                    oE.c r12 = r11.f130016b     // Catch:{ a -> 0x01df }
                    oE.a$i r4 = oE.C14878a.i.this     // Catch:{ a -> 0x01df }
                    oE.a r4 = oE.C14878a.this     // Catch:{ a -> 0x01df }
                    pE.e r4 = r4.i()     // Catch:{ a -> 0x01df }
                    r12.g(r1, r4)     // Catch:{ a -> 0x01df }
                    goto L_0x01ee
                L_0x01df:
                    r12 = move-exception
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12 * 1000
                    long r8 = (long) r12     // Catch:{ RuntimeException -> 0x004f }
                    long r6 = r6 + r8
                    r11.f130018d = r6     // Catch:{ RuntimeException -> 0x004f }
                L_0x01ee:
                    r4 = r5
                    r5 = r1
                    goto L_0x02b5
                L_0x01f2:
                    r4 = 12
                    if (r1 != r4) goto L_0x0236
                    oE.a$i r1 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r1 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r4 = "Installing a check for decide"
                    r1.k(r4)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.d r12 = (oE.C14881d) r12     // Catch:{ RuntimeException -> 0x004f }
                    oE.c r1 = r11.f130016b     // Catch:{ RuntimeException -> 0x004f }
                    r1.a(r12)     // Catch:{ RuntimeException -> 0x004f }
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x004f }
                    long r8 = r11.f130018d     // Catch:{ RuntimeException -> 0x004f }
                    int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r1 < 0) goto L_0x02b3
                    oE.c r1 = r11.f130016b     // Catch:{ a -> 0x0225 }
                    java.lang.String r12 = r12.b()     // Catch:{ a -> 0x0225 }
                    oE.a$i r4 = oE.C14878a.i.this     // Catch:{ a -> 0x0225 }
                    oE.a r4 = oE.C14878a.this     // Catch:{ a -> 0x0225 }
                    pE.e r4 = r4.i()     // Catch:{ a -> 0x0225 }
                    r1.g(r12, r4)     // Catch:{ a -> 0x0225 }
                    goto L_0x02b3
                L_0x0225:
                    r12 = move-exception
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12 * 1000
                    long r8 = (long) r12     // Catch:{ RuntimeException -> 0x004f }
                    long r6 = r6 + r8
                    r11.f130018d = r6     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x02b3
                L_0x0236:
                    r4 = 6
                    if (r1 != r4) goto L_0x025f
                    java.lang.Object r12 = r12.obj     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$d r12 = (oE.C14878a.d) r12     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    oE.g$b r4 = oE.C14884g.b.EVENTS     // Catch:{ RuntimeException -> 0x004f }
                    r1.k(r4, r12)     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    oE.g$b r4 = oE.C14884g.b.PEOPLE     // Catch:{ RuntimeException -> 0x004f }
                    r1.k(r4, r12)     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    oE.g$b r4 = oE.C14884g.b.GROUPS     // Catch:{ RuntimeException -> 0x004f }
                    r1.k(r4, r12)     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    oE.g$b r4 = oE.C14884g.b.ANONYMOUS_PEOPLE     // Catch:{ RuntimeException -> 0x004f }
                    r1.k(r4, r12)     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x0175
                L_0x025f:
                    r4 = 5
                    if (r1 != r4) goto L_0x029d
                    java.lang.String r12 = "MixpanelAPI.Messages"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r1.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r4 = "Worker received a hard kill. Dumping all events and force-killing. Thread id "
                    r1.append(r4)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x004f }
                    long r6 = r4.getId()     // Catch:{ RuntimeException -> 0x004f }
                    r1.append(r6)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x004f }
                    pE.C14918c.k(r12, r1)     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$i r12 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.Object r12 = r12.f130008a     // Catch:{ RuntimeException -> 0x004f }
                    monitor-enter(r12)     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r1 = r11.f130015a     // Catch:{ all -> 0x029a }
                    r1.p()     // Catch:{ all -> 0x029a }
                    oE.a$i r1 = oE.C14878a.i.this     // Catch:{ all -> 0x029a }
                    android.os.Handler unused = r1.f130009b = r0     // Catch:{ all -> 0x029a }
                    android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x029a }
                    r1.quit()     // Catch:{ all -> 0x029a }
                    monitor-exit(r12)     // Catch:{ all -> 0x029a }
                    goto L_0x02b3
                L_0x029a:
                    r1 = move-exception
                    monitor-exit(r12)     // Catch:{ all -> 0x029a }
                    throw r1     // Catch:{ RuntimeException -> 0x004f }
                L_0x029d:
                    java.lang.String r1 = "MixpanelAPI.Messages"
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r4.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r6 = "Unexpected message received by Mixpanel worker: "
                    r4.append(r6)     // Catch:{ RuntimeException -> 0x004f }
                    r4.append(r12)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r12 = r4.toString()     // Catch:{ RuntimeException -> 0x004f }
                    pE.C14918c.c(r1, r12)     // Catch:{ RuntimeException -> 0x004f }
                L_0x02b3:
                    r4 = r5
                    r5 = r0
                L_0x02b5:
                    oE.a$i r12 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r12 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.f r12 = r12.f129999c     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    if (r4 >= r12) goto L_0x02c4
                    r12 = -2
                    if (r4 != r12) goto L_0x031d
                L_0x02c4:
                    int r12 = r11.f130020f     // Catch:{ RuntimeException -> 0x004f }
                    if (r12 > 0) goto L_0x031d
                    if (r5 == 0) goto L_0x031d
                    oE.a$i r12 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r12 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r1.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r2 = "Flushing queue due to bulk upload limit ("
                    r1.append(r2)     // Catch:{ RuntimeException -> 0x004f }
                    r1.append(r4)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r2 = ") for project "
                    r1.append(r2)     // Catch:{ RuntimeException -> 0x004f }
                    r1.append(r5)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x004f }
                    r12.k(r1)     // Catch:{ RuntimeException -> 0x004f }
                    oE.a$i r12 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    r12.h()     // Catch:{ RuntimeException -> 0x004f }
                    oE.g r12 = r11.f130015a     // Catch:{ RuntimeException -> 0x004f }
                    r11.d(r12, r5)     // Catch:{ RuntimeException -> 0x004f }
                    long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x004f }
                    long r3 = r11.f130018d     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r12 < 0) goto L_0x038c
                    oE.c r12 = r11.f130016b     // Catch:{ a -> 0x030d }
                    oE.a$i r1 = oE.C14878a.i.this     // Catch:{ a -> 0x030d }
                    oE.a r1 = oE.C14878a.this     // Catch:{ a -> 0x030d }
                    pE.e r1 = r1.i()     // Catch:{ a -> 0x030d }
                    r12.g(r5, r1)     // Catch:{ a -> 0x030d }
                    goto L_0x038c
                L_0x030d:
                    r12 = move-exception
                    long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12.a()     // Catch:{ RuntimeException -> 0x004f }
                    int r12 = r12 * 1000
                    long r3 = (long) r12     // Catch:{ RuntimeException -> 0x004f }
                    long r1 = r1 + r3
                    r11.f130018d = r1     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x038c
                L_0x031d:
                    if (r4 <= 0) goto L_0x038c
                    boolean r12 = r11.hasMessages(r2, r5)     // Catch:{ RuntimeException -> 0x004f }
                    if (r12 != 0) goto L_0x038c
                    oE.a$i r12 = oE.C14878a.i.this     // Catch:{ RuntimeException -> 0x004f }
                    oE.a r12 = oE.C14878a.this     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x004f }
                    r1.<init>()     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r6 = "Queue depth "
                    r1.append(r6)     // Catch:{ RuntimeException -> 0x004f }
                    r1.append(r4)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r4 = " - Adding flush in "
                    r1.append(r4)     // Catch:{ RuntimeException -> 0x004f }
                    long r6 = r11.f130017c     // Catch:{ RuntimeException -> 0x004f }
                    r1.append(r6)     // Catch:{ RuntimeException -> 0x004f }
                    java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x004f }
                    r12.k(r1)     // Catch:{ RuntimeException -> 0x004f }
                    long r6 = r11.f130017c     // Catch:{ RuntimeException -> 0x004f }
                    r8 = 0
                    int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r12 < 0) goto L_0x038c
                    android.os.Message r12 = android.os.Message.obtain()     // Catch:{ RuntimeException -> 0x004f }
                    r12.what = r2     // Catch:{ RuntimeException -> 0x004f }
                    r12.obj = r5     // Catch:{ RuntimeException -> 0x004f }
                    r12.arg1 = r3     // Catch:{ RuntimeException -> 0x004f }
                    long r1 = r11.f130017c     // Catch:{ RuntimeException -> 0x004f }
                    r11.sendMessageDelayed(r12, r1)     // Catch:{ RuntimeException -> 0x004f }
                    goto L_0x038c
                L_0x035f:
                    java.lang.String r1 = "MixpanelAPI.Messages"
                    java.lang.String r2 = "Worker threw an unhandled exception"
                    pE.C14918c.d(r1, r2, r12)
                    oE.a$i r1 = oE.C14878a.i.this
                    java.lang.Object r1 = r1.f130008a
                    monitor-enter(r1)
                    oE.a$i r2 = oE.C14878a.i.this     // Catch:{ all -> 0x0381 }
                    android.os.Handler unused = r2.f130009b = r0     // Catch:{ all -> 0x0381 }
                    android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x0383 }
                    r0.quit()     // Catch:{ Exception -> 0x0383 }
                    java.lang.String r0 = "MixpanelAPI.Messages"
                    java.lang.String r2 = "Mixpanel will not process any more analytics messages"
                    pE.C14918c.d(r0, r2, r12)     // Catch:{ Exception -> 0x0383 }
                    goto L_0x038b
                L_0x0381:
                    r12 = move-exception
                    goto L_0x038d
                L_0x0383:
                    r12 = move-exception
                    java.lang.String r0 = "MixpanelAPI.Messages"
                    java.lang.String r2 = "Could not halt looper"
                    pE.C14918c.d(r0, r2, r12)     // Catch:{ all -> 0x0381 }
                L_0x038b:
                    monitor-exit(r1)     // Catch:{ all -> 0x0381 }
                L_0x038c:
                    return
                L_0x038d:
                    monitor-exit(r1)     // Catch:{ all -> 0x0381 }
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: oE.C14878a.i.C3203a.handleMessage(android.os.Message):void");
            }
        }

        public i() {
        }

        /* access modifiers changed from: private */
        public void h() {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f130010c;
            long j11 = 1 + j10;
            long j12 = this.f130012e;
            if (j12 > 0) {
                long j13 = ((currentTimeMillis - j12) + (this.f130011d * j10)) / j11;
                this.f130011d = j13;
                C14878a aVar = C14878a.this;
                aVar.k("Average send frequency approximately " + (j13 / 1000) + " seconds.");
            }
            this.f130012e = currentTimeMillis;
            this.f130010c = j11;
        }

        /* access modifiers changed from: protected */
        public Handler f() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            return new C3203a(handlerThread.getLooper());
        }

        public void g(Message message) {
            synchronized (this.f130008a) {
                try {
                    Handler handler = this.f130009b;
                    if (handler == null) {
                        C14878a aVar = C14878a.this;
                        aVar.k("Dead mixpanel worker dropping a message: " + message.what);
                    } else {
                        handler.sendMessage(message);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    C14878a(Context context) {
        this.f129998b = context;
        this.f129999c = g(context);
        i().c();
    }

    public static C14878a h(Context context) {
        C14878a aVar;
        Map<Context, C14878a> map = f129996d;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (!map.containsKey(applicationContext)) {
                    aVar = new C14878a(applicationContext);
                    map.put(applicationContext, aVar);
                } else {
                    aVar = map.get(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public void k(String str) {
        C14918c.i("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")");
    }

    /* access modifiers changed from: private */
    public void l(String str, Throwable th2) {
        C14918c.j("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")", th2);
    }

    public void c(d dVar) {
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.obj = dVar;
        this.f129997a.g(obtain);
    }

    /* access modifiers changed from: protected */
    public i d() {
        return new i();
    }

    public void e(d dVar) {
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.obj = dVar;
        this.f129997a.g(obtain);
    }

    public void f(C3202a aVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = aVar;
        this.f129997a.g(obtain);
    }

    /* access modifiers changed from: protected */
    public C14883f g(Context context) {
        return C14883f.m(context);
    }

    /* access modifiers changed from: protected */
    public C14920e i() {
        return new C14917b();
    }

    public void j(C14881d dVar) {
        Message obtain = Message.obtain();
        obtain.what = 12;
        obtain.obj = dVar;
        this.f129997a.g(obtain);
    }

    /* access modifiers changed from: protected */
    public C14884g m(Context context) {
        return C14884g.s(context);
    }

    public void n(f fVar) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = fVar;
        this.f129997a.g(obtain);
    }

    public void o(b bVar) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = bVar.a();
        obtain.arg1 = bVar.b() ? 1 : 0;
        this.f129997a.g(obtain);
    }

    public void p(g gVar) {
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = gVar;
        this.f129997a.g(obtain);
    }
}
