package qz;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oz.C14902a;
import pz.b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqz/d;", "Ltz/d;", "Lpz/b;", "settingsRemoteDataSource", "Loz/a;", "settingsLocalDataSource", "LQJ/M;", "coroutineDispatcher", "<init>", "(Lpz/b;Loz/a;LQJ/M;)V", "", "storeId", "LXH/N;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lpz/b;", "b", "Loz/a;", "c", "LQJ/M;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements tz.d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f130526a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14902a f130527b;

    /* renamed from: c  reason: collision with root package name */
    private final M f130528c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "<anonymous>", "(LQJ/Q;)Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.usecase.UpdateStoreSettingsUseCaseImpl$invoke$2", f = "UpdateStoreSettingsUseCaseImpl.kt", l = {23, 25}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super ScanAndGoSettings>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f130529c;

        /* renamed from: d  reason: collision with root package name */
        Object f130530d;

        /* renamed from: e  reason: collision with root package name */
        Object f130531e;

        /* renamed from: f  reason: collision with root package name */
        Object f130532f;

        /* renamed from: g  reason: collision with root package name */
        int f130533g;

        /* renamed from: h  reason: collision with root package name */
        int f130534h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f130535i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f130536j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f130535i = dVar;
            this.f130536j = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f130535i, this.f130536j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super ScanAndGoSettings> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130534h;
            if (i10 == 0) {
                y.b(obj);
                b c10 = this.f130535i.f130526a;
                String str = this.f130536j;
                this.f130534h = 1;
                obj = c10.a(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                ScanAndGoSettings scanAndGoSettings = (ScanAndGoSettings) this.f130532f;
                d dVar = (d) this.f130531e;
                ScanAndGoSettings scanAndGoSettings2 = (ScanAndGoSettings) this.f130530d;
                ScanAndGoSettings scanAndGoSettings3 = (ScanAndGoSettings) this.f130529c;
                y.b(obj);
                return scanAndGoSettings2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ScanAndGoSettings scanAndGoSettings4 = (ScanAndGoSettings) obj;
            if (scanAndGoSettings4 == null) {
                return null;
            }
            d dVar2 = this.f130535i;
            C14902a b10 = dVar2.f130527b;
            this.f130529c = scanAndGoSettings4;
            this.f130530d = scanAndGoSettings4;
            this.f130531e = dVar2;
            this.f130532f = scanAndGoSettings4;
            this.f130533g = 0;
            this.f130534h = 2;
            return b10.c(scanAndGoSettings4, this) == f10 ? f10 : scanAndGoSettings4;
        }
    }

    public d(b bVar, C14902a aVar, M m10) {
        C17542s.j(bVar, "settingsRemoteDataSource");
        C17542s.j(aVar, "settingsLocalDataSource");
        C17542s.j(m10, "coroutineDispatcher");
        this.f130526a = bVar;
        this.f130527b = aVar;
        this.f130528c = m10;
    }

    public Object a(String str, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f130528c, new a(this, str, (C17164e<? super a>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }
}
