package u0;

import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001a¨\u0006'"}, d2 = {"Lu0/x;", "", "", "index", "", "Lu0/v;", "items", "Lu0/E;", "slots", "", "Lu0/c;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Lu0/v;Lu0/E;Ljava/util/List;ZI)V", "e", "()Z", "offset", "layoutWidth", "layoutHeight", "f", "(III)[Lu0/v;", "a", "I", "()I", "b", "[Lu0/v;", "()[Lu0/v;", "c", "Lu0/E;", "d", "Ljava/util/List;", "Z", "g", "mainAxisSize", "h", "mainAxisSizeWithSpacings", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.x  reason: case insensitive filesystem */
public final class C6000x {

    /* renamed from: a  reason: collision with root package name */
    private final int f29785a;

    /* renamed from: b  reason: collision with root package name */
    private final C5998v[] f29786b;

    /* renamed from: c  reason: collision with root package name */
    private final C5970E f29787c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C5979c> f29788d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f29789e;

    /* renamed from: f  reason: collision with root package name */
    private final int f29790f;

    /* renamed from: g  reason: collision with root package name */
    private final int f29791g;

    /* renamed from: h  reason: collision with root package name */
    private final int f29792h;

    public C6000x(int i10, C5998v[] vVarArr, C5970E e10, List<C5979c> list, boolean z10, int i11) {
        this.f29785a = i10;
        this.f29786b = vVarArr;
        this.f29787c = e10;
        this.f29788d = list;
        this.f29789e = z10;
        this.f29790f = i11;
        int i12 = 0;
        for (C5998v q10 : vVarArr) {
            i12 = Math.max(i12, q10.q());
        }
        this.f29791g = i12;
        this.f29792h = C17978n.e(i12 + this.f29790f, 0);
    }

    public final int a() {
        return this.f29785a;
    }

    public final C5998v[] b() {
        return this.f29786b;
    }

    public final int c() {
        return this.f29791g;
    }

    public final int d() {
        return this.f29792h;
    }

    public final boolean e() {
        return this.f29786b.length == 0;
    }

    public final C5998v[] f(int i10, int i11, int i12) {
        C5998v[] vVarArr = this.f29786b;
        int length = vVarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            C5998v vVar = vVarArr[i13];
            int i16 = i14 + 1;
            int d10 = C5979c.d(this.f29788d.get(i14).g());
            int i17 = this.f29787c.a()[i15];
            boolean z10 = this.f29789e;
            vVar.u(i10, i17, i11, i12, z10 ? this.f29785a : i15, z10 ? i15 : this.f29785a);
            C16807N n10 = C16807N.f139792a;
            i15 += d10;
            i13++;
            i14 = i16;
        }
        return this.f29786b;
    }
}
