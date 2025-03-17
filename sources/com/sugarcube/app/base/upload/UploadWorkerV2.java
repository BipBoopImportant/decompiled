package com.sugarcube.app.base.upload;

import LF.C13187c;
import OE.n;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.B;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7042k;
import androidx.work.C7043l;
import androidx.work.CoroutineWorker;
import androidx.work.H;
import androidx.work.S;
import androidx.work.WorkerParameters;
import dF.C14344b;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0012B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH@¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadWorkerV2;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/l;", "b", "(Landroid/content/Context;)Landroidx/work/l;", "Landroid/app/Notification;", "c", "(Landroid/content/Context;)Landroid/app/Notification;", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "getForegroundInfo", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/work/WorkerParameters;", "getParams", "()Landroidx/work/WorkerParameters;", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "e", "()Lcom/sugarcube/app/base/upload/IUploaderV2;", "setUploader", "(Lcom/sugarcube/app/base/upload/IUploaderV2;)V", "uploader", "LLF/c;", "d", "LLF/c;", "()LLF/c;", "setLog", "(LLF/c;)V", "log", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadWorkerV2 extends CoroutineWorker {

    /* renamed from: e  reason: collision with root package name */
    public static final a f125753e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f125754f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f125755a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkerParameters f125756b;

    /* renamed from: c  reason: collision with root package name */
    public IUploaderV2 f125757c;

    /* renamed from: d  reason: collision with root package name */
    public C13187c f125758d;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadWorkerV2$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "retryFailures", "LXH/N;", "b", "(Landroid/content/Context;Z)V", "Landroidx/work/f;", "a", "(Z)Landroidx/work/f;", "", "WORKER_TAG", "Ljava/lang/String;", "DATA_KEY_RETRY_FAILURES", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7037f a(boolean z10) {
            C7037f.a aVar = new C7037f.a();
            aVar.e("retry_failures", z10);
            return aVar.a();
        }

        public final void b(Context context, boolean z10) {
            C17542s.j(context, "context");
            C7037f a10 = a(z10);
            C7036e a11 = new C7036e.a().a();
            S.f45094a.a(context).g("UploadV2Worker", C7042k.KEEP, (B) ((B.a) ((B.a) ((B.a) ((B.a) new B.a(UploadWorkerV2.class).n(a10)).j(a11)).a("UploadV2Worker")).k(H.RUN_AS_NON_EXPEDITED_WORK_REQUEST)).b());
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.upload.UploadWorkerV2", f = "UploadWorkerV2.kt", l = {52, 59}, m = "doWork")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f125759c;

        /* renamed from: d  reason: collision with root package name */
        Object f125760d;

        /* renamed from: e  reason: collision with root package name */
        boolean f125761e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f125762f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UploadWorkerV2 f125763g;

        /* renamed from: h  reason: collision with root package name */
        int f125764h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UploadWorkerV2 uploadWorkerV2, C17164e<? super b> eVar) {
            super(eVar);
            this.f125763g = uploadWorkerV2;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125762f = obj;
            this.f125764h |= Integer.MIN_VALUE;
            return this.f125763g.doWork(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadWorkerV2(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C17542s.j(context, "context");
        C17542s.j(workerParameters, "params");
        this.f125755a = context;
        this.f125756b = workerParameters;
    }

    private final C7043l b(Context context) {
        return new C7043l(1, c(context), (Build.VERSION.SDK_INT < 29 || C6012a.a(context, "android.permission.FOREGROUND_SERVICE_DATA_SYNC") != 0) ? 0 : 1);
    }

    private final Notification c(Context context) {
        Notification build = new Notification.Builder(context, "Geomagical").setContentTitle(context.getString(n.f113455s5)).setTicker(context.getString(n.f113455s5)).setSmallIcon(C18146a.f148539m).setOngoing(true).setChannelId(C14344b.f126192a.a(context).a()).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public final C13187c d() {
        C13187c cVar = this.f125758d;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("log");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1 A[PHI: r1 
      PHI: (r1v1 java.lang.Object) = (r1v4 java.lang.Object), (r1v0 java.lang.Object) binds: [B:28:0x009e, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.sugarcube.app.base.upload.UploadWorkerV2.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.app.base.upload.UploadWorkerV2$b r0 = (com.sugarcube.app.base.upload.UploadWorkerV2.b) r0
            int r1 = r0.f125764h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f125764h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.UploadWorkerV2$b r0 = new com.sugarcube.app.base.upload.UploadWorkerV2$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f125762f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f125764h
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x004a
            if (r3 == r4) goto L_0x003c
            if (r3 != r5) goto L_0x0034
            java.lang.Object r9 = r0.f125760d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f125759c
            com.sugarcube.app.base.upload.UploadWorkerV2 r9 = (com.sugarcube.app.base.upload.UploadWorkerV2) r9
            XH.y.b(r1)
            goto L_0x00a1
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.f125760d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f125759c
            com.sugarcube.app.base.upload.UploadWorkerV2 r3 = (com.sugarcube.app.base.upload.UploadWorkerV2) r3
            XH.y.b(r1)     // Catch:{ IllegalStateException -> 0x0048 }
            goto L_0x0083
        L_0x0048:
            r1 = move-exception
            goto L_0x0068
        L_0x004a:
            XH.y.b(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 >= r3) goto L_0x0082
            android.content.Context r1 = r8.f125755a     // Catch:{ IllegalStateException -> 0x0066 }
            androidx.work.l r1 = r8.b(r1)     // Catch:{ IllegalStateException -> 0x0066 }
            r0.f125759c = r8     // Catch:{ IllegalStateException -> 0x0066 }
            r0.f125760d = r9     // Catch:{ IllegalStateException -> 0x0066 }
            r0.f125764h = r4     // Catch:{ IllegalStateException -> 0x0066 }
            java.lang.Object r1 = r8.setForeground(r1, r0)     // Catch:{ IllegalStateException -> 0x0066 }
            if (r1 != r2) goto L_0x0082
            return r2
        L_0x0066:
            r1 = move-exception
            r3 = r8
        L_0x0068:
            LF.c r4 = r3.d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setForeground "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r6 = 0
            LF.C13187c.h(r4, r1, r6, r5, r6)
            goto L_0x0083
        L_0x0082:
            r3 = r8
        L_0x0083:
            androidx.work.f r1 = r3.getInputData()
            java.lang.String r4 = "retry_failures"
            r6 = 0
            boolean r1 = r1.c(r4, r6)
            com.sugarcube.app.base.upload.IUploaderV2 r4 = r3.e()
            r0.f125759c = r3
            r0.f125760d = r9
            r0.f125761e = r1
            r0.f125764h = r5
            java.lang.Object r1 = r4.startUploading(r1, r3, r0)
            if (r1 != r2) goto L_0x00a1
            return r2
        L_0x00a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.UploadWorkerV2.doWork(dI.e):java.lang.Object");
    }

    public final IUploaderV2 e() {
        IUploaderV2 iUploaderV2 = this.f125757c;
        if (iUploaderV2 != null) {
            return iUploaderV2;
        }
        C17542s.z("uploader");
        return null;
    }

    public Object getForegroundInfo(C17164e<? super C7043l> eVar) {
        return b(this.f125755a);
    }
}
