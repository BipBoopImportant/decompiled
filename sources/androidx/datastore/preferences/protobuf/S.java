package androidx.datastore.preferences.protobuf;

public interface S extends T {

    public interface a extends T, Cloneable {
        a U(S s10);

        a a1(C5155h hVar, C5162o oVar);

        S g();

        S q();
    }

    void a(C5157j jVar);

    a0<? extends S> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    C5154g toByteString();
}
