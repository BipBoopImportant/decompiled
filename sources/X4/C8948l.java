package x4;

import P4.f;
import XH.C16824o;
import XH.C16825p;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.C5198a;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003+-3BS\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0000\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00107R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010*R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010@R\u0016\u0010C\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010BR\u001b\u0010G\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\b1\u0010E\u001a\u0004\b5\u0010FR\u001b\u0010K\u001a\u00020H8GX\u0002¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\b<\u0010JR*\u0010O\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000b8G@GX\u000e¢\u0006\u0012\n\u0004\b\u001c\u00106\u001a\u0004\b:\u0010M\"\u0004\bI\u0010NR\u001a\u0010U\u001a\u00020P8\u0016X\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b3\u0010VR\u0014\u0010Z\u001a\u00020W8VX\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8VX\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8VX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lx4/l;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/o;", "LP4/f;", "Landroid/content/Context;", "context", "Lx4/v;", "destination", "Landroid/os/Bundle;", "immutableArgs", "Landroidx/lifecycle/r$b;", "hostLifecycleState", "Lx4/G;", "viewModelStoreProvider", "", "id", "savedState", "<init>", "(Landroid/content/Context;Lx4/v;Landroid/os/Bundle;Landroidx/lifecycle/r$b;Lx4/G;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "arguments", "(Lx4/l;Landroid/os/Bundle;)V", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "i", "(Landroidx/lifecycle/r$a;)V", "m", "()V", "outBundle", "j", "(Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/content/Context;", "b", "Lx4/v;", "e", "()Lx4/v;", "k", "(Lx4/v;)V", "c", "Landroid/os/Bundle;", "d", "Landroidx/lifecycle/r$b;", "Lx4/G;", "f", "Ljava/lang/String;", "g", "Landroidx/lifecycle/A;", "h", "Landroidx/lifecycle/A;", "_lifecycle", "LP4/e;", "LP4/e;", "savedStateRegistryController", "Z", "savedStateRegistryAttached", "Landroidx/lifecycle/a0;", "LXH/o;", "()Landroidx/lifecycle/a0;", "defaultFactory", "Landroidx/lifecycle/U;", "l", "()Landroidx/lifecycle/U;", "savedStateHandle", "maxState", "()Landroidx/lifecycle/r$b;", "(Landroidx/lifecycle/r$b;)V", "maxLifecycle", "Landroidx/lifecycle/i0$c;", "n", "Landroidx/lifecycle/i0$c;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/i0$c;", "defaultViewModelProviderFactory", "()Landroid/os/Bundle;", "Landroidx/lifecycle/r;", "getLifecycle", "()Landroidx/lifecycle/r;", "lifecycle", "Landroidx/lifecycle/j0;", "getViewModelStore", "()Landroidx/lifecycle/j0;", "viewModelStore", "Ll3/a;", "getDefaultViewModelCreationExtras", "()Ll3/a;", "defaultViewModelCreationExtras", "LP4/d;", "getSavedStateRegistry", "()LP4/d;", "savedStateRegistry", "o", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x4.l  reason: case insensitive filesystem */
public final class C8948l implements C5221y, k0, C5212o, f {

    /* renamed from: o  reason: collision with root package name */
    public static final a f57521o = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f57522a;

    /* renamed from: b  reason: collision with root package name */
    private v f57523b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f57524c;

    /* renamed from: d  reason: collision with root package name */
    private r.b f57525d;

    /* renamed from: e  reason: collision with root package name */
    private final G f57526e;

    /* renamed from: f  reason: collision with root package name */
    private final String f57527f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f57528g;

    /* renamed from: h  reason: collision with root package name */
    private A f57529h;

    /* renamed from: i  reason: collision with root package name */
    private final P4.e f57530i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f57531j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f57532k;

    /* renamed from: l  reason: collision with root package name */
    private final C16824o f57533l;

    /* renamed from: m  reason: collision with root package name */
    private r.b f57534m;

    /* renamed from: n  reason: collision with root package name */
    private final i0.c f57535n;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx4/l$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lx4/v;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/r$b;", "hostLifecycleState", "Lx4/G;", "viewModelStoreProvider", "", "id", "savedState", "Lx4/l;", "a", "(Landroid/content/Context;Lx4/v;Landroid/os/Bundle;Landroidx/lifecycle/r$b;Lx4/G;Ljava/lang/String;Landroid/os/Bundle;)Lx4/l;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C8948l b(a aVar, Context context, v vVar, Bundle bundle, r.b bVar, G g10, String str, Bundle bundle2, int i10, Object obj) {
            String str2;
            Bundle bundle3 = (i10 & 4) != 0 ? null : bundle;
            r.b bVar2 = (i10 & 8) != 0 ? r.b.CREATED : bVar;
            G g11 = (i10 & 16) != 0 ? null : g10;
            if ((i10 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                C17542s.i(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return aVar.a(context, vVar, bundle3, bVar2, g11, str2, (i10 & 64) != 0 ? null : bundle2);
        }

        public final C8948l a(Context context, v vVar, Bundle bundle, r.b bVar, G g10, String str, Bundle bundle2) {
            C17542s.j(vVar, "destination");
            C17542s.j(bVar, "hostLifecycleState");
            String str2 = str;
            C17542s.j(str2, "id");
            return new C8948l(context, vVar, bundle, bVar, g10, str2, bundle2, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx4/l$b;", "Landroidx/lifecycle/a;", "LP4/f;", "owner", "<init>", "(LP4/f;)V", "Landroidx/lifecycle/f0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/U;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/U;)Landroidx/lifecycle/f0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.l$b */
    private static final class b extends C5198a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(fVar, (Bundle) null);
            C17542s.j(fVar, "owner");
        }

        /* access modifiers changed from: protected */
        public <T extends f0> T c(String str, Class<T> cls, U u10) {
            C17542s.j(str, "key");
            C17542s.j(cls, "modelClass");
            C17542s.j(u10, "handle");
            return new c(u10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx4/l$c;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "handle", "<init>", "(Landroidx/lifecycle/U;)V", "m", "Landroidx/lifecycle/U;", "C", "()Landroidx/lifecycle/U;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.l$c */
    private static final class c extends f0 {

        /* renamed from: m  reason: collision with root package name */
        private final U f57536m;

        public c(U u10) {
            C17542s.j(u10, "handle");
            this.f57536m = u10;
        }

        public final U C() {
            return this.f57536m;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/a0;", "b", "()Landroidx/lifecycle/a0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.l$d */
    static final class d extends C17544u implements C17631a<a0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8948l f57537c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C8948l lVar) {
            super(0);
            this.f57537c = lVar;
        }

        /* renamed from: b */
        public final a0 invoke() {
            Context a10 = this.f57537c.f57522a;
            Application application = null;
            Context applicationContext = a10 != null ? a10.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
            C8948l lVar = this.f57537c;
            return new a0(application, lVar, lVar.c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/U;", "b", "()Landroidx/lifecycle/U;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.l$e */
    static final class e extends C17544u implements C17631a<U> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8948l f57538c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C8948l lVar) {
            super(0);
            this.f57538c = lVar;
        }

        /* renamed from: b */
        public final U invoke() {
            if (!this.f57538c.f57531j) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            } else if (this.f57538c.getLifecycle().d() != r.b.DESTROYED) {
                return ((c) new i0((k0) this.f57538c, (i0.c) new b(this.f57538c)).a(c.class)).C();
            } else {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            }
        }
    }

    public /* synthetic */ C8948l(Context context, v vVar, Bundle bundle, r.b bVar, G g10, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, vVar, bundle, bVar, g10, str, bundle2);
    }

    private final a0 d() {
        return (a0) this.f57532k.getValue();
    }

    public final Bundle c() {
        if (this.f57524c == null) {
            return null;
        }
        return new Bundle(this.f57524c);
    }

    public final v e() {
        return this.f57523b;
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C8948l)) {
            return false;
        }
        C8948l lVar = (C8948l) obj;
        if (!C17542s.e(this.f57527f, lVar.f57527f) || !C17542s.e(this.f57523b, lVar.f57523b) || !C17542s.e(getLifecycle(), lVar.getLifecycle()) || !C17542s.e(getSavedStateRegistry(), lVar.getSavedStateRegistry())) {
            return false;
        }
        if (!C17542s.e(this.f57524c, lVar.f57524c)) {
            Bundle bundle = this.f57524c;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Iterable<String> iterable = keySet;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    Object obj2 = this.f57524c.get(str);
                    Bundle bundle2 = lVar.f57524c;
                    if (!C17542s.e(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final String f() {
        return this.f57527f;
    }

    public final r.b g() {
        return this.f57534m;
    }

    public l3.a getDefaultViewModelCreationExtras() {
        Application application = null;
        l3.d dVar = new l3.d((l3.a) null, 1, (DefaultConstructorMarker) null);
        Context context = this.f57522a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        if (application != null) {
            dVar.c(i0.a.f22296h, application);
        }
        dVar.c(X.f22221a, this);
        dVar.c(X.f22222b, this);
        Bundle c10 = c();
        if (c10 != null) {
            dVar.c(X.f22223c, c10);
        }
        return dVar;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return this.f57535n;
    }

    public r getLifecycle() {
        return this.f57529h;
    }

    public P4.d getSavedStateRegistry() {
        return this.f57530i.b();
    }

    public j0 getViewModelStore() {
        if (!this.f57531j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        } else if (getLifecycle().d() != r.b.DESTROYED) {
            G g10 = this.f57526e;
            if (g10 != null) {
                return g10.d(this.f57527f);
            }
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        } else {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
    }

    public final U h() {
        return (U) this.f57533l.getValue();
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.f57527f.hashCode() * 31) + this.f57523b.hashCode();
        Bundle bundle = this.f57524c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i10 = hashCode * 31;
                Object obj = this.f57524c.get(str);
                hashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void i(r.a aVar) {
        C17542s.j(aVar, "event");
        this.f57525d = aVar.j();
        m();
    }

    public final void j(Bundle bundle) {
        C17542s.j(bundle, "outBundle");
        this.f57530i.e(bundle);
    }

    public final void k(v vVar) {
        C17542s.j(vVar, "<set-?>");
        this.f57523b = vVar;
    }

    public final void l(r.b bVar) {
        C17542s.j(bVar, "maxState");
        this.f57534m = bVar;
        m();
    }

    public final void m() {
        if (!this.f57531j) {
            this.f57530i.c();
            this.f57531j = true;
            if (this.f57526e != null) {
                X.c(this);
            }
            this.f57530i.d(this.f57528g);
        }
        if (this.f57525d.ordinal() < this.f57534m.ordinal()) {
            this.f57529h.q(this.f57525d);
        } else {
            this.f57529h.q(this.f57534m);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C8948l.class.getSimpleName());
        sb2.append('(' + this.f57527f + ')');
        sb2.append(" destination=");
        sb2.append(this.f57523b);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }

    private C8948l(Context context, v vVar, Bundle bundle, r.b bVar, G g10, String str, Bundle bundle2) {
        this.f57522a = context;
        this.f57523b = vVar;
        this.f57524c = bundle;
        this.f57525d = bVar;
        this.f57526e = g10;
        this.f57527f = str;
        this.f57528g = bundle2;
        this.f57529h = new A(this);
        this.f57530i = P4.e.f39378d.a(this);
        this.f57532k = C16825p.b(new d(this));
        this.f57533l = C16825p.b(new e(this));
        this.f57534m = r.b.INITIALIZED;
        this.f57535n = d();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8948l(C8948l lVar, Bundle bundle) {
        this(lVar.f57522a, lVar.f57523b, bundle, lVar.f57525d, lVar.f57526e, lVar.f57527f, lVar.f57528g);
        C17542s.j(lVar, "entry");
        this.f57525d = lVar.f57525d;
        l(lVar.f57534m);
    }
}
