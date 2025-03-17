package ve;

import HJ.C15854t;
import I2.B;
import QJ.N;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17168i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.C10137a;
import qe.C10188a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import ze.C10493a;

@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001\u0012\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lve/b;", "Lze/a;", "Lqe/a;", "alertMessageIntegration", "Lpe/a;", "alertmessageAnalytics", "<init>", "(Lqe/a;Lpe/a;)V", "LXH/N;", "b", "()V", "a", "Lqe/a;", "Lpe/a;", "LI2/B;", "c", "LI2/B;", "currentMenuProvider", "ve/b$b", "d", "Lve/b$b;", "cleanupTask", "e", "alertmessaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ve.b  reason: case insensitive filesystem */
public final class C10306b implements C10493a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f77148e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f77149f = 8;

    /* renamed from: g  reason: collision with root package name */
    private static final N f77150g = new c(N.f137593c0);

    /* renamed from: a  reason: collision with root package name */
    private final C10188a f77151a;

    /* renamed from: b  reason: collision with root package name */
    private final C10137a f77152b;

    /* renamed from: c  reason: collision with root package name */
    private B f77153c;

    /* renamed from: d  reason: collision with root package name */
    private final C1427b f77154d = new C1427b(this);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lve/b$a;", "", "<init>", "()V", "LQJ/N;", "exceptionHandler", "LQJ/N;", "alertmessaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ve.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ve/b$b", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onDestroy", "(Landroidx/lifecycle/y;)V", "alertmessaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ve.b$b  reason: collision with other inner class name */
    public static final class C1427b implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10306b f77155a;

        C1427b(C10306b bVar) {
            this.f77155a = bVar;
        }

        public void onDestroy(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f77155a.b();
            yVar.getLifecycle().g(this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ve/b$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ve.b$c */
    public static final class c extends C17160a implements N {
        public c(N.a aVar) {
            super(aVar);
        }

        public void handleException(C17168i iVar, Throwable th2) {
            a aVar = C10306b.f77148e;
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Exception caught when observing badge state", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = aVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public C10306b(C10188a aVar, C10137a aVar2) {
        C17542s.j(aVar, "alertMessageIntegration");
        C17542s.j(aVar2, "alertmessageAnalytics");
        this.f77151a = aVar;
        this.f77152b = aVar2;
    }

    /* access modifiers changed from: private */
    public final void b() {
        this.f77153c = null;
    }
}
