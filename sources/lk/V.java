package lK;

import XH.C16807N;
import XH.C16810a;
import XH.C16811b;
import XH.C16812c;
import XH.C16820k;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kK.C17518g;
import kK.w;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import nI.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LlK/V;", "", "LkK/g;", "configuration", "LlK/a;", "lexer", "<init>", "(LkK/g;LlK/a;)V", "Lkotlinx/serialization/json/JsonElement;", "i", "()Lkotlinx/serialization/json/JsonElement;", "LXH/c;", "LXH/N;", "h", "(LXH/c;LdI/e;)Ljava/lang/Object;", "f", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "j", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", "g", "e", "a", "LlK/a;", "b", "Z", "isLenient", "c", "trailingCommaAllowed", "", "d", "I", "stackDepth", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class V {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17570a f144452a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f144453b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144454c;

    /* renamed from: d  reason: collision with root package name */
    private int f144455d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXH/c;", "LXH/N;", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
    static final class a extends k implements q<C16812c<C16807N, JsonElement>, C16807N, C17164e<? super JsonElement>, Object> {

        /* renamed from: d  reason: collision with root package name */
        int f144456d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f144457e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ V f144458f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(V v10, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f144458f = v10;
        }

        /* renamed from: i */
        public final Object invoke(C16812c<C16807N, JsonElement> cVar, C16807N n10, C17164e<? super JsonElement> eVar) {
            a aVar = new a(this.f144458f, eVar);
            aVar.f144457e = cVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f144456d;
            if (i10 == 0) {
                y.b(obj);
                C16812c cVar = (C16812c) this.f144457e;
                byte H10 = this.f144458f.f144452a.H();
                if (H10 == 1) {
                    return this.f144458f.j(true);
                }
                if (H10 == 0) {
                    return this.f144458f.j(false);
                }
                if (H10 == 6) {
                    V v10 = this.f144458f;
                    this.f144456d = 1;
                    obj = v10.h(cVar, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (H10 == 8) {
                    return this.f144458f.f();
                } else {
                    C17570a.z(this.f144458f.f144452a, "Can't begin reading element, unexpected token", 0, (String) null, 6, (Object) null);
                    throw new C16820k();
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (JsonElement) obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f144459c;

        /* renamed from: d  reason: collision with root package name */
        Object f144460d;

        /* renamed from: e  reason: collision with root package name */
        Object f144461e;

        /* renamed from: f  reason: collision with root package name */
        Object f144462f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f144463g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ V f144464h;

        /* renamed from: i  reason: collision with root package name */
        int f144465i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(V v10, C17164e<? super b> eVar) {
            super(eVar);
            this.f144464h = v10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f144463g = obj;
            this.f144465i |= Integer.MIN_VALUE;
            return this.f144464h.h((C16812c<C16807N, JsonElement>) null, this);
        }
    }

    public V(C17518g gVar, C17570a aVar) {
        C17542s.j(gVar, "configuration");
        C17542s.j(aVar, "lexer");
        this.f144452a = aVar;
        this.f144453b = gVar.q();
        this.f144454c = gVar.d();
    }

    /* access modifiers changed from: private */
    public final JsonElement f() {
        byte k10 = this.f144452a.k();
        if (this.f144452a.H() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f144452a.f()) {
                arrayList.add(e());
                k10 = this.f144452a.k();
                if (k10 != 4) {
                    C17570a aVar = this.f144452a;
                    boolean z10 = k10 == 9;
                    int i10 = aVar.f144471a;
                    if (!z10) {
                        C17570a.z(aVar, "Expected end of the array or comma", i10, (String) null, 4, (Object) null);
                        throw new C16820k();
                    }
                }
            }
            if (k10 == 8) {
                this.f144452a.l((byte) 9);
            } else if (k10 == 4) {
                if (this.f144454c) {
                    this.f144452a.l((byte) 9);
                } else {
                    C17562C.g(this.f144452a, "array");
                    throw new C16820k();
                }
            }
            return new JsonArray(arrayList);
        }
        C17570a.z(this.f144452a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    private final JsonElement g() {
        return (JsonElement) C16811b.b(new C16810a(new a(this, (C17164e<? super a>) null)), C16807N.f139792a);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(XH.C16812c<XH.C16807N, kotlinx.serialization.json.JsonElement> r21, dI.C17164e<? super kotlinx.serialization.json.JsonElement> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof lK.V.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            lK.V$b r2 = (lK.V.b) r2
            int r3 = r2.f144465i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f144465i = r3
            goto L_0x001c
        L_0x0017:
            lK.V$b r2 = new lK.V$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f144463g
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f144465i
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r4 == 0) goto L_0x0048
            if (r4 != r8) goto L_0x0040
            java.lang.Object r4 = r2.f144462f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r2.f144461e
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.Object r10 = r2.f144460d
            lK.V r10 = (lK.V) r10
            java.lang.Object r11 = r2.f144459c
            XH.c r11 = (XH.C16812c) r11
            XH.y.b(r1)
            goto L_0x00a0
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            XH.y.b(r1)
            lK.a r1 = r0.f144452a
            byte r1 = r1.l(r5)
            lK.a r4 = r0.f144452a
            byte r4 = r4.H()
            if (r4 == r7) goto L_0x00ee
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r10 = r0
            r9 = r4
            r4 = r2
            r2 = r1
            r1 = r21
        L_0x0064:
            lK.a r11 = r10.f144452a
            boolean r11 = r11.f()
            if (r11 == 0) goto L_0x00c8
            boolean r2 = r10.f144453b
            if (r2 == 0) goto L_0x0077
            lK.a r2 = r10.f144452a
            java.lang.String r2 = r2.s()
            goto L_0x007d
        L_0x0077:
            lK.a r2 = r10.f144452a
            java.lang.String r2 = r2.q()
        L_0x007d:
            lK.a r11 = r10.f144452a
            r12 = 5
            r11.l(r12)
            XH.N r11 = XH.C16807N.f139792a
            r4.f144459c = r1
            r4.f144460d = r10
            r4.f144461e = r9
            r4.f144462f = r2
            r4.f144465i = r8
            java.lang.Object r11 = r1.a(r11, r4)
            if (r11 != r3) goto L_0x0096
            return r3
        L_0x0096:
            r18 = r11
            r11 = r1
            r1 = r18
            r19 = r4
            r4 = r2
            r2 = r19
        L_0x00a0:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            r9.put(r4, r1)
            lK.a r1 = r10.f144452a
            byte r1 = r1.k()
            if (r1 == r7) goto L_0x00c4
            if (r1 != r6) goto L_0x00b1
            r2 = r1
            goto L_0x00c8
        L_0x00b1:
            lK.a r12 = r10.f144452a
            r16 = 6
            r17 = 0
            java.lang.String r13 = "Expected end of the object or comma"
            r14 = 0
            r15 = 0
            lK.C17570a.z(r12, r13, r14, r15, r16, r17)
            XH.k r1 = new XH.k
            r1.<init>()
            throw r1
        L_0x00c4:
            r4 = r2
            r2 = r1
            r1 = r11
            goto L_0x0064
        L_0x00c8:
            if (r2 != r5) goto L_0x00d0
            lK.a r1 = r10.f144452a
            r1.l(r6)
            goto L_0x00e8
        L_0x00d0:
            if (r2 != r7) goto L_0x00e8
            boolean r1 = r10.f144454c
            if (r1 == 0) goto L_0x00dc
            lK.a r1 = r10.f144452a
            r1.l(r6)
            goto L_0x00e8
        L_0x00dc:
            lK.a r1 = r10.f144452a
            r2 = 0
            lK.C17562C.h(r1, r2, r8, r2)
            XH.k r1 = new XH.k
            r1.<init>()
            throw r1
        L_0x00e8:
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            r1.<init>(r9)
            return r1
        L_0x00ee:
            lK.a r2 = r0.f144452a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Unexpected leading comma"
            r4 = 0
            r5 = 0
            lK.C17570a.z(r2, r3, r4, r5, r6, r7)
            XH.k r1 = new XH.k
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.V.h(XH.c, dI.e):java.lang.Object");
    }

    private final JsonElement i() {
        byte l10 = this.f144452a.l((byte) 6);
        if (this.f144452a.H() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f144452a.f()) {
                    break;
                }
                String s10 = this.f144453b ? this.f144452a.s() : this.f144452a.q();
                this.f144452a.l((byte) 5);
                linkedHashMap.put(s10, e());
                l10 = this.f144452a.k();
                if (l10 != 4) {
                    if (l10 != 7) {
                        C17570a.z(this.f144452a, "Expected end of the object or comma", 0, (String) null, 6, (Object) null);
                        throw new C16820k();
                    }
                }
            }
            if (l10 == 6) {
                this.f144452a.l((byte) 7);
            } else if (l10 == 4) {
                if (this.f144454c) {
                    this.f144452a.l((byte) 7);
                } else {
                    C17562C.h(this.f144452a, (String) null, 1, (Object) null);
                    throw new C16820k();
                }
            }
            return new JsonObject(linkedHashMap);
        }
        C17570a.z(this.f144452a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    /* access modifiers changed from: private */
    public final JsonPrimitive j(boolean z10) {
        String s10 = (this.f144453b || !z10) ? this.f144452a.s() : this.f144452a.q();
        return (z10 || !C17542s.e(s10, "null")) ? new w(s10, z10, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null) : JsonNull.INSTANCE;
    }

    public final JsonElement e() {
        byte H10 = this.f144452a.H();
        if (H10 == 1) {
            return j(true);
        }
        if (H10 == 0) {
            return j(false);
        }
        if (H10 == 6) {
            int i10 = this.f144455d + 1;
            this.f144455d = i10;
            this.f144455d--;
            return i10 == 200 ? g() : i();
        } else if (H10 == 8) {
            return f();
        } else {
            C17570a.z(this.f144452a, "Cannot read Json element because of unexpected " + C17571b.c(H10), 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }
}
