package l0;

import U0.C4892n0;
import U0.D0;
import androidx.compose.animation.a;
import androidx.compose.animation.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ll0/i;", "", "Landroidx/compose/animation/i;", "targetContentEnter", "Landroidx/compose/animation/k;", "initialContentExit", "", "targetContentZIndex", "Ll0/v;", "sizeTransform", "<init>", "(Landroidx/compose/animation/i;Landroidx/compose/animation/k;FLl0/v;)V", "a", "Landroidx/compose/animation/i;", "c", "()Landroidx/compose/animation/i;", "b", "Landroidx/compose/animation/k;", "()Landroidx/compose/animation/k;", "<set-?>", "LU0/n0;", "d", "()F", "setTargetContentZIndex", "(F)V", "Ll0/v;", "()Ll0/v;", "e", "(Ll0/v;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.compose.animation.i f25393a;

    /* renamed from: b  reason: collision with root package name */
    private final k f25394b;

    /* renamed from: c  reason: collision with root package name */
    private final C4892n0 f25395c;

    /* renamed from: d  reason: collision with root package name */
    private v f25396d;

    public i(androidx.compose.animation.i iVar, k kVar, float f10, v vVar) {
        this.f25393a = iVar;
        this.f25394b = kVar;
        this.f25395c = D0.a(f10);
        this.f25396d = vVar;
    }

    public final k a() {
        return this.f25394b;
    }

    public final v b() {
        return this.f25396d;
    }

    public final androidx.compose.animation.i c() {
        return this.f25393a;
    }

    public final float d() {
        return this.f25395c.a();
    }

    public final void e(v vVar) {
        this.f25396d = vVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(androidx.compose.animation.i iVar, k kVar, float f10, v vVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, kVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? a.d(false, (p) null, 3, (Object) null) : vVar);
    }
}
