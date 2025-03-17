package h7;

import XH.C16807N;
import YH.C16877v;
import com.appmattus.certificatetransparency.internal.loglist.model.v3.Log;
import com.appmattus.certificatetransparency.internal.loglist.model.v3.LogListV3;
import com.appmattus.certificatetransparency.internal.loglist.model.v3.Operator;
import com.appmattus.certificatetransparency.internal.loglist.model.v3.PreviousOperator;
import com.appmattus.certificatetransparency.internal.loglist.model.v3.State;
import fK.q;
import j7.C8407a;
import j7.i;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kK.C17514c;
import kK.C17516e;
import kK.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.C8703e;
import r7.C8705g;
import r7.C8707i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lh7/c;", "Lh7/a;", "<init>", "()V", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogListV3;", "logList", "Lr7/e;", "c", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/LogListV3;)Lr7/e;", "", "logListJson", "a", "(Ljava/lang/String;)Lr7/e;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C7937a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51657a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C17514c f51658b = v.b((C17514c) null, new C7938b(), 1, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh7/c$a;", "", "<init>", "()V", "LkK/c;", "json", "LkK/c;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final C8703e c(LogListV3 logListV3) {
        List list;
        Iterable<Operator> operators = logListV3.getOperators();
        ArrayList arrayList = new ArrayList(C16877v.y(operators, 10));
        for (Operator operator : operators) {
            ArrayList<Log> arrayList2 = new ArrayList<>();
            for (Object next : operator.getLogs()) {
                Log log = (Log) next;
                if (log.getState() != null && !(log.getState() instanceof State.Pending) && !(log.getState() instanceof State.Rejected)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
            for (Log log2 : arrayList2) {
                byte[] a10 = C8407a.f54060a.a(log2.getKey());
                Instant timestamp = ((log2.getState() instanceof State.Retired) || (log2.getState() instanceof State.ReadOnly)) ? log2.getState().getTimestamp() : null;
                try {
                    PublicKey d10 = i.f54066a.d(a10);
                    String name = operator.getName();
                    List<PreviousOperator> listOfPreviousOperators = log2.getListOfPreviousOperators();
                    if (listOfPreviousOperators != null) {
                        Iterable<PreviousOperator> iterable = listOfPreviousOperators;
                        list = new ArrayList(C16877v.y(iterable, 10));
                        for (PreviousOperator previousOperator : iterable) {
                            list.add(new C8707i(previousOperator.getName(), previousOperator.getEndDate()));
                        }
                    } else {
                        list = C16877v.n();
                    }
                    arrayList3.add(new C8705g(d10, timestamp, name, list));
                } catch (InvalidKeySpecException e10) {
                    return new C8703e.b.C0901e(e10, log2.getKey());
                } catch (NoSuchAlgorithmException e11) {
                    return new C8703e.b.C0901e(e11, log2.getKey());
                } catch (IllegalArgumentException e12) {
                    return new C8703e.b.C0901e(e12, log2.getKey());
                }
            }
            arrayList.add(arrayList3);
        }
        return new C8703e.c.C0902c(logListV3.getLogListTimestamp(), C16877v.A(arrayList));
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17516e eVar) {
        C17542s.j(eVar, "$this$Json");
        eVar.g(true);
        return C16807N.f139792a;
    }

    public C8703e a(String str) {
        C17542s.j(str, "logListJson");
        try {
            return c((LogListV3) f51658b.c(LogListV3.Companion.serializer(), str));
        } catch (q e10) {
            return new C8703e.b.a(e10);
        }
    }
}
