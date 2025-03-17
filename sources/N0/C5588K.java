package n0;

import L1.w;
import XH.C16807N;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.ui.d;
import c2.h;
import c2.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¢\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Lc2/d;", "Lo1/g;", "sourceCenter", "magnifierCenter", "Lc2/k;", "LXH/N;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lc2/h;", "cornerRadius", "elevation", "clippingEnabled", "Ln0/W;", "platformMagnifierFactory", "e", "(Landroidx/compose/ui/d;LnI/l;LnI/l;LnI/l;FZJFFZLn0/W;)Landroidx/compose/ui/d;", "", "sdkVersion", "c", "(I)Z", "other", "a", "(FF)Z", "LL1/w;", "Lkotlin/Function0;", "LL1/w;", "b", "()LL1/w;", "MagnifierPositionInRoot", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.K  reason: case insensitive filesystem */
public final class C5588K {

    /* renamed from: a  reason: collision with root package name */
    private static final w<C17631a<C5667g>> f26355a = new w<>("MagnifierPositionInRoot", (p) null, 2, (DefaultConstructorMarker) null);

    public static final boolean a(float f10, float f11) {
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    public static final w<C17631a<C5667g>> b() {
        return f26355a;
    }

    public static final boolean c(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return c(i10);
    }

    public static final d e(d dVar, C17642l<? super c2.d, C5667g> lVar, C17642l<? super c2.d, C5667g> lVar2, C17642l<? super k, C16807N> lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, W w10) {
        if (!d(0, 1, (Object) null)) {
            return dVar;
        }
        d dVar2 = dVar;
        return dVar.s(new MagnifierElement(lVar, lVar2, lVar3, f10, z10, j10, f11, f12, z11, w10 == null ? W.f26384a.a() : w10, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ d f(d dVar, C17642l lVar, C17642l lVar2, C17642l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, W w10, int i10, Object obj) {
        int i11 = i10;
        W w11 = null;
        C17642l lVar4 = (i11 & 2) != 0 ? null : lVar2;
        C17642l lVar5 = (i11 & 4) != 0 ? null : lVar3;
        float f13 = (i11 & 8) != 0 ? Float.NaN : f10;
        boolean z12 = (i11 & 16) != 0 ? false : z10;
        long a10 = (i11 & 32) != 0 ? k.f23040b.a() : j10;
        float c10 = (i11 & 64) != 0 ? h.f23031b.c() : f11;
        float c11 = (i11 & 128) != 0 ? h.f23031b.c() : f12;
        boolean z13 = (i11 & 256) != 0 ? true : z11;
        if ((i11 & 512) == 0) {
            w11 = w10;
        }
        return e(dVar, lVar, lVar4, lVar5, f13, z12, a10, c10, c11, z13, w11);
    }
}
