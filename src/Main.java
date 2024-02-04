public class Main {
    public static void main(String[] args) {
        BloomFilter blockedUsers = new BloomFilter();

        blockedUsers.add("yossi");
        blockedUsers.add("keren");
        blockedUsers.add("mor");

        // should be blocked (return true)
        System.out.println(blockedUsers.isBlocked("yossi"));
        System.out.println(blockedUsers.isBlocked("keren"));
        System.out.println(blockedUsers.isBlocked("mor"));

        // should be allowed (return false)
        System.out.println(blockedUsers.isBlocked("dan"));
        System.out.println(blockedUsers.isBlocked("avi"));
        System.out.println(blockedUsers.isBlocked("loren"));
    }
}