package U5;

import E1.C4478k;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import IJ.C15915k;
import U5.e;
import android.graphics.drawable.Drawable;
import android.view.View;
import k6.C8444k;
import k6.C8445l;
import k6.C8454u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q6.C8675b;
import q6.C8677d;
import q6.C8678e;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\b\u001a)\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"LU5/e$c;", "previous", "current", "LE1/k;", "contentScale", "LU5/k;", "a", "(LU5/e$c;LU5/e$c;LE1/k;)LU5/k;", "U5/g$a", "LU5/g$a;", "FakeTransitionTarget", "coil-compose-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final a f40224a = new a();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"U5/g$a", "Lq6/e;", "Landroid/view/View;", "c", "()Landroid/view/View;", "view", "Landroid/graphics/drawable/Drawable;", "a", "()Landroid/graphics/drawable/Drawable;", "drawable", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C8678e {
        a() {
        }

        public Drawable a() {
            return null;
        }

        public View c() {
            throw new UnsupportedOperationException();
        }
    }

    public static final k a(e.c cVar, e.c cVar2, C4478k kVar) {
        C8445l lVar;
        e.c cVar3 = cVar2;
        if (cVar3 instanceof e.c.d) {
            lVar = ((e.c.d) cVar3).b();
        } else {
            if (cVar3 instanceof e.c.b) {
                lVar = ((e.c.b) cVar3).d();
            }
            return null;
        }
        C8677d a10 = C8444k.p(lVar.b()).a(f40224a, lVar);
        if (a10 instanceof C8675b) {
            C5942c a11 = cVar instanceof e.c.C0658c ? cVar.a() : null;
            C5942c a12 = cVar2.a();
            C15906b.a aVar = C15906b.f135496b;
            C8675b bVar = (C8675b) a10;
            return new k(a11, a12, kVar, C15908d.s(bVar.b(), C15909e.MILLISECONDS), (C15915k) null, !(lVar instanceof C8454u) || !((C8454u) lVar).c(), bVar.c(), 16, (DefaultConstructorMarker) null);
        }
        return null;
    }
}
