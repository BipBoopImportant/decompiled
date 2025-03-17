package lz;

import Sy.a;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import fz.C14496i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kz.g;
import rz.O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000e\u0010\fJ,\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Llz/l;", "Lkz/g;", "Lfz/i;", "scanTypeDao", "Llz/k;", "scanTypeMapper", "<init>", "(Lfz/i;Llz/k;)V", "", "barcode", "Lrz/O;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LSy/a$b;", "c", "scanType", "specialType", "LXH/N;", "b", "(Ljava/lang/String;Lrz/O;LSy/a$b;LdI/e;)Ljava/lang/Object;", "Lfz/i;", "Llz/k;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final C14496i f129307a;

    /* renamed from: b  reason: collision with root package name */
    private final k f129308b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.ScanTypeSourceLocalImpl", f = "ScanTypeSourceLocalImpl.kt", l = {25}, m = "getScanSpecialType")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129309c;

        /* renamed from: d  reason: collision with root package name */
        Object f129310d;

        /* renamed from: e  reason: collision with root package name */
        Object f129311e;

        /* renamed from: f  reason: collision with root package name */
        Object f129312f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f129313g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f129314h;

        /* renamed from: i  reason: collision with root package name */
        int f129315i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f129314h = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129313g = obj;
            this.f129315i |= Integer.MIN_VALUE;
            return this.f129314h.c((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.ScanTypeSourceLocalImpl", f = "ScanTypeSourceLocalImpl.kt", l = {20}, m = "getScanType")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129316c;

        /* renamed from: d  reason: collision with root package name */
        Object f129317d;

        /* renamed from: e  reason: collision with root package name */
        Object f129318e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f129319f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l f129320g;

        /* renamed from: h  reason: collision with root package name */
        int f129321h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f129320g = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129319f = obj;
            this.f129321h |= Integer.MIN_VALUE;
            return this.f129320g.a((String) null, this);
        }
    }

    public l(C14496i iVar, k kVar) {
        C17542s.j(iVar, "scanTypeDao");
        C17542s.j(kVar, "scanTypeMapper");
        this.f129307a = iVar;
        this.f129308b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super rz.O> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lz.l.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            lz.l$b r0 = (lz.l.b) r0
            int r1 = r0.f129321h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129321h = r1
            goto L_0x0018
        L_0x0013:
            lz.l$b r0 = new lz.l$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f129319f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129321h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f129318e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129317d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f129316c
            lz.l r6 = (lz.l) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            fz.i r1 = r5.f129307a
            r0.f129316c = r5
            r0.f129317d = r6
            r0.f129318e = r7
            r0.f129321h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            gz.f r1 = (gz.f) r1
            if (r1 == 0) goto L_0x005a
            rz.O r6 = r1.c()
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.l.a(java.lang.String, dI.e):java.lang.Object");
    }

    public Object b(String str, O o10, a.b bVar, C17164e<? super C16807N> eVar) {
        Object b10 = this.f129307a.b(this.f129308b.b(str, o10, bVar), eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r7, dI.C17164e<? super Sy.a.b> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lz.l.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            lz.l$a r0 = (lz.l.a) r0
            int r1 = r0.f129315i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129315i = r1
            goto L_0x0018
        L_0x0013:
            lz.l$a r0 = new lz.l$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f129313g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129315i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.f129312f
            lz.k r7 = (lz.k) r7
            java.lang.Object r8 = r0.f129311e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f129310d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f129309c
            lz.l r8 = (lz.l) r8
            XH.y.b(r1)
            goto L_0x005c
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            lz.k r1 = r6.f129308b
            fz.i r3 = r6.f129307a
            r0.f129309c = r6
            r0.f129310d = r7
            r0.f129311e = r8
            r0.f129312f = r1
            r0.f129315i = r4
            java.lang.Object r7 = r3.a(r7, r0)
            if (r7 != r2) goto L_0x0059
            return r2
        L_0x0059:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x005c:
            gz.f r1 = (gz.f) r1
            Sy.a$b r7 = r7.a(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.l.c(java.lang.String, dI.e):java.lang.Object");
    }
}
