package sF;

import androidx.compose.ui.window.p;
import c2.o;
import c2.r;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"LsF/a;", "Landroidx/compose/ui/window/p;", "", "screenWidth", "Lc2/r;", "buttonSize", "Lo1/g;", "buttonPosition", "spacing", "<init>", "(FJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/p;", "anchorBounds", "windowSize", "Lc2/t;", "layoutDirection", "popupContentSize", "Lc2/n;", "a", "(Lc2/p;JLc2/t;J)J", "F", "getScreenWidth", "()F", "b", "J", "c", "d", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sF.a  reason: case insensitive filesystem */
public final class C15045a implements p {

    /* renamed from: a  reason: collision with root package name */
    private final float f130963a;

    /* renamed from: b  reason: collision with root package name */
    private final long f130964b;

    /* renamed from: c  reason: collision with root package name */
    private final long f130965c;

    /* renamed from: d  reason: collision with root package name */
    private final float f130966d;

    public /* synthetic */ C15045a(float f10, long j10, long j11, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, j11, f11);
    }

    public long a(c2.p pVar, long j10, t tVar, long j11) {
        C17542s.j(pVar, "anchorBounds");
        C17542s.j(tVar, "layoutDirection");
        float n10 = (C5667g.n(this.f130965c) - ((float) (r.g(j11) / 2))) + ((float) (r.g(this.f130964b) / 2));
        return C5667g.m(this.f130965c) + ((float) (r.h(this.f130964b) / 2)) < this.f130963a / ((float) 2) ? o.a((int) (C5667g.m(this.f130965c) + ((float) r.h(this.f130964b)) + this.f130966d), (int) n10) : o.a((int) (C5667g.m(this.f130965c) - (((float) r.h(j11)) + this.f130966d)), (int) n10);
    }

    private C15045a(float f10, long j10, long j11, float f11) {
        this.f130963a = f10;
        this.f130964b = j10;
        this.f130965c = j11;
        this.f130966d = f11;
    }
}
