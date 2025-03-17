package V2;

import QJ.Q;
import R2.h;
import S2.b;
import W2.e;
import W2.f;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import qI.C17786c;
import uI.C18064m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LV2/c;", "LqI/c;", "Landroid/content/Context;", "LR2/h;", "LW2/f;", "", "name", "LS2/b;", "corruptionHandler", "Lkotlin/Function1;", "", "LR2/f;", "produceMigrations", "LQJ/Q;", "scope", "<init>", "(Ljava/lang/String;LS2/b;LnI/l;LQJ/Q;)V", "thisRef", "LuI/m;", "property", "d", "(Landroid/content/Context;LuI/m;)LR2/h;", "a", "Ljava/lang/String;", "b", "LS2/b;", "c", "LnI/l;", "LQJ/Q;", "", "e", "Ljava/lang/Object;", "lock", "f", "LR2/h;", "INSTANCE", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements C17786c<Context, h<f>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f14599a;

    /* renamed from: b  reason: collision with root package name */
    private final b<f> f14600b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<Context, List<R2.f<f>>> f14601c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f14602d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f14603e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile h<f> f14604f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<File> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f14605c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f14606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f14605c = context;
            this.f14606d = cVar;
        }

        /* renamed from: b */
        public final File invoke() {
            Context context = this.f14605c;
            C17542s.i(context, "applicationContext");
            return b.a(context, this.f14606d.f14599a);
        }
    }

    public c(String str, b<f> bVar, C17642l<? super Context, ? extends List<? extends R2.f<f>>> lVar, Q q10) {
        C17542s.j(str, "name");
        C17542s.j(lVar, "produceMigrations");
        C17542s.j(q10, "scope");
        this.f14599a = str;
        this.f14600b = bVar;
        this.f14601c = lVar;
        this.f14602d = q10;
    }

    /* renamed from: d */
    public h<f> a(Context context, C18064m<?> mVar) {
        h<f> hVar;
        C17542s.j(context, "thisRef");
        C17542s.j(mVar, "property");
        h<f> hVar2 = this.f14604f;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this.f14603e) {
            try {
                if (this.f14604f == null) {
                    Context applicationContext = context.getApplicationContext();
                    e eVar = e.f14655a;
                    b<f> bVar = this.f14600b;
                    C17642l<Context, List<R2.f<f>>> lVar = this.f14601c;
                    C17542s.i(applicationContext, "applicationContext");
                    this.f14604f = eVar.b(bVar, lVar.invoke(applicationContext), this.f14602d, new a(applicationContext, this));
                }
                hVar = this.f14604f;
                C17542s.g(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
