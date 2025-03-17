package k6;

import QJ.F0;
import T5.C6697a;
import T5.l;
import T5.r;
import WK.C16777l;
import YH.C16870n;
import YH.X;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import f6.C7853d;
import java.util.Map;
import k6.C8441h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l6.C8531c;
import l6.f;
import l6.h;
import l6.j;
import o6.C8607a;
import o6.b;
import r6.C8690A;
import r6.C8694b;
import r6.C8696d;
import r6.F;
import r6.m;
import r6.n;
import r6.s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010:R\u0014\u0010=\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010<¨\u0006>"}, d2 = {"Lk6/a;", "Lk6/s;", "LT5/r;", "imageLoader", "Lr6/A;", "systemCallbacks", "Lr6/s;", "logger", "<init>", "(LT5/r;Lr6/A;Lr6/s;)V", "Lk6/h;", "Landroidx/lifecycle/r;", "f", "(Lk6/h;)Landroidx/lifecycle/r;", "Ll6/j;", "m", "(Lk6/h;)Ll6/j;", "Ll6/f;", "l", "(Lk6/h;)Ll6/f;", "sizeResolver", "Ll6/c;", "k", "(Lk6/h;Ll6/j;)Ll6/c;", "Ll6/h;", "size", "LT5/l;", "j", "(Lk6/h;Ll6/h;)LT5/l;", "request", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "", "i", "(Lk6/h;Landroid/graphics/Bitmap$Config;)Z", "g", "(Lk6/h;Ll6/h;)Z", "Lk6/q;", "options", "h", "(Lk6/q;)Z", "LQJ/F0;", "job", "findLifecycle", "Lk6/r;", "e", "(Lk6/h;LQJ/F0;Z)Lk6/r;", "d", "(Lk6/h;)Lk6/h;", "a", "(Lk6/h;Ll6/h;)Lk6/q;", "c", "(Lk6/q;)Lk6/q;", "Lf6/d$c;", "cacheValue", "b", "(Lk6/h;Lf6/d$c;)Z", "LT5/r;", "Lr6/A;", "Lr6/m;", "Lr6/m;", "hardwareBitmapService", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.a  reason: case insensitive filesystem */
public final class C8434a implements C8452s {

    /* renamed from: a  reason: collision with root package name */
    private final r f54147a;

    /* renamed from: b  reason: collision with root package name */
    private final C8690A f54148b;

    /* renamed from: c  reason: collision with root package name */
    private final m f54149c = n.a((s) null);

    public C8434a(r rVar, C8690A a10, s sVar) {
        this.f54147a = rVar;
        this.f54148b = a10;
    }

    private final androidx.lifecycle.r f(C8441h hVar) {
        C8607a y10 = hVar.y();
        return C8696d.e(y10 instanceof b ? ((b) y10).c().getContext() : hVar.c());
    }

    private final boolean g(C8441h hVar, h hVar2) {
        return (C8442i.f(hVar).isEmpty() || C16870n.a0(F.f(), C8444k.k(hVar))) && (!C8694b.d(C8444k.k(hVar)) || (i(hVar, C8444k.k(hVar)) && this.f54149c.b(hVar2)));
    }

    private final boolean h(C8450q qVar) {
        return !C8694b.d(C8444k.l(qVar)) || this.f54149c.a();
    }

    private final boolean i(C8441h hVar, Bitmap.Config config) {
        if (!C8694b.d(config)) {
            return true;
        }
        if (!C8444k.f(hVar)) {
            return false;
        }
        C8607a y10 = hVar.y();
        if (y10 instanceof b) {
            View c10 = ((b) y10).c();
            return !c10.isAttachedToWindow() || c10.isHardwareAccelerated();
        }
    }

    private final l j(C8441h hVar, h hVar2) {
        Bitmap.Config k10 = C8444k.k(hVar);
        boolean h10 = C8444k.h(hVar);
        if (!g(hVar, hVar2)) {
            k10 = Bitmap.Config.ARGB_8888;
        }
        boolean z10 = h10 && C8442i.f(hVar).isEmpty() && k10 != Bitmap.Config.ALPHA_8;
        l.a aVar = new l.a((Map<l.c<?>, ? extends Object>) X.s(hVar.g().f().b(), hVar.k().b()));
        if (k10 != C8444k.k(hVar)) {
            aVar = aVar.b(C8444k.j(l.c.f40054b), k10);
        }
        if (z10 != C8444k.h(hVar)) {
            aVar = aVar.b(C8444k.g(l.c.f40054b), Boolean.valueOf(z10));
        }
        return aVar.a();
    }

    private final C8531c k(C8441h hVar, j jVar) {
        return (hVar.h().m() != null || !C17542s.e(jVar, j.f54775c)) ? (!(hVar.y() instanceof b) || !(jVar instanceof l6.l) || !(((b) hVar.y()).c() instanceof ImageView) || ((b) hVar.y()).c() != ((l6.l) jVar).c()) ? C8531c.EXACT : C8531c.INEXACT : C8531c.INEXACT;
    }

    private final f l(C8441h hVar) {
        C8607a y10 = hVar.y();
        ImageView imageView = null;
        b bVar = y10 instanceof b ? (b) y10 : null;
        KeyEvent.Callback c10 = bVar != null ? bVar.c() : null;
        if (c10 instanceof ImageView) {
            imageView = (ImageView) c10;
        }
        return imageView != null ? F.e(imageView) : hVar.w();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = ((android.widget.ImageView) r4).getScaleType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final l6.j m(k6.C8441h r4) {
        /*
            r3 = this;
            o6.a r0 = r4.y()
            boolean r0 = r0 instanceof o6.b
            if (r0 == 0) goto L_0x0030
            o6.a r4 = r4.y()
            o6.b r4 = (o6.b) r4
            android.view.View r4 = r4.c()
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0028
            r0 = r4
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.widget.ImageView$ScaleType r0 = r0.getScaleType()
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            if (r0 == r1) goto L_0x0025
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            if (r0 != r1) goto L_0x0028
        L_0x0025:
            l6.j r4 = l6.j.f54775c
            return r4
        L_0x0028:
            r0 = 2
            r1 = 0
            r2 = 0
            l6.l r4 = l6.m.b(r4, r2, r0, r1)
            return r4
        L_0x0030:
            l6.j r4 = l6.j.f54775c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.C8434a.m(k6.h):l6.j");
    }

    public C8450q a(C8441h hVar, h hVar2) {
        return new C8450q(hVar.c(), hVar2, hVar.w(), hVar.v(), hVar.i(), hVar.n(), hVar.s(), hVar.j(), hVar.t(), j(hVar, hVar2));
    }

    public boolean b(C8441h hVar, C7853d.c cVar) {
        T5.n b10 = cVar.b();
        C6697a aVar = b10 instanceof C6697a ? (C6697a) b10 : null;
        if (aVar == null) {
            return true;
        }
        return i(hVar, C8694b.c(aVar.d()));
    }

    public C8450q c(C8450q qVar) {
        boolean z10;
        l f10 = qVar.f();
        if (!h(qVar)) {
            f10 = f10.d().b(C8444k.j(l.c.f40054b), Bitmap.Config.ARGB_8888).a();
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 ? C8450q.b(qVar, (Context) null, (h) null, (f) null, (C8531c) null, (String) null, (C16777l) null, (C8436c) null, (C8436c) null, (C8436c) null, f10, 511, (Object) null) : qVar;
    }

    public C8441h d(C8441h hVar) {
        C8441h.a f10 = C8441h.A(hVar, (Context) null, 1, (Object) null).f(this.f54147a.c());
        j m10 = hVar.h().m();
        if (m10 == null) {
            m10 = m(hVar);
            f10.q(m10);
        }
        if (hVar.h().l() == null) {
            f10.o(l(hVar));
        }
        if (hVar.h().k() == null) {
            f10.n(k(hVar, m10));
        }
        return f10.c();
    }

    public C8451r e(C8441h hVar, F0 f02, boolean z10) {
        C8607a y10 = hVar.y();
        if (y10 instanceof b) {
            androidx.lifecycle.r n10 = C8444k.n(hVar);
            if (n10 == null) {
                n10 = f(hVar);
            }
            return new C8456w(this.f54147a, hVar, (b) y10, n10, f02);
        }
        androidx.lifecycle.r n11 = C8444k.n(hVar);
        if (n11 == null) {
            n11 = z10 ? f(hVar) : null;
        }
        return n11 != null ? new C8446m(n11, f02) : C8435b.c(C8435b.d(f02));
    }
}
