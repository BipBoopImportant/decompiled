package CB;

import EB.C12829a;
import EB.C12832d;
import FB.C12860a;
import SJ.C16428d;
import SJ.C16447w;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import android.content.SharedPreferences;
import com.ingka.ikea.store.datalayer.impl.repository.StoreSelectionDao;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import eI.C17187b;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\nH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006#"}, d2 = {"LCB/c;", "LFB/a;", "Landroid/content/SharedPreferences;", "sharedPreferences", "LCB/a;", "localStoreAnalytics", "LkK/c;", "json", "<init>", "(Landroid/content/SharedPreferences;LCB/a;LkK/c;)V", "LEB/d;", "e", "(Landroid/content/SharedPreferences;LkK/c;)LEB/d;", "LTJ/g;", "f", "(Landroid/content/SharedPreferences;LkK/c;)LTJ/g;", "Lcom/ingka/ikea/store/datalayer/impl/repository/StoreSelectionDao;", "h", "(Lcom/ingka/ikea/store/datalayer/impl/repository/StoreSelectionDao;)LEB/d;", "c", "()LEB/d;", "b", "()LTJ/g;", "selection", "LXH/N;", "a", "(LEB/d;)V", "clear", "()V", "g", "(LEB/d;)Lcom/ingka/ikea/store/datalayer/impl/repository/StoreSelectionDao;", "Landroid/content/SharedPreferences;", "LCB/a;", "LkK/c;", "d", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: CB.c  reason: case insensitive filesystem */
public final class C12686c implements C12860a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f108327d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f108328a;

    /* renamed from: b  reason: collision with root package name */
    private final C12684a f108329b;

    /* renamed from: c  reason: collision with root package name */
    private final C17514c f108330c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCB/c$a;", "", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: CB.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSJ/y;", "LEB/d;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.store.datalayer.impl.repository.LocalStoreSelectionRepositoryImpl$getLocalStoreSelectionAsFlow$1", f = "LocalStoreSelectionRepositoryImpl.kt", l = {76, 77}, m = "invokeSuspend")
    /* renamed from: CB.c$b */
    static final class b extends l implements p<C16449y<? super C12832d>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f108331c;

        /* renamed from: d  reason: collision with root package name */
        int f108332d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f108333e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SharedPreferences f108334f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12686c f108335g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17514c f108336h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SharedPreferences sharedPreferences, C12686c cVar, C17514c cVar2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f108334f = sharedPreferences;
            this.f108335g = cVar;
            this.f108336h = cVar2;
        }

        /* access modifiers changed from: private */
        public static final void m(C16449y yVar, C12686c cVar, SharedPreferences sharedPreferences, C17514c cVar2, SharedPreferences sharedPreferences2, String str) {
            if (C17542s.e("LOCAL_STORE", str)) {
                yVar.k(cVar.e(sharedPreferences, cVar2));
            }
        }

        /* access modifiers changed from: private */
        public static final C16807N n(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f108334f, this.f108335g, this.f108336h, eVar);
            bVar.f108333e = obj;
            return bVar;
        }

        public final Object invokeSuspend(Object obj) {
            C16449y yVar;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener;
            Object f10 = C17187b.f();
            int i10 = this.f108332d;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar2 = (C16449y) this.f108333e;
                C12687d dVar = new C12687d(yVar2, this.f108335g, this.f108334f, this.f108336h);
                this.f108334f.registerOnSharedPreferenceChangeListener(dVar);
                C12832d d10 = this.f108335g.e(this.f108334f, this.f108336h);
                this.f108333e = yVar2;
                this.f108331c = dVar;
                this.f108332d = 1;
                if (yVar2.y(d10, this) == f10) {
                    return f10;
                }
                yVar = yVar2;
                onSharedPreferenceChangeListener = dVar;
            } else if (i10 == 1) {
                onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f108331c;
                yVar = (C16449y) this.f108333e;
                y.b(obj);
            } else if (i10 == 2) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = (SharedPreferences.OnSharedPreferenceChangeListener) this.f108331c;
                C16449y yVar3 = (C16449y) this.f108333e;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12688e eVar = new C12688e(this.f108334f, onSharedPreferenceChangeListener);
            this.f108333e = yVar;
            this.f108331c = onSharedPreferenceChangeListener;
            this.f108332d = 2;
            if (C16447w.a(yVar, eVar, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }

        /* renamed from: k */
        public final Object invoke(C16449y<? super C12832d> yVar, C17164e<? super C16807N> eVar) {
            return ((b) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public C12686c(SharedPreferences sharedPreferences, C12684a aVar, C17514c cVar) {
        C17542s.j(sharedPreferences, "sharedPreferences");
        C17542s.j(aVar, "localStoreAnalytics");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f108328a = sharedPreferences;
        this.f108329b = aVar;
        this.f108330c = cVar;
    }

    /* access modifiers changed from: private */
    public final C12832d e(SharedPreferences sharedPreferences, C17514c cVar) {
        String str = "";
        try {
            String string = sharedPreferences.getString("LOCAL_STORE", str);
            if (string != null) {
                str = string;
            }
            if ((str.length() > 0 ? str : null) == null) {
                return null;
            }
            cVar.a();
            C12832d h10 = h((StoreSelectionDao) cVar.c(StoreSelectionDao.Companion.serializer(), str));
            if (h10 == null || h10.e().length() <= 0) {
                return null;
            }
            return h10;
        } catch (Exception unused) {
            return null;
        }
    }

    private final C16532g<C12832d> f(SharedPreferences sharedPreferences, C17514c cVar) {
        return C16538m.b(C16534i.f(new b(sharedPreferences, this, cVar, (C17164e<? super b>) null)), Integer.MAX_VALUE, (C16428d) null, 2, (Object) null);
    }

    private final C12832d h(StoreSelectionDao storeSelectionDao) {
        return new C12832d(storeSelectionDao.c(), storeSelectionDao.d(), storeSelectionDao.a(), storeSelectionDao.e(), C12829a.Companion.a(storeSelectionDao.b()));
    }

    public void a(C12832d dVar) {
        C17542s.j(dVar, "selection");
        SharedPreferences.Editor edit = this.f108328a.edit();
        C17514c cVar = this.f108330c;
        StoreSelectionDao g10 = g(dVar);
        cVar.a();
        edit.putString("LOCAL_STORE", cVar.b(StoreSelectionDao.Companion.serializer(), g10));
        edit.apply();
        this.f108329b.a(dVar.e());
    }

    public C16532g<C12832d> b() {
        return f(this.f108328a, this.f108330c);
    }

    public C12832d c() {
        return e(this.f108328a, this.f108330c);
    }

    public void clear() {
        SharedPreferences.Editor edit = this.f108328a.edit();
        edit.remove("LOCAL_STORE");
        edit.apply();
        this.f108329b.clear();
    }

    public final StoreSelectionDao g(C12832d dVar) {
        C17542s.j(dVar, "<this>");
        return new StoreSelectionDao(dVar.e(), dVar.getName(), dVar.c(), dVar.f(), dVar.d().j());
    }
}
