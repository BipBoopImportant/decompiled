package V1;

import U0.A1;
import U0.C4899r0;
import U0.o1;
import androidx.emoji2.text.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"LV1/m;", "LV1/p;", "<init>", "()V", "LU0/A1;", "", "c", "()LU0/A1;", "a", "LU0/A1;", "loadState", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m implements p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public A1<Boolean> f14583a;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"V1/m$a", "Landroidx/emoji2/text/f$f;", "LXH/N;", "b", "()V", "", "throwable", "a", "(Ljava/lang/Throwable;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends f.C0335f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f14584a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f14585b;

        a(C4899r0<Boolean> r0Var, m mVar) {
            this.f14584a = r0Var;
            this.f14585b = mVar;
        }

        public void a(Throwable th2) {
            this.f14585b.f14583a = q.f14590a;
        }

        public void b() {
            this.f14584a.setValue(Boolean.TRUE);
            this.f14585b.f14583a = new r(true);
        }
    }

    public m() {
        this.f14583a = f.k() ? c() : null;
    }

    private final A1<Boolean> c() {
        f c10 = f.c();
        if (c10.g() == 1) {
            return new r(true);
        }
        C4899r0 j10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        c10.v(new a(j10, this));
        return j10;
    }

    public A1<Boolean> a() {
        A1<Boolean> a12 = this.f14583a;
        if (a12 != null) {
            C17542s.g(a12);
            return a12;
        } else if (!f.k()) {
            return q.f14590a;
        } else {
            A1<Boolean> c10 = c();
            this.f14583a = c10;
            C17542s.g(c10);
            return c10;
        }
    }
}
