package com.ingka.ikea.onlinepayment.impl.presentation;

import Ba.C6385i;
import HJ.C15854t;
import Mw.C13211a;
import Mw.C13213c;
import Nn.t;
import Nn.x;
import Ow.C13323a;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.C16342y0;
import QJ.Q;
import Sw.C13669a;
import XH.C16807N;
import XH.y;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u0011*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/ingka/ikea/onlinepayment/impl/presentation/AciBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "", "aciCheckoutId", "Landroid/content/ComponentName;", "senderComponentName", "LXH/N;", "p", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;LdI/e;)Ljava/lang/Object;", "LBa/i;", "googlePayData", "m", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;LBa/i;LdI/e;)Ljava/lang/Object;", "", "isValid", "n", "(Landroid/content/Context;Ljava/lang/String;ZLandroid/content/ComponentName;LdI/e;)Ljava/lang/Object;", "LNn/t;", "error", "k", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;LNn/t;LdI/e;)Ljava/lang/Object;", "o", "(LBa/i;)Z", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "LNn/x;", "c", "LNn/x;", "h", "()LNn/x;", "setCheckoutRepository", "(LNn/x;)V", "checkoutRepository", "LOw/a;", "d", "LOw/a;", "g", "()LOw/a;", "setAciNavigation", "(LOw/a;)V", "aciNavigation", "LMw/c;", "e", "LMw/c;", "j", "()LMw/c;", "setPaymentDevAnalytics", "(LMw/c;)V", "paymentDevAnalytics", "LMw/a;", "f", "LMw/a;", "i", "()LMw/a;", "setPaymentAnalytics", "(LMw/a;)V", "paymentAnalytics", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AciBroadcastReceiver extends h {

    /* renamed from: c  reason: collision with root package name */
    public x f119230c;

    /* renamed from: d  reason: collision with root package name */
    public C13323a f119231d;

    /* renamed from: e  reason: collision with root package name */
    public C13213c f119232e;

    /* renamed from: f  reason: collision with root package name */
    public C13211a f119233f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver", f = "AciBroadcastReceiver.kt", l = {227, 232}, m = "handleExpressCheckoutError")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f119234c;

        /* renamed from: d  reason: collision with root package name */
        Object f119235d;

        /* renamed from: e  reason: collision with root package name */
        Object f119236e;

        /* renamed from: f  reason: collision with root package name */
        Object f119237f;

        /* renamed from: g  reason: collision with root package name */
        Object f119238g;

        /* renamed from: h  reason: collision with root package name */
        Object f119239h;

        /* renamed from: i  reason: collision with root package name */
        Object f119240i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f119241j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ AciBroadcastReceiver f119242k;

        /* renamed from: l  reason: collision with root package name */
        int f119243l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AciBroadcastReceiver aciBroadcastReceiver, C17164e<? super a> eVar) {
            super(eVar);
            this.f119242k = aciBroadcastReceiver;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119241j = obj;
            this.f119243l |= Integer.MIN_VALUE;
            return this.f119242k.k((Context) null, (String) null, (ComponentName) null, (t) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver", f = "AciBroadcastReceiver.kt", l = {135, 151, 163}, m = "handleGooglePayData")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f119244c;

        /* renamed from: d  reason: collision with root package name */
        Object f119245d;

        /* renamed from: e  reason: collision with root package name */
        Object f119246e;

        /* renamed from: f  reason: collision with root package name */
        Object f119247f;

        /* renamed from: g  reason: collision with root package name */
        Object f119248g;

        /* renamed from: h  reason: collision with root package name */
        Object f119249h;

        /* renamed from: i  reason: collision with root package name */
        Object f119250i;

        /* renamed from: j  reason: collision with root package name */
        Object f119251j;

        /* renamed from: k  reason: collision with root package name */
        Object f119252k;

        /* renamed from: l  reason: collision with root package name */
        Object f119253l;

        /* renamed from: m  reason: collision with root package name */
        Object f119254m;

        /* renamed from: n  reason: collision with root package name */
        Object f119255n;

        /* renamed from: o  reason: collision with root package name */
        Object f119256o;

        /* renamed from: p  reason: collision with root package name */
        Object f119257p;

        /* renamed from: q  reason: collision with root package name */
        Object f119258q;

        /* renamed from: r  reason: collision with root package name */
        int f119259r;

        /* renamed from: s  reason: collision with root package name */
        int f119260s;

        /* renamed from: t  reason: collision with root package name */
        int f119261t;

        /* renamed from: u  reason: collision with root package name */
        int f119262u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f119263v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ AciBroadcastReceiver f119264w;

        /* renamed from: x  reason: collision with root package name */
        int f119265x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AciBroadcastReceiver aciBroadcastReceiver, C17164e<? super b> eVar) {
            super(eVar);
            this.f119264w = aciBroadcastReceiver;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119263v = obj;
            this.f119265x |= Integer.MIN_VALUE;
            return this.f119264w.m((Context) null, (String) null, (ComponentName) null, (C6385i) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$handleSubmitPaymentResponse$2", f = "AciBroadcastReceiver.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f119266c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f119267d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AciBroadcastReceiver f119268e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f119269f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f119270g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentName f119271h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f119272i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AciBroadcastReceiver aciBroadcastReceiver, boolean z10, Context context, ComponentName componentName, String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f119268e = aciBroadcastReceiver;
            this.f119269f = z10;
            this.f119270g = context;
            this.f119271h = componentName;
            this.f119272i = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f119268e, this.f119269f, this.f119270g, this.f119271h, this.f119272i, eVar);
            cVar.f119267d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Q q10;
            boolean z10;
            C17187b.f();
            if (this.f119266c == 0) {
                y.b(obj);
                Q q11 = (Q) this.f119267d;
                boolean z11 = this.f119269f;
                qv.e eVar = qv.e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                String str2 = null;
                String str3 = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = DslKt.INDICATOR_BACKGROUND;
                    if (!hasNext) {
                        break;
                    }
                    C11819b bVar = (C11819b) it.next();
                    if (str2 == null) {
                        String a10 = C11818a.a("Payment status, is valid: " + z11, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = q11.getClass().getName();
                        C17542s.g(name);
                        z10 = z11;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                            str = DslKt.INDICATOR_MAIN;
                        }
                        str3 = str + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        z10 = z11;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, (Throwable) null, str4);
                    str3 = str5;
                    str2 = str4;
                    z11 = z10;
                }
                String str6 = this.f119272i;
                boolean z12 = this.f119269f;
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str7 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Open payment again, checkoutId: ");
                        sb2.append(str6);
                        sb2.append(", abort: ");
                        sb2.append(!z12);
                        String a11 = C11818a.a(sb2.toString(), (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    if (str8 == null) {
                        String name2 = q11.getClass().getName();
                        C17542s.g(name2);
                        q10 = q11;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        q10 = q11;
                    }
                    bVar2.a(eVar2, str8, false, (Throwable) null, str7);
                    q11 = q10;
                }
                this.f119268e.j().d(this.f119269f);
                this.f119268e.g().a(this.f119270g, this.f119271h, this.f119272i, this.f119269f);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$onReceive$3", f = "AciBroadcastReceiver.kt", l = {81, 88}, m = "invokeSuspend")
    static final class d extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f119273c;

        /* renamed from: d  reason: collision with root package name */
        int f119274d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AciBroadcastReceiver f119275e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6385i f119276f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f119277g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f119278h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ComponentName f119279i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AciBroadcastReceiver aciBroadcastReceiver, C6385i iVar, Context context, String str, ComponentName componentName, C17164e<? super d> eVar) {
            super(1, eVar);
            this.f119275e = aciBroadcastReceiver;
            this.f119276f = iVar;
            this.f119277g = context;
            this.f119278h = str;
            this.f119279i = componentName;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new d(this.f119275e, this.f119276f, this.f119277g, this.f119278h, this.f119279i, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f119274d;
            if (i10 == 0) {
                y.b(obj);
                boolean e10 = this.f119275e.o(this.f119276f);
                if (e10) {
                    AciBroadcastReceiver aciBroadcastReceiver = this.f119275e;
                    Context context = this.f119277g;
                    String str = this.f119278h;
                    ComponentName componentName = this.f119279i;
                    C6385i iVar = this.f119276f;
                    if (iVar != null) {
                        this.f119273c = e10;
                        this.f119274d = 1;
                        if (aciBroadcastReceiver.m(context, str, componentName, iVar, this) == f10) {
                            return f10;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    AciBroadcastReceiver aciBroadcastReceiver2 = this.f119275e;
                    Context context2 = this.f119277g;
                    String str2 = this.f119278h;
                    ComponentName componentName2 = this.f119279i;
                    this.f119273c = e10;
                    this.f119274d = 2;
                    if (aciBroadcastReceiver2.p(context2, str2, componentName2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver", f = "AciBroadcastReceiver.kt", l = {105, 115}, m = "submitExternalPayment")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f119280c;

        /* renamed from: d  reason: collision with root package name */
        Object f119281d;

        /* renamed from: e  reason: collision with root package name */
        Object f119282e;

        /* renamed from: f  reason: collision with root package name */
        Object f119283f;

        /* renamed from: g  reason: collision with root package name */
        Object f119284g;

        /* renamed from: h  reason: collision with root package name */
        Object f119285h;

        /* renamed from: i  reason: collision with root package name */
        Object f119286i;

        /* renamed from: j  reason: collision with root package name */
        Object f119287j;

        /* renamed from: k  reason: collision with root package name */
        Object f119288k;

        /* renamed from: l  reason: collision with root package name */
        Object f119289l;

        /* renamed from: m  reason: collision with root package name */
        Object f119290m;

        /* renamed from: n  reason: collision with root package name */
        Object f119291n;

        /* renamed from: o  reason: collision with root package name */
        Object f119292o;

        /* renamed from: p  reason: collision with root package name */
        int f119293p;

        /* renamed from: q  reason: collision with root package name */
        int f119294q;

        /* renamed from: r  reason: collision with root package name */
        int f119295r;

        /* renamed from: s  reason: collision with root package name */
        int f119296s;

        /* renamed from: t  reason: collision with root package name */
        int f119297t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f119298u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ AciBroadcastReceiver f119299v;

        /* renamed from: w  reason: collision with root package name */
        int f119300w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AciBroadcastReceiver aciBroadcastReceiver, C17164e<? super e> eVar) {
            super(eVar);
            this.f119299v = aciBroadcastReceiver;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119298u = obj;
            this.f119300w |= Integer.MIN_VALUE;
            return this.f119299v.p((Context) null, (String) null, (ComponentName) null, this);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(android.content.Context r24, java.lang.String r25, android.content.ComponentName r26, Nn.t r27, dI.C17164e<? super XH.C16807N> r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r27
            r3 = r28
            boolean r4 = r3 instanceof com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.a
            if (r4 == 0) goto L_0x001c
            r4 = r3
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$a r4 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.a) r4
            int r5 = r4.f119243l
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.f119243l = r5
        L_0x001a:
            r10 = r4
            goto L_0x0022
        L_0x001c:
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$a r4 = new com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$a
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r4 = r10.f119241j
            java.lang.Object r11 = eI.C17187b.f()
            int r5 = r10.f119243l
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0086
            if (r5 == r7) goto L_0x005b
            if (r5 != r6) goto L_0x0053
            java.lang.Object r1 = r10.f119240i
            Nn.t r1 = (Nn.t) r1
            java.lang.Object r1 = r10.f119239h
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r10.f119238g
            Nn.t r1 = (Nn.t) r1
            java.lang.Object r1 = r10.f119237f
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            java.lang.Object r1 = r10.f119236e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f119235d
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r1 = r10.f119234c
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r1 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r1
            XH.y.b(r4)
            goto L_0x0121
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005b:
            java.lang.Object r1 = r10.f119240i
            Nn.t r1 = (Nn.t) r1
            java.lang.Object r2 = r10.f119239h
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r3 = r10.f119238g
            Nn.t r3 = (Nn.t) r3
            java.lang.Object r5 = r10.f119237f
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            java.lang.Object r7 = r10.f119236e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r10.f119235d
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r10.f119234c
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r9 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r9
            XH.y.b(r4)
            r21 = r3
            r3 = r2
            r2 = r21
            r22 = r9
            r9 = r5
            r5 = r22
            goto L_0x0107
        L_0x0086:
            XH.y.b(r4)
            Mw.c r4 = r23.j()
            Mw.c$c r5 = Mw.C13213c.C2746c.ERROR
            Mw.c$b r8 = Mw.C13213c.b.EXPRESS_ERROR
            Nn.t$a r9 = Nn.t.a.f84151a
            boolean r9 = kotlin.jvm.internal.C17542s.e(r2, r9)
            if (r9 == 0) goto L_0x009c
            java.lang.String r9 = "Generic error"
            goto L_0x00e0
        L_0x009c:
            Nn.t$c r9 = Nn.t.c.f84153a
            boolean r9 = kotlin.jvm.internal.C17542s.e(r2, r9)
            if (r9 == 0) goto L_0x00a7
            java.lang.String r9 = "TaxCodeValidationError"
            goto L_0x00e0
        L_0x00a7:
            boolean r9 = r2 instanceof Nn.t.d
            if (r9 == 0) goto L_0x00cb
            r9 = r2
            Nn.t$d r9 = (Nn.t.d) r9
            java.util.List r9 = r9.a()
            r12 = r9
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            com.ingka.ikea.onlinepayment.impl.presentation.a r18 = new com.ingka.ikea.onlinepayment.impl.presentation.a
            r18.<init>()
            r19 = 30
            r20 = 0
            java.lang.String r13 = ","
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r9 = YH.C16877v.G0(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00e0
        L_0x00cb:
            Nn.t$e r9 = Nn.t.e.f84155a
            boolean r9 = kotlin.jvm.internal.C17542s.e(r2, r9)
            if (r9 == 0) goto L_0x00d6
            java.lang.String r9 = "Zip code mismatch"
            goto L_0x00e0
        L_0x00d6:
            Nn.t$b r9 = Nn.t.b.f84152a
            boolean r9 = kotlin.jvm.internal.C17542s.e(r2, r9)
            if (r9 == 0) goto L_0x0124
            java.lang.String r9 = "State code mismatch"
        L_0x00e0:
            r4.a(r5, r1, r8, r9)
            Nn.x r4 = r23.h()
            r10.f119234c = r0
            r5 = r24
            r10.f119235d = r5
            r10.f119236e = r1
            r8 = r26
            r10.f119237f = r8
            r10.f119238g = r2
            r10.f119239h = r3
            r10.f119240i = r2
            r10.f119243l = r7
            java.lang.Object r4 = r4.m(r1, r2, r10)
            if (r4 != r11) goto L_0x0102
            return r11
        L_0x0102:
            r7 = r1
            r1 = r2
            r9 = r8
            r8 = r5
            r5 = r0
        L_0x0107:
            r10.f119234c = r5
            r10.f119235d = r8
            r10.f119236e = r7
            r10.f119237f = r9
            r10.f119238g = r2
            r10.f119239h = r3
            r10.f119240i = r1
            r10.f119243l = r6
            r1 = 0
            r6 = r8
            r8 = r1
            java.lang.Object r1 = r5.n(r6, r7, r8, r9, r10)
            if (r1 != r11) goto L_0x0121
            return r11
        L_0x0121:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0124:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.k(android.content.Context, java.lang.String, android.content.ComponentName, Nn.t, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final CharSequence l(t.d.a aVar) {
        C17542s.j(aVar, "it");
        return aVar.j();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: Nn.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: qv.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: qv.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v7, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v8, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v10, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v14, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v15, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v16, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX WARNING: type inference failed for: r10v8, types: [java.util.Collection, java.lang.Iterable, java.util.ArrayList] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x033c A[SYNTHETIC, Splitter:B:115:0x033c] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x034e A[EDGE_INSN: B:225:0x034e->B:122:0x034e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02f7 A[SYNTHETIC, Splitter:B:91:0x02f7] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(android.content.Context r35, java.lang.String r36, android.content.ComponentName r37, Ba.C6385i r38, dI.C17164e<? super XH.C16807N> r39) {
        /*
            r34 = this;
            r1 = r34
            r2 = r36
            r3 = r39
            boolean r0 = r3 instanceof com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.b
            if (r0 == 0) goto L_0x001a
            r0 = r3
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$b r0 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.b) r0
            int r4 = r0.f119265x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r0.f119265x = r4
        L_0x0018:
            r7 = r0
            goto L_0x0020
        L_0x001a:
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$b r0 = new com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$b
            r0.<init>(r1, r3)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r7.f119263v
            java.lang.Object r8 = eI.C17187b.f()
            int r4 = r7.f119265x
            r5 = 3
            java.lang.String r6 = "|"
            java.lang.String r9 = "b"
            java.lang.String r10 = "m"
            java.lang.String r11 = "main"
            java.lang.String r12 = "Kt"
            r13 = 1
            r14 = 2
            if (r4 == 0) goto L_0x00fb
            if (r4 == r13) goto L_0x00af
            if (r4 == r14) goto L_0x007a
            if (r4 != r5) goto L_0x0072
            java.lang.Object r2 = r7.f119256o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119254m
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            java.lang.Object r2 = r7.f119253l
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r7.f119252k
            Nn.t r2 = (Nn.t) r2
            java.lang.Object r2 = r7.f119251j
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r7.f119250i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119249h
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r7.f119248g
            Ba.i r2 = (Ba.C6385i) r2
            java.lang.Object r2 = r7.f119247f
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            java.lang.Object r2 = r7.f119246e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119245d
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r2 = r7.f119244c
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            XH.y.b(r0)
            goto L_0x0577
        L_0x0072:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x007a:
            java.lang.Object r2 = r7.f119256o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119254m
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            java.lang.Object r2 = r7.f119253l
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r7.f119252k
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r7.f119251j
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r7.f119250i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119249h
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r7.f119248g
            Ba.i r2 = (Ba.C6385i) r2
            java.lang.Object r2 = r7.f119247f
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            java.lang.Object r2 = r7.f119246e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119245d
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r2 = r7.f119244c
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            XH.y.b(r0)
            goto L_0x0536
        L_0x00af:
            java.lang.Object r2 = r7.f119256o
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r7.f119255n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = r7.f119254m
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119253l
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119252k
            qv.e r2 = (qv.e) r2
            java.lang.Object r2 = r7.f119251j
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            java.lang.Object r2 = r7.f119250i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.f119249h
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r7.f119248g
            Ba.i r4 = (Ba.C6385i) r4
            java.lang.Object r5 = r7.f119247f
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            java.lang.Object r13 = r7.f119246e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r7.f119245d
            android.content.Context r14 = (android.content.Context) r14
            java.lang.Object r15 = r7.f119244c
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r15 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r15
            XH.y.b(r0)     // Catch:{ Exception -> 0x00f1 }
            r24 = r9
            r25 = r10
            r33 = r15
            r15 = r5
            r5 = r33
            goto L_0x02de
        L_0x00f1:
            r0 = move-exception
            r24 = r9
            r25 = r10
            r23 = r15
            r15 = r5
            goto L_0x0418
        L_0x00fb:
            XH.y.b(r0)
            java.lang.String r4 = r38.U()
            java.lang.String r0 = "toJson(...)"
            kotlin.jvm.internal.C17542s.i(r4, r0)
            qv.e r0 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x011a:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0136
            java.lang.Object r14 = r5.next()
            r15 = r14
            qv.b r15 = (qv.C11819b) r15
            r17 = r5
            r5 = 0
            boolean r15 = r15.b(r0, r5)
            if (r15 == 0) goto L_0x0133
            r13.add(r14)
        L_0x0133:
            r5 = r17
            goto L_0x011a
        L_0x0136:
            java.util.Iterator r5 = r13.iterator()
            r13 = 0
            r14 = 0
        L_0x013c:
            boolean r15 = r5.hasNext()
            java.lang.Class<com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver> r17 = com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.class
            if (r15 == 0) goto L_0x0157
            java.lang.Object r15 = r5.next()
            qv.b r15 = (qv.C11819b) r15
            r23 = r5
            r5 = 0
            if (r13 != 0) goto L_0x0163
            java.lang.String r13 = "handleGooglePayData"
            java.lang.String r13 = qv.C11818a.a(r13, r5)
            if (r13 != 0) goto L_0x015f
        L_0x0157:
            r26 = r8
            r24 = r9
            r25 = r10
            goto L_0x01d3
        L_0x015f:
            java.lang.String r13 = qv.C11820c.a(r13)
        L_0x0163:
            if (r14 != 0) goto L_0x01b3
            java.lang.String r14 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r14)
            r26 = r8
            r24 = r9
            r25 = r10
            r5 = 36
            r9 = 2
            r10 = 0
            java.lang.String r8 = HJ.C15854t.s1(r14, r5, r10, r9, r10)
            r5 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r5, r10, r9, r10)
            int r5 = r8.length()
            if (r5 != 0) goto L_0x0187
            goto L_0x018b
        L_0x0187:
            java.lang.String r14 = HJ.C15854t.P0(r8, r12)
        L_0x018b:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r8 = 1
            boolean r5 = HJ.C15854t.b0(r5, r11, r8)
            if (r5 == 0) goto L_0x019d
            r5 = r25
            goto L_0x019f
        L_0x019d:
            r5 = r24
        L_0x019f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r14)
            java.lang.String r5 = r8.toString()
            r14 = r5
            goto L_0x01b9
        L_0x01b3:
            r26 = r8
            r24 = r9
            r25 = r10
        L_0x01b9:
            r20 = 0
            r17 = r15
            r18 = r0
            r19 = r14
            r5 = 0
            r21 = r5
            r22 = r13
            r17.a(r18, r19, r20, r21, r22)
            r5 = r23
            r9 = r24
            r10 = r25
            r8 = r26
            goto L_0x013c
        L_0x01d3:
            qv.e r0 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01e6:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x01fe
            java.lang.Object r9 = r5.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            r13 = 1
            boolean r10 = r10.b(r0, r13)
            if (r10 == 0) goto L_0x01e6
            r8.add(r9)
            goto L_0x01e6
        L_0x01fe:
            java.util.Iterator r5 = r8.iterator()
            r13 = r8
            r9 = 0
            r10 = 0
        L_0x0205:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x022d
            java.lang.Object r13 = r5.next()
            r27 = r13
            qv.b r27 = (qv.C11819b) r27
            if (r9 != 0) goto L_0x0235
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r14 = "handleGooglePayData, json: "
            r15.append(r14)
            r15.append(r4)
            java.lang.String r14 = r15.toString()
            r15 = 0
            java.lang.String r14 = qv.C11818a.a(r14, r15)
            if (r14 != 0) goto L_0x0231
        L_0x022d:
            r20 = r5
            goto L_0x029b
        L_0x0231:
            java.lang.String r9 = qv.C11820c.a(r14)
        L_0x0235:
            if (r10 != 0) goto L_0x0283
            java.lang.String r10 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r20 = r5
            r19 = r13
            r13 = 0
            r14 = 36
            r15 = 2
            java.lang.String r5 = HJ.C15854t.s1(r10, r14, r13, r15, r13)
            r14 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r14, r13, r15, r13)
            int r13 = r5.length()
            if (r13 != 0) goto L_0x0257
            goto L_0x025b
        L_0x0257:
            java.lang.String r10 = HJ.C15854t.P0(r5, r12)
        L_0x025b:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r13 = 1
            boolean r5 = HJ.C15854t.b0(r5, r11, r13)
            if (r5 == 0) goto L_0x026d
            r5 = r25
            goto L_0x026f
        L_0x026d:
            r5 = r24
        L_0x026f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r5)
            r13.append(r6)
            r13.append(r10)
            java.lang.String r5 = r13.toString()
            r10 = r5
            goto L_0x0287
        L_0x0283:
            r20 = r5
            r19 = r13
        L_0x0287:
            r30 = 1
            r28 = r0
            r29 = r10
            r5 = 0
            r31 = r5
            r32 = r9
            r27.a(r28, r29, r30, r31, r32)
            r13 = r19
            r5 = r20
            goto L_0x0205
        L_0x029b:
            Nn.x r5 = r34.h()     // Catch:{ Exception -> 0x0414 }
            r7.f119244c = r1     // Catch:{ Exception -> 0x0414 }
            r14 = r35
            r7.f119245d = r14     // Catch:{ Exception -> 0x0414 }
            r7.f119246e = r2     // Catch:{ Exception -> 0x0414 }
            r15 = r37
            r7.f119247f = r15     // Catch:{ Exception -> 0x0410 }
            r14 = r38
            r7.f119248g = r14     // Catch:{ Exception -> 0x0405 }
            r7.f119249h = r3     // Catch:{ Exception -> 0x0405 }
            r7.f119250i = r4     // Catch:{ Exception -> 0x0405 }
            r7.f119251j = r1     // Catch:{ Exception -> 0x0405 }
            r7.f119252k = r0     // Catch:{ Exception -> 0x0405 }
            r7.f119253l = r9     // Catch:{ Exception -> 0x0405 }
            r7.f119254m = r10     // Catch:{ Exception -> 0x0405 }
            r7.f119255n = r8     // Catch:{ Exception -> 0x0405 }
            r0 = r20
            r7.f119256o = r0     // Catch:{ Exception -> 0x0405 }
            r7.f119257p = r13     // Catch:{ Exception -> 0x0405 }
            r8 = 1
            r7.f119259r = r8     // Catch:{ Exception -> 0x0405 }
            r9 = 0
            r7.f119260s = r9     // Catch:{ Exception -> 0x0405 }
            r7.f119261t = r9     // Catch:{ Exception -> 0x0405 }
            r7.f119262u = r9     // Catch:{ Exception -> 0x0405 }
            r7.f119265x = r8     // Catch:{ Exception -> 0x0405 }
            java.lang.Object r0 = r5.y(r2, r4, r7)     // Catch:{ Exception -> 0x0405 }
            r8 = r26
            if (r0 != r8) goto L_0x02d8
            return r8
        L_0x02d8:
            r5 = r1
            r13 = r2
            r2 = r4
            r4 = r14
            r14 = r35
        L_0x02de:
            qv.e r0 = qv.e.DEBUG     // Catch:{ Exception -> 0x03fc }
            qv.d r9 = qv.d.f102012a     // Catch:{ Exception -> 0x03fc }
            java.util.List r9 = r9.a()     // Catch:{ Exception -> 0x03fc }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ Exception -> 0x03fc }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x03fc }
            r10.<init>()     // Catch:{ Exception -> 0x03fc }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x03fc }
        L_0x02f1:
            boolean r17 = r9.hasNext()     // Catch:{ Exception -> 0x03fc }
            if (r17 == 0) goto L_0x0328
            java.lang.Object r1 = r9.next()     // Catch:{ Exception -> 0x0322 }
            r35 = r2
            r2 = r1
            qv.b r2 = (qv.C11819b) r2     // Catch:{ Exception -> 0x031c }
            r36 = r3
            r3 = 0
            boolean r2 = r2.b(r0, r3)     // Catch:{ Exception -> 0x0313 }
            if (r2 == 0) goto L_0x030c
            r10.add(r1)     // Catch:{ Exception -> 0x0313 }
        L_0x030c:
            r1 = r34
            r2 = r35
            r3 = r36
            goto L_0x02f1
        L_0x0313:
            r0 = move-exception
            r2 = r35
            r3 = r36
        L_0x0318:
            r23 = r5
            goto L_0x0418
        L_0x031c:
            r0 = move-exception
            r36 = r3
            r2 = r35
            goto L_0x0318
        L_0x0322:
            r0 = move-exception
            r35 = r2
            r36 = r3
            goto L_0x0318
        L_0x0328:
            r35 = r2
            r36 = r3
            java.util.Iterator r1 = r10.iterator()     // Catch:{ Exception -> 0x03f2 }
            r9 = r10
            r2 = 0
            r3 = 0
        L_0x0333:
            boolean r17 = r1.hasNext()     // Catch:{ Exception -> 0x03f2 }
            r37 = r4
            r4 = 0
            if (r17 == 0) goto L_0x034e
            java.lang.Object r9 = r1.next()     // Catch:{ Exception -> 0x03bd }
            r17 = r9
            qv.b r17 = (qv.C11819b) r17     // Catch:{ Exception -> 0x03bd }
            if (r3 != 0) goto L_0x0360
            java.lang.String r3 = "putExpressAddress successful"
            java.lang.String r3 = qv.C11818a.a(r3, r4)     // Catch:{ Exception -> 0x0358 }
            if (r3 != 0) goto L_0x0353
        L_0x034e:
            r1 = r4
            r23 = r5
            goto L_0x03df
        L_0x0353:
            java.lang.String r3 = qv.C11820c.a(r3)     // Catch:{ Exception -> 0x0358 }
            goto L_0x0360
        L_0x0358:
            r0 = move-exception
            r2 = r35
            r3 = r36
            r4 = r37
            goto L_0x0318
        L_0x0360:
            if (r2 != 0) goto L_0x03c1
            java.lang.Class r2 = r5.getClass()     // Catch:{ Exception -> 0x03bd }
            java.lang.String r2 = r2.getName()     // Catch:{ Exception -> 0x03bd }
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ Exception -> 0x03bd }
            r39 = r1
            r23 = r5
            r26 = r9
            r1 = 2
            r4 = 36
            r5 = 0
            java.lang.String r9 = HJ.C15854t.s1(r2, r4, r5, r1, r5)     // Catch:{ Exception -> 0x03b4 }
            r4 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r4, r5, r1, r5)     // Catch:{ Exception -> 0x03b4 }
            int r1 = r9.length()     // Catch:{ Exception -> 0x03b4 }
            if (r1 != 0) goto L_0x0388
            goto L_0x038c
        L_0x0388:
            java.lang.String r2 = HJ.C15854t.P0(r9, r12)     // Catch:{ Exception -> 0x03b4 }
        L_0x038c:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x03b4 }
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x03b4 }
            r4 = 1
            boolean r1 = HJ.C15854t.b0(r1, r11, r4)     // Catch:{ Exception -> 0x03b4 }
            if (r1 == 0) goto L_0x039e
            r1 = r25
            goto L_0x03a0
        L_0x039e:
            r1 = r24
        L_0x03a0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03b4 }
            r4.<init>()     // Catch:{ Exception -> 0x03b4 }
            r4.append(r1)     // Catch:{ Exception -> 0x03b4 }
            r4.append(r6)     // Catch:{ Exception -> 0x03b4 }
            r4.append(r2)     // Catch:{ Exception -> 0x03b4 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x03b4 }
            r2 = r1
            goto L_0x03c7
        L_0x03b4:
            r0 = move-exception
        L_0x03b5:
            r2 = r35
            r3 = r36
            r4 = r37
            goto L_0x0418
        L_0x03bd:
            r0 = move-exception
            r23 = r5
            goto L_0x03b5
        L_0x03c1:
            r39 = r1
            r23 = r5
            r26 = r9
        L_0x03c7:
            r20 = 0
            r18 = r0
            r19 = r2
            r1 = 0
            r21 = r1
            r22 = r3
            r17.a(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x03b4 }
            r4 = r37
            r1 = r39
            r5 = r23
            r9 = r26
            goto L_0x0333
        L_0x03df:
            r4 = r36
            r5 = r37
            r6 = r1
            r26 = r8
            r11 = r9
            r12 = r10
            r3 = r14
            r9 = 0
            r14 = 0
            r1 = r35
            r10 = r2
            r2 = r23
            goto L_0x04f5
        L_0x03f2:
            r0 = move-exception
            r37 = r4
            r23 = r5
            r2 = r35
            r3 = r36
            goto L_0x0418
        L_0x03fc:
            r0 = move-exception
            r35 = r2
            r36 = r3
            r37 = r4
            goto L_0x0318
        L_0x0405:
            r0 = move-exception
        L_0x0406:
            r8 = r26
            r23 = r34
            r13 = r2
            r2 = r4
            r4 = r14
            r14 = r35
            goto L_0x0418
        L_0x0410:
            r0 = move-exception
        L_0x0411:
            r14 = r38
            goto L_0x0406
        L_0x0414:
            r0 = move-exception
            r15 = r37
            goto L_0x0411
        L_0x0418:
            qv.e r1 = qv.e.WARN
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x042b:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x044b
            java.lang.Object r10 = r5.next()
            r35 = r2
            r2 = r10
            qv.b r2 = (qv.C11819b) r2
            r36 = r3
            r3 = 0
            boolean r2 = r2.b(r1, r3)
            if (r2 == 0) goto L_0x0446
            r9.add(r10)
        L_0x0446:
            r2 = r35
            r3 = r36
            goto L_0x042b
        L_0x044b:
            r35 = r2
            r36 = r3
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r10 = 0
        L_0x0455:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x046d
            java.lang.Object r3 = r9.next()
            r17 = r3
            qv.b r17 = (qv.C11819b) r17
            if (r10 != 0) goto L_0x0479
            java.lang.String r3 = "Something went wrong in putExpressAddress"
            java.lang.String r3 = qv.C11818a.a(r3, r0)
            if (r3 != 0) goto L_0x0474
        L_0x046d:
            r37 = r4
            r38 = r9
            r9 = 1
            goto L_0x04e3
        L_0x0474:
            java.lang.String r3 = qv.C11820c.a(r3)
            r10 = r3
        L_0x0479:
            if (r2 != 0) goto L_0x04ca
            java.lang.Class r2 = r23.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r37 = r4
            r38 = r9
            r3 = 36
            r4 = 0
            r5 = 2
            java.lang.String r9 = HJ.C15854t.s1(r2, r3, r4, r5, r4)
            r3 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r3, r4, r5, r4)
            int r5 = r9.length()
            if (r5 != 0) goto L_0x049f
            goto L_0x04a3
        L_0x049f:
            java.lang.String r2 = HJ.C15854t.P0(r9, r12)
        L_0x04a3:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r9 = 1
            boolean r5 = HJ.C15854t.b0(r5, r11, r9)
            if (r5 == 0) goto L_0x04b5
            r5 = r25
            goto L_0x04b7
        L_0x04b5:
            r5 = r24
        L_0x04b7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x04d0
        L_0x04ca:
            r37 = r4
            r38 = r9
            r4 = 0
            r9 = 1
        L_0x04d0:
            r20 = 0
            r18 = r1
            r19 = r2
            r21 = r0
            r22 = r10
            r17.a(r18, r19, r20, r21, r22)
            r4 = r37
            r9 = r38
            goto L_0x0455
        L_0x04e3:
            r1 = r35
            r4 = r36
            r5 = r37
            r11 = r38
            r6 = r0
            r12 = r2
            r26 = r8
            r3 = r14
            r2 = r23
            r9 = r2
            r14 = r6
            r0 = r9
        L_0x04f5:
            Mw.a r8 = r2.i()
            r16 = r11
            if (r14 != 0) goto L_0x04ff
            r11 = 1
            goto L_0x0500
        L_0x04ff:
            r11 = 0
        L_0x0500:
            r8.a(r11)
            if (r14 != 0) goto L_0x0539
            r7.f119244c = r2
            r7.f119245d = r3
            r7.f119246e = r13
            r7.f119247f = r15
            r7.f119248g = r5
            r7.f119249h = r4
            r7.f119250i = r1
            r7.f119251j = r14
            r7.f119252k = r14
            r7.f119253l = r6
            r7.f119254m = r9
            r7.f119255n = r0
            r7.f119256o = r10
            r7.f119257p = r12
            r6 = r16
            r7.f119258q = r6
            r1 = 0
            r7.f119259r = r1
            r7.f119260s = r1
            r1 = 2
            r7.f119265x = r1
            java.lang.Object r0 = r2.p(r3, r13, r15, r7)
            r8 = r26
            if (r0 != r8) goto L_0x0536
            return r8
        L_0x0536:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0539:
            r6 = r16
            r8 = r26
            boolean r11 = r14 instanceof Nn.t
            if (r11 == 0) goto L_0x0545
            r11 = r14
            Nn.t r11 = (Nn.t) r11
            goto L_0x0547
        L_0x0545:
            Nn.t$a r11 = Nn.t.a.f84151a
        L_0x0547:
            r7.f119244c = r2
            r7.f119245d = r3
            r7.f119246e = r13
            r7.f119247f = r15
            r7.f119248g = r5
            r7.f119249h = r4
            r7.f119250i = r1
            r7.f119251j = r14
            r7.f119252k = r11
            r7.f119253l = r14
            r7.f119254m = r9
            r7.f119255n = r0
            r7.f119256o = r10
            r7.f119257p = r12
            r7.f119258q = r6
            r1 = 0
            r7.f119259r = r1
            r7.f119260s = r1
            r1 = 3
            r7.f119265x = r1
            r4 = r13
            r5 = r15
            r6 = r11
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r8) goto L_0x0577
            return r8
        L_0x0577:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.m(android.content.Context, java.lang.String, android.content.ComponentName, Ba.i, dI.e):java.lang.Object");
    }

    private final Object n(Context context, String str, boolean z10, ComponentName componentName, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(C16311i0.c(), new c(this, z10, context, componentName, str, (C17164e<? super c>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final boolean o(C6385i iVar) {
        return C13669a.b(iVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: qv.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: qv.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: java.util.Iterator} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x020e A[EDGE_INSN: B:159:0x020e->B:82:0x020e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d5 A[SYNTHETIC, Splitter:B:64:0x01d5] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01fc A[SYNTHETIC, Splitter:B:75:0x01fc] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(android.content.Context r27, java.lang.String r28, android.content.ComponentName r29, dI.C17164e<? super XH.C16807N> r30) {
        /*
            r26 = this;
            r1 = r26
            r2 = r28
            r3 = r30
            boolean r0 = r3 instanceof com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.e
            if (r0 == 0) goto L_0x001a
            r0 = r3
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$e r0 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.e) r0
            int r4 = r0.f119300w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r0.f119300w = r4
        L_0x0018:
            r7 = r0
            goto L_0x0020
        L_0x001a:
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$e r0 = new com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver$e
            r0.<init>(r1, r3)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r7.f119298u
            java.lang.Object r8 = eI.C17187b.f()
            int r4 = r7.f119300w
            java.lang.String r5 = "|"
            java.lang.String r6 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r14 = 1
            r15 = 2
            r12 = 0
            if (r4 == 0) goto L_0x00ae
            if (r4 == r14) goto L_0x0068
            if (r4 != r15) goto L_0x0060
            java.lang.Object r2 = r7.f119288k
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119286i
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            java.lang.Object r2 = r7.f119285h
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.Object r2 = r7.f119284g
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r7.f119283f
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            java.lang.Object r2 = r7.f119282e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119281d
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r2 = r7.f119280c
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            XH.y.b(r0)
            goto L_0x03bb
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0068:
            java.lang.Object r2 = r7.f119291n
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r7.f119290m
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = r7.f119289l
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119288k
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.f119287j
            qv.e r2 = (qv.e) r2
            java.lang.Object r2 = r7.f119286i
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            java.lang.Object r2 = r7.f119285h
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r2 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r2
            java.lang.Object r2 = r7.f119284g
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r3 = r7.f119283f
            android.content.ComponentName r3 = (android.content.ComponentName) r3
            java.lang.Object r4 = r7.f119282e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r14 = r7.f119281d
            android.content.Context r14 = (android.content.Context) r14
            java.lang.Object r13 = r7.f119280c
            com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver r13 = (com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver) r13
            XH.y.b(r0)     // Catch:{ Exception -> 0x00a4 }
            r12 = r3
            r23 = r6
            r24 = r9
            r3 = r2
            r2 = r4
            goto L_0x01bc
        L_0x00a4:
            r0 = move-exception
            r12 = r3
            r23 = r6
            r24 = r9
            r3 = r2
            r2 = r4
            goto L_0x02bd
        L_0x00ae:
            XH.y.b(r0)
            qv.e r0 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00c4:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x00dc
            java.lang.Object r14 = r4.next()
            r15 = r14
            qv.b r15 = (qv.C11819b) r15
            boolean r15 = r15.b(r0, r12)
            if (r15 == 0) goto L_0x00da
            r13.add(r14)
        L_0x00da:
            r15 = 2
            goto L_0x00c4
        L_0x00dc:
            java.util.Iterator r4 = r13.iterator()
            r16 = r13
            r14 = 0
            r15 = 0
        L_0x00e4:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x0179
            java.lang.Object r22 = r4.next()
            r16 = r22
            qv.b r16 = (qv.C11819b) r16
            r12 = 0
            r23 = r6
            if (r14 != 0) goto L_0x010c
            java.lang.String r6 = "submitExternalPayment"
            java.lang.String r6 = qv.C11818a.a(r6, r12)
            if (r6 != 0) goto L_0x0107
            r25 = r8
            r24 = r9
            r6 = r22
            goto L_0x0181
        L_0x0107:
            java.lang.String r6 = qv.C11820c.a(r6)
            r14 = r6
        L_0x010c:
            if (r15 != 0) goto L_0x015c
            java.lang.Class<com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver> r6 = com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.class
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r25 = r8
            r24 = r9
            r9 = 0
            r12 = 2
            r15 = 36
            java.lang.String r8 = HJ.C15854t.s1(r6, r15, r9, r12, r9)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r9, r12, r9)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0130
            goto L_0x0134
        L_0x0130:
            java.lang.String r6 = HJ.C15854t.P0(r8, r11)
        L_0x0134:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r9 = 1
            boolean r8 = HJ.C15854t.b0(r8, r10, r9)
            if (r8 == 0) goto L_0x0146
            r8 = r24
            goto L_0x0148
        L_0x0146:
            r8 = r23
        L_0x0148:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r5)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r15 = r6
            goto L_0x0160
        L_0x015c:
            r25 = r8
            r24 = r9
        L_0x0160:
            r19 = 0
            r17 = r0
            r18 = r15
            r6 = 0
            r20 = r6
            r21 = r14
            r16.a(r17, r18, r19, r20, r21)
            r16 = r22
            r6 = r23
            r9 = r24
            r8 = r25
            r12 = 0
            goto L_0x00e4
        L_0x0179:
            r23 = r6
            r25 = r8
            r24 = r9
            r6 = r16
        L_0x0181:
            Nn.x r8 = r26.h()     // Catch:{ Exception -> 0x02b9 }
            r7.f119280c = r1     // Catch:{ Exception -> 0x02b9 }
            r9 = r27
            r7.f119281d = r9     // Catch:{ Exception -> 0x02b5 }
            r7.f119282e = r2     // Catch:{ Exception -> 0x02b5 }
            r12 = r29
            r7.f119283f = r12     // Catch:{ Exception -> 0x02ae }
            r7.f119284g = r3     // Catch:{ Exception -> 0x02ae }
            r7.f119285h = r1     // Catch:{ Exception -> 0x02ae }
            r7.f119286i = r1     // Catch:{ Exception -> 0x02ae }
            r7.f119287j = r0     // Catch:{ Exception -> 0x02ae }
            r7.f119288k = r14     // Catch:{ Exception -> 0x02ae }
            r7.f119289l = r15     // Catch:{ Exception -> 0x02ae }
            r7.f119290m = r13     // Catch:{ Exception -> 0x02ae }
            r7.f119291n = r4     // Catch:{ Exception -> 0x02ae }
            r7.f119292o = r6     // Catch:{ Exception -> 0x02ae }
            r4 = 0
            r7.f119293p = r4     // Catch:{ Exception -> 0x02ae }
            r7.f119294q = r4     // Catch:{ Exception -> 0x02ae }
            r7.f119295r = r4     // Catch:{ Exception -> 0x02ae }
            r7.f119296s = r4     // Catch:{ Exception -> 0x02ae }
            r7.f119297t = r4     // Catch:{ Exception -> 0x02ae }
            r4 = 1
            r7.f119300w = r4     // Catch:{ Exception -> 0x02ae }
            java.lang.Object r0 = r8.z(r2, r7)     // Catch:{ Exception -> 0x02ae }
            r8 = r25
            if (r0 != r8) goto L_0x01ba
            return r8
        L_0x01ba:
            r13 = r1
            r14 = r9
        L_0x01bc:
            qv.e r0 = qv.e.DEBUG     // Catch:{ Exception -> 0x02a8 }
            qv.d r4 = qv.d.f102012a     // Catch:{ Exception -> 0x02a8 }
            java.util.List r4 = r4.a()     // Catch:{ Exception -> 0x02a8 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ Exception -> 0x02a8 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x02a8 }
            r6.<init>()     // Catch:{ Exception -> 0x02a8 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x02a8 }
        L_0x01cf:
            boolean r9 = r4.hasNext()     // Catch:{ Exception -> 0x02a8 }
            if (r9 == 0) goto L_0x01ec
            java.lang.Object r9 = r4.next()     // Catch:{ Exception -> 0x01e9 }
            r15 = r9
            qv.b r15 = (qv.C11819b) r15     // Catch:{ Exception -> 0x01e9 }
            r1 = 0
            boolean r15 = r15.b(r0, r1)     // Catch:{ Exception -> 0x01e9 }
            if (r15 == 0) goto L_0x01e6
            r6.add(r9)     // Catch:{ Exception -> 0x01e9 }
        L_0x01e6:
            r1 = r26
            goto L_0x01cf
        L_0x01e9:
            r0 = move-exception
            goto L_0x02bd
        L_0x01ec:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ Exception -> 0x02a8 }
            r15 = r6
            r4 = 0
            r9 = 0
        L_0x01f3:
            boolean r16 = r1.hasNext()     // Catch:{ Exception -> 0x02a8 }
            r27 = r2
            r2 = 0
            if (r16 == 0) goto L_0x020e
            java.lang.Object r15 = r1.next()     // Catch:{ Exception -> 0x0279 }
            r16 = r15
            qv.b r16 = (qv.C11819b) r16     // Catch:{ Exception -> 0x0279 }
            if (r4 != 0) goto L_0x021f
            java.lang.String r4 = "submitExternalPayment successful"
            java.lang.String r4 = qv.C11818a.a(r4, r2)     // Catch:{ Exception -> 0x021a }
            if (r4 != 0) goto L_0x0215
        L_0x020e:
            r1 = r2
            r30 = r3
            r22 = r6
            goto L_0x029b
        L_0x0215:
            java.lang.String r4 = qv.C11820c.a(r4)     // Catch:{ Exception -> 0x021a }
            goto L_0x021f
        L_0x021a:
            r0 = move-exception
        L_0x021b:
            r2 = r27
            goto L_0x02bd
        L_0x021f:
            if (r9 != 0) goto L_0x027d
            java.lang.Class r9 = r13.getClass()     // Catch:{ Exception -> 0x0279 }
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x0279 }
            kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ Exception -> 0x0279 }
            r29 = r1
            r30 = r3
            r22 = r6
            r1 = 2
            r2 = 36
            r3 = 0
            java.lang.String r6 = HJ.C15854t.s1(r9, r2, r3, r1, r3)     // Catch:{ Exception -> 0x0273 }
            r2 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r2, r3, r1, r3)     // Catch:{ Exception -> 0x0273 }
            int r1 = r6.length()     // Catch:{ Exception -> 0x0273 }
            if (r1 != 0) goto L_0x0247
            goto L_0x024b
        L_0x0247:
            java.lang.String r9 = HJ.C15854t.P0(r6, r11)     // Catch:{ Exception -> 0x0273 }
        L_0x024b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0273 }
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x0273 }
            r2 = 1
            boolean r1 = HJ.C15854t.b0(r1, r10, r2)     // Catch:{ Exception -> 0x0273 }
            if (r1 == 0) goto L_0x025d
            r1 = r24
            goto L_0x025f
        L_0x025d:
            r1 = r23
        L_0x025f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0273 }
            r2.<init>()     // Catch:{ Exception -> 0x0273 }
            r2.append(r1)     // Catch:{ Exception -> 0x0273 }
            r2.append(r5)     // Catch:{ Exception -> 0x0273 }
            r2.append(r9)     // Catch:{ Exception -> 0x0273 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0273 }
            r9 = r1
            goto L_0x0283
        L_0x0273:
            r0 = move-exception
            r2 = r27
            r3 = r30
            goto L_0x02bd
        L_0x0279:
            r0 = move-exception
            r30 = r3
            goto L_0x021b
        L_0x027d:
            r29 = r1
            r30 = r3
            r22 = r6
        L_0x0283:
            r19 = 0
            r17 = r0
            r18 = r9
            r1 = 0
            r20 = r1
            r21 = r4
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0273 }
            r2 = r27
            r1 = r29
            r3 = r30
            r6 = r22
            goto L_0x01f3
        L_0x029b:
            r5 = r27
            r4 = r30
            r10 = r9
            r2 = r13
            r3 = r14
            r9 = r22
            r6 = 1
            r13 = 0
            goto L_0x038f
        L_0x02a8:
            r0 = move-exception
            r27 = r2
            r30 = r3
            goto L_0x02bd
        L_0x02ae:
            r0 = move-exception
        L_0x02af:
            r8 = r25
            r13 = r26
            r14 = r9
            goto L_0x02bd
        L_0x02b5:
            r0 = move-exception
        L_0x02b6:
            r12 = r29
            goto L_0x02af
        L_0x02b9:
            r0 = move-exception
            r9 = r27
            goto L_0x02b6
        L_0x02bd:
            qv.e r1 = qv.e.WARN
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x02d0:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x02ec
            java.lang.Object r9 = r4.next()
            r15 = r9
            qv.b r15 = (qv.C11819b) r15
            r27 = r2
            r2 = 0
            boolean r15 = r15.b(r1, r2)
            if (r15 == 0) goto L_0x02e9
            r6.add(r9)
        L_0x02e9:
            r2 = r27
            goto L_0x02d0
        L_0x02ec:
            r27 = r2
            java.util.Iterator r15 = r6.iterator()
            r2 = 0
            r9 = 0
        L_0x02f4:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x030c
            java.lang.Object r4 = r15.next()
            r16 = r4
            qv.b r16 = (qv.C11819b) r16
            if (r9 != 0) goto L_0x0317
            java.lang.String r4 = "Something went wrong in submitExternalPayment"
            java.lang.String r4 = qv.C11818a.a(r4, r0)
            if (r4 != 0) goto L_0x0312
        L_0x030c:
            r28 = r3
            r29 = r12
            goto L_0x0382
        L_0x0312:
            java.lang.String r4 = qv.C11820c.a(r4)
            r9 = r4
        L_0x0317:
            if (r2 != 0) goto L_0x0368
            java.lang.Class r2 = r13.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r28 = r3
            r29 = r12
            r3 = 0
            r4 = 36
            r6 = 2
            java.lang.String r12 = HJ.C15854t.s1(r2, r4, r3, r6, r3)
            r4 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r4, r3, r6, r3)
            int r6 = r12.length()
            if (r6 != 0) goto L_0x033d
            goto L_0x0341
        L_0x033d:
            java.lang.String r2 = HJ.C15854t.P0(r12, r11)
        L_0x0341:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r12 = 1
            boolean r6 = HJ.C15854t.b0(r6, r10, r12)
            if (r6 == 0) goto L_0x0353
            r6 = r24
            goto L_0x0355
        L_0x0353:
            r6 = r23
        L_0x0355:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x036f
        L_0x0368:
            r28 = r3
            r29 = r12
            r4 = 46
            r12 = 1
        L_0x036f:
            r19 = 0
            r17 = r1
            r18 = r2
            r20 = r0
            r21 = r9
            r16.a(r17, r18, r19, r20, r21)
            r3 = r28
            r12 = r29
            goto L_0x02f4
        L_0x0382:
            r5 = r27
            r4 = r28
            r12 = r29
            r1 = r0
            r10 = r9
            r0 = r13
            r3 = r14
            r6 = 0
            r9 = r2
            r2 = r0
        L_0x038f:
            r7.f119280c = r2
            r7.f119281d = r3
            r7.f119282e = r5
            r7.f119283f = r12
            r7.f119284g = r4
            r7.f119285h = r1
            r7.f119286i = r13
            r7.f119287j = r0
            r7.f119288k = r10
            r7.f119289l = r9
            r7.f119290m = r15
            r7.f119293p = r6
            r7.f119294q = r6
            r1 = 0
            r7.f119295r = r1
            r7.f119296s = r1
            r1 = 2
            r7.f119300w = r1
            r4 = r5
            r5 = r6
            r6 = r12
            java.lang.Object r0 = r2.n(r3, r4, r5, r6, r7)
            if (r0 != r8) goto L_0x03bb
            return r8
        L_0x03bb:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver.p(android.content.Context, java.lang.String, android.content.ComponentName, dI.e):java.lang.Object");
    }

    public final C13323a g() {
        C13323a aVar = this.f119231d;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("aciNavigation");
        return null;
    }

    public final x h() {
        x xVar = this.f119230c;
        if (xVar != null) {
            return xVar;
        }
        C17542s.z("checkoutRepository");
        return null;
    }

    public final C13211a i() {
        C13211a aVar = this.f119233f;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("paymentAnalytics");
        return null;
    }

    public final C13213c j() {
        C13213c cVar = this.f119232e;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("paymentDevAnalytics");
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Class<AciBroadcastReceiver> cls;
        String str2;
        char c10;
        Iterator it;
        String str3;
        Iterator it2;
        Intent intent2 = intent;
        super.onReceive(context, intent);
        C17542s.j(context, "context");
        C17542s.j(intent2, "intent");
        String action = intent.getAction();
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        String str4 = null;
        String str5 = null;
        while (true) {
            boolean hasNext = it3.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            cls = AciBroadcastReceiver.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it3.next();
            if (str4 == null) {
                String a10 = C11818a.a("onReceive, action: " + action, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            }
            String str6 = str4;
            if (str5 == null) {
                String name = cls.getName();
                C17542s.g(name);
                it2 = it3;
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str5 = str + DslKt.INDICATOR_SEPARATOR + name;
            } else {
                it2 = it3;
            }
            String str7 = str5;
            bVar.a(eVar, str7, false, (Throwable) null, str6);
            str5 = str7;
            str4 = str6;
            it3 = it2;
        }
        j().c();
        if (C17542s.e(CheckoutActivity.ACTION_ON_BEFORE_SUBMIT, action)) {
            String stringExtra = intent2.getStringExtra(CheckoutActivity.EXTRA_PAYMENT_BRAND);
            String stringExtra2 = intent2.getStringExtra(CheckoutActivity.EXTRA_CHECKOUT_ID);
            C6385i iVar = (C6385i) intent2.getParcelableExtra(CheckoutActivity.EXTRA_GOOGLE_PAY_PAYMENT_DATA);
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, true)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it4 = arrayList2.iterator();
            String str8 = null;
            String str9 = null;
            while (it4.hasNext()) {
                C11819b bVar2 = (C11819b) it4.next();
                if (str9 == null) {
                    String a11 = C11818a.a("Action before submit payment, paymentBrand: " + stringExtra + ", checkoutId: " + stringExtra2, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str9 = C11820c.a(a11);
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str3 = stringExtra;
                    it = it4;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str3 = stringExtra;
                    it = it4;
                }
                bVar2.a(eVar2, str8, true, (Throwable) null, str9);
                stringExtra = str3;
                it4 = it;
            }
            ComponentName componentName = (ComponentName) intent2.getParcelableExtra(CheckoutActivity.EXTRA_SENDER_COMPONENT_NAME);
            if (stringExtra2 == null || componentName == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Invalid intent received");
                qv.e eVar3 = qv.e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str10 = null;
                String str11 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str11 == null) {
                        String a12 = C11818a.a((String) null, illegalStateException);
                        if (a12 != null) {
                            str2 = C11820c.a(a12);
                        } else {
                            return;
                        }
                    } else {
                        str2 = str11;
                    }
                    if (str10 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        c10 = '$';
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                    } else {
                        c10 = '$';
                    }
                    String str12 = str10;
                    char c11 = c10;
                    bVar3.a(eVar3, str12, false, illegalStateException, str2);
                    str10 = str12;
                    str11 = str2;
                }
                return;
            }
            b.b(this, C16342y0.f137687a, new d(this, iVar, context, stringExtra2, componentName, (C17164e<? super d>) null));
            return;
        }
    }
}
