package t5;

import XH.C16807N;
import YH.C16877v;
import androidx.work.C;
import androidx.work.G;
import androidx.work.N;
import androidx.work.Q;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l5.C8523t;
import l5.C8525v;
import l5.O;
import nI.C17631a;
import s5.C8720b;
import s5.v;
import u5.C8877a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll5/O;", "workManagerImpl", "", "workSpecId", "LXH/N;", "d", "(Ll5/O;Ljava/lang/String;)V", "k", "(Ll5/O;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "j", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Landroidx/work/C;", "e", "(Ljava/util/UUID;Ll5/O;)Landroidx/work/C;", "tag", "i", "(Ljava/lang/String;Ll5/O;)Landroidx/work/C;", "name", "f", "g", "(Ljava/lang/String;Ll5/O;)V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.d  reason: case insensitive filesystem */
public final class C8809d {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t5.d$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O f56611c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UUID f56612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O o10, UUID uuid) {
            super(0);
            this.f56611c = o10;
            this.f56612d = uuid;
        }

        /* access modifiers changed from: private */
        public static final void b(O o10, UUID uuid) {
            String uuid2 = uuid.toString();
            C17542s.i(uuid2, "id.toString()");
            C8809d.d(o10, uuid2);
        }

        public final void invoke() {
            WorkDatabase w10 = this.f56611c.w();
            C17542s.i(w10, "workManagerImpl.workDatabase");
            w10.runInTransaction((Runnable) new C8808c(this.f56611c, this.f56612d));
            C8809d.k(this.f56611c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t5.d$b */
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f56613c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O f56614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, O o10) {
            super(0);
            this.f56613c = str;
            this.f56614d = o10;
        }

        public final void invoke() {
            C8809d.g(this.f56613c, this.f56614d);
            C8809d.k(this.f56614d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t5.d$c */
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O f56615c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f56616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(O o10, String str) {
            super(0);
            this.f56615c = o10;
            this.f56616d = str;
        }

        /* access modifiers changed from: private */
        public static final void b(WorkDatabase workDatabase, String str, O o10) {
            for (String b10 : workDatabase.f().k(str)) {
                C8809d.d(o10, b10);
            }
        }

        public final void invoke() {
            WorkDatabase w10 = this.f56615c.w();
            C17542s.i(w10, "workManagerImpl.workDatabase");
            w10.runInTransaction((Runnable) new C8810e(w10, this.f56616d, this.f56615c));
            C8809d.k(this.f56615c);
        }
    }

    /* access modifiers changed from: private */
    public static final void d(O o10, String str) {
        WorkDatabase w10 = o10.w();
        C17542s.i(w10, "workManagerImpl.workDatabase");
        j(w10, str);
        C8523t t10 = o10.t();
        C17542s.i(t10, "workManagerImpl.processor");
        t10.t(str, 1);
        for (C8525v a10 : o10.u()) {
            a10.a(str);
        }
    }

    public static final C e(UUID uuid, O o10) {
        C17542s.j(uuid, "id");
        C17542s.j(o10, "workManagerImpl");
        N n10 = o10.p().n();
        C8877a c10 = o10.x().c();
        C17542s.i(c10, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return G.c(n10, "CancelWorkById", c10, new a(o10, uuid));
    }

    public static final C f(String str, O o10) {
        C17542s.j(str, "name");
        C17542s.j(o10, "workManagerImpl");
        N n10 = o10.p().n();
        String str2 = "CancelWorkByName_" + str;
        C8877a c10 = o10.x().c();
        C17542s.i(c10, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return G.c(n10, str2, c10, new b(str, o10));
    }

    public static final void g(String str, O o10) {
        C17542s.j(str, "name");
        C17542s.j(o10, "workManagerImpl");
        WorkDatabase w10 = o10.w();
        C17542s.i(w10, "workManagerImpl.workDatabase");
        w10.runInTransaction((Runnable) new C8807b(w10, str, o10));
    }

    /* access modifiers changed from: private */
    public static final void h(WorkDatabase workDatabase, String str, O o10) {
        for (String d10 : workDatabase.f().f(str)) {
            d(o10, d10);
        }
    }

    public static final C i(String str, O o10) {
        C17542s.j(str, "tag");
        C17542s.j(o10, "workManagerImpl");
        N n10 = o10.p().n();
        String str2 = "CancelWorkByTag_" + str;
        C8877a c10 = o10.x().c();
        C17542s.i(c10, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return G.c(n10, str2, c10, new c(o10, str));
    }

    private static final void j(WorkDatabase workDatabase, String str) {
        v f10 = workDatabase.f();
        C8720b a10 = workDatabase.a();
        List t10 = C16877v.t(str);
        while (!t10.isEmpty()) {
            String str2 = (String) C16877v.O(t10);
            Q.c h10 = f10.h(str2);
            if (!(h10 == Q.c.SUCCEEDED || h10 == Q.c.FAILED)) {
                f10.j(str2);
            }
            t10.addAll(a10.a(str2));
        }
    }

    /* access modifiers changed from: private */
    public static final void k(O o10) {
        androidx.work.impl.a.h(o10.p(), o10.w(), o10.u());
    }
}
