package en.stqa.pft.sandbox.model;

public class ContactData {
  private final String name;
  private final String surname;
  private final String company;
  private final String address;
  private final String phone;
  private final String email;

  public ContactData(String name, String surname, String company, String address, String phone, String email) {
    this.name = name;
    this.surname = surname;
    this.company = company;
    this.address = address;
    this.phone = phone;
    this.email = email;
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
}
