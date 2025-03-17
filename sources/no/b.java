package No;

import HJ.C15854t;
import Ko.a;
import Op.c1;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.commercialcontent.impl.view.l;
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
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sB.C15035a;
import tf.C10253a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002;<B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0.0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000206058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u001d\u00109¨\u0006="}, d2 = {"LNo/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LKo/a;", "commercialContentUseCase", "LJo/a;", "analytics", "Ltf/a;", "killSwitchRepository", "LCx/b;", "publisherTokenManager", "<init>", "(Landroidx/lifecycle/U;LKo/a;LJo/a;Ltf/a;LCx/b;)V", "LXH/N;", "E", "()V", "Lcom/ingka/ikea/commercialcontent/impl/view/l;", "event", "G", "(Lcom/ingka/ikea/commercialcontent/impl/view/l;)V", "I", "LsB/a;", "action", "H", "(LsB/a;)V", "LOp/c1;", "F", "(LOp/c1;)V", "m", "LKo/a;", "n", "LJo/a;", "o", "Ltf/a;", "p", "LCx/b;", "", "q", "Ljava/lang/String;", "storyId", "LTJ/B;", "LNo/b$a;", "r", "LTJ/B;", "storyState", "", "s", "itemNosAddingToCart", "LTJ/A;", "t", "LTJ/A;", "shoppingListModified", "LTJ/P;", "LNo/b$b;", "u", "LTJ/P;", "()LTJ/P;", "uiState", "a", "b", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ko.a f84172m;

    /* renamed from: n  reason: collision with root package name */
    private final Jo.a f84173n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C10253a f84174o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Cx.b f84175p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final String f84176q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<a> f84177r;

    /* renamed from: s  reason: collision with root package name */
    private final C16505B<List<String>> f84178s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16504A<C15035a> f84179t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<C1708b> f84180u;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LNo/b$a;", "", "b", "d", "a", "c", "LNo/b$a$a;", "LNo/b$a$b;", "LNo/b$a$c;", "LNo/b$a$d;", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNo/b$a$a;", "LNo/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: No.b$a$a  reason: collision with other inner class name */
        public static final class C1706a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1706a f84181a = new C1706a();

            private C1706a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1706a);
            }

            public int hashCode() {
                return -1284629309;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNo/b$a$b;", "LNo/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: No.b$a$b  reason: collision with other inner class name */
        public static final class C1707b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1707b f84182a = new C1707b();

            private C1707b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1707b);
            }

            public int hashCode() {
                return -57513673;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNo/b$a$c;", "LNo/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f84183a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 708405427;
            }

            public String toString() {
                return "NoContent";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LNo/b$a$d;", "LNo/b$a;", "LKo/a$a;", "data", "<init>", "(LKo/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKo/a$a;", "()LKo/a$a;", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: a  reason: collision with root package name */
            private final a.C1642a f84184a;

            public d(a.C1642a aVar) {
                C17542s.j(aVar, "data");
                this.f84184a = aVar;
            }

            public final a.C1642a a() {
                return this.f84184a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f84184a, ((d) obj).f84184a);
            }

            public int hashCode() {
                return this.f84184a.hashCode();
            }

            public String toString() {
                a.C1642a aVar = this.f84184a;
                return "OnSuccess(data=" + aVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LNo/b$b;", "", "b", "d", "a", "c", "LNo/b$b$a;", "LNo/b$b$b;", "LNo/b$b$c;", "LNo/b$b$d;", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: No.b$b  reason: collision with other inner class name */
    public interface C1708b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNo/b$b$a;", "LNo/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: No.b$b$a */
        public static final class a implements C1708b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f84185a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1398658954;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNo/b$b$b;", "LNo/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: No.b$b$b  reason: collision with other inner class name */
        public static final class C1709b implements C1708b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1709b f84186a = new C1709b();

            private C1709b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1709b);
            }

            public int hashCode() {
                return 1602129470;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNo/b$b$c;", "LNo/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: No.b$b$c */
        public static final class c implements C1708b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f84187a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2102368262;
            }

            public String toString() {
                return "NoContent";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LNo/b$b$d;", "LNo/b$b;", "LNo/i;", "data", "LsB/a;", "modifyListAction", "<init>", "(LNo/i;LsB/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNo/i;", "()LNo/i;", "b", "LsB/a;", "()LsB/a;", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: No.b$b$d */
        public static final class d implements C1708b {

            /* renamed from: a  reason: collision with root package name */
            private final i f84188a;

            /* renamed from: b  reason: collision with root package name */
            private final C15035a f84189b;

            public d(i iVar, C15035a aVar) {
                C17542s.j(iVar, "data");
                this.f84188a = iVar;
                this.f84189b = aVar;
            }

            public final i a() {
                return this.f84188a;
            }

            public final C15035a b() {
                return this.f84189b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f84188a, dVar.f84188a) && C17542s.e(this.f84189b, dVar.f84189b);
            }

            public int hashCode() {
                int hashCode = this.f84188a.hashCode() * 31;
                C15035a aVar = this.f84189b;
                return hashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public String toString() {
                i iVar = this.f84188a;
                C15035a aVar = this.f84189b;
                return "OnSuccess(data=" + iVar + ", modifyListAction=" + aVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"No/b$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f84190a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, b bVar) {
            super(aVar);
            this.f84190a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch commercial content";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f84190a.f84177r.setValue(a.C1706a.f84181a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.commercialcontent.impl.viewmodel.CommercialContentViewModel$loadData$2", f = "CommercialContentViewModel.kt", l = {100}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f84191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f84192d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f84193a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: No.b$d$a$a  reason: collision with other inner class name */
            static final class C1710a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f84194a;

                C1710a(b bVar) {
                    this.f84194a = bVar;
                }

                /* renamed from: c */
                public final Object emit(a.C1642a aVar, C17164e<? super C16807N> eVar) {
                    this.f84194a.f84177r.setValue(new a.d(aVar));
                    return C16807N.f139792a;
                }
            }

            a(b bVar) {
                this.f84193a = bVar;
            }

            /* renamed from: c */
            public final Object emit(String str, C17164e<? super C16807N> eVar) {
                this.f84193a.f84177r.setValue(a.C1707b.f84182a);
                Object collect = this.f84193a.f84172m.d(this.f84193a.f84176q).collect(new C1710a(this.f84193a), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f84192d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f84192d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f84191c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<String> b10 = this.f84192d.f84175p.b();
                a aVar = new a(this.f84192d);
                this.f84191c = 1;
                if (b10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.commercialcontent.impl.viewmodel.CommercialContentViewModel$onShoppingListModified$1", f = "CommercialContentViewModel.kt", l = {164}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f84195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f84196d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15035a f84197e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C15035a aVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f84196d = bVar;
            this.f84197e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f84196d, this.f84197e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f84195c;
            if (i10 == 0) {
                y.b(obj);
                C16504A k10 = this.f84196d.f84179t;
                C15035a aVar = this.f84197e;
                this.f84195c = 1;
                if (k10.emit(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.commercialcontent.impl.viewmodel.CommercialContentViewModel$onShoppingListModifiedConsumed$1", f = "CommercialContentViewModel.kt", l = {158}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f84198c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f84199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f84199d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f84199d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f84198c;
            if (i10 == 0) {
                y.b(obj);
                C16504A k10 = this.f84199d.f84179t;
                this.f84198c = 1;
                if (k10.emit(null, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LsB/a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.commercialcontent.impl.viewmodel.CommercialContentViewModel$uiState$1", f = "CommercialContentViewModel.kt", l = {63}, m = "invokeSuspend")
    static final class g extends l implements p<C16533h<? super C15035a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f84200c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f84201d;

        g(C17164e<? super g> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(eVar);
            gVar.f84201d = obj;
            return gVar;
        }

        public final Object invoke(C16533h<? super C15035a> hVar, C17164e<? super C16807N> eVar) {
            return ((g) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f84200c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f84201d;
                this.f84201d = hVar;
                this.f84200c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f84201d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LNo/b$a;", "storyState", "", "", "itemsNumbersAddingToCart", "LsB/a;", "shoppingListModified", "LNo/b$b;", "<anonymous>", "(LNo/b$a;Ljava/util/List;LsB/a;)LNo/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.commercialcontent.impl.viewmodel.CommercialContentViewModel$uiState$2", f = "CommercialContentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements r<a, List<? extends String>, C15035a, C17164e<? super C1708b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f84202c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f84203d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f84204e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f84205f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f84206g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, C17164e<? super h> eVar) {
            super(4, eVar);
            this.f84206g = bVar;
        }

        /* renamed from: i */
        public final Object l(a aVar, List<String> list, C15035a aVar2, C17164e<? super C1708b> eVar) {
            h hVar = new h(this.f84206g, eVar);
            hVar.f84203d = aVar;
            hVar.f84204e = list;
            hVar.f84205f = aVar2;
            return hVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f84202c == 0) {
                y.b(obj);
                a aVar = (a) this.f84203d;
                List list = (List) this.f84204e;
                C15035a aVar2 = (C15035a) this.f84205f;
                if (C17542s.e(aVar, a.C1706a.f84181a)) {
                    return C1708b.a.f84185a;
                }
                if (C17542s.e(aVar, a.C1707b.f84182a)) {
                    return C1708b.C1709b.f84186a;
                }
                if (C17542s.e(aVar, a.c.f84183a)) {
                    return C1708b.c.f84187a;
                }
                if (aVar instanceof a.d) {
                    a.C1642a a10 = ((a.d) aVar).a();
                    return new C1708b.d(c.d(a10.c(), a10.b(), this.f84206g.f84174o.b(), list, a10.a()), aVar2);
                }
                throw new t();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(U u10, Ko.a aVar, Jo.a aVar2, C10253a aVar3, Cx.b bVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "commercialContentUseCase");
        C17542s.j(aVar2, "analytics");
        C17542s.j(aVar3, "killSwitchRepository");
        C17542s.j(bVar, "publisherTokenManager");
        this.f84172m = aVar;
        this.f84173n = aVar2;
        this.f84174o = aVar3;
        this.f84175p = bVar;
        Object f10 = u10.f("storyId");
        if (f10 != null) {
            this.f84176q = (String) f10;
            C16505B<a> a10 = C16521S.a(a.C1707b.f84182a);
            this.f84177r = a10;
            C16505B<List<String>> a11 = C16521S.a(C16877v.n());
            this.f84178s = a11;
            C16504A<C15035a> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
            this.f84179t = b10;
            this.f84180u = C16534i.c0(C16534i.m(a10, a11, C16534i.T(b10, new g((C17164e<? super g>) null)), new h(this, (C17164e<? super h>) null)), g0.a(this), ip.f.a(), C1708b.C1709b.f84186a);
            E();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void E() {
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this), (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
    }

    public final void F(c1 c1Var) {
        C17542s.j(c1Var, "event");
        if (!(c1Var instanceof c1.e) && !(c1Var instanceof c1.a) && !(c1Var instanceof c1.f) && !(c1Var instanceof c1.b) && !(c1Var instanceof c1.d) && !(c1Var instanceof c1.c)) {
            throw new t();
        }
    }

    public final void G(com.ingka.ikea.commercialcontent.impl.view.l lVar) {
        C17542s.j(lVar, "event");
        if (lVar instanceof l.e) {
            l.e eVar = (l.e) lVar;
            this.f84173n.c(this.f84176q, eVar.b(), eVar.c(), eVar.a().b(), eVar.a().d());
        } else if (lVar instanceof l.b) {
            this.f84173n.a(this.f84176q, ((l.b) lVar).a());
        } else if (lVar instanceof l.d) {
            l.d dVar = (l.d) lVar;
            this.f84173n.d(this.f84176q, dVar.a(), dVar.c(), dVar.d());
        } else if (lVar instanceof l.c) {
            l.c cVar = (l.c) lVar;
            this.f84173n.b(cVar.a(), this.f84176q, cVar.b(), cVar.c());
        } else if (!C17542s.e(lVar, l.a.f94785a) && !(lVar instanceof l.f)) {
            throw new t();
        }
    }

    public final void H(C15035a aVar) {
        C17542s.j(aVar, "action");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new e(this, aVar, (C17164e<? super e>) null), 3, (Object) null);
    }

    public final void I() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
    }

    public final C16519P<C1708b> m() {
        return this.f84180u;
    }
}
