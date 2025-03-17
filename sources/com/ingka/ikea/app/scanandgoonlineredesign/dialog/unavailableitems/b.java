package com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems;

import FB.C12860a;
import HJ.C15854t;
import IC.C13023e;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Ry.h;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.C15015h;
import rz.C15016i;
import rz.I;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0003>?@B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H@¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001f\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u000204088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LRy/h;", "scanAndGoProductRepository", "LXi/a;", "addProductToOnlineCartUseCase", "LFB/a;", "localStoreSelectionRepository", "<init>", "(Landroidx/lifecycle/U;LRy/h;LXi/a;LFB/a;)V", "", "itemNo", "itemType", "productName", "", "priceInclVat", "", "quantity", "LXH/N;", "F", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V", "E", "(LdI/e;)Ljava/lang/Object;", "Lrz/I;", "", "Lrz/h;", "G", "(Lrz/I;)Ljava/util/List;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$c;", "uiAction", "D", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$c;)V", "m", "LRy/h;", "n", "LXi/a;", "o", "LFB/a;", "LTJ/B;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;", "p", "LTJ/B;", "_state", "LTJ/P;", "q", "LTJ/P;", "getState", "()LTJ/P;", "state", "LTJ/A;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b;", "r", "LTJ/A;", "_sideEffect", "LTJ/g;", "s", "LTJ/g;", "C", "()LTJ/g;", "sideEffect", "d", "c", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final h f91448m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Xi.a f91449n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C12860a f91450o;

    /* renamed from: p  reason: collision with root package name */
    private final C16505B<d> f91451p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<d> f91452q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16504A<C2008b> f91453r;

    /* renamed from: s  reason: collision with root package name */
    private final C16532g<C2008b> f91454s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsViewModel$1", f = "UnavailableChildItemsViewModel.kt", l = {62}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91455c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f91456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f91456d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f91456d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91455c;
            if (i10 == 0) {
                y.b(obj);
                b bVar = this.f91456d;
                this.f91455c = 1;
                if (bVar.E(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b;", "", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b  reason: collision with other inner class name */
    public static abstract class C2008b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b$a */
        public static final class a extends C2008b {

            /* renamed from: b  reason: collision with root package name */
            public static final int f91457b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f91458a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "message");
                this.f91458a = eVar;
            }

            public final C13023e a() {
                return this.f91458a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f91458a, ((a) obj).f91458a);
            }

            public int hashCode() {
                return this.f91458a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f91458a;
                return "AddToOnlineCartFailure(message=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b$b  reason: collision with other inner class name */
        public static final class C2009b extends C2008b {

            /* renamed from: b  reason: collision with root package name */
            public static final int f91459b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f91460a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2009b(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "message");
                this.f91460a = eVar;
            }

            public final C13023e a() {
                return this.f91460a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2009b) && C17542s.e(this.f91460a, ((C2009b) obj).f91460a);
            }

            public int hashCode() {
                return this.f91460a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f91460a;
                return "AddToOnlineCartSuccess(message=" + eVar + ")";
            }
        }

        public /* synthetic */ C2008b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2008b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$c;", "", "<init>", "()V", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$c$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$c$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$c;", "", "itemNo", "itemType", "productName", "", "priceInclVat", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "D", "()D", "e", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f91461a;

            /* renamed from: b  reason: collision with root package name */
            private final String f91462b;

            /* renamed from: c  reason: collision with root package name */
            private final String f91463c;

            /* renamed from: d  reason: collision with root package name */
            private final double f91464d;

            /* renamed from: e  reason: collision with root package name */
            private final int f91465e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String str3, double d10, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "itemNo");
                C17542s.j(str2, "itemType");
                C17542s.j(str3, "productName");
                this.f91461a = str;
                this.f91462b = str2;
                this.f91463c = str3;
                this.f91464d = d10;
                this.f91465e = i10;
            }

            public final String a() {
                return this.f91461a;
            }

            public final String b() {
                return this.f91462b;
            }

            public final double c() {
                return this.f91464d;
            }

            public final String d() {
                return this.f91463c;
            }

            public final int e() {
                return this.f91465e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f91461a, aVar.f91461a) && C17542s.e(this.f91462b, aVar.f91462b) && C17542s.e(this.f91463c, aVar.f91463c) && Double.compare(this.f91464d, aVar.f91464d) == 0 && this.f91465e == aVar.f91465e;
            }

            public int hashCode() {
                return (((((((this.f91461a.hashCode() * 31) + this.f91462b.hashCode()) * 31) + this.f91463c.hashCode()) * 31) + Double.hashCode(this.f91464d)) * 31) + Integer.hashCode(this.f91465e);
            }

            public String toString() {
                String str = this.f91461a;
                String str2 = this.f91462b;
                String str3 = this.f91463c;
                double d10 = this.f91464d;
                int i10 = this.f91465e;
                return "AddProductToOnlineCart(itemNo=" + str + ", itemType=" + str2 + ", productName=" + str3 + ", priceInclVat=" + d10 + ", quantity=" + i10 + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;", "", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "entryPoint", "", "barcode", "", "Lrz/h;", "unavailableEntries", "<init>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;Ljava/lang/String;Ljava/util/List;)V", "a", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;Ljava/lang/String;Ljava/util/List;)Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "d", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/f$l$a;", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final a f91466d = new a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f91467e = 8;

        /* renamed from: a  reason: collision with root package name */
        private final f.l.a f91468a;

        /* renamed from: b  reason: collision with root package name */
        private final String f91469b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C15015h> f91470c;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;", "a", "(Landroidx/lifecycle/U;)Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(U u10) {
                C17542s.j(u10, "savedStateHandle");
                String str = (String) u10.f("entryPoint");
                T t10 = null;
                if (str != null) {
                    Iterator<T> it = f.l.a.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C17542s.e(((f.l.a) next).name(), str)) {
                            t10 = next;
                            break;
                        }
                    }
                    t10 = (f.l.a) t10;
                }
                if (t10 != null) {
                    Object f10 = u10.f("barcode");
                    if (f10 != null) {
                        return new d(t10, (String) f10, C16877v.n());
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }

            private a() {
            }
        }

        public d(f.l.a aVar, String str, List<C15015h> list) {
            C17542s.j(aVar, "entryPoint");
            C17542s.j(str, "barcode");
            C17542s.j(list, "unavailableEntries");
            this.f91468a = aVar;
            this.f91469b = str;
            this.f91470c = list;
        }

        public static /* synthetic */ d b(d dVar, f.l.a aVar, String str, List<C15015h> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = dVar.f91468a;
            }
            if ((i10 & 2) != 0) {
                str = dVar.f91469b;
            }
            if ((i10 & 4) != 0) {
                list = dVar.f91470c;
            }
            return dVar.a(aVar, str, list);
        }

        public final d a(f.l.a aVar, String str, List<C15015h> list) {
            C17542s.j(aVar, "entryPoint");
            C17542s.j(str, "barcode");
            C17542s.j(list, "unavailableEntries");
            return new d(aVar, str, list);
        }

        public final String c() {
            return this.f91469b;
        }

        public final f.l.a d() {
            return this.f91468a;
        }

        public final List<C15015h> e() {
            return this.f91470c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f91468a == dVar.f91468a && C17542s.e(this.f91469b, dVar.f91469b) && C17542s.e(this.f91470c, dVar.f91470c);
        }

        public int hashCode() {
            return (((this.f91468a.hashCode() * 31) + this.f91469b.hashCode()) * 31) + this.f91470c.hashCode();
        }

        public String toString() {
            f.l.a aVar = this.f91468a;
            String str = this.f91469b;
            List<C15015h> list = this.f91470c;
            return "UnavailableChildItemsViewModelState(entryPoint=" + aVar + ", barcode=" + str + ", unavailableEntries=" + list + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsViewModel", f = "UnavailableChildItemsViewModel.kt", l = {130}, m = "loadUnavailableItems")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f91471c;

        /* renamed from: d  reason: collision with root package name */
        Object f91472d;

        /* renamed from: e  reason: collision with root package name */
        Object f91473e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f91474f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f91475g;

        /* renamed from: h  reason: collision with root package name */
        int f91476h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f91475g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91474f = obj;
            this.f91476h |= Integer.MIN_VALUE;
            return this.f91475g.E(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsViewModel$onAddProductToOnlineCart$1", f = "UnavailableChildItemsViewModel.kt", l = {88, 90, 123}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91477c;

        /* renamed from: d  reason: collision with root package name */
        Object f91478d;

        /* renamed from: e  reason: collision with root package name */
        Object f91479e;

        /* renamed from: f  reason: collision with root package name */
        Object f91480f;

        /* renamed from: g  reason: collision with root package name */
        Object f91481g;

        /* renamed from: h  reason: collision with root package name */
        Object f91482h;

        /* renamed from: i  reason: collision with root package name */
        int f91483i;

        /* renamed from: j  reason: collision with root package name */
        int f91484j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f91485k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f91486l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f91487m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f91488n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ double f91489o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f91490p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ String f91491q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, String str, String str2, double d10, int i10, String str3, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f91486l = bVar;
            this.f91487m = str;
            this.f91488n = str2;
            this.f91489o = d10;
            this.f91490p = i10;
            this.f91491q = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f91486l, this.f91487m, this.f91488n, this.f91489o, this.f91490p, this.f91491q, eVar);
            fVar.f91485k = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0196  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r11 = r21
                java.lang.Object r12 = eI.C17187b.f()
                int r0 = r11.f91484j
                r13 = 3
                r14 = 1
                r15 = 2
                if (r0 == 0) goto L_0x0053
                if (r0 == r14) goto L_0x0048
                if (r0 == r15) goto L_0x0034
                if (r0 != r13) goto L_0x002c
                java.lang.Object r0 = r11.f91481g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r11.f91480f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r11.f91478d
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b r0 = (com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.C2008b) r0
                java.lang.Object r0 = r11.f91477c
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r11.f91485k
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r22)
                goto L_0x01b5
            L_0x002c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0034:
                java.lang.Object r0 = r11.f91477c
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r11.f91485k
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r22)
                r2 = r22
                XH.x r2 = (XH.x) r2
                java.lang.Object r2 = r2.j()
                goto L_0x00a2
            L_0x0048:
                java.lang.Object r0 = r11.f91485k
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r22)
                r1 = r22
            L_0x0051:
                r10 = r0
                goto L_0x0073
            L_0x0053:
                XH.y.b(r22)
                java.lang.Object r0 = r11.f91485k
                QJ.Q r0 = (QJ.Q) r0
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b r1 = r11.f91486l
                FB.a r1 = r1.f91450o
                TJ.g r1 = r1.b()
                TJ.g r1 = TJ.C16534i.A(r1)
                r11.f91485k = r0
                r11.f91484j = r14
                java.lang.Object r1 = TJ.C16534i.B(r1, r11)
                if (r1 != r12) goto L_0x0051
                return r12
            L_0x0073:
                EB.d r1 = (EB.C12832d) r1
                java.lang.String r9 = r1.e()
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b r0 = r11.f91486l
                Xi.a r0 = r0.f91449n
                java.lang.String r2 = r11.f91487m
                java.lang.String r3 = r11.f91488n
                double r4 = r11.f91489o
                int r6 = r11.f91490p
                com.ingka.ikea.analytics.Interaction$Component r7 = com.ingka.ikea.analytics.Interaction$Component.SHOP_AND_GO_ADD_TO_ONLINE_CART_BUTTON
                r11.f91485k = r10
                r11.f91477c = r9
                r11.f91484j = r15
                r1 = 0
                r8 = 0
                r16 = r9
                r17 = r10
                r10 = r21
                java.lang.Object r2 = r0.a(r1, r2, r3, r4, r6, r7, r8, r9, r10)
                if (r2 != r12) goto L_0x009e
                return r12
            L_0x009e:
                r0 = r16
                r1 = r17
            L_0x00a2:
                java.lang.String r3 = r11.f91491q
                java.lang.Throwable r10 = XH.x.e(r2)
                r9 = 0
                if (r10 != 0) goto L_0x00c0
                r10 = r2
                XH.N r10 = (XH.C16807N) r10
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b$b r4 = new com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b$b
                int r5 = Ez.f.f109677Q
                java.util.List r6 = YH.C16877v.e(r3)
                IC.e r5 = IC.C13026h.f(r5, r6)
                r4.<init>(r5)
            L_0x00bd:
                r14 = r9
                goto L_0x0194
            L_0x00c0:
                boolean r4 = r10 instanceof Xi.a.C1906a.C1907a
                if (r4 == 0) goto L_0x00d4
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b$a r4 = new com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$b$a
                int r5 = Oo.b.f84497S
                java.util.List r6 = YH.C16877v.e(r3)
                IC.e r5 = IC.C13026h.f(r5, r6)
                r4.<init>(r5)
                goto L_0x00bd
            L_0x00d4:
                qv.e r8 = qv.e.ERROR
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x00e7:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x00fe
                java.lang.Object r6 = r4.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r8, r9)
                if (r7 == 0) goto L_0x00e7
                r5.add(r6)
                goto L_0x00e7
            L_0x00fe:
                java.util.Iterator r16 = r5.iterator()
                r7 = 0
                r4 = r7
                r5 = r4
            L_0x0105:
                boolean r6 = r16.hasNext()
                if (r6 == 0) goto L_0x0119
                java.lang.Object r6 = r16.next()
                qv.b r6 = (qv.C11819b) r6
                if (r4 != 0) goto L_0x0122
                java.lang.String r4 = qv.C11818a.a(r7, r10)
                if (r4 != 0) goto L_0x011e
            L_0x0119:
                r19 = r7
                r14 = r9
                goto L_0x0192
            L_0x011e:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x0122:
                r17 = r4
                if (r5 != 0) goto L_0x0173
                java.lang.Class r4 = r1.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r7, r15, r7)
                r9 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r9, r7, r15, r7)
                int r9 = r5.length()
                if (r9 != 0) goto L_0x0144
                goto L_0x014a
            L_0x0144:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x014a:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r9 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r9, r14)
                if (r5 == 0) goto L_0x015d
                java.lang.String r5 = "m"
                goto L_0x015f
            L_0x015d:
                java.lang.String r5 = "b"
            L_0x015f:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r5)
                java.lang.String r5 = "|"
                r9.append(r5)
                r9.append(r4)
                java.lang.String r5 = r9.toString()
            L_0x0173:
                r18 = r5
                r9 = 0
                r4 = r6
                r5 = r8
                r6 = r18
                r19 = r7
                r7 = r9
                r20 = r8
                r8 = r10
                r14 = 0
                r9 = r17
                r4.a(r5, r6, r7, r8, r9)
                r9 = r14
                r4 = r17
                r5 = r18
                r7 = r19
                r8 = r20
                r14 = 1
                goto L_0x0105
            L_0x0192:
                r4 = r19
            L_0x0194:
                if (r4 == 0) goto L_0x01b5
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b r5 = r11.f91486l
                TJ.A r5 = r5.f91453r
                r11.f91485k = r1
                r11.f91477c = r0
                r11.f91478d = r4
                r11.f91479e = r2
                r11.f91480f = r3
                r11.f91481g = r3
                r11.f91482h = r10
                r11.f91483i = r14
                r11.f91484j = r13
                java.lang.Object r0 = r5.emit(r4, r11)
                if (r0 != r12) goto L_0x01b5
                return r12
            L_0x01b5:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$g", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f91492a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(N.a aVar, b bVar) {
            super(aVar);
            this.f91492a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            b bVar = this.f91492a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("UnavailableChildItemsViewModel - failed to load unavailable items", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public b(U u10, h hVar, Xi.a aVar, C12860a aVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(hVar, "scanAndGoProductRepository");
        C17542s.j(aVar, "addProductToOnlineCartUseCase");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        this.f91448m = hVar;
        this.f91449n = aVar;
        this.f91450o = aVar2;
        C16505B<d> a10 = C16521S.a(d.f91466d.a(u10));
        this.f91451p = a10;
        this.f91452q = C16534i.c(a10);
        C16504A<C2008b> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f91453r = b10;
        this.f91454s = C16534i.b(b10);
        F0 unused = C16314k.d(g0.a(this), new g(N.f137593c0, this), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E(dI.C17164e<? super XH.C16807N> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$e r0 = (com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.e) r0
            int r1 = r0.f91476h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91476h = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$e r0 = new com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$e
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f91474f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f91476h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r10 = r0.f91473e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f91472d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f91471c
            com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b r10 = (com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b) r10
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x0067
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0043:
            XH.y.b(r1)
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$d> r1 = r9.f91451p
            java.lang.Object r1 = r1.getValue()
            kotlin.jvm.internal.C17542s.g(r1)
            com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$d r1 = (com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.d) r1
            java.lang.String r1 = r1.c()
            Ry.h r3 = r9.f91448m
            r0.f91471c = r9
            r0.f91472d = r10
            r0.f91473e = r1
            r0.f91476h = r4
            java.lang.Object r0 = r3.d(r1, r0)
            if (r0 != r2) goto L_0x0066
            return r2
        L_0x0066:
            r10 = r9
        L_0x0067:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x0074
            rz.I r0 = (rz.I) r0
            java.util.List r0 = r10.G(r0)
            goto L_0x0078
        L_0x0074:
            java.util.List r0 = YH.C16877v.n()
        L_0x0078:
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$d> r7 = r10.f91451p
        L_0x007a:
            java.lang.Object r8 = r7.getValue()
            r1 = r8
            com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$d r1 = (com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.d) r1
            TJ.B<com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$d> r1 = r10.f91451p
            java.lang.Object r1 = r1.getValue()
            com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$d r1 = (com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.d) r1
            if (r1 == 0) goto L_0x0095
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = r0
            com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b$d r1 = com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.d.b(r1, r2, r3, r4, r5, r6)
            goto L_0x0096
        L_0x0095:
            r1 = 0
        L_0x0096:
            boolean r1 = r7.e(r8, r1)
            if (r1 == 0) goto L_0x007a
            XH.N r10 = XH.C16807N.f139792a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b.E(dI.e):java.lang.Object");
    }

    private final void F(String str, String str2, String str3, double d10, int i10) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new f(this, str, str2, d10, i10, str3, (C17164e<? super f>) null), 3, (Object) null);
    }

    private final List<C15015h> G(I i10) {
        C15016i d10 = i10 != null ? i10.d() : null;
        return d10 instanceof C15016i.a ? ((C15016i.a) d10).b() : C16877v.n();
    }

    public final C16532g<C2008b> C() {
        return this.f91454s;
    }

    public final void D(c cVar) {
        C17542s.j(cVar, "uiAction");
        if (cVar instanceof c.a) {
            c.a aVar = (c.a) cVar;
            F(aVar.a(), aVar.b(), aVar.d(), aVar.c(), aVar.e());
            return;
        }
        throw new t();
    }

    public final C16519P<d> getState() {
        return this.f91452q;
    }
}
