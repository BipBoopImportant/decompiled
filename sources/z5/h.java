package Z5;

import T5.r;
import T5.u;
import X5.C6721f;
import Z5.j;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import dI.C17164e;
import k6.C8444k;
import k6.C8450q;
import kotlin.Metadata;
import l6.C8531c;
import r6.F;
import r6.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LZ5/h;", "LZ5/j;", "Landroid/graphics/drawable/Drawable;", "data", "Lk6/q;", "options", "<init>", "(Landroid/graphics/drawable/Drawable;Lk6/q;)V", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "b", "Lk6/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f41383a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41384b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZ5/h$a;", "LZ5/j$a;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "data", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "(Landroid/graphics/drawable/Drawable;Lk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<Drawable> {
        /* renamed from: b */
        public j a(Drawable drawable, C8450q qVar, r rVar) {
            return new h(drawable, qVar);
        }
    }

    public h(Drawable drawable, C8450q qVar) {
        this.f41383a = drawable;
        this.f41384b = qVar;
    }

    public Object a(C17164e<? super i> eVar) {
        Drawable drawable;
        boolean j10 = F.j(this.f41383a);
        if (j10) {
            drawable = new BitmapDrawable(this.f41384b.c().getResources(), g.f55698a.a(this.f41383a, C8444k.l(this.f41384b), this.f41384b.k(), this.f41384b.j(), this.f41384b.i() == C8531c.INEXACT));
        } else {
            drawable = this.f41383a;
        }
        return new l(u.c(drawable), j10, C6721f.MEMORY);
    }
}
