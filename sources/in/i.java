package in;

import dI.C17164e;
import hn.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import ln.C11552b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lin/i;", "Lhn/e;", "Lln/b;", "suggestEndpoint", "<init>", "(Lln/b;)V", "", "query", "Lnn/h;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "Lln/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C11552b f98497a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.SearchSuggestionRepositoryImpl", f = "SearchSuggestionRepositoryImpl.kt", l = {52}, m = "getSuggestionForAsync")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f98498c;

        /* renamed from: d  reason: collision with root package name */
        Object f98499d;

        /* renamed from: e  reason: collision with root package name */
        Object f98500e;

        /* renamed from: f  reason: collision with root package name */
        Object f98501f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f98502g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f98503h;

        /* renamed from: i  reason: collision with root package name */
        int f98504i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f98503h = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98502g = obj;
            this.f98504i |= Integer.MIN_VALUE;
            return this.f98503h.c((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.SearchSuggestionRepositoryImpl", f = "SearchSuggestionRepositoryImpl.kt", l = {24}, m = "getSuggestionsForQuery")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f98505c;

        /* renamed from: d  reason: collision with root package name */
        Object f98506d;

        /* renamed from: e  reason: collision with root package name */
        Object f98507e;

        /* renamed from: f  reason: collision with root package name */
        Object f98508f;

        /* renamed from: g  reason: collision with root package name */
        Object f98509g;

        /* renamed from: h  reason: collision with root package name */
        int f98510h;

        /* renamed from: i  reason: collision with root package name */
        int f98511i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f98512j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ i f98513k;

        /* renamed from: l  reason: collision with root package name */
        int f98514l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f98513k = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98512j = obj;
            this.f98514l |= Integer.MIN_VALUE;
            return this.f98513k.a((String) null, this);
        }
    }

    public i(C11552b bVar) {
        C17542s.j(bVar, "suggestEndpoint");
        this.f98497a = bVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r6, dI.C17164e<? super nn.C11662h> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof in.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            in.i$a r0 = (in.i.a) r0
            int r1 = r0.f98504i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f98504i = r1
            goto L_0x0018
        L_0x0013:
            in.i$a r0 = new in.i$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f98502g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f98504i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f98501f
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r0.f98500e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f98499d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f98498c
            in.i r6 = (in.i) r6
            XH.y.b(r1)
            goto L_0x0061
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            java.lang.String r1 = "q"
            XH.v r1 = XH.C16796C.a(r1, r6)
            java.util.Map r1 = YH.X.f(r1)
            ln.b r3 = r5.f98497a
            r0.f98498c = r5
            r0.f98499d = r6
            r0.f98500e = r7
            r0.f98501f = r1
            r0.f98504i = r4
            java.lang.Object r1 = r3.a(r1, r0)
            if (r1 != r2) goto L_0x0061
            return r2
        L_0x0061:
            com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote r1 = (com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote) r1
            nn.h r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: in.i.c(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: in.i} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0041, B:17:0x0055] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[ExcHandler: CancellationException (r0v10 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r21, dI.C17164e<? super nn.C11662h> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            boolean r3 = r2 instanceof in.i.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            in.i$b r3 = (in.i.b) r3
            int r4 = r3.f98514l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f98514l = r4
            goto L_0x001e
        L_0x0019:
            in.i$b r3 = new in.i$b
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f98512j
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f98514l
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0052
            if (r6 != r8) goto L_0x004a
            java.lang.Object r0 = r3.f98509g
            in.i r0 = (in.i) r0
            java.lang.Object r0 = r3.f98508f
            in.i r0 = (in.i) r0
            java.lang.Object r0 = r3.f98507e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r3.f98506d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.f98505c
            r2 = r0
            in.i r2 = (in.i) r2
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0047, all -> 0x0045 }
            goto L_0x006f
        L_0x0045:
            r0 = move-exception
            goto L_0x0078
        L_0x0047:
            r0 = move-exception
            goto L_0x014e
        L_0x004a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0052:
            XH.y.b(r4)
            XH.x$a r4 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98505c = r1     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98506d = r0     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98507e = r2     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98508f = r1     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98509g = r1     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98510h = r7     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98511i = r7     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            r3.f98514l = r8     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            java.lang.Object r4 = r1.c(r0, r3)     // Catch:{ CancellationException -> 0x0047, all -> 0x0076 }
            if (r4 != r5) goto L_0x006e
            return r5
        L_0x006e:
            r2 = r1
        L_0x006f:
            nn.h r4 = (nn.C11662h) r4     // Catch:{ CancellationException -> 0x0047, all -> 0x0045 }
            java.lang.Object r0 = XH.x.b(r4)     // Catch:{ CancellationException -> 0x0047, all -> 0x0045 }
            goto L_0x0082
        L_0x0076:
            r0 = move-exception
            r2 = r1
        L_0x0078:
            XH.x$a r3 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0082:
            java.lang.Throwable r3 = XH.x.e(r0)
            if (r3 != 0) goto L_0x008c
            nn.h r0 = (nn.C11662h) r0
            goto L_0x014d
        L_0x008c:
            qv.e r0 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x009f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00b6
            java.lang.Object r6 = r4.next()
            r9 = r6
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r0, r7)
            if (r9 == 0) goto L_0x009f
            r5.add(r6)
            goto L_0x009f
        L_0x00b6:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x00bd:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x012f
            java.lang.Object r9 = r4.next()
            qv.b r9 = (qv.C11819b) r9
            if (r6 != 0) goto L_0x00d6
            java.lang.String r6 = qv.C11818a.a(r5, r3)
            if (r6 != 0) goto L_0x00d2
            goto L_0x012f
        L_0x00d2:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x00d6:
            if (r7 != 0) goto L_0x0126
            java.lang.Class r7 = r2.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r10 = 36
            r11 = 2
            java.lang.String r10 = HJ.C15854t.s1(r7, r10, r5, r11, r5)
            r12 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r12, r5, r11, r5)
            int r11 = r10.length()
            if (r11 != 0) goto L_0x00f7
            goto L_0x00fd
        L_0x00f7:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r10, r7)
        L_0x00fd:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "main"
            boolean r10 = HJ.C15854t.b0(r10, r11, r8)
            if (r10 == 0) goto L_0x0110
            java.lang.String r10 = "m"
            goto L_0x0112
        L_0x0110:
            java.lang.String r10 = "b"
        L_0x0112:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = "|"
            r11.append(r10)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
        L_0x0126:
            r12 = 0
            r10 = r0
            r11 = r7
            r13 = r3
            r14 = r6
            r9.a(r10, r11, r12, r13, r14)
            goto L_0x00bd
        L_0x012f:
            nn.h r0 = new nn.h
            java.util.List r14 = YH.C16877v.n()
            java.util.List r15 = YH.C16877v.n()
            java.util.List r16 = YH.C16877v.n()
            java.util.List r17 = YH.C16877v.n()
            java.util.List r18 = YH.C16877v.n()
            java.util.List r19 = YH.C16877v.n()
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x014d:
            return r0
        L_0x014e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.i.a(java.lang.String, dI.e):java.lang.Object");
    }
}
