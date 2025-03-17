package pg;

import IC.C13023e;
import Lg.c;
import Lg.e;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import android.view.View;
import com.ingka.ikea.app.dynamicfields.ui.view.TextInputField;
import il.C11404d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import og.C10127a;
import qg.x;
import rg.C10218a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001d\u0010\u0010J%\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001eH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0017R\u001a\u0010(\u001a\u00020$8\u0004X\u0004¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8TX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lpg/G;", "Lqg/x;", "T", "LLg/c;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "payload", "viewModel", "", "z", "(Ljava/lang/Object;Lqg/x;)Z", "LXH/N;", "C", "(Lqg/x;)V", "B", "view", "hasFocus", "x", "(Landroid/view/View;Z)V", "A", "()V", "", "new", "y", "(Ljava/lang/String;)V", "w", "q", "", "payloads", "r", "(Lqg/x;Ljava/util/List;)Z", "h", "j", "Lcom/ingka/ikea/app/dynamicfields/ui/view/TextInputField;", "Lcom/ingka/ikea/app/dynamicfields/ui/view/TextInputField;", "t", "()Lcom/ingka/ikea/app/dynamicfields/ui/view/TextInputField;", "inputLayout", "", "s", "()I", "imeAction", "Lrg/a;", "u", "()Lrg/a;", "textInput", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class G<T extends x> extends c<T> {

    /* renamed from: h  reason: collision with root package name */
    private final TextInputField f75885h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f75886a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.dynamicfields.datalayer.b[] r0 = com.ingka.ikea.dynamicfields.datalayer.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.PASSWORD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.EMAIL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.PHONE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.READONLY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.OPTION     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.DATE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.ingka.ikea.dynamicfields.datalayer.b r1 = com.ingka.ikea.dynamicfields.datalayer.b.PERSON_NAME     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                f75886a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pg.G.a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(View view) {
        super(view, false);
        C17542s.j(view, "itemView");
        View findViewById = view.findViewById(C10127a.f75735c);
        C17542s.i(findViewById, "findViewById(...)");
        TextInputField textInputField = (TextInputField) findViewById;
        this.f75885h = textInputField;
        textInputField.setOnUserInteraction(new D(this));
        textInputField.setOnEditorAction(new E(this));
    }

    private final void B(T t10) {
        this.f75885h.setEnabled(t10.m());
    }

    private final void C(T t10) {
        TextInputField textInputField = this.f75885h;
        boolean z10 = C17542s.e(t10.o(), Boolean.FALSE) && !t10.l();
        C13023e d10 = t10.d();
        textInputField.N0(z10, d10 != null ? d10.b(e.a(this)) : null);
    }

    /* access modifiers changed from: private */
    public static final C16807N o(G g10, View view, boolean z10) {
        C17542s.j(view, "v");
        g10.x(view, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean p(G g10, int i10) {
        if (i10 != 6) {
            return false;
        }
        g10.A();
        return false;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(G g10, String str) {
        C17542s.j(str, "it");
        g10.y(str);
        return C16807N.f139792a;
    }

    private final boolean z(Object obj, T t10) {
        if (obj == C11404d.VALIDATION_FAILED) {
            C(t10);
            return true;
        } else if (obj == C11404d.ENABLED_STATE_CHANGED) {
            B(t10);
            return true;
        } else if (obj != C11404d.VALUE_CHANGED) {
            return false;
        } else {
            w(t10);
            return true;
        }
    }

    public abstract void A();

    public void h() {
        super.h();
        this.f75885h.setOnInputChanged(new F(this));
    }

    public void j() {
        this.f75885h.setOnInputChanged((C17642l<? super String, C16807N>) null);
        super.j();
    }

    /* renamed from: q */
    public void c(T t10) {
        C17542s.j(t10, "viewModel");
        super.c(t10);
        w(t10);
        this.f75885h.setImeOptions(s());
        this.f75885h.setTextInput(u());
        C(t10);
        B(t10);
    }

    /* renamed from: r */
    public boolean d(T t10, List<? extends Object> list) {
        C17542s.j(t10, "viewModel");
        C17542s.j(list, "payloads");
        Iterable<Object> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Object z10 : iterable) {
            arrayList.add(Boolean.valueOf(z(z10, t10)));
        }
        return ip.c.a(arrayList);
    }

    public abstract int s();

    /* access modifiers changed from: protected */
    public final TextInputField t() {
        return this.f75885h;
    }

    /* access modifiers changed from: protected */
    public C10218a u() {
        switch (a.f75886a[((x) g()).w().ordinal()]) {
            case 1:
                return C10218a.TEXT;
            case 2:
                return C10218a.PASSWORD;
            case 3:
                return C10218a.EMAIL;
            case 4:
                return C10218a.NUMBER;
            case 5:
                return C10218a.ALPHANUMERIC;
            case 6:
                return C10218a.PHONE;
            case 7:
                return C10218a.DISABLED;
            case 8:
            case 9:
                return C10218a.SELECTABLE;
            case 10:
                return C10218a.NAME;
            default:
                throw new t();
        }
    }

    /* access modifiers changed from: protected */
    public void w(T t10) {
        C17542s.j(t10, "viewModel");
        TextInputField textInputField = this.f75885h;
        textInputField.setHint((CharSequence) t10.x());
        textInputField.L0((String) t10.j(), true);
    }

    public abstract void x(View view, boolean z10);

    /* access modifiers changed from: protected */
    public void y(String str) {
        C17542s.j(str, "new");
        ((x) g()).r(str);
    }
}
