package N5;

import O5.e;
import O5.h;
import O5.j;
import QJ.M;
import R5.c;
import android.graphics.Bitmap;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b.\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b*\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b\"\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b&\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\b8\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\b2\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b6\u0010A\u001a\u0004\b<\u0010B¨\u0006C"}, d2 = {"LN5/d;", "", "Landroidx/lifecycle/r;", "lifecycle", "LO5/j;", "sizeResolver", "LO5/h;", "scale", "LQJ/M;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "LR5/c$a;", "transitionFactory", "LO5/e;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "LN5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/r;LO5/j;LO5/h;LQJ/M;LQJ/M;LQJ/M;LQJ/M;LR5/c$a;LO5/e;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;LN5/b;LN5/b;LN5/b;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/lifecycle/r;", "h", "()Landroidx/lifecycle/r;", "b", "LO5/j;", "m", "()LO5/j;", "c", "LO5/h;", "l", "()LO5/h;", "d", "LQJ/M;", "g", "()LQJ/M;", "e", "f", "n", "LR5/c$a;", "o", "()LR5/c$a;", "i", "LO5/e;", "k", "()LO5/e;", "j", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LN5/b;", "()LN5/b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final r f38973a;

    /* renamed from: b  reason: collision with root package name */
    private final j f38974b;

    /* renamed from: c  reason: collision with root package name */
    private final h f38975c;

    /* renamed from: d  reason: collision with root package name */
    private final M f38976d;

    /* renamed from: e  reason: collision with root package name */
    private final M f38977e;

    /* renamed from: f  reason: collision with root package name */
    private final M f38978f;

    /* renamed from: g  reason: collision with root package name */
    private final M f38979g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f38980h;

    /* renamed from: i  reason: collision with root package name */
    private final e f38981i;

    /* renamed from: j  reason: collision with root package name */
    private final Bitmap.Config f38982j;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f38983k;

    /* renamed from: l  reason: collision with root package name */
    private final Boolean f38984l;

    /* renamed from: m  reason: collision with root package name */
    private final b f38985m;

    /* renamed from: n  reason: collision with root package name */
    private final b f38986n;

    /* renamed from: o  reason: collision with root package name */
    private final b f38987o;

    public d(r rVar, j jVar, h hVar, M m10, M m11, M m12, M m13, c.a aVar, e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.f38973a = rVar;
        this.f38974b = jVar;
        this.f38975c = hVar;
        this.f38976d = m10;
        this.f38977e = m11;
        this.f38978f = m12;
        this.f38979g = m13;
        this.f38980h = aVar;
        this.f38981i = eVar;
        this.f38982j = config;
        this.f38983k = bool;
        this.f38984l = bool2;
        this.f38985m = bVar;
        this.f38986n = bVar2;
        this.f38987o = bVar3;
    }

    public final Boolean a() {
        return this.f38983k;
    }

    public final Boolean b() {
        return this.f38984l;
    }

    public final Bitmap.Config c() {
        return this.f38982j;
    }

    public final M d() {
        return this.f38978f;
    }

    public final b e() {
        return this.f38986n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return C17542s.e(this.f38973a, dVar.f38973a) && C17542s.e(this.f38974b, dVar.f38974b) && this.f38975c == dVar.f38975c && C17542s.e(this.f38976d, dVar.f38976d) && C17542s.e(this.f38977e, dVar.f38977e) && C17542s.e(this.f38978f, dVar.f38978f) && C17542s.e(this.f38979g, dVar.f38979g) && C17542s.e(this.f38980h, dVar.f38980h) && this.f38981i == dVar.f38981i && this.f38982j == dVar.f38982j && C17542s.e(this.f38983k, dVar.f38983k) && C17542s.e(this.f38984l, dVar.f38984l) && this.f38985m == dVar.f38985m && this.f38986n == dVar.f38986n && this.f38987o == dVar.f38987o;
        }
    }

    public final M f() {
        return this.f38977e;
    }

    public final M g() {
        return this.f38976d;
    }

    public final r h() {
        return this.f38973a;
    }

    public int hashCode() {
        r rVar = this.f38973a;
        int i10 = 0;
        int hashCode = (rVar != null ? rVar.hashCode() : 0) * 31;
        j jVar = this.f38974b;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        h hVar = this.f38975c;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        M m10 = this.f38976d;
        int hashCode4 = (hashCode3 + (m10 != null ? m10.hashCode() : 0)) * 31;
        M m11 = this.f38977e;
        int hashCode5 = (hashCode4 + (m11 != null ? m11.hashCode() : 0)) * 31;
        M m12 = this.f38978f;
        int hashCode6 = (hashCode5 + (m12 != null ? m12.hashCode() : 0)) * 31;
        M m13 = this.f38979g;
        int hashCode7 = (hashCode6 + (m13 != null ? m13.hashCode() : 0)) * 31;
        c.a aVar = this.f38980h;
        int hashCode8 = (hashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        e eVar = this.f38981i;
        int hashCode9 = (hashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f38982j;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f38983k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f38984l;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.f38985m;
        int hashCode13 = (hashCode12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f38986n;
        int hashCode14 = (hashCode13 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.f38987o;
        if (bVar3 != null) {
            i10 = bVar3.hashCode();
        }
        return hashCode14 + i10;
    }

    public final b i() {
        return this.f38985m;
    }

    public final b j() {
        return this.f38987o;
    }

    public final e k() {
        return this.f38981i;
    }

    public final h l() {
        return this.f38975c;
    }

    public final j m() {
        return this.f38974b;
    }

    public final M n() {
        return this.f38979g;
    }

    public final c.a o() {
        return this.f38980h;
    }
}
