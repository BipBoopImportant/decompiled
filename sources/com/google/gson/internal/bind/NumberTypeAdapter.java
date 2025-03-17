package com.google.gson.internal.bind;

import Tc.b;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;

public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b  reason: collision with root package name */
    private static final v f68975b = b(t.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    private final u f68976a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68978a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                Tc.b[] r0 = Tc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f68978a = r0
                Tc.b r1 = Tc.b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f68978a     // Catch:{ NoSuchFieldError -> 0x001d }
                Tc.b r1 = Tc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f68978a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Tc.b r1 = Tc.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.NumberTypeAdapter.a.<clinit>():void");
        }
    }

    private NumberTypeAdapter(u uVar) {
        this.f68976a = uVar;
    }

    public static v a(u uVar) {
        return uVar == t.LAZILY_PARSED_NUMBER ? f68975b : b(uVar);
    }

    private static v b(u uVar) {
        return new v() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* renamed from: c */
    public Number read(Tc.a aVar) {
        b F10 = aVar.F();
        int i10 = a.f68978a[F10.ordinal()];
        if (i10 == 1) {
            aVar.x();
            return null;
        } else if (i10 == 2 || i10 == 3) {
            return this.f68976a.a(aVar);
        } else {
            throw new p("Expecting number, got: " + F10 + "; at path " + aVar.m());
        }
    }

    /* renamed from: d */
    public void write(c cVar, Number number) {
        cVar.j0(number);
    }
}
