package ll;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lll/a;", "", "<init>", "()V", "b", "a", "c", "Lll/a$a;", "Lll/a$b;", "Lll/a$c;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ll.a  reason: case insensitive filesystem */
public abstract class C11549a {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lll/a$a;", "Lll/a;", "", "widthFactor", "height", "heightFactor", "", "centerVertically", "<init>", "(FLjava/lang/Float;FZ)V", "a", "F", "d", "()F", "b", "Ljava/lang/Float;", "()Ljava/lang/Float;", "c", "Z", "()Z", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ll.a$a  reason: collision with other inner class name */
    public static final class C2252a extends C11549a {

        /* renamed from: a  reason: collision with root package name */
        private final float f99200a;

        /* renamed from: b  reason: collision with root package name */
        private final Float f99201b;

        /* renamed from: c  reason: collision with root package name */
        private final float f99202c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f99203d;

        public C2252a() {
            this(0.0f, (Float) null, 0.0f, false, 15, (DefaultConstructorMarker) null);
        }

        public final boolean a() {
            return this.f99203d;
        }

        public final Float b() {
            return this.f99201b;
        }

        public final float c() {
            return this.f99202c;
        }

        public final float d() {
            return this.f99200a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2252a(float f10, Float f11, float f12, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? null : f11, (i10 & 4) != 0 ? 1.0f : f12, (i10 & 8) != 0 ? false : z10);
        }

        public C2252a(float f10, Float f11, float f12, boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f99200a = f10;
            this.f99201b = f11;
            this.f99202c = f12;
            this.f99203d = z10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lll/a$b;", "Lll/a;", "<init>", "()V", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ll.a$b */
    public static final class b extends C11549a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f99204a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lll/a$c;", "Lll/a;", "", "radius", "<init>", "(F)V", "a", "F", "()F", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ll.a$c */
    public static final class c extends C11549a {

        /* renamed from: a  reason: collision with root package name */
        private final float f99205a;

        public c(float f10) {
            super((DefaultConstructorMarker) null);
            this.f99205a = f10;
        }

        public final float a() {
            return this.f99205a;
        }
    }

    public /* synthetic */ C11549a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C11549a() {
    }
}
