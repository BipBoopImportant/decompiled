package ic;

import com.adjust.sdk.Constants;
import fc.C9701b;
import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import fc.C9705f;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: ic.f  reason: case insensitive filesystem */
final class C9838f implements C9704e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f74241f = Charset.forName(Constants.ENCODING);

    /* renamed from: g  reason: collision with root package name */
    private static final C9702c f74242g = C9702c.a("key").b(C9833a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final C9702c f74243h = C9702c.a("value").b(C9833a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final C9703d<Map.Entry<Object, Object>> f74244i = new C9837e();

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f74245a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, C9703d<?>> f74246b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, C9705f<?>> f74247c;

    /* renamed from: d  reason: collision with root package name */
    private final C9703d<Object> f74248d;

    /* renamed from: e  reason: collision with root package name */
    private final C9841i f74249e = new C9841i(this);

    /* renamed from: ic.f$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f74250a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ic.d$a[] r0 = ic.C9836d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f74250a = r0
                ic.d$a r1 = ic.C9836d.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f74250a     // Catch:{ NoSuchFieldError -> 0x001d }
                ic.d$a r1 = ic.C9836d.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f74250a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ic.d$a r1 = ic.C9836d.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ic.C9838f.a.<clinit>():void");
        }
    }

    C9838f(OutputStream outputStream, Map<Class<?>, C9703d<?>> map, Map<Class<?>, C9705f<?>> map2, C9703d<Object> dVar) {
        this.f74245a = outputStream;
        this.f74246b = map;
        this.f74247c = map2;
        this.f74248d = dVar;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long q(C9703d<T> dVar, T t10) {
        OutputStream outputStream;
        C9834b bVar = new C9834b();
        try {
            outputStream = this.f74245a;
            this.f74245a = bVar;
            dVar.a(t10, this);
            this.f74245a = outputStream;
            long c10 = bVar.c();
            bVar.close();
            return c10;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private <T> C9838f r(C9703d<T> dVar, C9702c cVar, T t10, boolean z10) {
        long q10 = q(dVar, t10);
        if (z10 && q10 == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(q10);
        dVar.a(t10, this);
        return this;
    }

    private <T> C9838f s(C9705f<T> fVar, C9702c cVar, T t10, boolean z10) {
        this.f74249e.c(cVar, z10);
        fVar.a(t10, this.f74249e);
        return this;
    }

    private static C9836d u(C9702c cVar) {
        C9836d dVar = (C9836d) cVar.c(C9836d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new C9701b("Field has no @Protobuf config");
    }

    private static int v(C9702c cVar) {
        C9836d dVar = (C9836d) cVar.c(C9836d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new C9701b("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, C9704e eVar) {
        eVar.b(f74242g, entry.getKey());
        eVar.b(f74243h, entry.getValue());
    }

    private void x(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f74245a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f74245a.write(i10 & 127);
    }

    private void y(long j10) {
        while ((-128 & j10) != 0) {
            this.f74245a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f74245a.write(((int) j10) & 127);
    }

    public C9704e b(C9702c cVar, Object obj) {
        return i(cVar, obj, true);
    }

    public C9704e c(C9702c cVar, double d10) {
        return g(cVar, d10, true);
    }

    /* access modifiers changed from: package-private */
    public C9704e g(C9702c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f74245a.write(p(8).putDouble(d10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public C9704e h(C9702c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f74245a.write(p(4).putFloat(f10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public C9704e i(C9702c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f74241f);
            x(bytes.length);
            this.f74245a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object i10 : (Collection) obj) {
                i(cVar, i10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry r10 : ((Map) obj).entrySet()) {
                r(f74244i, cVar, r10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return g(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return h(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return m(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return o(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                x((v(cVar) << 3) | 2);
                x(bArr.length);
                this.f74245a.write(bArr);
                return this;
            }
            C9703d dVar = this.f74246b.get(obj.getClass());
            if (dVar != null) {
                return r(dVar, cVar, obj, z10);
            }
            C9705f fVar = this.f74247c.get(obj.getClass());
            return fVar != null ? s(fVar, cVar, obj, z10) : obj instanceof C9835c ? d(cVar, ((C9835c) obj).d()) : obj instanceof Enum ? d(cVar, ((Enum) obj).ordinal()) : r(this.f74248d, cVar, obj, z10);
        }
    }

    /* renamed from: j */
    public C9838f d(C9702c cVar, int i10) {
        return k(cVar, i10, true);
    }

    /* access modifiers changed from: package-private */
    public C9838f k(C9702c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        C9836d u10 = u(cVar);
        int i11 = a.f74250a[u10.intEncoding().ordinal()];
        if (i11 == 1) {
            x(u10.tag() << 3);
            x(i10);
        } else if (i11 == 2) {
            x(u10.tag() << 3);
            x((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            x((u10.tag() << 3) | 5);
            this.f74245a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    /* renamed from: l */
    public C9838f e(C9702c cVar, long j10) {
        return m(cVar, j10, true);
    }

    /* access modifiers changed from: package-private */
    public C9838f m(C9702c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        C9836d u10 = u(cVar);
        int i10 = a.f74250a[u10.intEncoding().ordinal()];
        if (i10 == 1) {
            x(u10.tag() << 3);
            y(j10);
        } else if (i10 == 2) {
            x(u10.tag() << 3);
            y((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            x((u10.tag() << 3) | 1);
            this.f74245a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    /* renamed from: n */
    public C9838f f(C9702c cVar, boolean z10) {
        return o(cVar, z10, true);
    }

    /* access modifiers changed from: package-private */
    public C9838f o(C9702c cVar, boolean z10, boolean z11) {
        return k(cVar, z10 ? 1 : 0, z11);
    }

    /* access modifiers changed from: package-private */
    public C9838f t(Object obj) {
        if (obj == null) {
            return this;
        }
        C9703d dVar = this.f74246b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new C9701b("No encoder for " + obj.getClass());
    }
}
