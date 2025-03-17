package l5;

import QJ.C16283A;
import QJ.C16310i;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C7033b;
import androidx.work.C7034c;
import androidx.work.C7037f;
import androidx.work.C7044m;
import androidx.work.C7052v;
import androidx.work.C7054x;
import androidx.work.C7055y;
import androidx.work.Q;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import ob.C10101e;
import r5.C8689a;
import s5.C8720b;
import s5.C8731m;
import s5.C8739u;
import s5.v;
import s5.z;
import t5.C8799J;
import u5.C8878b;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002(.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u001d\u0010\u001f\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010\rR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\u0014\u0010W\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0014\u0010Z\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010YR\u0011\u0010]\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bS\u0010\\¨\u0006^"}, d2 = {"Ll5/W;", "", "Ll5/W$a;", "builder", "<init>", "(Ll5/W$a;)V", "Ll5/W$b;", "v", "(LdI/e;)Ljava/lang/Object;", "Landroidx/work/x$a;", "result", "", "r", "(Landroidx/work/x$a;)Z", "", "stopReason", "u", "(I)Z", "n", "z", "()Z", "", "workSpecId", "LXH/N;", "p", "(Ljava/lang/String;)V", "s", "t", "y", "", "tags", "k", "(Ljava/util/List;)Ljava/lang/String;", "Lob/e;", "q", "()Lob/e;", "o", "(I)V", "x", "Ls5/u;", "a", "Ls5/u;", "m", "()Ls5/u;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", "d", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/x;", "e", "Landroidx/work/x;", "builderWorker", "Lu5/b;", "f", "Lu5/b;", "workTaskExecutor", "Landroidx/work/c;", "g", "Landroidx/work/c;", "configuration", "Landroidx/work/b;", "h", "Landroidx/work/b;", "clock", "Lr5/a;", "i", "Lr5/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ls5/v;", "Ls5/v;", "workSpecDao", "Ls5/b;", "l", "Ls5/b;", "dependencyDao", "Ljava/util/List;", "workDescription", "LQJ/A;", "LQJ/A;", "workerJob", "Ls5/m;", "()Ls5/m;", "workGenerationalId", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class W {

    /* renamed from: a  reason: collision with root package name */
    private final C8739u f54665a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f54666b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54667c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkerParameters.a f54668d;

    /* renamed from: e  reason: collision with root package name */
    private final C7054x f54669e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C8878b f54670f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C7034c f54671g;

    /* renamed from: h  reason: collision with root package name */
    private final C7033b f54672h;

    /* renamed from: i  reason: collision with root package name */
    private final C8689a f54673i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final WorkDatabase f54674j;

    /* renamed from: k  reason: collision with root package name */
    private final v f54675k;

    /* renamed from: l  reason: collision with root package name */
    private final C8720b f54676l;

    /* renamed from: m  reason: collision with root package name */
    private final List<String> f54677m;

    /* renamed from: n  reason: collision with root package name */
    private final String f54678n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16283A f54679o = J0.b((F0) null, 1, (Object) null);

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Ll5/W$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/c;", "configuration", "Lu5/b;", "workTaskExecutor", "Lr5/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ls5/u;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/c;Lu5/b;Lr5/a;Landroidx/work/impl/WorkDatabase;Ls5/u;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Ll5/W$a;", "Ll5/W;", "a", "()Ll5/W;", "Landroidx/work/c;", "c", "()Landroidx/work/c;", "b", "Lu5/b;", "i", "()Lu5/b;", "Lr5/a;", "d", "()Lr5/a;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Ls5/u;", "h", "()Ls5/u;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/x;", "Landroidx/work/x;", "j", "()Landroidx/work/x;", "setWorker", "(Landroidx/work/x;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C7034c f54680a;

        /* renamed from: b  reason: collision with root package name */
        private final C8878b f54681b;

        /* renamed from: c  reason: collision with root package name */
        private final C8689a f54682c;

        /* renamed from: d  reason: collision with root package name */
        private final WorkDatabase f54683d;

        /* renamed from: e  reason: collision with root package name */
        private final C8739u f54684e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f54685f;

        /* renamed from: g  reason: collision with root package name */
        private final Context f54686g;

        /* renamed from: h  reason: collision with root package name */
        private C7054x f54687h;

        /* renamed from: i  reason: collision with root package name */
        private WorkerParameters.a f54688i = new WorkerParameters.a();

        @SuppressLint({"LambdaLast"})
        public a(Context context, C7034c cVar, C8878b bVar, C8689a aVar, WorkDatabase workDatabase, C8739u uVar, List<String> list) {
            C17542s.j(context, "context");
            C17542s.j(cVar, "configuration");
            C17542s.j(bVar, "workTaskExecutor");
            C17542s.j(aVar, "foregroundProcessor");
            C17542s.j(workDatabase, "workDatabase");
            C17542s.j(uVar, "workSpec");
            C17542s.j(list, "tags");
            this.f54680a = cVar;
            this.f54681b = bVar;
            this.f54682c = aVar;
            this.f54683d = workDatabase;
            this.f54684e = uVar;
            this.f54685f = list;
            Context applicationContext = context.getApplicationContext();
            C17542s.i(applicationContext, "context.applicationContext");
            this.f54686g = applicationContext;
        }

        public final W a() {
            return new W(this);
        }

        public final Context b() {
            return this.f54686g;
        }

        public final C7034c c() {
            return this.f54680a;
        }

        public final C8689a d() {
            return this.f54682c;
        }

        public final WorkerParameters.a e() {
            return this.f54688i;
        }

        public final List<String> f() {
            return this.f54685f;
        }

        public final WorkDatabase g() {
            return this.f54683d;
        }

        public final C8739u h() {
            return this.f54684e;
        }

        public final C8878b i() {
            return this.f54681b;
        }

        public final C7054x j() {
            return this.f54687h;
        }

        public final a k(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f54688i = aVar;
            }
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ll5/W$b;", "", "<init>", "()V", "a", "b", "c", "Ll5/W$b$a;", "Ll5/W$b$b;", "Ll5/W$b$c;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ll5/W$b$a;", "Ll5/W$b;", "Landroidx/work/x$a;", "result", "<init>", "(Landroidx/work/x$a;)V", "a", "Landroidx/work/x$a;", "()Landroidx/work/x$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C7054x.a f54689a;

            public a() {
                this((C7054x.a) null, 1, (DefaultConstructorMarker) null);
            }

            public final C7054x.a a() {
                return this.f54689a;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C7054x.a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "result");
                this.f54689a = aVar;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(C7054x.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? new C7054x.a.C0779a() : aVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ll5/W$b$b;", "Ll5/W$b;", "Landroidx/work/x$a;", "result", "<init>", "(Landroidx/work/x$a;)V", "a", "Landroidx/work/x$a;", "()Landroidx/work/x$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: l5.W$b$b  reason: collision with other inner class name */
        public static final class C0867b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C7054x.a f54690a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0867b(C7054x.a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "result");
                this.f54690a = aVar;
            }

            public final C7054x.a a() {
                return this.f54690a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ll5/W$b$c;", "Ll5/W$b;", "", "reason", "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final int f54691a;

            public c() {
                this(0, 1, (DefaultConstructorMarker) null);
            }

            public final int a() {
                return this.f54691a;
            }

            public c(int i10) {
                super((DefaultConstructorMarker) null);
                this.f54691a = i10;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f54692c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ W f54693d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Ll5/W$b;", "<anonymous>", "(LQJ/Q;)Ll5/W$b;"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super b>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f54694c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ W f54695d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(W w10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f54695d = w10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f54695d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super b> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f54694c;
                if (i10 == 0) {
                    y.b(obj);
                    W w10 = this.f54695d;
                    this.f54694c = 1;
                    obj = w10.v(this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(W w10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f54693d = w10;
        }

        /* access modifiers changed from: private */
        public static final Boolean j(b bVar, W w10) {
            boolean z10;
            if (bVar instanceof b.C0867b) {
                z10 = w10.r(((b.C0867b) bVar).a());
            } else if (bVar instanceof b.a) {
                w10.x(((b.a) bVar).a());
                z10 = false;
            } else if (bVar instanceof b.c) {
                z10 = w10.u(((b.c) bVar).a());
            } else {
                throw new t();
            }
            return Boolean.valueOf(z10);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f54693d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            b bVar;
            Object f10 = C17187b.f();
            int i10 = this.f54692c;
            if (i10 == 0) {
                y.b(obj);
                C16283A g10 = this.f54693d.f54679o;
                a aVar = new a(this.f54693d, (C17164e<? super a>) null);
                this.f54692c = 1;
                obj = C16310i.g(g10, aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Q e10) {
                    bVar = new b.c(e10.a());
                } catch (CancellationException unused) {
                    bVar = new b.a((C7054x.a) null, 1, (DefaultConstructorMarker) null);
                } catch (Throwable th2) {
                    C7055y.e().d(Y.f54711a, "Unexpected error in WorkerWrapper", th2);
                    bVar = new b.a((C7054x.a) null, 1, (DefaultConstructorMarker) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) obj;
            Object runInTransaction = this.f54693d.f54674j.runInTransaction(new X(bVar, this.f54693d));
            C17542s.i(runInTransaction, "workDatabase.runInTransa…          }\n            )");
            return runInTransaction;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f54696c;

        /* renamed from: d  reason: collision with root package name */
        Object f54697d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f54698e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ W f54699f;

        /* renamed from: g  reason: collision with root package name */
        int f54700g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(W w10, C17164e<? super d> eVar) {
            super(eVar);
            this.f54699f = w10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f54698e = obj;
            this.f54700g |= Integer.MIN_VALUE;
            return this.f54699f.v(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7054x f54701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f54702d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f54703e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ W f54704f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C7054x xVar, boolean z10, String str, W w10) {
            super(1);
            this.f54701c = xVar;
            this.f54702d = z10;
            this.f54703e = str;
            this.f54704f = w10;
        }

        public final void a(Throwable th2) {
            if (th2 instanceof Q) {
                this.f54701c.stop(((Q) th2).a());
            }
            if (this.f54702d && this.f54703e != null) {
                this.f54704f.f54671g.n().b(this.f54703e, this.f54704f.m().hashCode());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Landroidx/work/x$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(LQJ/Q;)Landroidx/work/x$a;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {300, 311}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C7054x.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f54705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ W f54706d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7054x f54707e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C7044m f54708f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(W w10, C7054x xVar, C7044m mVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f54706d = w10;
            this.f54707e = xVar;
            this.f54708f = mVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f54706d, this.f54707e, this.f54708f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C7054x.a> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f54705c;
            if (i10 == 0) {
                y.b(obj);
                Context c10 = this.f54706d.f54666b;
                C8739u m10 = this.f54706d.m();
                C7054x xVar = this.f54707e;
                C7044m mVar = this.f54708f;
                C8878b f11 = this.f54706d.f54670f;
                this.f54705c = 1;
                if (C8799J.b(c10, m10, xVar, mVar, f11, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String a10 = Y.f54711a;
            W w10 = this.f54706d;
            C7055y e10 = C7055y.e();
            e10.a(a10, "Starting work for " + w10.m().f55912c);
            C10101e<C7054x.a> startWork = this.f54707e.startWork();
            C17542s.i(startWork, "worker.startWork()");
            C7054x xVar2 = this.f54707e;
            this.f54705c = 2;
            obj = Y.d(startWork, xVar2, this);
            return obj == f10 ? f10 : obj;
        }
    }

    public W(a aVar) {
        C17542s.j(aVar, "builder");
        C8739u h10 = aVar.h();
        this.f54665a = h10;
        this.f54666b = aVar.b();
        this.f54667c = h10.f55910a;
        this.f54668d = aVar.e();
        this.f54669e = aVar.j();
        this.f54670f = aVar.i();
        C7034c c10 = aVar.c();
        this.f54671g = c10;
        this.f54672h = c10.a();
        this.f54673i = aVar.d();
        WorkDatabase g10 = aVar.g();
        this.f54674j = g10;
        this.f54675k = g10.f();
        this.f54676l = g10.a();
        List<String> f10 = aVar.f();
        this.f54677m = f10;
        this.f54678n = k(f10);
    }

    /* access modifiers changed from: private */
    public static final Boolean A(W w10) {
        boolean z10;
        if (w10.f54675k.h(w10.f54667c) == Q.c.ENQUEUED) {
            w10.f54675k.v(Q.c.RUNNING, w10.f54667c);
            w10.f54675k.B(w10.f54667c);
            w10.f54675k.d(w10.f54667c, -256);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private final String k(List<String> list) {
        return "Work [ id=" + this.f54667c + ", tags={ " + C16877v.G0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null) + " } ]";
    }

    private final boolean n(C7054x.a aVar) {
        if (aVar instanceof C7054x.a.c) {
            String a10 = Y.f54711a;
            C7055y e10 = C7055y.e();
            e10.f(a10, "Worker result SUCCESS for " + this.f54678n);
            return this.f54665a.n() ? t() : y(aVar);
        } else if (aVar instanceof C7054x.a.b) {
            String a11 = Y.f54711a;
            C7055y e11 = C7055y.e();
            e11.f(a11, "Worker result RETRY for " + this.f54678n);
            return s(-256);
        } else {
            String a12 = Y.f54711a;
            C7055y e12 = C7055y.e();
            e12.f(a12, "Worker result FAILURE for " + this.f54678n);
            if (this.f54665a.n()) {
                return t();
            }
            if (aVar == null) {
                aVar = new C7054x.a.C0779a();
            }
            return x(aVar);
        }
    }

    private final void p(String str) {
        List t10 = C16877v.t(str);
        while (!t10.isEmpty()) {
            String str2 = (String) C16877v.O(t10);
            if (this.f54675k.h(str2) != Q.c.CANCELLED) {
                this.f54675k.v(Q.c.FAILED, str2);
            }
            t10.addAll(this.f54676l.a(str2));
        }
    }

    /* access modifiers changed from: private */
    public final boolean r(C7054x.a aVar) {
        Q.c h10 = this.f54675k.h(this.f54667c);
        this.f54674j.e().a(this.f54667c);
        if (h10 == null) {
            return false;
        }
        if (h10 == Q.c.RUNNING) {
            return n(aVar);
        }
        if (!h10.b()) {
            return s(-512);
        }
        return false;
    }

    private final boolean s(int i10) {
        this.f54675k.v(Q.c.ENQUEUED, this.f54667c);
        this.f54675k.x(this.f54667c, this.f54672h.a());
        this.f54675k.D(this.f54667c, this.f54665a.h());
        this.f54675k.r(this.f54667c, -1);
        this.f54675k.d(this.f54667c, i10);
        return true;
    }

    private final boolean t() {
        this.f54675k.x(this.f54667c, this.f54672h.a());
        this.f54675k.v(Q.c.ENQUEUED, this.f54667c);
        this.f54675k.A(this.f54667c);
        this.f54675k.D(this.f54667c, this.f54665a.h());
        this.f54675k.b(this.f54667c);
        this.f54675k.r(this.f54667c, -1);
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean u(int i10) {
        Q.c h10 = this.f54675k.h(this.f54667c);
        if (h10 == null || h10.b()) {
            String a10 = Y.f54711a;
            C7055y e10 = C7055y.e();
            e10.a(a10, "Status for " + this.f54667c + " is " + h10 + " ; not doing any work");
            return false;
        }
        String a11 = Y.f54711a;
        C7055y e11 = C7055y.e();
        e11.a(a11, "Status for " + this.f54667c + " is " + h10 + "; not doing any work and rescheduling for later execution");
        this.f54675k.v(Q.c.ENQUEUED, this.f54667c);
        this.f54675k.d(this.f54667c, i10);
        this.f54675k.r(this.f54667c, -1);
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(dI.C17164e<? super l5.W.b> r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            boolean r2 = r0 instanceof l5.W.d
            if (r2 == 0) goto L_0x0017
            r2 = r0
            l5.W$d r2 = (l5.W.d) r2
            int r3 = r2.f54700g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f54700g = r3
            goto L_0x001c
        L_0x0017:
            l5.W$d r2 = new l5.W$d
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f54698e
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f54700g
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0045
            if (r4 != r5) goto L_0x003d
            java.lang.Object r3 = r2.f54697d
            androidx.work.WorkerParameters r3 = (androidx.work.WorkerParameters) r3
            java.lang.Object r2 = r2.f54696c
            l5.W r2 = (l5.W) r2
            XH.y.b(r0)     // Catch:{ CancellationException -> 0x003a, all -> 0x0037 }
            goto L_0x01f6
        L_0x0037:
            r0 = move-exception
            goto L_0x020a
        L_0x003a:
            r0 = move-exception
            goto L_0x0248
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0045:
            XH.y.b(r0)
            androidx.work.c r0 = r1.f54671g
            androidx.work.N r0 = r0.n()
            boolean r0 = r0.isEnabled()
            s5.u r4 = r1.f54665a
            java.lang.String r4 = r4.k()
            if (r0 == 0) goto L_0x006b
            if (r4 == 0) goto L_0x006b
            androidx.work.c r7 = r1.f54671g
            androidx.work.N r7 = r7.n()
            s5.u r8 = r1.f54665a
            int r8 = r8.hashCode()
            r7.c(r4, r8)
        L_0x006b:
            androidx.work.impl.WorkDatabase r7 = r1.f54674j
            l5.U r8 = new l5.U
            r8.<init>(r1)
            java.lang.Object r7 = r7.runInTransaction(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.String r8 = "shouldExit"
            kotlin.jvm.internal.C17542s.i(r7, r8)
            boolean r7 = r7.booleanValue()
            r8 = 0
            if (r7 == 0) goto L_0x008a
            l5.W$b$c r0 = new l5.W$b$c
            r0.<init>(r8, r5, r6)
            return r0
        L_0x008a:
            s5.u r7 = r1.f54665a
            boolean r7 = r7.n()
            if (r7 == 0) goto L_0x0098
            s5.u r7 = r1.f54665a
            androidx.work.f r7 = r7.f55914e
        L_0x0096:
            r11 = r7
            goto L_0x00eb
        L_0x0098:
            androidx.work.c r7 = r1.f54671g
            androidx.work.o r7 = r7.f()
            s5.u r9 = r1.f54665a
            java.lang.String r9 = r9.f55913d
            androidx.work.n r7 = r7.b(r9)
            if (r7 != 0) goto L_0x00ce
            java.lang.String r0 = l5.Y.f54711a
            androidx.work.y r2 = androidx.work.C7055y.e()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not create Input Merger "
            r3.append(r4)
            s5.u r4 = r1.f54665a
            java.lang.String r4 = r4.f55913d
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.c(r0, r3)
            l5.W$b$a r0 = new l5.W$b$a
            r0.<init>(r6, r5, r6)
            return r0
        L_0x00ce:
            s5.u r9 = r1.f54665a
            androidx.work.f r9 = r9.f55914e
            java.util.List r9 = YH.C16877v.e(r9)
            java.util.Collection r9 = (java.util.Collection) r9
            s5.v r10 = r1.f54675k
            java.lang.String r11 = r1.f54667c
            java.util.List r10 = r10.l(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r9 = YH.C16877v.V0(r9, r10)
            androidx.work.f r7 = r7.a(r9)
            goto L_0x0096
        L_0x00eb:
            androidx.work.WorkerParameters r7 = new androidx.work.WorkerParameters
            java.lang.String r9 = r1.f54667c
            java.util.UUID r10 = java.util.UUID.fromString(r9)
            java.util.List<java.lang.String> r9 = r1.f54677m
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12
            androidx.work.WorkerParameters$a r13 = r1.f54668d
            s5.u r9 = r1.f54665a
            int r14 = r9.f55920k
            int r15 = r9.f()
            androidx.work.c r9 = r1.f54671g
            java.util.concurrent.Executor r16 = r9.d()
            androidx.work.c r9 = r1.f54671g
            dI.i r17 = r9.o()
            u5.b r9 = r1.f54670f
            androidx.work.c r8 = r1.f54671g
            androidx.work.V r19 = r8.q()
            t5.N r8 = new t5.N
            androidx.work.impl.WorkDatabase r5 = r1.f54674j
            u5.b r6 = r1.f54670f
            r8.<init>(r5, r6)
            t5.L r5 = new t5.L
            androidx.work.impl.WorkDatabase r6 = r1.f54674j
            r18 = r9
            r5.a r9 = r1.f54673i
            r22 = r3
            u5.b r3 = r1.f54670f
            r5.<init>(r6, r9, r3)
            r3 = r18
            r9 = r7
            r20 = r8
            r21 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.work.x r3 = r1.f54669e
            if (r3 != 0) goto L_0x018e
            androidx.work.c r3 = r1.f54671g     // Catch:{ all -> 0x014d }
            androidx.work.V r3 = r3.q()     // Catch:{ all -> 0x014d }
            android.content.Context r5 = r1.f54666b     // Catch:{ all -> 0x014d }
            s5.u r6 = r1.f54665a     // Catch:{ all -> 0x014d }
            java.lang.String r6 = r6.f55912c     // Catch:{ all -> 0x014d }
            androidx.work.x r3 = r3.b(r5, r6, r7)     // Catch:{ all -> 0x014d }
            goto L_0x018e
        L_0x014d:
            r0 = move-exception
            java.lang.String r2 = l5.Y.f54711a
            androidx.work.y r3 = androidx.work.C7055y.e()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not create Worker "
            r4.append(r5)
            s5.u r5 = r1.f54665a
            java.lang.String r5 = r5.f55912c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.c(r2, r4)
            androidx.work.c r2 = r1.f54671g
            H2.a r2 = r2.r()
            if (r2 == 0) goto L_0x0186
            androidx.work.U r3 = new androidx.work.U
            s5.u r4 = r1.f54665a
            java.lang.String r4 = r4.f55912c
            r3.<init>(r4, r7, r0)
            java.lang.String r0 = l5.Y.f54711a
            t5.C8805P.a(r2, r3, r0)
        L_0x0186:
            l5.W$b$a r0 = new l5.W$b$a
            r2 = 1
            r3 = 0
            r0.<init>(r3, r2, r3)
            return r0
        L_0x018e:
            r3.setUsed()
            dI.i r5 = r2.getContext()
            QJ.F0$b r6 = QJ.F0.f137562d0
            dI.i$b r5 = r5.get(r6)
            kotlin.jvm.internal.C17542s.g(r5)
            QJ.F0 r5 = (QJ.F0) r5
            l5.W$e r6 = new l5.W$e
            r6.<init>(r3, r0, r4, r1)
            r5.s(r6)
            boolean r0 = r23.z()
            if (r0 != 0) goto L_0x01b7
            l5.W$b$c r0 = new l5.W$b$c
            r4 = 1
            r6 = 0
            r8 = 0
            r0.<init>(r8, r4, r6)
            return r0
        L_0x01b7:
            r4 = 1
            r6 = 0
            r8 = 0
            boolean r0 = r5.isCancelled()
            if (r0 == 0) goto L_0x01c6
            l5.W$b$c r0 = new l5.W$b$c
            r0.<init>(r8, r4, r6)
            return r0
        L_0x01c6:
            androidx.work.m r0 = r7.b()
            java.lang.String r4 = "params.foregroundUpdater"
            kotlin.jvm.internal.C17542s.i(r0, r4)
            u5.b r4 = r1.f54670f
            java.util.concurrent.Executor r4 = r4.a()
            java.lang.String r5 = "workTaskExecutor.getMainThreadExecutor()"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            QJ.M r4 = QJ.C16340x0.b(r4)
            l5.W$f r5 = new l5.W$f     // Catch:{ CancellationException -> 0x0207, all -> 0x0203 }
            r6 = 0
            r5.<init>(r1, r3, r0, r6)     // Catch:{ CancellationException -> 0x0207, all -> 0x0203 }
            r2.f54696c = r1     // Catch:{ CancellationException -> 0x0207, all -> 0x0203 }
            r2.f54697d = r7     // Catch:{ CancellationException -> 0x0207, all -> 0x0203 }
            r3 = 1
            r2.f54700g = r3     // Catch:{ CancellationException -> 0x0207, all -> 0x0203 }
            java.lang.Object r0 = QJ.C16310i.g(r4, r5, r2)     // Catch:{ CancellationException -> 0x0207, all -> 0x0203 }
            r2 = r22
            if (r0 != r2) goto L_0x01f4
            return r2
        L_0x01f4:
            r2 = r1
            r3 = r7
        L_0x01f6:
            androidx.work.x$a r0 = (androidx.work.C7054x.a) r0     // Catch:{ CancellationException -> 0x003a, all -> 0x0037 }
            l5.W$b$b r4 = new l5.W$b$b     // Catch:{ CancellationException -> 0x003a, all -> 0x0037 }
            java.lang.String r5 = "result"
            kotlin.jvm.internal.C17542s.i(r0, r5)     // Catch:{ CancellationException -> 0x003a, all -> 0x0037 }
            r4.<init>(r0)     // Catch:{ CancellationException -> 0x003a, all -> 0x0037 }
            return r4
        L_0x0203:
            r0 = move-exception
            r2 = r1
            r3 = r7
            goto L_0x020a
        L_0x0207:
            r0 = move-exception
            r2 = r1
            goto L_0x0248
        L_0x020a:
            java.lang.String r4 = l5.Y.f54711a
            androidx.work.y r5 = androidx.work.C7055y.e()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.f54678n
            r6.append(r7)
            java.lang.String r7 = " failed because it threw an exception/error"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.d(r4, r6, r0)
            androidx.work.c r4 = r2.f54671g
            H2.a r4 = r4.p()
            if (r4 == 0) goto L_0x0240
            androidx.work.U r5 = new androidx.work.U
            s5.u r2 = r2.f54665a
            java.lang.String r2 = r2.f55912c
            r5.<init>(r2, r3, r0)
            java.lang.String r0 = l5.Y.f54711a
            t5.C8805P.a(r4, r5, r0)
        L_0x0240:
            l5.W$b$a r0 = new l5.W$b$a
            r2 = 1
            r3 = 0
            r0.<init>(r3, r2, r3)
            return r0
        L_0x0248:
            java.lang.String r3 = l5.Y.f54711a
            androidx.work.y r4 = androidx.work.C7055y.e()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.f54678n
            r5.append(r2)
            java.lang.String r2 = " was cancelled"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.g(r3, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.W.v(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Boolean w(W w10) {
        C8739u uVar = w10.f54665a;
        if (uVar.f55911b != Q.c.ENQUEUED) {
            String a10 = Y.f54711a;
            C7055y e10 = C7055y.e();
            e10.a(a10, w10.f54665a.f55912c + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        } else if ((!uVar.n() && !w10.f54665a.m()) || w10.f54672h.a() >= w10.f54665a.c()) {
            return Boolean.FALSE;
        } else {
            C7055y e11 = C7055y.e();
            String a11 = Y.f54711a;
            e11.a(a11, "Delaying execution for " + w10.f54665a.f55912c + " because it is being executed before schedule.");
            return Boolean.TRUE;
        }
    }

    private final boolean y(C7054x.a aVar) {
        this.f54675k.v(Q.c.SUCCEEDED, this.f54667c);
        C17542s.h(aVar, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        C7037f e10 = ((C7054x.a.c) aVar).e();
        C17542s.i(e10, "success.outputData");
        this.f54675k.w(this.f54667c, e10);
        long a10 = this.f54672h.a();
        for (String next : this.f54676l.a(this.f54667c)) {
            if (this.f54675k.h(next) == Q.c.BLOCKED && this.f54676l.b(next)) {
                String a11 = Y.f54711a;
                C7055y e11 = C7055y.e();
                e11.f(a11, "Setting status to enqueued for " + next);
                this.f54675k.v(Q.c.ENQUEUED, next);
                this.f54675k.x(next, a10);
            }
        }
        return false;
    }

    private final boolean z() {
        Object runInTransaction = this.f54674j.runInTransaction(new V(this));
        C17542s.i(runInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) runInTransaction).booleanValue();
    }

    public final C8731m l() {
        return z.a(this.f54665a);
    }

    public final C8739u m() {
        return this.f54665a;
    }

    public final void o(int i10) {
        this.f54679o.i(new Q(i10));
    }

    public final C10101e<Boolean> q() {
        return C7052v.k(this.f54670f.b().plus(J0.b((F0) null, 1, (Object) null)), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    public final boolean x(C7054x.a aVar) {
        C17542s.j(aVar, "result");
        p(this.f54667c);
        C7037f e10 = ((C7054x.a.C0779a) aVar).e();
        C17542s.i(e10, "failure.outputData");
        this.f54675k.D(this.f54667c, this.f54665a.h());
        this.f54675k.w(this.f54667c, e10);
        return false;
    }
}
