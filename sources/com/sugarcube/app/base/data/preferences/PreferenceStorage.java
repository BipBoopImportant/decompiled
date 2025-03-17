package com.sugarcube.app.base.data.preferences;

import TJ.C16532g;
import W2.f;
import XH.C16807N;
import XH.C16814e;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H¦@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\nH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "", "T", "LW2/f$a;", "preferenceKey", "defaultValue", "LTJ/g;", "getPreference", "(LW2/f$a;Ljava/lang/Object;)LTJ/g;", "value", "LXH/N;", "setPreference", "(LW2/f$a;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "clearPreference", "(LW2/f$a;LdI/e;)Ljava/lang/Object;", "", "incrementPreference", "clearPreferences", "(LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public interface PreferenceStorage {
    <T> Object clearPreference(f.a<T> aVar, C17164e<? super C16807N> eVar);

    Object clearPreferences(C17164e<? super C16807N> eVar);

    <T> C16532g<T> getPreference(f.a<T> aVar, T t10);

    Object incrementPreference(f.a<Integer> aVar, C17164e<? super C16807N> eVar);

    <T> Object setPreference(f.a<T> aVar, T t10, C17164e<? super C16807N> eVar);
}
