package model;

import exceptions.InvalidUserException;
import exceptions.UserExistsException;

import java.io.Serializable;
import java.util.*;

class Users implements Serializable {
    private static final long serialVersionUID = 7586838070562585444L;
    private final Map<String, User> userBase;

    Users() {
        this.userBase = new HashMap<>();
    }

    void addUser(User u) throws UserExistsException {
        if(this.userBase.putIfAbsent(u.getEmail(), u.clone()) != null)
            throw new UserExistsException();
    }

    List<String> getClientIDS() {
        return new ArrayList<>(this
                .userBase
                .keySet());
    }

    User getUser(String id) throws InvalidUserException {
        User a = userBase.get(id);
        if(a == null)
            throw new InvalidUserException();
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Users users = (Users) o;
        return this.userBase.equals(users.userBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userBase);
    }
}
