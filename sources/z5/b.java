package Z5;

import T5.r;
import T5.u;
import X5.C6721f;
import Z5.j;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import dI.C17164e;
import k6.C8450q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LZ5/b;", "LZ5/j;", "Landroid/graphics/Bitmap;", "data", "Lk6/q;", "options", "<init>", "(Landroid/graphics/Bitmap;Lk6/q;)V", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "b", "Lk6/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f41370a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41371b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZ5/b$a;", "LZ5/j$a;", "Landroid/graphics/Bitmap;", "<init>", "()V", "data", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "(Landroid/graphics/Bitmap;Lk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<Bitmap> {
        /* renamed from: b */
        public j a(Bitmap bitmap, C8450q qVar, r rVar) {
            return new b(bitmap, qVar);
        }
    }

    public b(Bitmap bitmap, C8450q qVar) {
        this.f41370a = bitmap;
        this.f41371b = qVar;
    }

    public Object a(C17164e<? super i> eVar) {
        return new l(u.c(new BitmapDrawable(this.f41371b.c().getResources(), this.f41370a)), false, C6721f.MEMORY);
    }
}
