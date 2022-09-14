package ApiRest.restapiMYSQL.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class user {

    @Id
    private Integer code;

    @Column (nullabel = false; length = 50)
    private String name;

    @Column (nullabel = false; length = 15)
    private String login;

    @Column (nullabel = false; length = 15)
    private String password;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
