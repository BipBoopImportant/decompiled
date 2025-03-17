package ej;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0011"}, d2 = {"Lej/d;", "", "Ljava/util/Date;", "from", "to", "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "a", "Ljava/util/Date;", "getFrom", "()Ljava/util/Date;", "b", "getTo", "", "()J", "milliSecondsInbetween", "c", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.d  reason: case insensitive filesystem */
public final class C11246d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f97123c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f97124d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Date f97125a;

    /* renamed from: b  reason: collision with root package name */
    private final Date f97126b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lej/d$a;", "", "<init>", "()V", "Ljava/util/Date;", "from", "to", "Lej/d;", "a", "(Ljava/util/Date;Ljava/util/Date;)Lej/d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ej.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C11246d a(Date date, Date date2) {
            C17542s.j(date, "from");
            C17542s.j(date2, "to");
            if (date.before(date2)) {
                return new C11246d(date, date2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Start date must be before end date");
        }

        private a() {
        }
    }

    public /* synthetic */ C11246d(Date date, Date date2, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, date2);
    }

    public final long a() {
        return this.f97126b.getTime() - this.f97125a.getTime();
    }

    private C11246d(Date date, Date date2) {
        this.f97125a = date;
        this.f97126b = date2;
    }
}
