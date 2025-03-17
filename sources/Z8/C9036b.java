package z8;

import G8.j;
import G8.p;
import XH.v;
import YH.C16877v;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b+\u0018\u0000 \u00012\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00040\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00103\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b1\u0010)\"\u0004\b2\u0010+R\"\u00106\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+R\"\u00108\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010'\u001a\u0004\b7\u0010)\"\u0004\b \u0010+R$\u0010=\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00109\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010<R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010K\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u00102\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010V\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u00102\u001a\u0004\bT\u0010H\"\u0004\bU\u0010JR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000W8\u0006¢\u0006\f\n\u0004\b.\u0010X\u001a\u0004\b?\u0010YR\"\u0010^\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u00102\u001a\u0004\b\\\u0010H\"\u0004\b]\u0010JR\"\u0010b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u00102\u001a\u0004\b`\u0010H\"\u0004\ba\u0010JR$\u0010j\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010m\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010e\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR$\u0010p\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010e\u001a\u0004\bn\u0010g\"\u0004\bo\u0010iR$\u0010s\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u00109\u001a\u0004\bq\u0010\u001e\"\u0004\br\u0010<R\"\u0010u\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010 \u001a\u0004\bd\u0010\u0017\"\u0004\bt\u0010#R\"\u0010w\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010'\u001a\u0004\b_\u0010)\"\u0004\bv\u0010+R\"\u0010z\u001a\u00020L8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010N\u001a\u0004\bx\u0010P\"\u0004\by\u0010RR\"\u0010|\u001a\u00020L8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bx\u0010N\u001a\u0004\bM\u0010P\"\u0004\b{\u0010RR\"\u0010\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u00102\u001a\u0004\b}\u0010H\"\u0004\b~\u0010JR&\u0010\u0001\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u00102\u001a\u0005\b\u0001\u0010H\"\u0005\b\u0001\u0010JR$\u0010\u0001\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0013\n\u0004\bG\u00102\u001a\u0005\b\u0001\u0010H\"\u0004\b'\u0010JR$\u0010\u0001\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0013\n\u0004\b`\u00102\u001a\u0004\bN\u0010H\"\u0005\b\u0001\u0010JR%\u0010\u0001\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b\\\u00102\u001a\u0005\b\u0001\u0010H\"\u0005\b\u0001\u0010JR'\u0010\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0005\b\u0001\u00109\u001a\u0004\bF\u0010\u001e\"\u0005\b\u0001\u0010<R&\u0010\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0013\n\u0004\b}\u00109\u001a\u0004\b[\u0010\u001e\"\u0005\b\u0001\u0010<¨\u0006\u0001"}, d2 = {"Lz8/b;", "", "<init>", "()V", "Ljava/util/LinkedList;", "viewLightList", "Lkotlin/Function1;", "", "predicate", "LXH/N;", "e", "(Ljava/util/LinkedList;LnI/l;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "buffer", "", "prefix", "childrenPrefix", "G", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "H", "", "d", "()J", "f", "(LnI/l;)Ljava/util/LinkedList;", "LXH/v;", "k0", "()LXH/v;", "toString", "()Ljava/lang/String;", "a", "J", "r", "b0", "(J)V", "recordingId", "", "b", "I", "w", "()I", "j0", "(I)V", "width", "c", "l", "T", "height", "p", "Z", "posX", "q", "a0", "posY", "g", "backgroundColor", "Ljava/lang/String;", "u", "f0", "(Ljava/lang/String;)V", "viewBitmapHash", "", "h", "[B", "k", "()[B", "Q", "([B)V", "encodedBitmap", "i", "y", "()Z", "K", "(Z)V", "isBitmapHashChanged", "", "j", "F", "t", "()F", "e0", "(F)V", "viewAlpha", "E", "h0", "isVisible", "", "Ljava/util/List;", "()Ljava/util/List;", "children", "m", "A", "N", "isClipChildren", "n", "z", "M", "isClickable", "", "o", "Ljava/lang/CharSequence;", "s", "()Ljava/lang/CharSequence;", "c0", "(Ljava/lang/CharSequence;)V", "text", "getErrorText", "R", "errorText", "getHintText", "U", "hintText", "getEditableText", "P", "editableText", "Y", "parentId", "W", "indexInParent", "v", "g0", "visibilityPercentage", "O", "clippedPercentage", "C", "X", "isMasked", "x", "B", "S", "isForceMasked", "isAnimating", "i0", "isWebView", "D", "d0", "isTransparent", "L", "className", "V", "incrementalPath", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: z8.b  reason: case insensitive filesystem */
public final class C9036b {

    /* renamed from: D  reason: collision with root package name */
    public static final a f58523D = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public static p<C9036b> f58524E = new p<>();
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public static final j<C9036b> f58525F = new C9035a();

    /* renamed from: A  reason: collision with root package name */
    private boolean f58526A;

    /* renamed from: B  reason: collision with root package name */
    private String f58527B;

    /* renamed from: C  reason: collision with root package name */
    private String f58528C;

    /* renamed from: a  reason: collision with root package name */
    private long f58529a;

    /* renamed from: b  reason: collision with root package name */
    private int f58530b;

    /* renamed from: c  reason: collision with root package name */
    private int f58531c;

    /* renamed from: d  reason: collision with root package name */
    private int f58532d;

    /* renamed from: e  reason: collision with root package name */
    private int f58533e;

    /* renamed from: f  reason: collision with root package name */
    private int f58534f;

    /* renamed from: g  reason: collision with root package name */
    private String f58535g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f58536h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f58537i;

    /* renamed from: j  reason: collision with root package name */
    private float f58538j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f58539k;

    /* renamed from: l  reason: collision with root package name */
    private final List<C9036b> f58540l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private boolean f58541m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f58542n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f58543o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f58544p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f58545q;

    /* renamed from: r  reason: collision with root package name */
    private String f58546r;

    /* renamed from: s  reason: collision with root package name */
    private long f58547s;

    /* renamed from: t  reason: collision with root package name */
    private int f58548t;

    /* renamed from: u  reason: collision with root package name */
    private float f58549u;

    /* renamed from: v  reason: collision with root package name */
    private float f58550v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f58551w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f58552x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f58553y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f58554z;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00188\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010\"\u001a\u00020!8\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lz8/b$a;", "", "<init>", "()V", "Lz8/b;", "c", "()Lz8/b;", "viewLight", "LXH/N;", "d", "(Lz8/b;)V", "previousViewLight", "currentViewLight", "", "b", "(Lz8/b;Lz8/b;)Z", "LG8/p;", "recycler", "LG8/p;", "a", "()LG8/p;", "setRecycler", "(LG8/p;)V", "getRecycler$annotations", "", "BUFFER_SIZE", "I", "", "CLASS_NAME", "Ljava/lang/String;", "FULL_PATH", "NO_ID", "NO_INDEX_IN_PARENT", "", "NO_PARENT_ID", "J", "PRIME_NUMBER", "LG8/j;", "viewLightInstanceCreator", "LG8/j;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: z8.b$a */
    public static final class a {
        private a() {
        }

        public final p<C9036b> a() {
            return C9036b.f58524E;
        }

        public final boolean b(C9036b bVar, C9036b bVar2) {
            C17542s.j(bVar, "previousViewLight");
            C17542s.j(bVar2, "currentViewLight");
            return (!bVar2.y() && bVar.d() == bVar2.d() && bVar.g() == bVar2.g()) ? false : true;
        }

        public final C9036b c() {
            C9036b a10 = a().a(C9036b.f58525F);
            a10.H();
            return a10;
        }

        public final void d(C9036b bVar) {
            C17542s.j(bVar, "viewLight");
            List<C9036b> h10 = bVar.h();
            int size = h10.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(h10.get(i10));
            }
            a().b(bVar);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void G(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append("id=");
        sb2.append(this.f58529a);
        sb2.append(" path=");
        sb2.append(this.f58528C);
        sb2.append(" pos=");
        sb2.append(this.f58532d);
        sb2.append(',');
        sb2.append(this.f58533e);
        sb2.append(';');
        sb2.append(this.f58530b);
        sb2.append(',');
        sb2.append(this.f58531c);
        sb2.append(10);
        int size = this.f58540l.size();
        int i10 = 0;
        while (i10 < size) {
            C9036b bVar = this.f58540l.get(i10);
            String str3 = str2 + "├── ";
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(i10 != this.f58540l.size() + -1 ? "│   " : "    ");
            bVar.G(sb2, str3, sb3.toString());
            i10++;
        }
    }

    private final void e(LinkedList<C9036b> linkedList, C17642l<? super C9036b, Boolean> lVar) {
        if (lVar.invoke(this).booleanValue()) {
            linkedList.addFirst(this);
        }
        for (C9036b e10 : this.f58540l) {
            e10.e(linkedList, lVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C9036b l0() {
        return new C9036b();
    }

    public final boolean A() {
        return this.f58541m;
    }

    public final boolean B() {
        return this.f58552x;
    }

    public final boolean C() {
        return this.f58551w;
    }

    public final boolean D() {
        return this.f58526A;
    }

    public final boolean E() {
        return this.f58539k;
    }

    public final boolean F() {
        return this.f58554z;
    }

    public final void H() {
        this.f58529a = 0;
        this.f58530b = 0;
        this.f58531c = 0;
        this.f58532d = 0;
        this.f58533e = 0;
        this.f58550v = 0.0f;
        this.f58534f = 0;
        this.f58538j = 0.0f;
        this.f58539k = false;
        this.f58541m = true;
        this.f58535g = null;
        this.f58536h = null;
        this.f58543o = null;
        this.f58544p = null;
        this.f58545q = null;
        this.f58546r = null;
        this.f58547s = -1;
        this.f58548t = -1;
        this.f58540l.clear();
        this.f58551w = true;
        this.f58552x = false;
        this.f58553y = false;
        this.f58537i = false;
        this.f58549u = 1.0f;
        this.f58554z = false;
        this.f58526A = false;
        this.f58542n = false;
        this.f58527B = null;
        this.f58528C = null;
    }

    public final void I(boolean z10) {
        this.f58553y = z10;
    }

    public final void J(int i10) {
        this.f58534f = i10;
    }

    public final void K(boolean z10) {
        this.f58537i = z10;
    }

    public final void L(String str) {
        this.f58527B = str;
    }

    public final void M(boolean z10) {
        this.f58542n = z10;
    }

    public final void N(boolean z10) {
        this.f58541m = z10;
    }

    public final void O(float f10) {
        this.f58550v = f10;
    }

    public final void P(String str) {
        this.f58546r = str;
    }

    public final void Q(byte[] bArr) {
        this.f58536h = bArr;
    }

    public final void R(CharSequence charSequence) {
        this.f58544p = charSequence;
    }

    public final void S(boolean z10) {
        this.f58552x = z10;
    }

    public final void T(int i10) {
        this.f58531c = i10;
    }

    public final void U(CharSequence charSequence) {
        this.f58545q = charSequence;
    }

    public final void V(String str) {
        this.f58528C = str;
    }

    public final void W(int i10) {
        this.f58548t = i10;
    }

    public final void X(boolean z10) {
        this.f58551w = z10;
    }

    public final void Y(long j10) {
        this.f58547s = j10;
    }

    public final void Z(int i10) {
        this.f58532d = i10;
    }

    public final void a0(int i10) {
        this.f58533e = i10;
    }

    public final void b0(long j10) {
        this.f58529a = j10;
    }

    public final void c0(CharSequence charSequence) {
        this.f58543o = charSequence;
    }

    public final long d() {
        long j10 = (long) 31;
        long floatToIntBits = ((((((((((((((((long) this.f58530b) * j10) + ((long) this.f58531c)) * j10) + ((long) this.f58532d)) * j10) + ((long) this.f58533e)) * j10) + (this.f58539k ? 1 : 0)) * j10) + ((long) Float.floatToIntBits(this.f58538j))) * j10) + (this.f58541m ? 1 : 0)) * j10) + (this.f58551w ? 1 : 0)) * j10;
        CharSequence charSequence = this.f58543o;
        int i10 = 0;
        long hashCode = (floatToIntBits + ((long) (charSequence != null ? charSequence.hashCode() : 0))) * j10;
        String str = this.f58546r;
        long hashCode2 = (hashCode + ((long) (str != null ? str.hashCode() : 0))) * j10;
        CharSequence charSequence2 = this.f58544p;
        long hashCode3 = (hashCode2 + ((long) (charSequence2 != null ? charSequence2.hashCode() : 0))) * j10;
        CharSequence charSequence3 = this.f58545q;
        if (charSequence3 != null) {
            i10 = charSequence3.hashCode();
        }
        return hashCode3 + ((long) i10);
    }

    public final void d0(boolean z10) {
        this.f58526A = z10;
    }

    public final void e0(float f10) {
        this.f58538j = f10;
    }

    public final LinkedList<C9036b> f(C17642l<? super C9036b, Boolean> lVar) {
        C17542s.j(lVar, "predicate");
        LinkedList<C9036b> linkedList = new LinkedList<>();
        e(linkedList, lVar);
        return linkedList;
    }

    public final void f0(String str) {
        this.f58535g = str;
    }

    public final int g() {
        return this.f58534f;
    }

    public final void g0(float f10) {
        this.f58549u = f10;
    }

    public final List<C9036b> h() {
        return this.f58540l;
    }

    public final void h0(boolean z10) {
        this.f58539k = z10;
    }

    public final String i() {
        return this.f58527B;
    }

    public final void i0(boolean z10) {
        this.f58554z = z10;
    }

    public final float j() {
        return this.f58550v;
    }

    public final void j0(int i10) {
        this.f58530b = i10;
    }

    public final byte[] k() {
        return this.f58536h;
    }

    public final v<LinkedList<C9036b>, LinkedList<C9036b>> k0() {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList3.push(this);
        while (!linkedList3.isEmpty()) {
            C9036b bVar = (C9036b) linkedList3.removeFirst();
            if (!bVar.f58554z) {
                if (!bVar.f58551w || bVar.f58526A || !bVar.f58540l.isEmpty()) {
                    linkedList2.addFirst(bVar);
                } else {
                    linkedList.addFirst(bVar);
                }
                for (T addFirst : C16877v.Z0(bVar.f58540l)) {
                    linkedList3.addFirst(addFirst);
                }
            }
        }
        return new v<>(linkedList, linkedList2);
    }

    public final int l() {
        return this.f58531c;
    }

    public final String m() {
        return this.f58528C;
    }

    public final int n() {
        return this.f58548t;
    }

    public final long o() {
        return this.f58547s;
    }

    public final int p() {
        return this.f58532d;
    }

    public final int q() {
        return this.f58533e;
    }

    public final long r() {
        return this.f58529a;
    }

    public final CharSequence s() {
        return this.f58543o;
    }

    public final float t() {
        return this.f58538j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(300);
        G(sb2, "", "");
        String sb3 = sb2.toString();
        C17542s.i(sb3, "treeStr.toString()");
        return sb3;
    }

    public final String u() {
        return this.f58535g;
    }

    public final float v() {
        return this.f58549u;
    }

    public final int w() {
        return this.f58530b;
    }

    public final boolean x() {
        return this.f58553y;
    }

    public final boolean y() {
        return this.f58537i;
    }

    public final boolean z() {
        return this.f58542n;
    }
}
