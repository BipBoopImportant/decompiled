package U6;

import HJ.C15854t;
import N6.e;
import N6.i;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U6.i;
import WK.C16772g;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
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
import kotlin.jvm.internal.O;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\r\u001a\u00020\n*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LN6/i;", "response", "LTJ/g;", "LWK/g;", "d", "(LN6/i;)LTJ/g;", "", "contentType", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(LN6/i;)Z", "isMultipart", "apollo-runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LWK/g;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 5, 1})
    @f(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {28}, m = "invokeSuspend")
    static final class a extends l implements p<C16533h<? super C16772g>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40280c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f40281d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<i> f40282e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f40283f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O<i> o10, i iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f40282e = o10;
            this.f40283f = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f40282e, this.f40283f, eVar);
            aVar.f40281d = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super C16772g> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16533h hVar;
            C16772g c10;
            Object f10 = C17187b.f();
            int i10 = this.f40280c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar2 = (C16533h) this.f40281d;
                O<i> o10 = this.f40282e;
                C16772g a10 = this.f40283f.a();
                C17542s.g(a10);
                String a11 = h.b(e.a(this.f40283f.b(), "Content-Type"));
                if (a11 != null) {
                    o10.f144348a = new i(a10, a11);
                    hVar = hVar2;
                } else {
                    throw new S6.a("Expected the Content-Type to have a boundary parameter", (Throwable) null, 2, (DefaultConstructorMarker) null);
                }
            } else if (i10 == 1) {
                hVar = (C16533h) this.f40281d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            do {
                T t10 = this.f40282e.f144348a;
                C17542s.g(t10);
                i.b h10 = ((i) t10).h();
                if (h10 == null) {
                    return C16807N.f139792a;
                }
                c10 = h10.c();
                this.f40281d = hVar;
                this.f40280c = 1;
            } while (hVar.emit(c10, this) != f10);
            return f10;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "LWK/g;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @f(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<C16533h<? super C16772g>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40284c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f40285d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<i> f40286e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(O<i> o10, C17164e<? super b> eVar) {
            super(3, eVar);
            this.f40286e = o10;
        }

        public final Object invoke(C16533h<? super C16772g> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            b bVar = new b(this.f40286e, eVar);
            bVar.f40285d = hVar;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16807N n10;
            C17187b.f();
            if (this.f40284c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f40285d;
                O<i> o10 = this.f40286e;
                try {
                    x.a aVar = x.f139812b;
                    i iVar = (i) o10.f144348a;
                    if (iVar != null) {
                        iVar.close();
                        n10 = C16807N.f139792a;
                    } else {
                        n10 = null;
                    }
                    x.b(n10);
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    x.b(y.a(th2));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public static final String b(String str) {
        Object obj;
        List X02;
        String str2;
        if (str == null) {
            return null;
        }
        Iterable<String> X03 = C15854t.X0(str, new char[]{';'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C16877v.y(X03, 10));
        for (String z12 : X03) {
            arrayList.add(C15854t.z1(z12).toString());
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C15854t.W((String) obj, "boundary=", false, 2, (Object) null)) {
                break;
            }
        }
        String str3 = (String) obj;
        if (str3 == null || (X02 = C15854t.X0(str3, new char[]{'='}, false, 0, 6, (Object) null)) == null || (str2 = (String) C16877v.z0(X02, 1)) == null) {
            return null;
        }
        return C15854t.A1(str2, '\"', '\'');
    }

    public static final boolean c(N6.i iVar) {
        C17542s.j(iVar, "<this>");
        String a10 = e.a(iVar.b(), "Content-Type");
        return a10 != null && C15854t.U(a10, "multipart/", true);
    }

    public static final C16532g<C16772g> d(N6.i iVar) {
        C17542s.j(iVar, "response");
        O o10 = new O();
        return C16534i.Q(C16534i.H(new a(o10, iVar, (C17164e<? super a>) null)), new b(o10, (C17164e<? super b>) null));
    }
}
