package L5;

import L5.c;
import android.graphics.Bitmap;
import j0.C5444A;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\b*\u0001\u001c\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"LL5/f;", "LL5/h;", "", "maxSize", "LL5/i;", "weakMemoryCache", "<init>", "(ILL5/i;)V", "LL5/c$b;", "key", "LL5/c$c;", "b", "(LL5/c$b;)LL5/c$c;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "LXH/N;", "c", "(LL5/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "e", "()V", "level", "a", "(I)V", "LL5/i;", "L5/f$b", "LL5/f$b;", "cache", "g", "()I", "size", "f", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final i f38289a;

    /* renamed from: b  reason: collision with root package name */
    private final b f38290b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LL5/f$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "", "size", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "I", "()I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f38291a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f38292b;

        /* renamed from: c  reason: collision with root package name */
        private final int f38293c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
            this.f38291a = bitmap;
            this.f38292b = map;
            this.f38293c = i10;
        }

        public final Bitmap a() {
            return this.f38291a;
        }

        public final Map<String, Object> b() {
            return this.f38292b;
        }

        public final int c() {
            return this.f38293c;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"L5/f$b", "Lj0/A;", "LL5/c$b;", "LL5/f$a;", "key", "value", "", "n", "(LL5/c$b;LL5/f$a;)I", "", "evicted", "oldValue", "newValue", "LXH/N;", "m", "(ZLL5/c$b;LL5/f$a;LL5/f$a;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends C5444A<c.b, a> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f38294j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, f fVar) {
            super(i10);
            this.f38294j = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void b(boolean z10, c.b bVar, a aVar, a aVar2) {
            this.f38294j.f38289a.c(bVar, aVar.a(), aVar.b(), aVar.c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public int j(c.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public f(int i10, i iVar) {
        this.f38289a = iVar;
        this.f38290b = new b(i10, this);
    }

    public void a(int i10) {
        if (i10 >= 40) {
            e();
        } else if (10 <= i10 && i10 < 20) {
            this.f38290b.l(g() / 2);
        }
    }

    public c.C0603c b(c.b bVar) {
        a aVar = (a) this.f38290b.d(bVar);
        if (aVar != null) {
            return new c.C0603c(aVar.a(), aVar.b());
        }
        return null;
    }

    public void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        int a10 = S5.a.a(bitmap);
        if (a10 <= f()) {
            this.f38290b.f(bVar, new a(bitmap, map, a10));
            return;
        }
        this.f38290b.g(bVar);
        this.f38289a.c(bVar, bitmap, map, a10);
    }

    public void e() {
        this.f38290b.c();
    }

    public int f() {
        return this.f38290b.e();
    }

    public int g() {
        return this.f38290b.i();
    }
}
