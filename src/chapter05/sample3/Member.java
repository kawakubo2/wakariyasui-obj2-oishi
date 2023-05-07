package chapter05.sample3;

public record Member(IdNumber id, String name) {
    public Member(IdNumber id, String name) {
        this.id = new IdNumber(id.getNumber());
        this.name = name;
    }
    public IdNumber id() {
        return new IdNumber(id.getNumber());
    }
}
