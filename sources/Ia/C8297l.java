package ia;

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

/* renamed from: ia.l  reason: case insensitive filesystem */
final class C8297l implements C9704e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f53670f = Charset.forName(Constants.ENCODING);

    /* renamed from: g  reason: collision with root package name */
    private static final C9702c f53671g;

    /* renamed from: h  reason: collision with root package name */
    private static final C9702c f53672h;

    /* renamed from: i  reason: collision with root package name */
    private static final C9703d f53673i = C8290k.f53645a;

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f53674a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f53675b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f53676c;

    /* renamed from: d  reason: collision with root package name */
    private final C9703d f53677d;

    /* renamed from: e  reason: collision with root package name */
    private final C8325p f53678e = new C8325p(this);

    static {
        C9702c.b a10 = C9702c.a("key");
        C8255f fVar = new C8255f();
        fVar.a(1);
        f53671g = a10.b(fVar.b()).a();
        C9702c.b a11 = C9702c.a("value");
        C8255f fVar2 = new C8255f();
        fVar2.a(2);
        f53672h = a11.b(fVar2.b()).a();
    }

    C8297l(OutputStream outputStream, Map map, Map map2, C9703d dVar) {
        this.f53674a = outputStream;
        this.f53675b = map;
        this.f53676c = map2;
        this.f53677d = dVar;
    }

    static /* synthetic */ void l(Map.Entry entry, C9704e eVar) {
        eVar.b(f53671g, entry.getKey());
        eVar.b(f53672h, entry.getValue());
    }

    private static int m(C9702c cVar) {
        C8283j jVar = (C8283j) cVar.c(C8283j.class);
        if (jVar != null) {
            return jVar.zza();
        }
        throw new C9701b("Field has no @Protobuf config");
    }

    private final long n(C9703d dVar, Object obj) {
        OutputStream outputStream;
        Class<Throwable> cls = Throwable.class;
        C8262g gVar = new C8262g();
        try {
            outputStream = this.f53674a;
            this.f53674a = gVar;
            dVar.a(obj, this);
            this.f53674a = outputStream;
            long c10 = gVar.c();
            gVar.close();
            return c10;
        } catch (Throwable th2) {
            try {
                cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    private static C8283j o(C9702c cVar) {
        C8283j jVar = (C8283j) cVar.c(C8283j.class);
        if (jVar != null) {
            return jVar;
        }
        throw new C9701b("Field has no @Protobuf config");
    }

    private final C8297l p(C9703d dVar, C9702c cVar, Object obj, boolean z10) {
        long n10 = n(dVar, obj);
        if (z10 && n10 == 0) {
            return this;
        }
        s((m(cVar) << 3) | 2);
        t(n10);
        dVar.a(obj, this);
        return this;
    }

    private final C8297l q(C9705f fVar, C9702c cVar, Object obj, boolean z10) {
        this.f53678e.b(cVar, z10);
        fVar.a(obj, this.f53678e);
        return this;
    }

    private static ByteBuffer r(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void s(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f53674a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f53674a.write(i10 & 127);
    }

    private final void t(long j10) {
        while ((-128 & j10) != 0) {
            this.f53674a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f53674a.write(((int) j10) & 127);
    }

    /* access modifiers changed from: package-private */
    public final C9704e a(C9702c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        s((m(cVar) << 3) | 1);
        this.f53674a.write(r(8).putDouble(d10).array());
        return this;
    }

    public final C9704e b(C9702c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final C9704e c(C9702c cVar, double d10) {
        a(cVar, d10, true);
        return this;
    }

    public final /* synthetic */ C9704e d(C9702c cVar, int i10) {
        i(cVar, i10, true);
        return this;
    }

    public final /* synthetic */ C9704e e(C9702c cVar, long j10) {
        j(cVar, j10, true);
        return this;
    }

    public final /* synthetic */ C9704e f(C9702c cVar, boolean z10) {
        i(cVar, z10 ? 1 : 0, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C9704e g(C9702c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        s((m(cVar) << 3) | 5);
        this.f53674a.write(r(4).putFloat(f10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C9704e h(C9702c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            s((m(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f53670f);
            s(bytes.length);
            this.f53674a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object h10 : (Collection) obj) {
                h(cVar, h10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry p10 : ((Map) obj).entrySet()) {
                p(f53673i, cVar, p10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            a(cVar, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            g(cVar, ((Float) obj).floatValue(), z10);
            return this;
        } else if (obj instanceof Number) {
            j(cVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            i(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            s((m(cVar) << 3) | 2);
            s(bArr.length);
            this.f53674a.write(bArr);
            return this;
        } else {
            C9703d dVar = (C9703d) this.f53675b.get(obj.getClass());
            if (dVar != null) {
                p(dVar, cVar, obj, z10);
                return this;
            }
            C9705f fVar = (C9705f) this.f53676c.get(obj.getClass());
            if (fVar != null) {
                q(fVar, cVar, obj, z10);
                return this;
            } else if (obj instanceof C8269h) {
                i(cVar, ((C8269h) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                i(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                p(this.f53677d, cVar, obj, z10);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final C8297l i(C9702c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        C8283j o10 = o(cVar);
        C8276i iVar = C8276i.DEFAULT;
        int ordinal = o10.zzb().ordinal();
        if (ordinal == 0) {
            s(o10.zza() << 3);
            s(i10);
        } else if (ordinal == 1) {
            s(o10.zza() << 3);
            s((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            s((o10.zza() << 3) | 5);
            this.f53674a.write(r(4).putInt(i10).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C8297l j(C9702c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        C8283j o10 = o(cVar);
        C8276i iVar = C8276i.DEFAULT;
        int ordinal = o10.zzb().ordinal();
        if (ordinal == 0) {
            s(o10.zza() << 3);
            t(j10);
        } else if (ordinal == 1) {
            s(o10.zza() << 3);
            t((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            s((o10.zza() << 3) | 1);
            this.f53674a.write(r(8).putLong(j10).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final C8297l k(Object obj) {
        if (obj == null) {
            return this;
        }
        C9703d dVar = (C9703d) this.f53675b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new C9701b("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
