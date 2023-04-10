public class TestBottom {
    public static void main(String[] args) {
        LinkedStack crates = new LinkedStack();
        crates.push("CARROTS");
        crates.push("ORANGES");
        crates.push("RAISINS");
        crates.push("PICKLES");
        crates.push("BANANAS");
        System.out.println("crates: " +crates);
        System.out.println("crates.bottom(): " +crates.bottom());
        System.out.println("crates: " +crates);

    }
}