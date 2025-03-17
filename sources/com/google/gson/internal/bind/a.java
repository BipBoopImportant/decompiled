package com.google.gson.internal.bind;

import Tc.d;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.k;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class a extends Tc.a {

    /* renamed from: t  reason: collision with root package name */
    private static final Reader f69096t = new C1186a();

    /* renamed from: u  reason: collision with root package name */
    private static final Object f69097u = new Object();

    /* renamed from: p  reason: collision with root package name */
    private Object[] f69098p = new Object[32];

    /* renamed from: q  reason: collision with root package name */
    private int f69099q = 0;

    /* renamed from: r  reason: collision with root package name */
    private String[] f69100r = new String[32];

    /* renamed from: s  reason: collision with root package name */
    private int[] f69101s = new int[32];

    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    class C1186a extends Reader {
        C1186a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f69102a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Tc.b[] r0 = Tc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69102a = r0
                Tc.b r1 = Tc.b.NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f69102a     // Catch:{ NoSuchFieldError -> 0x001d }
                Tc.b r1 = Tc.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f69102a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Tc.b r1 = Tc.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f69102a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Tc.b r1 = Tc.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.a.b.<clinit>():void");
        }
    }

    public a(JsonElement jsonElement) {
        super(f69096t);
        N0(jsonElement);
    }

    private String E0(boolean z10) {
        t0(Tc.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) F0()).next();
        String str = (String) entry.getKey();
        this.f69100r[this.f69099q - 1] = z10 ? "<skipped>" : str;
        N0(entry.getValue());
        return str;
    }

    private Object F0() {
        return this.f69098p[this.f69099q - 1];
    }

    private Object I0() {
        Object[] objArr = this.f69098p;
        int i10 = this.f69099q - 1;
        this.f69099q = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void N0(Object obj) {
        int i10 = this.f69099q;
        Object[] objArr = this.f69098p;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f69098p = Arrays.copyOf(objArr, i11);
            this.f69101s = Arrays.copyOf(this.f69101s, i11);
            this.f69100r = (String[]) Arrays.copyOf(this.f69100r, i11);
        }
        Object[] objArr2 = this.f69098p;
        int i12 = this.f69099q;
        this.f69099q = i12 + 1;
        objArr2[i12] = obj;
    }

    private String o(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f69099q;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f69098p;
            Object obj = objArr[i10];
            if (obj instanceof JsonArray) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f69101s[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f69100r[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private void t0(Tc.b bVar) {
        if (F() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + F() + v());
        }
    }

    private String v() {
        return " at path " + m();
    }

    /* access modifiers changed from: package-private */
    public JsonElement A0() {
        Tc.b F10 = F();
        if (F10 == Tc.b.NAME || F10 == Tc.b.END_ARRAY || F10 == Tc.b.END_OBJECT || F10 == Tc.b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + F10 + " when reading a JsonElement.");
        }
        JsonElement jsonElement = (JsonElement) F0();
        a0();
        return jsonElement;
    }

    public String B0() {
        return E0(false);
    }

    public String C1() {
        Tc.b F10 = F();
        Tc.b bVar = Tc.b.STRING;
        if (F10 == bVar || F10 == Tc.b.NUMBER) {
            String asString = ((JsonPrimitive) I0()).getAsString();
            int i10 = this.f69099q;
            if (i10 > 0) {
                int[] iArr = this.f69101s;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F10 + v());
    }

    public Tc.b F() {
        if (this.f69099q == 0) {
            return Tc.b.END_DOCUMENT;
        }
        Object F02 = F0();
        if (F02 instanceof Iterator) {
            boolean z10 = this.f69098p[this.f69099q - 2] instanceof JsonObject;
            Iterator it = (Iterator) F02;
            if (!it.hasNext()) {
                return z10 ? Tc.b.END_OBJECT : Tc.b.END_ARRAY;
            }
            if (z10) {
                return Tc.b.NAME;
            }
            N0(it.next());
            return F();
        } else if (F02 instanceof JsonObject) {
            return Tc.b.BEGIN_OBJECT;
        } else {
            if (F02 instanceof JsonArray) {
                return Tc.b.BEGIN_ARRAY;
            }
            if (F02 instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) F02;
                if (jsonPrimitive.isString()) {
                    return Tc.b.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return Tc.b.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return Tc.b.NUMBER;
                }
                throw new AssertionError();
            } else if (F02 instanceof k) {
                return Tc.b.NULL;
            } else {
                if (F02 == f69097u) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new d("Custom JsonElement subclass " + F02.getClass().getName() + " is not supported");
            }
        }
    }

    public int G0() {
        Tc.b F10 = F();
        Tc.b bVar = Tc.b.NUMBER;
        if (F10 == bVar || F10 == Tc.b.STRING) {
            int asInt = ((JsonPrimitive) F0()).getAsInt();
            I0();
            int i10 = this.f69099q;
            if (i10 > 0) {
                int[] iArr = this.f69101s;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return asInt;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F10 + v());
    }

    public void K0() {
        t0(Tc.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) F0()).next();
        N0(entry.getValue());
        N0(new JsonPrimitive((String) entry.getKey()));
    }

    public long U2() {
        Tc.b F10 = F();
        Tc.b bVar = Tc.b.NUMBER;
        if (F10 == bVar || F10 == Tc.b.STRING) {
            long asLong = ((JsonPrimitive) F0()).getAsLong();
            I0();
            int i10 = this.f69099q;
            if (i10 > 0) {
                int[] iArr = this.f69101s;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return asLong;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F10 + v());
    }

    public void a0() {
        int i10 = b.f69102a[F().ordinal()];
        if (i10 == 1) {
            E0(true);
        } else if (i10 == 2) {
            i();
        } else if (i10 == 3) {
            l();
        } else if (i10 != 4) {
            I0();
            int i11 = this.f69099q;
            if (i11 > 0) {
                int[] iArr = this.f69101s;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    public void close() {
        this.f69098p = new Object[]{f69097u};
        this.f69099q = 1;
    }

    public void d() {
        t0(Tc.b.BEGIN_ARRAY);
        N0(((JsonArray) F0()).iterator());
        this.f69101s[this.f69099q - 1] = 0;
    }

    public double d2() {
        Tc.b F10 = F();
        Tc.b bVar = Tc.b.NUMBER;
        if (F10 == bVar || F10 == Tc.b.STRING) {
            double asDouble = ((JsonPrimitive) F0()).getAsDouble();
            if (t() || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                I0();
                int i10 = this.f69099q;
                if (i10 > 0) {
                    int[] iArr = this.f69101s;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return asDouble;
            }
            throw new d("JSON forbids NaN and infinities: " + asDouble);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F10 + v());
    }

    public void e() {
        t0(Tc.b.BEGIN_OBJECT);
        N0(((JsonObject) F0()).entrySet().iterator());
    }

    public boolean hasNext() {
        Tc.b F10 = F();
        return (F10 == Tc.b.END_OBJECT || F10 == Tc.b.END_ARRAY || F10 == Tc.b.END_DOCUMENT) ? false : true;
    }

    public void i() {
        t0(Tc.b.END_ARRAY);
        I0();
        I0();
        int i10 = this.f69099q;
        if (i10 > 0) {
            int[] iArr = this.f69101s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void l() {
        t0(Tc.b.END_OBJECT);
        this.f69100r[this.f69099q - 1] = null;
        I0();
        I0();
        int i10 = this.f69099q;
        if (i10 > 0) {
            int[] iArr = this.f69101s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String m() {
        return o(false);
    }

    public String q() {
        return o(true);
    }

    public String toString() {
        return a.class.getSimpleName() + v();
    }

    public boolean w1() {
        t0(Tc.b.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) I0()).getAsBoolean();
        int i10 = this.f69099q;
        if (i10 > 0) {
            int[] iArr = this.f69101s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asBoolean;
    }

    public void x() {
        t0(Tc.b.NULL);
        I0();
        int i10 = this.f69099q;
        if (i10 > 0) {
            int[] iArr = this.f69101s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }
}
