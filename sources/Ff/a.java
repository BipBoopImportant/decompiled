package Ff;

import dI.C17164e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007HB¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LFf/a;", "", "", "LZl/a;", "appLinkMappers", "<init>", "(Ljava/util/Set;)V", "", "appLink", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ljava/util/Set;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Zl.a> f60486a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.browseandsearch.search.viewmodels.GetDeeplinkUseCase", f = "GetDeeplinkUseCase.kt", l = {18}, m = "invoke")
    /* renamed from: Ff.a$a  reason: collision with other inner class name */
    static final class C0987a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f60487c;

        /* renamed from: d  reason: collision with root package name */
        Object f60488d;

        /* renamed from: e  reason: collision with root package name */
        Object f60489e;

        /* renamed from: f  reason: collision with root package name */
        Object f60490f;

        /* renamed from: g  reason: collision with root package name */
        Object f60491g;

        /* renamed from: h  reason: collision with root package name */
        Object f60492h;

        /* renamed from: i  reason: collision with root package name */
        Object f60493i;

        /* renamed from: j  reason: collision with root package name */
        Object f60494j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f60495k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f60496l;

        /* renamed from: m  reason: collision with root package name */
        int f60497m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0987a(a aVar, C17164e<? super C0987a> eVar) {
            super(eVar);
            this.f60496l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f60495k = obj;
            this.f60497m |= Integer.MIN_VALUE;
            return this.f60496l.a((String) null, this);
        }
    }

    public a(Set<Zl.a> set) {
        C17542s.j(set, "appLinkMappers");
        this.f60486a = set;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r10, dI.C17164e<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof Ff.a.C0987a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Ff.a$a r0 = (Ff.a.C0987a) r0
            int r1 = r0.f60497m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f60497m = r1
            goto L_0x0018
        L_0x0013:
            Ff.a$a r0 = new Ff.a$a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f60495k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f60497m
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0052
            if (r3 != r5) goto L_0x004a
            java.lang.Object r10 = r0.f60494j
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r10 = r0.f60493i
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r0.f60492h
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r0.f60491g
            Zl.a r10 = (Zl.a) r10
            java.lang.Object r10 = r0.f60490f
            android.net.Uri r10 = (android.net.Uri) r10
            java.lang.Object r10 = r0.f60489e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f60488d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f60487c
            Ff.a r10 = (Ff.a) r10
            XH.y.b(r1)
            goto L_0x0093
        L_0x004a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0052:
            XH.y.b(r1)
            android.net.Uri r1 = android.net.Uri.parse(r10)
            java.util.Set<Zl.a> r3 = r9.f60486a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r6 = r3.iterator()
        L_0x0061:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0075
            java.lang.Object r7 = r6.next()
            r8 = r7
            Zl.a r8 = (Zl.a) r8
            boolean r8 = r8.a(r1)
            if (r8 == 0) goto L_0x0061
            goto L_0x0076
        L_0x0075:
            r7 = r4
        L_0x0076:
            Zl.a r7 = (Zl.a) r7
            if (r7 == 0) goto L_0x009b
            r0.f60487c = r9
            r0.f60488d = r10
            r0.f60489e = r11
            r0.f60490f = r1
            r0.f60491g = r7
            r0.f60492h = r3
            r0.f60493i = r3
            r0.f60494j = r6
            r0.f60497m = r5
            java.lang.Object r1 = r7.b(r1, r0)
            if (r1 != r2) goto L_0x0093
            return r2
        L_0x0093:
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x009b
            java.lang.String r4 = r1.toString()
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ff.a.a(java.lang.String, dI.e):java.lang.Object");
    }
}
