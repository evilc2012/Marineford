package one.piece.marineford.domain;

import one.piece.marineford.annotation.dao.springjdbc.Column;
import one.piece.marineford.annotation.dao.springjdbc.Id;
import one.piece.marineford.annotation.dao.springjdbc.Table;

/**
 * Created by Administrator on 2016/5/4.
 */

@Table(name = "sys_user")
public class User extends BaseBueinessDomain {

    private int id;
    private String account;
    private String password;
    private String nickname;
    private String realname;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "realname")
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
