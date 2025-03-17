package f5;

import XH.u;
import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lf5/m;", "", "Landroid/app/Activity;", "activity", "Lf5/l;", "b", "(Landroid/app/Activity;)Lf5/l;", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Lf5/l;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51166a = a.f51167a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf5/m$a;", "", "<init>", "()V", "Lf5/m;", "a", "()Lf5/m;", "Lkotlin/Function1;", "b", "LnI/l;", "decorator", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f51167a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static C17642l<? super m, ? extends m> f51168b = C0843a.f51169c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/m;", "it", "a", "(Lf5/m;)Lf5/m;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: f5.m$a$a  reason: collision with other inner class name */
        static final class C0843a extends C17544u implements C17642l<m, m> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0843a f51169c = new C0843a();

            C0843a() {
                super(1);
            }

            /* renamed from: a */
            public final m invoke(m mVar) {
                C17542s.j(mVar, "it");
                return mVar;
            }
        }

        private a() {
        }

        public final m a() {
            return (m) f51168b.invoke(p.f51170b);
        }
    }

    l a(Context context) {
        C17542s.j(context, "context");
        throw new u("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    l b(Activity activity);
}
