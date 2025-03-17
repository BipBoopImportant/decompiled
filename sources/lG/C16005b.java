package LG;

import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.core.analytics.ActionType;
import com.sugarcube.core.analytics.BaseEventProperty;
import com.sugarcube.core.analytics.Design;
import com.sugarcube.core.analytics.Event;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001a"}, d2 = {"LLG/b;", "", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/sugarcube/app/base/external/config/a;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/AnalyticsManager;)V", "LXH/N;", "c", "(LdI/e;)Ljava/lang/Object;", "", "d", "", "rating", "LkG/c;", "metadata", "b", "(ILkG/c;LdI/e;)Ljava/lang/Object;", "a", "(LkG/c;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/external/config/a;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LG.b  reason: case insensitive filesystem */
public final class C16005b {

    /* renamed from: a  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f136017a;

    /* renamed from: b  reason: collision with root package name */
    private final ConfigRepository f136018b;

    /* renamed from: c  reason: collision with root package name */
    private final AnalyticsManager f136019c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.feedback.RatingUseCase", f = "RatingUseCase.kt", l = {24}, m = "shouldShowRatingBar")
    /* renamed from: LG.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f136020c;

        /* renamed from: d  reason: collision with root package name */
        Object f136021d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f136022e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16005b f136023f;

        /* renamed from: g  reason: collision with root package name */
        int f136024g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16005b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f136023f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f136022e = obj;
            this.f136024g |= Integer.MIN_VALUE;
            return this.f136023f.d(this);
        }
    }

    public C16005b(com.sugarcube.app.base.external.config.a aVar, ConfigRepository configRepository, AnalyticsManager analyticsManager) {
        C17542s.j(aVar, "appConfig");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(analyticsManager, "analyticsManager");
        this.f136017a = aVar;
        this.f136018b = configRepository;
        this.f136019c = analyticsManager;
    }

    private final Object c(C17164e<? super C16807N> eVar) {
        Object override = this.f136018b.override(ConfigItems.DesignFeedbackWasPresented.INSTANCE, b.a(true), eVar);
        return override == C17187b.f() ? override : C16807N.f139792a;
    }

    public final Object a(C17497c cVar, C17164e<? super C16807N> eVar) {
        this.f136019c.track((Event) Design.Feedback.Exit, ActionType.Workflow, (List<? extends Trackable>) C16877v.e(cVar));
        Object c10 = c(eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public final Object b(int i10, C17497c cVar, C17164e<? super C16807N> eVar) {
        this.f136019c.track((Event) Design.Feedback.Submit, ActionType.Workflow, (List<? extends Trackable>) C16877v.q(cVar, new BaseEventProperty(X.l(C16796C.a(TrackingKey.Rating, String.valueOf(i10))))));
        Object c10 = c(eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof LG.C16005b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            LG.b$a r0 = (LG.C16005b.a) r0
            int r1 = r0.f136024g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f136024g = r1
            goto L_0x0018
        L_0x0013:
            LG.b$a r0 = new LG.b$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f136022e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f136024g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f136021d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f136020c
            LG.b r6 = (LG.C16005b) r6
            XH.y.b(r1)
            goto L_0x004e
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r5.f136018b
            com.sugarcube.app.base.data.feature.ConfigItems$DesignFeedbackWasPresented r3 = com.sugarcube.app.base.data.feature.ConfigItems.DesignFeedbackWasPresented.INSTANCE
            r0.f136020c = r5
            r0.f136021d = r6
            r0.f136024g = r4
            java.lang.Object r1 = r1.get(r3, r0)
            if (r1 != r2) goto L_0x004d
            return r2
        L_0x004d:
            r6 = r5
        L_0x004e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            com.sugarcube.app.base.external.config.a r6 = r6.f136017a
            TJ.P r6 = r6.getTrackingEnabledFlow()
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r0 != 0) goto L_0x0069
            if (r6 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: LG.C16005b.d(dI.e):java.lang.Object");
    }
}
