package Pl;

import HJ.C15854t;
import XH.x;
import XH.y;
import com.ingka.ikea.appconfig.impl.service.network.RemoteMediaRemote;
import com.ingka.ikea.appconfig.model.RemoteMedia;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "Lcom/ingka/ikea/appconfig/impl/service/network/RemoteMediaRemote;", "", "Lcom/ingka/ikea/appconfig/model/RemoteMedia;", "b", "(Ljava/util/Map;)Ljava/util/List;", "appconfig-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    /* access modifiers changed from: private */
    public static final List<RemoteMedia> b(Map<String, RemoteMediaRemote> map) {
        Object obj;
        T t10;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            RemoteMedia remoteMedia = null;
            try {
                x.a aVar = x.f139812b;
                Object value = entry.getValue();
                if (value != null) {
                    RemoteMediaRemote remoteMediaRemote = (RemoteMediaRemote) value;
                    String str = (String) entry.getKey();
                    String c10 = remoteMediaRemote.c();
                    if (c10 != null) {
                        String a10 = remoteMediaRemote.a();
                        if (a10 != null) {
                            Iterator<T> it = RemoteMedia.b.b().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t10 = null;
                                    break;
                                }
                                t10 = it.next();
                                if (C17542s.e(((RemoteMedia.b) t10).j(), remoteMediaRemote.b())) {
                                    break;
                                }
                            }
                            if (t10 != null) {
                                obj = x.b(new RemoteMedia(str, c10, a10, (RemoteMedia.b) t10));
                                Throwable e10 = x.e(obj);
                                if (e10 != null) {
                                    e eVar = e.ERROR;
                                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                                    for (Object next : d.f102012a.a()) {
                                        if (((C11819b) next).b(eVar, false)) {
                                            arrayList2.add(next);
                                        }
                                    }
                                    String str2 = null;
                                    String str3 = null;
                                    for (C11819b bVar : arrayList2) {
                                        if (str2 == null) {
                                            String a11 = C11818a.a((String) null, e10);
                                            if (a11 == null) {
                                                break;
                                            }
                                            str2 = C11820c.a(a11);
                                        }
                                        String str4 = str2;
                                        if (str3 == null) {
                                            String name = map.getClass().getName();
                                            C17542s.g(name);
                                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                            if (o12.length() != 0) {
                                                name = C15854t.P0(o12, "Kt");
                                            }
                                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                                        }
                                        String str5 = str3;
                                        bVar.a(eVar, str5, false, e10, str4);
                                        str2 = str4;
                                        str3 = str5;
                                    }
                                }
                                if (!x.g(obj)) {
                                    remoteMedia = obj;
                                }
                                RemoteMedia remoteMedia2 = remoteMedia;
                                if (remoteMedia2 != null) {
                                    arrayList.add(remoteMedia2);
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th2));
            }
        }
        return arrayList;
    }
}
