package G0;

import B0.N;
import E1.C4488v;
import H0.C4531i;
import H0.C4543v;
import H0.J;
import H0.M;
import H0.y;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import o1.C5667g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LH0/J;", "", "selectableId", "Lkotlin/Function0;", "LE1/v;", "layoutCoordinates", "Landroidx/compose/ui/d;", "b", "(LH0/J;JLnI/a;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bR(\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006R(\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0006\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"G0/h$a", "LB0/N;", "Lo1/g;", "point", "LXH/N;", "h", "(J)V", "j", "()V", "startPoint", "i", "delta", "k", "g", "onCancel", "a", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "b", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements N {

        /* renamed from: a  reason: collision with root package name */
        private long f6164a;

        /* renamed from: b  reason: collision with root package name */
        private long f6165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C4488v> f6166c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ J f6167d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f6168e;

        a(C17631a<? extends C4488v> aVar, J j10, long j11) {
            this.f6166c = aVar;
            this.f6167d = j10;
            this.f6168e = j11;
            C5667g.a aVar2 = C5667g.f26701b;
            this.f6164a = aVar2.c();
            this.f6165b = aVar2.c();
        }

        public void g() {
            if (M.b(this.f6167d, this.f6168e)) {
                this.f6167d.i();
            }
        }

        public void h(long j10) {
        }

        public void i(long j10) {
            C4488v invoke = this.f6166c.invoke();
            if (invoke != null) {
                J j11 = this.f6167d;
                if (invoke.c()) {
                    j11.e(invoke, j10, C4543v.f6972a.n(), true);
                    this.f6164a = j10;
                } else {
                    return;
                }
            }
            if (M.b(this.f6167d, this.f6168e)) {
                this.f6165b = C5667g.f26701b.c();
            }
        }

        public void j() {
        }

        public void k(long j10) {
            C4488v invoke = this.f6166c.invoke();
            if (invoke != null) {
                J j11 = this.f6167d;
                long j12 = this.f6168e;
                if (invoke.c() && M.b(j11, j12)) {
                    long r10 = C5667g.r(this.f6165b, j10);
                    this.f6165b = r10;
                    long r11 = C5667g.r(this.f6164a, r10);
                    if (j11.h(invoke, r11, this.f6164a, false, C4543v.f6972a.n(), true)) {
                        this.f6164a = r11;
                        this.f6165b = C5667g.f26701b.c();
                    }
                }
            }
        }

        public void onCancel() {
            if (M.b(this.f6167d, this.f6168e)) {
                this.f6167d.i();
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"G0/h$b", "LH0/i;", "Lo1/g;", "downPosition", "", "e", "(J)Z", "dragPosition", "d", "LH0/v;", "adjustment", "b", "(JLH0/v;)Z", "c", "LXH/N;", "a", "()V", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C4531i {

        /* renamed from: a  reason: collision with root package name */
        private long f6169a = C5667g.f26701b.c();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C4488v> f6170b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f6171c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f6172d;

        b(C17631a<? extends C4488v> aVar, J j10, long j11) {
            this.f6170b = aVar;
            this.f6171c = j10;
            this.f6172d = j11;
        }

        public void a() {
            this.f6171c.i();
        }

        public boolean b(long j10, C4543v vVar) {
            C4488v invoke = this.f6170b.invoke();
            if (invoke == null) {
                return false;
            }
            J j11 = this.f6171c;
            long j12 = this.f6172d;
            if (!invoke.c()) {
                return false;
            }
            j11.e(invoke, j10, vVar, false);
            this.f6169a = j10;
            return M.b(j11, j12);
        }

        public boolean c(long j10, C4543v vVar) {
            C4488v invoke = this.f6170b.invoke();
            if (invoke == null) {
                return true;
            }
            J j11 = this.f6171c;
            long j12 = this.f6172d;
            if (!invoke.c() || !M.b(j11, j12)) {
                return false;
            }
            if (!j11.h(invoke, j10, this.f6169a, false, vVar, false)) {
                return true;
            }
            this.f6169a = j10;
            return true;
        }

        public boolean d(long j10) {
            C4488v invoke = this.f6170b.invoke();
            if (invoke == null) {
                return true;
            }
            J j11 = this.f6171c;
            long j12 = this.f6172d;
            if (!invoke.c() || !M.b(j11, j12)) {
                return false;
            }
            if (!j11.h(invoke, j10, this.f6169a, false, C4543v.f6972a.l(), false)) {
                return true;
            }
            this.f6169a = j10;
            return true;
        }

        public boolean e(long j10) {
            C4488v invoke = this.f6170b.invoke();
            if (invoke == null) {
                return false;
            }
            J j11 = this.f6171c;
            long j12 = this.f6172d;
            if (!invoke.c()) {
                return false;
            }
            if (j11.h(invoke, j10, this.f6169a, false, C4543v.f6972a.l(), false)) {
                this.f6169a = j10;
            }
            return M.b(j11, j12);
        }
    }

    /* access modifiers changed from: private */
    public static final d b(J j10, long j11, C17631a<? extends C4488v> aVar) {
        a aVar2 = new a(aVar, j10, j11);
        return y.i(d.f18749a, new b(aVar, j10, j11), aVar2);
    }
}
