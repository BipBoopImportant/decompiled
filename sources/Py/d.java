package py;

import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import pp.C11768b;
import sy.d;

@p(with = com.ingka.ikea.room.impl.data.remote.a.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u0004*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lpy/d;", "Lsy/d;", "T", "Lpp/b;", "Companion", "a", "Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote;", "Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote;", "Lcom/ingka/ikea/room/impl/data/remote/UniqueSellingPointsRemote;", "Lcom/ingka/ikea/room/impl/data/remote/UnsupportedSlotRemote;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d<T extends sy.d> extends C11768b<T> {
    public static final a Companion = a.f130357a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpy/d$a;", "", "<init>", "()V", "T", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lpy/d;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f130357a = new a();

        private a() {
        }

        public final <T> KSerializer<d<T>> serializer(KSerializer<T> kSerializer) {
            C17542s.j(kSerializer, "typeSerial0");
            return com.ingka.ikea.room.impl.data.remote.a.f119768c;
        }
    }
}
