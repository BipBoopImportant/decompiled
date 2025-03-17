package eA;

import HJ.C15854t;
import QJ.Q;
import XH.C16807N;
import XH.t;
import XH.y;
import Zj.h;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fA.C14439b;
import gA.C14498a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0011B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010¨\u0006!"}, d2 = {"LeA/b;", "LeA/a;", "LZj/h;", "storage", "LfA/b;", "guestTokenRemoteDataSource", "<init>", "(LZj/h;LfA/b;)V", "", "token", "LXH/N;", "e", "(Ljava/lang/String;)V", "clear", "()V", "getToken", "()Ljava/lang/String;", "a", "LZj/h;", "b", "LfA/b;", "", "c", "Z", "refreshing", "Ljava/lang/Object;", "d", "Ljava/lang/Object;", "lock", "", "()J", "storedGuestTokenTimestamp", "storedGuestToken", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eA.b  reason: case insensitive filesystem */
public final class C14372b implements C14371a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f126351e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f126352a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14439b f126353b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f126354c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f126355d = new Object();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LeA/b$a;", "", "<init>", "()V", "", "GUEST_TOKEN_DAYS_BEFORE_REFRESH", "I", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eA.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.session.impl.guesttoken.GuestTokenRepositoryImpl$getToken$1$token$1", f = "GuestTokenRepository.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: eA.b$b  reason: collision with other inner class name */
    static final class C3087b extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126356c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14372b f126357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3087b(C14372b bVar, C17164e<? super C3087b> eVar) {
            super(2, eVar);
            this.f126357d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3087b(this.f126357d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((C3087b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f126356c;
            if (i10 == 0) {
                y.b(obj);
                C14439b c10 = this.f126357d.f126353b;
                this.f126356c = 1;
                obj = c10.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.session.impl.guesttoken.GuestTokenRepositoryImpl$refreshToken$1$token$1", f = "GuestTokenRepository.kt", l = {133}, m = "invokeSuspend")
    /* renamed from: eA.b$c */
    static final class c extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14372b f126359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14372b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f126359d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f126359d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f126358c;
            if (i10 == 0) {
                y.b(obj);
                C14439b c10 = this.f126359d.f126353b;
                String b10 = this.f126359d.b();
                this.f126358c = 1;
                obj = c10.b(b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public C14372b(h hVar, C14439b bVar) {
        C17542s.j(hVar, PlaceTypes.STORAGE);
        C17542s.j(bVar, "guestTokenRemoteDataSource");
        this.f126352a = hVar;
        this.f126353b = bVar;
    }

    private final long d() {
        return h.a.a(this.f126352a, "shared_pref_guest_timestamp_key", 0, 2, (Object) null);
    }

    private final void e(String str) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Long l10 = null;
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Set guest token, isEmpty: " + (str == null || str.length() == 0), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = C14372b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        this.f126352a.a("shared_pref_guest_token_key", str);
        if (!(str == null || str.length() == 0)) {
            l10 = Long.valueOf(System.currentTimeMillis());
        }
        this.f126352a.b("shared_pref_guest_timestamp_key", l10);
    }

    public String a() {
        boolean z10;
        String token;
        boolean z11;
        if (this.f126354c) {
            return getToken();
        }
        synchronized (this.f126355d) {
            this.f126354c = true;
            try {
                token = (String) C16312j.b((C17168i) null, new c(this, (C17164e<? super c>) null), 1, (Object) null);
                e(token);
            } catch (C14498a e10) {
                e eVar = e.WARN;
                ArrayList arrayList = new ArrayList();
                Iterator it = d.f102012a.a().iterator();
                while (true) {
                    z10 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                String str = null;
                String str2 = null;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C11819b bVar = (C11819b) it2.next();
                    if (str == null) {
                        String a10 = C11818a.a("Refresh token failed with invalid token, fetch a new token", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = C14372b.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, z10, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                    z10 = z10;
                }
                if (e10 instanceof C14498a.C3115a) {
                    token = "";
                } else if (C17542s.e(e10, C14498a.b.f127252a)) {
                    e((String) null);
                    token = getToken();
                } else {
                    throw new t();
                }
            } catch (IOException e11) {
                e eVar2 = e.WARN;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = d.f102012a.a().iterator();
                while (true) {
                    z11 = false;
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                String str5 = null;
                String str6 = null;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C11819b bVar2 = (C11819b) it4.next();
                    if (str5 == null) {
                        String a11 = C11818a.a("Unable to refresh cart guest token", e11);
                        if (a11 == null) {
                            break;
                        }
                        str5 = C11820c.a(a11);
                    }
                    String str7 = str5;
                    if (str6 == null) {
                        String name2 = C14372b.class.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    String str8 = str6;
                    bVar2.a(eVar2, str8, z11, e11, str7);
                    str5 = str7;
                    str6 = str8;
                    z11 = z11;
                }
                token = "";
            } catch (Throwable th2) {
                this.f126354c = false;
                throw th2;
            }
            this.f126354c = false;
        }
        return token;
    }

    public String b() {
        return this.f126352a.g("shared_pref_guest_token_key");
    }

    public void clear() {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Clear guest token storage", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14372b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        this.f126352a.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:173:0x0076 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[Catch:{ Exception -> 0x032b, all -> 0x0034 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getToken() {
        /*
            r20 = this;
            r1 = r20
            java.lang.Object r2 = r1.f126355d
            monitor-enter(r2)
            java.lang.String r0 = r20.b()     // Catch:{ all -> 0x0034 }
            qv.e r9 = qv.e.DEBUG     // Catch:{ all -> 0x0034 }
            qv.d r3 = qv.d.f102012a     // Catch:{ all -> 0x0034 }
            java.util.List r3 = r3.a()     // Catch:{ all -> 0x0034 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x0034 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            r4.<init>()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0034 }
        L_0x001c:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0034 }
            r10 = 0
            if (r5 == 0) goto L_0x0037
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0034 }
            r6 = r5
            qv.b r6 = (qv.C11819b) r6     // Catch:{ all -> 0x0034 }
            boolean r6 = r6.b(r9, r10)     // Catch:{ all -> 0x0034 }
            if (r6 == 0) goto L_0x001c
            r4.add(r5)     // Catch:{ all -> 0x0034 }
            goto L_0x001c
        L_0x0034:
            r0 = move-exception
            goto L_0x03e8
        L_0x0037:
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x0034 }
            r12 = 0
            r3 = r12
            r4 = r3
        L_0x003e:
            boolean r5 = r11.hasNext()     // Catch:{ all -> 0x0034 }
            r6 = 46
            r7 = 36
            r8 = 1
            r13 = 2
            if (r5 == 0) goto L_0x00d5
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x0034 }
            qv.b r5 = (qv.C11819b) r5     // Catch:{ all -> 0x0034 }
            r14 = 0
            if (r3 != 0) goto L_0x007b
            if (r0 == 0) goto L_0x005e
            int r3 = r0.length()     // Catch:{ all -> 0x0034 }
            if (r3 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r3 = r8
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r15.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r10 = "getGuestTokenSuspending, has guest token: "
            r15.append(r10)     // Catch:{ all -> 0x0034 }
            r15.append(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = r15.toString()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = qv.C11818a.a(r3, r14)     // Catch:{ all -> 0x0034 }
            if (r3 != 0) goto L_0x0077
            goto L_0x00d5
        L_0x0077:
            java.lang.String r3 = qv.C11820c.a(r3)     // Catch:{ all -> 0x0034 }
        L_0x007b:
            r10 = r3
            if (r4 != 0) goto L_0x00c5
            java.lang.Class<eA.b> r3 = eA.C14372b.class
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = HJ.C15854t.s1(r3, r7, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = HJ.C15854t.o1(r4, r6, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            int r6 = r4.length()     // Catch:{ all -> 0x0034 }
            if (r6 != 0) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r4, r3)     // Catch:{ all -> 0x0034 }
        L_0x009c:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = "main"
            boolean r4 = HJ.C15854t.b0(r4, r6, r8)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = "m"
            goto L_0x00b1
        L_0x00af:
            java.lang.String r4 = "b"
        L_0x00b1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r6.<init>()     // Catch:{ all -> 0x0034 }
            r6.append(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "|"
            r6.append(r4)     // Catch:{ all -> 0x0034 }
            r6.append(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0034 }
        L_0x00c5:
            r13 = r4
            r3 = r5
            r4 = r9
            r5 = r13
            r15 = 0
            r6 = r15
            r7 = r14
            r8 = r10
            r3.a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0034 }
            r3 = r10
            r4 = r13
            r10 = r15
            goto L_0x003e
        L_0x00d5:
            if (r0 == 0) goto L_0x031a
            int r3 = r0.length()     // Catch:{ all -> 0x0034 }
            if (r3 != 0) goto L_0x00df
            goto L_0x031a
        L_0x00df:
            long r3 = r20.d()     // Catch:{ all -> 0x0034 }
            r9 = 0
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x03e6
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0034 }
            long r9 = r9 - r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x0034 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0034 }
            long r3 = r3.convert(r9, r4)     // Catch:{ all -> 0x0034 }
            qv.e r5 = qv.e.DEBUG     // Catch:{ all -> 0x0034 }
            qv.d r9 = qv.d.f102012a     // Catch:{ all -> 0x0034 }
            java.util.List r9 = r9.a()     // Catch:{ all -> 0x0034 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x0034 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            r10.<init>()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0109:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0034 }
            r15 = 0
            if (r11 == 0) goto L_0x0121
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0034 }
            r14 = r11
            qv.b r14 = (qv.C11819b) r14     // Catch:{ all -> 0x0034 }
            boolean r14 = r14.b(r5, r15)     // Catch:{ all -> 0x0034 }
            if (r14 == 0) goto L_0x0109
            r10.add(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x0109
        L_0x0121:
            java.util.Iterator r9 = r10.iterator()     // Catch:{ all -> 0x0034 }
            r10 = r12
            r11 = r10
        L_0x0127:
            boolean r14 = r9.hasNext()     // Catch:{ all -> 0x0034 }
            if (r14 == 0) goto L_0x01b6
            java.lang.Object r14 = r9.next()     // Catch:{ all -> 0x0034 }
            qv.b r14 = (qv.C11819b) r14     // Catch:{ all -> 0x0034 }
            r8 = 0
            if (r10 != 0) goto L_0x0157
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r10.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = "Guest token age: "
            r10.append(r15)     // Catch:{ all -> 0x0034 }
            r10.append(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = " days"
            r10.append(r15)     // Catch:{ all -> 0x0034 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0034 }
            java.lang.String r10 = qv.C11818a.a(r10, r8)     // Catch:{ all -> 0x0034 }
            if (r10 != 0) goto L_0x0153
            goto L_0x01b6
        L_0x0153:
            java.lang.String r10 = qv.C11820c.a(r10)     // Catch:{ all -> 0x0034 }
        L_0x0157:
            if (r11 != 0) goto L_0x01a1
            java.lang.Class<eA.b> r11 = eA.C14372b.class
            java.lang.String r11 = r11.getName()     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C17542s.g(r11)     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = HJ.C15854t.s1(r11, r7, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = HJ.C15854t.o1(r15, r6, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            int r17 = r15.length()     // Catch:{ all -> 0x0034 }
            if (r17 != 0) goto L_0x0171
            goto L_0x0177
        L_0x0171:
            java.lang.String r11 = "Kt"
            java.lang.String r11 = HJ.C15854t.P0(r15, r11)     // Catch:{ all -> 0x0034 }
        L_0x0177:
            java.lang.Thread r15 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = r15.getName()     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = "main"
            r7 = 1
            boolean r6 = HJ.C15854t.b0(r15, r6, r7)     // Catch:{ all -> 0x0034 }
            if (r6 == 0) goto L_0x018b
            java.lang.String r6 = "m"
            goto L_0x018d
        L_0x018b:
            java.lang.String r6 = "b"
        L_0x018d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r7.<init>()     // Catch:{ all -> 0x0034 }
            r7.append(r6)     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = "|"
            r7.append(r6)     // Catch:{ all -> 0x0034 }
            r7.append(r11)     // Catch:{ all -> 0x0034 }
            java.lang.String r11 = r7.toString()     // Catch:{ all -> 0x0034 }
        L_0x01a1:
            r6 = 0
            r15 = r5
            r16 = r11
            r17 = r6
            r18 = r8
            r19 = r10
            r14.a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0034 }
            r15 = r6
            r6 = 46
            r7 = 36
            r8 = 1
            goto L_0x0127
        L_0x01b6:
            r5 = 1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03e6
            qv.e r3 = qv.e.DEBUG     // Catch:{ all -> 0x0034 }
            qv.d r4 = qv.d.f102012a     // Catch:{ all -> 0x0034 }
            java.util.List r4 = r4.a()     // Catch:{ all -> 0x0034 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x0034 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            r5.<init>()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0034 }
        L_0x01cf:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0034 }
            r10 = 0
            if (r6 == 0) goto L_0x01e7
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0034 }
            r7 = r6
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x0034 }
            boolean r7 = r7.b(r3, r10)     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x01cf
            r5.add(r6)     // Catch:{ all -> 0x0034 }
            goto L_0x01cf
        L_0x01e7:
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x0034 }
            r4 = r12
            r5 = r4
        L_0x01ed:
            boolean r6 = r11.hasNext()     // Catch:{ all -> 0x0034 }
            if (r6 == 0) goto L_0x0264
            java.lang.Object r6 = r11.next()     // Catch:{ all -> 0x0034 }
            qv.b r6 = (qv.C11819b) r6     // Catch:{ all -> 0x0034 }
            r8 = 0
            if (r4 != 0) goto L_0x0209
            java.lang.String r4 = "Current guest cookie considered old, refresh it"
            java.lang.String r4 = qv.C11818a.a(r4, r8)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0205
            goto L_0x0264
        L_0x0205:
            java.lang.String r4 = qv.C11820c.a(r4)     // Catch:{ all -> 0x0034 }
        L_0x0209:
            r14 = r4
            if (r5 != 0) goto L_0x0258
            java.lang.Class<eA.b> r4 = eA.C14372b.class
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ all -> 0x0034 }
            r5 = 36
            java.lang.String r7 = HJ.C15854t.s1(r4, r5, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            r5 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r5, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            int r5 = r7.length()     // Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x0228
            goto L_0x022e
        L_0x0228:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r7, r4)     // Catch:{ all -> 0x0034 }
        L_0x022e:
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = "main"
            r9 = 1
            boolean r5 = HJ.C15854t.b0(r5, r7, r9)     // Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x0242
            java.lang.String r5 = "m"
            goto L_0x0244
        L_0x0242:
            java.lang.String r5 = "b"
        L_0x0244:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r7.<init>()     // Catch:{ all -> 0x0034 }
            r7.append(r5)     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = "|"
            r7.append(r5)     // Catch:{ all -> 0x0034 }
            r7.append(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0034 }
        L_0x0258:
            r15 = r5
            r4 = r6
            r5 = r3
            r6 = r15
            r7 = r10
            r9 = r14
            r4.a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0034 }
            r4 = r14
            r5 = r15
            goto L_0x01ed
        L_0x0264:
            java.lang.String r3 = r20.a()     // Catch:{ all -> 0x0034 }
            int r4 = r3.length()     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0317
            qv.e r3 = qv.e.WARN     // Catch:{ all -> 0x0034 }
            qv.d r4 = qv.d.f102012a     // Catch:{ all -> 0x0034 }
            java.util.List r4 = r4.a()     // Catch:{ all -> 0x0034 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x0034 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            r5.<init>()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0281:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0034 }
            r11 = 0
            if (r6 == 0) goto L_0x0299
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0034 }
            r7 = r6
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x0034 }
            boolean r7 = r7.b(r3, r11)     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x0281
            r5.add(r6)     // Catch:{ all -> 0x0034 }
            goto L_0x0281
        L_0x0299:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x0034 }
            r5 = r12
            r6 = r5
        L_0x029f:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x03e6
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0034 }
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x0034 }
            r9 = 0
            if (r5 != 0) goto L_0x02bc
            java.lang.String r5 = "Unable to refresh old token, try to use it anyway"
            java.lang.String r5 = qv.C11818a.a(r5, r9)     // Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x02b8
            goto L_0x03e6
        L_0x02b8:
            java.lang.String r5 = qv.C11820c.a(r5)     // Catch:{ all -> 0x0034 }
        L_0x02bc:
            r14 = r5
            if (r6 != 0) goto L_0x030b
            java.lang.Class<eA.b> r5 = eA.C14372b.class
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ all -> 0x0034 }
            r6 = 36
            java.lang.String r8 = HJ.C15854t.s1(r5, r6, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            r6 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r6, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            int r6 = r8.length()     // Catch:{ all -> 0x0034 }
            if (r6 != 0) goto L_0x02db
            goto L_0x02e1
        L_0x02db:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r8, r5)     // Catch:{ all -> 0x0034 }
        L_0x02e1:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0034 }
            java.lang.String r8 = "main"
            r10 = 1
            boolean r6 = HJ.C15854t.b0(r6, r8, r10)     // Catch:{ all -> 0x0034 }
            if (r6 == 0) goto L_0x02f5
            java.lang.String r6 = "m"
            goto L_0x02f7
        L_0x02f5:
            java.lang.String r6 = "b"
        L_0x02f7:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r8.<init>()     // Catch:{ all -> 0x0034 }
            r8.append(r6)     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = "|"
            r8.append(r6)     // Catch:{ all -> 0x0034 }
            r8.append(r5)     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0034 }
        L_0x030b:
            r15 = r6
            r5 = r7
            r6 = r3
            r7 = r15
            r8 = r11
            r10 = r14
            r5.a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0034 }
            r5 = r14
            r6 = r15
            goto L_0x029f
        L_0x0317:
            r0 = r3
            goto L_0x03e6
        L_0x031a:
            eA.b$b r0 = new eA.b$b     // Catch:{ Exception -> 0x032b }
            r0.<init>(r1, r12)     // Catch:{ Exception -> 0x032b }
            r3 = 1
            java.lang.Object r0 = QJ.C16312j.b(r12, r0, r3, r12)     // Catch:{ Exception -> 0x032b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x032b }
            r1.e(r0)     // Catch:{ Exception -> 0x032b }
            goto L_0x03e6
        L_0x032b:
            r0 = move-exception
            qv.e r9 = qv.e.WARN     // Catch:{ all -> 0x0034 }
            qv.d r3 = qv.d.f102012a     // Catch:{ all -> 0x0034 }
            java.util.List r3 = r3.a()     // Catch:{ all -> 0x0034 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x0034 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            r4.<init>()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0034 }
        L_0x033f:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0034 }
            r10 = 0
            if (r5 == 0) goto L_0x0357
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0034 }
            r6 = r5
            qv.b r6 = (qv.C11819b) r6     // Catch:{ all -> 0x0034 }
            boolean r6 = r6.b(r9, r10)     // Catch:{ all -> 0x0034 }
            if (r6 == 0) goto L_0x033f
            r4.add(r5)     // Catch:{ all -> 0x0034 }
            goto L_0x033f
        L_0x0357:
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x0034 }
            r3 = r12
            r4 = r3
        L_0x035d:
            boolean r5 = r11.hasNext()     // Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x03e4
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x0034 }
            qv.b r5 = (qv.C11819b) r5     // Catch:{ all -> 0x0034 }
            if (r3 != 0) goto L_0x0379
            java.lang.String r3 = "Unable to fetch guest token"
            java.lang.String r3 = qv.C11818a.a(r3, r0)     // Catch:{ all -> 0x0034 }
            if (r3 != 0) goto L_0x0375
            goto L_0x03e4
        L_0x0375:
            java.lang.String r3 = qv.C11820c.a(r3)     // Catch:{ all -> 0x0034 }
        L_0x0379:
            r14 = r3
            if (r4 != 0) goto L_0x03cb
            java.lang.Class<eA.b> r3 = eA.C14372b.class
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x0034 }
            r15 = 36
            java.lang.String r4 = HJ.C15854t.s1(r3, r15, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            r8 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r8, r12, r13, r12)     // Catch:{ all -> 0x0034 }
            int r6 = r4.length()     // Catch:{ all -> 0x0034 }
            if (r6 != 0) goto L_0x0398
            goto L_0x039e
        L_0x0398:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r4, r3)     // Catch:{ all -> 0x0034 }
        L_0x039e:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = "main"
            r7 = 1
            boolean r4 = HJ.C15854t.b0(r4, r6, r7)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x03b2
            java.lang.String r4 = "m"
            goto L_0x03b4
        L_0x03b2:
            java.lang.String r4 = "b"
        L_0x03b4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r6.<init>()     // Catch:{ all -> 0x0034 }
            r6.append(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "|"
            r6.append(r4)     // Catch:{ all -> 0x0034 }
            r6.append(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0034 }
        L_0x03c8:
            r16 = r4
            goto L_0x03d1
        L_0x03cb:
            r7 = 1
            r8 = 46
            r15 = 36
            goto L_0x03c8
        L_0x03d1:
            r3 = r5
            r4 = r9
            r5 = r16
            r6 = r10
            r17 = r7
            r7 = r0
            r18 = r8
            r8 = r14
            r3.a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0034 }
            r3 = r14
            r4 = r16
            goto L_0x035d
        L_0x03e4:
            java.lang.String r0 = ""
        L_0x03e6:
            monitor-exit(r2)
            return r0
        L_0x03e8:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eA.C14372b.getToken():java.lang.String");
    }
}
