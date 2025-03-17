package Ei;

import Fi.C10713a;
import Gx.a;
import HJ.C15854t;
import Hx.c;
import IC.C13023e;
import IC.C13026h;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XC.C13802a;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Comparator;
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
import wi.C12272a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002DEB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020#0'8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b\u0019\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020,008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010\u001eR\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"LEi/E;", "Landroidx/lifecycle/f0;", "LXC/a;", "Landroidx/lifecycle/U;", "savedStateHandle", "LGx/a;", "purchaseHistoryRepository", "LFi/a;", "formatDateUseCase", "<init>", "(Landroidx/lifecycle/U;LGx/a;LFi/a;)V", "", "orderId", "rescheduleToken", "deliveryNumber", "LXH/N;", "H", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "G", "()V", "id", "A", "(Ljava/lang/String;)V", "f", "r", "m", "LGx/a;", "n", "LFi/a;", "o", "Ljava/lang/String;", "rescheduleOrderId", "p", "rescheduleDeliveryNumber", "LTJ/B;", "LXC/a$a;", "q", "LTJ/B;", "_uiState", "LTJ/P;", "LTJ/P;", "()LTJ/P;", "uiState", "Lip/b;", "LEi/E$b;", "s", "Lip/b;", "_sideEffect", "Landroidx/lifecycle/F;", "t", "Landroidx/lifecycle/F;", "I", "()Landroidx/lifecycle/F;", "sideEffect", "LHx/a;", "u", "LHx/a;", "deliveryTimeWindows", "v", "selectedGroupId", "LHx/h;", "w", "LHx/h;", "selectedSlot", "LEi/E$a;", "x", "LEi/E$a;", "rescheduleData", "b", "a", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.E  reason: case insensitive filesystem */
public final class C10670E extends f0 implements C13802a {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Gx.a f80366m;

    /* renamed from: n  reason: collision with root package name */
    private final C10713a f80367n;

    /* renamed from: o  reason: collision with root package name */
    private final String f80368o;

    /* renamed from: p  reason: collision with root package name */
    private final String f80369p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<C13802a.C2911a> f80370q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<C13802a.C2911a> f80371r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C11410b<b> f80372s;

    /* renamed from: t  reason: collision with root package name */
    private final F<b> f80373t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Hx.a f80374u;

    /* renamed from: v  reason: collision with root package name */
    private String f80375v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public Hx.h f80376w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public a f80377x;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"LEi/E$a;", "", "", "orderId", "rescheduleToken", "deliveryNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getDeliveryNumber", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.E$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f80378a;

        /* renamed from: b  reason: collision with root package name */
        private final String f80379b;

        /* renamed from: c  reason: collision with root package name */
        private final String f80380c;

        public a(String str, String str2, String str3) {
            C17542s.j(str, "orderId");
            C17542s.j(str2, "rescheduleToken");
            this.f80378a = str;
            this.f80379b = str2;
            this.f80380c = str3;
        }

        public final String a() {
            return this.f80378a;
        }

        public final String b() {
            return this.f80379b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f80378a, aVar.f80378a) && C17542s.e(this.f80379b, aVar.f80379b) && C17542s.e(this.f80380c, aVar.f80380c);
        }

        public int hashCode() {
            int hashCode = ((this.f80378a.hashCode() * 31) + this.f80379b.hashCode()) * 31;
            String str = this.f80380c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f80378a;
            String str2 = this.f80379b;
            String str3 = this.f80380c;
            return "RescheduleData(orderId=" + str + ", rescheduleToken=" + str2 + ", deliveryNumber=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LEi/E$b;", "", "<init>", "()V", "d", "a", "c", "e", "b", "LEi/E$b$a;", "LEi/E$b$b;", "LEi/E$b$c;", "LEi/E$b$d;", "LEi/E$b$e;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.E$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/E$b$a;", "LEi/E$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.E$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f80381a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1206740191;
            }

            public String toString() {
                return "FetchTimeSlotError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/E$b$b;", "LEi/E$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.E$b$b  reason: collision with other inner class name */
        public static final class C1518b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1518b f80382a = new C1518b();

            private C1518b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1518b);
            }

            public int hashCode() {
                return -383926547;
            }

            public String toString() {
                return "NoChange";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/E$b$c;", "LEi/E$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.E$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80383a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -257529383;
            }

            public String toString() {
                return "NoTimeWindows";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/E$b$d;", "LEi/E$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.E$b$d */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f80384a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1755533531;
            }

            public String toString() {
                return "SelectTimeSlotError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/E$b$e;", "LEi/E$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.E$b$e */
        public static final class e extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final e f80385a = new e();

            private e() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1192671641;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/E$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.E$c */
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10670E f80386a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, C10670E e10) {
            super(aVar);
            this.f80386a = e10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10670E e10 = this.f80386a;
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
                    String a10 = C11818a.a("Unable to reschedule order", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = e10.getClass().getName();
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
            this.f80386a.f80372s.setValue(b.d.f80384a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.RescheduleOrderViewModel$confirmSelection$2", f = "RescheduleOrderViewModel.kt", l = {190}, m = "invokeSuspend")
    /* renamed from: Ei.E$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80387c;

        /* renamed from: d  reason: collision with root package name */
        int f80388d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10670E f80389e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Hx.h f80390f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C10670E e10, Hx.h hVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f80389e = e10;
            this.f80390f = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f80389e, this.f80390f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80388d;
            if (i10 == 0) {
                y.b(obj);
                c.C2661c.C2663c cVar = null;
                this.f80389e.f80370q.setValue(new C13802a.C2911a.b(new C13023e.d(C12272a.f105847u, (List) null, 2, (DefaultConstructorMarker) null)));
                Gx.a j10 = this.f80389e.f80366m;
                a k10 = this.f80389e.f80377x;
                if (k10 == null) {
                    C17542s.z("rescheduleData");
                    k10 = null;
                }
                String a10 = k10.a();
                a k11 = this.f80389e.f80377x;
                if (k11 == null) {
                    C17542s.z("rescheduleData");
                    k11 = null;
                }
                String b10 = k11.b();
                String d10 = this.f80390f.d();
                boolean a11 = this.f80390f.a();
                Hx.a i11 = this.f80389e.f80374u;
                if (i11 != null) {
                    cVar = i11.c();
                }
                a.C2656a aVar = new a.C2656a(d10, a11, cVar);
                this.f80387c = i11;
                this.f80388d = 1;
                if (j10.g(a10, b10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Hx.a aVar2 = (Hx.a) this.f80387c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f80389e.f80372s.setValue(b.e.f80385a);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.E$e */
    public static final class e<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((Hx.h) t10).f(), ((Hx.h) t11).f());
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/E$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.E$f */
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10670E f80391a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, C10670E e10) {
            super(aVar);
            this.f80391a = e10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10670E e10 = this.f80391a;
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
                    String a10 = C11818a.a("Unable to fetch time windows", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = e10.getClass().getName();
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
            this.f80391a.f80372s.setValue(b.a.f80381a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.RescheduleOrderViewModel$fetchTimeWindows$2", f = "RescheduleOrderViewModel.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: Ei.E$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80392c;

        /* renamed from: d  reason: collision with root package name */
        int f80393d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f80394e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10670E f80395f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f80396g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f80397h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f80398i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C10670E e10, String str, String str2, String str3, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f80395f = e10;
            this.f80396g = str;
            this.f80397h = str2;
            this.f80398i = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f80395f, this.f80396g, this.f80397h, this.f80398i, eVar);
            gVar.f80394e = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            C10670E e10;
            Object f10 = C17187b.f();
            int i10 = this.f80393d;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f80394e;
                this.f80395f.f80370q.setValue(new C13802a.C2911a.c(C13026h.a(C12272a.f105851w), (C13023e) null));
                C10670E e11 = this.f80395f;
                Gx.a j10 = e11.f80366m;
                String str = this.f80396g;
                String str2 = this.f80397h;
                String str3 = this.f80398i;
                this.f80394e = q10;
                this.f80392c = e11;
                this.f80393d = 1;
                Object d10 = j10.d(str, str2, str3, this);
                if (d10 == f10) {
                    return f10;
                }
                e10 = e11;
                obj = d10;
            } else if (i10 == 1) {
                e10 = (C10670E) this.f80392c;
                q10 = (Q) this.f80394e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e10.f80374u = (Hx.a) C16877v.y0(((Hx.g) obj).a());
            if (this.f80395f.f80374u != null) {
                this.f80395f.G();
            } else {
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str4 = null;
                String str5 = null;
                for (C11819b bVar : arrayList) {
                    if (str4 == null) {
                        String a10 = C11818a.a("No time slots returned", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str4 = C11820c.a(a10);
                    }
                    String str6 = str4;
                    if (str5 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str7 = str5;
                    bVar.a(eVar, str7, false, (Throwable) null, str6);
                    str4 = str6;
                    str5 = str7;
                }
                this.f80395f.f80372s.setValue(b.c.f80383a);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/E$h", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.E$h */
    public static final class h extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10670E f80399a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(N.a aVar, C10670E e10) {
            super(aVar);
            this.f80399a = e10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10670E e10 = this.f80399a;
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
                    String a10 = C11818a.a("Unable to select slot", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = e10.getClass().getName();
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
            this.f80399a.f80372s.setValue(b.d.f80384a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.RescheduleOrderViewModel$selectSlot$2", f = "RescheduleOrderViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.E$i */
    static final class i extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10670E f80401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f80402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C10670E e10, String str, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f80401d = e10;
            this.f80402e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f80401d, this.f80402e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            List<Hx.h> b10;
            Object obj2;
            C17187b.f();
            if (this.f80400c == 0) {
                y.b(obj);
                C10670E e10 = this.f80401d;
                Hx.a i10 = e10.f80374u;
                if (!(i10 == null || (b10 = i10.b()) == null)) {
                    String str = this.f80402e;
                    Iterator it = b10.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C17542s.e(((Hx.h) obj2).d(), str)) {
                            break;
                        }
                    }
                    Hx.h hVar = (Hx.h) obj2;
                    if (hVar != null) {
                        e10.f80376w = hVar;
                        this.f80401d.G();
                        return C16807N.f139792a;
                    }
                }
                String str2 = this.f80402e;
                throw new IllegalArgumentException("Slot not found: " + str2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C10670E(U u10, Gx.a aVar, C10713a aVar2) {
        c.d.e eVar;
        Iterator it;
        Object obj;
        Iterator it2;
        U u11 = u10;
        Gx.a aVar3 = aVar;
        C10713a aVar4 = aVar2;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(aVar3, "purchaseHistoryRepository");
        C17542s.j(aVar4, "formatDateUseCase");
        this.f80366m = aVar3;
        this.f80367n = aVar4;
        Object f10 = u11.f("orderId");
        if (f10 != null) {
            String str = (String) f10;
            this.f80368o = str;
            String str2 = (String) u11.f("deliveryNumber");
            this.f80369p = str2;
            String str3 = null;
            C16505B<C13802a.C2911a> a10 = C16521S.a(new C13802a.C2911a.c(C13026h.a(C12272a.f105851w), (C13023e) null));
            this.f80370q = a10;
            this.f80371r = C16534i.c(a10);
            C11410b<b> bVar = new C11410b<>();
            this.f80372s = bVar;
            this.f80373t = bVar;
            Hx.c i10 = aVar3.i(str);
            Class<C10670E> cls = C10670E.class;
            if (i10 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Unable to find purchase in cache");
                qv.e eVar2 = qv.e.ERROR;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList.iterator();
                String str4 = null;
                String str5 = null;
                while (it3.hasNext()) {
                    C11819b bVar2 = (C11819b) it3.next();
                    if (str4 == null) {
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 == null) {
                            break;
                        }
                        str4 = C11820c.a(a11);
                    }
                    if (str5 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        it2 = it3;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        it2 = it3;
                    }
                    bVar2.a(eVar2, str5, false, illegalStateException, str4);
                    it3 = it2;
                }
                this.f80372s.setValue(b.a.f80381a);
                return;
            }
            if (str2 == null || C15854t.v0(str2)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : i10.c()) {
                    if (next2 instanceof c.d.e) {
                        arrayList2.add(next2);
                    }
                }
                eVar = (c.d.e) C16877v.y0(arrayList2);
            } else {
                Iterator it4 = i10.g().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it4.next();
                    if (C17542s.e(((c.C2661c) obj).e(), this.f80369p)) {
                        break;
                    }
                }
                c.C2661c cVar = (c.C2661c) obj;
                eVar = cVar != null ? cVar.h() : null;
            }
            if ((eVar != null ? eVar.b() : null) == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Unable to find reschedule action, delivery number: " + this.f80369p);
                qv.e eVar3 = qv.e.ERROR;
                ArrayList arrayList3 = new ArrayList();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it5 = arrayList3.iterator();
                String str6 = null;
                String str7 = null;
                while (it5.hasNext()) {
                    C11819b bVar3 = (C11819b) it5.next();
                    if (str6 == null) {
                        String a12 = C11818a.a(str3, illegalStateException2);
                        if (a12 == null) {
                            break;
                        }
                        str6 = C11820c.a(a12);
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        it = it5;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', str3, 2, str3), '.', str3, 2, str3);
                        name2 = o13.length() != 0 ? C15854t.P0(o13, "Kt") : name2;
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        it = it5;
                    }
                    bVar3.a(eVar3, str7, false, illegalStateException2, str6);
                    str3 = null;
                    it5 = it;
                }
                this.f80372s.setValue(b.a.f80381a);
                return;
            }
            String str8 = this.f80368o;
            String b10 = eVar.b();
            if (b10 != null) {
                H(str8, b10, this.f80369p);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        r6 = (Hx.h) YH.C16877v.y0(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G() {
        /*
            r24 = this;
            r0 = r24
            Hx.a r1 = r0.f80374u
            if (r1 == 0) goto L_0x0195
            java.util.List r2 = r1.b()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r2.next()
            r5 = r4
            Hx.h r5 = (Hx.h) r5
            Hx.h$b r5 = r5.e()
            java.lang.String r5 = r5.a()
            java.lang.Object r6 = r3.get(r5)
            if (r6 != 0) goto L_0x0038
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.put(r5, r6)
        L_0x0038:
            java.util.List r6 = (java.util.List) r6
            r6.add(r4)
            goto L_0x0015
        L_0x003e:
            java.util.Map r2 = YH.X.z(r3)
            java.util.Map r2 = Ei.C10671F.a(r2)
            java.util.SortedMap r2 = YH.X.h(r2)
            java.lang.String r3 = r0.f80375v
            if (r3 == 0) goto L_0x005a
            java.util.List r4 = YH.C16877v.n()
            java.lang.Object r3 = r2.getOrDefault(r3, r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x005e
        L_0x005a:
            java.util.List r3 = YH.C16877v.n()
        L_0x005e:
            Hx.h r4 = r0.f80376w
            if (r4 == 0) goto L_0x0068
            java.lang.String r5 = r4.d()
            if (r5 != 0) goto L_0x0070
        L_0x0068:
            Hx.h$a r5 = r1.a()
            java.lang.String r5 = r5.b()
        L_0x0070:
            java.util.Collection r6 = r2.values()
            java.lang.String r7 = "<get-values>(...)"
            kotlin.jvm.internal.C17542s.i(r6, r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = YH.C16877v.x0(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = YH.C16877v.y0(r6)
            Hx.h r6 = (Hx.h) r6
            if (r6 == 0) goto L_0x0091
            java.lang.String r6 = r6.b()
            goto L_0x0092
        L_0x0091:
            r6 = r7
        L_0x0092:
            TJ.B<XC.a$a> r8 = r0.f80370q
            int r9 = wi.C12272a.f105851w
            IC.e r11 = IC.C13026h.a(r9)
            XC.a$a$a$a r13 = new XC.a$a$a$a
            IC.e$d r9 = new IC.e$d
            int r10 = wi.C12272a.f105849v
            r12 = 2
            r9.<init>(r10, r7, r12, r7)
            IC.e$b r10 = new IC.e$b
            Hx.h$a r14 = r1.a()
            java.lang.String r14 = r14.a()
            r10.<init>(r14)
            Hx.c$c$c r1 = r1.c()
            r14 = 0
            int r1 = zi.C12519b.b(r1, r14)
            r13.<init>(r9, r10, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r9 = r2.size()
            r1.<init>(r9)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00ce:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0125
            java.lang.Object r9 = r2.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            Fi.a r10 = r0.f80367n
            java.lang.Object r15 = r9.getKey()
            java.lang.String r14 = "<get-key>(...)"
            kotlin.jvm.internal.C17542s.i(r15, r14)
            java.lang.String r15 = (java.lang.String) r15
            Fi.a$a r10 = r10.a(r6, r15)
            java.lang.Object r15 = r9.getKey()
            kotlin.jvm.internal.C17542s.i(r15, r14)
            r18 = r15
            java.lang.String r18 = (java.lang.String) r18
            java.lang.Object r14 = r9.getKey()
            java.lang.String r15 = r0.f80375v
            boolean r20 = kotlin.jvm.internal.C17542s.e(r14, r15)
            java.lang.String r21 = r10.b()
            java.lang.String r22 = r10.a()
            java.lang.Object r9 = r9.getValue()
            java.lang.String r10 = "<get-value>(...)"
            kotlin.jvm.internal.C17542s.i(r9, r10)
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            r19 = r9 ^ 1
            XC.a$a$a$d r9 = new XC.a$a$a$d
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            r1.add(r9)
            r14 = 0
            goto L_0x00ce
        L_0x0125:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            Ei.E$e r2 = new Ei.E$e
            r2.<init>()
            java.util.List r2 = YH.C16877v.g1(r3, r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r15 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r2, r3)
            r15.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0141:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016e
            java.lang.Object r3 = r2.next()
            Hx.h r3 = (Hx.h) r3
            XC.a$a$a$c r6 = new XC.a$a$a$c
            java.lang.String r18 = r3.d()
            java.lang.String r9 = r3.d()
            boolean r19 = kotlin.jvm.internal.C17542s.e(r5, r9)
            java.lang.String r20 = r3.f()
            r22 = 8
            r23 = 0
            r21 = 0
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r15.add(r6)
            goto L_0x0141
        L_0x016e:
            XC.a$a$a$b r2 = new XC.a$a$a$b
            IC.e$d r3 = new IC.e$d
            if (r4 == 0) goto L_0x0179
            java.lang.String r4 = r4.c()
            goto L_0x017a
        L_0x0179:
            r4 = r7
        L_0x017a:
            if (r4 == 0) goto L_0x017f
            int r4 = wi.C12272a.f105833n
            goto L_0x0181
        L_0x017f:
            int r4 = wi.C12272a.f105835o
        L_0x0181:
            r3.<init>(r4, r7, r12, r7)
            r4 = 0
            r2.<init>(r4, r3)
            XC.a$a$a r3 = new XC.a$a$a
            r12 = 0
            r10 = r3
            r14 = r1
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.setValue(r3)
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.C10670E.G():void");
    }

    private final void H(String str, String str2, String str3) {
        this.f80377x = new a(str, str2, str3);
        F0 unused = C16314k.d(g0.a(this), new f(N.f137593c0, this), (T) null, new g(this, str, str2, str3, (C17164e<? super g>) null), 2, (Object) null);
    }

    public void A(String str) {
        C17542s.j(str, "id");
        F0 unused = C16314k.d(g0.a(this), new h(N.f137593c0, this), (T) null, new i(this, str, (C17164e<? super i>) null), 2, (Object) null);
    }

    public final F<b> I() {
        return this.f80373t;
    }

    public void f(String str) {
        C17542s.j(str, "id");
        this.f80375v = str;
        G();
    }

    public C16519P<C13802a.C2911a> m() {
        return this.f80371r;
    }

    public void r() {
        Hx.h hVar = this.f80376w;
        if (hVar == null) {
            this.f80372s.setValue(b.C1518b.f80382a);
        } else {
            F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this), (T) null, new d(this, hVar, (C17164e<? super d>) null), 2, (Object) null);
        }
    }
}
