package programmer.zaman.now.data;

class SocialMedia {
    String name;
}

class Twitter extends SocialMedia {
    // Leawrn Final mehthod
    final void login(String username, String password) {

    }
}


// Keyword final it't the last class
final class Facebook extends Twitter {
    // This will error
//    void login(String username, String password) {
//        System.out.println("Test");
//    }
}
