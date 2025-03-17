package Ys;

import HJ.C15854t;
import YH.C16877v;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"LYs/i;", "LYs/h;", "<init>", "()V", "", "utmParameters", "LXH/N;", "b", "(Ljava/lang/String;)V", "LYs/j;", "c", "()LYs/j;", "a", "()Ljava/lang/String;", "", "Ljava/util/Map;", "utmMap", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f89748b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f89749a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"LYs/i$a;", "", "<init>", "()V", "", "UTM_ID", "Ljava/lang/String;", "UTM_SOURCE", "UTM_MEDIUM", "UTM_CAMPAIGN", "UTM_CONTENT", "LINK", "UNKNOWN", "PARAMETER_DELIMITER", "KEY_VALUE_DELIMITER", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public String a() {
        return Uri.decode(this.f89749a.get("link"));
    }

    public void b(String str) {
        C17542s.j(str, "utmParameters");
        for (String Y02 : C15854t.Y0(str, new String[]{"&"}, false, 0, 6, (Object) null)) {
            List Y03 = C15854t.Y0(Y02, new String[]{"="}, false, 0, 6, (Object) null);
            int i10 = 0;
            for (Object next : Y03) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                String str2 = (String) next;
                if (i10 % 2 == 0 && i11 < Y03.size()) {
                    String str3 = (String) Y03.get(i11);
                    if (!C15854t.v0(str3)) {
                        this.f89749a.put(str2, str3);
                    } else {
                        this.f89749a.put(str2, "Unknown");
                    }
                }
                i10 = i11;
            }
        }
    }

    public j c() {
        String str = this.f89749a.get("utm_id");
        String str2 = str == null ? "Unknown" : str;
        String str3 = this.f89749a.get("utm_source");
        String str4 = str3 == null ? "Unknown" : str3;
        String str5 = this.f89749a.get("utm_medium");
        String str6 = str5 == null ? "Unknown" : str5;
        String str7 = this.f89749a.get("utm_campaign");
        String str8 = str7 == null ? "Unknown" : str7;
        String str9 = this.f89749a.get("utm_content");
        return new j(str2, str4, str6, str8, str9 == null ? "Unknown" : str9);
    }
}
