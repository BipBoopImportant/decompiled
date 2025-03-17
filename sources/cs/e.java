package Cs;

import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import sf.C10242c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LCs/e;", "LCs/d;", "LCs/f;", "notificationPermissionProvider", "Lsf/c;", "appUserDataRepository", "<init>", "(LCs/f;Lsf/c;)V", "", "shouldRequestPermission", "isAlreadyShown", "e", "(ZZ)Z", "LXH/N;", "c", "()V", "b", "a", "LCs/f;", "Lsf/c;", "LTJ/B;", "LTJ/B;", "LTJ/g;", "d", "LTJ/g;", "()LTJ/g;", "isEnabledFlow", "isEnabled", "()Z", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final f f79672a;

    /* renamed from: b  reason: collision with root package name */
    private final C10242c f79673b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<Boolean> f79674c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<Boolean> f79675d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "shouldRequestPermission", "isAlreadyShown"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.util.NotificationOptInFeatureImpl$isEnabledFlow$1", f = "NotificationOptInFeature.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<Boolean, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79676c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f79677d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f79678e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f79679f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(3, eVar2);
            this.f79679f = eVar;
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super Boolean> eVar) {
            a aVar = new a(this.f79679f, eVar);
            aVar.f79677d = z10;
            aVar.f79678e = z11;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f79676c == 0) {
                y.b(obj);
                return b.a(this.f79679f.e(this.f79677d, this.f79678e));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(f fVar, C10242c cVar) {
        C17542s.j(fVar, "notificationPermissionProvider");
        C17542s.j(cVar, "appUserDataRepository");
        this.f79672a = fVar;
        this.f79673b = cVar;
        C16505B<Boolean> a10 = C16521S.a(Boolean.valueOf(fVar.a()));
        this.f79674c = a10;
        this.f79675d = C16534i.n(a10, cVar.i(), new a(this, (C17164e<? super a>) null));
    }

    /* access modifiers changed from: private */
    public final boolean e(boolean z10, boolean z11) {
        return z10 && !z11;
    }

    public C16532g<Boolean> a() {
        return this.f79675d;
    }

    public void b() {
        Boolean value;
        C16505B<Boolean> b10 = this.f79674c;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.valueOf(this.f79672a.a())));
    }

    public void c() {
        this.f79673b.r(true);
    }

    public boolean isEnabled() {
        return e(this.f79672a.a(), this.f79673b.h());
    }
}
