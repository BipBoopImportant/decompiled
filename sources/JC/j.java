package jC;

import QJ.M;
import XH.t;
import android.graphics.Bitmap;
import c2.p;
import dI.C17164e;
import jC.C14615b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lC.C14755g;
import lC.l;
import nC.C14844e;
import p1.C5747v0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(¨\u0006)"}, d2 = {"LjC/j;", "LjC/i;", "LlC/l;", "statusBar", "LlC/g;", "navigationBar", "LjC/f;", "scrimColors", "LnC/e;", "suggestIconColor", "<init>", "(LlC/l;LlC/g;LjC/f;LnC/e;)V", "", "alpha", "Lp1/v0;", "d", "(F)J", "LjC/b;", "iconColor", "f", "(LjC/b;F)J", "defaultAspectRatio", "", "imageWidth", "c", "(FI)F", "Landroid/graphics/Bitmap;", "bitmap", "Lc2/p;", "region", "LjC/b$d;", "e", "(Landroid/graphics/Bitmap;Lc2/p;LdI/e;)Ljava/lang/Object;", "a", "LlC/l;", "()LlC/l;", "b", "LlC/g;", "()LlC/g;", "LjC/f;", "LnC/e;", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final l f127873a;

    /* renamed from: b  reason: collision with root package name */
    private final C14755g f127874b;

    /* renamed from: c  reason: collision with root package name */
    private final f f127875c;

    /* renamed from: d  reason: collision with root package name */
    private final C14844e f127876d;

    public j(l lVar, C14755g gVar, f fVar, C14844e eVar) {
        C17542s.j(lVar, "statusBar");
        C17542s.j(gVar, "navigationBar");
        C17542s.j(fVar, "scrimColors");
        C17542s.j(eVar, "suggestIconColor");
        this.f127873a = lVar;
        this.f127874b = gVar;
        this.f127875c = fVar;
        this.f127876d = eVar;
    }

    public l a() {
        return this.f127873a;
    }

    public C14755g b() {
        return this.f127874b;
    }

    public float c(float f10, int i10) {
        if (i10 <= 0) {
            return f10;
        }
        float f11 = (float) i10;
        return f11 / ((f11 / f10) + ((float) a().getHeight()));
    }

    public long d(float f10) {
        return f(a().c(), f10);
    }

    public Object e(Bitmap bitmap, p pVar, C17164e<? super C14615b.d> eVar) {
        return C14844e.a.a(this.f127876d, bitmap, pVar.j(), pVar.m(), pVar.k(), pVar.e(), (M) null, eVar, 32, (Object) null);
    }

    public long f(C14615b bVar, float f10) {
        long a10;
        C17542s.j(bVar, "iconColor");
        if (C17542s.e(bVar, C14615b.e.f127859b)) {
            a10 = this.f127875c.c();
        } else if (C17542s.e(bVar, C14615b.C3152b.f127857b)) {
            a10 = this.f127875c.b();
        } else if (C17542s.e(bVar, C14615b.c.f127858b)) {
            a10 = this.f127875c.a();
        } else {
            throw new t();
        }
        return C5747v0.o(a10, f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }
}
