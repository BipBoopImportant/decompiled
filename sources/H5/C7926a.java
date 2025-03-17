package h5;

import androidx.window.extensions.layout.WindowLayoutComponent;
import d5.d;
import d5.e;
import g5.C7872a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh5/a;", "Lg5/a;", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h5.a  reason: case insensitive filesystem */
public final class C7926a implements C7872a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0849a f51637a = new C0849a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh5/a$a;", "", "<init>", "()V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Ld5/d;", "adapter", "Lg5/a;", "a", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Ld5/d;)Lg5/a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h5.a$a  reason: collision with other inner class name */
    public static final class C0849a {
        public /* synthetic */ C0849a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7872a a(WindowLayoutComponent windowLayoutComponent, d dVar) {
            C17542s.j(windowLayoutComponent, "component");
            C17542s.j(dVar, "adapter");
            int a10 = e.f50736a.a();
            return a10 >= 2 ? new C7930e(windowLayoutComponent) : a10 == 1 ? new C7929d(windowLayoutComponent, dVar) : new C7928c();
        }

        private C0849a() {
        }
    }
}
