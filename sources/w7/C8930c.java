package w7;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lw7/c;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "b", "c", "d", "Lw7/c$a;", "Lw7/c$b;", "Lw7/c$c;", "Lw7/c$d;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w7.c  reason: case insensitive filesystem */
public abstract class C8930c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw7/c$a;", "Lw7/c;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w7.c$a */
    public static final class a extends C8930c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f57338a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw7/c$b;", "Lw7/c;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w7.c$b */
    public static final class b extends C8930c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f57339a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw7/c$c;", "Lw7/c;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w7.c$c  reason: collision with other inner class name */
    public static final class C0922c extends C8930c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0922c f57340a = new C0922c();

        private C0922c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw7/c$d;", "Lw7/c;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w7.c$d */
    public static final class d extends C8930c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f57341a = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C8930c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        if (C17542s.e(this, b.f57339a)) {
            return "GET";
        }
        if (C17542s.e(this, d.f57341a)) {
            return "POST";
        }
        if (C17542s.e(this, C0922c.f57340a)) {
            return "PATCH";
        }
        if (C17542s.e(this, a.f57338a)) {
            return "DELETE";
        }
        throw new t();
    }

    private C8930c() {
    }
}
