package androidx.compose.ui.graphics;

import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.I0;
import p1.c1;
import p1.d1;
import p1.i1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÂ\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b!\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/d;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lp1/i1;", "shape", "", "clip", "Lp1/d1;", "renderEffect", "Lp1/v0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "b", "(Landroidx/compose/ui/d;FFFFFFFFFFJLp1/i1;ZLp1/d1;JJI)Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "LXH/N;", "block", "a", "(Landroidx/compose/ui/d;LnI/l;)Landroidx/compose/ui/d;", "d", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final d a(d dVar, C17642l<? super c, C16807N> lVar) {
        return dVar.s(new BlockGraphicsLayerElement(lVar));
    }

    public static final d b(d dVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10) {
        GraphicsLayerElement graphicsLayerElement = r0;
        GraphicsLayerElement graphicsLayerElement2 = new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, i1Var, z10, d1Var, j11, j12, i10, (DefaultConstructorMarker) null);
        return dVar.s(graphicsLayerElement);
    }

    public static /* synthetic */ d c(d dVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10, int i11, Object obj) {
        int i12 = i11;
        float f20 = 1.0f;
        float f21 = (i12 & 1) != 0 ? 1.0f : f10;
        float f22 = (i12 & 2) != 0 ? 1.0f : f11;
        if ((i12 & 4) == 0) {
            f20 = f12;
        }
        float f23 = 0.0f;
        float f24 = (i12 & 8) != 0 ? 0.0f : f13;
        float f25 = (i12 & 16) != 0 ? 0.0f : f14;
        float f26 = (i12 & 32) != 0 ? 0.0f : f15;
        float f27 = (i12 & 64) != 0 ? 0.0f : f16;
        float f28 = (i12 & 128) != 0 ? 0.0f : f17;
        if ((i12 & 256) == 0) {
            f23 = f18;
        }
        return b(dVar, f21, f22, f20, f24, f25, f26, f27, f28, f23, (i12 & 512) != 0 ? 8.0f : f19, (i12 & 1024) != 0 ? f.f18947b.a() : j10, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? c1.a() : i1Var, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z10, (i12 & 8192) != 0 ? null : d1Var, (i12 & 16384) != 0 ? I0.a() : j11, (i12 & 32768) != 0 ? I0.a() : j12, (i12 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? a.f18902a.a() : i10);
    }

    public static final d d(d dVar) {
        if (!C5133t0.b()) {
            return dVar;
        }
        return dVar.s(c(d.f18749a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (i1) null, false, (d1) null, 0, 0, 0, 131071, (Object) null));
    }
}
