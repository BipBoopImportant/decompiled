package x4;

import HJ.C15854t;
import XH.C16807N;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParserException;
import x4.C;
import x4.q;
import y4.C8977a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J7\u0010!\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020#2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010'¨\u0006("}, d2 = {"Lx4/B;", "", "Landroid/content/Context;", "context", "Lx4/J;", "navigatorProvider", "<init>", "(Landroid/content/Context;Lx4/J;)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "", "graphResId", "Lx4/v;", "a", "(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Lx4/v;", "dest", "LXH/N;", "f", "(Landroid/content/res/Resources;Lx4/v;Landroid/util/AttributeSet;I)V", "Landroid/os/Bundle;", "bundle", "e", "(Landroid/content/res/Resources;Landroid/os/Bundle;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "Lx4/i;", "d", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Lx4/i;", "g", "(Landroid/content/res/Resources;Lx4/v;Landroid/util/AttributeSet;)V", "c", "(Landroid/content/res/Resources;Lx4/v;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;I)V", "Lx4/x;", "b", "(I)Lx4/x;", "Landroid/content/Context;", "Lx4/J;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x4.B  reason: case insensitive filesystem */
public final class C8936B {

    /* renamed from: c  reason: collision with root package name */
    public static final a f57391c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f57392d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final Context f57393a;

    /* renamed from: b  reason: collision with root package name */
    private final J f57394b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lx4/B$a;", "", "<init>", "()V", "Landroid/util/TypedValue;", "value", "Lx4/F;", "navType", "expectedNavType", "", "argType", "foundType", "a", "(Landroid/util/TypedValue;Lx4/F;Lx4/F;Ljava/lang/String;Ljava/lang/String;)Lx4/F;", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "Ljava/lang/ThreadLocal;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.B$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F<?> a(TypedValue typedValue, F<?> f10, F<?> f11, String str, String str2) {
            C17542s.j(typedValue, "value");
            C17542s.j(f11, "expectedNavType");
            C17542s.j(str2, "foundType");
            if (f10 == null || f10 == f11) {
                return f10 == null ? f11 : f10;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }

        private a() {
        }
    }

    public C8936B(Context context, J j10) {
        C17542s.j(context, "context");
        C17542s.j(j10, "navigatorProvider");
        this.f57393a = context;
        this.f57394b = j10;
    }

    private final v a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) {
        int depth;
        J j10 = this.f57394b;
        String name = xmlResourceParser.getName();
        C17542s.i(name, "parser.name");
        v a10 = j10.e(name).a();
        a10.J(this.f57393a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a10;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (C17542s.e("argument", name2)) {
                    f(resources, a10, attributeSet, i10);
                } else if (C17542s.e("deepLink", name2)) {
                    g(resources, a10, attributeSet);
                } else if (C17542s.e("action", name2)) {
                    c(resources, a10, attributeSet, xmlResourceParser, i10);
                } else if (C17542s.e("include", name2) && (a10 instanceof x)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, N.f57481i);
                    C17542s.i(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((x) a10).R(b(obtainAttributes.getResourceId(N.f57482j, 0)));
                    C16807N n10 = C16807N.f139792a;
                    obtainAttributes.recycle();
                } else if (a10 instanceof x) {
                    ((x) a10).R(a(resources, xmlResourceParser, attributeSet, i10));
                }
            }
        }
        return a10;
    }

    private final void c(Resources resources, v vVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) {
        int depth;
        Context context = this.f57393a;
        int[] iArr = C8977a.f57804a;
        C17542s.i(iArr, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C8977a.f57805b, 0);
        C8944h hVar = new C8944h(obtainStyledAttributes.getResourceId(C8977a.f57806c, 0), (C) null, (Bundle) null, 6, (DefaultConstructorMarker) null);
        C.a aVar = new C.a();
        aVar.d(obtainStyledAttributes.getBoolean(C8977a.f57809f, false));
        aVar.m(obtainStyledAttributes.getBoolean(C8977a.f57815l, false));
        aVar.g(obtainStyledAttributes.getResourceId(C8977a.f57812i, -1), obtainStyledAttributes.getBoolean(C8977a.f57813j, false), obtainStyledAttributes.getBoolean(C8977a.f57814k, false));
        aVar.b(obtainStyledAttributes.getResourceId(C8977a.f57807d, -1));
        aVar.c(obtainStyledAttributes.getResourceId(C8977a.f57808e, -1));
        aVar.e(obtainStyledAttributes.getResourceId(C8977a.f57810g, -1));
        aVar.f(obtainStyledAttributes.getResourceId(C8977a.f57811h, -1));
        hVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && C17542s.e("argument", xmlResourceParser.getName())) {
                    e(resources, bundle, attributeSet, i10);
                }
            }
        }
        if (!bundle.isEmpty()) {
            hVar.d(bundle);
        }
        vVar.K(resourceId, hVar);
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final x4.C8945i d(android.content.res.TypedArray r11, android.content.res.Resources r12, int r13) {
        /*
            r10 = this;
            x4.i$a r0 = new x4.i$a
            r0.<init>()
            int r1 = y4.C8977a.f57820q
            r2 = 0
            boolean r1 = r11.getBoolean(r1, r2)
            r0.c(r1)
            java.lang.ThreadLocal<android.util.TypedValue> r1 = f57392d
            java.lang.Object r3 = r1.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0021
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r1.set(r3)
        L_0x0021:
            int r1 = y4.C8977a.f57819p
            java.lang.String r8 = r11.getString(r1)
            r1 = 0
            if (r8 == 0) goto L_0x0036
            x4.F$q r4 = x4.F.f57428c
            java.lang.String r13 = r12.getResourcePackageName(r13)
            x4.F r13 = r4.a(r8, r13)
            r6 = r13
            goto L_0x0037
        L_0x0036:
            r6 = r1
        L_0x0037:
            int r13 = y4.C8977a.f57818o
            boolean r13 = r11.getValue(r13, r3)
            if (r13 == 0) goto L_0x0178
            x4.F<java.lang.Integer> r13 = x4.F.f57430e
            java.lang.String r1 = "' for "
            java.lang.String r4 = "unsupported value '"
            r5 = 16
            if (r6 != r13) goto L_0x0083
            int r11 = r3.resourceId
            if (r11 == 0) goto L_0x004f
            r2 = r11
            goto L_0x0057
        L_0x004f:
            int r11 = r3.type
            if (r11 != r5) goto L_0x005d
            int r11 = r3.data
            if (r11 != 0) goto L_0x005d
        L_0x0057:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x0178
        L_0x005d:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r1)
            java.lang.String r13 = r6.b()
            r12.append(r13)
            java.lang.String r13 = ". Must be a reference to a resource."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0083:
            int r7 = r3.resourceId
            if (r7 == 0) goto L_0x00c2
            if (r6 != 0) goto L_0x0090
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r6 = r13
            goto L_0x0178
        L_0x0090:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.CharSequence r0 = r3.string
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = r6.b()
            r12.append(r0)
            java.lang.String r0 = ". You must use a \""
            r12.append(r0)
            java.lang.String r13 = r13.b()
            r12.append(r13)
            java.lang.String r13 = "\" type to reference other resources."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c2:
            x4.F<java.lang.String> r13 = x4.F.f57442q
            if (r6 != r13) goto L_0x00ce
            int r12 = y4.C8977a.f57818o
            java.lang.String r1 = r11.getString(r12)
            goto L_0x0178
        L_0x00ce:
            int r11 = r3.type
            r13 = 3
            if (r11 == r13) goto L_0x0166
            r13 = 4
            if (r11 == r13) goto L_0x0152
            r13 = 5
            if (r11 == r13) goto L_0x0139
            r12 = 18
            if (r11 == r12) goto L_0x0124
            if (r11 < r5) goto L_0x010b
            r12 = 31
            if (r11 > r12) goto L_0x010b
            x4.F<java.lang.Float> r7 = x4.F.f57436k
            if (r6 != r7) goto L_0x00f9
            x4.B$a r4 = f57391c
            java.lang.String r9 = "float"
            r5 = r3
            x4.F r6 = r4.a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            float r11 = (float) r11
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0178
        L_0x00f9:
            x4.B$a r4 = f57391c
            x4.F<java.lang.Integer> r7 = x4.F.f57429d
            java.lang.String r9 = "integer"
            r5 = r3
            x4.F r6 = r4.a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0178
        L_0x010b:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unsupported argument type "
            r12.append(r13)
            int r13 = r3.type
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0124:
            x4.B$a r4 = f57391c
            x4.F<java.lang.Boolean> r7 = x4.F.f57439n
            java.lang.String r9 = "boolean"
            r5 = r3
            x4.F r6 = r4.a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            if (r11 == 0) goto L_0x0134
            r2 = 1
        L_0x0134:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x0178
        L_0x0139:
            x4.B$a r4 = f57391c
            x4.F<java.lang.Integer> r7 = x4.F.f57429d
            java.lang.String r9 = "dimension"
            r5 = r3
            x4.F r6 = r4.a(r5, r6, r7, r8, r9)
            android.util.DisplayMetrics r11 = r12.getDisplayMetrics()
            float r11 = r3.getDimension(r11)
            int r11 = (int) r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0178
        L_0x0152:
            x4.B$a r4 = f57391c
            x4.F<java.lang.Float> r7 = x4.F.f57436k
            java.lang.String r9 = "float"
            r5 = r3
            x4.F r6 = r4.a(r5, r6, r7, r8, r9)
            float r11 = r3.getFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0178
        L_0x0166:
            java.lang.CharSequence r11 = r3.string
            java.lang.String r11 = r11.toString()
            if (r6 != 0) goto L_0x0174
            x4.F$q r12 = x4.F.f57428c
            x4.F r6 = r12.b(r11)
        L_0x0174:
            java.lang.Object r1 = r6.f(r11)
        L_0x0178:
            if (r1 == 0) goto L_0x017d
            r0.b(r1)
        L_0x017d:
            if (r6 == 0) goto L_0x0182
            r0.d(r6)
        L_0x0182:
            x4.i r11 = r0.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8936B.d(android.content.res.TypedArray, android.content.res.Resources, int):x4.i");
    }

    private final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C8977a.f57816m);
        C17542s.i(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(C8977a.f57817n);
        if (string != null) {
            C17542s.i(string, "array.getString(R.stylea…uments must have a name\")");
            C8945i d10 = d(obtainAttributes, resources, i10);
            if (d10.b()) {
                d10.e(string, bundle);
            }
            C16807N n10 = C16807N.f139792a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void f(Resources resources, v vVar, AttributeSet attributeSet, int i10) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C8977a.f57816m);
        C17542s.i(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(C8977a.f57817n);
        if (string != null) {
            C17542s.i(string, "array.getString(R.stylea…uments must have a name\")");
            vVar.i(string, d(obtainAttributes, resources, i10));
            C16807N n10 = C16807N.f139792a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void g(Resources resources, v vVar, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C8977a.f57821r);
        C17542s.i(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(C8977a.f57824u);
        String string2 = obtainAttributes.getString(C8977a.f57822s);
        String string3 = obtainAttributes.getString(C8977a.f57823t);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        q.a aVar = new q.a();
        if (string != null) {
            String packageName = this.f57393a.getPackageName();
            C17542s.i(packageName, "context.packageName");
            aVar.d(C15854t.Q(string, "${applicationId}", packageName, false, 4, (Object) null));
        }
        if (!(string2 == null || string2.length() == 0)) {
            String packageName2 = this.f57393a.getPackageName();
            C17542s.i(packageName2, "context.packageName");
            aVar.b(C15854t.Q(string2, "${applicationId}", packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.f57393a.getPackageName();
            C17542s.i(packageName3, "context.packageName");
            aVar.c(C15854t.Q(string3, "${applicationId}", packageName3, false, 4, (Object) null));
        }
        vVar.k(aVar.a());
        C16807N n10 = C16807N.f139792a;
        obtainAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f A[Catch:{ Exception -> 0x003d, all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[Catch:{ Exception -> 0x003d, all -> 0x003b }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x4.x b(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f57393a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x003d }
            r4 = 2
            if (r3 == r4) goto L_0x001d
            r5 = 1
            if (r3 != r5) goto L_0x0013
        L_0x001d:
            if (r3 != r4) goto L_0x005f
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = "res"
            kotlin.jvm.internal.C17542s.i(r0, r4)     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = "attrs"
            kotlin.jvm.internal.C17542s.i(r2, r4)     // Catch:{ Exception -> 0x003d }
            x4.v r2 = r6.a(r0, r1, r2, r7)     // Catch:{ Exception -> 0x003d }
            boolean r4 = r2 instanceof x4.x     // Catch:{ Exception -> 0x003d }
            if (r4 == 0) goto L_0x003f
            x4.x r2 = (x4.x) r2     // Catch:{ Exception -> 0x003d }
            r1.close()
            return r2
        L_0x003b:
            r7 = move-exception
            goto L_0x008e
        L_0x003d:
            r2 = move-exception
            goto L_0x0067
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003d }
            r2.<init>()     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x003d }
            r2.append(r3)     // Catch:{ Exception -> 0x003d }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003d }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003d }
            r3.<init>(r2)     // Catch:{ Exception -> 0x003d }
            throw r3     // Catch:{ Exception -> 0x003d }
        L_0x005f:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x003d }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x003d }
            throw r2     // Catch:{ Exception -> 0x003d }
        L_0x0067:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r4.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x003b }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x003b }
            r4.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x003b }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x003b }
            r4.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x003b }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x003b }
            throw r3     // Catch:{ all -> 0x003b }
        L_0x008e:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8936B.b(int):x4.x");
    }
}
