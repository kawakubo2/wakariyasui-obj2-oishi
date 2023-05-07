package chapter04;

public final class Member {
    private final IdNumber id;
    private final String name;
    public Member(IdNumber id, String name) {
        this.id = new IdNumber(id.getId());
        this.name = name;
    }
    public IdNumber getId() {
        return new IdNumber(id.getId());
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + "]";
    }
}
