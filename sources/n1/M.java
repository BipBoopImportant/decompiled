package N1;

import kotlin.Metadata;
import o1.C5669i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LN1/M;", "", "Lo1/i;", "textBounds", "rect", "", "a", "(Lo1/i;Lo1/i;)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface M {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9383a = a.f9384a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"LN1/M$a;", "", "<init>", "()V", "LN1/M;", "b", "LN1/M;", "g", "()LN1/M;", "AnyOverlap", "c", "getContainsAll", "ContainsAll", "d", "h", "ContainsCenter", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9384a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final M f9385b = new J();

        /* renamed from: c  reason: collision with root package name */
        private static final M f9386c = new K();

        /* renamed from: d  reason: collision with root package name */
        private static final M f9387d = new L();

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean d(C5669i iVar, C5669i iVar2) {
            return iVar.y(iVar2);
        }

        /* access modifiers changed from: private */
        public static final boolean e(C5669i iVar, C5669i iVar2) {
            return !iVar2.x() && iVar.o() >= iVar2.o() && iVar.p() <= iVar2.p() && iVar.r() >= iVar2.r() && iVar.j() <= iVar2.j();
        }

        /* access modifiers changed from: private */
        public static final boolean f(C5669i iVar, C5669i iVar2) {
            return iVar2.f(iVar.m());
        }

        public final M g() {
            return f9385b;
        }

        public final M h() {
            return f9387d;
        }
    }

    boolean a(C5669i iVar, C5669i iVar2);
}
