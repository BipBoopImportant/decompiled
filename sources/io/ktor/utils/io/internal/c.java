package io.ktor.utils.io.internal;

import io.ktor.utils.io.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/internal/c;", "", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "c", "sendException", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f143739b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f143740c = new c((Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f143741a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/internal/c$a;", "", "<init>", "()V", "Lio/ktor/utils/io/internal/c;", "EmptyCause", "Lio/ktor/utils/io/internal/c;", "a", "()Lio/ktor/utils/io/internal/c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f143740c;
        }

        private a() {
        }
    }

    public c(Throwable th2) {
        this.f143741a = th2;
    }

    public final Throwable b() {
        return this.f143741a;
    }

    public final Throwable c() {
        Throwable th2 = this.f143741a;
        return th2 == null ? new p("The channel was closed") : th2;
    }

    public String toString() {
        return "Closed[" + c() + ']';
    }
}
