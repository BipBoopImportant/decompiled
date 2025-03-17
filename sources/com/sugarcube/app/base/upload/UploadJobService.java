package com.sugarcube.app.base.upload;

import KF.C13149c;
import KF.C13156j;
import LF.C13187c;
import OE.C13309a;
import OE.n;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.s;
import dF.C14344b;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", "jobParams", "", "percent", "LXH/N;", "i", "(Landroid/app/job/JobParameters;Ljava/lang/Integer;)V", "params", "e", "(Landroid/app/job/JobParameters;LdI/e;)Ljava/lang/Object;", "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "LOE/a;", "d", "LOE/a;", "f", "()LOE/a;", "setAppEnvironment", "(LOE/a;)V", "appEnvironment", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "h", "()Lcom/sugarcube/app/base/upload/IUploaderV2;", "setUploader", "(Lcom/sugarcube/app/base/upload/IUploaderV2;)V", "uploader", "LLF/c;", "LLF/c;", "g", "()LLF/c;", "setLog", "(LLF/c;)V", "log", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadJobService extends C13149c {

    /* renamed from: g  reason: collision with root package name */
    public static final a f125730g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f125731h = 8;

    /* renamed from: d  reason: collision with root package name */
    public C13309a f125732d;

    /* renamed from: e  reason: collision with root package name */
    public IUploaderV2 f125733e;

    /* renamed from: f  reason: collision with root package name */
    public C13187c f125734f;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadJobService$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LLF/c;", "log", "", "retryFailures", "", "jobId", "a", "(Landroid/content/Context;LLF/c;ZI)Z", "", "DATA_KEY_RETRY_FAILURES", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean b(a aVar, Context context, C13187c cVar, boolean z10, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            if ((i11 & 8) != 0) {
                i10 = 1;
            }
            return aVar.a(context, cVar, z10, i10);
        }

        public final boolean a(Context context, C13187c cVar, boolean z10, int i10) {
            int i11;
            C17542s.j(context, "context");
            C17542s.j(cVar, "log");
            Object systemService = context.getSystemService("jobscheduler");
            C17542s.h(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) systemService;
            JobInfo.Builder requiredNetworkType = new JobInfo.Builder(i10, new ComponentName(context, UploadJobService.class)).setRequiredNetworkType(1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("retry_failures", z10);
            JobInfo.Builder extras = requiredNetworkType.setExtras(persistableBundle);
            if (Build.VERSION.SDK_INT < 34) {
                C13187c.e(cVar, "startUploadJob schedule job", (C13187c.a) null, (Throwable) null, 6, (Object) null);
                i11 = jobScheduler.schedule(extras.build());
            } else if (!jobScheduler.canRunUserInitiatedJobs()) {
                return false;
            } else {
                JobInfo.Builder unused = extras.setExpedited(true);
                JobWorkItem.Builder a10 = C13156j.a();
                PersistableBundle persistableBundle2 = new PersistableBundle();
                persistableBundle2.putBoolean("retry_failures", z10);
                JobWorkItem.Builder a11 = a10.setExtras(persistableBundle2).setMinimumNetworkChunkBytes(1000);
                C17542s.i(a11, "setMinimumNetworkChunkBytes(...)");
                C13187c.e(cVar, "startUploadJob enqueue work item", (C13187c.a) null, (Throwable) null, 6, (Object) null);
                i11 = jobScheduler.enqueue(extras.build(), a11.build());
            }
            C13187c.e(cVar, "startUploadJob result=" + i11, (C13187c.a) null, (Throwable) null, 6, (Object) null);
            return true;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadJobService$doWork$2", f = "UploadJobService.kt", l = {128}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f125735c;

        /* renamed from: d  reason: collision with root package name */
        boolean f125736d;

        /* renamed from: e  reason: collision with root package name */
        Object f125737e;

        /* renamed from: f  reason: collision with root package name */
        Object f125738f;

        /* renamed from: g  reason: collision with root package name */
        Object f125739g;

        /* renamed from: h  reason: collision with root package name */
        Object f125740h;

        /* renamed from: i  reason: collision with root package name */
        Object f125741i;

        /* renamed from: j  reason: collision with root package name */
        int f125742j;

        /* renamed from: k  reason: collision with root package name */
        int f125743k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ JobParameters f125744l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ UploadJobService f125745m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(JobParameters jobParameters, UploadJobService uploadJobService, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f125744l = jobParameters;
            this.f125745m = uploadJobService;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f125744l, this.f125745m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0068 A[Catch:{ all -> 0x0028 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f125743k
                java.lang.String r2 = "retry_failures"
                r3 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 != r3) goto L_0x002c
                boolean r1 = r14.f125735c
                java.lang.Object r4 = r14.f125741i
                android.app.job.JobWorkItem r4 = (android.app.job.JobWorkItem) r4
                java.lang.Object r5 = r14.f125740h
                android.app.job.JobParameters r5 = (android.app.job.JobParameters) r5
                java.lang.Object r6 = r14.f125739g
                com.sugarcube.app.base.upload.UploadJobService r6 = (com.sugarcube.app.base.upload.UploadJobService) r6
                java.lang.Object r7 = r14.f125738f
                android.app.job.JobWorkItem r7 = (android.app.job.JobWorkItem) r7
                java.lang.Object r7 = r14.f125737e
                android.app.job.JobWorkItem r7 = (android.app.job.JobWorkItem) r7
                XH.y.b(r15)     // Catch:{ all -> 0x0028 }
                goto L_0x00c3
            L_0x0028:
                r15 = move-exception
                r3 = r15
                goto L_0x00e6
            L_0x002c:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0034:
                XH.y.b(r15)
                android.app.job.JobParameters r15 = r14.f125744l
                android.os.PersistableBundle r15 = r15.getExtras()
                boolean r15 = r15.getBoolean(r2)
                com.sugarcube.app.base.upload.UploadJobService r1 = r14.f125745m
                LF.c r4 = r1.g()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "doWork start retryFailures="
                r1.append(r5)
                r1.append(r15)
                java.lang.String r5 = r1.toString()
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                LF.C13187c.e(r4, r5, r6, r7, r8, r9)
                r1 = r15
            L_0x0060:
                android.app.job.JobParameters r15 = r14.f125744l     // Catch:{ all -> 0x0028 }
                android.app.job.JobWorkItem r4 = r15.dequeueWork()     // Catch:{ all -> 0x0028 }
                if (r4 == 0) goto L_0x00f4
                com.sugarcube.app.base.upload.UploadJobService r6 = r14.f125745m     // Catch:{ all -> 0x0028 }
                android.app.job.JobParameters r5 = r14.f125744l     // Catch:{ all -> 0x0028 }
                int r15 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0028 }
                r7 = 34
                if (r15 < r7) goto L_0x007b
                android.os.PersistableBundle r15 = r4.getExtras()     // Catch:{ all -> 0x0028 }
                boolean r15 = r15.getBoolean(r2)     // Catch:{ all -> 0x0028 }
                goto L_0x007c
            L_0x007b:
                r15 = r1
            L_0x007c:
                LF.c r7 = r6.g()     // Catch:{ all -> 0x0028 }
                int r8 = r4.getDeliveryCount()     // Catch:{ all -> 0x0028 }
                r13 = 0
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
                r9.<init>()     // Catch:{ all -> 0x0028 }
                java.lang.String r10 = "doWork JobWorkItem("
                r9.append(r10)     // Catch:{ all -> 0x0028 }
                r9.append(r8)     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = ") retryFailures="
                r9.append(r8)     // Catch:{ all -> 0x0028 }
                r9.append(r15)     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0028 }
                r11 = 6
                r12 = 0
                r9 = 0
                r10 = 0
                LF.C13187c.e(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0028 }
                com.sugarcube.app.base.upload.IUploaderV2 r7 = r6.h()     // Catch:{ all -> 0x0028 }
                r14.f125737e = r4     // Catch:{ all -> 0x0028 }
                r14.f125738f = r4     // Catch:{ all -> 0x0028 }
                r14.f125739g = r6     // Catch:{ all -> 0x0028 }
                r14.f125740h = r5     // Catch:{ all -> 0x0028 }
                r14.f125741i = r4     // Catch:{ all -> 0x0028 }
                r14.f125735c = r1     // Catch:{ all -> 0x0028 }
                r14.f125742j = r13     // Catch:{ all -> 0x0028 }
                r14.f125736d = r15     // Catch:{ all -> 0x0028 }
                r14.f125743k = r3     // Catch:{ all -> 0x0028 }
                r8 = 0
                java.lang.Object r15 = r7.startUploading(r15, r8, r14)     // Catch:{ all -> 0x0028 }
                if (r15 != r0) goto L_0x00c3
                return r0
            L_0x00c3:
                androidx.work.x$a r15 = (androidx.work.C7054x.a) r15     // Catch:{ all -> 0x0028 }
                LF.c r7 = r6.g()     // Catch:{ all -> 0x0028 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
                r6.<init>()     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = "doWork JobWorkItem result="
                r6.append(r8)     // Catch:{ all -> 0x0028 }
                r6.append(r15)     // Catch:{ all -> 0x0028 }
                java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x0028 }
                r11 = 6
                r12 = 0
                r9 = 0
                r10 = 0
                LF.C13187c.e(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0028 }
                r5.completeWork(r4)     // Catch:{ all -> 0x0028 }
                goto L_0x0060
            L_0x00e6:
                com.sugarcube.app.base.upload.UploadJobService r15 = r14.f125745m
                LF.c r0 = r15.g()
                r4 = 2
                r5 = 0
                java.lang.String r1 = "doWork dequeueWork error"
                r2 = 0
                LF.C13187c.e(r0, r1, r2, r3, r4, r5)
            L_0x00f4:
                com.sugarcube.app.base.upload.UploadJobService r15 = r14.f125745m
                LF.c r0 = r15.g()
                r4 = 6
                r5 = 0
                java.lang.String r1 = "doWork done"
                r2 = 0
                r3 = 0
                LF.C13187c.e(r0, r1, r2, r3, r4, r5)
                XH.N r15 = XH.C16807N.f139792a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.UploadJobService.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadJobService$onStartJob$1", f = "UploadJobService.kt", l = {54}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125746c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UploadJobService f125747d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JobParameters f125748e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UploadJobService uploadJobService, JobParameters jobParameters, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f125747d = uploadJobService;
            this.f125748e = jobParameters;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f125747d, this.f125748e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125746c;
            if (i10 == 0) {
                y.b(obj);
                UploadJobService uploadJobService = this.f125747d;
                JobParameters jobParameters = this.f125748e;
                this.f125746c = 1;
                if (uploadJobService.e(jobParameters, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final Object e(JobParameters jobParameters, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(C16311i0.b(), new b(jobParameters, this, (C17164e<? super b>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    private final void i(JobParameters jobParameters, Integer num) {
        Notification.Builder contentIntent = new Notification.Builder(this, "Geomagical").setContentTitle(getString(n.f113455s5)).setTicker(getString(n.f113455s5)).setSmallIcon(C18146a.f148539m).setOngoing(true).setAutoCancel(true).setChannelId(C14344b.f126192a.a(this).a()).setContentIntent(PendingIntent.getActivity(this, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://sugarcube.com")), 67108864));
        C17542s.i(contentIntent, "setContentIntent(...)");
        if (num != null) {
            contentIntent.setProgress(100, num.intValue(), false);
        }
        Notification build = contentIntent.build();
        C17542s.i(build, "build(...)");
        if (Build.VERSION.SDK_INT >= 34) {
            C13187c g10 = g();
            C13187c.e(g10, "notifyProgress setNotification (" + num + ")", (C13187c.a) null, (Throwable) null, 6, (Object) null);
            setNotification(jobParameters, 1, build, 1);
        } else if (C6012a.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            C13187c g11 = g();
            C13187c.e(g11, "notifyProgress notify (" + num + ")", (C13187c.a) null, (Throwable) null, 6, (Object) null);
            s.g(getApplicationContext()).j(1, build);
        }
    }

    static /* synthetic */ void j(UploadJobService uploadJobService, JobParameters jobParameters, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        uploadJobService.i(jobParameters, num);
    }

    public final C13309a f() {
        C13309a aVar = this.f125732d;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appEnvironment");
        return null;
    }

    public final C13187c g() {
        C13187c cVar = this.f125734f;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("log");
        return null;
    }

    public final IUploaderV2 h() {
        IUploaderV2 iUploaderV2 = this.f125733e;
        if (iUploaderV2 != null) {
            return iUploaderV2;
        }
        C17542s.z("uploader");
        return null;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        C13187c g10 = g();
        PersistableBundle extras = jobParameters != null ? jobParameters.getExtras() : null;
        C13187c.e(g10, "onStartJob " + extras, (C13187c.a) null, (Throwable) null, 6, (Object) null);
        if (jobParameters == null) {
            return false;
        }
        j(this, jobParameters, (Integer) null, 2, (Object) null);
        F0 unused = C16314k.d(f().b(), C16311i0.b(), (T) null, new c(this, jobParameters, (C17164e<? super c>) null), 2, (Object) null);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        C13187c g10 = g();
        C13187c.e(g10, "onStopJob " + jobParameters, (C13187c.a) null, (Throwable) null, 6, (Object) null);
        if (Build.VERSION.SDK_INT >= 34) {
            return false;
        }
        s.g(getApplicationContext()).b(1);
        return false;
    }
}
