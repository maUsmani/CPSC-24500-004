package hw11;


import java.io.Serializable;

class Student implements Serializable{
    private String name;
    private int phone;
    private String birthday;
    private String address;

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", phone=" + phone + ", birthday=" + birthday + ", address=" + address + '}';
    }

    public Student(String name, int phone, String birthday, String address) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}