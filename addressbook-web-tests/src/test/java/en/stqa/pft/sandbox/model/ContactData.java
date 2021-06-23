package en.stqa.pft.sandbox.model;

import java.util.Objects;

public class ContactData {
  private int id;
  private final String name;
  private final String surname;
  private final String company;
  private final String address;
  private final String phone;
  private final String email;
  private final String group;

  public ContactData(String name, String surname, String company, String address, String phone, String email, String group) {
    this.id = 0;
    this.name = name;
    this.surname = surname;
    this.company = company;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.group = group;
  }

  public ContactData(int id,String name, String surname, String company, String address, String phone, String email, String group) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.company = company;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.group = group;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }


  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

}