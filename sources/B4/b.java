package B4;

import U0.C4910x;
import U0.I0;
import androidx.fragment.app.C5187o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"LU0/I0;", "Landroidx/fragment/app/o;", "a", "LU0/I0;", "()LU0/I0;", "LocalFragment", "navigation-fragment-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C5187o> f33132a = C4910x.f(a.f33133c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f33133c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5187o invoke() {
            throw new IllegalStateException("CompositionLocal Fragment not present: are you sure your composable is within a navigation-fragment-compose provided ComposableFragment?");
        }
    }

    public static final I0<C5187o> a() {
        return f33132a;
    }
}
