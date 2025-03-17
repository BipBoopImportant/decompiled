package L5;

import B5.h;
import E5.e;
import E5.g;
import I5.a;
import I5.b;
import L5.c;
import N5.m;
import N5.p;
import N5.q;
import O5.b;
import O5.c;
import O5.i;
import S5.j;
import S5.r;
import YH.X;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b \u0010\u0016J'\u0010#\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u00020\u0014*\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u0004\u0018\u000100*\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b+\u00101¨\u00063"}, d2 = {"LL5/d;", "", "LB5/h;", "imageLoader", "LN5/p;", "requestService", "LS5/r;", "logger", "<init>", "(LB5/h;LN5/p;LS5/r;)V", "LN5/h;", "request", "LL5/c$b;", "cacheKey", "LL5/c$c;", "cacheValue", "LO5/i;", "size", "LO5/h;", "scale", "", "e", "(LN5/h;LL5/c$b;LL5/c$c;LO5/i;LO5/h;)Z", "mappedData", "LN5/m;", "options", "LB5/c;", "eventListener", "f", "(LN5/h;Ljava/lang/Object;LN5/m;LB5/c;)LL5/c$b;", "a", "(LN5/h;LL5/c$b;LO5/i;LO5/h;)LL5/c$c;", "c", "LI5/a$b;", "result", "h", "(LL5/c$b;LN5/h;LI5/a$b;)Z", "LI5/b$a;", "chain", "LN5/q;", "g", "(LI5/b$a;LN5/h;LL5/c$b;LL5/c$c;)LN5/q;", "LB5/h;", "b", "LN5/p;", "d", "(LL5/c$c;)Z", "isSampled", "", "(LL5/c$c;)Ljava/lang/String;", "diskCacheKey", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f38284c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f38285a;

    /* renamed from: b  reason: collision with root package name */
    private final p f38286b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LL5/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(h hVar, p pVar, r rVar) {
        this.f38285a = hVar;
        this.f38286b = pVar;
    }

    private final String b(c.C0603c cVar) {
        Object obj = cVar.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(c.C0603c cVar) {
        Object obj = cVar.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean e(N5.h hVar, c.b bVar, c.C0603c cVar, i iVar, O5.h hVar2) {
        boolean d10 = d(cVar);
        if (b.a(iVar)) {
            return !d10;
        }
        String str = bVar.c().get("coil#transformation_size");
        if (str != null) {
            return C17542s.e(str, iVar.toString());
        }
        int width = cVar.a().getWidth();
        int height = cVar.a().getHeight();
        O5.c b10 = iVar.b();
        int i10 = Integer.MAX_VALUE;
        int i11 = b10 instanceof c.a ? ((c.a) b10).f39247a : Integer.MAX_VALUE;
        O5.c a10 = iVar.a();
        if (a10 instanceof c.a) {
            i10 = ((c.a) a10).f39247a;
        }
        double c10 = g.c(width, height, i11, i10, hVar2);
        boolean a11 = S5.i.a(hVar);
        if (a11) {
            double g10 = C17978n.g(c10, 1.0d);
            if (Math.abs(((double) i11) - (((double) width) * g10)) <= 1.0d || Math.abs(((double) i10) - (g10 * ((double) height))) <= 1.0d) {
                return true;
            }
        } else if ((j.u(i11) || Math.abs(i11 - width) <= 1) && (j.u(i10) || Math.abs(i10 - height) <= 1)) {
            return true;
        }
        if (c10 != 1.0d && !a11) {
            return false;
        }
        return c10 <= 1.0d || !d10;
    }

    public final c.C0603c a(N5.h hVar, c.b bVar, i iVar, O5.h hVar2) {
        if (!hVar.C().b()) {
            return null;
        }
        c b10 = this.f38285a.b();
        c.C0603c b11 = b10 != null ? b10.b(bVar) : null;
        if (b11 == null || !c(hVar, bVar, b11, iVar, hVar2)) {
            return null;
        }
        return b11;
    }

    public final boolean c(N5.h hVar, c.b bVar, c.C0603c cVar, i iVar, O5.h hVar2) {
        if (!this.f38286b.c(hVar, S5.a.c(cVar.a()))) {
            return false;
        }
        return e(hVar, bVar, cVar, iVar, hVar2);
    }

    public final c.b f(N5.h hVar, Object obj, m mVar, B5.c cVar) {
        c.b B10 = hVar.B();
        if (B10 != null) {
            return B10;
        }
        cVar.j(hVar, obj);
        String f10 = this.f38285a.getComponents().f(obj, mVar);
        cVar.m(hVar, f10);
        if (f10 == null) {
            return null;
        }
        List<Q5.a> O10 = hVar.O();
        Map<String, String> i10 = hVar.E().i();
        if (O10.isEmpty() && i10.isEmpty()) {
            return new c.b(f10, (Map) null, 2, (DefaultConstructorMarker) null);
        }
        Map<String, String> z10 = X.z(i10);
        if (!O10.isEmpty()) {
            List<Q5.a> O11 = hVar.O();
            int size = O11.size();
            for (int i11 = 0; i11 < size; i11++) {
                z10.put("coil#transformation_" + i11, O11.get(i11).a());
            }
            z10.put("coil#transformation_size", mVar.n().toString());
        }
        return new c.b(f10, z10);
    }

    public final q g(b.a aVar, N5.h hVar, c.b bVar, c.C0603c cVar) {
        return new q(new BitmapDrawable(hVar.l().getResources(), cVar.a()), hVar, e.MEMORY_CACHE, bVar, b(cVar), d(cVar), j.v(aVar));
    }

    public final boolean h(c.b bVar, N5.h hVar, a.b bVar2) {
        c b10;
        Bitmap bitmap;
        if (!(!hVar.C().j() || (b10 = this.f38285a.b()) == null || bVar == null)) {
            Drawable e10 = bVar2.e();
            BitmapDrawable bitmapDrawable = e10 instanceof BitmapDrawable ? (BitmapDrawable) e10 : null;
            if (!(bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar2.f()));
                String d10 = bVar2.d();
                if (d10 != null) {
                    linkedHashMap.put("coil#disk_cache_key", d10);
                }
                b10.c(bVar, new c.C0603c(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
