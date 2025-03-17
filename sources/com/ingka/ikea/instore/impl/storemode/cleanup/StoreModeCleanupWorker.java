package com.ingka.ikea.instore.impl.storemode.cleanup;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lu.C11569b;
import nt.C11674a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/instore/impl/storemode/cleanup/StoreModeCleanupWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Llu/b;", "disableStoreModeUseCase", "Lnt/a;", "storeModeLocalDataSource", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Llu/b;Lnt/a;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "Llu/b;", "b", "Lnt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreModeCleanupWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final C11569b f96311a;

    /* renamed from: b  reason: collision with root package name */
    private final C11674a f96312b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker", f = "StoreModeCleanupWorker.kt", l = {29, 30, 31, 32}, m = "doWork")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f96313c;

        /* renamed from: d  reason: collision with root package name */
        Object f96314d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f96315e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ StoreModeCleanupWorker f96316f;

        /* renamed from: g  reason: collision with root package name */
        int f96317g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StoreModeCleanupWorker storeModeCleanupWorker, C17164e<? super a> eVar) {
            super(eVar);
            this.f96316f = storeModeCleanupWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96315e = obj;
            this.f96317g |= Integer.MIN_VALUE;
            return this.f96316f.doWork(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreModeCleanupWorker(Context context, WorkerParameters workerParameters, C11569b bVar, C11674a aVar) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "workerParams");
        C17542s.j(bVar, "disableStoreModeUseCase");
        C17542s.j(aVar, "storeModeLocalDataSource");
        this.f96311a = bVar;
        this.f96312b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker$a r0 = (com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker.a) r0
            int r1 = r0.f96317g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96317g = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker$a r0 = new com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker$a
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f96315e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f96317g
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0067
            if (r3 == r7) goto L_0x005b
            if (r3 == r6) goto L_0x004f
            if (r3 == r5) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r10 = r0.f96314d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f96313c
            com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker r10 = (com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker) r10
            XH.y.b(r1)
            goto L_0x00a9
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0043:
            java.lang.Object r10 = r0.f96314d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r3 = r0.f96313c
            com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker r3 = (com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker) r3
            XH.y.b(r1)
            goto L_0x009a
        L_0x004f:
            java.lang.Object r10 = r0.f96314d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r3 = r0.f96313c
            com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker r3 = (com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker) r3
            XH.y.b(r1)
            goto L_0x008b
        L_0x005b:
            java.lang.Object r10 = r0.f96314d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r3 = r0.f96313c
            com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker r3 = (com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker) r3
            XH.y.b(r1)
            goto L_0x007c
        L_0x0067:
            XH.y.b(r1)
            lu.b r1 = r9.f96311a
            lu.b$a$a r3 = lu.C11569b.a.C2278a.f99498a
            r0.f96313c = r9
            r0.f96314d = r10
            r0.f96317g = r7
            java.lang.Object r1 = r1.a(r3, r0)
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x007b:
            r3 = r9
        L_0x007c:
            nt.a r1 = r3.f96312b
            r0.f96313c = r3
            r0.f96314d = r10
            r0.f96317g = r6
            java.lang.Object r1 = r1.h(r8, r0)
            if (r1 != r2) goto L_0x008b
            return r2
        L_0x008b:
            nt.a r1 = r3.f96312b
            r0.f96313c = r3
            r0.f96314d = r10
            r0.f96317g = r5
            java.lang.Object r1 = r1.g(r8, r0)
            if (r1 != r2) goto L_0x009a
            return r2
        L_0x009a:
            nt.a r1 = r3.f96312b
            r0.f96313c = r3
            r0.f96314d = r10
            r0.f96317g = r4
            java.lang.Object r10 = r1.f(r8, r0)
            if (r10 != r2) goto L_0x00a9
            return r2
        L_0x00a9:
            androidx.work.x$a r10 = androidx.work.C7054x.a.c()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.C17542s.i(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker.doWork(dI.e):java.lang.Object");
    }
}
