package x0;

import XH.C16807N;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import n0.C5589L;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import v0.C6142h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lx0/C;", "state", "Lv0/h;", "a", "(Lx0/C;)Lv0/h;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0011\u001a\u00020\u00062\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001e"}, d2 = {"x0/q$a", "Lv0/h;", "Lp0/A;", "", "index", "scrollOffset", "LXH/N;", "e", "(Lp0/A;II)V", "targetIndex", "", "c", "(I)F", "Lkotlin/Function2;", "LdI/e;", "", "block", "d", "(LnI/p;LdI/e;)Ljava/lang/Object;", "h", "()I", "visibleItemsAverageSize", "g", "firstVisibleItemIndex", "f", "firstVisibleItemScrollOffset", "b", "lastVisibleItemIndex", "a", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C6142h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6230C f31751a;

        a(C6230C c10) {
            this.f31751a = c10;
        }

        private final int h() {
            return this.f31751a.H() + this.f31751a.J();
        }

        public int a() {
            return this.f31751a.G();
        }

        public int b() {
            return ((C6238f) C16877v.I0(this.f31751a.C().i())).getIndex();
        }

        public float c(int i10) {
            C6238f fVar;
            List<C6238f> i11 = this.f31751a.C().i();
            int size = i11.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    fVar = null;
                    break;
                }
                fVar = i11.get(i12);
                if (fVar.getIndex() == i10) {
                    break;
                }
                i12++;
            }
            C6238f fVar2 = fVar;
            return fVar2 == null ? (((float) (i10 - this.f31751a.v())) * ((float) h())) - (this.f31751a.w() * ((float) this.f31751a.I())) : (float) fVar2.c();
        }

        public Object d(p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
            Object a10 = C5681D.a(this.f31751a, (C5589L) null, pVar, eVar, 1, (Object) null);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }

        public void e(C5678A a10, int i10, int i11) {
            this.f31751a.l0(i10, ((float) i11) / ((float) this.f31751a.I()), true);
        }

        public int f() {
            return this.f31751a.z();
        }

        public int g() {
            return this.f31751a.y();
        }
    }

    public static final C6142h a(C6230C c10) {
        return new a(c10);
    }
}
