package Rk;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vs.b;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.adjust.sdk.Constants;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0003\u001f !B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"LRk/f;", "Landroidx/lifecycle/f0;", "LVs/a;", "installReferrer", "<init>", "(LVs/a;)V", "LRk/f$c;", "state", "LRk/f$b;", "G", "(LRk/f$c;)LRk/f$b;", "LRk/e;", "params", "LXH/N;", "D", "(LRk/e;)V", "C", "()V", "E", "F", "m", "LVs/a;", "LTJ/B;", "n", "LTJ/B;", "_state", "LTJ/P;", "o", "LTJ/P;", "getState", "()LTJ/P;", "c", "b", "a", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Vs.a f86506m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<c> f86507n;

    /* renamed from: o  reason: collision with root package name */
    private final C16519P<b> f86508o;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LRk/f$a;", "", "c", "a", "b", "LRk/f$a$a;", "LRk/f$a$b;", "LRk/f$a$c;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/f$a$a;", "LRk/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.f$a$a  reason: collision with other inner class name */
        public static final class C1789a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1789a f86509a = new C1789a();

            private C1789a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1789a);
            }

            public int hashCode() {
                return 1061727982;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/f$a$b;", "LRk/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f86510a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -817792024;
            }

            public String toString() {
                return "Completed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/f$a$c;", "LRk/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f86511a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -84438952;
            }

            public String toString() {
                return "Ongoing";
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LRk/f$b;", "", "e", "d", "c", "b", "a", "LRk/f$b$a;", "LRk/f$b$b;", "LRk/f$b$c;", "LRk/f$b$d;", "LRk/f$b$e;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/f$b$a;", "LRk/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f86512a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1692819660;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LRk/f$b$b;", "LRk/f$b;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.f$b$b  reason: collision with other inner class name */
        public static final class C1790b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f86513a;

            public C1790b() {
                this((String) null, 1, (DefaultConstructorMarker) null);
            }

            public final String a() {
                return this.f86513a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1790b) && C17542s.e(this.f86513a, ((C1790b) obj).f86513a);
            }

            public int hashCode() {
                String str = this.f86513a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.f86513a;
                return "Finished(deeplink=" + str + ")";
            }

            public C1790b(String str) {
                this.f86513a = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C1790b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LRk/f$b$c;", "LRk/f$b;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f86514a;

            public c(String str) {
                C17542s.j(str, Constants.DEEPLINK);
                this.f86514a = str;
            }

            public final String a() {
                return this.f86514a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f86514a, ((c) obj).f86514a);
            }

            public int hashCode() {
                return this.f86514a.hashCode();
            }

            public String toString() {
                String str = this.f86514a;
                return "FinishedUnresolvedDeeplink(deeplink=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/f$b$d;", "LRk/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f86515a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1161361543;
            }

            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/f$b$e;", "LRk/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final e f86516a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -172312663;
            }

            public String toString() {
                return "ShowSplash";
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"LRk/f$c;", "", "LRk/e;", "intentParams", "", "showSplash", "LRk/f$a;", "finishMode", "<init>", "(LRk/e;ZLRk/f$a;)V", "a", "(LRk/e;ZLRk/f$a;)LRk/f$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LRk/e;", "d", "()LRk/e;", "b", "Z", "e", "()Z", "c", "LRk/f$a;", "()LRk/f$a;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final e f86517a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f86518b;

        /* renamed from: c  reason: collision with root package name */
        private final a f86519c;

        public c() {
            this((e) null, false, (a) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ c b(c cVar, e eVar, boolean z10, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eVar = cVar.f86517a;
            }
            if ((i10 & 2) != 0) {
                z10 = cVar.f86518b;
            }
            if ((i10 & 4) != 0) {
                aVar = cVar.f86519c;
            }
            return cVar.a(eVar, z10, aVar);
        }

        public final c a(e eVar, boolean z10, a aVar) {
            C17542s.j(eVar, "intentParams");
            C17542s.j(aVar, "finishMode");
            return new c(eVar, z10, aVar);
        }

        public final a c() {
            return this.f86519c;
        }

        public final e d() {
            return this.f86517a;
        }

        public final boolean e() {
            return this.f86518b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f86517a, cVar.f86517a) && this.f86518b == cVar.f86518b && C17542s.e(this.f86519c, cVar.f86519c);
        }

        public int hashCode() {
            return (((this.f86517a.hashCode() * 31) + Boolean.hashCode(this.f86518b)) * 31) + this.f86519c.hashCode();
        }

        public String toString() {
            e eVar = this.f86517a;
            boolean z10 = this.f86518b;
            a aVar = this.f86519c;
            return "State(intentParams=" + eVar + ", showSplash=" + z10 + ", finishMode=" + aVar + ")";
        }

        public c(e eVar, boolean z10, a aVar) {
            C17542s.j(eVar, "intentParams");
            C17542s.j(aVar, "finishMode");
            this.f86517a = eVar;
            this.f86518b = z10;
            this.f86519c = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(e eVar, boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new e((String) null, false, 3, (DefaultConstructorMarker) null) : eVar, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? a.c.f86511a : aVar);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Rk/f$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f86520a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, f fVar) {
            super(aVar);
            this.f86520a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f86520a;
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
                    String a10 = C11818a.a("Error fetching install referrer", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.SplashViewModel$initialize$3", f = "SplashViewModel.kt", l = {74}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86521c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f86522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f86523e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f86523e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f86523e, eVar);
            eVar2.f86522d = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            String str;
            char c10;
            Object obj3;
            String str2;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f86521c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f86522d;
                Vs.a h10 = this.f86523e.f86506m;
                this.f86522d = q11;
                this.f86521c = 1;
                obj2 = h10.b(this);
                if (obj2 == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                q10 = (Q) this.f86522d;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = this.f86523e;
            Vs.b bVar = (Vs.b) obj2;
            if (bVar instanceof b.C1883b) {
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a("Install referrer applink " + ((b.C1883b) bVar).a(), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    if (str4 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar2.a(eVar, str4, false, (Throwable) null, str3);
                }
                C16505B i11 = fVar.f86507n;
                do {
                    value = i11.getValue();
                } while (!i11.e(value, c.b((c) value, new e(((b.C1883b) bVar).a(), false, 2, (DefaultConstructorMarker) null), false, (a) null, 6, (Object) null)));
            } else if (C17542s.e(bVar, b.a.f88783a)) {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar3 : arrayList2) {
                    if (str5 == null) {
                        String a11 = C11818a.a("Install referrer handled", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str5 = C11820c.a(a11);
                    }
                    if (str6 == null) {
                        String name2 = q10.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        str2 = str6;
                    }
                    str6 = str2;
                    bVar3.a(eVar2, str6, false, (Throwable) null, str5);
                }
            } else if (C17542s.e(bVar, b.c.f88785a)) {
                qv.e eVar3 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar4 : arrayList3) {
                    if (str8 == null) {
                        String a12 = C11818a.a("No install referrer link available", (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str = C11820c.a(a12);
                    } else {
                        str = str8;
                    }
                    if (str7 == null) {
                        String name3 = q10.getClass().getName();
                        C17542s.g(name3);
                        obj3 = null;
                        c10 = 2;
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                    } else {
                        obj3 = null;
                        c10 = 2;
                    }
                    Object obj4 = obj3;
                    char c11 = c10;
                    bVar4.a(eVar3, str7, false, (Throwable) null, str);
                    str8 = str;
                }
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rk.f$f  reason: collision with other inner class name */
    public static final class C1791f implements C16532g<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f86524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f86525b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.f$f$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f86526a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f86527b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.SplashViewModel$special$$inlined$map$1$2", f = "SplashViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Rk.f$f$a$a  reason: collision with other inner class name */
            public static final class C1792a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f86528c;

                /* renamed from: d  reason: collision with root package name */
                int f86529d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f86530e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1792a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f86530e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f86528c = obj;
                    this.f86529d |= Integer.MIN_VALUE;
                    return this.f86530e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, f fVar) {
                this.f86526a = hVar;
                this.f86527b = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Rk.f.C1791f.a.C1792a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Rk.f$f$a$a r0 = (Rk.f.C1791f.a.C1792a) r0
                    int r1 = r0.f86529d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f86529d = r1
                    goto L_0x0018
                L_0x0013:
                    Rk.f$f$a$a r0 = new Rk.f$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f86528c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f86529d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f86526a
                    Rk.f$c r5 = (Rk.f.c) r5
                    Rk.f r2 = r4.f86527b
                    Rk.f$b r5 = r2.G(r5)
                    r0.f86529d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Rk.f.C1791f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1791f(C16532g gVar, f fVar) {
            this.f86524a = gVar;
            this.f86525b = fVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f86524a.collect(new a(hVar, this.f86525b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRk/f$c;", "it", "LXH/N;", "<anonymous>", "(LRk/f$c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.SplashViewModel$state$1", f = "SplashViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends l implements p<c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86531c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f86532d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f86533e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f86533e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f86533e, eVar);
            gVar.f86532d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
            return ((g) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86531c == 0) {
                y.b(obj);
                c cVar = (c) this.f86532d;
                f fVar = this.f86533e;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, true)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("SplashViewModel: emitting state: " + cVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = fVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, true, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRk/f$b;", "it", "LXH/N;", "<anonymous>", "(LRk/f$b;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.SplashViewModel$state$3", f = "SplashViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements p<b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86534c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f86535d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f86536e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f86536e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f86536e, eVar);
            hVar.f86535d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(b bVar, C17164e<? super C16807N> eVar) {
            return ((h) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86534c == 0) {
                y.b(obj);
                b bVar = (b) this.f86535d;
                f fVar = this.f86536e;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, true)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("SplashViewModel: emitting mapped state: " + bVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = fVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, true, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f(Vs.a aVar) {
        C17542s.j(aVar, "installReferrer");
        this.f86506m = aVar;
        C16505B<c> a10 = C16521S.a(new c((e) null, false, (a) null, 7, (DefaultConstructorMarker) null));
        this.f86507n = a10;
        this.f86508o = C16534i.c0(C16534i.R(new C1791f(C16534i.R(a10, new g(this, (C17164e<? super g>) null)), this), new h(this, (C17164e<? super h>) null)), g0.a(this), ip.f.a(), b.e.f86516a);
    }

    /* access modifiers changed from: private */
    public final b G(c cVar) {
        b bVar;
        if (cVar.e()) {
            return b.e.f86516a;
        }
        a c10 = cVar.c();
        if (C17542s.e(c10, a.C1789a.f86509a)) {
            return b.a.f86512a;
        }
        if (C17542s.e(c10, a.b.f86510a)) {
            if (cVar.d().b()) {
                this.f86506m.a();
                bVar = new b.c(cVar.d().c());
            } else {
                bVar = new b.C1790b(cVar.d().a());
            }
            return bVar;
        } else if (C17542s.e(c10, a.c.f86511a)) {
            return b.d.f86515a;
        } else {
            throw new t();
        }
    }

    public final void C() {
        c value;
        C16505B<c> b10 = this.f86507n;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, (e) null, false, (a) null, 5, (Object) null)));
    }

    public final void D(e eVar) {
        c value;
        C17542s.j(eVar, "params");
        C16505B<c> b10 = this.f86507n;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, eVar, false, (a) null, 6, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
    }

    public final void E() {
        c value;
        C16505B<c> b10 = this.f86507n;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, (e) null, false, a.C1789a.f86509a, 3, (Object) null)));
    }

    public final void F() {
        c value;
        C16505B<c> b10 = this.f86507n;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, (e) null, false, a.b.f86510a, 3, (Object) null)));
    }

    public final C16519P<b> getState() {
        return this.f86508o;
    }
}
