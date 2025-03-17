package g;

import GJ.C15768k;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.google.ar.core.ImageMetadata;
import h.C5403a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.C17631a;
import rI.C17853c;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b&\u0018\u0000 \u00122\u00020\u0001:\u00037:=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00104\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<068\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b068\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00108R\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u0014\u0010E\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010D¨\u0006F"}, d2 = {"Lg/e;", "", "<init>", "()V", "O", "", "key", "", "resultCode", "Landroid/content/Intent;", "data", "Lg/e$a;", "callbackAndContract", "LXH/N;", "g", "(Ljava/lang/String;ILandroid/content/Intent;Lg/e$a;)V", "o", "(Ljava/lang/String;)V", "h", "()I", "rc", "d", "(ILjava/lang/String;)V", "I", "requestCode", "Lh/a;", "contract", "input", "Landroidx/core/app/d;", "options", "i", "(ILh/a;Ljava/lang/Object;Landroidx/core/app/d;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lg/b;", "callback", "Lg/c;", "l", "(Ljava/lang/String;Landroidx/lifecycle/y;Lh/a;Lg/b;)Lg/c;", "m", "(Ljava/lang/String;Lh/a;Lg/b;)Lg/c;", "p", "Landroid/os/Bundle;", "outState", "k", "(Landroid/os/Bundle;)V", "savedInstanceState", "j", "", "e", "(IILandroid/content/Intent;)Z", "result", "f", "(ILjava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "Lg/e$c;", "c", "keyToLifecycleContainers", "", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g.e  reason: case insensitive filesystem */
public abstract class C5316e {

    /* renamed from: h  reason: collision with root package name */
    private static final b f23305h = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, String> f23306a = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Integer> f23307b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, c> f23308c = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f23309d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final transient Map<String, a<?>> f23310e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f23311f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f23312g = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg/e$a;", "O", "", "Lg/b;", "callback", "Lh/a;", "contract", "<init>", "(Lg/b;Lh/a;)V", "a", "Lg/b;", "()Lg/b;", "b", "Lh/a;", "()Lh/a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$a */
    private static final class a<O> {

        /* renamed from: a  reason: collision with root package name */
        private final C5313b<O> f23313a;

        /* renamed from: b  reason: collision with root package name */
        private final C5403a<?, O> f23314b;

        public a(C5313b<O> bVar, C5403a<?, O> aVar) {
            C17542s.j(bVar, "callback");
            C17542s.j(aVar, "contract");
            this.f23313a = bVar;
            this.f23314b = aVar;
        }

        public final C5313b<O> a() {
            return this.f23313a;
        }

        public final C5403a<?, O> b() {
            return this.f23314b;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lg/e$b;", "", "<init>", "()V", "", "INITIAL_REQUEST_CODE_VALUE", "I", "", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lg/e$c;", "", "Landroidx/lifecycle/r;", "lifecycle", "<init>", "(Landroidx/lifecycle/r;)V", "Landroidx/lifecycle/v;", "observer", "LXH/N;", "a", "(Landroidx/lifecycle/v;)V", "b", "()V", "Landroidx/lifecycle/r;", "getLifecycle", "()Landroidx/lifecycle/r;", "", "Ljava/util/List;", "observers", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final r f23315a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C5218v> f23316b = new ArrayList();

        public c(r rVar) {
            C17542s.j(rVar, "lifecycle");
            this.f23315a = rVar;
        }

        public final void a(C5218v vVar) {
            C17542s.j(vVar, "observer");
            this.f23315a.c(vVar);
            this.f23316b.add(vVar);
        }

        public final void b() {
            for (C5218v g10 : this.f23316b) {
                this.f23315a.g(g10);
            }
            this.f23316b.clear();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g.e$d */
    static final class d extends C17544u implements C17631a<Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f23317c = new d();

        d() {
            super(0);
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(C17853c.f146670a.e(2147418112) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"g/e$e", "Lg/c;", "input", "Landroidx/core/app/d;", "options", "LXH/N;", "b", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "c", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$e  reason: collision with other inner class name */
    public static final class C0378e extends C5314c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5316e f23318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23319b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5403a<I, O> f23320c;

        C0378e(C5316e eVar, String str, C5403a<I, O> aVar) {
            this.f23318a = eVar;
            this.f23319b = str;
            this.f23320c = aVar;
        }

        public void b(I i10, androidx.core.app.d dVar) {
            Object obj = this.f23318a.f23307b.get(this.f23319b);
            C5403a<I, O> aVar = this.f23320c;
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                this.f23318a.f23309d.add(this.f23319b);
                try {
                    this.f23318a.i(intValue, this.f23320c, i10, dVar);
                } catch (Exception e10) {
                    this.f23318a.f23309d.remove(this.f23319b);
                    throw e10;
                }
            } else {
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
        }

        public void c() {
            this.f23318a.p(this.f23319b);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"g/e$f", "Lg/c;", "input", "Landroidx/core/app/d;", "options", "LXH/N;", "b", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "c", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$f */
    public static final class f extends C5314c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5316e f23321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23322b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5403a<I, O> f23323c;

        f(C5316e eVar, String str, C5403a<I, O> aVar) {
            this.f23321a = eVar;
            this.f23322b = str;
            this.f23323c = aVar;
        }

        public void b(I i10, androidx.core.app.d dVar) {
            Object obj = this.f23321a.f23307b.get(this.f23322b);
            C5403a<I, O> aVar = this.f23323c;
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                this.f23321a.f23309d.add(this.f23322b);
                try {
                    this.f23321a.i(intValue, this.f23323c, i10, dVar);
                } catch (Exception e10) {
                    this.f23321a.f23309d.remove(this.f23322b);
                    throw e10;
                }
            } else {
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
        }

        public void c() {
            this.f23321a.p(this.f23322b);
        }
    }

    private final void d(int i10, String str) {
        this.f23306a.put(Integer.valueOf(i10), str);
        this.f23307b.put(str, Integer.valueOf(i10));
    }

    private final <O> void g(String str, int i10, Intent intent, a<O> aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f23309d.contains(str)) {
            this.f23311f.remove(str);
            this.f23312g.putParcelable(str, new C5312a(i10, intent));
            return;
        }
        aVar.a().a(aVar.b().parseResult(i10, intent));
        this.f23309d.remove(str);
    }

    private final int h() {
        for (Number number : C15768k.r(d.f23317c)) {
            if (!this.f23306a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public static final void n(C5316e eVar, String str, C5313b bVar, C5403a aVar, C5221y yVar, r.a aVar2) {
        C17542s.j(yVar, "<anonymous parameter 0>");
        C17542s.j(aVar2, "event");
        if (r.a.ON_START == aVar2) {
            eVar.f23310e.put(str, new a(bVar, aVar));
            if (eVar.f23311f.containsKey(str)) {
                Object obj = eVar.f23311f.get(str);
                eVar.f23311f.remove(str);
                bVar.a(obj);
            }
            C5312a aVar3 = (C5312a) D2.c.a(eVar.f23312g, str, C5312a.class);
            if (aVar3 != null) {
                eVar.f23312g.remove(str);
                bVar.a(aVar.parseResult(aVar3.b(), aVar3.a()));
            }
        } else if (r.a.ON_STOP == aVar2) {
            eVar.f23310e.remove(str);
        } else if (r.a.ON_DESTROY == aVar2) {
            eVar.p(str);
        }
    }

    private final void o(String str) {
        if (this.f23307b.get(str) == null) {
            d(h(), str);
        }
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = this.f23306a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, this.f23310e.get(str));
        return true;
    }

    public final <O> boolean f(int i10, O o10) {
        String str = this.f23306a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = this.f23310e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f23312g.remove(str);
            this.f23311f.put(str, o10);
            return true;
        }
        C5313b a10 = aVar.a();
        C17542s.h(a10, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f23309d.remove(str)) {
            return true;
        }
        a10.a(o10);
        return true;
    }

    public abstract <I, O> void i(int i10, C5403a<I, O> aVar, I i11, androidx.core.app.d dVar);

    public final void j(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    this.f23309d.addAll(stringArrayList2);
                }
                Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    this.f23312g.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = stringArrayList.get(i10);
                    if (this.f23307b.containsKey(str)) {
                        Integer remove = this.f23307b.remove(str);
                        if (!this.f23312g.containsKey(str)) {
                            W.d(this.f23306a).remove(remove);
                        }
                    }
                    Integer num = integerArrayList.get(i10);
                    C17542s.i(num, "rcs[i]");
                    int intValue = num.intValue();
                    String str2 = stringArrayList.get(i10);
                    C17542s.i(str2, "keys[i]");
                    d(intValue, str2);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        C17542s.j(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f23307b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f23307b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f23309d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f23312g));
    }

    public final <I, O> C5314c<I> l(String str, C5221y yVar, C5403a<I, O> aVar, C5313b<O> bVar) {
        C17542s.j(str, "key");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(aVar, "contract");
        C17542s.j(bVar, "callback");
        r lifecycle = yVar.getLifecycle();
        if (!lifecycle.d().b(r.b.STARTED)) {
            o(str);
            c cVar = this.f23308c.get(str);
            if (cVar == null) {
                cVar = new c(lifecycle);
            }
            cVar.a(new C5315d(this, str, bVar, aVar));
            this.f23308c.put(str, cVar);
            return new C0378e(this, str, aVar);
        }
        throw new IllegalStateException(("LifecycleOwner " + yVar + " is attempting to register while current state is " + lifecycle.d() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final <I, O> C5314c<I> m(String str, C5403a<I, O> aVar, C5313b<O> bVar) {
        C17542s.j(str, "key");
        C17542s.j(aVar, "contract");
        C17542s.j(bVar, "callback");
        o(str);
        this.f23310e.put(str, new a(bVar, aVar));
        if (this.f23311f.containsKey(str)) {
            Object obj = this.f23311f.get(str);
            this.f23311f.remove(str);
            bVar.a(obj);
        }
        C5312a aVar2 = (C5312a) D2.c.a(this.f23312g, str, C5312a.class);
        if (aVar2 != null) {
            this.f23312g.remove(str);
            bVar.a(aVar.parseResult(aVar2.b(), aVar2.a()));
        }
        return new f(this, str, aVar);
    }

    public final void p(String str) {
        Integer remove;
        C17542s.j(str, "key");
        if (!this.f23309d.contains(str) && (remove = this.f23307b.remove(str)) != null) {
            this.f23306a.remove(remove);
        }
        this.f23310e.remove(str);
        if (this.f23311f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f23311f.get(str));
            this.f23311f.remove(str);
        }
        if (this.f23312g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C5312a) D2.c.a(this.f23312g, str, C5312a.class)));
            this.f23312g.remove(str);
        }
        c cVar = this.f23308c.get(str);
        if (cVar != null) {
            cVar.b();
            this.f23308c.remove(str);
        }
    }
}
