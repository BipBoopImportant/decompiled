package rK;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LrK/z;", "", "<init>", "()V", "a", "b", "c", "LrK/z$a;", "LrK/z$b;", "LrK/z$c;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
abstract class z {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0007\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"LrK/z$a;", "LrK/z;", "", "zoomChange", "Lo1/g;", "panChange", "rotationChange", "centroid", "<init>", "(FJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "F", "d", "()F", "b", "J", "()J", "c", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends z {

        /* renamed from: a  reason: collision with root package name */
        private final float f146869a;

        /* renamed from: b  reason: collision with root package name */
        private final long f146870b;

        /* renamed from: c  reason: collision with root package name */
        private final float f146871c;

        /* renamed from: d  reason: collision with root package name */
        private final long f146872d;

        public /* synthetic */ a(float f10, long j10, float f11, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, j10, f11, j11);
        }

        public final long a() {
            return this.f146872d;
        }

        public final long b() {
            return this.f146870b;
        }

        public final float c() {
            return this.f146871c;
        }

        public final float d() {
            return this.f146869a;
        }

        private a(float f10, long j10, float f11, long j11) {
            super((DefaultConstructorMarker) null);
            this.f146869a = f10;
            this.f146870b = j10;
            this.f146871c = f11;
            this.f146872d = j11;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LrK/z$b;", "LrK/z;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends z {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146873a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1086331737;
        }

        public String toString() {
            return "TransformStarted";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"LrK/z$c;", "LrK/z;", "Lc2/y;", "velocity", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends z {

        /* renamed from: a  reason: collision with root package name */
        private final long f146874a;

        public /* synthetic */ c(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        public final long a() {
            return this.f146874a;
        }

        private c(long j10) {
            super((DefaultConstructorMarker) null);
            this.f146874a = j10;
        }
    }

    public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private z() {
    }
}
