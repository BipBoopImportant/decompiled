package nC;

import F4.b;
import HJ.C15854t;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import QJ.S;
import XH.C16807N;
import XH.y;
import android.graphics.Bitmap;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tI.C17978n;
import x2.C6244c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0019B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\bH@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LnC/b;", "LnC/a;", "LQJ/M;", "dispatcher", "<init>", "(LQJ/M;)V", "LF4/b$d;", "swatch", "", "threshold", "LnC/d;", "d", "(LF4/b$d;F)LnC/d;", "", "color", "", "e", "(IF)Z", "Landroid/graphics/Bitmap;", "bitmap", "left", "top", "right", "bottom", "luminanceThreshold", "a", "(Landroid/graphics/Bitmap;IIIIFLdI/e;)Ljava/lang/Object;", "LQJ/M;", "b", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nC.b  reason: case insensitive filesystem */
public final class C14841b implements C14840a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f129699b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f129700c = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final M f129701a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LnC/b$a;", "", "<init>", "()V", "", "MAX_COLOR_COUNT", "I", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nC.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LnC/d;", "<anonymous>", "(LQJ/Q;)LnC/d;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.systemui.internal.util.BitmapAnalyserImpl$isRegionDark$2", f = "BitmapAnalyser.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: nC.b$b  reason: collision with other inner class name */
    static final class C3190b extends l implements p<Q, C17164e<? super C14843d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129702c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f129703d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f129704e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f129705f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f129706g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f129707h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14841b f129708i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f129709j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Bitmap f129710k;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LF4/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(LQJ/Q;)LF4/b;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.systemui.internal.util.BitmapAnalyserImpl$isRegionDark$2$palette$1", f = "BitmapAnalyser.kt", l = {}, m = "invokeSuspend")
        /* renamed from: nC.b$b$a */
        static final class a extends l implements p<Q, C17164e<? super b>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f129711c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f129712d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Bitmap f129713e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f129714f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f129715g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f129716h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f129717i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, int i10, int i11, int i12, int i13, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f129713e = bitmap;
                this.f129714f = i10;
                this.f129715g = i11;
                this.f129716h = i12;
                this.f129717i = i13;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f129713e, this.f129714f, this.f129715g, this.f129716h, this.f129717i, eVar);
                aVar.f129712d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super b> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                C17187b.f();
                if (this.f129711c == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f129712d;
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a("analysing bitmap on dispatcher", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "SystemUi";
                        } else {
                            str = str3;
                        }
                        bVar.a(eVar, str, false, (Throwable) null, str4);
                        str2 = str4;
                        str3 = str;
                    }
                    return b.b(this.f129713e).d(3).a().f(this.f129714f, this.f129715g, this.f129716h, this.f129717i).b();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3190b(int i10, int i11, int i12, int i13, C14841b bVar, float f10, Bitmap bitmap, C17164e<? super C3190b> eVar) {
            super(2, eVar);
            this.f129704e = i10;
            this.f129705f = i11;
            this.f129706g = i12;
            this.f129707h = i13;
            this.f129708i = bVar;
            this.f129709j = f10;
            this.f129710k = bitmap;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3190b bVar = new C3190b(this.f129704e, this.f129705f, this.f129706g, this.f129707h, this.f129708i, this.f129709j, this.f129710k, eVar);
            bVar.f129703d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C14843d> eVar) {
            return ((C3190b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object f10 = C17187b.f();
            int i10 = this.f129702c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f129703d;
                int i11 = this.f129704e;
                int i12 = this.f129705f;
                if (i11 >= i12 || this.f129706g >= this.f129707h) {
                    int i13 = this.f129706g;
                    int i14 = this.f129707h;
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("invalid region: l:" + i11 + " t:" + i13 + " r:" + i12 + " b:" + i14, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        if (str2 == null) {
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "SystemUi";
                        }
                        bVar.a(eVar, str2, false, (Throwable) null, str);
                    }
                    return C14843d.Unknown;
                }
                M b10 = this.f129708i.f129701a;
                a aVar = r12;
                a aVar2 = new a(this.f129710k, this.f129704e, this.f129706g, this.f129705f, this.f129707h, (C17164e<? super a>) null);
                this.f129703d = q10;
                this.f129702c = 1;
                obj2 = C16310i.g(b10, aVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f129703d;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C17542s.i(obj2, "withContext(...)");
            b bVar2 = (b) obj2;
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar3 : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a("back on the caller thread", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                String str5 = str3;
                if (str4 == null) {
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "SystemUi";
                }
                String str6 = str4;
                bVar3.a(eVar2, str6, false, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
            }
            List<b.d> g10 = bVar2.g();
            C17542s.i(g10, "getSwatches(...)");
            Iterator it = g10.iterator();
            if (!it.hasNext()) {
                obj3 = null;
            } else {
                obj3 = it.next();
                if (it.hasNext()) {
                    int d10 = ((b.d) obj3).d();
                    do {
                        Object next3 = it.next();
                        int d11 = ((b.d) next3).d();
                        if (d10 < d11) {
                            obj3 = next3;
                            d10 = d11;
                        }
                    } while (it.hasNext());
                }
            }
            return this.f129708i.d((b.d) obj3, ((Number) C17978n.q(kotlin.coroutines.jvm.internal.b.d(this.f129709j), C17978n.c(0.0f, 1.0f))).floatValue());
        }
    }

    public C14841b(M m10) {
        C17542s.j(m10, "dispatcher");
        this.f129701a = m10;
    }

    /* access modifiers changed from: private */
    public final C14843d d(b.d dVar, float f10) {
        return dVar == null ? C14843d.Unknown : e(dVar.e(), f10) ? C14843d.Dark : C14843d.Light;
    }

    private final boolean e(int i10, float f10) {
        return C6244c.f(i10) < ((double) f10);
    }

    public Object a(Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, C17164e<? super C14843d> eVar) {
        return S.f(new C3190b(i10, i12, i11, i13, this, f10, bitmap, (C17164e<? super C3190b>) null), eVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14841b(M m10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16311i0.a() : m10);
    }
}
