package P4;

import P4.b;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.C5677b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003!\u0007\u000eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R$\u0010+\u001a\u00020$2\u0006\u0010)\u001a\u00020$8G@BX\u000e¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.R\"\u00103\u001a\u00020$8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010%\u001a\u0004\b0\u0010,\"\u0004\b1\u00102¨\u00064"}, d2 = {"LP4/d;", "", "<init>", "()V", "", "key", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "LP4/d$c;", "provider", "LXH/N;", "h", "(Ljava/lang/String;LP4/d$c;)V", "c", "(Ljava/lang/String;)LP4/d$c;", "j", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "LP4/d$a;", "clazz", "i", "(Ljava/lang/Class;)V", "Landroidx/lifecycle/r;", "lifecycle", "e", "(Landroidx/lifecycle/r;)V", "savedState", "f", "(Landroid/os/Bundle;)V", "outBundle", "g", "Lp/b;", "a", "Lp/b;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "isRestored", "()Z", "LP4/b$b;", "LP4/b$b;", "recreatorProvider", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
public final class d {

    /* renamed from: g  reason: collision with root package name */
    private static final b f39371g = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5677b<String, c> f39372a = new C5677b<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f39373b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f39374c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39375d;

    /* renamed from: e  reason: collision with root package name */
    private b.C0621b f39376e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39377f = true;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LP4/d$a;", "", "LP4/f;", "owner", "LXH/N;", "a", "(LP4/f;)V", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a(f fVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LP4/d$b;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LP4/d$c;", "", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        Bundle b();
    }

    /* access modifiers changed from: private */
    public static final void d(d dVar, C5221y yVar, r.a aVar) {
        C17542s.j(dVar, "this$0");
        C17542s.j(yVar, "<anonymous parameter 0>");
        C17542s.j(aVar, "event");
        if (aVar == r.a.ON_START) {
            dVar.f39377f = true;
        } else if (aVar == r.a.ON_STOP) {
            dVar.f39377f = false;
        }
    }

    public final Bundle b(String str) {
        C17542s.j(str, "key");
        if (this.f39375d) {
            Bundle bundle = this.f39374c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f39374c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f39374c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f39374c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final c c(String str) {
        C17542s.j(str, "key");
        Iterator<Map.Entry<String, c>> it = this.f39372a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            C17542s.i(next, "components");
            c cVar = (c) next.getValue();
            if (C17542s.e((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(r rVar) {
        C17542s.j(rVar, "lifecycle");
        if (!this.f39373b) {
            rVar.c(new c(this));
            this.f39373b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }

    public final void f(Bundle bundle) {
        if (!this.f39373b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        } else if (!this.f39375d) {
            this.f39374c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f39375d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
    }

    public final void g(Bundle bundle) {
        C17542s.j(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f39374c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C5677b<K, V>.defpackage.d j10 = this.f39372a.j();
        C17542s.i(j10, "this.components.iteratorWithAdditions()");
        while (j10.hasNext()) {
            Map.Entry entry = (Map.Entry) j10.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).b());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        C17542s.j(str, "key");
        C17542s.j(cVar, "provider");
        if (this.f39372a.p(str, cVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class<? extends a> cls) {
        C17542s.j(cls, "clazz");
        if (this.f39377f) {
            b.C0621b bVar = this.f39376e;
            if (bVar == null) {
                bVar = new b.C0621b(this);
            }
            this.f39376e = bVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                b.C0621b bVar2 = this.f39376e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    C17542s.i(name, "clazz.name");
                    bVar2.a(name);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void j(String str) {
        C17542s.j(str, "key");
        this.f39372a.q(str);
    }
}
