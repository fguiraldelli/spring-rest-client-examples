package guru.springframework.api.domain;

import java.util.List;

public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public UserData setData(List<User> data) {
        this.data = data;
        return this;
    }
}
