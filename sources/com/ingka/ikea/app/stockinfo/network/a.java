package com.ingka.ikea.app.stockinfo.network;

import HJ.C15854t;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import Wk.a;
import Wk.e;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.app.stockinfo.network.b;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import tf.C10253a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 42\u00020\u0001:\u0001+B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJH\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\fH@¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e*\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000e*\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0002¢\u0006\u0004\b\"\u0010 J>\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\fH@¢\u0006\u0004\b%\u0010&JJ\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\fH@¢\u0006\u0004\b(\u0010)J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020!0\u000e2\u0006\u0010*\u001a\u00020\u000fH@¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/a;", "LVk/b;", "Ltf/a;", "killSwitchRepository", "LXk/a;", "formatDeliveryTimeUseCase", "LVk/a;", "endpoint", "LQJ/M;", "defaultDispatcher", "<init>", "(Ltf/a;LXk/a;LVk/a;LQJ/M;)V", "", "fetchStores", "", "", "itemNos", "postalCode", "areaCode", "includeDeliveryPrices", "Lcom/ingka/ikea/app/stockinfo/network/b;", "i", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "LWk/e$a$a;", "k", "(Ljava/util/List;)LWk/e$a$a;", "LWk/e$a;", "T", "productNumber", "j", "(Ljava/util/List;Ljava/lang/String;)LWk/e$a;", "l", "(Ljava/util/List;)Ljava/util/List;", "LWk/e$a$b;", "m", "storeId", "LWk/e;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "productNumbers", "c", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "itemNo", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ltf/a;", "LXk/a;", "getFormatDeliveryTimeUseCase$stockinfo_release", "()LXk/a;", "LVk/a;", "d", "LQJ/M;", "e", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Vk.b {

    /* renamed from: e  reason: collision with root package name */
    public static final C2059a f92626e = new C2059a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C10253a f92627a;

    /* renamed from: b  reason: collision with root package name */
    private final Xk.a f92628b;

    /* renamed from: c  reason: collision with root package name */
    private final Vk.a f92629c;

    /* renamed from: d  reason: collision with root package name */
    private final M f92630d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/a$a;", "", "<init>", "()V", "", "DELIMITER", "Ljava/lang/String;", "STORES_LIST", "FOOD_AVAILABILITIES", "CHEAPEST_DELIVERY_PRICE", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.stockinfo.network.a$a  reason: collision with other inner class name */
    public static final class C2059a {
        public /* synthetic */ C2059a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2059a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.stockinfo.network.AvailabilityRemoteDataSourceImpl", f = "AvailabilityRemoteDataSource.kt", l = {191}, m = "doFetchAvailabilities")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f92631c;

        /* renamed from: d  reason: collision with root package name */
        Object f92632d;

        /* renamed from: e  reason: collision with root package name */
        Object f92633e;

        /* renamed from: f  reason: collision with root package name */
        Object f92634f;

        /* renamed from: g  reason: collision with root package name */
        Object f92635g;

        /* renamed from: h  reason: collision with root package name */
        Object f92636h;

        /* renamed from: i  reason: collision with root package name */
        Object f92637i;

        /* renamed from: j  reason: collision with root package name */
        Object f92638j;

        /* renamed from: k  reason: collision with root package name */
        boolean f92639k;

        /* renamed from: l  reason: collision with root package name */
        boolean f92640l;

        /* renamed from: m  reason: collision with root package name */
        int f92641m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f92642n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ a f92643o;

        /* renamed from: p  reason: collision with root package name */
        int f92644p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f92643o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f92642n = obj;
            this.f92644p |= Integer.MIN_VALUE;
            return this.f92643o.i(false, (List<String>) null, (String) null, (String) null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LWk/e;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.stockinfo.network.AvailabilityRemoteDataSourceImpl$fetchAvailabilitiesWithStore$2", f = "AvailabilityRemoteDataSource.kt", l = {120}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super List<? extends Wk.e>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f92645c;

        /* renamed from: d  reason: collision with root package name */
        int f92646d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f92647e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f92648f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f92649g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<String> f92650h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f92651i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f92652j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f92653k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str, List<String> list, String str2, String str3, boolean z10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f92648f = aVar;
            this.f92649g = str;
            this.f92650h = list;
            this.f92651i = str2;
            this.f92652j = str3;
            this.f92653k = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f92648f, this.f92649g, this.f92650h, this.f92651i, this.f92652j, this.f92653k, eVar);
            cVar.f92647e = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super List<Wk.e>> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92646d;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f92647e;
                a aVar = this.f92648f;
                String str = this.f92649g;
                boolean z10 = str == null || str.length() == 0;
                List<String> list = this.f92650h;
                String str2 = this.f92651i;
                String str3 = this.f92652j;
                boolean z11 = this.f92653k;
                this.f92647e = q10;
                this.f92645c = str;
                this.f92646d = 1;
                obj = aVar.i(!z10, list, str2, str3, z11, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                CharSequence charSequence = (CharSequence) this.f92645c;
                Q q11 = (Q) this.f92647e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) obj;
            List g10 = this.f92648f.l(list2);
            String str4 = this.f92649g;
            ArrayList arrayList = new ArrayList();
            for (Object next : this.f92648f.m(list2)) {
                if (C15854t.H(((e.a.b) next).b(), str4, true)) {
                    arrayList.add(next);
                }
            }
            Iterable<String> iterable = this.f92650h;
            a aVar2 = this.f92648f;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (String str5 : iterable) {
                e.a.C1887a aVar3 = (e.a.C1887a) aVar2.j(g10, str5);
                if (aVar3 == null) {
                    aVar3 = aVar2.k(g10);
                }
                arrayList2.add(new Wk.e(str5, (e.a.b) aVar2.j(arrayList, str5), aVar3));
            }
            return arrayList2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LWk/e;", "<anonymous>", "(LQJ/Q;)LWk/e;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.stockinfo.network.AvailabilityRemoteDataSourceImpl$fetchAvailability$2", f = "AvailabilityRemoteDataSource.kt", l = {90}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super Wk.e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92654c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f92655d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f92656e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f92657f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f92658g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f92659h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f92660i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, String str, String str2, String str3, String str4, boolean z10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f92655d = aVar;
            this.f92656e = str;
            this.f92657f = str2;
            this.f92658g = str3;
            this.f92659h = str4;
            this.f92660i = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f92655d, this.f92656e, this.f92657f, this.f92658g, this.f92659h, this.f92660i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Wk.e> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92654c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f92655d;
                List e10 = C16877v.e(this.f92656e);
                String str = this.f92657f;
                String str2 = this.f92658g;
                String str3 = this.f92659h;
                boolean z10 = this.f92660i;
                this.f92654c = 1;
                obj = aVar.c(e10, str, str2, str3, z10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16877v.w0((List) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LWk/e$a$b;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.stockinfo.network.AvailabilityRemoteDataSourceImpl$fetchStoresAvailability$2", f = "AvailabilityRemoteDataSource.kt", l = {157}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super List<? extends e.a.b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f92661c;

        /* renamed from: d  reason: collision with root package name */
        Object f92662d;

        /* renamed from: e  reason: collision with root package name */
        int f92663e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f92664f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f92665g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, String str, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f92664f = aVar;
            this.f92665g = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f92664f, this.f92665g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super List<e.a.b>> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object f10 = C17187b.f();
            int i10 = this.f92663e;
            if (i10 == 0) {
                y.b(obj);
                a aVar2 = this.f92664f;
                List e10 = C16877v.e(this.f92665g);
                a aVar3 = this.f92664f;
                this.f92661c = e10;
                this.f92662d = aVar2;
                this.f92663e = 1;
                Object d10 = aVar3.i(true, e10, (String) null, (String) null, false, this);
                if (d10 == f10) {
                    return f10;
                }
                aVar = aVar2;
                obj = d10;
            } else if (i10 == 1) {
                aVar = (a) this.f92662d;
                List list = (List) this.f92661c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return aVar.m((List) obj);
        }
    }

    public a(C10253a aVar, Xk.a aVar2, Vk.a aVar3, M m10) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "formatDeliveryTimeUseCase");
        C17542s.j(aVar3, "endpoint");
        C17542s.j(m10, "defaultDispatcher");
        this.f92627a = aVar;
        this.f92628b = aVar2;
        this.f92629c = aVar3;
        this.f92630d = m10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(boolean r23, java.util.List<java.lang.String> r24, java.lang.String r25, java.lang.String r26, boolean r27, dI.C17164e<? super java.util.List<? extends com.ingka.ikea.app.stockinfo.network.b>> r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r27
            r4 = r28
            boolean r5 = r4 instanceof com.ingka.ikea.app.stockinfo.network.a.b
            if (r5 == 0) goto L_0x001e
            r5 = r4
            com.ingka.ikea.app.stockinfo.network.a$b r5 = (com.ingka.ikea.app.stockinfo.network.a.b) r5
            int r6 = r5.f92644p
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001e
            int r6 = r6 - r7
            r5.f92644p = r6
        L_0x001c:
            r11 = r5
            goto L_0x0024
        L_0x001e:
            com.ingka.ikea.app.stockinfo.network.a$b r5 = new com.ingka.ikea.app.stockinfo.network.a$b
            r5.<init>(r0, r4)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r5 = r11.f92642n
            java.lang.Object r12 = eI.C17187b.f()
            int r6 = r11.f92644p
            r7 = 1
            if (r6 == 0) goto L_0x005e
            if (r6 != r7) goto L_0x0056
            java.lang.Object r1 = r11.f92638j
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f92637i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f92636h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f92635g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r11.f92634f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f92633e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.f92632d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r11.f92631c
            com.ingka.ikea.app.stockinfo.network.a r1 = (com.ingka.ikea.app.stockinfo.network.a) r1
            XH.y.b(r5)
            goto L_0x00e2
        L_0x0056:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            XH.y.b(r5)
            java.util.List r5 = YH.C16877v.c()
            if (r1 == 0) goto L_0x006c
            java.lang.String r6 = "StoresList"
            r5.add(r6)
        L_0x006c:
            if (r3 == 0) goto L_0x0073
            java.lang.String r6 = "CheapestDeliveryPrice"
            r5.add(r6)
        L_0x0073:
            java.lang.String r6 = "FoodAvailabilities"
            r5.add(r6)
            java.util.List r6 = YH.C16877v.a(r5)
            r8 = r6
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x009d
            r13 = r6
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r20 = 62
            r21 = 0
            java.lang.String r14 = ","
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r8 = YH.C16877v.G0(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x009b:
            r10 = r8
            goto L_0x009f
        L_0x009d:
            r8 = 0
            goto L_0x009b
        L_0x009f:
            Vk.a r8 = r0.f92629c
            r13 = r2
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r20 = 62
            r21 = 0
            java.lang.String r14 = ","
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r9 = YH.C16877v.G0(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11.f92631c = r0
            r11.f92632d = r2
            r2 = r25
            r11.f92633e = r2
            r13 = r26
            r11.f92634f = r13
            r11.f92635g = r4
            r11.f92636h = r6
            r11.f92637i = r10
            r11.f92638j = r5
            r11.f92639k = r1
            r11.f92640l = r3
            r1 = 0
            r11.f92641m = r1
            r11.f92644p = r7
            r6 = r8
            r7 = r9
            r8 = r25
            r9 = r26
            java.lang.Object r5 = r6.a(r7, r8, r9, r10, r11)
            if (r5 != r12) goto L_0x00e1
            return r12
        L_0x00e1:
            r1 = r0
        L_0x00e2:
            com.ingka.ikea.app.stockinfo.network.AvailabilityRemote r5 = (com.ingka.ikea.app.stockinfo.network.AvailabilityRemote) r5
            tf.a r2 = r1.f92627a
            boolean r2 = r2.K()
            Xk.a r1 = r1.f92628b
            java.util.List r1 = r5.b(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.stockinfo.network.a.i(boolean, java.util.List, java.lang.String, java.lang.String, boolean, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final <T extends e.a> T j(List<? extends T> list, String str) {
        T t10;
        boolean z10;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            e.b a10 = ((e.a) t10).a();
            if (a10 instanceof e.b.a) {
                z10 = C17542s.e(((e.b.a) a10).d().getProductNo(), str);
                continue;
            } else if (a10 instanceof e.b.C1890b) {
                z10 = C17542s.e(((e.b.C1890b) a10).b(), str);
                continue;
            } else {
                throw new t();
            }
            if (z10) {
                break;
            }
        }
        return (e.a) t10;
    }

    /* access modifiers changed from: private */
    public final e.a.C1887a k(List<e.a.C1887a> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            e.b a10 = ((e.a.C1887a) obj).a();
            if (!(a10 instanceof e.b.a)) {
                if (!(a10 instanceof e.b.C1890b)) {
                    throw new t();
                }
            }
        }
        e.a.C1887a aVar = (e.a.C1887a) obj;
        return aVar == null ? new e.a.C1887a(new e.b.C1890b((String) null, new Wk.a(a.C1886a.UNKNOWN))) : aVar;
    }

    /* access modifiers changed from: private */
    public final List<e.a.C1887a> l(List<? extends b> list) {
        Iterable iterable = list;
        ArrayList<b.a.C2060a> arrayList = new ArrayList<>();
        for (Object next : iterable) {
            if (next instanceof b.a.C2060a) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (b.a.C2060a a10 : arrayList) {
            arrayList2.add(new e.a.C1887a(a10.a()));
        }
        ArrayList<b.C2062b> arrayList3 = new ArrayList<>();
        for (Object next2 : iterable) {
            if (next2 instanceof b.C2062b) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList3, 10));
        for (b.C2062b bVar : arrayList3) {
            arrayList4.add(new e.a.C1887a(new e.b.C1890b(bVar.b(), bVar.a())));
        }
        return C16877v.V0(arrayList2, arrayList4);
    }

    /* access modifiers changed from: private */
    public final List<e.a.b> m(List<? extends b> list) {
        ArrayList<b.a.C2061b> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof b.a.C2061b) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (b.a.C2061b bVar : arrayList) {
            e.b.a a10 = bVar.a();
            arrayList2.add(new e.a.b(bVar.b(), new e.b.a(a10.d(), a10.a(), a10.c(), (e.b.a.c) null)));
        }
        return arrayList2;
    }

    public Object a(String str, C17164e<? super List<e.a.b>> eVar) {
        return C16310i.g(this.f92630d, new e(this, str, (C17164e<? super e>) null), eVar);
    }

    public Object b(String str, String str2, String str3, String str4, boolean z10, C17164e<? super Wk.e> eVar) {
        return C16310i.g(this.f92630d, new d(this, str, str2, str3, str4, z10, (C17164e<? super d>) null), eVar);
    }

    public Object c(List<String> list, String str, String str2, String str3, boolean z10, C17164e<? super List<Wk.e>> eVar) {
        return C16310i.g(this.f92630d, new c(this, str3, list, str, str2, z10, (C17164e<? super c>) null), eVar);
    }
}
