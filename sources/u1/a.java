package U1;

import V1.s;
import V1.t;
import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"LU1/a;", "LU1/f;", "<init>", "()V", "", "languageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "b", "(Ljava/lang/String;)Ljava/util/Locale;", "Landroid/os/LocaleList;", "a", "Landroid/os/LocaleList;", "lastPlatformLocaleList", "LU1/e;", "LU1/e;", "lastLocaleList", "LV1/t;", "c", "LV1/t;", "lock", "()LU1/e;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private LocaleList f14208a;

    /* renamed from: b  reason: collision with root package name */
    private e f14209b;

    /* renamed from: c  reason: collision with root package name */
    private final t f14210c = s.a();

    public e a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f14210c) {
            e eVar = this.f14209b;
            if (eVar != null && localeList == this.f14208a) {
                return eVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(localeList.get(i10)));
            }
            e eVar2 = new e(arrayList);
            this.f14208a = localeList;
            this.f14209b = eVar2;
            return eVar2;
        }
    }

    public Locale b(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (C17542s.e(forLanguageTag.toLanguageTag(), "und")) {
            String a10 = b.f14211a;
            Log.e(a10, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }
}
