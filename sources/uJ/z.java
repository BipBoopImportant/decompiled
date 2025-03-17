package Uj;

import IC.C13023e;
import IC.C13026h;
import Iz.Y;
import Sy.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.scanandgoonlineredesign.coupon.navigation.AddCouponBottomSheetNavigation;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.g;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import eI.C17187b;
import gj.C11296g;
import gj.C11297h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0004=>?,B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b/\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u000203078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006@"}, d2 = {"LUj/z;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/h;", "LRy/a;", "settingsRepo", "Lgj/h;", "scannerCouponResultMapper", "<init>", "(LRy/a;Lgj/h;)V", "LUj/z$b$f;", "action", "LXH/N;", "I", "(LUj/z$b$f;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "result", "E", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;)V", "LUj/z$d;", "state", "L", "(LUj/z$d;)V", "LUj/z$a;", "destination", "G", "(LUj/z$a;)V", "LIC/e;", "uiText", "K", "(LIC/e;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)V", "LUj/z$b$e;", "H", "(LUj/z$b$e;)V", "F", "()V", "LUj/z$b;", "D", "(LUj/z$b;)V", "Landroidx/lifecycle/y;", "owner", "c", "(Landroidx/lifecycle/y;)V", "onResume", "onPause", "m", "Lgj/h;", "LTJ/B;", "LUj/z$c;", "n", "LTJ/B;", "_uiDataModel", "LTJ/P;", "o", "LTJ/P;", "C", "()LTJ/P;", "uiDataModel", "b", "d", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z extends f0 implements C5205h {

    /* renamed from: m  reason: collision with root package name */
    private final C11297h f88288m;

    /* renamed from: n  reason: collision with root package name */
    private final C16505B<c> f88289n;

    /* renamed from: o  reason: collision with root package name */
    private final C16519P<c> f88290o;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LUj/z$a;", "", "a", "b", "c", "d", "e", "LUj/z$a$a;", "LUj/z$a$b;", "LUj/z$a$c;", "LUj/z$a$d;", "LUj/z$a$e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/z$a$a;", "LUj/z$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.z$a$a  reason: collision with other inner class name */
        public static final class C1849a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1849a f88291a = new C1849a();

            private C1849a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1849a);
            }

            public int hashCode() {
                return -1328812363;
            }

            public String toString() {
                return "None";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LUj/z$a$b;", "LUj/z$a;", "LIz/Y$a;", "result", "<init>", "(LIz/Y$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIz/Y$a;", "()LIz/Y$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Y.a f88292a;

            public b(Y.a aVar) {
                C17542s.j(aVar, "result");
                this.f88292a = aVar;
            }

            public final Y.a a() {
                return this.f88292a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f88292a, ((b) obj).f88292a);
            }

            public int hashCode() {
                return this.f88292a.hashCode();
            }

            public String toString() {
                Y.a aVar = this.f88292a;
                return "OnFragmentResult(result=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LUj/z$a$c;", "LUj/z$a;", "Lgj/g;", "result", "<init>", "(Lgj/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgj/g;", "()Lgj/g;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C11296g f88293a;

            public c(C11296g gVar) {
                C17542s.j(gVar, "result");
                this.f88293a = gVar;
            }

            public final C11296g a() {
                return this.f88293a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f88293a, ((c) obj).f88293a);
            }

            public int hashCode() {
                return this.f88293a.hashCode();
            }

            public String toString() {
                C11296g gVar = this.f88293a;
                return "OnOpenAddCouponBottomSheet(result=" + gVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LUj/z$a$d;", "LUj/z$a;", "", "permission", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f88294a;

            public d(String str) {
                C17542s.j(str, "permission");
                this.f88294a = str;
            }

            public final String a() {
                return this.f88294a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f88294a, ((d) obj).f88294a);
            }

            public int hashCode() {
                return this.f88294a.hashCode();
            }

            public String toString() {
                String str = this.f88294a;
                return "RequestPermission(permission=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LUj/z$a$e;", "LUj/z$a;", "", "permission", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPermission", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f88295a;

            public e(String str) {
                C17542s.j(str, "permission");
                this.f88295a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C17542s.e(this.f88295a, ((e) obj).f88295a);
            }

            public int hashCode() {
                return this.f88295a.hashCode();
            }

            public String toString() {
                String str = this.f88295a;
                return "RequestPermissionRationale(permission=" + str + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LUj/z$b;", "", "f", "b", "d", "g", "e", "a", "c", "LUj/z$b$a;", "LUj/z$b$b;", "LUj/z$b$c;", "LUj/z$b$d;", "LUj/z$b$e;", "LUj/z$b$f;", "LUj/z$b$g;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LUj/z$b$a;", "LUj/z$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "result", "<init>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final AddCouponBottomSheetNavigation.NavigationResult f88296a;

            public a(AddCouponBottomSheetNavigation.NavigationResult navigationResult) {
                C17542s.j(navigationResult, "result");
                this.f88296a = navigationResult;
            }

            public final AddCouponBottomSheetNavigation.NavigationResult a() {
                return this.f88296a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f88296a, ((a) obj).f88296a);
            }

            public int hashCode() {
                return this.f88296a.hashCode();
            }

            public String toString() {
                AddCouponBottomSheetNavigation.NavigationResult navigationResult = this.f88296a;
                return "OnAddCouponBottomSheetFragmentResult(result=" + navigationResult + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LUj/z$b$b;", "LUj/z$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.z$b$b  reason: collision with other inner class name */
        public static final class C1850b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f88297a;

            public C1850b(Throwable th2) {
                C17542s.j(th2, "throwable");
                this.f88297a = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1850b) && C17542s.e(this.f88297a, ((C1850b) obj).f88297a);
            }

            public int hashCode() {
                return this.f88297a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f88297a;
                return "OnException(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/z$b$c;", "LUj/z$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f88298a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1703224452;
            }

            public String toString() {
                return "OnManualEntryButtonClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/z$b$d;", "LUj/z$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f88299a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 130358680;
            }

            public String toString() {
                return "OnNavigated";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LUj/z$b$e;", "LUj/z$b;", "", "isGranted", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements b {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f88300a;

            public e(boolean z10) {
                this.f88300a = z10;
            }

            public final boolean a() {
                return this.f88300a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f88300a == ((e) obj).f88300a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f88300a);
            }

            public String toString() {
                boolean z10 = this.f88300a;
                return "OnRequestPermissionResult(isGranted=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LUj/z$b$f;", "LUj/z$b;", "", "format", "", "rawValue", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements b {

            /* renamed from: a  reason: collision with root package name */
            private final int f88301a;

            /* renamed from: b  reason: collision with root package name */
            private final String f88302b;

            public f(int i10, String str) {
                C17542s.j(str, "rawValue");
                this.f88301a = i10;
                this.f88302b = str;
            }

            public final int a() {
                return this.f88301a;
            }

            public final String b() {
                return this.f88302b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f88301a == fVar.f88301a && C17542s.e(this.f88302b, fVar.f88302b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f88301a) * 31) + this.f88302b.hashCode();
            }

            public String toString() {
                int i10 = this.f88301a;
                String str = this.f88302b;
                return "OnScanned(format=" + i10 + ", rawValue=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/z$b$g;", "LUj/z$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class g implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final g f88303a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 1366894817;
            }

            public String toString() {
                return "OnSnackbarDisplayed";
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0017B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LUj/z$c;", "", "LUj/z$d;", "state", "", "storeName", "LIC/e;", "error", "LUj/z$a;", "navigateTo", "<init>", "(LUj/z$d;Ljava/lang/String;LIC/e;LUj/z$a;)V", "b", "(LUj/z$d;Ljava/lang/String;LIC/e;LUj/z$a;)LUj/z$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LUj/z$d;", "f", "()LUj/z$d;", "Ljava/lang/String;", "g", "c", "LIC/e;", "d", "()LIC/e;", "LUj/z$a;", "e", "()LUj/z$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final a f88304e = new a((DefaultConstructorMarker) null);

        /* renamed from: f  reason: collision with root package name */
        public static final int f88305f = C13023e.f110931a;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final c f88306g = new c((d) null, (String) null, (C13023e) null, (a) null, 15, (DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final d f88307a;

        /* renamed from: b  reason: collision with root package name */
        private final String f88308b;

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f88309c;

        /* renamed from: d  reason: collision with root package name */
        private final a f88310d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUj/z$c$a;", "", "<init>", "()V", "LUj/z$c;", "EMPTY", "LUj/z$c;", "a", "()LUj/z$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f88306g;
            }

            private a() {
            }
        }

        public c() {
            this((d) null, (String) null, (C13023e) null, (a) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ c c(c cVar, d dVar, String str, C13023e eVar, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                dVar = cVar.f88307a;
            }
            if ((i10 & 2) != 0) {
                str = cVar.f88308b;
            }
            if ((i10 & 4) != 0) {
                eVar = cVar.f88309c;
            }
            if ((i10 & 8) != 0) {
                aVar = cVar.f88310d;
            }
            return cVar.b(dVar, str, eVar, aVar);
        }

        public final c b(d dVar, String str, C13023e eVar, a aVar) {
            C17542s.j(dVar, "state");
            C17542s.j(aVar, "navigateTo");
            return new c(dVar, str, eVar, aVar);
        }

        public final C13023e d() {
            return this.f88309c;
        }

        public final a e() {
            return this.f88310d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f88307a, cVar.f88307a) && C17542s.e(this.f88308b, cVar.f88308b) && C17542s.e(this.f88309c, cVar.f88309c) && C17542s.e(this.f88310d, cVar.f88310d);
        }

        public final d f() {
            return this.f88307a;
        }

        public final String g() {
            return this.f88308b;
        }

        public int hashCode() {
            int hashCode = this.f88307a.hashCode() * 31;
            String str = this.f88308b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C13023e eVar = this.f88309c;
            if (eVar != null) {
                i10 = eVar.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f88310d.hashCode();
        }

        public String toString() {
            d dVar = this.f88307a;
            String str = this.f88308b;
            C13023e eVar = this.f88309c;
            a aVar = this.f88310d;
            return "UiDataModel(state=" + dVar + ", storeName=" + str + ", error=" + eVar + ", navigateTo=" + aVar + ")";
        }

        public c(d dVar, String str, C13023e eVar, a aVar) {
            C17542s.j(dVar, "state");
            C17542s.j(aVar, "navigateTo");
            this.f88307a = dVar;
            this.f88308b = str;
            this.f88309c = eVar;
            this.f88310d = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(d dVar, String str, C13023e eVar, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new d.a(false, 1, (DefaultConstructorMarker) null) : dVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : eVar, (i10 & 8) != 0 ? a.C1849a.f88291a : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LUj/z$d;", "", "<init>", "()V", "a", "LUj/z$d$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LUj/z$d$a;", "LUj/z$d;", "", "shouldBeRunning", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f88311a;

            public a() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public final boolean a() {
                return this.f88311a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f88311a == ((a) obj).f88311a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f88311a);
            }

            public String toString() {
                boolean z10 = this.f88311a;
                return "Scanning(shouldBeRunning=" + z10 + ")";
            }

            public a(boolean z10) {
                super((DefaultConstructorMarker) null);
                this.f88311a = z10;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? true : z10);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUj/z$c;", "uiState", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "settings", "<anonymous>", "(LUj/z$c;Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;)LUj/z$c;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoScannerCouponFragmentViewModel$uiDataModel$1", f = "ScanAndGoScannerCouponFragmentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements q<c, ScanAndGoSettings, C17164e<? super c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88312c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f88313d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f88314e;

        e(C17164e<? super e> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(c cVar, ScanAndGoSettings scanAndGoSettings, C17164e<? super c> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f88313d = cVar;
            eVar2.f88314e = scanAndGoSettings;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C17187b.f();
            if (this.f88312c == 0) {
                y.b(obj);
                c cVar = (c) this.f88313d;
                ScanAndGoSettings scanAndGoSettings = (ScanAndGoSettings) this.f88314e;
                if (scanAndGoSettings == null || (str = scanAndGoSettings.n()) == null) {
                    str = "";
                }
                return c.c(cVar, (d) null, str, (C13023e) null, (a) null, 13, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public z(Ry.a aVar, C11297h hVar) {
        C17542s.j(aVar, "settingsRepo");
        C17542s.j(hVar, "scannerCouponResultMapper");
        this.f88288m = hVar;
        c.a aVar2 = c.f88304e;
        C16505B<c> a10 = C16521S.a(aVar2.a());
        this.f88289n = a10;
        this.f88290o = C16534i.c0(C16534i.n(a10, aVar.b(), new e((C17164e<? super e>) null)), g0.a(this), ip.f.a(), aVar2.a());
    }

    private final void E(AddCouponBottomSheetNavigation.NavigationResult navigationResult) {
        if (navigationResult instanceof AddCouponBottomSheetNavigation.NavigationResult.a) {
            AddCouponBottomSheetNavigation.NavigationResult.a aVar = (AddCouponBottomSheetNavigation.NavigationResult.a) navigationResult;
            G(new a.b(new Y.a.b(aVar.a(), aVar.b())));
        } else if (C17542s.e(navigationResult, AddCouponBottomSheetNavigation.NavigationResult.b.f91272a)) {
            L(new d.a(true));
        } else {
            throw new t();
        }
    }

    private final void F() {
        G(new a.c(new C11296g((String) null, a.C2850a.d.f116639c, 1, (DefaultConstructorMarker) null)));
    }

    private final void G(a aVar) {
        c value;
        C16505B<c> b10 = this.f88289n;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.c(value, new d.a(false), (String) null, (C13023e) null, aVar, 6, (Object) null)));
    }

    private final void H(b.e eVar) {
        L(new d.a(eVar.a()));
    }

    private final void I(b.f fVar) {
        C11297h.a a10 = this.f88288m.a(fVar.a(), fVar.b());
        if (a10 instanceof C11297h.a.C2180a) {
            J(((C11297h.a.C2180a) a10).a());
        } else if (a10 instanceof C11297h.a.b) {
            G(new a.c(((C11297h.a.b) a10).a()));
        } else {
            throw new t();
        }
    }

    private final void J(Throwable th2) {
        if (th2 instanceof g.a) {
            G(new a.d(((g.a) th2).a()));
        } else if (th2 instanceof g.b) {
            G(new a.e(((g.b) th2).a()));
        } else {
            K(C13026h.a(Oo.b.f84812v3));
        }
    }

    private final void K(C13023e eVar) {
        c value;
        C16505B<c> b10 = this.f88289n;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.c(value, (d) null, (String) null, eVar, (a) null, 11, (Object) null)));
    }

    private final void L(d dVar) {
        c value;
        C16505B<c> b10 = this.f88289n;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.c(value, dVar, (String) null, (C13023e) null, (a) null, 14, (Object) null)));
    }

    public final C16519P<c> C() {
        return this.f88290o;
    }

    public final void D(b bVar) {
        C17542s.j(bVar, "action");
        if (bVar instanceof b.f) {
            I((b.f) bVar);
        } else if (bVar instanceof b.C1850b) {
            K(C13026h.a(Oo.b.f84812v3));
        } else if (C17542s.e(bVar, b.g.f88303a)) {
            K((C13023e) null);
        } else if (C17542s.e(bVar, b.d.f88299a)) {
            G(a.C1849a.f88291a);
        } else if (bVar instanceof b.a) {
            E(((b.a) bVar).a());
        } else if (bVar instanceof b.e) {
            H((b.e) bVar);
        } else if (C17542s.e(bVar, b.c.f88298a)) {
            F();
        } else {
            throw new t();
        }
    }

    public void c(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.c(yVar);
        L(new d.a(true));
    }

    public void onPause(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.onPause(yVar);
        L(new d.a(false));
    }

    public void onResume(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.onResume(yVar);
        L(new d.a(true));
    }
}
