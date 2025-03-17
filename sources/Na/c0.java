package NA;

import GA.C12914a;
import HJ.C15854t;
import IC.C13026h;
import KA.C13125c;
import KA.C13126d;
import Kf.C9133b;
import NA.C13245d;
import OA.C13294a;
import OA.C13295b;
import Op.c1;
import PA.C13331a;
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
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
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
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sB.C15035a;
import sf.C10240a;
import sf.C10241b;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002PQBA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\"H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0000¢\u0006\u0004\b'\u0010\u0019J \u0010(\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H@¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120A0<8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010?R\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b+\u0010HR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0<8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010?R\u001f\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0D8\u0006¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\bN\u0010H¨\u0006R"}, d2 = {"LNA/c0;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LKf/b;", "cartApi", "LIl/a;", "appConfigApi", "LKA/d;", "shoppableImageUseCase", "LGA/a;", "analytics", "Ltf/a;", "killSwitchRepository", "Lsf/b;", "appSessionUserDataRepository", "<init>", "(Landroidx/lifecycle/U;LKf/b;LIl/a;LKA/d;LGA/a;Ltf/a;Lsf/b;)V", "", "itemNo", "productName", "LXH/N;", "G", "(Ljava/lang/String;Ljava/lang/String;)V", "J", "()V", "LsB/a;", "action", "M", "(LsB/a;)V", "LOp/c1;", "event", "K", "(LOp/c1;)V", "LKA/c;", "L", "(LKA/c;)V", "P", "(Ljava/lang/String;)V", "O", "H", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "N", "m", "LKf/b;", "n", "LIl/a;", "o", "LKA/d;", "p", "LGA/a;", "q", "Ltf/a;", "r", "Lsf/b;", "s", "Ljava/lang/String;", "shoppableImageId", "t", "shoppableImageType", "LTJ/B;", "LNA/c0$a;", "u", "LTJ/B;", "shoppableImageState", "", "v", "itemsNosAddingToCart", "LTJ/P;", "LNA/c0$b;", "w", "LTJ/P;", "()LTJ/P;", "uiState", "LNA/d;", "x", "_shoppableImageAtcUiEvent", "y", "I", "shoppableImageAtcUiEvent", "a", "b", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C9133b f112288m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Il.a f112289n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C13126d f112290o;

    /* renamed from: p  reason: collision with root package name */
    private final C12914a f112291p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C10253a f112292q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C10241b f112293r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final String f112294s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final String f112295t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<a> f112296u;

    /* renamed from: v  reason: collision with root package name */
    private final C16505B<List<String>> f112297v;

    /* renamed from: w  reason: collision with root package name */
    private final C16519P<b> f112298w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final C16505B<C13245d> f112299x;

    /* renamed from: y  reason: collision with root package name */
    private final C16519P<C13245d> f112300y;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LNA/c0$a;", "", "b", "c", "a", "LNA/c0$a$a;", "LNA/c0$a$b;", "LNA/c0$a$c;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNA/c0$a$a;", "LNA/c0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: NA.c0$a$a  reason: collision with other inner class name */
        public static final class C2760a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2760a f112301a = new C2760a();

            private C2760a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2760a);
            }

            public int hashCode() {
                return 1232771123;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNA/c0$a$b;", "LNA/c0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f112302a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1097713831;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LNA/c0$a$c;", "LNA/c0$a;", "LKA/d$a;", "data", "<init>", "(LKA/d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKA/d$a;", "()LKA/d$a;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C13126d.a f112303a;

            public c(C13126d.a aVar) {
                C17542s.j(aVar, "data");
                this.f112303a = aVar;
            }

            public final C13126d.a a() {
                return this.f112303a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f112303a, ((c) obj).f112303a);
            }

            public int hashCode() {
                return this.f112303a.hashCode();
            }

            public String toString() {
                C13126d.a aVar = this.f112303a;
                return "OnSuccess(data=" + aVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LNA/c0$b;", "", "c", "b", "a", "LNA/c0$b$a;", "LNA/c0$b$b;", "LNA/c0$b$c;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNA/c0$b$a;", "LNA/c0$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f112304a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1977430783;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNA/c0$b$b;", "LNA/c0$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: NA.c0$b$b  reason: collision with other inner class name */
        public static final class C2761b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2761b f112305a = new C2761b();

            private C2761b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2761b);
            }

            public int hashCode() {
                return -543891341;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LNA/c0$b$c;", "LNA/c0$b;", "LOA/a;", "data", "<init>", "(LOA/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOA/a;", "()LOA/a;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            private final C13294a f112306a;

            public c(C13294a aVar) {
                C17542s.j(aVar, "data");
                this.f112306a = aVar;
            }

            public final C13294a a() {
                return this.f112306a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f112306a, ((c) obj).f112306a);
            }

            public int hashCode() {
                return this.f112306a.hashCode();
            }

            public String toString() {
                C13294a aVar = this.f112306a;
                return "Success(data=" + aVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"NA/c0$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f112307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f112308b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, c0 c0Var, String str) {
            super(aVar);
            this.f112307a = c0Var;
            this.f112308b = str;
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
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Add to cart failed";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f112307a.f112299x.setValue(new C13245d.a(C13026h.b(Oo.b.f84467P, this.f112308b)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageViewModel$addToCart$3", f = "ShoppableImageViewModel.kt", l = {199}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112309c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0 f112310d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f112311e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f112312f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c0 c0Var, String str, String str2, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f112310d = c0Var;
            this.f112311e = str;
            this.f112312f = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f112310d, this.f112311e, this.f112312f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f112309c;
            if (i10 == 0) {
                y.b(obj);
                c0 c0Var = this.f112310d;
                String str = this.f112311e;
                String str2 = this.f112312f;
                this.f112309c = 1;
                if (c0Var.H(str, str2, this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageViewModel", f = "ShoppableImageViewModel.kt", l = {207}, m = "doAddToCart")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f112313c;

        /* renamed from: d  reason: collision with root package name */
        Object f112314d;

        /* renamed from: e  reason: collision with root package name */
        Object f112315e;

        /* renamed from: f  reason: collision with root package name */
        Object f112316f;

        /* renamed from: g  reason: collision with root package name */
        Object f112317g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f112318h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c0 f112319i;

        /* renamed from: j  reason: collision with root package name */
        int f112320j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c0 c0Var, C17164e<? super e> eVar) {
            super(eVar);
            this.f112319i = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112318h = obj;
            this.f112320j |= Integer.MIN_VALUE;
            return this.f112319i.H((String) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"NA/c0$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f112321a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, c0 c0Var) {
            super(aVar);
            this.f112321a = c0Var;
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
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch shoppable image content";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f112321a.f112296u.setValue(a.C2760a.f112301a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageViewModel$loadData$2", f = "ShoppableImageViewModel.kt", l = {115}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0 f112323d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0 f112324a;

            a(c0 c0Var) {
                this.f112324a = c0Var;
            }

            /* renamed from: c */
            public final Object emit(C13126d.a aVar, C17164e<? super C16807N> eVar) {
                this.f112324a.f112296u.setValue(new a.c(aVar));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c0 c0Var, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f112323d = c0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f112323d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f112322c;
            if (i10 == 0) {
                y.b(obj);
                this.f112323d.f112296u.setValue(a.b.f112302a);
                C16532g<C13126d.a> a10 = this.f112323d.f112290o.a(this.f112323d.f112294s, C13331a.f113810a.a(this.f112323d.f112295t));
                a aVar = new a(this.f112323d);
                this.f112322c = 1;
                if (a10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LNA/c0$a;", "shoppableImageState", "", "", "itemsNumbersAddingToCart", "LNA/c0$b;", "<anonymous>", "(LNA/c0$a;Ljava/util/List;)LNA/c0$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageViewModel$uiState$1", f = "ShoppableImageViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements q<a, List<? extends String>, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112325c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f112326d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f112327e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c0 f112328f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c0 c0Var, C17164e<? super h> eVar) {
            super(3, eVar);
            this.f112328f = c0Var;
        }

        /* renamed from: i */
        public final Object invoke(a aVar, List<String> list, C17164e<? super b> eVar) {
            h hVar = new h(this.f112328f, eVar);
            hVar.f112326d = aVar;
            hVar.f112327e = list;
            return hVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f112325c == 0) {
                y.b(obj);
                a aVar = (a) this.f112326d;
                List list = (List) this.f112327e;
                if (C17542s.e(aVar, a.C2760a.f112301a)) {
                    return b.a.f112304a;
                }
                if (C17542s.e(aVar, a.b.f112302a)) {
                    return b.C2761b.f112305a;
                }
                if (aVar instanceof a.c) {
                    C13126d.a a10 = ((a.c) aVar).a();
                    c0 c0Var = this.f112328f;
                    return new b.c(C13295b.a(a10.b(), c0Var.f112289n.s(), c0Var.f112292q.b(), a10.a(), list, c0Var.f112293r.b(C10240a.ShowPlpSwipeImageNudge, true)));
                }
                throw new t();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c0(U u10, C9133b bVar, Il.a aVar, C13126d dVar, C12914a aVar2, C10253a aVar3, C10241b bVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(bVar, "cartApi");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(dVar, "shoppableImageUseCase");
        C17542s.j(aVar2, "analytics");
        C17542s.j(aVar3, "killSwitchRepository");
        C17542s.j(bVar2, "appSessionUserDataRepository");
        this.f112288m = bVar;
        this.f112289n = aVar;
        this.f112290o = dVar;
        this.f112291p = aVar2;
        this.f112292q = aVar3;
        this.f112293r = bVar2;
        Object f10 = u10.f("shoppableImageId");
        if (f10 != null) {
            this.f112294s = (String) f10;
            Object f11 = u10.f("shoppableImageType");
            if (f11 != null) {
                this.f112295t = (String) f11;
                C16505B<a> a10 = C16521S.a(a.b.f112302a);
                this.f112296u = a10;
                C16505B<List<String>> a11 = C16521S.a(C16877v.n());
                this.f112297v = a11;
                this.f112298w = C16534i.c0(C16534i.n(a10, a11, new h(this, (C17164e<? super h>) null)), g0.a(this), ip.f.a(), b.C2761b.f112305a);
                C16505B<C13245d> a12 = C16521S.a(null);
                this.f112299x = a12;
                this.f112300y = a12;
                J();
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void G(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str5 = null;
        String str6 = null;
        for (C11819b bVar : arrayList) {
            if (str5 == null) {
                String a10 = C11818a.a("Add to cart itemNo: " + str3, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str5 = C11820c.a(a10);
            }
            String str7 = str5;
            if (str6 == null) {
                String name = c0.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str8 = str6;
            bVar.a(eVar, str8, false, (Throwable) null, str7);
            str5 = str7;
            str6 = str8;
        }
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this, str4), (T) null, new d(this, str3, str4, (C17164e<? super d>) null), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(java.lang.String r10, java.lang.String r11, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof NA.c0.e
            if (r0 == 0) goto L_0x0014
            r0 = r12
            NA.c0$e r0 = (NA.c0.e) r0
            int r1 = r0.f112320j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f112320j = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            NA.c0$e r0 = new NA.c0$e
            r0.<init>(r9, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.f112318h
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.f112320j
            r2 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 != r2) goto L_0x0042
            java.lang.Object r10 = r5.f112317g
            TJ.B r10 = (TJ.C16505B) r10
            java.lang.Object r10 = r5.f112316f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r5.f112315e
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r5.f112314d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r5.f112313c
            NA.c0 r12 = (NA.c0) r12
            XH.y.b(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0083
        L_0x0040:
            r11 = move-exception
            goto L_0x00ab
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            XH.y.b(r0)
            TJ.B<java.util.List<java.lang.String>> r0 = r9.f112297v
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = YH.C16877v.W0(r1, r10)
            r0.setValue(r1)
            Kf.b r1 = r9.f112288m     // Catch:{ all -> 0x00a9 }
            Kf.y r3 = new Kf.y     // Catch:{ all -> 0x00a9 }
            r3.<init>(r10, r2)     // Catch:{ all -> 0x00a9 }
            java.util.List r3 = YH.C16877v.e(r3)     // Catch:{ all -> 0x00a9 }
            com.ingka.ikea.analytics.Interaction$Component r4 = com.ingka.ikea.analytics.Interaction$Component.SHOPPABLE_IMAGE     // Catch:{ all -> 0x00a9 }
            r5.f112313c = r9     // Catch:{ all -> 0x00a9 }
            r5.f112314d = r10     // Catch:{ all -> 0x00a9 }
            r5.f112315e = r11     // Catch:{ all -> 0x00a9 }
            r5.f112316f = r12     // Catch:{ all -> 0x00a9 }
            r5.f112317g = r0     // Catch:{ all -> 0x00a9 }
            r5.f112320j = r2     // Catch:{ all -> 0x00a9 }
            r12 = 0
            r6 = 4
            r7 = 0
            r2 = r3
            r3 = r4
            r4 = r12
            java.lang.Object r12 = Kf.C9133b.C1020b.a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a9 }
            if (r12 != r8) goto L_0x0082
            return r8
        L_0x0082:
            r12 = r9
        L_0x0083:
            TJ.B<NA.d> r0 = r12.f112299x     // Catch:{ all -> 0x0040 }
            NA.d$b r1 = new NA.d$b     // Catch:{ all -> 0x0040 }
            int r2 = Oo.b.f84477Q     // Catch:{ all -> 0x0040 }
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0040 }
            IC.e r11 = IC.C13026h.b(r2, r11)     // Catch:{ all -> 0x0040 }
            r1.<init>(r11)     // Catch:{ all -> 0x0040 }
            r0.setValue(r1)     // Catch:{ all -> 0x0040 }
            TJ.B<java.util.List<java.lang.String>> r11 = r12.f112297v
            java.lang.Object r12 = r11.getValue()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r10 = YH.C16877v.S0(r12, r10)
            r11.setValue(r10)
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00a9:
            r11 = move-exception
            r12 = r9
        L_0x00ab:
            TJ.B<java.util.List<java.lang.String>> r12 = r12.f112297v
            java.lang.Object r0 = r12.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r10 = YH.C16877v.S0(r0, r10)
            r12.setValue(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: NA.c0.H(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public final C16519P<C13245d> I() {
        return this.f112300y;
    }

    public final void J() {
        F0 unused = C16314k.d(g0.a(this), new f(N.f137593c0, this), (T) null, new g(this, (C17164e<? super g>) null), 2, (Object) null);
    }

    public final void K(c1 c1Var) {
        C17542s.j(c1Var, "event");
        if (c1Var instanceof c1.a) {
            c1.a aVar = (c1.a) c1Var;
            G(aVar.b(), aVar.c());
        } else if (c1Var instanceof c1.e) {
            this.f112291p.b(((c1.e) c1Var).a(), this.f112294s, this.f112295t);
        } else if (!(c1Var instanceof c1.b) && !(c1Var instanceof c1.c) && !(c1Var instanceof c1.d) && !(c1Var instanceof c1.f)) {
            throw new t();
        }
    }

    public final void L(C13125c cVar) {
        C17542s.j(cVar, "event");
        if (cVar instanceof C13125c.C2711c) {
            this.f112291p.d(((C13125c.C2711c) cVar).a(), this.f112294s, this.f112295t);
        } else if (!(cVar instanceof C13125c.a) && !(cVar instanceof C13125c.d)) {
            if (cVar instanceof C13125c.b) {
                this.f112291p.a(((C13125c.b) cVar).a(), this.f112294s, this.f112295t);
                return;
            }
            throw new t();
        }
    }

    public final void M(C15035a aVar) {
        C13245d value;
        C17542s.j(aVar, "action");
        C16505B<C13245d> b10 = this.f112299x;
        do {
            value = b10.getValue();
            C13245d dVar = value;
        } while (!b10.e(value, new C13245d.c(aVar)));
    }

    public final void N() {
        this.f112299x.setValue(null);
    }

    public final void O() {
        this.f112293r.a(C10240a.ShowPlpSwipeImageNudge, false);
    }

    public final void P(String str) {
        C17542s.j(str, "itemNo");
        this.f112291p.c(str, this.f112294s, this.f112295t);
    }

    public final C16519P<b> m() {
        return this.f112298w;
    }
}
