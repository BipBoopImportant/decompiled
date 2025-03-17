package Hp;

import HJ.C15854t;
import android.content.Context;
import com.ingka.ikea.dataethics.EthicsDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LHp/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "e", "c", "b", "d", "LHp/c$a;", "LHp/c$b;", "LHp/c$c;", "LHp/c$d;", "LHp/c$e;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"LHp/c$a;", "LHp/c;", "", "header", "<init>", "(I)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "b", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final int f81669a;

        public a(int i10) {
            super((DefaultConstructorMarker) null);
            this.f81669a = i10;
        }

        public boolean a(Context context) {
            C17542s.j(context, "context");
            String string = context.getString(this.f81669a);
            C17542s.i(string, "getString(...)");
            return !C15854t.v0(string);
        }

        public final int b() {
            return this.f81669a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f81669a == ((a) obj).f81669a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f81669a);
        }

        public String toString() {
            int i10 = this.f81669a;
            return "Header(header=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LHp/c$b;", "LHp/c;", "Lcom/ingka/ikea/dataethics/EthicsDialogData;", "ethicsDialogData", "<init>", "(Lcom/ingka/ikea/dataethics/EthicsDialogData;)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/dataethics/EthicsDialogData;", "b", "()Lcom/ingka/ikea/dataethics/EthicsDialogData;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private final EthicsDialogData f81670a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(EthicsDialogData ethicsDialogData) {
            super((DefaultConstructorMarker) null);
            C17542s.j(ethicsDialogData, "ethicsDialogData");
            this.f81670a = ethicsDialogData;
        }

        public boolean a(Context context) {
            C17542s.j(context, "context");
            return true;
        }

        public final EthicsDialogData b() {
            return this.f81670a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f81670a, ((b) obj).f81670a);
        }

        public int hashCode() {
            return this.f81670a.hashCode();
        }

        public String toString() {
            EthicsDialogData ethicsDialogData = this.f81670a;
            return "HeaderWithImage(ethicsDialogData=" + ethicsDialogData + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"LHp/c$c;", "LHp/c;", "", "message", "<init>", "(I)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "b", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hp.c$c  reason: collision with other inner class name */
    public static final class C1592c extends c {

        /* renamed from: a  reason: collision with root package name */
        private final int f81671a;

        public C1592c(int i10) {
            super((DefaultConstructorMarker) null);
            this.f81671a = i10;
        }

        public boolean a(Context context) {
            C17542s.j(context, "context");
            String string = context.getString(this.f81671a);
            C17542s.i(string, "getString(...)");
            return !C15854t.v0(string);
        }

        public final int b() {
            return this.f81671a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1592c) && this.f81671a == ((C1592c) obj).f81671a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f81671a);
        }

        public String toString() {
            int i10 = this.f81671a;
            return "Message(message=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"LHp/c$d;", "LHp/c;", "", "url", "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        private final String f81672a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "url");
            this.f81672a = str;
        }

        public boolean a(Context context) {
            C17542s.j(context, "context");
            return !C15854t.v0(this.f81672a);
        }

        public final String b() {
            return this.f81672a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f81672a, ((d) obj).f81672a);
        }

        public int hashCode() {
            return this.f81672a.hashCode();
        }

        public String toString() {
            String str = this.f81672a;
            return "PrivacyPolicy(url=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"LHp/c$e;", "LHp/c;", "", "subHeader", "<init>", "(I)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "b", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends c {

        /* renamed from: a  reason: collision with root package name */
        private final int f81673a;

        public e(int i10) {
            super((DefaultConstructorMarker) null);
            this.f81673a = i10;
        }

        public boolean a(Context context) {
            C17542s.j(context, "context");
            String string = context.getString(this.f81673a);
            C17542s.i(string, "getString(...)");
            return !C15854t.v0(string);
        }

        public final int b() {
            return this.f81673a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f81673a == ((e) obj).f81673a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f81673a);
        }

        public String toString() {
            int i10 = this.f81673a;
            return "SubHeader(subHeader=" + i10 + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(Context context);

    private c() {
    }
}
