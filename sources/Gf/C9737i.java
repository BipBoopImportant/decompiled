package gf;

import HJ.C15838d;
import HJ.C15854t;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.ingka.ikea.app.auth.opensource.Dependencies;
import com.ingka.ikea.app.auth.opensource.LocalDependency;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gf.m;
import ip.C11410b;
import jI.C17416c;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020$0\u001d8\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0+j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lgf/i;", "Landroidx/lifecycle/f0;", "LkK/c;", "json", "LQJ/M;", "backgroundWorkDispatcher", "<init>", "(LkK/c;LQJ/M;)V", "Ljava/io/InputStream;", "inputStream", "", "I", "(Ljava/io/InputStream;)Ljava/lang/String;", "Landroid/content/Context;", "context", "fileName", "LXH/N;", "E", "(Landroid/content/Context;Ljava/lang/String;)V", "m", "LkK/c;", "n", "LQJ/M;", "Landroidx/lifecycle/K;", "", "Lgf/a;", "o", "Landroidx/lifecycle/K;", "_sections", "Landroidx/lifecycle/F;", "p", "Landroidx/lifecycle/F;", "G", "()Landroidx/lifecycle/F;", "sections", "Lip/b;", "Lgf/m;", "q", "Lip/b;", "_status", "r", "H", "status", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "s", "Ljava/util/HashMap;", "licenses", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gf.i  reason: case insensitive filesystem */
public final class C9737i extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C17514c f73076m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final M f73077n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final K<List<C9729a>> f73078o;

    /* renamed from: p  reason: collision with root package name */
    private final F<List<C9729a>> f73079p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C11410b<m> f73080q;

    /* renamed from: r  reason: collision with root package name */
    private final F<m> f73081r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final HashMap<String, String> f73082s = new HashMap<>();

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gf/i$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gf.i$a */
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9737i f73083a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, C9737i iVar) {
            super(aVar);
            this.f73083a = iVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f73083a.f73080q.d(m.a.f73095a);
            C9737i iVar2 = this.f73083a;
            e eVar = e.ERROR;
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
                    String a10 = C11818a.a("Failed showing open source licenses.", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = iVar2.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.auth.opensource.OpenSourceDisclaimerViewModel$createData$2", f = "OpenSourceDisclaimerViewModel.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: gf.i$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73084c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C9737i f73085d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f73086e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f73087f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.auth.opensource.OpenSourceDisclaimerViewModel$createData$2$1", f = "OpenSourceDisclaimerViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: gf.i$b$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f73088c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f73089d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C9737i f73090e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Context f73091f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f73092g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: gf.i$b$a$a  reason: collision with other inner class name */
            public static final class C1274a<T> implements Comparator {
                public final int compare(T t10, T t11) {
                    return C17035a.e(((LocalDependency) t10).g(), ((LocalDependency) t11).g());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C9737i iVar, Context context, String str, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f73090e = iVar;
                this.f73091f = context;
                this.f73092g = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f73090e, this.f73091f, this.f73092g, eVar);
                aVar.f73089d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                Q q10;
                Iterator it;
                C9737i iVar;
                C9737i iVar2;
                Q q11;
                Context context;
                Iterator it2;
                Throwable th2;
                Context context2;
                Iterator it3;
                String str2;
                Iterator it4;
                C17187b.f();
                if (this.f73088c == 0) {
                    y.b(obj);
                    Q q12 = (Q) this.f73089d;
                    C9737i iVar3 = this.f73090e;
                    InputStream open = this.f73091f.getAssets().open(this.f73092g);
                    C17542s.i(open, "open(...)");
                    String D10 = iVar3.I(open);
                    if (D10 != null) {
                        C9737i iVar4 = this.f73090e;
                        Context context3 = this.f73091f;
                        C17514c i10 = iVar4.f73076m;
                        i10.a();
                        Dependencies dependencies = (Dependencies) i10.c(Dependencies.Companion.serializer(), D10);
                        Iterator it5 = dependencies.b().iterator();
                        while (true) {
                            boolean hasNext = it5.hasNext();
                            str = DslKt.INDICATOR_BACKGROUND;
                            if (!hasNext) {
                                break;
                            }
                            LocalDependency localDependency = (LocalDependency) it5.next();
                            if (localDependency.d() || iVar4.f73082s.get(localDependency.e()) != null) {
                                context = context3;
                                it2 = it5;
                            } else {
                                e eVar = e.DEBUG;
                                ArrayList arrayList = new ArrayList();
                                for (Object next : d.f102012a.a()) {
                                    Iterator it6 = it5;
                                    if (((C11819b) next).b(eVar, false)) {
                                        arrayList.add(next);
                                    }
                                    it5 = it6;
                                }
                                it2 = it5;
                                Iterator it7 = arrayList.iterator();
                                String str3 = null;
                                String str4 = null;
                                while (it7.hasNext()) {
                                    C11819b bVar = (C11819b) it7.next();
                                    if (str3 == null) {
                                        String a10 = C11818a.a("Parsing -> " + localDependency.e(), (Throwable) null);
                                        if (a10 == null) {
                                            break;
                                        }
                                        str3 = C11820c.a(a10);
                                    }
                                    if (str4 == null) {
                                        String name = q12.getClass().getName();
                                        C17542s.g(name);
                                        it4 = it7;
                                        str2 = str;
                                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                        if (o12.length() != 0) {
                                            name = C15854t.P0(o12, "Kt");
                                        }
                                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name;
                                    } else {
                                        it4 = it7;
                                        str2 = str;
                                    }
                                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                                    it7 = it4;
                                    str = str2;
                                }
                                String str5 = str;
                                InputStream open2 = context3.getAssets().open(localDependency.e());
                                try {
                                    C17542s.g(open2);
                                    String D11 = iVar4.I(open2);
                                    if (D11 != null) {
                                        if (D11.length() != 0) {
                                            iVar4.f73082s.put(localDependency.e(), D11);
                                            context = context3;
                                            C16807N n10 = C16807N.f139792a;
                                            C17416c.a(open2, (Throwable) null);
                                        }
                                    }
                                    IllegalStateException illegalStateException = new IllegalStateException("Missing license file!");
                                    e eVar2 = e.ERROR;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object next2 : d.f102012a.a()) {
                                        if (((C11819b) next2).b(eVar2, false)) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    Iterator it8 = arrayList2.iterator();
                                    String str6 = null;
                                    String str7 = null;
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            break;
                                        }
                                        C11819b bVar2 = (C11819b) it8.next();
                                        if (str6 == null) {
                                            String a11 = C11818a.a((String) null, illegalStateException);
                                            if (a11 == null) {
                                                break;
                                            }
                                            str6 = C11820c.a(a11);
                                        }
                                        if (str7 == null) {
                                            String name2 = q12.getClass().getName();
                                            C17542s.g(name2);
                                            context2 = context3;
                                            it3 = it8;
                                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                            if (o13.length() != 0) {
                                                name2 = C15854t.P0(o13, "Kt");
                                            }
                                            str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str5) + DslKt.INDICATOR_SEPARATOR + name2;
                                        } else {
                                            context2 = context3;
                                            it3 = it8;
                                        }
                                        bVar2.a(eVar2, str7, false, illegalStateException, str6);
                                        it8 = it3;
                                        context3 = context2;
                                    }
                                    context = context3;
                                    C16807N n102 = C16807N.f139792a;
                                    C17416c.a(open2, (Throwable) null);
                                } catch (Throwable th3) {
                                    Throwable th4 = th3;
                                    C17416c.a(open2, th2);
                                    throw th4;
                                }
                            }
                            it5 = it2;
                            context3 = context;
                        }
                        String str8 = str;
                        K k10 = iVar4.f73078o;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object next3 : dependencies.b()) {
                            if (!((LocalDependency) next3).d()) {
                                arrayList3.add(next3);
                            }
                        }
                        Iterable g12 = C16877v.g1(arrayList3, new C1274a());
                        ArrayList arrayList4 = new ArrayList(C16877v.y(g12, 10));
                        Iterator it9 = g12.iterator();
                        while (it9.hasNext()) {
                            LocalDependency localDependency2 = (LocalDependency) it9.next();
                            String str9 = (String) iVar4.f73082s.get(localDependency2.e());
                            if (str9 == null) {
                                IllegalStateException illegalStateException2 = new IllegalStateException("Missing license text!");
                                e eVar3 = e.ERROR;
                                ArrayList arrayList5 = new ArrayList();
                                for (Object next4 : d.f102012a.a()) {
                                    Iterator it10 = it9;
                                    if (((C11819b) next4).b(eVar3, false)) {
                                        arrayList5.add(next4);
                                    }
                                    it9 = it10;
                                }
                                it = it9;
                                Iterator it11 = arrayList5.iterator();
                                String str10 = null;
                                String str11 = null;
                                while (true) {
                                    if (!it11.hasNext()) {
                                        q10 = q12;
                                        iVar = iVar4;
                                        break;
                                    }
                                    C11819b bVar3 = (C11819b) it11.next();
                                    if (str10 == null) {
                                        String a12 = C11818a.a((String) null, illegalStateException2);
                                        if (a12 == null) {
                                            q10 = q12;
                                            iVar = iVar4;
                                            break;
                                        }
                                        str10 = C11820c.a(a12);
                                    }
                                    if (str11 == null) {
                                        String name3 = q12.getClass().getName();
                                        C17542s.g(name3);
                                        q11 = q12;
                                        iVar2 = iVar4;
                                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                        if (o14.length() != 0) {
                                            name3 = C15854t.P0(o14, "Kt");
                                        }
                                        str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str8) + DslKt.INDICATOR_SEPARATOR + name3;
                                    } else {
                                        q11 = q12;
                                        iVar2 = iVar4;
                                    }
                                    bVar3.a(eVar3, str11, false, illegalStateException2, str10);
                                    q12 = q11;
                                    iVar4 = iVar2;
                                }
                                str9 = "";
                            } else {
                                q10 = q12;
                                it = it9;
                                iVar = iVar4;
                            }
                            arrayList4.add(new C9729a(localDependency2.g(), localDependency2.f(), str9, localDependency2.c(), C16877v.f1(localDependency2.b())));
                            q12 = q10;
                            iVar4 = iVar;
                            it9 = it;
                        }
                        k10.postValue(arrayList4);
                        C16807N n11 = C16807N.f139792a;
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C9737i iVar, Context context, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f73085d = iVar;
            this.f73086e = context;
            this.f73087f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f73085d, this.f73086e, this.f73087f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73084c;
            if (i10 == 0) {
                y.b(obj);
                M h10 = this.f73085d.f73077n;
                a aVar = new a(this.f73085d, this.f73086e, this.f73087f, (C17164e<? super a>) null);
                this.f73084c = 1;
                if (C16310i.g(h10, aVar, this) == f10) {
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

    public C9737i(C17514c cVar, M m10) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(m10, "backgroundWorkDispatcher");
        this.f73076m = cVar;
        this.f73077n = m10;
        K<List<C9729a>> k10 = new K<>();
        this.f73078o = k10;
        this.f73079p = k10;
        C11410b<m> bVar = new C11410b<>();
        this.f73080q = bVar;
        this.f73081r = bVar;
    }

    public static /* synthetic */ void F(C9737i iVar, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "legal/dependencies.json";
        }
        iVar.E(context, str);
    }

    /* access modifiers changed from: private */
    public final String I(InputStream inputStream) {
        try {
            int available = inputStream.available();
            byte[] bArr = new byte[available];
            inputStream.read(bArr, 0, available);
            return new String(bArr, C15838d.f135279b);
        } catch (IOException unused) {
            return null;
        }
    }

    public final void E(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, context, str, (C17164e<? super b>) null), 2, (Object) null);
    }

    public final F<List<C9729a>> G() {
        return this.f73079p;
    }

    public final F<m> H() {
        return this.f73081r;
    }
}
