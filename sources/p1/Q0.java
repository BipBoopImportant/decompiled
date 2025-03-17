package p1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5669i;
import o1.C5671k;
import o1.C5672l;
import p1.U0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lp1/Q0;", "", "<init>", "()V", "Lo1/i;", "a", "()Lo1/i;", "bounds", "b", "c", "Lp1/Q0$a;", "Lp1/Q0$b;", "Lp1/Q0$c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Q0 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Lp1/Q0$a;", "Lp1/Q0;", "Lp1/U0;", "path", "<init>", "(Lp1/U0;)V", "a", "Lp1/U0;", "b", "()Lp1/U0;", "Lo1/i;", "()Lo1/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Q0 {

        /* renamed from: a  reason: collision with root package name */
        private final U0 f27237a;

        public a(U0 u02) {
            super((DefaultConstructorMarker) null);
            this.f27237a = u02;
        }

        public C5669i a() {
            return this.f27237a.getBounds();
        }

        public final U0 b() {
            return this.f27237a;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lp1/Q0$b;", "Lp1/Q0;", "Lo1/i;", "rect", "<init>", "(Lo1/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lo1/i;", "b", "()Lo1/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Q0 {

        /* renamed from: a  reason: collision with root package name */
        private final C5669i f27238a;

        public b(C5669i iVar) {
            super((DefaultConstructorMarker) null);
            this.f27238a = iVar;
        }

        public C5669i a() {
            return this.f27238a;
        }

        public final C5669i b() {
            return this.f27238a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f27238a, ((b) obj).f27238a);
        }

        public int hashCode() {
            return this.f27238a.hashCode();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Lp1/Q0$c;", "Lp1/Q0;", "Lo1/k;", "roundRect", "<init>", "(Lo1/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lo1/k;", "b", "()Lo1/k;", "Lp1/U0;", "Lp1/U0;", "c", "()Lp1/U0;", "roundRectPath", "Lo1/i;", "()Lo1/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends Q0 {

        /* renamed from: a  reason: collision with root package name */
        private final C5671k f27239a;

        /* renamed from: b  reason: collision with root package name */
        private final U0 f27240b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5671k kVar) {
            super((DefaultConstructorMarker) null);
            U0 u02 = null;
            this.f27239a = kVar;
            if (!C5672l.h(kVar)) {
                U0 a10 = Y.a();
                U0.s(a10, kVar, (U0.b) null, 2, (Object) null);
                u02 = a10;
            }
            this.f27240b = u02;
        }

        public C5669i a() {
            return C5672l.g(this.f27239a);
        }

        public final C5671k b() {
            return this.f27239a;
        }

        public final U0 c() {
            return this.f27240b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f27239a, ((c) obj).f27239a);
        }

        public int hashCode() {
            return this.f27239a.hashCode();
        }
    }

    public /* synthetic */ Q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C5669i a();

    private Q0() {
    }
}
