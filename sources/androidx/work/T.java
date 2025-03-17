package androidx.work;

import HJ.C15854t;
import YH.C16877v;
import YH.g0;
import android.annotation.SuppressLint;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s5.C8739u;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u000b\u000eB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/work/T;", "", "Ljava/util/UUID;", "id", "Ls5/u;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Ls5/u;Ljava/util/Set;)V", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Ls5/u;", "d", "()Ls5/u;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "()Ljava/lang/String;", "stringId", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class T {

    /* renamed from: d  reason: collision with root package name */
    public static final b f45095d = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final UUID f45096a;

    /* renamed from: b  reason: collision with root package name */
    private final C8739u f45097b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f45098c;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00028\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00028\u0001H ¢\u0006\u0004\b+\u0010*R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0004¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\"\u00105\u001a\u00020/8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b+\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b1\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0B8\u0000X\u0004¢\u0006\f\n\u0004\b7\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Landroidx/work/T$a;", "B", "Landroidx/work/T;", "W", "", "Ljava/lang/Class;", "Landroidx/work/x;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "l", "(Ljava/util/UUID;)Landroidx/work/T$a;", "Landroidx/work/a;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "i", "(Landroidx/work/a;JLjava/util/concurrent/TimeUnit;)Landroidx/work/T$a;", "Landroidx/work/e;", "constraints", "j", "(Landroidx/work/e;)Landroidx/work/T$a;", "Landroidx/work/f;", "inputData", "n", "(Landroidx/work/f;)Landroidx/work/T$a;", "", "tag", "a", "(Ljava/lang/String;)Landroidx/work/T$a;", "duration", "m", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/T$a;", "Landroidx/work/H;", "policy", "k", "(Landroidx/work/H;)Landroidx/work/T$a;", "b", "()Landroidx/work/T;", "c", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "Z", "d", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Ls5/u;", "Ls5/u;", "h", "()Ls5/u;", "setWorkSpec$work_runtime_release", "(Ls5/u;)V", "workSpec", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "tags", "g", "()Landroidx/work/T$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a<B extends a<B, ?>, W extends T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends C7054x> f45099a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f45100b;

        /* renamed from: c  reason: collision with root package name */
        private UUID f45101c;

        /* renamed from: d  reason: collision with root package name */
        private C8739u f45102d;

        /* renamed from: e  reason: collision with root package name */
        private final Set<String> f45103e;

        public a(Class<? extends C7054x> cls) {
            C17542s.j(cls, "workerClass");
            this.f45099a = cls;
            UUID randomUUID = UUID.randomUUID();
            C17542s.i(randomUUID, "randomUUID()");
            this.f45101c = randomUUID;
            String uuid = this.f45101c.toString();
            C17542s.i(uuid, "id.toString()");
            String name = cls.getName();
            C17542s.i(name, "workerClass.name");
            this.f45102d = new C8739u(uuid, name);
            String name2 = cls.getName();
            C17542s.i(name2, "workerClass.name");
            this.f45103e = g0.f(name2);
        }

        public final B a(String str) {
            C17542s.j(str, "tag");
            this.f45103e.add(str);
            return g();
        }

        public final W b() {
            W c10 = c();
            C7036e eVar = this.f45102d.f55919j;
            boolean z10 = eVar.g() || eVar.h() || eVar.i() || eVar.j();
            C8739u uVar = this.f45102d;
            if (uVar.f55926q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (uVar.f55916g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (uVar.k() == null) {
                C8739u uVar2 = this.f45102d;
                uVar2.t(T.f45095d.b(uVar2.f55912c));
            }
            UUID randomUUID = UUID.randomUUID();
            C17542s.i(randomUUID, "randomUUID()");
            l(randomUUID);
            return c10;
        }

        public abstract W c();

        public final boolean d() {
            return this.f45100b;
        }

        public final UUID e() {
            return this.f45101c;
        }

        public final Set<String> f() {
            return this.f45103e;
        }

        public abstract B g();

        public final C8739u h() {
            return this.f45102d;
        }

        public final B i(C7032a aVar, long j10, TimeUnit timeUnit) {
            C17542s.j(aVar, "backoffPolicy");
            C17542s.j(timeUnit, "timeUnit");
            this.f45100b = true;
            C8739u uVar = this.f45102d;
            uVar.f55921l = aVar;
            uVar.o(timeUnit.toMillis(j10));
            return g();
        }

        public final B j(C7036e eVar) {
            C17542s.j(eVar, "constraints");
            this.f45102d.f55919j = eVar;
            return g();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B k(H h10) {
            C17542s.j(h10, "policy");
            C8739u uVar = this.f45102d;
            uVar.f55926q = true;
            uVar.f55927r = h10;
            return g();
        }

        public final B l(UUID uuid) {
            C17542s.j(uuid, "id");
            this.f45101c = uuid;
            String uuid2 = uuid.toString();
            C17542s.i(uuid2, "id.toString()");
            this.f45102d = new C8739u(uuid2, this.f45102d);
            return g();
        }

        public B m(long j10, TimeUnit timeUnit) {
            C17542s.j(timeUnit, "timeUnit");
            this.f45102d.f55916g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f45102d.f55916g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B n(C7037f fVar) {
            C17542s.j(fVar, "inputData");
            this.f45102d.f55914e = fVar;
            return g();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/work/T$b;", "", "<init>", "()V", "", "workerClassName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(String str) {
            List Y02 = C15854t.Y0(str, new String[]{"."}, false, 0, 6, (Object) null);
            String str2 = Y02.size() == 1 ? (String) Y02.get(0) : (String) C16877v.I0(Y02);
            return str2.length() <= 127 ? str2 : C15854t.K1(str2, 127);
        }

        private b() {
        }
    }

    public T(UUID uuid, C8739u uVar, Set<String> set) {
        C17542s.j(uuid, "id");
        C17542s.j(uVar, "workSpec");
        C17542s.j(set, "tags");
        this.f45096a = uuid;
        this.f45097b = uVar;
        this.f45098c = set;
    }

    public UUID a() {
        return this.f45096a;
    }

    public final String b() {
        String uuid = a().toString();
        C17542s.i(uuid, "id.toString()");
        return uuid;
    }

    public final Set<String> c() {
        return this.f45098c;
    }

    public final C8739u d() {
        return this.f45097b;
    }
}
