package Kf;

import IC.C13023e;
import TJ.C16532g;
import XH.C16807N;
import XH.C16814e;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\"J7\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0012\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LKf/b;", "", "", "availabilityDisclaimer", "buttonString", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function0;", "LXH/N;", "callback", "addToCartWithDisclaimer", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;LnI/a;)V", "", "LKf/y;", "items", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "componentValue", "b", "(Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/view/View;", "rootView", "", "throwable", "productName", "showAddToCartException", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/Throwable;Ljava/lang/String;)V", "LKf/b$a;", "c", "(Ljava/lang/Throwable;Ljava/lang/String;)LKf/b$a;", "LTJ/g;", "", "a", "()LTJ/g;", "cartQuantity", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kf.b  reason: case insensitive filesystem */
public interface C9133b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LKf/b$a;", "", "<init>", "()V", "b", "a", "LKf/b$a$a;", "LKf/b$a$b;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kf.b$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\r¨\u0006\u0019"}, d2 = {"LKf/b$a$a;", "LKf/b$a;", "LIC/e;", "title", "message", "", "positiveButtonText", "<init>", "(LIC/e;LIC/e;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "c", "()LIC/e;", "b", "I", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Kf.b$a$a  reason: collision with other inner class name */
        public static final class C1018a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f61499a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f61500b;

            /* renamed from: c  reason: collision with root package name */
            private final int f61501c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1018a(C13023e eVar, C13023e eVar2, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "title");
                C17542s.j(eVar2, "message");
                this.f61499a = eVar;
                this.f61500b = eVar2;
                this.f61501c = i10;
            }

            public final C13023e a() {
                return this.f61500b;
            }

            public final int b() {
                return this.f61501c;
            }

            public final C13023e c() {
                return this.f61499a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1018a)) {
                    return false;
                }
                C1018a aVar = (C1018a) obj;
                return C17542s.e(this.f61499a, aVar.f61499a) && C17542s.e(this.f61500b, aVar.f61500b) && this.f61501c == aVar.f61501c;
            }

            public int hashCode() {
                return (((this.f61499a.hashCode() * 31) + this.f61500b.hashCode()) * 31) + Integer.hashCode(this.f61501c);
            }

            public String toString() {
                C13023e eVar = this.f61499a;
                C13023e eVar2 = this.f61500b;
                int i10 = this.f61501c;
                return "Dialog(title=" + eVar + ", message=" + eVar2 + ", positiveButtonText=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LKf/b$a$b;", "LKf/b$a;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Kf.b$a$b  reason: collision with other inner class name */
        public static final class C1019b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f61502a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1019b(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "message");
                this.f61502a = eVar;
            }

            public final C13023e a() {
                return this.f61502a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1019b) && C17542s.e(this.f61502a, ((C1019b) obj).f61502a);
            }

            public int hashCode() {
                return this.f61502a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f61502a;
                return "Snackbar(message=" + eVar + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kf.b$b  reason: collision with other inner class name */
    public static final class C1020b {
        public static /* synthetic */ Object a(C9133b bVar, List list, Interaction$Component interaction$Component, String str, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str = null;
                }
                return bVar.b(list, interaction$Component, str, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToCartSuspended");
        }
    }

    C16532g<Integer> a();

    void addToCartWithDisclaimer(String str, String str2, FragmentManager fragmentManager, C17631a<C16807N> aVar);

    Object b(List<y> list, Interaction$Component interaction$Component, String str, C17164e<? super C16807N> eVar);

    a c(Throwable th2, String str);

    @C16814e
    void showAddToCartException(Context context, View view, Throwable th2, String str);
}
