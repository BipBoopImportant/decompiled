package cD;

import XH.C16807N;
import XH.x;
import androidx.lifecycle.F;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import dI.C17164e;
import ip.C11410b;
import ip.k;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00020\u00042\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\n\u001a\u00020\t2\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0012\u001a\u00020\u00042\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0012\u0010\bJ)\u0010\u0013\u001a\u00020\u00042\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0013\u0010\bJ=\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00142\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00190\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00190\u0018H&¢\u0006\u0004\b\u001f\u0010\u001bJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001cH¦@¢\u0006\u0004\b \u0010\u001eJ!\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00190\u0018H&¢\u0006\u0004\b!\u0010\u001bJ!\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00190\u0018H&¢\u0006\u0004\b\"\u0010\u001bJ=\u0010#\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00142\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b#\u0010\u0017J1\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b$\u0010%JE\u0010&\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00142\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b&\u0010'J=\u0010(\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00142\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b(\u0010\u0017J1\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\t2\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b*\u0010%R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00062"}, d2 = {"LcD/a;", "LcD/c;", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "q", "(LnI/l;)V", "", "id", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "s", "(Ljava/lang/String;LnI/l;)Landroidx/lifecycle/F;", "k", "(LnI/l;)Landroidx/lifecycle/F;", "g", "c", "d", "", "data", "t", "(Ljava/util/Map;LnI/l;)V", "Lip/b;", "Lip/k;", "v", "()Lip/b;", "LXH/x;", "o", "(LdI/e;)Ljava/lang/Object;", "e", "j", "r", "h", "u", "w", "(Ljava/lang/String;LnI/l;)V", "f", "(Ljava/lang/String;Ljava/util/Map;LnI/l;)V", "m", "storeId", "a", "p", "()Landroidx/lifecycle/F;", "editProfileConfiguration", "n", "upgradeProfileConfiguration", "i", "consentConfiguration", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cD.a  reason: case insensitive filesystem */
public interface C14029a extends C14031c {
    void a(String str, C17642l<? super l, C16807N> lVar);

    void c(C17642l<? super l, C16807N> lVar);

    void d(C17642l<? super l, C16807N> lVar);

    C11410b<k<String, l>> e();

    void f(String str, Map<String, String> map, C17642l<? super l, C16807N> lVar);

    F<DynamicFields$Configuration> g(C17642l<? super l, C16807N> lVar);

    C11410b<k<String, l>> h();

    F<DynamicFields$Configuration> i();

    Object j(C17164e<? super x<String>> eVar);

    F<DynamicFields$Configuration> k(C17642l<? super l, C16807N> lVar);

    void m(Map<String, String> map, C17642l<? super l, C16807N> lVar);

    F<DynamicFields$Configuration> n();

    Object o(C17164e<? super x<String>> eVar);

    F<DynamicFields$Configuration> p();

    void q(C17642l<? super l, C16807N> lVar);

    C11410b<k<String, l>> r();

    F<DynamicFields$Configuration> s(String str, C17642l<? super l, C16807N> lVar);

    void t(Map<String, String> map, C17642l<? super l, C16807N> lVar);

    void u(Map<String, String> map, C17642l<? super l, C16807N> lVar);

    C11410b<k<String, l>> v();

    void w(String str, C17642l<? super l, C16807N> lVar);
}
