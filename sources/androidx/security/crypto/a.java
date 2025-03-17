package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import j0.C5446b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import qb.C10156a;
import qb.C10160e;
import qb.C10167l;
import qb.C10168m;
import qb.C10169n;
import rb.C10203a;
import wb.C10350b;
import xb.C10379a;

public final class a implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f44452a;

    /* renamed from: b  reason: collision with root package name */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f44453b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final String f44454c;

    /* renamed from: d  reason: collision with root package name */
    final String f44455d;

    /* renamed from: e  reason: collision with root package name */
    final C10156a f44456e;

    /* renamed from: f  reason: collision with root package name */
    final C10160e f44457f;

    /* renamed from: androidx.security.crypto.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0764a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f44458a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.security.crypto.a$c[] r0 = androidx.security.crypto.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44458a = r0
                androidx.security.crypto.a$c r1 = androidx.security.crypto.a.c.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44458a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.security.crypto.a$c r1 = androidx.security.crypto.a.c.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44458a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.security.crypto.a$c r1 = androidx.security.crypto.a.c.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44458a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.security.crypto.a$c r1 = androidx.security.crypto.a.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44458a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.security.crypto.a$c r1 = androidx.security.crypto.a.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f44458a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.security.crypto.a$c r1 = androidx.security.crypto.a.c.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.security.crypto.a.C0764a.<clinit>():void");
        }
    }

    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        private final a f44459a;

        /* renamed from: b  reason: collision with root package name */
        private final SharedPreferences.Editor f44460b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f44461c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicBoolean f44462d = new AtomicBoolean(false);

        b(a aVar, SharedPreferences.Editor editor) {
            this.f44459a = aVar;
            this.f44460b = editor;
            this.f44461c = new CopyOnWriteArrayList();
        }

        private void a() {
            if (this.f44462d.getAndSet(false)) {
                for (String next : this.f44459a.getAll().keySet()) {
                    if (!this.f44461c.contains(next) && !this.f44459a.g(next)) {
                        this.f44460b.remove(this.f44459a.d(next));
                    }
                }
            }
        }

        private void b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f44459a.f44453b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                for (String onSharedPreferenceChanged : this.f44461c) {
                    next.onSharedPreferenceChanged(this.f44459a, onSharedPreferenceChanged);
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (!this.f44459a.g(str)) {
                this.f44461c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> e10 = this.f44459a.e(str, bArr);
                    this.f44460b.putString((String) e10.first, (String) e10.second);
                } catch (GeneralSecurityException e11) {
                    throw new SecurityException("Could not encrypt data: " + e11.getMessage(), e11);
                }
            } else {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
        }

        public void apply() {
            a();
            this.f44460b.apply();
            b();
            this.f44461c.clear();
        }

        public SharedPreferences.Editor clear() {
            this.f44462d.set(true);
            return this;
        }

        public boolean commit() {
            a();
            try {
                return this.f44460b.commit();
            } finally {
                b();
                this.f44461c.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.j());
            allocate.put(z10 ? (byte) 1 : 0);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.j());
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.j());
            allocate.putInt(i10);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.j());
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.j());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C5446b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList<>(set.size());
            int size = set.size() * 4;
            for (String bytes : set) {
                byte[] bytes2 = bytes.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes2);
                size += bytes2.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.j());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            if (!this.f44459a.g(str)) {
                this.f44460b.remove(this.f44459a.d(str));
                this.f44461c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    private enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        private c(int i10) {
            this.mId = i10;
        }

        public static c b(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int j() {
            return this.mId;
        }
    }

    public enum d {
        AES256_SIV("AES256_SIV");
        
        private final String mDeterministicAeadKeyTemplateName;

        private d(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        /* access modifiers changed from: package-private */
        public C10167l b() {
            return C10168m.a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    public enum e {
        AES256_GCM("AES256_GCM");
        
        private final String mAeadKeyTemplateName;

        private e(String str) {
            this.mAeadKeyTemplateName = str;
        }

        /* access modifiers changed from: package-private */
        public C10167l b() {
            return C10168m.a(this.mAeadKeyTemplateName);
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, C10156a aVar, C10160e eVar) {
        this.f44454c = str;
        this.f44452a = sharedPreferences;
        this.f44455d = str2;
        this.f44456e = aVar;
        this.f44457f = eVar;
    }

    public static SharedPreferences a(Context context, String str, b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        C10350b.a();
        C10203a.b();
        Context applicationContext = context.getApplicationContext();
        C10379a.b n10 = new C10379a.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        C10169n d10 = n10.m("android-keystore://" + str2).f().d();
        C10379a.b n11 = new C10379a.b().l(eVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        C10156a aVar = (C10156a) n11.m("android-keystore://" + str2).f().d().k(C10156a.class);
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), aVar, (C10160e) d10.k(C10160e.class));
    }

    private Object f(String str) {
        if (!g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String d10 = d(str);
                String string = this.f44452a.getString(d10, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z10 = false;
                byte[] a10 = Db.e.a(string, 0);
                C10156a aVar = this.f44456e;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a10, d10.getBytes(charset)));
                wrap.position(0);
                int i10 = wrap.getInt();
                c b10 = c.b(i10);
                if (b10 != null) {
                    switch (C0764a.f44458a[b10.ordinal()]) {
                        case 1:
                            int i11 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i11);
                            String charBuffer = charset.decode(slice).toString();
                            if (charBuffer.equals("__NULL__")) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            if (wrap.get() != 0) {
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                        case 6:
                            C5446b bVar = new C5446b();
                            while (wrap.hasRemaining()) {
                                int i12 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i12);
                                wrap.position(wrap.position() + i12);
                                bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (bVar.size() != 1 || !"__NULL__".equals(bVar.x(0))) {
                                return bVar;
                            }
                            return null;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + b10);
                    }
                } else {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
                }
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
            }
        } else {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* access modifiers changed from: package-private */
    public String c(String str) {
        try {
            String str2 = new String(this.f44457f.b(Db.e.a(str, 0), this.f44454c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    public boolean contains(String str) {
        if (!g(str)) {
            return this.f44452a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* access modifiers changed from: package-private */
    public String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Db.e.d(this.f44457f.a(str.getBytes(StandardCharsets.UTF_8), this.f44454c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public Pair<String, String> e(String str, byte[] bArr) {
        String d10 = d(str);
        return new Pair<>(d10, Db.e.d(this.f44456e.a(bArr, d10.getBytes(StandardCharsets.UTF_8))));
    }

    public SharedPreferences.Editor edit() {
        return new b(this, this.f44452a.edit());
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f44452a.getAll().entrySet()) {
            if (!g((String) next.getKey())) {
                String c10 = c((String) next.getKey());
                hashMap.put(c10, f(c10));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z10) {
        Object f10 = f(str);
        return f10 instanceof Boolean ? ((Boolean) f10).booleanValue() : z10;
    }

    public float getFloat(String str, float f10) {
        Object f11 = f(str);
        return f11 instanceof Float ? ((Float) f11).floatValue() : f10;
    }

    public int getInt(String str, int i10) {
        Object f10 = f(str);
        return f10 instanceof Integer ? ((Integer) f10).intValue() : i10;
    }

    public long getLong(String str, long j10) {
        Object f10 = f(str);
        return f10 instanceof Long ? ((Long) f10).longValue() : j10;
    }

    public String getString(String str, String str2) {
        Object f10 = f(str);
        return f10 instanceof String ? (String) f10 : str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Object f10 = f(str);
        Set<String> bVar = f10 instanceof Set ? (Set) f10 : new C5446b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f44453b.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f44453b.remove(onSharedPreferenceChangeListener);
    }
}
