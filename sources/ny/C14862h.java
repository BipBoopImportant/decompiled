package ny;

import HJ.C15854t;
import KJ.C15985a;
import KJ.C15987c;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
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
import nI.s;
import ny.C14855a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0003MNOB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0002048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110<088\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010:R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d088\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010:R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A088\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010:R\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b*\u0010HR\u0014\u0010L\u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006P"}, d2 = {"Lny/h;", "Landroidx/lifecycle/f0;", "Lsf/c;", "userDataRepository", "Ltf/a;", "killSwitchRepository", "LIl/c;", "marketConfigRemoteDataSource", "LIl/a;", "appConfigApi", "LaA/a;", "sessionManager", "<init>", "(Lsf/c;Ltf/a;LIl/c;LIl/a;LaA/a;)V", "LXH/N;", "K", "()V", "LRl/d;", "O", "()LRl/d;", "LRl/f;", "N", "(LRl/d;)LRl/f;", "", "languageCode", "R", "(Ljava/lang/String;)V", "marketCode", "S", "", "logoutUser", "Q", "(Z)V", "newMarketCode", "newLanguageCode", "LIl/b;", "M", "(Ljava/lang/String;Ljava/lang/String;)LIl/b;", "Lny/h$a;", "action", "P", "(Lny/h$a;)V", "m", "Lsf/c;", "n", "Ltf/a;", "o", "LIl/c;", "p", "LIl/a;", "q", "LaA/a;", "Lny/h$c;", "r", "Lny/h$c;", "currentSavedSelection", "LTJ/B;", "s", "LTJ/B;", "currentSelectionFlow", "", "t", "marketsFlow", "u", "loading", "Lny/h$b;", "v", "event", "LTJ/P;", "Lny/a;", "w", "LTJ/P;", "()LTJ/P;", "uiState", "L", "()Z", "requireLogout", "c", "a", "b", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ny.h  reason: case insensitive filesystem */
public final class C14862h extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C10242c f129921m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C10253a f129922n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Il.c f129923o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Il.a f129924p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C13909a f129925q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public c f129926r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<c> f129927s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<List<Rl.d>> f129928t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<Boolean> f129929u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<b> f129930v;

    /* renamed from: w  reason: collision with root package name */
    private final C16519P<C14855a> f129931w;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lny/h$a;", "", "<init>", "()V", "a", "d", "c", "b", "Lny/h$a$a;", "Lny/h$a$b;", "Lny/h$a$c;", "Lny/h$a$d;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.h$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lny/h$a$a;", "Lny/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$a$a  reason: collision with other inner class name */
        public static final class C3199a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C3199a f129932a = new C3199a();

            private C3199a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3199a);
            }

            public int hashCode() {
                return 1161177667;
            }

            public String toString() {
                return "EventHandled";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lny/h$a$b;", "Lny/h$a;", "", "languageCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$a$b */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f129933a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "languageCode");
                this.f129933a = str;
            }

            public final String a() {
                return this.f129933a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f129933a, ((b) obj).f129933a);
            }

            public int hashCode() {
                return this.f129933a.hashCode();
            }

            public String toString() {
                String str = this.f129933a;
                return "LanguageSelected(languageCode=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lny/h$a$c;", "Lny/h$a;", "", "marketCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$a$c */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f129934a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "marketCode");
                this.f129934a = str;
            }

            public final String a() {
                return this.f129934a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f129934a, ((c) obj).f129934a);
            }

            public int hashCode() {
                return this.f129934a.hashCode();
            }

            public String toString() {
                String str = this.f129934a;
                return "MarketSelected(marketCode=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lny/h$a$d;", "Lny/h$a;", "", "logoutUser", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$a$d */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f129935a;

            public d(boolean z10) {
                super((DefaultConstructorMarker) null);
                this.f129935a = z10;
            }

            public final boolean a() {
                return this.f129935a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f129935a == ((d) obj).f129935a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f129935a);
            }

            public String toString() {
                boolean z10 = this.f129935a;
                return "SaveCurrentSettings(logoutUser=" + z10 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lny/h$b;", "", "<init>", "()V", "d", "c", "a", "b", "Lny/h$b$a;", "Lny/h$b$b;", "Lny/h$b$c;", "Lny/h$b$d;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.h$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lny/h$b$a;", "Lny/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f129936a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 908021933;
            }

            public String toString() {
                return "Close";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lny/h$b$b;", "Lny/h$b;", "LIl/b;", "resultCode", "<init>", "(LIl/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIl/b;", "()LIl/b;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$b$b  reason: collision with other inner class name */
        public static final class C3200b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Il.b f129937a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3200b(Il.b bVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(bVar, "resultCode");
                this.f129937a = bVar;
            }

            public final Il.b a() {
                return this.f129937a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3200b) && this.f129937a == ((C3200b) obj).f129937a;
            }

            public int hashCode() {
                return this.f129937a.hashCode();
            }

            public String toString() {
                Il.b bVar = this.f129937a;
                return "Done(resultCode=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lny/h$b$c;", "Lny/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f129938a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 910050493;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lny/h$b$d;", "Lny/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.h$b$d */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f129939a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1655899787;
            }

            public String toString() {
                return "Logout";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lny/h$c;", "", "LRl/d;", "market", "", "selectedLanguageName", "selectedLanguageCode", "<init>", "(LRl/d;Ljava/lang/String;Ljava/lang/String;)V", "a", "(LRl/d;Ljava/lang/String;Ljava/lang/String;)Lny/h$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LRl/d;", "c", "()LRl/d;", "b", "Ljava/lang/String;", "e", "d", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.h$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Rl.d f129940a;

        /* renamed from: b  reason: collision with root package name */
        private final String f129941b;

        /* renamed from: c  reason: collision with root package name */
        private final String f129942c;

        public c(Rl.d dVar, String str, String str2) {
            C17542s.j(dVar, "market");
            C17542s.j(str, "selectedLanguageName");
            C17542s.j(str2, "selectedLanguageCode");
            this.f129940a = dVar;
            this.f129941b = str;
            this.f129942c = str2;
        }

        public static /* synthetic */ c b(c cVar, Rl.d dVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                dVar = cVar.f129940a;
            }
            if ((i10 & 2) != 0) {
                str = cVar.f129941b;
            }
            if ((i10 & 4) != 0) {
                str2 = cVar.f129942c;
            }
            return cVar.a(dVar, str, str2);
        }

        public final c a(Rl.d dVar, String str, String str2) {
            C17542s.j(dVar, "market");
            C17542s.j(str, "selectedLanguageName");
            C17542s.j(str2, "selectedLanguageCode");
            return new c(dVar, str, str2);
        }

        public final Rl.d c() {
            return this.f129940a;
        }

        public final String d() {
            return this.f129942c;
        }

        public final String e() {
            return this.f129941b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f129940a, cVar.f129940a) && C17542s.e(this.f129941b, cVar.f129941b) && C17542s.e(this.f129942c, cVar.f129942c);
        }

        public int hashCode() {
            return (((this.f129940a.hashCode() * 31) + this.f129941b.hashCode()) * 31) + this.f129942c.hashCode();
        }

        public String toString() {
            Rl.d dVar = this.f129940a;
            String str = this.f129941b;
            String str2 = this.f129942c;
            return "SelectionValues(market=" + dVar + ", selectedLanguageName=" + str + ", selectedLanguageCode=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ny/h$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.h$d */
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14862h f129943a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, C14862h hVar) {
            super(aVar);
            this.f129943a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C14862h hVar = this.f129943a;
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
            this.f129943a.f129930v.setValue(b.c.f129938a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.RegionAndLanguageViewModel$fetchMarketsAndUpdateUi$3", f = "RegionAndLanguageViewModel.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: ny.h$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129944c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f129945d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14862h f129946e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14862h hVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f129946e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f129946e, eVar);
            eVar2.f129945d = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            c cVar;
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f129944c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f129945d;
                this.f129946e.f129929u.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                Il.c E10 = this.f129946e.f129923o;
                this.f129945d = q11;
                this.f129944c = 1;
                obj2 = E10.b(this);
                if (obj2 == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                q10 = (Q) this.f129945d;
                try {
                    y.b(obj);
                    obj2 = obj;
                } catch (Throwable th2) {
                    this.f129946e.f129929u.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f129946e.f129928t.setValue((List) obj2);
            Rl.d I10 = this.f129946e.O();
            Rl.f H10 = I10 != null ? this.f129946e.N(I10) : null;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("stored market: " + I10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = q10.getClass().getName();
                    C17542s.g(name);
                    String str5 = DslKt.INDICATOR_BACKGROUND;
                    String str6 = name;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    String P02 = o12.length() == 0 ? str6 : C15854t.P0(o12, "Kt");
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str5) + DslKt.INDICATOR_SEPARATOR + P02;
                }
                String str7 = str3;
                bVar.a(eVar, str7, false, (Throwable) null, str4);
                str3 = str7;
                str2 = str4;
            }
            String str8 = DslKt.INDICATOR_BACKGROUND;
            if (I10 == null || H10 == null) {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it = arrayList2.iterator();
                String str9 = null;
                String str10 = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11819b bVar2 = (C11819b) it.next();
                    if (str10 == null) {
                        String a11 = C11818a.a("initial state not found", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str10 = C11820c.a(a11);
                    }
                    if (str9 == null) {
                        String name2 = q10.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str8) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str9, false, (Throwable) null, str10);
                }
                this.f129946e.f129930v.setValue(b.c.f129938a);
            } else {
                this.f129946e.f129926r = new c(I10, H10.b(), H10.a());
                C14862h hVar = this.f129946e;
                qv.e eVar3 = qv.e.DEBUG;
                ArrayList arrayList3 = new ArrayList();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                String str11 = null;
                String str12 = null;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C11819b bVar3 = (C11819b) it2.next();
                    if (str11 == null) {
                        c i11 = hVar.f129926r;
                        if (i11 == null) {
                            C17542s.z("currentSavedSelection");
                            i11 = null;
                        }
                        String a12 = C11818a.a("update initial state: " + i11, (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str11 = C11820c.a(a12);
                    }
                    String str13 = str11;
                    if (str12 == null) {
                        String name3 = q10.getClass().getName();
                        C17542s.g(name3);
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str8) + DslKt.INDICATOR_SEPARATOR + name3;
                    } else {
                        str = str12;
                    }
                    bVar3.a(eVar3, str, false, (Throwable) null, str13);
                    str11 = str13;
                    str12 = str;
                }
                C16505B j10 = this.f129946e.f129927s;
                c i12 = this.f129946e.f129926r;
                if (i12 == null) {
                    C17542s.z("currentSavedSelection");
                    cVar = null;
                } else {
                    cVar = i12;
                }
                j10.setValue(cVar);
            }
            this.f129946e.f129929u.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ny/h$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.h$f */
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14862h f129947a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, C14862h hVar) {
            super(aVar);
            this.f129947a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C14862h hVar = this.f129947a;
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
            this.f129947a.f129930v.setValue(b.c.f129938a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.RegionAndLanguageViewModel$saveCurrentSettings$2", f = "RegionAndLanguageViewModel.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: ny.h$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14862h f129949d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C14862h hVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f129949d = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f129949d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f129948c;
            if (i10 == 0) {
                y.b(obj);
                C13909a G10 = this.f129949d.f129925q;
                this.f129948c = 1;
                if (C13909a.C2951a.a(G10, false, false, this, 1, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.RegionAndLanguageViewModel$saveCurrentSettings$5", f = "RegionAndLanguageViewModel.kt", l = {309, 317, 323}, m = "invokeSuspend")
    /* renamed from: ny.h$h  reason: collision with other inner class name */
    static final class C3201h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f129950c;

        /* renamed from: d  reason: collision with root package name */
        int f129951d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f129952e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14862h f129953f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f129954g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f129955h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f129956i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Il.b f129957j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3201h(C14862h hVar, String str, String str2, c cVar, Il.b bVar, C17164e<? super C3201h> eVar) {
            super(2, eVar);
            this.f129953f = hVar;
            this.f129954g = str;
            this.f129955h = str2;
            this.f129956i = cVar;
            this.f129957j = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3201h hVar = new C3201h(this.f129953f, this.f129954g, this.f129955h, this.f129956i, this.f129957j, eVar);
            hVar.f129952e = obj;
            return hVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3201h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0095 A[Catch:{ all -> 0x0021 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[Catch:{ all -> 0x0021 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0 A[Catch:{ all -> 0x0021 }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0179 A[SYNTHETIC, Splitter:B:65:0x0179] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0152 A[EDGE_INSN: B:77:0x0152->B:62:0x0152 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f129951d
                r3 = 3
                r4 = 0
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0049
                if (r2 == r6) goto L_0x003f
                if (r2 == r5) goto L_0x002c
                if (r2 != r3) goto L_0x0024
                java.lang.Object r0 = r1.f129950c
                com.ingka.ikea.killswitch.model.KillSwitchConfig r0 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r0
                java.lang.Object r0 = r1.f129952e
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r18)     // Catch:{ all -> 0x0021 }
                goto L_0x00a9
            L_0x0021:
                r0 = move-exception
                goto L_0x0189
            L_0x0024:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x002c:
                java.lang.Object r2 = r1.f129950c
                com.ingka.ikea.killswitch.model.KillSwitchConfig r2 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r2
                java.lang.Object r7 = r1.f129952e
                QJ.Q r7 = (QJ.Q) r7
                XH.y.b(r18)     // Catch:{ all -> 0x0021 }
                r8 = r18
                r16 = r7
                r7 = r2
                r2 = r16
                goto L_0x008d
            L_0x003f:
                java.lang.Object r2 = r1.f129952e
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r18)     // Catch:{ all -> 0x0021 }
                r7 = r18
                goto L_0x0072
            L_0x0049:
                XH.y.b(r18)
                java.lang.Object r2 = r1.f129952e
                QJ.Q r2 = (QJ.Q) r2
                ny.h r7 = r1.f129953f     // Catch:{ all -> 0x0021 }
                TJ.B r7 = r7.f129929u     // Catch:{ all -> 0x0021 }
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r6)     // Catch:{ all -> 0x0021 }
                r7.setValue(r8)     // Catch:{ all -> 0x0021 }
                ny.h r7 = r1.f129953f     // Catch:{ all -> 0x0021 }
                tf.a r7 = r7.f129922n     // Catch:{ all -> 0x0021 }
                java.lang.String r8 = r1.f129954g     // Catch:{ all -> 0x0021 }
                java.lang.String r9 = r1.f129955h     // Catch:{ all -> 0x0021 }
                r1.f129952e = r2     // Catch:{ all -> 0x0021 }
                r1.f129951d = r6     // Catch:{ all -> 0x0021 }
                java.lang.Object r7 = r7.B(r8, r9, r4, r1)     // Catch:{ all -> 0x0021 }
                if (r7 != r0) goto L_0x0072
                return r0
            L_0x0072:
                com.ingka.ikea.killswitch.model.KillSwitchConfig r7 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r7     // Catch:{ all -> 0x0021 }
                if (r7 == 0) goto L_0x0181
                ny.h r8 = r1.f129953f     // Catch:{ all -> 0x0021 }
                Il.a r8 = r8.f129924p     // Catch:{ all -> 0x0021 }
                java.lang.String r9 = r1.f129954g     // Catch:{ all -> 0x0021 }
                java.lang.String r10 = r1.f129955h     // Catch:{ all -> 0x0021 }
                r1.f129952e = r2     // Catch:{ all -> 0x0021 }
                r1.f129950c = r7     // Catch:{ all -> 0x0021 }
                r1.f129951d = r5     // Catch:{ all -> 0x0021 }
                java.lang.Object r8 = r8.y(r9, r10, r1)     // Catch:{ all -> 0x0021 }
                if (r8 != r0) goto L_0x008d
                return r0
            L_0x008d:
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0021 }
                boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0021 }
                if (r8 == 0) goto L_0x0179
                ny.h r8 = r1.f129953f     // Catch:{ all -> 0x0021 }
                tf.a r8 = r8.f129922n     // Catch:{ all -> 0x0021 }
                r1.f129952e = r2     // Catch:{ all -> 0x0021 }
                r1.f129950c = r7     // Catch:{ all -> 0x0021 }
                r1.f129951d = r3     // Catch:{ all -> 0x0021 }
                java.lang.Object r3 = r8.F(r7, r1)     // Catch:{ all -> 0x0021 }
                if (r3 != r0) goto L_0x00a8
                return r0
            L_0x00a8:
                r0 = r2
            L_0x00a9:
                qv.e r2 = qv.e.DEBUG     // Catch:{ all -> 0x0021 }
                qv.d r3 = qv.d.f102012a     // Catch:{ all -> 0x0021 }
                java.util.List r3 = r3.a()     // Catch:{ all -> 0x0021 }
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x0021 }
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0021 }
                r7.<init>()     // Catch:{ all -> 0x0021 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0021 }
            L_0x00bc:
                boolean r8 = r3.hasNext()     // Catch:{ all -> 0x0021 }
                if (r8 == 0) goto L_0x00d3
                java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0021 }
                r9 = r8
                qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x0021 }
                boolean r9 = r9.b(r2, r4)     // Catch:{ all -> 0x0021 }
                if (r9 == 0) goto L_0x00bc
                r7.add(r8)     // Catch:{ all -> 0x0021 }
                goto L_0x00bc
            L_0x00d3:
                java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x0021 }
                r13 = 0
                r7 = r13
                r8 = r7
            L_0x00da:
                boolean r9 = r3.hasNext()     // Catch:{ all -> 0x0021 }
                if (r9 == 0) goto L_0x0152
                java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x0021 }
                qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x0021 }
                r11 = 0
                if (r7 != 0) goto L_0x00f6
                java.lang.String r7 = "New market setting updated"
                java.lang.String r7 = qv.C11818a.a(r7, r11)     // Catch:{ all -> 0x0021 }
                if (r7 != 0) goto L_0x00f2
                goto L_0x0152
            L_0x00f2:
                java.lang.String r7 = qv.C11820c.a(r7)     // Catch:{ all -> 0x0021 }
            L_0x00f6:
                r14 = r7
                if (r8 != 0) goto L_0x0146
                java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x0021 }
                java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0021 }
                kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ all -> 0x0021 }
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r7, r8, r13, r5, r13)     // Catch:{ all -> 0x0021 }
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r13, r5, r13)     // Catch:{ all -> 0x0021 }
                int r10 = r8.length()     // Catch:{ all -> 0x0021 }
                if (r10 != 0) goto L_0x0117
                goto L_0x011d
            L_0x0117:
                java.lang.String r7 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r8, r7)     // Catch:{ all -> 0x0021 }
            L_0x011d:
                java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0021 }
                java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0021 }
                java.lang.String r10 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r10, r6)     // Catch:{ all -> 0x0021 }
                if (r8 == 0) goto L_0x0130
                java.lang.String r8 = "m"
                goto L_0x0132
            L_0x0130:
                java.lang.String r8 = "b"
            L_0x0132:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
                r10.<init>()     // Catch:{ all -> 0x0021 }
                r10.append(r8)     // Catch:{ all -> 0x0021 }
                java.lang.String r8 = "|"
                r10.append(r8)     // Catch:{ all -> 0x0021 }
                r10.append(r7)     // Catch:{ all -> 0x0021 }
                java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0021 }
            L_0x0146:
                r15 = r8
                r10 = 0
                r7 = r9
                r8 = r2
                r9 = r15
                r12 = r14
                r7.a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0021 }
                r7 = r14
                r8 = r15
                goto L_0x00da
            L_0x0152:
                ny.h r0 = r1.f129953f     // Catch:{ all -> 0x0021 }
                ny.h$c r2 = r1.f129956i     // Catch:{ all -> 0x0021 }
                r0.f129926r = r2     // Catch:{ all -> 0x0021 }
                ny.h r0 = r1.f129953f     // Catch:{ all -> 0x0021 }
                TJ.B r0 = r0.f129930v     // Catch:{ all -> 0x0021 }
                ny.h$b$b r2 = new ny.h$b$b     // Catch:{ all -> 0x0021 }
                Il.b r3 = r1.f129957j     // Catch:{ all -> 0x0021 }
                r2.<init>(r3)     // Catch:{ all -> 0x0021 }
                r0.setValue(r2)     // Catch:{ all -> 0x0021 }
                ny.h r0 = r1.f129953f
                TJ.B r0 = r0.f129929u
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r4)
                r0.setValue(r2)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0179:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0021 }
                java.lang.String r2 = "Couldn't update market config."
                r0.<init>(r2)     // Catch:{ all -> 0x0021 }
                throw r0     // Catch:{ all -> 0x0021 }
            L_0x0181:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0021 }
                java.lang.String r2 = "KillSwitchConfig is null"
                r0.<init>(r2)     // Catch:{ all -> 0x0021 }
                throw r0     // Catch:{ all -> 0x0021 }
            L_0x0189:
                ny.h r2 = r1.f129953f
                TJ.B r2 = r2.f129929u
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r4)
                r2.setValue(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ny.C14862h.C3201h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "LRl/d;", "markets", "Lny/h$c;", "selected", "", "loading", "Lny/h$b;", "event", "Lny/a$a;", "<anonymous>", "(Ljava/util/List;Lny/h$c;ZLny/h$b;)Lny/a$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.RegionAndLanguageViewModel$uiState$1", f = "RegionAndLanguageViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ny.h$i */
    static final class i extends l implements s<List<? extends Rl.d>, c, Boolean, b, C17164e<? super C14855a.C3195a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129958c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f129959d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f129960e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f129961f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f129962g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C14862h f129963h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C14862h hVar, C17164e<? super i> eVar) {
            super(5, eVar);
            this.f129963h = hVar;
        }

        public final Object i(List<Rl.d> list, c cVar, boolean z10, b bVar, C17164e<? super C14855a.C3195a> eVar) {
            i iVar = new i(this.f129963h, eVar);
            iVar.f129959d = list;
            iVar.f129960e = cVar;
            iVar.f129961f = z10;
            iVar.f129962g = bVar;
            return iVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f129958c == 0) {
                y.b(obj);
                List list = (List) this.f129959d;
                c cVar = (c) this.f129960e;
                boolean z10 = this.f129961f;
                b bVar = (b) this.f129962g;
                c i10 = this.f129963h.f129926r;
                if (i10 == null) {
                    C17542s.z("currentSavedSelection");
                    i10 = null;
                }
                boolean z11 = !C17542s.e(i10, cVar);
                Iterable<Rl.d> iterable = list;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (Rl.d dVar : iterable) {
                    arrayList.add(new C14855a.C3195a.b(dVar.c(), dVar.a()));
                }
                C15987c h10 = C15985a.h(arrayList);
                Iterable<Rl.f> b10 = cVar.c().b();
                ArrayList arrayList2 = new ArrayList(C16877v.y(b10, 10));
                for (Rl.f fVar : b10) {
                    arrayList2.add(new C14855a.C3195a.C3196a(fVar.b(), fVar.a()));
                }
                return new C14855a.C3195a(h10, C15985a.h(arrayList2), new C14855a.C3195a.c(cVar.c().c(), cVar.e()), z11, z10, bVar);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i((List) obj, (c) obj2, ((Boolean) obj3).booleanValue(), (b) obj4, (C17164e) obj5);
        }
    }

    public C14862h(C10242c cVar, C10253a aVar, Il.c cVar2, Il.a aVar2, C13909a aVar3) {
        C17542s.j(cVar, "userDataRepository");
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(cVar2, "marketConfigRemoteDataSource");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(aVar3, "sessionManager");
        this.f129921m = cVar;
        this.f129922n = aVar;
        this.f129923o = cVar2;
        this.f129924p = aVar2;
        this.f129925q = aVar3;
        C16505B<c> a10 = C16521S.a(null);
        this.f129927s = a10;
        C16505B<List<Rl.d>> a11 = C16521S.a(C16877v.n());
        this.f129928t = a11;
        C16505B<Boolean> a12 = C16521S.a(Boolean.FALSE);
        this.f129929u = a12;
        C16505B<b> a13 = C16521S.a(null);
        this.f129930v = a13;
        this.f129931w = C16534i.c0(C16534i.l(a11, C16534i.A(a10), a12, a13, new i(this, (C17164e<? super i>) null)), g0.a(this), ip.f.a(), C14855a.b.f129838a);
        K();
    }

    private final void K() {
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
                String a10 = C11818a.a("fetch markets", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14862h.class.getName();
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
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
    }

    private final boolean L() {
        c value = this.f129927s.getValue();
        C17542s.g(value);
        String a10 = value.c().a();
        c cVar = this.f129926r;
        if (cVar == null) {
            C17542s.z("currentSavedSelection");
            cVar = null;
        }
        return !C17542s.e(a10, cVar.c().a());
    }

    private final Il.b M(String str, String str2) {
        c cVar = this.f129926r;
        if (cVar == null) {
            C17542s.z("currentSavedSelection");
            cVar = null;
        }
        if (!C17542s.e(cVar.c().a(), str)) {
            return Il.b.REGION_CHANGED;
        }
        c cVar2 = this.f129926r;
        if (cVar2 == null) {
            C17542s.z("currentSavedSelection");
            cVar2 = null;
        }
        if (!C17542s.e(cVar2.d(), str2)) {
            return Il.b.LANGUAGE_CHANGED;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No changes are made to region or language. This should never happen.");
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            if (str4 == null) {
                String name = C14862h.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str4;
            bVar.a(eVar, str5, false, illegalStateException, str3);
            str4 = str5;
        }
        return Il.b.NO_CHANGE;
    }

    /* access modifiers changed from: private */
    public final Rl.f N(Rl.d dVar) {
        Object obj;
        List<Rl.f> b10 = dVar.b();
        String a10 = this.f129921m.a();
        if (a10 == null || C15854t.v0(a10)) {
            return b10.get(0);
        }
        Iterator it = b10.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((Rl.f) obj).a(), a10)) {
                break;
            }
        }
        return (Rl.f) obj;
    }

    /* access modifiers changed from: private */
    public final Rl.d O() {
        String c10 = this.f129921m.c();
        String a10 = this.f129921m.a();
        if (c10 == null || C15854t.v0(c10)) {
            Rl.d dVar = (Rl.d) C16877v.y0(this.f129928t.getValue());
            c10 = dVar != null ? dVar.a() : null;
        }
        ArrayList<Rl.d> arrayList = new ArrayList<>();
        for (Object next : this.f129928t.getValue()) {
            if (C17542s.e(((Rl.d) next).a(), c10)) {
                arrayList.add(next);
            }
        }
        for (Rl.d dVar2 : arrayList) {
            Iterator it = dVar2.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C17542s.e(a10, ((Rl.f) it.next()).a())) {
                        return dVar2;
                    }
                }
            }
        }
        return null;
    }

    private final void Q(boolean z10) {
        String str;
        char c10;
        char c11;
        Class<C14862h> cls;
        int i10;
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
            c10 = '.';
            c11 = '$';
            cls = C14862h.class;
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("saveCurrentSettings", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (z10) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, (C17164e<? super g>) null), 3, (Object) null);
        } else if (L() && this.f129925q.isLoggedIn()) {
            this.f129930v.setValue(b.d.f129939a);
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a("saveCurrentSettings, show logout dialog", (Throwable) null);
                    if (a11 != null) {
                        str6 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), c10, (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                c10 = '.';
            }
            return;
        }
        c value = this.f129927s.getValue();
        if (value == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot save settings, no selection");
            qv.e eVar3 = qv.e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str8 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException);
                    if (a12 != null) {
                        str8 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str9 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str9, false, illegalStateException, str8);
                c11 = '$';
            }
            return;
        }
        String a13 = value.c().a();
        String d10 = value.d();
        Il.b M10 = M(a13, d10);
        if (M10 == Il.b.NO_CHANGE) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Change state not supported.");
            qv.e eVar4 = qv.e.ERROR;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : qv.d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str10 = null;
            String str11 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str10 == null) {
                    String a14 = C11818a.a((String) null, illegalStateException2);
                    if (a14 != null) {
                        str10 = C11820c.a(a14);
                    } else {
                        return;
                    }
                }
                if (str11 == null) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name4;
                }
                bVar4.a(eVar4, str11, false, illegalStateException2, str10);
                i10 = 2;
            }
            return;
        }
        F0 unused2 = C16314k.d(g0.a(this), new f(N.f137593c0, this), (T) null, new C3201h(this, a13, d10, value, M10, (C17164e<? super C3201h>) null), 2, (Object) null);
    }

    private final void R(String str) {
        Rl.f fVar;
        c value;
        c cVar;
        Rl.d c10;
        List<Rl.f> b10;
        Object obj;
        c value2 = this.f129927s.getValue();
        if (value2 == null || (c10 = value2.c()) == null || (b10 = c10.b()) == null) {
            fVar = null;
        } else {
            Iterator it = b10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((Rl.f) obj).a(), str)) {
                    break;
                }
            }
            fVar = (Rl.f) obj;
        }
        if (fVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot switch language. Data is not valid.");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C14862h.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
            return;
        }
        C16505B<c> b11 = this.f129927s;
        do {
            value = b11.getValue();
            cVar = value;
        } while (!b11.e(value, cVar != null ? c.b(cVar, (Rl.d) null, fVar.b(), fVar.a(), 1, (Object) null) : null));
    }

    private final void S(String str) {
        String str2;
        Object obj;
        String str3;
        char c10;
        c value;
        String str4;
        Iterator it = this.f129928t.getValue().iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((Rl.d) obj).a(), str)) {
                break;
            }
        }
        Rl.d dVar = (Rl.d) obj;
        String str5 = DslKt.INDICATOR_BACKGROUND;
        String str6 = DslKt.INDICATOR_MAIN;
        Class<C14862h> cls = C14862h.class;
        if (dVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot switch market. Data is not valid.");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar : arrayList) {
                if (str7 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str7 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str8 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str4 = str5;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str6 : str4) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str4 = str5;
                }
                String str9 = str8;
                bVar.a(eVar, str9, false, illegalStateException, str7);
                str8 = str9;
                str5 = str4;
            }
            return;
        }
        String str10 = str5;
        String a11 = dVar.b().get(0).a();
        String b10 = dVar.b().get(0).b();
        if (a11.length() == 0 || b10.length() == 0) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Cannot switch market. Data is not valid.");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str11 = null;
            String str12 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str11 == null) {
                    String a12 = C11818a.a(str2, illegalStateException2);
                    if (a12 != null) {
                        str11 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str12 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    c10 = '$';
                    str3 = str6;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', str2, 2, str2), '.', str2, 2, str2);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str3 : str10) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str3 = str6;
                    c10 = '$';
                }
                char c11 = c10;
                bVar2.a(eVar2, str12, false, illegalStateException2, str11);
                str6 = str3;
                str2 = null;
            }
            return;
        }
        C16505B<c> b11 = this.f129927s;
        do {
            value = b11.getValue();
            c cVar = value;
        } while (!b11.e(value, new c(dVar, b10, a11)));
    }

    public final void P(a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.c) {
            S(((a.c) aVar).a());
        } else if (aVar instanceof a.b) {
            R(((a.b) aVar).a());
        } else if (C17542s.e(aVar, a.C3199a.f129932a)) {
            this.f129930v.setValue(null);
        } else if (aVar instanceof a.d) {
            Q(((a.d) aVar).a());
        } else {
            throw new t();
        }
    }

    public final C16519P<C14855a> m() {
        return this.f129931w;
    }
}
