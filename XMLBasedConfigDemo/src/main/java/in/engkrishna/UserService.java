package in.engkrishna;

import java.util.List;

public class UserService {
    public UserService() {
        System.out.println("User Service is Created!!");
    }
    public void init(){
        System.out.println("Post Construct Phase");
    }

    public void cleanUp(){
        System.out.println("Pre Destroyed Phase");
    }
}


//private List<String> usernames;
//    public UserService(List<String> usernames ) {
//         this.usernames = usernames;
//       // System.out.println("User Service is Created!!!");
//    }
//
//    public List<String> getUsernames() {
//        return usernames;
//    }