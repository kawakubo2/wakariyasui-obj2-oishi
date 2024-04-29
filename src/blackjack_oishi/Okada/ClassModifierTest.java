package blackjack_oishi.Okada;

public class ClassModifierTest {
    public static void main(String[] args) {
        ClassModifier mod = new ClassModifier();
        String line = "    <table class=\"def abc table table-striped xyz\" name=\"book-table\">";
        System.out.println(mod.modifyClass(line, new String[] {"table", "table-bordered"}));
    }
}
