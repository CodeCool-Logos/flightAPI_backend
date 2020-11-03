package com.codecool.flight_api_project.user;

public class User {
    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    private Address address;
    private Company company;

    public User(Long id, String name, String username, String email, String phone, String website, Address address, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.address = address;
        this.company = company;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public Address getAddress() {
        return address;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", address=").append(address);
        sb.append(", company=").append(company);
        sb.append('}');
        return sb.toString();
    }
}
