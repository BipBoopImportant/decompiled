package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0001\u0003\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/a;", "", "", "value", "d", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0292a f18902a = new C0292a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f18903b = d(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f18904c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f18905d = d(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/a$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/a;", "Auto", "I", "a", "()I", "Offscreen", "c", "ModulateAlpha", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.a$a  reason: collision with other inner class name */
    public static final class C0292a {
        public /* synthetic */ C0292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f18903b;
        }

        public final int b() {
            return a.f18905d;
        }

        public final int c() {
            return a.f18904c;
        }

        private C0292a() {
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }
}
