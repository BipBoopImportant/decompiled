package A1;

import androidx.compose.ui.platform.w1;
import c2.d;
import dI.C17164e;
import kotlin.Metadata;
import nI.p;
import o1.C5673m;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH@¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00158VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"LA1/c;", "Lc2/d;", "LA1/r;", "pass", "LA1/p;", "B1", "(LA1/r;LdI/e;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "LdI/e;", "", "block", "w1", "(JLnI/p;LdI/e;)Ljava/lang/Object;", "S", "Lc2/r;", "a", "()J", "size", "Lo1/m;", "G0", "extendedTouchPadding", "b1", "()LA1/p;", "currentEvent", "Landroidx/compose/ui/platform/w1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/w1;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.c  reason: case insensitive filesystem */
public interface C4336c extends d {
    static /* synthetic */ Object J1(C4336c cVar, r rVar, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                rVar = r.Main;
            }
            return cVar.B1(rVar, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    Object B1(r rVar, C17164e<? super C4349p> eVar);

    long G0() {
        return C5673m.f26722b.b();
    }

    <T> Object S(long j10, p<? super C4336c, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        return pVar.invoke(this, eVar);
    }

    long a();

    C4349p b1();

    w1 getViewConfiguration();

    <T> Object w1(long j10, p<? super C4336c, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        return pVar.invoke(this, eVar);
    }
}
