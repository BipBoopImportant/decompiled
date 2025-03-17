package androidx.compose.ui.platform;

import A1.C4353u;
import A1.O;
import U0.C4899r0;
import U0.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058V@VX\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8W@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/D1;", "Landroidx/compose/ui/platform/C1;", "<init>", "()V", "LU0/r0;", "", "a", "LU0/r0;", "_isWindowFocused", "value", "()Z", "c", "(Z)V", "isWindowFocused", "LA1/O;", "getKeyboardModifiers-k7X9c1A", "()I", "b", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "keyboardModifiers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D1 implements C1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19180b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C4899r0<O> f19181c = u1.e(O.a(C4353u.a()), (o1) null, 2, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0<Boolean> f19182a = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/D1$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public boolean a() {
        return this.f19182a.getValue().booleanValue();
    }

    public void b(int i10) {
        f19181c.setValue(O.a(i10));
    }

    public void c(boolean z10) {
        this.f19182a.setValue(Boolean.valueOf(z10));
    }
}
