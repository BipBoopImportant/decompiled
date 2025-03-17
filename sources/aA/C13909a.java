package aA;

import TJ.C16532g;
import XH.C16807N;
import android.app.Activity;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0010J$\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0014\u0010 \u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0007R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0004R\u0014\u0010,\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"LaA/a;", "", "", "h", "()Ljava/lang/String;", "LTJ/g;", "getToken", "()LTJ/g;", "b", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "l", "()V", "Landroid/app/Activity;", "activity", "g", "(Landroid/app/Activity;)V", "e", "", "refreshTokenFailed", "triggerLogoutEvent", "m", "(ZZLdI/e;)Ljava/lang/Object;", "c", "()Z", "isLoggedIn", "n", "isLoggedInFlow", "k", "i", "hasFamilyPrivileges", "d", "isEmployee", "j", "isEmployeeFlow", "f", "hasFamilyPrivilegesFlow", "LaA/b;", "p", "userStateFlow", "a", "icmId", "o", "()LaA/b;", "userState", "usersession_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aA.a  reason: case insensitive filesystem */
public interface C13909a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aA.a$a  reason: collision with other inner class name */
    public static final class C2951a {
        public static /* synthetic */ Object a(C13909a aVar, boolean z10, boolean z11, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return aVar.m(z10, z11, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
        }
    }

    String a();

    Object b(C17164e<? super String> eVar);

    boolean c();

    boolean d();

    void e(Activity activity);

    C16532g<Boolean> f();

    void g(Activity activity);

    C16532g<String> getToken();

    String h();

    boolean i();

    boolean isLoggedIn();

    C16532g<Boolean> j();

    C16532g<Boolean> k();

    void l();

    Object m(boolean z10, boolean z11, C17164e<? super C16807N> eVar);

    C16532g<Boolean> n();

    C13910b o();

    C16532g<C13910b> p();
}
