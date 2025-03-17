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
import XH.C16807N;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0003#$%B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"LRk/a;", "Landroidx/lifecycle/f0;", "LSk/g;", "rootedDeviceUseCase", "LSk/a;", "isConsentSubmittedUseCase", "LSk/e;", "isRegionSelectedUseCase", "<init>", "(LSk/g;LSk/a;LSk/e;)V", "LRk/a$c;", "state", "LRk/a$b;", "G", "(LRk/a$c;)LRk/a$b;", "LXH/N;", "E", "()V", "D", "F", "m", "LSk/g;", "n", "LSk/a;", "o", "LSk/e;", "LTJ/B;", "p", "LTJ/B;", "_state", "LTJ/P;", "q", "LTJ/P;", "getState", "()LTJ/P;", "c", "b", "a", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Sk.g f86452m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Sk.a f86453n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Sk.e f86454o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<c> f86455p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<b> f86456q;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LRk/a$a;", "", "c", "a", "b", "LRk/a$a$a;", "LRk/a$a$b;", "LRk/a$a$c;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rk.a$a  reason: collision with other inner class name */
    public interface C1783a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/a$a$a;", "LRk/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.a$a$a  reason: collision with other inner class name */
        public static final class C1784a implements C1783a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1784a f86457a = new C1784a();

            private C1784a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1784a);
            }

            public int hashCode() {
                return -1814254850;
            }

            public String toString() {
                return "Consent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/a$a$b;", "LRk/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.a$a$b */
        public static final class b implements C1783a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f86458a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -552919821;
            }

            public String toString() {
                return "Promo";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/a$a$c;", "LRk/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.a$a$c */
        public static final class c implements C1783a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f86459a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 84365200;
            }

            public String toString() {
                return "Region";
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LRk/a$b;", "", "a", "b", "c", "d", "e", "LRk/a$b$a;", "LRk/a$b$b;", "LRk/a$b$c;", "LRk/a$b$d;", "LRk/a$b$e;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/a$b$a;", "LRk/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.a$b$a  reason: collision with other inner class name */
        public static final class C1785a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1785a f86460a = new C1785a();

            private C1785a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1785a);
            }

            public int hashCode() {
                return -224068940;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LRk/a$b$b;", "LRk/a$b;", "LRk/a$a;", "launchMode", "<init>", "(LRk/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRk/a$a;", "()LRk/a$a;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.a$b$b  reason: collision with other inner class name */
        public static final class C1786b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final C1783a f86461a;

            public C1786b(C1783a aVar) {
                C17542s.j(aVar, "launchMode");
                this.f86461a = aVar;
            }

            public final C1783a a() {
                return this.f86461a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1786b) && C17542s.e(this.f86461a, ((C1786b) obj).f86461a);
            }

            public int hashCode() {
                return this.f86461a.hashCode();
            }

            public String toString() {
                C1783a aVar = this.f86461a;
                return "Launch(launchMode=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/a$b$c;", "LRk/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f86462a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 633083750;
            }

            public String toString() {
                return "Launched";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/a$b$d;", "LRk/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f86463a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1233751784;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRk/a$b$e;", "LRk/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final e f86464a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 136470667;
            }

            public String toString() {
                return "RootedDevice";
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJN\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"LRk/a$c;", "", "", "initialized", "", "error", "isRootedDevice", "isConsentSubmitted", "isRegionSelected", "isLaunched", "<init>", "(ZLjava/lang/Throwable;ZZZZ)V", "a", "(ZLjava/lang/Throwable;ZZZZ)LRk/a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "h", "e", "g", "f", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f86465a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f86466b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f86467c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f86468d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f86469e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f86470f;

        public c() {
            this(false, (Throwable) null, false, false, false, false, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ c b(c cVar, boolean z10, Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = cVar.f86465a;
            }
            if ((i10 & 2) != 0) {
                th2 = cVar.f86466b;
            }
            Throwable th3 = th2;
            if ((i10 & 4) != 0) {
                z11 = cVar.f86467c;
            }
            boolean z15 = z11;
            if ((i10 & 8) != 0) {
                z12 = cVar.f86468d;
            }
            boolean z16 = z12;
            if ((i10 & 16) != 0) {
                z13 = cVar.f86469e;
            }
            boolean z17 = z13;
            if ((i10 & 32) != 0) {
                z14 = cVar.f86470f;
            }
            return cVar.a(z10, th3, z15, z16, z17, z14);
        }

        public final c a(boolean z10, Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
            return new c(z10, th2, z11, z12, z13, z14);
        }

        public final Throwable c() {
            return this.f86466b;
        }

        public final boolean d() {
            return this.f86465a;
        }

        public final boolean e() {
            return this.f86468d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f86465a == cVar.f86465a && C17542s.e(this.f86466b, cVar.f86466b) && this.f86467c == cVar.f86467c && this.f86468d == cVar.f86468d && this.f86469e == cVar.f86469e && this.f86470f == cVar.f86470f;
        }

        public final boolean f() {
            return this.f86470f;
        }

        public final boolean g() {
            return this.f86469e;
        }

        public final boolean h() {
            return this.f86467c;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f86465a) * 31;
            Throwable th2 = this.f86466b;
            return ((((((((hashCode + (th2 == null ? 0 : th2.hashCode())) * 31) + Boolean.hashCode(this.f86467c)) * 31) + Boolean.hashCode(this.f86468d)) * 31) + Boolean.hashCode(this.f86469e)) * 31) + Boolean.hashCode(this.f86470f);
        }

        public String toString() {
            boolean z10 = this.f86465a;
            Throwable th2 = this.f86466b;
            boolean z11 = this.f86467c;
            boolean z12 = this.f86468d;
            boolean z13 = this.f86469e;
            boolean z14 = this.f86470f;
            return "State(initialized=" + z10 + ", error=" + th2 + ", isRootedDevice=" + z11 + ", isConsentSubmitted=" + z12 + ", isRegionSelected=" + z13 + ", isLaunched=" + z14 + ")";
        }

        public c(boolean z10, Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
            this.f86465a = z10;
            this.f86466b = th2;
            this.f86467c = z11;
            this.f86468d = z12;
            this.f86469e = z13;
            this.f86470f = z14;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ c(boolean r6, java.lang.Throwable r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                if (r6 == 0) goto L_0x000d
                r7 = 0
            L_0x000d:
                r1 = r7
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0014
                r2 = r0
                goto L_0x0015
            L_0x0014:
                r2 = r8
            L_0x0015:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001b
                r3 = r0
                goto L_0x001c
            L_0x001b:
                r3 = r9
            L_0x001c:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0022
                r4 = r0
                goto L_0x0023
            L_0x0022:
                r4 = r10
            L_0x0023:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x0029
                r12 = r0
                goto L_0x002a
            L_0x0029:
                r12 = r11
            L_0x002a:
                r6 = r5
                r7 = r13
                r8 = r1
                r9 = r2
                r10 = r3
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Rk.a.c.<init>(boolean, java.lang.Throwable, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Rk/a$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f86471a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, a aVar2) {
            super(aVar);
            this.f86471a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            qv.e eVar = qv.e.DEBUG;
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
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "FirstEntryViewModel";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            C16505B i10 = this.f86471a.f86455p;
            do {
                value = i10.getValue();
            } while (!i10.e(value, c.b((c) value, false, th2, false, false, false, false, 61, (Object) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.FirstEntryViewModel$initialize$2", f = "FirstEntryViewModel.kt", l = {82, 84}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f86472c;

        /* renamed from: d  reason: collision with root package name */
        Object f86473d;

        /* renamed from: e  reason: collision with root package name */
        Object f86474e;

        /* renamed from: f  reason: collision with root package name */
        Object f86475f;

        /* renamed from: g  reason: collision with root package name */
        Object f86476g;

        /* renamed from: h  reason: collision with root package name */
        Object f86477h;

        /* renamed from: i  reason: collision with root package name */
        Object f86478i;

        /* renamed from: j  reason: collision with root package name */
        int f86479j;

        /* renamed from: k  reason: collision with root package name */
        int f86480k;

        /* renamed from: l  reason: collision with root package name */
        int f86481l;

        /* renamed from: m  reason: collision with root package name */
        int f86482m;

        /* renamed from: n  reason: collision with root package name */
        int f86483n;

        /* renamed from: o  reason: collision with root package name */
        boolean f86484o;

        /* renamed from: p  reason: collision with root package name */
        boolean f86485p;

        /* renamed from: q  reason: collision with root package name */
        int f86486q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ a f86487r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f86487r = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f86487r, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0135  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f86486q
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0083
                if (r2 == r4) goto L_0x004e
                if (r2 != r3) goto L_0x0046
                boolean r2 = r0.f86485p
                boolean r6 = r0.f86484o
                int r7 = r0.f86483n
                int r8 = r0.f86480k
                int r9 = r0.f86479j
                java.lang.Object r10 = r0.f86478i
                Rk.a$c r10 = (Rk.a.c) r10
                java.lang.Object r11 = r0.f86477h
                Rk.a$c r11 = (Rk.a.c) r11
                java.lang.Object r11 = r0.f86475f
                java.lang.Object r12 = r0.f86474e
                TJ.B r12 = (TJ.C16505B) r12
                java.lang.Object r13 = r0.f86473d
                Rk.a r13 = (Rk.a) r13
                java.lang.Object r14 = r0.f86472c
                TJ.B r14 = (TJ.C16505B) r14
                XH.y.b(r21)
                r17 = r8
                r16 = r9
                r15 = r11
                r5 = r13
                r4 = r14
                r11 = r2
                r2 = r3
                r8 = r7
                r7 = r10
                r3 = r12
                r10 = r6
                r6 = r1
                r1 = r21
                goto L_0x0116
            L_0x0046:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004e:
                int r2 = r0.f86483n
                int r6 = r0.f86482m
                int r7 = r0.f86481l
                int r8 = r0.f86480k
                int r9 = r0.f86479j
                java.lang.Object r10 = r0.f86478i
                Rk.a$c r10 = (Rk.a.c) r10
                java.lang.Object r11 = r0.f86477h
                Rk.a$c r11 = (Rk.a.c) r11
                java.lang.Object r12 = r0.f86476g
                java.lang.Object r13 = r0.f86475f
                java.lang.Object r14 = r0.f86474e
                TJ.B r14 = (TJ.C16505B) r14
                java.lang.Object r15 = r0.f86473d
                Rk.a r15 = (Rk.a) r15
                java.lang.Object r3 = r0.f86472c
                TJ.B r3 = (TJ.C16505B) r3
                XH.y.b(r21)
                r4 = r3
                r3 = r9
                r9 = r21
                r18 = r7
                r7 = r2
                r2 = r18
                r19 = r12
                r12 = r11
                r11 = r13
                r13 = r19
                goto L_0x00cc
            L_0x0083:
                XH.y.b(r21)
                Rk.a r2 = r0.f86487r
                TJ.B r2 = r2.f86455p
                Rk.a r3 = r0.f86487r
                r6 = r3
                r7 = r5
                r8 = r7
                r3 = r2
            L_0x0092:
                java.lang.Object r12 = r2.getValue()
                r11 = r12
                Rk.a$c r11 = (Rk.a.c) r11
                Sk.g r9 = r6.f86452m
                r0.f86472c = r3
                r0.f86473d = r6
                r0.f86474e = r2
                r0.f86475f = r12
                r0.f86476g = r12
                r0.f86477h = r11
                r0.f86478i = r11
                r0.f86479j = r7
                r0.f86480k = r8
                r0.f86481l = r5
                r0.f86482m = r5
                r0.f86483n = r4
                r0.f86486q = r4
                java.lang.Object r9 = r9.a(r0)
                if (r9 != r1) goto L_0x00be
                return r1
            L_0x00be:
                r14 = r2
                r2 = r5
                r15 = r6
                r10 = r11
                r13 = r12
                r6 = r2
                r11 = r13
                r12 = r10
                r18 = r4
                r4 = r3
                r3 = r7
                r7 = r18
            L_0x00cc:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                Sk.a r17 = r15.f86453n
                boolean r5 = r17.invoke()
                r17 = r1
                Sk.e r1 = r15.f86454o
                r0.f86472c = r4
                r0.f86473d = r15
                r0.f86474e = r14
                r0.f86475f = r11
                r0.f86476g = r13
                r0.f86477h = r12
                r0.f86478i = r10
                r0.f86479j = r3
                r0.f86480k = r8
                r0.f86481l = r2
                r0.f86482m = r6
                r0.f86483n = r7
                r0.f86484o = r9
                r0.f86485p = r5
                r2 = 2
                r0.f86486q = r2
                java.lang.Object r1 = r1.a(r0)
                r6 = r17
                if (r1 != r6) goto L_0x0108
                return r6
            L_0x0108:
                r16 = r3
                r17 = r8
                r3 = r14
                r8 = r7
                r7 = r10
                r10 = r9
                r18 = r11
                r11 = r5
                r5 = r15
                r15 = r18
            L_0x0116:
                if (r8 == 0) goto L_0x011a
                r8 = 1
                goto L_0x011b
            L_0x011a:
                r8 = 0
            L_0x011b:
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r12 = r1.booleanValue()
                r14 = 34
                r1 = 0
                r9 = 0
                r13 = 0
                r2 = r15
                r15 = r1
                Rk.a$c r1 = Rk.a.c.b(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                boolean r1 = r3.e(r2, r1)
                if (r1 == 0) goto L_0x0135
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x0135:
                r2 = r3
                r3 = r4
                r1 = r6
                r7 = r16
                r8 = r17
                r4 = 1
                r6 = r5
                r5 = 0
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: Rk.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C16532g<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f86488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f86489b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rk.a$f$a  reason: collision with other inner class name */
        public static final class C1787a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f86490a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f86491b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.FirstEntryViewModel$special$$inlined$map$1$2", f = "FirstEntryViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Rk.a$f$a$a  reason: collision with other inner class name */
            public static final class C1788a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f86492c;

                /* renamed from: d  reason: collision with root package name */
                int f86493d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1787a f86494e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1788a(C1787a aVar, C17164e eVar) {
                    super(eVar);
                    this.f86494e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f86492c = obj;
                    this.f86493d |= Integer.MIN_VALUE;
                    return this.f86494e.emit((Object) null, this);
                }
            }

            public C1787a(C16533h hVar, a aVar) {
                this.f86490a = hVar;
                this.f86491b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Rk.a.f.C1787a.C1788a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Rk.a$f$a$a r0 = (Rk.a.f.C1787a.C1788a) r0
                    int r1 = r0.f86493d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f86493d = r1
                    goto L_0x0018
                L_0x0013:
                    Rk.a$f$a$a r0 = new Rk.a$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f86492c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f86493d
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
                    TJ.h r6 = r4.f86490a
                    Rk.a$c r5 = (Rk.a.c) r5
                    Rk.a r2 = r4.f86491b
                    Rk.a$b r5 = r2.G(r5)
                    r0.f86493d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Rk.a.f.C1787a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar, a aVar) {
            this.f86488a = gVar;
            this.f86489b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f86488a.collect(new C1787a(hVar, this.f86489b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRk/a$c;", "it", "LXH/N;", "<anonymous>", "(LRk/a$c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.FirstEntryViewModel$state$1", f = "FirstEntryViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends l implements p<c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86495c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f86496d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f86497e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f86497e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f86497e, eVar);
            gVar.f86496d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
            return ((g) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86495c == 0) {
                y.b(obj);
                c cVar = (c) this.f86496d;
                a aVar = this.f86497e;
                qv.e eVar = qv.e.DEBUG;
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
                        String a10 = C11818a.a("FirstEntryViewModel: mapping internal state: " + cVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
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
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRk/a$b;", "it", "LXH/N;", "<anonymous>", "(LRk/a$b;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.FirstEntryViewModel$state$3", f = "FirstEntryViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements p<b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86498c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f86499d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f86500e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f86500e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f86500e, eVar);
            hVar.f86499d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(b bVar, C17164e<? super C16807N> eVar) {
            return ((h) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86498c == 0) {
                y.b(obj);
                b bVar = (b) this.f86499d;
                a aVar = this.f86500e;
                qv.e eVar = qv.e.DEBUG;
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
                        String a10 = C11818a.a("FirstEntryViewModel: emitting mapped state: " + bVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(Sk.g gVar, Sk.a aVar, Sk.e eVar) {
        C17542s.j(gVar, "rootedDeviceUseCase");
        C17542s.j(aVar, "isConsentSubmittedUseCase");
        C17542s.j(eVar, "isRegionSelectedUseCase");
        this.f86452m = gVar;
        this.f86453n = aVar;
        this.f86454o = eVar;
        C16505B<c> a10 = C16521S.a(new c(false, (Throwable) null, false, false, false, false, 63, (DefaultConstructorMarker) null));
        this.f86455p = a10;
        this.f86456q = C16534i.c0(C16534i.R(new f(C16534i.R(a10, new g(this, (C17164e<? super g>) null)), this), new h(this, (C17164e<? super h>) null)), g0.a(this), ip.f.a(), b.d.f86463a);
        E();
    }

    private final void E() {
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final b G(c cVar) {
        if (!cVar.d()) {
            return b.d.f86463a;
        }
        if (cVar.c() != null) {
            return b.C1785a.f86460a;
        }
        if (cVar.h()) {
            return b.e.f86464a;
        }
        if (cVar.f()) {
            return b.c.f86462a;
        }
        return new b.C1786b((!cVar.g() || cVar.e()) ? cVar.e() ? C1783a.b.f86458a : C1783a.c.f86459a : C1783a.C1784a.f86457a);
    }

    public final void D() {
        c value;
        C16505B<c> b10 = this.f86455p;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, false, (Throwable) null, false, false, false, false, 59, (Object) null)));
    }

    public final void F() {
        c value;
        C16505B<c> b10 = this.f86455p;
        do {
            value = b10.getValue();
        } while (!b10.e(value, c.b(value, false, (Throwable) null, false, false, false, true, 31, (Object) null)));
    }

    public final C16519P<b> getState() {
        return this.f86456q;
    }
}
