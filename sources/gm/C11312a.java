package gm;

import HJ.C15854t;
import com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceDetailsRemote;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import fm.C11273a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pp.C11769c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgm/a;", "Lpp/c;", "Lfm/a;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote;", "<init>", "()V", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote;", "Lfm/a$a;", "b", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote;)Lfm/a$a;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;", "Lfm/a$b;", "c", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;)Lfm/a$b;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;", "", "d", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;)Ljava/lang/Double;", "remote", "e", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote;)Lfm/a;", "a", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gm.a  reason: case insensitive filesystem */
public final class C11312a implements C11769c<C11273a, AssemblyServiceDetailsRemote> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lgm/a$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "BASE", "MINIMUM", "NONE", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.a$a  reason: collision with other inner class name */
    public enum C2186a {
        BASE("BASE"),
        MINIMUM("MINIMUM"),
        NONE("NONE");
        
        public static final C2187a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgm/a$a$a;", "", "<init>", "()V", "", "rawValue", "Lfm/a$c;", "a", "(Ljava/lang/String;)Lfm/a$c;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gm.a$a$a  reason: collision with other inner class name */
        public static final class C2187a {
            public /* synthetic */ C2187a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C11273a.c a(String str) {
                if (C17542s.e(str, C2186a.BASE.b())) {
                    return C11273a.c.BASE;
                }
                if (C17542s.e(str, C2186a.MINIMUM.b())) {
                    return C11273a.c.MINIMUM;
                }
                if (!C17542s.e(str, C2186a.NONE.b()) && str != null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid base price type: " + str);
                    e eVar = e.ERROR;
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
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = C2187a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                }
                return null;
            }

            private C2187a() {
            }
        }

        static {
            C2186a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2187a((DefaultConstructorMarker) null);
        }

        private C2186a(String str) {
            this.rawValue = str;
        }

        public final String b() {
            return this.rawValue;
        }
    }

    private final C11273a.C2166a b(AssemblyServiceDetailsRemote.AssemblyDetailsItemRemote assemblyDetailsItemRemote) {
        Double d10 = d(assemblyDetailsItemRemote.c());
        Double d11 = d(assemblyDetailsItemRemote.b());
        if (d11 != null && d10 != null) {
            return new C11273a.C2166a(assemblyDetailsItemRemote.a(), d10.doubleValue(), d11.doubleValue());
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Assembly prices are null, ignore item: " + assemblyDetailsItemRemote);
        e eVar = e.WARN;
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
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            if (str2 == null) {
                String name = AssemblyServiceDetailsRemote.AssemblyDetailsItemRemote.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            bVar.a(eVar, str2, false, illegalArgumentException, str);
        }
        return null;
    }

    private final C11273a.b c(AssemblyServiceDetailsRemote.AssemblyConfigurationRemote assemblyConfigurationRemote) {
        C11273a.c a10 = C2186a.Companion.a(assemblyConfigurationRemote.b());
        if (a10 == null) {
            return null;
        }
        if (assemblyConfigurationRemote.a() != null) {
            return new C11273a.b(assemblyConfigurationRemote.a().doubleValue(), a10);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid base price details: " + assemblyConfigurationRemote);
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
                String a11 = C11818a.a((String) null, illegalArgumentException);
                if (a11 == null) {
                    return null;
                }
                str = C11820c.a(a11);
            }
            String str3 = str;
            if (str2 == null) {
                String name = AssemblyServiceDetailsRemote.AssemblyConfigurationRemote.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalArgumentException, str3);
            str = str3;
            str2 = str4;
        }
        return null;
    }

    private final Double d(AssemblyServiceDetailsRemote.PriceRemote priceRemote) {
        if (priceRemote.b() == null && priceRemote.a() == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid price: " + priceRemote);
            e eVar = e.WARN;
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = AssemblyServiceDetailsRemote.PriceRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
        Double b10 = priceRemote.b();
        return b10 == null ? priceRemote.a() : b10;
    }

    /* renamed from: e */
    public C11273a a(AssemblyServiceDetailsRemote assemblyServiceDetailsRemote) {
        C17542s.j(assemblyServiceDetailsRemote, "remote");
        ArrayList arrayList = new ArrayList();
        for (AssemblyServiceDetailsRemote.AssemblyDetailsItemRemote b10 : assemblyServiceDetailsRemote.c()) {
            C11273a.C2166a b11 = b(b10);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        AssemblyServiceDetailsRemote.AssemblyConfigurationRemote b12 = assemblyServiceDetailsRemote.b();
        return new C11273a(arrayList, b12 != null ? c(b12) : null);
    }
}
