package Tf;

import HJ.C15854t;
import IC.C13023e;
import JC.C13068a;
import Ln.b;
import Ln.h;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
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
import rv.C11849b;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002%&B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0014\u0010#¨\u0006'"}, d2 = {"LTf/u;", "Landroidx/lifecycle/f0;", "LLn/h;", "cartRepository", "LTf/y;", "getCartDiscountUseCase", "<init>", "(LLn/h;LTf/y;)V", "LLn/b;", "exception", "LXH/N;", "D", "(LLn/b;)V", "", "code", "k", "(Ljava/lang/String;)V", "C", "input", "E", "m", "LLn/h;", "LTJ/g;", "n", "LTJ/g;", "discountCodeApplied", "LTJ/B;", "LTf/u$a;", "o", "LTJ/B;", "uiData", "LTJ/P;", "LTf/u$b;", "p", "LTJ/P;", "()LTJ/P;", "uiState", "a", "b", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final h f63938m;

    /* renamed from: n  reason: collision with root package name */
    private final C16532g<String> f63939n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<a> f63940o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<b> f63941p;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"LTf/u$a;", "", "", "showProgress", "isDone", "", "userInput", "", "errorTextRes", "<init>", "(ZZLjava/lang/String;Ljava/lang/Integer;)V", "a", "(ZZLjava/lang/String;Ljava/lang/Integer;)LTf/u$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "f", "c", "Ljava/lang/String;", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f63942a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f63943b;

        /* renamed from: c  reason: collision with root package name */
        private final String f63944c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f63945d;

        public a() {
            this(false, false, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ a b(a aVar, boolean z10, boolean z11, String str, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f63942a;
            }
            if ((i10 & 2) != 0) {
                z11 = aVar.f63943b;
            }
            if ((i10 & 4) != 0) {
                str = aVar.f63944c;
            }
            if ((i10 & 8) != 0) {
                num = aVar.f63945d;
            }
            return aVar.a(z10, z11, str, num);
        }

        public final a a(boolean z10, boolean z11, String str, Integer num) {
            C17542s.j(str, "userInput");
            return new a(z10, z11, str, num);
        }

        public final Integer c() {
            return this.f63945d;
        }

        public final boolean d() {
            return this.f63942a;
        }

        public final String e() {
            return this.f63944c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f63942a == aVar.f63942a && this.f63943b == aVar.f63943b && C17542s.e(this.f63944c, aVar.f63944c) && C17542s.e(this.f63945d, aVar.f63945d);
        }

        public final boolean f() {
            return this.f63943b;
        }

        public int hashCode() {
            int hashCode = ((((Boolean.hashCode(this.f63942a) * 31) + Boolean.hashCode(this.f63943b)) * 31) + this.f63944c.hashCode()) * 31;
            Integer num = this.f63945d;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            boolean z10 = this.f63942a;
            boolean z11 = this.f63943b;
            String str = this.f63944c;
            Integer num = this.f63945d;
            return "UiData(showProgress=" + z10 + ", isDone=" + z11 + ", userInput=" + str + ", errorTextRes=" + num + ")";
        }

        public a(boolean z10, boolean z11, String str, Integer num) {
            C17542s.j(str, "userInput");
            this.f63942a = z10;
            this.f63943b = z11;
            this.f63944c = str;
            this.f63945d = num;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z10, boolean z11, String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0019\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"LTf/u$b;", "", "<init>", "()V", "", "d", "()Ljava/lang/String;", "input", "LIC/e;", "a", "()LIC/e;", "buttonText", "", "g", "()Z", "isLoading", "", "c", "()Ljava/lang/Integer;", "errorTextRes", "e", "inputEnabled", "f", "inputLabel", "b", "done", "LTf/u$b$a;", "LTf/u$b$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 R\u001a\u0010#\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010$\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"LTf/u$b$a;", "LTf/u$b;", "", "input", "", "isLoading", "", "errorTextRes", "done", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "g", "()Z", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "LIC/e;", "e", "LIC/e;", "()LIC/e;", "buttonText", "f", "inputEnabled", "inputLabel", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final int f63946h = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final String f63947a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f63948b;

            /* renamed from: c  reason: collision with root package name */
            private final Integer f63949c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f63950d;

            /* renamed from: e  reason: collision with root package name */
            private final C13023e f63951e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f63952f;

            /* renamed from: g  reason: collision with root package name */
            private final C13023e f63953g;

            public a() {
                this((String) null, false, (Integer) null, false, 15, (DefaultConstructorMarker) null);
            }

            public C13023e a() {
                return this.f63951e;
            }

            public boolean b() {
                return this.f63950d;
            }

            public Integer c() {
                return this.f63949c;
            }

            public String d() {
                return this.f63947a;
            }

            public boolean e() {
                return this.f63952f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f63947a, aVar.f63947a) && this.f63948b == aVar.f63948b && C17542s.e(this.f63949c, aVar.f63949c) && this.f63950d == aVar.f63950d;
            }

            public C13023e f() {
                return this.f63953g;
            }

            public boolean g() {
                return this.f63948b;
            }

            public int hashCode() {
                int hashCode = ((this.f63947a.hashCode() * 31) + Boolean.hashCode(this.f63948b)) * 31;
                Integer num = this.f63949c;
                return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f63950d);
            }

            public String toString() {
                String str = this.f63947a;
                boolean z10 = this.f63948b;
                Integer num = this.f63949c;
                boolean z11 = this.f63950d;
                return "Add(input=" + str + ", isLoading=" + z10 + ", errorTextRes=" + num + ", done=" + z11 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(String str, boolean z10, Integer num, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? false : z11);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, Integer num, boolean z11) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "input");
                this.f63947a = str;
                this.f63948b = z10;
                this.f63949c = num;
                this.f63950d = z11;
                this.f63951e = new C13023e.d(Oo.b.f84557Y, (List) null, 2, (DefaultConstructorMarker) null);
                this.f63952f = true;
                this.f63953g = new C13023e.d(Oo.b.f84579a1, (List) null, 2, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 R\u001a\u0010#\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010$\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"LTf/u$b$b;", "LTf/u$b;", "", "input", "", "isLoading", "", "errorTextRes", "done", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "g", "()Z", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "LIC/e;", "e", "LIC/e;", "()LIC/e;", "buttonText", "f", "inputEnabled", "inputLabel", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tf.u$b$b  reason: collision with other inner class name */
        public static final class C1115b extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final int f63954h = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final String f63955a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f63956b;

            /* renamed from: c  reason: collision with root package name */
            private final Integer f63957c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f63958d;

            /* renamed from: e  reason: collision with root package name */
            private final C13023e f63959e = new C13023e.d(C11849b.f102343s, (List) null, 2, (DefaultConstructorMarker) null);

            /* renamed from: f  reason: collision with root package name */
            private final boolean f63960f;

            /* renamed from: g  reason: collision with root package name */
            private final C13023e f63961g = new C13023e.d(C11849b.f102327o, (List) null, 2, (DefaultConstructorMarker) null);

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1115b(String str, boolean z10, Integer num, boolean z11) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "input");
                this.f63955a = str;
                this.f63956b = z10;
                this.f63957c = num;
                this.f63958d = z11;
            }

            public C13023e a() {
                return this.f63959e;
            }

            public boolean b() {
                return this.f63958d;
            }

            public Integer c() {
                return this.f63957c;
            }

            public String d() {
                return this.f63955a;
            }

            public boolean e() {
                return this.f63960f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1115b)) {
                    return false;
                }
                C1115b bVar = (C1115b) obj;
                return C17542s.e(this.f63955a, bVar.f63955a) && this.f63956b == bVar.f63956b && C17542s.e(this.f63957c, bVar.f63957c) && this.f63958d == bVar.f63958d;
            }

            public C13023e f() {
                return this.f63961g;
            }

            public boolean g() {
                return this.f63956b;
            }

            public int hashCode() {
                int hashCode = ((this.f63955a.hashCode() * 31) + Boolean.hashCode(this.f63956b)) * 31;
                Integer num = this.f63957c;
                return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f63958d);
            }

            public String toString() {
                String str = this.f63955a;
                boolean z10 = this.f63956b;
                Integer num = this.f63957c;
                boolean z11 = this.f63958d;
                return "Delete(input=" + str + ", isLoading=" + z10 + ", errorTextRes=" + num + ", done=" + z11 + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract C13023e a();

        public abstract boolean b();

        public abstract Integer c();

        public abstract String d();

        public abstract boolean e();

        public abstract C13023e f();

        public abstract boolean g();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tf/u$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f63962a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, u uVar) {
            super(aVar);
            this.f63962a = uVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            u uVar = this.f63962a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Ln.b bVar = null;
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Error putting discount", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = uVar.getClass().getName();
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
            u uVar2 = this.f63962a;
            if (th2 instanceof Ln.b) {
                bVar = (Ln.b) th2;
            }
            uVar2.D(bVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.discount.DiscountViewModel$applyDiscount$2", f = "DiscountViewModel.kt", l = {81}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f63963c;

        /* renamed from: d  reason: collision with root package name */
        Object f63964d;

        /* renamed from: e  reason: collision with root package name */
        Object f63965e;

        /* renamed from: f  reason: collision with root package name */
        int f63966f;

        /* renamed from: g  reason: collision with root package name */
        int f63967g;

        /* renamed from: h  reason: collision with root package name */
        int f63968h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ u f63969i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f63970j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(u uVar, String str, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f63969i = uVar;
            this.f63970j = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f63969i, this.f63970j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            a b10;
            Object value4;
            Object f10 = C17187b.f();
            int i10 = this.f63968h;
            if (i10 == 0) {
                y.b(obj);
                C16505B i11 = this.f63969i.f63940o;
                do {
                    value3 = i11.getValue();
                    b10 = a.b((a) value3, true, false, (String) null, (Integer) null, 6, (Object) null);
                } while (!i11.e(value3, b10));
                h h10 = this.f63969i.f63938m;
                String str = this.f63970j;
                this.f63963c = i11;
                this.f63964d = value3;
                this.f63965e = b10;
                this.f63966f = 0;
                this.f63967g = 0;
                this.f63968h = 1;
                if (h10.f(str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                a aVar = (a) this.f63965e;
                C16505B b11 = (C16505B) this.f63963c;
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C16505B i12 = this.f63969i.f63940o;
                    do {
                        value4 = i12.getValue();
                    } while (!i12.e(value4, a.b((a) value4, false, false, (String) null, (Integer) null, 14, (Object) null)));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B i13 = this.f63969i.f63940o;
            do {
                value = i13.getValue();
            } while (!i13.e(value, a.b((a) value, false, true, (String) null, (Integer) null, 13, (Object) null)));
            C16505B i14 = this.f63969i.f63940o;
            do {
                value2 = i14.getValue();
            } while (!i14.e(value2, a.b((a) value2, false, false, (String) null, (Integer) null, 14, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tf/u$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f63971a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, u uVar) {
            super(aVar);
            this.f63971a = uVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            u uVar = this.f63971a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Error deleting discount", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = uVar.getClass().getName();
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
            C16505B i10 = this.f63971a.f63940o;
            do {
                value = i10.getValue();
            } while (!i10.e(value, a.b((a) value, false, false, (String) null, Integer.valueOf(Oo.b.f84321A3), 7, (Object) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.discount.DiscountViewModel$deleteDiscount$2", f = "DiscountViewModel.kt", l = {116}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f63972c;

        /* renamed from: d  reason: collision with root package name */
        Object f63973d;

        /* renamed from: e  reason: collision with root package name */
        Object f63974e;

        /* renamed from: f  reason: collision with root package name */
        int f63975f;

        /* renamed from: g  reason: collision with root package name */
        int f63976g;

        /* renamed from: h  reason: collision with root package name */
        int f63977h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ u f63978i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f63979j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(u uVar, String str, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f63978i = uVar;
            this.f63979j = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f63978i, this.f63979j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            a b10;
            Object value4;
            Object f10 = C17187b.f();
            int i10 = this.f63977h;
            if (i10 == 0) {
                y.b(obj);
                C16505B i11 = this.f63978i.f63940o;
                do {
                    value3 = i11.getValue();
                    b10 = a.b((a) value3, true, false, (String) null, (Integer) null, 14, (Object) null);
                } while (!i11.e(value3, b10));
                h h10 = this.f63978i.f63938m;
                String str = this.f63979j;
                this.f63972c = i11;
                this.f63973d = value3;
                this.f63974e = b10;
                this.f63975f = 0;
                this.f63976g = 0;
                this.f63977h = 1;
                if (h10.b(str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                a aVar = (a) this.f63974e;
                C16505B b11 = (C16505B) this.f63972c;
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C16505B i12 = this.f63978i.f63940o;
                    do {
                        value4 = i12.getValue();
                    } while (!i12.e(value4, a.b((a) value4, false, false, (String) null, (Integer) null, 14, (Object) null)));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B i13 = this.f63978i.f63940o;
            do {
                value = i13.getValue();
            } while (!i13.e(value, a.b((a) value, false, true, (String) null, (Integer) null, 13, (Object) null)));
            C16505B i14 = this.f63978i.f63940o;
            do {
                value2 = i14.getValue();
            } while (!i14.e(value2, a.b((a) value2, false, false, (String) null, (Integer) null, 14, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "discount", "LTf/u$a;", "uiData", "LTf/u$b;", "<anonymous>", "(Ljava/lang/String;LTf/u$a;)LTf/u$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.discount.DiscountViewModel$uiState$1", f = "DiscountViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends l implements q<String, a, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f63980c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f63981d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f63982e;

        g(C17164e<? super g> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(String str, a aVar, C17164e<? super b> eVar) {
            g gVar = new g(eVar);
            gVar.f63981d = str;
            gVar.f63982e = aVar;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f63980c == 0) {
                y.b(obj);
                String str = (String) this.f63981d;
                a aVar = (a) this.f63982e;
                String e10 = str == null ? aVar.e() : str;
                return (str == null || str.length() == 0) ? new b.a(e10, aVar.d(), aVar.c(), aVar.f()) : new b.C1115b(e10, aVar.d(), aVar.c(), aVar.f());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public u(h hVar, y yVar) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(yVar, "getCartDiscountUseCase");
        this.f63938m = hVar;
        C16532g<String> invoke = yVar.invoke();
        this.f63939n = invoke;
        C16505B<a> a10 = C16521S.a(new a(false, false, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null));
        this.f63940o = a10;
        this.f63941p = C16534i.c0(C16534i.n(invoke, a10, new g((C17164e<? super g>) null)), g0.a(this), ip.f.a(), new b.a((String) null, false, (Integer) null, false, 15, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final void D(Ln.b bVar) {
        a value;
        a aVar;
        int i10;
        C16505B<a> b10 = this.f63940o;
        do {
            value = b10.getValue();
            aVar = value;
            if (C17542s.e(bVar, b.C1665b.f83285a)) {
                i10 = C13068a.f111205b;
            } else if (C17542s.e(bVar, b.a.f83284a)) {
                i10 = C11849b.f102311k;
            } else if (C17542s.e(bVar, b.c.f83286a)) {
                i10 = C11849b.f102315l;
            } else if (C17542s.e(bVar, b.d.f83287a)) {
                i10 = C11849b.f102319m;
            } else if (C17542s.e(bVar, b.e.f83288a) || bVar == null) {
                i10 = Oo.b.f84321A3;
            } else {
                throw new t();
            }
        } while (!b10.e(value, a.b(aVar, false, false, (String) null, Integer.valueOf(i10), 7, (Object) null)));
    }

    public final void C(String str) {
        C17542s.j(str, "code");
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this), (T) null, new f(this, str, (C17164e<? super f>) null), 2, (Object) null);
    }

    public final void E(String str) {
        a value;
        C17542s.j(str, "input");
        C16505B<a> b10 = this.f63940o;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, false, false, C15854t.z1(str).toString(), (Integer) null, 3, (Object) null)));
    }

    public final void k(String str) {
        C17542s.j(str, "code");
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this), (T) null, new d(this, str, (C17164e<? super d>) null), 2, (Object) null);
    }

    public final C16519P<b> m() {
        return this.f63941p;
    }
}
