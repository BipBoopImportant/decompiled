package Bg;

import android.content.SharedPreferences;
import androidx.lifecycle.F;
import ip.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tf.C10253a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LBg/a;", "", "LBg/d;", "event", "LXH/N;", "a", "(LBg/d;)V", "c", "()V", "Landroidx/lifecycle/F;", "Lip/d;", "", "b", "()Landroidx/lifecycle/F;", "triggerRatingFlow", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0963a f58907a = C0963a.f58908a;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LBg/a$a;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", "Ltf/a;", "killSwitchRepository", "LXH/N;", "b", "(Landroid/content/SharedPreferences;Ltf/a;)V", "LBg/d;", "event", "d", "(LBg/d;)V", "c", "LBg/a;", "LBg/a;", "instance", "Landroidx/lifecycle/F;", "Lip/d;", "", "a", "()Landroidx/lifecycle/F;", "triggerRatingFlow", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bg.a$a  reason: collision with other inner class name */
    public static final class C0963a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0963a f58908a = new C0963a();

        /* renamed from: b  reason: collision with root package name */
        private static volatile a f58909b;

        private C0963a() {
        }

        public final F<d<Boolean>> a() {
            a aVar = f58909b;
            if (aVar == null) {
                C17542s.z("instance");
                aVar = null;
            }
            return aVar.b();
        }

        public final void b(SharedPreferences sharedPreferences, C10253a aVar) {
            C17542s.j(sharedPreferences, "preferences");
            C17542s.j(aVar, "killSwitchRepository");
            f58909b = new c(new f(sharedPreferences), aVar);
        }

        public final void c() {
            a aVar = f58909b;
            if (aVar == null) {
                C17542s.z("instance");
                aVar = null;
            }
            aVar.c();
        }

        public final void d(d dVar) {
            C17542s.j(dVar, "event");
            a aVar = f58909b;
            if (aVar == null) {
                C17542s.z("instance");
                aVar = null;
            }
            aVar.a(dVar);
        }
    }

    void a(d dVar);

    F<d<Boolean>> b();

    void c();
}
