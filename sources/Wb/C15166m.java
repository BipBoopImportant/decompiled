package wB;

import I0.N0;
import I0.X;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.v;
import androidx.compose.foundation.layout.D;
import c2.h;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import p1.C5747v0;
import s0.C5834E;
import tK.C18030v;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u00198\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e8G¢\u0006\u0006\u001a\u0004\b\n\u0010 ¨\u0006#"}, d2 = {"LwB/m;", "", "<init>", "()V", "Lc2/h;", "b", "F", "d", "()F", "Height", "c", "e", "HorizontalPadding", "Ls0/E;", "Ls0/E;", "f", "()Ls0/E;", "PaddingValues", "h", "VelocityThreshold", "LI0/X;", "LI0/X;", "StartToEndSnapThreshold", "g", "EndToStartSnapThreshold", "Lkotlin/Function2;", "LwB/m$a;", "LnI/p;", "()LnI/p;", "SnapThreshold", "LXH/v;", "Lp1/v0;", "(LU0/m;I)LXH/v;", "BackgroundColors", "a", "slide-to-unlock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wB.m  reason: case insensitive filesystem */
public final class C15166m {

    /* renamed from: a  reason: collision with root package name */
    public static final C15166m f131639a = new C15166m();

    /* renamed from: b  reason: collision with root package name */
    private static final float f131640b = h.B((float) 56);

    /* renamed from: c  reason: collision with root package name */
    private static final float f131641c;

    /* renamed from: d  reason: collision with root package name */
    private static final C5834E f131642d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f131643e;

    /* renamed from: f  reason: collision with root package name */
    private static final X f131644f = new X(0.8f);

    /* renamed from: g  reason: collision with root package name */
    private static final X f131645g = new X(0.19999999f);

    /* renamed from: h  reason: collision with root package name */
    private static final p<a, a, X> f131646h = new C15165l();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LwB/m$a;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "slide-to-unlock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wB.m$a */
    public enum a {
        Start,
        End;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    static {
        float f10 = (float) 10;
        float B10 = h.B(f10);
        f131641c = B10;
        f131642d = D.b(B10, h.B((float) 8));
        f131643e = h.B(N0.f7396a.b() * f10);
    }

    private C15166m() {
    }

    /* access modifiers changed from: private */
    public static final X b(a aVar, a aVar2) {
        C17542s.j(aVar, "from");
        C17542s.j(aVar2, "<unused var>");
        return aVar == a.Start ? f131644f : f131645g;
    }

    public final v<C5747v0, C5747v0> c(C4889m mVar, int i10) {
        mVar.W(211278263);
        if (C4895p.J()) {
            C4895p.S(211278263, i10, -1, "com.ingka.ikea.slidetounlock.Track.<get-BackgroundColors> (SlideToUnlock.kt:290)");
        }
        C18030v vVar = C18030v.f147664a;
        int i11 = C18030v.f147665b;
        v<C5747v0, C5747v0> a10 = C16796C.a(C5747v0.k(vVar.a(mVar, i11).p0()), C5747v0.k(vVar.a(mVar, i11).B0()));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a10;
    }

    public final float d() {
        return f131640b;
    }

    public final float e() {
        return f131641c;
    }

    public final C5834E f() {
        return f131642d;
    }

    public final p<a, a, X> g() {
        return f131646h;
    }

    public final float h() {
        return f131643e;
    }
}
