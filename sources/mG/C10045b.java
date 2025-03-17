package mg;

import Ae.f;
import Ae.r;
import Ae.s;
import QJ.Q;
import Se.e;
import Se.l;
import YH.g0;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import up.C12074d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmg/b;", "", "a", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mg.b  reason: case insensitive filesystem */
public abstract class C10045b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75404a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lmg/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lup/d;", "userConsentRepository", "LEe/a;", "a", "(Landroid/content/Context;Lup/d;)LEe/a;", "", "LAe/r;", "mappers", "LAe/e;", "analytics", "LAe/s;", "d", "(Ljava/util/Set;LAe/e;)LAe/s;", "LAe/a;", "c", "()Ljava/util/Set;", "LQJ/Q;", "applicationScope", "interceptorSet", "analyticsEnabledUseCase", "LAe/f;", "b", "(Landroid/content/Context;LQJ/Q;Ljava/util/Set;LEe/a;)LAe/f;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mg.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ee.a a(Context context, C12074d dVar) {
            C17542s.j(context, "context");
            C17542s.j(dVar, "userConsentRepository");
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
            C17542s.i(instance, "getInstance(...)");
            return new Ue.a(dVar, instance);
        }

        public final f b(Context context, Q q10, Set<Ae.a> set, Ee.a aVar) {
            C17542s.j(context, "context");
            C17542s.j(q10, "applicationScope");
            C17542s.j(set, "interceptorSet");
            C17542s.j(aVar, "analyticsEnabledUseCase");
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
            C17542s.i(instance, "getInstance(...)");
            return new e(instance, set, aVar, q10);
        }

        public final Set<Ae.a> c() {
            return g0.d();
        }

        public final s d(Set<r> set, Ae.e eVar) {
            C17542s.j(set, "mappers");
            C17542s.j(eVar, "analytics");
            return new l(set, eVar);
        }

        private a() {
        }
    }
}
