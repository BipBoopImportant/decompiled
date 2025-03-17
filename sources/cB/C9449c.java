package cb;

import Ya.C9364a;
import Ya.C9365b;
import com.google.android.play.core.install.InstallState;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcb/c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcb/c$a;", "Lcb/c$b;", "Lcb/c$c;", "Lcb/c$d;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: cb.c  reason: case insensitive filesystem */
public class C9449c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcb/c$a;", "Lcb/c;", "LYa/b;", "appUpdateManager", "LYa/a;", "updateInfo", "<init>", "(LYa/b;LYa/a;)V", "a", "LYa/b;", "b", "LYa/a;", "()LYa/a;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: cb.c$a */
    public static final class a extends C9449c {

        /* renamed from: a  reason: collision with root package name */
        private final C9365b f65675a;

        /* renamed from: b  reason: collision with root package name */
        private final C9364a f65676b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C9365b bVar, C9364a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "appUpdateManager");
            C17542s.j(aVar, "updateInfo");
            this.f65675a = bVar;
            this.f65676b = aVar;
        }

        public final C9364a a() {
            return this.f65676b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcb/c$b;", "Lcb/c;", "LYa/b;", "appUpdateManager", "<init>", "(LYa/b;)V", "a", "LYa/b;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: cb.c$b */
    public static final class b extends C9449c {

        /* renamed from: a  reason: collision with root package name */
        private final C9365b f65677a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C9365b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "appUpdateManager");
            this.f65677a = bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcb/c$c;", "Lcb/c;", "Lcom/google/android/play/core/install/InstallState;", "installState", "<init>", "(Lcom/google/android/play/core/install/InstallState;)V", "a", "Lcom/google/android/play/core/install/InstallState;", "()Lcom/google/android/play/core/install/InstallState;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: cb.c$c  reason: collision with other inner class name */
    public static final class C1158c extends C9449c {

        /* renamed from: a  reason: collision with root package name */
        private final InstallState f65678a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1158c(InstallState installState) {
            super((DefaultConstructorMarker) null);
            C17542s.j(installState, "installState");
            this.f65678a = installState;
        }

        public final InstallState a() {
            return this.f65678a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcb/c$d;", "Lcb/c;", "<init>", "()V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: cb.c$d */
    public static final class d extends C9449c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65679a = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }
    }

    private C9449c() {
    }

    public /* synthetic */ C9449c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
