package Px;

import HJ.C15854t;
import Lx.c;
import XH.t;
import XH.x;
import XH.y;
import com.ingka.ikea.pushnotification.analytics.implementation.data.mapper.MetaDataWrapper;
import com.ingka.ikea.pushnotification.analytics.implementation.data.model.BounceInfo;
import com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import fK.q;
import java.util.ArrayList;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LPx/b;", "LPx/a;", "LkK/c;", "json", "LPx/e;", "aUUIDGenerator", "<init>", "(LkK/c;LPx/e;)V", "LLx/c;", "event", "", "versionName", "platform", "LXH/x;", "Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;", "a", "(LLx/c;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LkK/c;", "b", "LPx/e;", "c", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f114042c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f114043a;

    /* renamed from: b  reason: collision with root package name */
    private final e f114044b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPx/b$a;", "", "<init>", "()V", "", "CONTENT_ID", "Ljava/lang/String;", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(C17514c cVar, e eVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(eVar, "aUUIDGenerator");
        this.f114043a = cVar;
        this.f114044b = eVar;
    }

    public Object a(c cVar, String str, String str2, C17164e<? super x<PushAnalyticPostData>> eVar) {
        String b10;
        c cVar2 = cVar;
        Class<b> cls = b.class;
        BounceInfo bounceInfo = null;
        try {
            if (!cVar.a().containsKey("content")) {
                x.a aVar = x.f139812b;
                return x.b(y.a(new IllegalArgumentException("Missing content id in push notification metadata.")));
            }
            C17514c cVar3 = this.f114043a;
            String str3 = cVar.a().get("content");
            C17542s.h(str3, "null cannot be cast to non-null type kotlin.String");
            cVar3.a();
            MetaDataWrapper metaDataWrapper = (MetaDataWrapper) cVar3.c(MetaDataWrapper.Companion.serializer(), str3);
            if (cVar2 instanceof c.a) {
                c.a aVar2 = (c.a) cVar2;
                bounceInfo = new BounceInfo(aVar2.c().b(), aVar2.b());
                b10 = d.BOUNCE.b();
            } else if (cVar2 instanceof c.b) {
                b10 = d.CLICK.b();
            } else if (cVar2 instanceof c.C2739c) {
                b10 = d.DELIVERY.b();
            } else if (cVar2 instanceof c.d) {
                b10 = d.OPEN.b();
            } else {
                throw new t();
            }
            PushAnalyticPostData pushAnalyticPostData = new PushAnalyticPostData(metaDataWrapper.a().d(), this.f114044b.a(), metaDataWrapper.a().f(), metaDataWrapper.a().h(), metaDataWrapper.a().c(), metaDataWrapper.a().e(), metaDataWrapper.a().g(), b10, bounceInfo, str2, str, metaDataWrapper.a().b());
            if (c.b(pushAnalyticPostData)) {
                return x.b(pushAnalyticPostData);
            }
            x.a aVar3 = x.f139812b;
            return x.b(y.a(new IllegalArgumentException("Push notification analytics event data is invalid. " + pushAnalyticPostData)));
        } catch (q e10) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a("Failed to serialize push notification metadata.", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar2, str5, false, (Throwable) null, str4);
            }
            x.a aVar4 = x.f139812b;
            return x.b(y.a(e10));
        } catch (IllegalArgumentException e11) {
            e eVar3 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar3, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a("Failed to decode data into push notification metadata.", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                String str8 = str7;
                bVar2.a(eVar3, str8, false, (Throwable) null, str6);
                str7 = str8;
            }
            x.a aVar5 = x.f139812b;
            return x.b(y.a(e11));
        }
    }
}
