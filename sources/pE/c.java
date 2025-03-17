package Pe;

import HJ.C15854t;
import Ie.a;
import XH.C16824o;
import XH.C16825p;
import am.f;
import android.content.Context;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u0019"}, d2 = {"LPe/c;", "LPe/a;", "Landroid/content/Context;", "context", "Lam/f;", "googleApiKey", "LIe/a;", "analytics", "<init>", "(Landroid/content/Context;Lam/f;LIe/a;)V", "", "componentValue", "LXH/N;", "a", "(Ljava/lang/String;)V", "Landroid/content/Context;", "b", "Lam/f;", "c", "LIe/a;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "d", "LXH/o;", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f62741a;

    /* renamed from: b  reason: collision with root package name */
    private final f f62742b;

    /* renamed from: c  reason: collision with root package name */
    private final a f62743c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f62744d = C16825p.b(new b(this));

    public c(Context context, f fVar, a aVar) {
        C17542s.j(context, "context");
        C17542s.j(fVar, "googleApiKey");
        C17542s.j(aVar, "analytics");
        this.f62741a = context;
        this.f62742b = fVar;
        this.f62743c = aVar;
    }

    /* access modifiers changed from: private */
    public static final PlacesClient d(c cVar) {
        cVar.f62743c.a();
        return Places.createClient(cVar.f62741a);
    }

    public void a(String str) {
        C17542s.j(str, "componentValue");
        boolean isInitialized = Places.isInitialized();
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Initializing Google Places, isInitialized: " + isInitialized, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (!isInitialized) {
            this.f62743c.d(str);
            Places.initialize(this.f62741a, this.f62742b.getKey());
        }
    }

    public PlacesClient b() {
        Object value = this.f62744d.getValue();
        C17542s.i(value, "getValue(...)");
        return (PlacesClient) value;
    }
}
