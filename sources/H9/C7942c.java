package h9;

import XH.C16814e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lh9/c;", "", "<init>", "()V", "a", "b", "c", "Lh9/c$a;", "Lh9/c$b;", "Lh9/c$c;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
/* renamed from: h9.c  reason: case insensitive filesystem */
public abstract class C7942c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f51669a = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh9/c$a;", "Lh9/c;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.c$a */
    public static final class a extends C7942c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f51670b = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh9/c$b;", "Lh9/c;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.c$b */
    public static final class b extends C7942c {

        /* renamed from: b  reason: collision with root package name */
        public static final b f51671b = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh9/c$c;", "Lh9/c;", "", "progress", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getProgress", "()F", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.c$c  reason: collision with other inner class name */
    public static final class C0850c extends C7942c {

        /* renamed from: b  reason: collision with root package name */
        private final float f51672b;

        public C0850c(float f10) {
            super((DefaultConstructorMarker) null);
            this.f51672b = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0850c) && Float.compare(this.f51672b, ((C0850c) obj).f51672b) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f51672b);
        }

        public String toString() {
            return "Loading(progress=" + this.f51672b + ')';
        }
    }

    public /* synthetic */ C7942c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C7942c() {
    }
}
