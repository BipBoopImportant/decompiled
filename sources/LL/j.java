package Ll;

import com.ingka.ikea.appconfig.model.RemoteMedia;
import gK.C17294a;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LLl/j;", "", "<init>", "()V", "", "serialized", "", "Lcom/ingka/ikea/appconfig/model/RemoteMedia;", "b", "(Ljava/lang/String;)Ljava/util/List;", "list", "a", "(Ljava/util/List;)Ljava/lang/String;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {
    public final String a(List<RemoteMedia> list) {
        C17542s.j(list, "list");
        return C17514c.f144280d.b(C17294a.h(RemoteMedia.Companion.serializer()), list);
    }

    public final List<RemoteMedia> b(String str) {
        C17542s.j(str, "serialized");
        return (List) C17514c.f144280d.c(C17294a.h(RemoteMedia.Companion.serializer()), str);
    }
}
