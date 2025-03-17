package androidx.compose.foundation;

import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5728l0;
import p1.C5747v0;
import p1.c1;
import p1.i1;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "Lp1/v0;", "color", "Lp1/i1;", "shape", "c", "(Landroidx/compose/ui/d;JLp1/i1;)Landroidx/compose/ui/d;", "Lp1/l0;", "brush", "", "alpha", "a", "(Landroidx/compose/ui/d;Lp1/l0;Lp1/i1;F)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17576c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5728l0 f17577d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i1 f17578e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f10, C5728l0 l0Var, i1 i1Var) {
            super(1);
            this.f17576c = f10;
            this.f17577d = l0Var;
            this.f17578e = i1Var;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("background");
            v0Var.a().c("alpha", Float.valueOf(this.f17576c));
            v0Var.a().c("brush", this.f17577d);
            v0Var.a().c("shape", this.f17578e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.b$b  reason: collision with other inner class name */
    public static final class C0246b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f17579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i1 f17580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0246b(long j10, i1 i1Var) {
            super(1);
            this.f17579c = j10;
            this.f17580d = i1Var;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("background");
            v0Var.c(C5747v0.k(this.f17579c));
            v0Var.a().c("color", C5747v0.k(this.f17579c));
            v0Var.a().c("shape", this.f17580d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar, C5728l0 l0Var, i1 i1Var, float f10) {
        return dVar.s(new BackgroundElement(0, l0Var, f10, i1Var, C5133t0.b() ? new a(f10, l0Var, i1Var) : C5133t0.a(), 1, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ d b(d dVar, C5728l0 l0Var, i1 i1Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i1Var = c1.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(dVar, l0Var, i1Var, f10);
    }

    public static final d c(d dVar, long j10, i1 i1Var) {
        return dVar.s(new BackgroundElement(j10, (C5728l0) null, 1.0f, i1Var, C5133t0.b() ? new C0246b(j10, i1Var) : C5133t0.a(), 2, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ d d(d dVar, long j10, i1 i1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i1Var = c1.a();
        }
        return c(dVar, j10, i1Var);
    }
}
