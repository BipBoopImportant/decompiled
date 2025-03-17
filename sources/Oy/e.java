package Oy;

import HJ.C15854t;
import IC.C13023e;
import Ny.h;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Sy.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.r;
import com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.D;
import tz.C15100a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u000356\u001dB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020(0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001f\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"LOy/e;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/h;", "LRy/g;", "repository", "LNy/h;", "deleteCouponUseCase", "Ltz/a;", "getProfileStateUseCase", "LSy/a;", "analytics", "<init>", "(LRy/g;LNy/h;Ltz/a;LSy/a;)V", "LOy/e$b$d;", "action", "LXH/N;", "G", "(LOy/e$b$d;)V", "F", "()V", "H", "LOy/e$a;", "E", "(LOy/e$a;)V", "LOy/e$b;", "D", "(LOy/e$b;)V", "Landroidx/lifecycle/y;", "owner", "c", "(Landroidx/lifecycle/y;)V", "m", "LRy/g;", "n", "LNy/h;", "o", "Ltz/a;", "p", "LSy/a;", "LTJ/B;", "LOy/e$c;", "q", "LTJ/B;", "_uiState", "LTJ/P;", "r", "LTJ/P;", "()LTJ/P;", "uiState", "LQJ/N;", "s", "LQJ/N;", "coroutineExceptionHandler", "b", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends f0 implements C5205h {

    /* renamed from: m  reason: collision with root package name */
    private final Ry.g f113635m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final h f113636n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C15100a f113637o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Sy.a f113638p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<c> f113639q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<c> f113640r;

    /* renamed from: s  reason: collision with root package name */
    private final N f113641s = new g(N.f137593c0, this);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LOy/e$a;", "", "a", "LOy/e$a$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOy/e$a$a;", "LOy/e$a;", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "result", "<init>", "(Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "()Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oy.e$a$a  reason: collision with other inner class name */
        public static final class C2789a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final DeleteCouponBottomSheet.Companion.FragmentResult f113642a;

            public C2789a(DeleteCouponBottomSheet.Companion.FragmentResult fragmentResult) {
                C17542s.j(fragmentResult, "result");
                this.f113642a = fragmentResult;
            }

            public final DeleteCouponBottomSheet.Companion.FragmentResult a() {
                return this.f113642a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2789a) && C17542s.e(this.f113642a, ((C2789a) obj).f113642a);
            }

            public int hashCode() {
                return this.f113642a.hashCode();
            }

            public String toString() {
                DeleteCouponBottomSheet.Companion.FragmentResult fragmentResult = this.f113642a;
                return "OnDismiss(result=" + fragmentResult + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LOy/e$b;", "", "d", "a", "b", "c", "LOy/e$b$a;", "LOy/e$b$b;", "LOy/e$b$c;", "LOy/e$b$d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOy/e$b$a;", "LOy/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f113643a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1365300513;
            }

            public String toString() {
                return "OnAddClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOy/e$b$b;", "LOy/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oy.e$b$b  reason: collision with other inner class name */
        public static final class C2790b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2790b f113644a = new C2790b();

            private C2790b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2790b);
            }

            public int hashCode() {
                return -1365679662;
            }

            public String toString() {
                return "OnErrorDisplayed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOy/e$b$c;", "LOy/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f113645a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1450749786;
            }

            public String toString() {
                return "OnNavigated";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOy/e$b$d;", "LOy/e$b;", "Lrz/D;", "coupon", "<init>", "(Lrz/D;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/D;", "()Lrz/D;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            private final D f113646a;

            public d(D d10) {
                C17542s.j(d10, "coupon");
                this.f113646a = d10;
            }

            public final D a() {
                return this.f113646a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f113646a, ((d) obj).f113646a);
            }

            public int hashCode() {
                return this.f113646a.hashCode();
            }

            public String toString() {
                D d10 = this.f113646a;
                return "OnRemoveClicked(coupon=" + d10 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0017B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LOy/e$c;", "", "", "Lrz/D;", "coupons", "LIC/e;", "error", "LOy/e$a;", "navigateTo", "<init>", "(Ljava/util/List;LIC/e;LOy/e$a;)V", "b", "(Ljava/util/List;LIC/e;LOy/e$a;)LOy/e$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "LIC/e;", "e", "()LIC/e;", "c", "LOy/e$a;", "f", "()LOy/e$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f113647d = new a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f113648e = 8;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final c f113649f = new c((List) null, (C13023e) null, (a) null, 7, (DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final List<D> f113650a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f113651b;

        /* renamed from: c  reason: collision with root package name */
        private final a f113652c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LOy/e$c$a;", "", "<init>", "()V", "LOy/e$c;", "empty", "LOy/e$c;", "a", "()LOy/e$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f113649f;
            }

            private a() {
            }
        }

        public c() {
            this((List) null, (C13023e) null, (a) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ c c(c cVar, List<D> list, C13023e eVar, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = cVar.f113650a;
            }
            if ((i10 & 2) != 0) {
                eVar = cVar.f113651b;
            }
            if ((i10 & 4) != 0) {
                aVar = cVar.f113652c;
            }
            return cVar.b(list, eVar, aVar);
        }

        public final c b(List<D> list, C13023e eVar, a aVar) {
            C17542s.j(list, "coupons");
            return new c(list, eVar, aVar);
        }

        public final List<D> d() {
            return this.f113650a;
        }

        public final C13023e e() {
            return this.f113651b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f113650a, cVar.f113650a) && C17542s.e(this.f113651b, cVar.f113651b) && C17542s.e(this.f113652c, cVar.f113652c);
        }

        public final a f() {
            return this.f113652c;
        }

        public int hashCode() {
            int hashCode = this.f113650a.hashCode() * 31;
            C13023e eVar = this.f113651b;
            int i10 = 0;
            int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            a aVar = this.f113652c;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            List<D> list = this.f113650a;
            C13023e eVar = this.f113651b;
            a aVar = this.f113652c;
            return "UiState(coupons=" + list + ", error=" + eVar + ", navigateTo=" + aVar + ")";
        }

        public c(List<D> list, C13023e eVar, a aVar) {
            C17542s.j(list, "coupons");
            this.f113650a = list;
            this.f113651b = eVar;
            this.f113652c = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(List list, C13023e eVar, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LTJ/h;", "", "Lrz/D;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.DeleteCouponBottomSheetViewModel$onCreate$1", f = "DeleteCouponBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements q<C16533h<? super List<? extends D>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113653c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f113654d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f113655e;

        d(C17164e<? super d> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super List<D>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar);
            dVar.f113654d = hVar;
            dVar.f113655e = th2;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f113653c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f113654d;
                Throwable th2 = (Throwable) this.f113655e;
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, th2);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = hVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, th2, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lrz/D;", "coupons", "LXH/N;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.DeleteCouponBottomSheetViewModel$onCreate$2", f = "DeleteCouponBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Oy.e$e  reason: collision with other inner class name */
    static final class C2791e extends l implements p<List<? extends D>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113656c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f113657d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f113658e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2791e(e eVar, C17164e<? super C2791e> eVar2) {
            super(2, eVar2);
            this.f113658e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2791e eVar2 = new C2791e(this.f113658e, eVar);
            eVar2.f113657d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(List<D> list, C17164e<? super C16807N> eVar) {
            return ((C2791e) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            c cVar;
            ArrayList arrayList;
            C17187b.f();
            if (this.f113656c == 0) {
                y.b(obj);
                List list = (List) this.f113657d;
                C16505B k10 = this.f113658e.f113639q;
                do {
                    value = k10.getValue();
                    cVar = (c) value;
                    arrayList = new ArrayList();
                    for (Object next : list) {
                        D d10 = (D) next;
                        if (d10.c() && d10.b() == null) {
                            arrayList.add(next);
                        }
                    }
                } while (!k10.e(value, c.c(cVar, arrayList, (C13023e) null, (a) null, 6, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.viewmodel.DeleteCouponBottomSheetViewModel$onDeleteClicked$1", f = "DeleteCouponBottomSheetViewModel.kt", l = {82, 80}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f113659c;

        /* renamed from: d  reason: collision with root package name */
        Object f113660d;

        /* renamed from: e  reason: collision with root package name */
        Object f113661e;

        /* renamed from: f  reason: collision with root package name */
        int f113662f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f113663g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f113664h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b.d f113665i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, b.d dVar, C17164e<? super f> eVar2) {
            super(2, eVar2);
            this.f113664h = eVar;
            this.f113665i = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f113664h, this.f113665i, eVar);
            fVar.f113663g = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f113662f
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L_0x0047
                if (r2 == r3) goto L_0x0030
                if (r2 != r4) goto L_0x0028
                java.lang.Object r1 = r0.f113660d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f113659c
                Ny.h r1 = (Ny.h) r1
                java.lang.Object r1 = r0.f113663g
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r19)
                r2 = r19
                XH.x r2 = (XH.x) r2
                java.lang.Object r2 = r2.j()
                goto L_0x008d
            L_0x0028:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0030:
                java.lang.Object r2 = r0.f113660d
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r5 = r0.f113659c
                Ny.h r5 = (Ny.h) r5
                java.lang.Object r6 = r0.f113663g
                QJ.Q r6 = (QJ.Q) r6
                XH.y.b(r19)
                r7 = r19
                r17 = r6
                r6 = r2
                r2 = r17
                goto L_0x0073
            L_0x0047:
                XH.y.b(r19)
                java.lang.Object r2 = r0.f113663g
                QJ.Q r2 = (QJ.Q) r2
                Oy.e r5 = r0.f113664h
                Ny.h r5 = r5.f113636n
                Oy.e$b$d r6 = r0.f113665i
                rz.D r6 = r6.a()
                java.lang.String r6 = r6.a()
                Oy.e r7 = r0.f113664h
                tz.a r7 = r7.f113637o
                r0.f113663g = r2
                r0.f113659c = r5
                r0.f113660d = r6
                r0.f113662f = r3
                java.lang.Object r7 = r7.a(r0)
                if (r7 != r1) goto L_0x0073
                return r1
            L_0x0073:
                r8 = r7
                rz.K r8 = (rz.K) r8
                java.lang.String r8 = r8.a()
                r0.f113663g = r2
                r0.f113659c = r5
                r0.f113660d = r6
                r0.f113661e = r7
                r0.f113662f = r4
                java.lang.Object r5 = r5.a(r6, r8, r0)
                if (r5 != r1) goto L_0x008b
                return r1
            L_0x008b:
                r1 = r2
                r2 = r5
            L_0x008d:
                Oy.e r5 = r0.f113664h
                Oy.e$b$d r6 = r0.f113665i
                boolean r7 = XH.x.h(r2)
                if (r7 == 0) goto L_0x00b3
                r7 = r2
                XH.N r7 = (XH.C16807N) r7
                Sy.a r7 = r5.f113638p
                rz.D r6 = r6.a()
                java.lang.String r6 = r6.a()
                r7.m(r6)
                Oy.e$a$a r6 = new Oy.e$a$a
                com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet$Companion$FragmentResult$b r7 = com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet.Companion.FragmentResult.b.f119867a
                r6.<init>(r7)
                r5.E(r6)
            L_0x00b3:
                Oy.e r5 = r0.f113664h
                java.lang.Throwable r2 = XH.x.e(r2)
                if (r2 == 0) goto L_0x0186
                qv.e r12 = qv.e.DEBUG
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x00ce:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00e6
                java.lang.Object r8 = r6.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                r10 = 0
                boolean r9 = r9.b(r12, r10)
                if (r9 == 0) goto L_0x00ce
                r7.add(r8)
                goto L_0x00ce
            L_0x00e6:
                java.util.Iterator r13 = r7.iterator()
                r14 = 0
                r6 = r14
                r7 = r6
            L_0x00ed:
                boolean r8 = r13.hasNext()
                if (r8 == 0) goto L_0x0166
                java.lang.Object r8 = r13.next()
                qv.b r8 = (qv.C11819b) r8
                if (r6 != 0) goto L_0x0106
                java.lang.String r6 = qv.C11818a.a(r14, r2)
                if (r6 != 0) goto L_0x0102
                goto L_0x0166
            L_0x0102:
                java.lang.String r6 = qv.C11820c.a(r6)
            L_0x0106:
                r15 = r6
                if (r7 != 0) goto L_0x0156
                java.lang.Class r6 = r1.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r7 = 36
                java.lang.String r7 = HJ.C15854t.s1(r6, r7, r14, r4, r14)
                r9 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r9, r14, r4, r14)
                int r9 = r7.length()
                if (r9 != 0) goto L_0x0127
                goto L_0x012d
            L_0x0127:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r7, r6)
            L_0x012d:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                java.lang.String r9 = "main"
                boolean r7 = HJ.C15854t.b0(r7, r9, r3)
                if (r7 == 0) goto L_0x0140
                java.lang.String r7 = "m"
                goto L_0x0142
            L_0x0140:
                java.lang.String r7 = "b"
            L_0x0142:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = "|"
                r9.append(r7)
                r9.append(r6)
                java.lang.String r7 = r9.toString()
            L_0x0156:
                r16 = r7
                r9 = 0
                r6 = r8
                r7 = r12
                r8 = r16
                r10 = r2
                r11 = r15
                r6.a(r7, r8, r9, r10, r11)
                r6 = r15
                r7 = r16
                goto L_0x00ed
            L_0x0166:
                TJ.B r1 = r5.f113639q
            L_0x016a:
                java.lang.Object r2 = r1.getValue()
                r5 = r2
                Oy.e$c r5 = (Oy.e.c) r5
                IC.e$d r7 = new IC.e$d
                int r3 = Oo.b.f84812v3
                r7.<init>(r3, r14, r4, r14)
                r9 = 5
                r10 = 0
                r6 = 0
                r8 = 0
                Oy.e$c r3 = Oy.e.c.c(r5, r6, r7, r8, r9, r10)
                boolean r2 = r1.e(r2, r3)
                if (r2 == 0) goto L_0x016a
            L_0x0186:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Oy.e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Oy/e$g", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f113666a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(N.a aVar, e eVar) {
            super(aVar);
            this.f113666a = eVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            e eVar = this.f113666a;
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                Throwable th3 = th2;
                if (str == null) {
                    String a10 = C11818a.a((String) null, th3);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = eVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar2, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            C16505B k10 = this.f113666a.f113639q;
            do {
                value = k10.getValue();
            } while (!k10.e(value, c.c((c) value, (List) null, new C13023e.d(Oo.b.f84812v3, (List) null, 2, (DefaultConstructorMarker) null), (a) null, 5, (Object) null)));
        }
    }

    public e(Ry.g gVar, h hVar, C15100a aVar, Sy.a aVar2) {
        C17542s.j(gVar, "repository");
        C17542s.j(hVar, "deleteCouponUseCase");
        C17542s.j(aVar, "getProfileStateUseCase");
        C17542s.j(aVar2, "analytics");
        this.f113635m = gVar;
        this.f113636n = hVar;
        this.f113637o = aVar;
        this.f113638p = aVar2;
        C16505B<c> a10 = C16521S.a(c.f113647d.a());
        this.f113639q = a10;
        this.f113640r = a10;
    }

    /* access modifiers changed from: private */
    public final void E(a aVar) {
        c value;
        C16505B<c> b10 = this.f113639q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.c(value, (List) null, (C13023e) null, aVar, 3, (Object) null)));
    }

    private final void F() {
        this.f113638p.b(a.e.ACTIVE_DISCOUT_OVERLAY);
        E(new a.C2789a(DeleteCouponBottomSheet.Companion.FragmentResult.a.f119865a));
    }

    private final void G(b.d dVar) {
        F0 unused = C16314k.d(g0.a(this), this.f113641s, (T) null, new f(this, dVar, (C17164e<? super f>) null), 2, (Object) null);
    }

    private final void H() {
        c value;
        C16505B<c> b10 = this.f113639q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.c(value, (List) null, (C13023e) null, (a) null, 5, (Object) null)));
    }

    public final void D(b bVar) {
        C17542s.j(bVar, "action");
        if (bVar instanceof b.d) {
            G((b.d) bVar);
        } else if (C17542s.e(bVar, b.a.f113643a)) {
            F();
        } else if (C17542s.e(bVar, b.c.f113645a)) {
            E((a) null);
        } else if (C17542s.e(bVar, b.C2790b.f113644a)) {
            H();
        } else {
            throw new t();
        }
    }

    public void c(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.c(yVar);
        C16534i.M(C16534i.R(C16534i.g(C5208k.b(this.f113635m.a(), yVar.getLifecycle(), (r.b) null, 2, (Object) null), new d((C17164e<? super d>) null)), new C2791e(this, (C17164e<? super C2791e>) null)), C5222z.a(yVar));
    }

    public final C16519P<c> m() {
        return this.f113640r;
    }
}
