package androidx.work;

import YH.C16877v;
import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l5.O;
import ob.C10101e;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000  2\u00020\u0001:\u0002 \"B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\tH&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\"\u0010!J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\t0#2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/work/S;", "", "<init>", "()V", "Landroidx/work/T;", "request", "Landroidx/work/C;", "d", "(Landroidx/work/T;)Landroidx/work/C;", "", "requests", "e", "(Ljava/util/List;)Landroidx/work/C;", "", "uniqueWorkName", "Landroidx/work/k;", "existingWorkPolicy", "Landroidx/work/B;", "g", "(Ljava/lang/String;Landroidx/work/k;Landroidx/work/B;)Landroidx/work/C;", "h", "(Ljava/lang/String;Landroidx/work/k;Ljava/util/List;)Landroidx/work/C;", "Landroidx/work/j;", "existingPeriodicWorkPolicy", "Landroidx/work/I;", "f", "(Ljava/lang/String;Landroidx/work/j;Landroidx/work/I;)Landroidx/work/C;", "Ljava/util/UUID;", "id", "c", "(Ljava/util/UUID;)Landroidx/work/C;", "tag", "a", "(Ljava/lang/String;)Landroidx/work/C;", "b", "Lob/e;", "Landroidx/work/Q;", "j", "(Ljava/util/UUID;)Lob/e;", "k", "(Ljava/lang/String;)Lob/e;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45094a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/work/S$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/work/S;", "a", "(Landroid/content/Context;)Landroidx/work/S;", "Landroidx/work/c;", "configuration", "LXH/N;", "b", "(Landroid/content/Context;Landroidx/work/c;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public S a(Context context) {
            C17542s.j(context, "context");
            O r10 = O.r(context);
            C17542s.i(r10, "getInstance(context)");
            return r10;
        }

        public void b(Context context, C7034c cVar) {
            C17542s.j(context, "context");
            C17542s.j(cVar, "configuration");
            O.l(context, cVar);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/S$b;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    public static S i(Context context) {
        return f45094a.a(context);
    }

    public static void l(Context context, C7034c cVar) {
        f45094a.b(context, cVar);
    }

    public abstract C a(String str);

    public abstract C b(String str);

    public abstract C c(UUID uuid);

    public final C d(T t10) {
        C17542s.j(t10, "request");
        return e(C16877v.e(t10));
    }

    public abstract C e(List<? extends T> list);

    public abstract C f(String str, C7041j jVar, I i10);

    public C g(String str, C7042k kVar, B b10) {
        C17542s.j(str, "uniqueWorkName");
        C17542s.j(kVar, "existingWorkPolicy");
        C17542s.j(b10, "request");
        return h(str, kVar, C16877v.e(b10));
    }

    public abstract C h(String str, C7042k kVar, List<B> list);

    public abstract C10101e<Q> j(UUID uuid);

    public abstract C10101e<List<Q>> k(String str);
}
