package N5;

import E5.e;
import L5.c;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\r\u0010*R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b%\u0010*¨\u0006,"}, d2 = {"LN5/q;", "LN5/i;", "Landroid/graphics/drawable/Drawable;", "drawable", "LN5/h;", "request", "LE5/e;", "dataSource", "LL5/c$b;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Landroid/graphics/drawable/Drawable;LN5/h;LE5/e;LL5/c$b;Ljava/lang/String;ZZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "LN5/h;", "()LN5/h;", "c", "LE5/e;", "()LE5/e;", "d", "LL5/c$b;", "getMemoryCacheKey", "()LL5/c$b;", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "Z", "()Z", "g", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f39099a;

    /* renamed from: b  reason: collision with root package name */
    private final h f39100b;

    /* renamed from: c  reason: collision with root package name */
    private final e f39101c;

    /* renamed from: d  reason: collision with root package name */
    private final c.b f39102d;

    /* renamed from: e  reason: collision with root package name */
    private final String f39103e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39104f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f39105g;

    public q(Drawable drawable, h hVar, e eVar, c.b bVar, String str, boolean z10, boolean z11) {
        super((DefaultConstructorMarker) null);
        this.f39099a = drawable;
        this.f39100b = hVar;
        this.f39101c = eVar;
        this.f39102d = bVar;
        this.f39103e = str;
        this.f39104f = z10;
        this.f39105g = z11;
    }

    public Drawable a() {
        return this.f39099a;
    }

    public h b() {
        return this.f39100b;
    }

    public final e c() {
        return this.f39101c;
    }

    public final String d() {
        return this.f39103e;
    }

    public final boolean e() {
        return this.f39105g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return C17542s.e(a(), qVar.a()) && C17542s.e(b(), qVar.b()) && this.f39101c == qVar.f39101c && C17542s.e(this.f39102d, qVar.f39102d) && C17542s.e(this.f39103e, qVar.f39103e) && this.f39104f == qVar.f39104f && this.f39105g == qVar.f39105g;
        }
    }

    public int hashCode() {
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f39101c.hashCode()) * 31;
        c.b bVar = this.f39102d;
        int i10 = 0;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f39103e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + Boolean.hashCode(this.f39104f)) * 31) + Boolean.hashCode(this.f39105g);
    }
}
