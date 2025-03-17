package DA;

import BA.C12609a;
import CA.C12683b;
import EA.C12828c;
import FA.C12859a;
import XH.x;
import com.ingka.ikea.shareprovider.impl.network.a;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LDA/a;", "LBA/a;", "Lcom/ingka/ikea/shareprovider/impl/network/a;", "shareRemoteDataSource", "LEA/c;", "shareAnalytics", "<init>", "(Lcom/ingka/ikea/shareprovider/impl/network/a;LEA/c;)V", "", "id", "LXH/x;", "LFA/a;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "listName", "", "LFA/a$a;", "items", "LCA/b;", "origin", "b", "(Ljava/lang/String;Ljava/util/List;LCA/b;LdI/e;)Ljava/lang/Object;", "itemNo", "itemType", "a", "(Ljava/lang/String;Ljava/lang/String;LCA/b;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/shareprovider/impl/network/a;", "LEA/c;", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DA.a  reason: case insensitive filesystem */
public final class C12728a implements C12609a {

    /* renamed from: a  reason: collision with root package name */
    private final a f108486a;

    /* renamed from: b  reason: collision with root package name */
    private final C12828c f108487b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shareprovider.impl.ShareRepositoryImpl", f = "ShareRepositoryImpl.kt", l = {22}, m = "getSharedList-gIAlu-s")
    /* renamed from: DA.a$a  reason: collision with other inner class name */
    static final class C2602a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108488c;

        /* renamed from: d  reason: collision with root package name */
        Object f108489d;

        /* renamed from: e  reason: collision with root package name */
        Object f108490e;

        /* renamed from: f  reason: collision with root package name */
        Object f108491f;

        /* renamed from: g  reason: collision with root package name */
        Object f108492g;

        /* renamed from: h  reason: collision with root package name */
        int f108493h;

        /* renamed from: i  reason: collision with root package name */
        int f108494i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f108495j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C12728a f108496k;

        /* renamed from: l  reason: collision with root package name */
        int f108497l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2602a(C12728a aVar, C17164e<? super C2602a> eVar) {
            super(eVar);
            this.f108496k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108495j = obj;
            this.f108497l |= Integer.MIN_VALUE;
            Object c10 = this.f108496k.c((String) null, this);
            return c10 == C17187b.f() ? c10 : x.a(c10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shareprovider.impl.ShareRepositoryImpl", f = "ShareRepositoryImpl.kt", l = {54}, m = "shareItem-BWLJW6A")
    /* renamed from: DA.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108498c;

        /* renamed from: d  reason: collision with root package name */
        Object f108499d;

        /* renamed from: e  reason: collision with root package name */
        Object f108500e;

        /* renamed from: f  reason: collision with root package name */
        Object f108501f;

        /* renamed from: g  reason: collision with root package name */
        Object f108502g;

        /* renamed from: h  reason: collision with root package name */
        Object f108503h;

        /* renamed from: i  reason: collision with root package name */
        Object f108504i;

        /* renamed from: j  reason: collision with root package name */
        int f108505j;

        /* renamed from: k  reason: collision with root package name */
        int f108506k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f108507l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C12728a f108508m;

        /* renamed from: n  reason: collision with root package name */
        int f108509n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12728a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f108508m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108507l = obj;
            this.f108509n |= Integer.MIN_VALUE;
            Object a10 = this.f108508m.a((String) null, (String) null, (C12683b) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shareprovider.impl.ShareRepositoryImpl", f = "ShareRepositoryImpl.kt", l = {35}, m = "shareList-BWLJW6A")
    /* renamed from: DA.a$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108510c;

        /* renamed from: d  reason: collision with root package name */
        Object f108511d;

        /* renamed from: e  reason: collision with root package name */
        Object f108512e;

        /* renamed from: f  reason: collision with root package name */
        Object f108513f;

        /* renamed from: g  reason: collision with root package name */
        Object f108514g;

        /* renamed from: h  reason: collision with root package name */
        Object f108515h;

        /* renamed from: i  reason: collision with root package name */
        Object f108516i;

        /* renamed from: j  reason: collision with root package name */
        int f108517j;

        /* renamed from: k  reason: collision with root package name */
        int f108518k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f108519l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C12728a f108520m;

        /* renamed from: n  reason: collision with root package name */
        int f108521n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C12728a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f108520m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108519l = obj;
            this.f108521n |= Integer.MIN_VALUE;
            Object b10 = this.f108520m.b((String) null, (List<C12859a.C2618a>) null, (C12683b) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    public C12728a(a aVar, C12828c cVar) {
        C17542s.j(aVar, "shareRemoteDataSource");
        C17542s.j(cVar, "shareAnalytics");
        this.f108486a = aVar;
        this.f108487b = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: CA.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0042, B:17:0x0055] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048 A[ExcHandler: CancellationException (r6v7 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, java.lang.String r7, CA.C12683b r8, dI.C17164e<? super XH.x<java.lang.String>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof DA.C12728a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            DA.a$b r0 = (DA.C12728a.b) r0
            int r1 = r0.f108509n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108509n = r1
            goto L_0x0018
        L_0x0013:
            DA.a$b r0 = new DA.a$b
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f108507l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108509n
            r4 = 1
            if (r3 == 0) goto L_0x0052
            if (r3 != r4) goto L_0x004a
            java.lang.Object r6 = r0.f108504i
            DA.a r6 = (DA.C12728a) r6
            java.lang.Object r6 = r0.f108503h
            DA.a r6 = (DA.C12728a) r6
            java.lang.Object r6 = r0.f108502g
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f108501f
            r8 = r6
            CA.b r8 = (CA.C12683b) r8
            java.lang.Object r6 = r0.f108500e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f108499d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f108498c
            DA.a r6 = (DA.C12728a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0048, all -> 0x0046 }
            goto L_0x0076
        L_0x0046:
            r7 = move-exception
            goto L_0x007f
        L_0x0048:
            r6 = move-exception
            goto L_0x0098
        L_0x004a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0052:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            com.ingka.ikea.shareprovider.impl.network.a r1 = r5.f108486a     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108498c = r5     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108499d = r6     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108500e = r7     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108501f = r8     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108502g = r9     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108503h = r5     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108504i = r5     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r9 = 0
            r0.f108505j = r9     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108506k = r9     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            r0.f108509n = r4     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            java.lang.Object r1 = r1.c(r6, r7, r0)     // Catch:{ CancellationException -> 0x0048, all -> 0x007d }
            if (r1 != r2) goto L_0x0075
            return r2
        L_0x0075:
            r6 = r5
        L_0x0076:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ CancellationException -> 0x0048, all -> 0x0046 }
            java.lang.Object r7 = XH.x.b(r1)     // Catch:{ CancellationException -> 0x0048, all -> 0x0046 }
            goto L_0x0089
        L_0x007d:
            r7 = move-exception
            r6 = r5
        L_0x007f:
            XH.x$a r9 = XH.x.f139812b
            java.lang.Object r7 = XH.y.a(r7)
            java.lang.Object r7 = XH.x.b(r7)
        L_0x0089:
            boolean r9 = XH.x.h(r7)
            if (r9 == 0) goto L_0x0097
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            EA.c r6 = r6.f108487b
            r6.d(r8)
        L_0x0097:
            return r7
        L_0x0098:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: DA.C12728a.a(java.lang.String, java.lang.String, CA.b, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: CA.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.List<FA.a$a>} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0043, B:17:0x0056] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[ExcHandler: CancellationException (r6v7 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r6, java.util.List<FA.C12859a.C2618a> r7, CA.C12683b r8, dI.C17164e<? super XH.x<java.lang.String>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof DA.C12728a.c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            DA.a$c r0 = (DA.C12728a.c) r0
            int r1 = r0.f108521n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108521n = r1
            goto L_0x0018
        L_0x0013:
            DA.a$c r0 = new DA.a$c
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f108519l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108521n
            r4 = 1
            if (r3 == 0) goto L_0x0053
            if (r3 != r4) goto L_0x004b
            java.lang.Object r6 = r0.f108516i
            DA.a r6 = (DA.C12728a) r6
            java.lang.Object r6 = r0.f108515h
            DA.a r6 = (DA.C12728a) r6
            java.lang.Object r6 = r0.f108514g
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f108513f
            r8 = r6
            CA.b r8 = (CA.C12683b) r8
            java.lang.Object r6 = r0.f108512e
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.f108511d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f108510c
            DA.a r6 = (DA.C12728a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0049, all -> 0x0047 }
            goto L_0x0077
        L_0x0047:
            r9 = move-exception
            goto L_0x0080
        L_0x0049:
            r6 = move-exception
            goto L_0x009d
        L_0x004b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0053:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            com.ingka.ikea.shareprovider.impl.network.a r1 = r5.f108486a     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108510c = r5     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108511d = r6     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108512e = r7     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108513f = r8     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108514g = r9     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108515h = r5     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108516i = r5     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r9 = 0
            r0.f108517j = r9     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108518k = r9     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            r0.f108521n = r4     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            java.lang.Object r1 = r1.b(r6, r7, r0)     // Catch:{ CancellationException -> 0x0049, all -> 0x007e }
            if (r1 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r6 = r5
        L_0x0077:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ CancellationException -> 0x0049, all -> 0x0047 }
            java.lang.Object r9 = XH.x.b(r1)     // Catch:{ CancellationException -> 0x0049, all -> 0x0047 }
            goto L_0x008a
        L_0x007e:
            r9 = move-exception
            r6 = r5
        L_0x0080:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
        L_0x008a:
            boolean r0 = XH.x.h(r9)
            if (r0 == 0) goto L_0x009c
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            EA.c r6 = r6.f108487b
            int r7 = r7.size()
            r6.c(r8, r7)
        L_0x009c:
            return r9
        L_0x009d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: DA.C12728a.b(java.lang.String, java.util.List, CA.b, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0039, B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[ExcHandler: CancellationException (r6v7 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r6, dI.C17164e<? super XH.x<FA.C12859a>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof DA.C12728a.C2602a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            DA.a$a r0 = (DA.C12728a.C2602a) r0
            int r1 = r0.f108497l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108497l = r1
            goto L_0x0018
        L_0x0013:
            DA.a$a r0 = new DA.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f108495j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108497l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r6 = r0.f108492g
            DA.a r6 = (DA.C12728a) r6
            java.lang.Object r6 = r0.f108491f
            DA.a r6 = (DA.C12728a) r6
            java.lang.Object r6 = r0.f108490e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f108489d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f108488c
            DA.a r6 = (DA.C12728a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0069
        L_0x003d:
            r7 = move-exception
            goto L_0x0072
        L_0x003f:
            r6 = move-exception
            goto L_0x0088
        L_0x0041:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0049:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            com.ingka.ikea.shareprovider.impl.network.a r1 = r5.f108486a     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r0.f108488c = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r0.f108489d = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r0.f108490e = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r0.f108491f = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r0.f108492g = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r7 = 0
            r0.f108493h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r0.f108494i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            r0.f108497l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            java.lang.Object r1 = r1.a(r6, r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x0070 }
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            r6 = r5
        L_0x0069:
            FA.a r1 = (FA.C12859a) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r7 = XH.x.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x007c
        L_0x0070:
            r7 = move-exception
            r6 = r5
        L_0x0072:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r7 = XH.y.a(r7)
            java.lang.Object r7 = XH.x.b(r7)
        L_0x007c:
            java.lang.Throwable r0 = XH.x.e(r7)
            if (r0 == 0) goto L_0x0087
            EA.c r6 = r6.f108487b
            r6.b()
        L_0x0087:
            return r7
        L_0x0088:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: DA.C12728a.c(java.lang.String, dI.e):java.lang.Object");
    }
}
