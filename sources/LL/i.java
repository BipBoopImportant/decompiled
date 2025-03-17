package Ll;

import HJ.C15854t;
import Yz.b;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.sugarcube.core.logger.DslKt;
import gK.C17294a;
import java.util.ArrayList;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLl/i;", "", "<init>", "()V", "", "json", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "b", "(Ljava/lang/String;)Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "holder", "a", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;)Ljava/lang/String;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {
    public final String a(PostalCodePickerConfig postalCodePickerConfig) {
        C17542s.j(postalCodePickerConfig, "holder");
        C17514c b10 = b.f118278a.b();
        b10.a();
        return b10.b(PostalCodePickerConfig.Companion.serializer(), postalCodePickerConfig);
    }

    public final PostalCodePickerConfig b(String str) {
        Object obj;
        if (str == null || C15854t.v0(str)) {
            return PostalCodePickerConfig.Companion.a();
        }
        try {
            C17514c b10 = b.f118278a.b();
            b10.a();
            obj = b10.c(C17294a.u(PostalCodePickerConfig.Companion.serializer()), str);
        } catch (Exception e10) {
            e eVar = e.WARN;
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
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Error deserializing json";
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            obj = null;
        }
        PostalCodePickerConfig postalCodePickerConfig = (PostalCodePickerConfig) obj;
        return postalCodePickerConfig == null ? PostalCodePickerConfig.Companion.a() : postalCodePickerConfig;
    }
}
