package t5;

import androidx.work.C7052v;
import androidx.work.Q;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import ob.C10101e;
import s5.C8739u;
import s5.v;
import u5.C8877a;
import u5.C8878b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lu5/b;", "executor", "Ljava/util/UUID;", "id", "Lob/e;", "Landroidx/work/Q;", "a", "(Landroidx/work/impl/WorkDatabase;Lu5/b;Ljava/util/UUID;)Lob/e;", "", "name", "", "b", "(Landroidx/work/impl/WorkDatabase;Lu5/b;Ljava/lang/String;)Lob/e;", "T", "Lkotlin/Function1;", "block", "c", "(Landroidx/work/impl/WorkDatabase;Lu5/b;LnI/l;)Lob/e;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.F  reason: case insensitive filesystem */
public final class C8795F {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "db", "Landroidx/work/Q;", "a", "(Landroidx/work/impl/WorkDatabase;)Landroidx/work/Q;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t5.F$a */
    static final class a extends C17544u implements C17642l<WorkDatabase, Q> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f56567c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UUID uuid) {
            super(1);
            this.f56567c = uuid;
        }

        /* renamed from: a */
        public final Q invoke(WorkDatabase workDatabase) {
            C17542s.j(workDatabase, "db");
            v f10 = workDatabase.f();
            String uuid = this.f56567c.toString();
            C17542s.i(uuid, "id.toString()");
            C8739u.c g10 = f10.g(uuid);
            if (g10 != null) {
                return g10.e();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "db", "", "Landroidx/work/Q;", "a", "(Landroidx/work/impl/WorkDatabase;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t5.F$b */
    static final class b extends C17544u implements C17642l<WorkDatabase, List<? extends Q>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f56568c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f56568c = str;
        }

        /* renamed from: a */
        public final List<Q> invoke(WorkDatabase workDatabase) {
            C17542s.j(workDatabase, "db");
            List<Q> apply = C8739u.f55907A.apply(workDatabase.f().m(this.f56568c));
            C17542s.i(apply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
            return apply;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t5.F$c */
    static final class c extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<WorkDatabase, T> f56569c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f56570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<? super WorkDatabase, ? extends T> lVar, WorkDatabase workDatabase) {
            super(0);
            this.f56569c = lVar;
            this.f56570d = workDatabase;
        }

        public final T invoke() {
            return this.f56569c.invoke(this.f56570d);
        }
    }

    public static final C10101e<Q> a(WorkDatabase workDatabase, C8878b bVar, UUID uuid) {
        C17542s.j(workDatabase, "<this>");
        C17542s.j(bVar, "executor");
        C17542s.j(uuid, "id");
        return c(workDatabase, bVar, new a(uuid));
    }

    public static final C10101e<List<Q>> b(WorkDatabase workDatabase, C8878b bVar, String str) {
        C17542s.j(workDatabase, "<this>");
        C17542s.j(bVar, "executor");
        C17542s.j(str, "name");
        return c(workDatabase, bVar, new b(str));
    }

    private static final <T> C10101e<T> c(WorkDatabase workDatabase, C8878b bVar, C17642l<? super WorkDatabase, ? extends T> lVar) {
        C8877a c10 = bVar.c();
        C17542s.i(c10, "executor.serialTaskExecutor");
        return C7052v.f(c10, "loadStatusFuture", new c(lVar, workDatabase));
    }
}
