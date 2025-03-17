package androidx.compose.foundation.layout;

import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "", "ratio", "", "matchHeightConstraintsFirst", "a", "(Landroidx/compose/ui/d;FZ)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.e  reason: case insensitive filesystem */
public final class C5074e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.e$a */
    public static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f18095c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f10, boolean z10) {
            super(1);
            this.f18095c = f10;
            this.f18096d = z10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("aspectRatio");
            v0Var.a().c("ratio", Float.valueOf(this.f18095c));
            v0Var.a().c("matchHeightConstraintsFirst", Boolean.valueOf(this.f18096d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar, float f10, boolean z10) {
        return dVar.s(new AspectRatioElement(f10, z10, C5133t0.b() ? new a(f10, z10) : C5133t0.a()));
    }

    public static /* synthetic */ d b(d dVar, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(dVar, f10, z10);
    }
}
