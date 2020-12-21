/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class TNode {
    int id;
    Object name;
    Object surname;
    Object email;
    TNode LEFT = null;
    TNode RIGHT = null;
    
    
    public TNode(int ID, Object FirstName, Object LastName, Object Email) {
        this.id = ID;
        this.name = FirstName;
        this.surname = LastName;
        this.email = Email;
    }

    public int getID() {
        return id;
    }

    public Object getName() {
        return name;
    }

    public Object getSurname() {
        return surname;
    }

    public Object getEmail() {
        return email;
    }

    public TNode getLEFT() {
        return LEFT;
    }

    public TNode getRIGHT() {
        return RIGHT;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public void setFirstName(Object FirstName) {
        this.name = FirstName;
    }

    public void setLastName(Object LastName) {
        this.surname = LastName;
    }

    public void setScore(Object Email) {
        this.email = Email;
    }

    public void setLEFT(TNode LEFT) {
        this.LEFT = LEFT;
    }

    public void setRIGHT(TNode RIGHT) {
        this.RIGHT = RIGHT;
    }
    
    public TNode() {
    }
}
