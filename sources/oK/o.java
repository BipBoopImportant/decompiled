package oK;

import XH.t;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import oK.C17711d;
import oK.p;
import p1.C5702H;
import p1.C5749w0;
import p1.S;
import p1.S0;
import r1.f;
import t1.C5942c;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020'8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"LoK/o;", "Lt1/c;", "Landroid/graphics/Bitmap;", "image", "LoK/d$b;", "orientation", "<init>", "(Landroid/graphics/Bitmap;LoK/d$b;)V", "", "alpha", "", "a", "(F)Z", "Lp1/w0;", "colorFilter", "b", "(Lp1/w0;)Z", "Lr1/f;", "LXH/N;", "j", "(Lr1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Landroid/graphics/Bitmap;", "h", "LoK/d$b;", "Lp1/S0;", "i", "Lp1/S0;", "paint", "Lo1/m;", "()J", "intrinsicSize", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o extends C5942c {

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap f145416g;

    /* renamed from: h  reason: collision with root package name */
    private final C17711d.b f145417h;

    /* renamed from: i  reason: collision with root package name */
    private final S0 f145418i = S.a();

    public o(Bitmap bitmap, C17711d.b bVar) {
        C17542s.j(bitmap, "image");
        C17542s.j(bVar, "orientation");
        this.f145416g = bitmap;
        this.f145417h = bVar;
    }

    /* access modifiers changed from: protected */
    public boolean a(float f10) {
        this.f145418i.d(f10);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b(C5749w0 w0Var) {
        this.f145418i.n(w0Var);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f145416g, oVar.f145416g) && this.f145417h == oVar.f145417h;
    }

    public long h() {
        return C5674n.a((float) this.f145416g.getWidth(), (float) this.f145416g.getHeight());
    }

    public int hashCode() {
        return (this.f145416g.hashCode() * 31) + this.f145417h.hashCode();
    }

    /* access modifiers changed from: protected */
    public void j(f fVar) {
        float f10;
        C17542s.j(fVar, "<this>");
        long h10 = h();
        C17711d.b bVar = this.f145417h;
        long b10 = fVar.b();
        p.f().reset();
        int i10 = p.a.f145420a[bVar.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else if (i10 == 2) {
            f10 = 90.0f;
        } else if (i10 == 3) {
            f10 = 180.0f;
        } else if (i10 == 4) {
            f10 = 270.0f;
        } else {
            throw new t();
        }
        long a10 = C5668h.a(C5673m.l(h10) / 2.0f, C5673m.i(h10) / 2.0f);
        p.f().postTranslate(-C5667g.m(a10), -C5667g.n(a10));
        p.f().postRotate(f10);
        if (f10 % ((float) 180) != 0.0f) {
            h10 = p.e(h10);
        }
        p.f().postScale(C5673m.l(b10) / C5673m.l(h10), C5673m.i(b10) / C5673m.i(h10));
        p.f().postTranslate((C5673m.l(b10) + 0.0f) / 2.0f, (C5673m.i(b10) + 0.0f) / 2.0f);
        C5702H.d(fVar.I1().e()).drawBitmap(this.f145416g, p.f(), this.f145418i.o());
    }

    public String toString() {
        Bitmap bitmap = this.f145416g;
        C17711d.b bVar = this.f145417h;
        return "RotatedBitmapPainter(image=" + bitmap + ", orientation=" + bVar + ")";
    }
}
