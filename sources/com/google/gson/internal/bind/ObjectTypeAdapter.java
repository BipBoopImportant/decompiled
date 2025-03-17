package com.google.gson.internal.bind;

import Tc.b;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.reflect.TypeToken;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c  reason: collision with root package name */
    private static final v f68979c = b(t.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    private final Gson f68980a;

    /* renamed from: b  reason: collision with root package name */
    private final u f68981b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68983a;

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
                f68983a = r0
                Tc.b r1 = Tc.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f68983a     // Catch:{ NoSuchFieldError -> 0x001d }
                Tc.b r1 = Tc.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f68983a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Tc.b r1 = Tc.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f68983a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Tc.b r1 = Tc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f68983a     // Catch:{ NoSuchFieldError -> 0x003e }
                Tc.b r1 = Tc.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f68983a     // Catch:{ NoSuchFieldError -> 0x0049 }
                Tc.b r1 = Tc.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ObjectTypeAdapter.a.<clinit>():void");
        }
    }

    public static v a(u uVar) {
        return uVar == t.DOUBLE ? f68979c : b(uVar);
    }

    private static v b(final u uVar) {
        return new v() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, u.this);
                }
                return null;
            }
        };
    }

    private Object c(Tc.a aVar, b bVar) {
        int i10 = a.f68983a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.C1();
        }
        if (i10 == 4) {
            return this.f68981b.a(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.w1());
        }
        if (i10 == 6) {
            aVar.x();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object d(Tc.a aVar, b bVar) {
        int i10 = a.f68983a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.d();
            return new ArrayList();
        } else if (i10 != 2) {
            return null;
        } else {
            aVar.e();
            return new g();
        }
    }

    public Object read(Tc.a aVar) {
        b F10 = aVar.F();
        Object d10 = d(aVar, F10);
        if (d10 == null) {
            return c(aVar, F10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String B02 = d10 instanceof Map ? aVar.B0() : null;
                b F11 = aVar.F();
                Object d11 = d(aVar, F11);
                boolean z10 = d11 != null;
                if (d11 == null) {
                    d11 = c(aVar, F11);
                }
                if (d10 instanceof List) {
                    ((List) d10).add(d11);
                } else {
                    ((Map) d10).put(B02, d11);
                }
                if (z10) {
                    arrayDeque.addLast(d10);
                    d10 = d11;
                }
            } else {
                if (d10 instanceof List) {
                    aVar.i();
                } else {
                    aVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return d10;
                }
                d10 = arrayDeque.removeLast();
            }
        }
    }

    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.v();
            return;
        }
        TypeAdapter<?> q10 = this.f68980a.q(obj.getClass());
        if (q10 instanceof ObjectTypeAdapter) {
            cVar.f();
            cVar.i();
            return;
        }
        q10.write(cVar, obj);
    }

    private ObjectTypeAdapter(Gson gson, u uVar) {
        this.f68980a = gson;
        this.f68981b = uVar;
    }
}
