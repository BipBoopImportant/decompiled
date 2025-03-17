package m0;

import YH.C16877v;
import YH.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm0/q;", "V", "Lm0/C0;", "", "playTimeMillis", "start", "end", "startVelocity", "d", "(Lm0/C0;JLm0/q;Lm0/q;Lm0/q;)Lm0/q;", "Lm0/F0;", "playTime", "b", "(Lm0/F0;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Lm0/s;", "c", "(Lm0/q;FF)Lm0/s;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class D0 {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"m0/D0$a", "Lm0/s;", "", "index", "Lm0/S;", "a", "(I)Lm0/S;", "", "Ljava/util/List;", "anims", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C5563s {

        /* renamed from: a  reason: collision with root package name */
        private final List<S> f25532a;

        a(V v10, float f10, float f11) {
            C17974j w10 = C17978n.w(0, v10.b());
            ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
            Iterator it = w10.iterator();
            while (it.hasNext()) {
                arrayList.add(new S(f10, f11, v10.a(((U) it).c())));
            }
            this.f25532a = arrayList;
        }

        /* renamed from: a */
        public S get(int i10) {
            return this.f25532a.get(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"m0/D0$b", "Lm0/s;", "", "index", "Lm0/S;", "a", "(I)Lm0/S;", "Lm0/S;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C5563s {

        /* renamed from: a  reason: collision with root package name */
        private final S f25533a;

        b(float f10, float f11) {
            this.f25533a = new S(f10, f11, 0.0f, 4, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public S get(int i10) {
            return this.f25533a;
        }
    }

    public static final long b(F0<?> f02, long j10) {
        return C17978n.o(j10 - ((long) f02.f()), 0, (long) f02.b());
    }

    /* access modifiers changed from: private */
    public static final <V extends C5562q> C5563s c(V v10, float f10, float f11) {
        return v10 != null ? new a(v10, f10, f11) : new b(f10, f11);
    }

    public static final <V extends C5562q> V d(C0<V> c02, long j10, V v10, V v11, V v12) {
        return c02.d(j10 * 1000000, v10, v11, v12);
    }
}
