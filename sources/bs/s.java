package Bs;

import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import os.C11714a;
import qs.C11815c;
import rs.C11844a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0011HB¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LBs/s;", "LBs/q;", "LBs/c;", "filterInboxNotification", "Los/a;", "showCommunicationPostNotification", "Lrs/a;", "inboxAnalytics", "LFs/a;", "inboxNavigation", "<init>", "(LBs/c;Los/a;Lrs/a;LFs/a;)V", "LPs/d;", "item", "LXH/N;", "e", "(LPs/d;)V", "", "items", "c", "(Ljava/util/List;)V", "newContent", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LBs/c;", "b", "Los/a;", "Lrs/a;", "d", "LFs/a;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements q {

    /* renamed from: a  reason: collision with root package name */
    private final c f79460a;

    /* renamed from: b  reason: collision with root package name */
    private final C11714a f79461b;

    /* renamed from: c  reason: collision with root package name */
    private final C11844a f79462c;

    /* renamed from: d  reason: collision with root package name */
    private final Fs.a f79463d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.usecase.ShowInboxNotificationUseCaseImpl", f = "ShowInboxNotificationUseCase.kt", l = {38}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f79464c;

        /* renamed from: d  reason: collision with root package name */
        Object f79465d;

        /* renamed from: e  reason: collision with root package name */
        Object f79466e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f79467f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ s f79468g;

        /* renamed from: h  reason: collision with root package name */
        int f79469h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s sVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79468g = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79467f = obj;
            this.f79469h |= Integer.MIN_VALUE;
            return this.f79468g.a((List<Ps.d>) null, this);
        }
    }

    public s(c cVar, C11714a aVar, C11844a aVar2, Fs.a aVar3) {
        C17542s.j(cVar, "filterInboxNotification");
        C17542s.j(aVar, "showCommunicationPostNotification");
        C17542s.j(aVar2, "inboxAnalytics");
        C17542s.j(aVar3, "inboxNavigation");
        this.f79460a = cVar;
        this.f79461b = aVar;
        this.f79462c = aVar2;
        this.f79463d = aVar3;
    }

    private final void c(List<Ps.d> list) {
        this.f79461b.a(this.f79463d.c(C16877v.G0(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new r(), 31, (Object) null)), C13026h.a(qs.d.f101998j), C13026h.d(C11815c.f101988a, C13020b.a(list.size()), Integer.valueOf(list.size())), (String) null, "inbox_notification_group");
    }

    /* access modifiers changed from: private */
    public static final CharSequence d(Ps.d dVar) {
        C17542s.j(dVar, "it");
        return dVar.h();
    }

    private final void e(Ps.d dVar) {
        String a10 = this.f79463d.a(dVar);
        C11714a aVar = this.f79461b;
        C13023e c10 = C13026h.c(dVar.k());
        C13023e c11 = C13026h.c(dVar.a());
        Image f10 = dVar.f();
        String url = f10 != null ? f10.getUrl() : null;
        if (url == null) {
            url = "";
        }
        aVar.a(a10, c10, c11, url, dVar.i());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.util.List<Ps.d> r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Bs.s.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Bs.s$a r0 = (Bs.s.a) r0
            int r1 = r0.f79469h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79469h = r1
            goto L_0x0018
        L_0x0013:
            Bs.s$a r0 = new Bs.s$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f79467f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79469h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f79466e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f79465d
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.f79464c
            Bs.s r6 = (Bs.s) r6
            XH.y.b(r1)
            goto L_0x0052
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Bs.c r1 = r5.f79460a
            r0.f79464c = r5
            r0.f79465d = r6
            r0.f79466e = r7
            r0.f79469h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r6 = r5
        L_0x0052:
            java.util.List r1 = (java.util.List) r1
            int r7 = r1.size()
            if (r7 == 0) goto L_0x0075
            if (r7 == r4) goto L_0x0060
            r6.c(r1)
            goto L_0x0069
        L_0x0060:
            java.lang.Object r7 = YH.C16877v.b1(r1)
            Ps.d r7 = (Ps.d) r7
            r6.e(r7)
        L_0x0069:
            rs.a r6 = r6.f79462c
            int r7 = r1.size()
            r6.g(r7)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0075:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Bs.s.a(java.util.List, dI.e):java.lang.Object");
    }
}
