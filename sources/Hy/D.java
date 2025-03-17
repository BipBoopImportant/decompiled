package Hy;

import By.C12674m;
import IC.C13023e;
import IC.C13026h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17974j;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHy/D;", "", "<init>", "()V", "", "number", "LIC/e;", "a", "(Ljava/lang/Integer;)LIC/e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public static final a f110841a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C17974j f110842b = new C17974j(1, 99);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LHy/D$a;", "", "<init>", "()V", "", "MIN", "I", "MAX", "LtI/j;", "VALID_RANGE", "LtI/j;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final C13023e a(Integer num) {
        if (num == null || num.intValue() < 1) {
            return null;
        }
        return f110842b.A(num.intValue()) ? C13026h.c(num.toString()) : C13026h.a(C12674m.f108280g0);
    }
}
