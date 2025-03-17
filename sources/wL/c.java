package Wl;

import com.ingka.ikea.appfoundation.linkit.impl.data.model.LinkItMetadataRemote;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LWl/c;", "LWl/b;", "LWl/a;", "linkItEndpoint", "<init>", "(LWl/a;)V", "", "id", "Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/LinkItMetadataRemote;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "a", "LWl/a;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f89041a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appfoundation.linkit.impl.data.source.remote.LinkItRemoteSourceImpl", f = "LinkItRemoteSource.kt", l = {39}, m = "validateLinkItId")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f89042c;

        /* renamed from: d  reason: collision with root package name */
        Object f89043d;

        /* renamed from: e  reason: collision with root package name */
        Object f89044e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f89045f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f89046g;

        /* renamed from: h  reason: collision with root package name */
        int f89047h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f89046g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89045f = obj;
            this.f89047h |= Integer.MIN_VALUE;
            return this.f89046g.a((String) null, this);
        }
    }

    public c(a aVar) {
        C17542s.j(aVar, "linkItEndpoint");
        this.f89041a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[EDGE_INSN: B:28:0x007e->B:25:0x007e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Wl.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Wl.c$a r0 = (Wl.c.a) r0
            int r1 = r0.f89047h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89047h = r1
            goto L_0x0018
        L_0x0013:
            Wl.c$a r0 = new Wl.c$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f89045f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f89047h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f89044e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f89043d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f89042c
            Wl.c r6 = (Wl.c) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Wl.a r1 = r5.f89041a
            r0.f89042c = r5
            r0.f89043d = r6
            r0.f89044e = r7
            r0.f89047h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.appfoundation.linkit.impl.data.model.IdValidationRemote r1 = (com.ingka.ikea.appfoundation.linkit.impl.data.model.IdValidationRemote) r1
            java.util.List r6 = r1.b()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0067
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0067
            goto L_0x007e
        L_0x0067:
            java.util.Iterator r6 = r6.iterator()
        L_0x006b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x007e
            java.lang.Object r7 = r6.next()
            com.ingka.ikea.appfoundation.linkit.impl.data.model.FieldValidationRemote r7 = (com.ingka.ikea.appfoundation.linkit.impl.data.model.FieldValidationRemote) r7
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x006b
            r4 = 0
        L_0x007e:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Wl.c.a(java.lang.String, dI.e):java.lang.Object");
    }

    public Object b(String str, C17164e<? super LinkItMetadataRemote> eVar) {
        return this.f89041a.b(str, eVar);
    }
}
