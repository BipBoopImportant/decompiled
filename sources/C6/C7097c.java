package c6;

import T5.C6697a;
import T5.n;
import T5.u;
import YH.C16870n;
import android.graphics.Bitmap;
import java.util.List;
import k6.C8444k;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.P;
import l6.C8531c;
import p6.C8627a;
import r6.C8694b;
import r6.F;
import r6.g;
import r6.s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LT5/n;", "image", "Lk6/q;", "options", "", "Lp6/a;", "transformations", "Lr6/s;", "logger", "Landroid/graphics/Bitmap;", "a", "(LT5/n;Lk6/q;Ljava/util/List;Lr6/s;)Landroid/graphics/Bitmap;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: c6.c  reason: case insensitive filesystem */
public final class C7097c {
    public static final Bitmap a(n nVar, C8450q qVar, List<? extends C8627a> list, s sVar) {
        if (nVar instanceof C6697a) {
            Bitmap d10 = ((C6697a) nVar).d();
            Bitmap.Config c10 = C8694b.c(d10);
            if (C16870n.a0(F.f(), c10)) {
                return d10;
            }
            if (sVar != null) {
                s.a aVar = s.a.Info;
                if (sVar.a().compareTo(aVar) <= 0) {
                    sVar.b("EngineInterceptor", aVar, "Converting bitmap with config " + c10 + " to apply transformations: " + list + '.', (Throwable) null);
                }
            }
        } else if (sVar != null) {
            s.a aVar2 = s.a.Info;
            if (sVar.a().compareTo(aVar2) <= 0) {
                sVar.b("EngineInterceptor", aVar2, "Converting image of type " + P.b(nVar.getClass()).u() + " to apply transformations: " + list + '.', (Throwable) null);
            }
        }
        return g.f55698a.a(u.a(nVar, qVar.c().getResources()), C8444k.l(qVar), qVar.k(), qVar.j(), qVar.i() == C8531c.INEXACT);
    }
}
