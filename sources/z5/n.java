package Z5;

import HJ.C15854t;
import T5.G;
import T5.H;
import T5.r;
import WK.y;
import X5.C6721f;
import X5.t;
import XH.C16820k;
import YH.C16877v;
import Z5.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import dI.C17164e;
import k6.C8444k;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l6.C8531c;
import l6.f;
import l6.h;
import r6.C8696d;
import r6.F;
import r6.g;
import r6.u;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ5/n;", "LZ5/j;", "LT5/G;", "data", "Lk6/q;", "options", "<init>", "(LT5/G;Lk6/q;)V", "", "b", "(LT5/G;)Ljava/lang/Void;", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "LT5/G;", "Lk6/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    private final G f41392a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41393b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ5/n$a;", "LZ5/j$a;", "LT5/G;", "<init>", "()V", "data", "", "c", "(LT5/G;)Z", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "(LT5/G;Lk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<G> {
        private final boolean c(G g10) {
            return C17542s.e(g10.c(), "android.resource");
        }

        /* renamed from: b */
        public j a(G g10, C8450q qVar, r rVar) {
            if (!c(g10)) {
                return null;
            }
            return new n(g10, qVar);
        }
    }

    public n(G g10, C8450q qVar) {
        this.f41392a = g10;
        this.f41393b = qVar;
    }

    private final Void b(G g10) {
        throw new IllegalStateException("Invalid android.resource URI: " + g10);
    }

    public Object a(C17164e<? super i> eVar) {
        Integer t10;
        String a10 = this.f41392a.a();
        if (a10 != null) {
            if (C15854t.v0(a10)) {
                a10 = null;
            }
            if (a10 != null) {
                String str = (String) C16877v.K0(H.f(this.f41392a));
                if (str == null || (t10 = C15854t.t(str)) == null) {
                    b(this.f41392a);
                    throw new C16820k();
                }
                int intValue = t10.intValue();
                Context c10 = this.f41393b.c();
                Resources resources = C17542s.e(a10, c10.getPackageName()) ? c10.getResources() : c10.getPackageManager().getResourcesForApplication(a10);
                TypedValue typedValue = new TypedValue();
                boolean z10 = true;
                resources.getValue(intValue, typedValue, true);
                String b10 = u.f55715a.b(typedValue.string.toString());
                if (C17542s.e(b10, "text/xml")) {
                    Drawable c11 = C17542s.e(a10, c10.getPackageName()) ? C8696d.c(c10, intValue) : C8696d.f(c10, resources, intValue);
                    boolean j10 = F.j(c11);
                    if (j10) {
                        g gVar = g.f55698a;
                        Bitmap.Config l10 = C8444k.l(this.f41393b);
                        h k10 = this.f41393b.k();
                        f j11 = this.f41393b.j();
                        if (this.f41393b.i() != C8531c.INEXACT) {
                            z10 = false;
                        }
                        c11 = new BitmapDrawable(c10.getResources(), gVar.a(c11, l10, k10, j11, z10));
                    }
                    return new l(T5.u.c(c11), j10, C6721f.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new o(t.a(y.d(y.l(resources.openRawResource(intValue, typedValue2))), this.f41393b.g(), new X5.u(a10, intValue, typedValue2.density)), b10, C6721f.DISK);
            }
        }
        b(this.f41392a);
        throw new C16820k();
    }
}
