package mg;

import HJ.C15854t;
import aA.C13909a;
import am.C11070a;
import android.content.Context;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tw.g;
import tw.q;
import uq.C12076b;
import uq.C12077c;
import uq.C12078d;
import uq.C12079e;
import uq.f;
import uq.h;
import xq.C12332a;
import xq.C12333b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmg/y;", "", "a", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mg.y  reason: case insensitive filesystem */
public abstract class C10067y {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75413a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010#\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lmg/y$a;", "", "<init>", "()V", "Luq/c;", "episod", "Luq/d;", "d", "(Luq/c;)Luq/d;", "LTe/b;", "dataConsent", "LGo/a;", "clientIdentityProvider", "LaA/a;", "sessionManager", "Ltw/g;", "networkParameters", "Luq/f;", "f", "(LTe/b;LGo/a;LaA/a;Ltw/g;)Luq/f;", "Ltw/q;", "userAgentFactory", "Luq/e;", "e", "(LGo/a;Ltw/q;)Luq/e;", "Landroid/content/Context;", "context", "Lxq/b;", "b", "(Landroid/content/Context;)Lxq/b;", "episodConfig", "episodContact", "databaseDriverFactory", "Lam/a;", "appApi", "c", "(Luq/e;Luq/f;Lxq/b;Lam/a;)Luq/c;", "Luq/b;", "a", "(Luq/c;)Luq/b;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mg.y$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"mg/y$a$a", "Luq/h;", "", "message", "LXH/N;", "a", "(Ljava/lang/String;)V", "", "throwable", "b", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "c", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mg.y$a$a  reason: collision with other inner class name */
        public static final class C1383a implements h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C11070a f75414a;

            C1383a(C11070a aVar) {
                this.f75414a = aVar;
            }

            public void a(String str) {
                String str2;
                C17542s.j(str, "message");
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a(str, (Throwable) null);
                        if (a10 != null) {
                            str3 = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Episod debug";
                    } else {
                        str2 = str4;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str5);
                    str3 = str5;
                    str4 = str2;
                }
            }

            public void b(String str, Throwable th2) {
                boolean z10;
                C17542s.j(str, "message");
                if (th2 != null) {
                    String str2 = null;
                    if (!this.f75414a.b()) {
                        e eVar = e.WARN;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        Iterator it = d.f102012a.a().iterator();
                        while (true) {
                            z10 = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((C11819b) next).b(eVar, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str3 = null;
                        for (C11819b bVar : arrayList) {
                            if (str2 == null) {
                                String a10 = C11818a.a(str, th2);
                                if (a10 != null) {
                                    str2 = C11820c.a(a10);
                                } else {
                                    return;
                                }
                            }
                            if (str3 == null) {
                                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Episod error";
                            }
                            String str4 = str3;
                            bVar.a(eVar, str4, z10, th2, str2);
                            str3 = str4;
                            z10 = z10;
                        }
                        return;
                    }
                    e eVar2 = e.DEBUG;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    for (Object next2 : d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str5 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str2 == null) {
                            String a11 = C11818a.a(str, th2);
                            if (a11 != null) {
                                str2 = C11820c.a(a11);
                            } else {
                                return;
                            }
                        }
                        if (str5 == null) {
                            str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Episod error";
                        }
                        bVar2.a(eVar2, str5, false, th2, str2);
                    }
                }
            }

            public void c(String str) {
                String str2;
                C17542s.j(str, "message");
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a(str, (Throwable) null);
                        if (a10 != null) {
                            str3 = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Episod network";
                    } else {
                        str2 = str4;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str5);
                    str3 = str5;
                    str4 = str2;
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"mg/y$a$b", "Luq/f;", "Luq/f$a;", "e", "()Luq/f$a;", "dataConsent", "", "c", "()Ljava/lang/String;", "marketCode", "a", "languageCode", "d", "partyUid", "b", "sessionId", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mg.y$a$b */
        public static final class b implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Te.b f75415a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f75416b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C13909a f75417c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Go.a f75418d;

            b(Te.b bVar, g gVar, C13909a aVar, Go.a aVar2) {
                this.f75415a = bVar;
                this.f75416b = gVar;
                this.f75417c = aVar;
                this.f75418d = aVar2;
            }

            public String a() {
                return this.f75416b.a();
            }

            public String b() {
                return this.f75418d.b();
            }

            public String c() {
                return this.f75416b.i();
            }

            public String d() {
                return this.f75417c.a();
            }

            public f.a e() {
                return this.f75415a.a();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C12076b a(C12077c cVar) {
            C17542s.j(cVar, "episod");
            return cVar.b();
        }

        public final C12333b b(Context context) {
            C17542s.j(context, "context");
            return new C12332a(context);
        }

        public final C12077c c(C12079e eVar, f fVar, C12333b bVar, C11070a aVar) {
            C17542s.j(eVar, "episodConfig");
            C17542s.j(fVar, "episodContact");
            C17542s.j(bVar, "databaseDriverFactory");
            C17542s.j(aVar, "appApi");
            return new C12077c(eVar, fVar, new C1383a(aVar), bVar);
        }

        public final C12078d d(C12077c cVar) {
            C17542s.j(cVar, "episod");
            return cVar.a();
        }

        public final C12079e e(Go.a aVar, q qVar) {
            C17542s.j(aVar, "clientIdentityProvider");
            C17542s.j(qVar, "userAgentFactory");
            return new C12079e(false, aVar.c(), "52996a58-4041-4ae7-9a85-7a132b7c5d94", qVar.a(), 6, 3);
        }

        public final f f(Te.b bVar, Go.a aVar, C13909a aVar2, g gVar) {
            C17542s.j(bVar, "dataConsent");
            C17542s.j(aVar, "clientIdentityProvider");
            C17542s.j(aVar2, "sessionManager");
            C17542s.j(gVar, "networkParameters");
            return new b(bVar, gVar, aVar2, aVar);
        }

        private a() {
        }
    }
}
