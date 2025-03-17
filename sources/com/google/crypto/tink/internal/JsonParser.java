package com.google.crypto.tink.internal;

import Tc.c;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.k;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;

public final class JsonParser {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonElementTypeAdapter f67843a = new JsonElementTypeAdapter((a) null);

    private static final class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
        private JsonElementTypeAdapter() {
        }

        private JsonElement b(Tc.a aVar, Tc.b bVar) {
            int i10 = a.f67844a[bVar.ordinal()];
            if (i10 == 3) {
                String C12 = aVar.C1();
                if (JsonParser.a(C12)) {
                    return new JsonPrimitive(C12);
                }
                throw new IOException("illegal characters in string");
            } else if (i10 == 4) {
                return new JsonPrimitive((Number) new b(aVar.C1()));
            } else {
                if (i10 == 5) {
                    return new JsonPrimitive(Boolean.valueOf(aVar.w1()));
                }
                if (i10 == 6) {
                    aVar.x();
                    return k.f69184a;
                }
                throw new IllegalStateException("Unexpected token: " + bVar);
            }
        }

        private JsonElement c(Tc.a aVar, Tc.b bVar) {
            int i10 = a.f67844a[bVar.ordinal()];
            if (i10 == 1) {
                aVar.d();
                return new JsonArray();
            } else if (i10 != 2) {
                return null;
            } else {
                aVar.e();
                return new JsonObject();
            }
        }

        /* renamed from: a */
        public JsonElement read(Tc.a aVar) {
            String str;
            Tc.b F10 = aVar.F();
            JsonElement c10 = c(aVar, F10);
            if (c10 == null) {
                return b(aVar, F10);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.hasNext()) {
                    if (c10 instanceof JsonObject) {
                        str = aVar.B0();
                        if (!JsonParser.a(str)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        str = null;
                    }
                    Tc.b F11 = aVar.F();
                    JsonElement c11 = c(aVar, F11);
                    boolean z10 = c11 != null;
                    if (c11 == null) {
                        c11 = b(aVar, F11);
                    }
                    if (c10 instanceof JsonArray) {
                        ((JsonArray) c10).add(c11);
                    } else {
                        JsonObject jsonObject = (JsonObject) c10;
                        if (!jsonObject.has(str)) {
                            jsonObject.add(str, c11);
                        } else {
                            throw new IOException("duplicate key: " + str);
                        }
                    }
                    if (z10) {
                        arrayDeque.addLast(c10);
                        if (arrayDeque.size() <= 100) {
                            c10 = c11;
                        } else {
                            throw new IOException("too many recursions");
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (c10 instanceof JsonArray) {
                        aVar.i();
                    } else {
                        aVar.l();
                    }
                    if (arrayDeque.isEmpty()) {
                        return c10;
                    }
                    c10 = (JsonElement) arrayDeque.removeLast();
                }
            }
        }

        /* renamed from: d */
        public void write(c cVar, JsonElement jsonElement) {
            throw new UnsupportedOperationException("write is not supported");
        }

        /* synthetic */ JsonElementTypeAdapter(a aVar) {
            this();
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f67844a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Tc.b[] r0 = Tc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f67844a = r0
                Tc.b r1 = Tc.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f67844a     // Catch:{ NoSuchFieldError -> 0x001d }
                Tc.b r1 = Tc.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f67844a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Tc.b r1 = Tc.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f67844a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Tc.b r1 = Tc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f67844a     // Catch:{ NoSuchFieldError -> 0x003e }
                Tc.b r1 = Tc.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f67844a     // Catch:{ NoSuchFieldError -> 0x0049 }
                Tc.b r1 = Tc.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.internal.JsonParser.a.<clinit>():void");
        }
    }

    private static final class b extends Number {

        /* renamed from: a  reason: collision with root package name */
        private final String f67845a;

        public b(String str) {
            this.f67845a = str;
        }

        public double doubleValue() {
            return Double.parseDouble(this.f67845a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f67845a.equals(((b) obj).f67845a);
            }
            return false;
        }

        public float floatValue() {
            return Float.parseFloat(this.f67845a);
        }

        public int hashCode() {
            return this.f67845a.hashCode();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            return (int) java.lang.Long.parseLong(r2.f67845a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            return new java.math.BigDecimal(r2.f67845a).intValue();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int intValue() {
            /*
                r2 = this;
                java.lang.String r0 = r2.f67845a     // Catch:{ NumberFormatException -> 0x0007 }
                int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
                return r0
            L_0x0007:
                java.lang.String r0 = r2.f67845a     // Catch:{ NumberFormatException -> 0x000f }
                long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
                int r0 = (int) r0
                return r0
            L_0x000f:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                java.lang.String r1 = r2.f67845a
                r0.<init>(r1)
                int r0 = r0.intValue()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.internal.JsonParser.b.intValue():int");
        }

        public long longValue() {
            try {
                return Long.parseLong(this.f67845a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f67845a).longValue();
            }
        }

        public String toString() {
            return this.f67845a;
        }
    }

    public static boolean a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char charAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(charAt)) {
                i10 = i11;
            } else if (Character.isLowSurrogate(charAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                return false;
            } else {
                i10 += 2;
            }
        }
        return true;
    }
}
