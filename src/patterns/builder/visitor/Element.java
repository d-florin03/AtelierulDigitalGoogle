package patterns.builder.visitor;

public interface Element {
    void accept (Visitor v);
}
