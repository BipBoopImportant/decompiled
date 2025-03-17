package u0;

import XH.C16807N;
import c2.C5267b;
import java.util.List;
import kotlin.Metadata;
import tI.C17978n;
import u0.C5973H;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\"\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lu0/y;", "", "", "isVertical", "Lu0/E;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Lu0/w;", "measuredItemProvider", "Lu0/H;", "spanLayoutProvider", "<init>", "(ZLu0/E;IILu0/w;Lu0/H;)V", "startSlot", "span", "Lc2/b;", "a", "(II)J", "index", "d", "(I)I", "lineIndex", "Lu0/x;", "c", "(I)Lu0/x;", "", "Lu0/v;", "items", "", "Lu0/c;", "spans", "mainAxisSpacing", "b", "(I[Lu0/v;Ljava/util/List;I)Lu0/x;", "Z", "Lu0/E;", "I", "e", "Lu0/w;", "f", "Lu0/H;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.y  reason: case insensitive filesystem */
public abstract class C6001y {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29793a;

    /* renamed from: b  reason: collision with root package name */
    private final C5970E f29794b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29795c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29796d;

    /* renamed from: e  reason: collision with root package name */
    private final C5999w f29797e;

    /* renamed from: f  reason: collision with root package name */
    private final C5973H f29798f;

    public C6001y(boolean z10, C5970E e10, int i10, int i11, C5999w wVar, C5973H h10) {
        this.f29793a = z10;
        this.f29794b = e10;
        this.f29795c = i10;
        this.f29796d = i11;
        this.f29797e = wVar;
        this.f29798f = h10;
    }

    public final long a(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.f29794b.b()[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            i12 = (this.f29794b.a()[i13] + this.f29794b.b()[i13]) - this.f29794b.a()[i10];
        }
        int e10 = C17978n.e(i12, 0);
        return this.f29793a ? C5267b.f23024b.e(e10) : C5267b.f23024b.d(e10);
    }

    public abstract C6000x b(int i10, C5998v[] vVarArr, List<C5979c> list, int i11);

    public final C6000x c(int i10) {
        C5973H.c c10 = this.f29798f.c(i10);
        int size = c10.b().size();
        int i11 = (size == 0 || c10.a() + size == this.f29795c) ? 0 : this.f29796d;
        C5998v[] vVarArr = new C5998v[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int d10 = C5979c.d(c10.b().get(i13).g());
            C5998v d11 = this.f29797e.d(c10.a() + i13, a(i12, d10), i12, d10, i11);
            i12 += d10;
            C16807N n10 = C16807N.f139792a;
            vVarArr[i13] = d11;
        }
        return b(i10, vVarArr, c10.b(), i11);
    }

    public final int d(int i10) {
        C5973H h10 = this.f29798f;
        return h10.i(i10, h10.e());
    }
}
