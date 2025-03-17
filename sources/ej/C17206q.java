package eJ;

/* renamed from: eJ.q  reason: case insensitive filesystem */
public interface C17206q extends C17207r {

    /* renamed from: eJ.q$a */
    public interface a extends Cloneable, C17207r {
        C17206q g();

        a o1(C17194e eVar, C17196g gVar);
    }

    void a(C17195f fVar);

    C17208s<? extends C17206q> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
