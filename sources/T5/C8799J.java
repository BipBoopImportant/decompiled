package t5;

import QJ.C16310i;
import QJ.C16340x0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.os.Build;
import androidx.concurrent.futures.e;
import androidx.work.C7043l;
import androidx.work.C7044m;
import androidx.work.C7054x;
import androidx.work.C7055y;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import l5.Y;
import nI.p;
import ob.C10101e;
import s5.C8739u;
import u5.C8878b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Ls5/u;", "spec", "Landroidx/work/x;", "worker", "Landroidx/work/m;", "foregroundUpdater", "Lu5/b;", "taskExecutor", "LXH/N;", "b", "(Landroid/content/Context;Ls5/u;Landroidx/work/x;Landroidx/work/m;Lu5/b;LdI/e;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.J  reason: case insensitive filesystem */
public final class C8799J {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f56578a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(LQJ/Q;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
    /* renamed from: t5.J$a */
    static final class a extends l implements p<Q, C17164e<? super Void>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f56579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7054x f56580d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8739u f56581e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C7044m f56582f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f56583g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C7054x xVar, C8739u uVar, C7044m mVar, Context context, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f56580d = xVar;
            this.f56581e = uVar;
            this.f56582f = mVar;
            this.f56583g = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f56580d, this.f56581e, this.f56582f, this.f56583g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Void> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f56579c;
            if (i10 == 0) {
                y.b(obj);
                C10101e<C7043l> foregroundInfoAsync = this.f56580d.getForegroundInfoAsync();
                C17542s.i(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
                C7054x xVar = this.f56580d;
                this.f56579c = 1;
                obj = Y.d(foregroundInfoAsync, xVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7043l lVar = (C7043l) obj;
            if (lVar != null) {
                String a10 = C8799J.f56578a;
                C8739u uVar = this.f56581e;
                C7055y e10 = C7055y.e();
                e10.a(a10, "Updating notification for " + uVar.f55912c);
                C10101e<Void> a11 = this.f56582f.a(this.f56583g, this.f56580d.getId(), lVar);
                C17542s.i(a11, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
                this.f56579c = 2;
                obj = e.b(a11, this);
                return obj == f10 ? f10 : obj;
            }
            throw new IllegalStateException("Worker was marked important (" + this.f56581e.f55912c + ") but did not provide ForegroundInfo");
        }
    }

    static {
        String i10 = C7055y.i("WorkForegroundRunnable");
        C17542s.i(i10, "tagWithPrefix(\"WorkForegroundRunnable\")");
        f56578a = i10;
    }

    public static final Object b(Context context, C8739u uVar, C7054x xVar, C7044m mVar, C8878b bVar, C17164e<? super C16807N> eVar) {
        if (!uVar.f55926q || Build.VERSION.SDK_INT >= 31) {
            return C16807N.f139792a;
        }
        Executor a10 = bVar.a();
        C17542s.i(a10, "taskExecutor.mainThreadExecutor");
        Object g10 = C16310i.g(C16340x0.b(a10), new a(xVar, uVar, mVar, context, (C17164e<? super a>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }
}
